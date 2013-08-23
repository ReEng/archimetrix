package org.reclipse.structure.inference.extended.ui;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;

import de.uka.ipd.sdq.pcm.repository.RepositoryComponent;

/**
 * @author Oleg
 */
public class FilteringAdapterFactoryContentProvider
extends AdapterFactoryContentProvider {

    /**
     * SoMoX system dummy component string.
     */
    private static final String DUMMY = "SoMoX System-Level Dummy Component";

    /**
     * the constructor.
     * @param adapterFactory factory
     */
    public FilteringAdapterFactoryContentProvider(
            final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    @Override
    public Object[] getElements(Object object) {
        Object[] result = super.getElements(object);
        ArrayList<Object> list = new ArrayList<Object>();
        if (result != null) {
            for (Object o : result) {
                if (o instanceof RepositoryComponent) {
                    if (!DUMMY.equals(((
                            RepositoryComponent) o).getEntityName())) {
                        list.add(o);
                    }
                }
            }
        }
        return list.toArray();
    }

    @Override
    public Object[] getChildren(Object object) {
        // return super.getChildren(object);
        return null;
    }

    @Override
    public boolean hasChildren(Object object) {
        // return super.hasChildren(object);
        return false;
    }

}
