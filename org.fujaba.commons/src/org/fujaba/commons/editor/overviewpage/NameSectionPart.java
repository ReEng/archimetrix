package org.fujaba.commons.editor.overviewpage;


import java.beans.PropertyChangeEvent;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.fujaba.commons.edit.commands.SetNameCommand;
import org.fujaba.commons.editor.AbstractMultiPageEditor;



/**
 * @author Last editor: $Author: mvdetten $
 * @version $Revision: 1887 $ $Date: 2009-11-13 14:16:49 +0100 (Fr, 13 Nov 2009) $
 */
public class NameSectionPart extends SectionPart implements
      Adapter
{
   private AbstractMultiPageEditor editor;
   private ENamedElement namedElement;

   private Text nameField;


   public NameSectionPart(AbstractMultiPageEditor editor, Composite parent,
         FormToolkit toolkit)
   {
      super(toolkit.createSection(parent, ExpandableComposite.TITLE_BAR
            | ExpandableComposite.TWISTIE | ExpandableComposite.EXPANDED));

      this.editor = editor;

      getSection().setText("Name");
      Composite nameComposite = toolkit.createComposite(getSection());
      nameComposite.setLayout(new GridLayout(2, false));

      this.nameField = toolkit.createText(nameComposite, "");
      GridData data = new GridData(GridData.FILL_HORIZONTAL);
      this.nameField.setLayoutData(data);
      getSection().setClient(nameComposite);

      this.nameField.addKeyListener(new KeyAdapter()
      {
         /**
          * @see org.eclipse.swt.events.KeyAdapter#keyReleased(org.eclipse.swt.events.KeyEvent)
          */
         @Override
         public void keyReleased(KeyEvent e)
         {
            keyReleaseOccured(e);
         }
      });
      this.nameField.addModifyListener(new ModifyListener()
      {
         /**
          * @see org.eclipse.swt.events.ModifyListener#modifyText(org.eclipse.swt.events.ModifyEvent)
          */
         public void modifyText(ModifyEvent e)
         {
            editOccured();
         }
      });
      this.nameField.addFocusListener(new FocusAdapter()
      {
         /**
          * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
          */
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


   void editOccured()
   {
      markDirty();
   }


   void keyReleaseOccured(KeyEvent e)
   {
      if (e.character == '\u001b')
      { // Escape character
         refresh();
      }
   }


   /**
    * @see org.eclipse.ui.forms.AbstractFormPart#commit(boolean)
    */
   @Override
   public void commit(boolean onSave)
   {
      SetNameCommand cmd = new SetNameCommand(namedElement, this.nameField.getText());
      this.editor.getCommandStack().execute(cmd);
      super.commit(onSave);
   }


   /**
    * @see org.eclipse.ui.forms.AbstractFormPart#refresh()
    */
   @Override
   public void refresh()
   {
      if (this.namedElement != null)
      {
         this.nameField.setText(this.namedElement.getName());
      }

      super.refresh();
   }


   /**
    * @see org.eclipse.ui.forms.AbstractFormPart#setFormInput(java.lang.Object)
    */
   @Override
   public boolean setFormInput(Object input)
   {
      if (this.namedElement != null && this.namedElement != input)
      {
         this.namedElement.eAdapters().remove(this);
      }

      if (input instanceof ENamedElement)
      {
         this.namedElement = (ENamedElement) input;
         this.namedElement.eAdapters().add(this);
         this.safeRefresh();
         return true;
      }
      return false;
   }


   /**
    * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
    */
   public void propertyChange(PropertyChangeEvent arg0)
   {
      this.safeRefresh();
   }


   protected void safeRefresh()
   {
      if (Display.getDefault() != null)
      {
         Display.getDefault().asyncExec(new Runnable()
         {
            public void run()
            {
               NameSectionPart.this.refresh();
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
