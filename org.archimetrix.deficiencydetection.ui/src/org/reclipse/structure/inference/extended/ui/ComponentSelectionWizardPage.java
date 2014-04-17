package org.reclipse.structure.inference.extended.ui;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.dialogs.ContainerCheckedTreeViewer;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;
import org.somox.sourcecodedecorator.SourceCodeDecoratorPackage;
import org.somox.sourcecodedecorator.SourceCodeDecoratorRepository;

import de.uka.ipd.sdq.probfunction.provider.ProbfunctionItemProviderAdapterFactory;
import de.uka.ipd.sdq.stoex.provider.StoexItemProviderAdapterFactory;
import de.uka.ipd.sdq.units.provider.UnitsItemProviderAdapterFactory;
import eu.qimpress.identifier.provider.IdentifierItemProviderAdapterFactory;
import eu.qimpress.samm.annotation.provider.AnnotationItemProviderAdapterFactory;
import eu.qimpress.samm.behaviour.provider.BehaviourItemProviderAdapterFactory;
import eu.qimpress.samm.core.provider.CoreItemProviderAdapterFactory;
import eu.qimpress.samm.datatypes.provider.DatatypesItemProviderAdapterFactory;
import eu.qimpress.samm.deployment.allocation.provider.AllocationItemProviderAdapterFactory;
import eu.qimpress.samm.deployment.hardware.provider.HardwareItemProviderAdapterFactory;
import eu.qimpress.samm.deployment.targetenvironment.provider.TargetenvironmentItemProviderAdapterFactory;
import eu.qimpress.samm.qosannotation.provider.QosannotationItemProviderAdapterFactory;
import eu.qimpress.samm.staticstructure.provider.StaticstructureItemProviderAdapterFactory;
import eu.qimpress.samm.usagemodel.provider.UsagemodelItemProviderAdapterFactory;


/**
 * @author Oleg
 */
public class ComponentSelectionWizardPage extends WizardPage {
    /**
     * Composed adapter factory.
     */
    private ComposedAdapterFactory adapterFactory;
    /**
     * Checkbox tree viewer.
     */
    private CheckboxTreeViewer viewer;
    /**
     * Resource selection.
     */
    private Resource selection;
    /**
     * Samm model.
     */
    private Object sammModel;
    /**
     * Filtering adapter factory content provider.
     */
    private FilteringAdapterFactoryContentProvider provider;

    /**
     * the constructor.
     * @param pageName page name
     */
    protected ComponentSelectionWizardPage(final String pageName) {
        super(pageName);
        initAdapterFactory();
        provider = new FilteringAdapterFactoryContentProvider(adapterFactory);
        setTitle("Select Components");
        setDescription("Select components, "
        + "in which patterns should be detected.");

        // simple call to ensure the necessary models are loaded
        SourceCodeDecoratorPackage.eINSTANCE.getNsURI();
    }

    /**
     * @param parent composite parent
     * @see org.eclipse.jface.dialogs.IDialogPage#createControl(
     * org.eclipse.swt.widgets.Composite)
     */
    @Override
    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        composite.setLayout(new GridLayout());

        Group selectionArea = new Group(composite, SWT.SHADOW_IN);
        selectionArea.setText("Select Components, which should be analyzed");
        selectionArea.setLayout(new GridLayout(1, false));
        selectionArea.setLayoutData(new GridData(SWT.FILL,
                SWT.FILL, true, true));

        viewer = new ContainerCheckedTreeViewer(selectionArea);
        viewer.setContentProvider(provider);
        viewer.setLabelProvider(new
                AdapterFactoryLabelProvider(adapterFactory));
        viewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));

        Button b = new Button(selectionArea, SWT.PUSH);
        b.setText("Select oder Deselect all");
        b.addSelectionListener(new SelectionListener() {

            @SuppressWarnings("deprecation")
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (isAllChecked()) {
                    viewer.setAllChecked(false);
                } else {
                    viewer.setAllChecked(true);
                }
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
            }
        });
        setControl(composite);
    }

    /**
     * Checks selection.
     */
    private void checkSelection() {
        if (this.selection != null) {
            try {
                this.selection.load(null);
            } catch (IOException e) {
                MessageDialog.openError(getShell(), "Could not load model",
                        "The selected model could not be loaded "
                + "because of an Exception " + e);
                e.printStackTrace();
            }
            if (this.selection.isLoaded()) {
                SourceCodeDecoratorRepository root =
                        (SourceCodeDecoratorRepository)
                        this.selection.getContents().get(0);
                ComponentImplementingClassesLink link =
                        root.getComponentImplementingClassesLink().get(0);
                this.sammModel = link.getComponent().eContainer();
            }
        }
    }

    /**
     * Initialises the adapter factory.
     */
    private void initAdapterFactory() {
        adapterFactory = new ComposedAdapterFactory(
                ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

        adapterFactory.addAdapterFactory(
                new ResourceItemProviderAdapterFactory());
         adapterFactory.addAdapterFactory(new
         StaticstructureItemProviderAdapterFactory());
         adapterFactory.addAdapterFactory(new
         CoreItemProviderAdapterFactory());
         adapterFactory.addAdapterFactory(new
         DatatypesItemProviderAdapterFactory());
         adapterFactory.addAdapterFactory(new
         BehaviourItemProviderAdapterFactory());
         adapterFactory.addAdapterFactory(new
         TargetenvironmentItemProviderAdapterFactory());
         adapterFactory.addAdapterFactory(new
         HardwareItemProviderAdapterFactory());
         adapterFactory.addAdapterFactory(new
         AllocationItemProviderAdapterFactory());
         adapterFactory.addAdapterFactory(new
         AnnotationItemProviderAdapterFactory());
         adapterFactory.addAdapterFactory(new
         UsagemodelItemProviderAdapterFactory());
         adapterFactory.addAdapterFactory(new
         QosannotationItemProviderAdapterFactory());
         adapterFactory.addAdapterFactory(new
         IdentifierItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new
                ProbfunctionItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new StoexItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new UnitsItemProviderAdapterFactory());
        adapterFactory.addAdapterFactory(new
                ReflectiveItemProviderAdapterFactory());
    }

    /**
     * Returns the selection.
     * @return selection
     */
    protected Resource getSelection() {
        return this.selection;
    }

    /**
     * Sets the selection.
     * @param selection selection
     */
    protected void setSelection(Resource selection) {
        if (this.selection != null && this.selection != selection) {
            // important, otherwise an old resource will be loaded together
            // with the selected resource and also will be analyzed
            this.selection.unload();
            ResourceSet set = this.selection.getResourceSet();
            set.getResources().remove(this.selection);
        }
        this.selection = selection;
        checkSelection();
        viewer.setInput(sammModel);
        viewer.setAllChecked(true);
    }

    /**
     * Returns the checked objects.
     * @return checked objects
     */
    public Object[] getCheckedObjects() {
        return this.viewer.getCheckedElements();
    }

    /**
     * Checks if all elements are checked.
     * @return bool decision value
     */
    public boolean isAllChecked() {
        Object[] all = this.provider.getElements(sammModel);
        Object[] checked = this.viewer.getCheckedElements();

        return all.length == checked.length;
    }

    /**
     * @see org.eclipse.jface.wizard.WizardPage#isPageComplete()
     * @return bool decision value
     */
    @Override
    public boolean isPageComplete() {
        return (this.getCheckedObjects().length > 0);
    }
    
    @Override
    public boolean canFlipToNextPage() {
        return false;
    }
    
    

}
