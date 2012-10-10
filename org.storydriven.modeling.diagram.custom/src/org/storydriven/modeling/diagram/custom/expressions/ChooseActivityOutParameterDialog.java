package org.storydriven.modeling.diagram.custom.expressions;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.storydriven.modeling.activities.Activity;
import org.storydriven.modeling.activities.StopNode;
import org.storydriven.modeling.diagram.edit.parts.StopNodeEditPart;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.expressions.TextualExpression;
import org.storydriven.modeling.expressions.impl.ExpressionsFactoryImpl;


public class ChooseActivityOutParameterDialog extends Dialog {
	
	protected static final String DIALOG_TITLE = "Edit Expression";
	protected static final int DIALOG_WIDTH = 500;
	protected static final int DIALOG_HEIGHT = 400;
	protected static final int DIALOG_PADDING = 10;
	
	protected EList<EParameter> parameterList;
	protected Map<Button, Integer> buttonDictionary;
	private StopNode stopNode;
	private Activity activity;
	private TransactionalEditingDomain changeCommandReceiver;
	private StopNodeEditPart editPart;
	
	public ChooseActivityOutParameterDialog(Shell parent) {
		super(parent);
	}

	@Override
	public void create() {
		super.create();
	}
	
	@Override
	public boolean close() {
		return super.close();
	}
	
	@Override
	protected void okPressed() {
		setReturnCode(OK);
		this.close();
	}

	/**
	   * @see org.eclipse.jface.dialogs.Dialog#
	   *      createDialogArea(org.eclipse.swt.widgets.Composite) 
	   */
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		composite.setLayout(new RowLayout(SWT.VERTICAL));
		composite.setSize(DIALOG_WIDTH, DIALOG_HEIGHT);
		
		String s;
		Button b;
		buttonDictionary = new HashMap<Button, Integer>();
		for(int i = 0; i < this.parameterList.size() ;i++) {
			s = this.parameterList.get(i).getEType().getName();
			s = s + " " + this.parameterList.get(i).getName();
			
			b = new Button(composite, SWT.PUSH);
			b.setText(s);
			b.addSelectionListener(new SelectionListener() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					editOutExpression(e);
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
				
			});
			buttonDictionary.put(b, i);
		}
		
		return composite;
	}

	protected void editOutExpression(SelectionEvent e) {
			EditExpressionDialog expressionDialog;
			int parameterIndex = buttonDictionary.get(e.getSource());
			EParameter aParameter = parameterList.get(parameterIndex);
			
			expressionDialog = new EditExpressionDialog(null);
			expressionDialog.setExpectedReturnType(aParameter.getEType());
			expressionDialog.setExpression(this.getExpression(parameterIndex));
			expressionDialog.setContextInformation(null);
			expressionDialog.setChangeAttributeCommand(null, changeCommandReceiver);
			if(expressionDialog.open() == Window.OK) {
				AddCommand ac = new AddCommand(this.editPart.getEditingDomain(), 
						this.stopNode, 
						this.stopNode.eClass().getEStructuralFeature("returnValues"),
						expressionDialog.getExpression(),
						parameterIndex);
				
				if(ac.canExecute()) {
					this.changeCommandReceiver.getCommandStack().execute(ac);
				}				
			}
			
			
	}


	public void setParameterList(EList<EParameter> outParameters) {
		this.parameterList = outParameters;
	}

	public void setChangeCommandReceiver(
			TransactionalEditingDomain changeCommandReceiver) {
		this.changeCommandReceiver = changeCommandReceiver;
	}

	public void setNode(StopNode model) {
		this.stopNode = model;
	}
	
	public void setEditPart(StopNodeEditPart editPart2) {
		this.editPart = editPart2;
	}
	
	protected TextualExpression getExpression(int index) {
		EList<Expression> el = this.stopNode.getReturnValues();
	
		
		TextualExpression e = null;
		if(el.size() <= index) {
			e = ExpressionsFactoryImpl.eINSTANCE.createTextualExpression();
			this.changeCommandReceiver.
						getCommandStack().execute(new AddCommand(this.editPart.getEditingDomain(), 
																this.stopNode, 
																this.stopNode.eClass().getEStructuralFeature("ReturnValues"),
																e,
																index));
		} else {
			e = (TextualExpression) el.get(index);
		}
		return e;
	}

}
