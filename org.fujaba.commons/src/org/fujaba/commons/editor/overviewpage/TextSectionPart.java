package org.fujaba.commons.editor.overviewpage;


import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.fujaba.commons.editor.AbstractMultiPageEditor;



/**
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 */
public class TextSectionPart extends SectionPart implements Adapter
{

   private AbstractMultiPageEditor editor;

   private EObject element;

   private EStructuralFeature feature;

   private Text text;


   public TextSectionPart(AbstractMultiPageEditor editor, Composite parent,
         FormToolkit toolkit, String label, EStructuralFeature feature)
   {
      super(toolkit.createSection(parent, ExpandableComposite.TITLE_BAR
            | ExpandableComposite.TWISTIE | ExpandableComposite.EXPANDED));

      // store editor
      this.editor = editor;

      // store feature
      this.feature = feature;

      // set section title
      getSection().setText(label);

      // create composite
      Composite nameComposite = toolkit.createComposite(getSection());
      nameComposite.setLayout(new GridLayout(2, false));

      // create name field
      text = toolkit.createText(nameComposite, "");
      GridDataFactory.fillDefaults().grab(true, false).applyTo(text);

      // set client
      getSection().setClient(nameComposite);

      // hook the listeners
      text.addKeyListener(new KeyAdapter()
      {
         @Override
         public void keyReleased(KeyEvent e)
         {
            if (e.character == '\u001b')
            {
               // Escape character
               refresh();
            }
         }
      });

      text.addModifyListener(new ModifyListener()
      {
         public void modifyText(ModifyEvent e)
         {
            markDirty();
         }
      });

      text.addFocusListener(new FocusAdapter()
      {
         @Override
         public void focusLost(FocusEvent e)
         {
            if (isDirty())
            {
               commit(false);
            }
         }
      });
   }


   @Override
   public void commit(boolean onSave)
   {
      // get elements
      EditingDomain ed = editor.getEditingDomain();
      CommandStack cs = ed.getCommandStack();

      // execute command
      cs.execute(SetCommand.create(ed, element, feature, text.getText()));
      super.commit(onSave);
   }


   @Override
   public void refresh()
   {
      if (element != null)
      {
         Object textFeature = element.eGet(feature);

         // check type
         if (textFeature != null && textFeature instanceof String)
         {
            text.setText((String) textFeature);
         }
         else
         {
            text.setText("");
         }
      }

      super.refresh();
   }


   @Override
   public boolean setFormInput(Object input)
   {
      if (element != null && element != input)
      {
         element.eAdapters().remove(this);
      }

      // check type
      if (input instanceof EObject)
      {
         element = (EObject) input;
         element.eAdapters().add(this);

         safeRefresh();
         return true;
      }

      return false;
   }


   private void safeRefresh()
   {
      if (Display.getDefault() != null)
      {
         Display.getDefault().asyncExec(new Runnable()
         {
            public void run()
            {
               TextSectionPart.this.refresh();
            }
         });
      }
   }


   public Notifier getTarget()
   {
      return null;
   }


   public boolean isAdapterForType(Object type)
   {
      return false;
   }


   public void notifyChanged(Notification notification)
   {
      this.safeRefresh();
   }


   public void setTarget(Notifier newTarget)
   {
   }
}
