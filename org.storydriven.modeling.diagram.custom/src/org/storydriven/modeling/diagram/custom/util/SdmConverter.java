package org.storydriven.modeling.diagram.custom.util;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;

public class SdmConverter {
	protected DiagramEditPart 	diagramEditPart;
	protected EditPart 			targetParentEditPart;

	public SdmConverter(DiagramEditPart diagramEP, EditPart targetParentEP) {
			super();
			this.diagramEditPart = diagramEP;
			this.targetParentEditPart = targetParentEP;
		}
	
	protected Object copyValues(final EObject source, final EObject target) {
		return copyValues(source, target, new HashSet<String>());
	}
	
	protected Object copyValues(final EObject source, final EObject target, final Set<String> excludedFeaturesNames) {
		
		EObject tempSource = source;
		EObject tempTarget = target;
		
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(diagramEditPart.getEditingDomain(),
				"Copy Values from old pattern to new pattern.", null) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
					IAdaptable info) throws ExecutionException {
				for( EStructuralFeature aFeature : ( source.eClass().getEAllStructuralFeatures()) ) {
					if(!excludedFeaturesNames.contains(aFeature.getName())) {
						target.eSet(aFeature, (source.eGet(aFeature)));	
					}
				}
				
				return CommandResult.newOKCommandResult();
			}
			
		};
		
		executeCommand(command);
		
		return target;
	}
	
	protected void executeCommand(AbstractTransactionalCommand cmd) {
			try
			{
				OperationHistoryFactory.getOperationHistory().execute(cmd, new NullProgressMonitor(), null);
			}
			catch (ExecutionException ee) {
				ee.printStackTrace();
			}
	}
}
