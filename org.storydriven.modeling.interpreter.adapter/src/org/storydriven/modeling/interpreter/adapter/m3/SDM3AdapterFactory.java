package org.storydriven.modeling.interpreter.adapter.m3;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.modeling.interpreter.adapter.SDAdapterFactory;
import org.storydriven.modeling.interpreter.adapter.SDMainAdapterFactory;
import org.storydriven.modeling.patterns.Path;

import de.mdelab.sdm.interpreter.common.adapters.m3.IClassifierAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IInstanceAdapter;
import de.mdelab.sdm.interpreter.common.adapters.m3.IM3AdapterFactory;

public class SDM3AdapterFactory extends SDAdapterFactory implements IM3AdapterFactory
{
   private SDInternalM3AdapterFactory internalM3AdapterFactory;

   private Map<Object, SDPrimitiveInstanceAdapter> primitiveAdapters;

   private Map<Collection<EObject>, SDObjectSetInstanceAdapter> objectSetAdapters;

   private SDTraversalCostCalculator costCalculator;

   private Map<EStructuralFeature, SDEStructuralFeaturePropertyAdapter<? extends EStructuralFeature>> structuralFeatureAdapters;

   private Map<IClassifierAdapter, SDContainmentPropertyAdapter> containmentPropertyAdapters;

   private Map<SDPropertyAdapter, SDNonNavigablePropertyAdapter> nonNavigablePropertyAdapters;

   private Map<SDPropertyAdapter, SDBackwardNavigablePropertyAdapter> backwardNavigablePropertyAdapters;

   private Map<SDPropertyAdapter, SDEContainerPropertyAdapter> eContainerPropertyAdapters;

   private Map<EReference, SDMapEntryReferencePropertyAdapter> mapEntryReferencePropertyAdapters;

   private Map<SDMapEntryReferencePropertyAdapter, SDMapEntryKeyPropertyAdapter> mapEntryKeyPropertyAdapters;
   
   private Map<Path, SDPathAdapter> pathAdapters;

   protected Map<SDMapEntryReferencePropertyAdapter, SDMapEntryValuePropertyAdapter> mapEntryValuePropertyAdapters;

	public SDM3AdapterFactory(SDMainAdapterFactory mainAdapterFactory)
	{
		super(mainAdapterFactory);

		internalM3AdapterFactory = new SDInternalM3AdapterFactory(mainAdapterFactory);

		primitiveAdapters = new ConcurrentHashMap<Object, SDPrimitiveInstanceAdapter>();

		costCalculator = new SDTraversalCostCalculator();

		structuralFeatureAdapters = new ConcurrentHashMap<EStructuralFeature, SDEStructuralFeaturePropertyAdapter<? extends EStructuralFeature>>();

		containmentPropertyAdapters = new ConcurrentHashMap<IClassifierAdapter, SDContainmentPropertyAdapter>();

		nonNavigablePropertyAdapters = new ConcurrentHashMap<SDPropertyAdapter, SDNonNavigablePropertyAdapter>();
		
		backwardNavigablePropertyAdapters = new ConcurrentHashMap<SDPropertyAdapter, SDBackwardNavigablePropertyAdapter>();

		eContainerPropertyAdapters = new ConcurrentHashMap<SDPropertyAdapter, SDEContainerPropertyAdapter>();

		mapEntryReferencePropertyAdapters = new ConcurrentHashMap<EReference, SDMapEntryReferencePropertyAdapter>();
		
		mapEntryKeyPropertyAdapters = new ConcurrentHashMap<SDMapEntryReferencePropertyAdapter, SDMapEntryKeyPropertyAdapter>();
		
		mapEntryValuePropertyAdapters = new ConcurrentHashMap<SDMapEntryReferencePropertyAdapter, SDMapEntryValuePropertyAdapter>();
		
		objectSetAdapters = new ConcurrentHashMap<Collection<EObject>, SDObjectSetInstanceAdapter>();
		
		pathAdapters = new ConcurrentHashMap<Path, SDPathAdapter>();
	}

	@Override
	public IClassifierAdapter getClassifierAdapter(Object classifier)
	{
		assert classifier instanceof EClassifier;

		return (IClassifierAdapter) internalM3AdapterFactory.adapt((EClassifier) classifier, this);
	}

	public SDEStructuralFeaturePropertyAdapter<? extends EStructuralFeature> getEStructuralFeaturePropertyAdapter(
			EStructuralFeature feature)
	{
		assert feature != null;

		synchronized (feature)
		{
			SDEStructuralFeaturePropertyAdapter<? extends EStructuralFeature> adapter = structuralFeatureAdapters.get(feature);

			if (adapter == null)
			{
				if (feature instanceof EReference)
				{
					adapter = createEReferenceAdapter(getMainAdapterFactory(), (EReference) feature);
				}
				else if (feature instanceof EAttribute)
				{
					adapter = createEAttributeAdapter(getMainAdapterFactory(), (EAttribute) feature);
				}
				else
				{
					/*
					 * This should never happen
					 */
					throw new UnsupportedOperationException();
				}

				structuralFeatureAdapters.put(feature, adapter);
			}

			return adapter;
		}
	}

	protected SDEReferenceAdapter createEReferenceAdapter(SDMainAdapterFactory mainAdapterFactory, EReference eReference)
	{
		return new SDEReferenceAdapter(mainAdapterFactory, eReference);
	}

	protected SDEAttributeAdapter createEAttributeAdapter(SDMainAdapterFactory mainAdapterFactory, EAttribute eAttribute)
	{
		return new SDEAttributeAdapter(mainAdapterFactory, eAttribute);
	}

	public SDContainmentPropertyAdapter getContainmentPropertyAdapter(SDClassifierAdapter classifierAdapter)
	{
		synchronized (classifierAdapter)
		{
			SDContainmentPropertyAdapter containmentPropertyAdapter = containmentPropertyAdapters.get(classifierAdapter);

			if (containmentPropertyAdapter == null)
			{
				containmentPropertyAdapter = new SDContainmentPropertyAdapter(getMainAdapterFactory(), classifierAdapter);

				containmentPropertyAdapters.put(classifierAdapter, containmentPropertyAdapter);
			}

			return containmentPropertyAdapter;
		}
	}
	
	
   public SDPathAdapter getPathAdapter(Path path)
   {
      synchronized (pathAdapters)
      {
         SDPathAdapter pathAdapter = pathAdapters.get(path);

         if (pathAdapter == null)
         {
            pathAdapter = new SDPathAdapter(getMainAdapterFactory(), path);

            pathAdapters.put(path, pathAdapter);
         }

         return pathAdapter;
      }
   }

	@Override
	public IInstanceAdapter createNewInstance(IClassifierAdapter classifierAdapter)
	{
		assert classifierAdapter instanceof SDClassifierAdapter;

		synchronized (classifierAdapter)
		{
			EClassifier eClassifier = ((SDClassifierAdapter) classifierAdapter).getEClassifier();

			if (eClassifier instanceof EClass)
			{
				EObject eObject = eClassifier.getEPackage().getEFactoryInstance().create((EClass) eClassifier);

				return createEObjectInstanceAdapter(eObject);
			}
			else
			// if (eClassifier instanceof EDataType)
			{
				// object =
				// eClassifier.getEPackage().getEFactoryInstance().createFromString((EDataType)
				// eClassifier, "");

				throw new UnsupportedOperationException();
			}
		}
	}

	private SDEObjectInstanceAdapter createEObjectInstanceAdapter(EObject eObject)
	{
		SDEObjectInstanceAdapter instanceAdapter = new SDEObjectInstanceAdapter(getMainAdapterFactory());

		eObject.eAdapters().add(instanceAdapter);

		return instanceAdapter;
	}

	private SDPrimitiveInstanceAdapter createPrimitiveInstanceAdapter(Object object, EDataType eDataType)
	{
		SDPrimitiveInstanceAdapter adapter = new SDPrimitiveInstanceAdapter(getMainAdapterFactory(), object, eDataType);

		primitiveAdapters.put(object, adapter);

		return adapter;
	}

	@Override
	public IInstanceAdapter getInstanceAdapter(Object instance, IClassifierAdapter classifierAdapter)
	{
		assert classifierAdapter instanceof SDClassifierAdapter;

		synchronized (instance)
		{
			EClassifier eClassifier = ((SDClassifierAdapter) classifierAdapter).getEClassifier();

			if (eClassifier instanceof EClass && instance instanceof Notifier)
			{
				IInstanceAdapter instanceAdapter = (IInstanceAdapter) EcoreUtil.getExistingAdapter((Notifier) instance, this);

				if (instanceAdapter != null)
				{
					return instanceAdapter;
				}

				return createEObjectInstanceAdapter((EObject) instance);
			}
			else if(instance instanceof Collection)
			{
			   IInstanceAdapter instanceAdapter = objectSetAdapters.get(instance);
			   if (instanceAdapter == null)
            {
			      instanceAdapter = createEObjectSetInstanceAdapter((Collection<EObject>) instance);
            }
			   
			   return instanceAdapter;
			}
			else
			{
				SDPrimitiveInstanceAdapter primitiveInstanceAdapter = primitiveAdapters.get(instance);

				if (primitiveInstanceAdapter == null)
				{
					primitiveInstanceAdapter = createPrimitiveInstanceAdapter(instance, (EDataType) eClassifier);
				}

				return primitiveInstanceAdapter;
			}
		}
	}

	protected IInstanceAdapter createEObjectSetInstanceAdapter(Collection<EObject> instance)
   {
	   synchronized (objectSetAdapters)
      {
         SDObjectSetInstanceAdapter newObjectSetAdapter = objectSetAdapters.get(instance);

         if (newObjectSetAdapter == null && !instance.isEmpty())
         {
            newObjectSetAdapter = new SDObjectSetInstanceAdapter(getMainAdapterFactory());
            newObjectSetAdapter.setValue(instance);

            objectSetAdapters.put(instance, newObjectSetAdapter);
         }

         return newObjectSetAdapter;
      }
   }

   public SDTraversalCostCalculator getTraversalCostCalculator()
	{
		return costCalculator;
	}

	public SDNonNavigablePropertyAdapter getNonNavigablePropertyAdapter(IClassifierAdapter classifierAdapter,
			SDPropertyAdapter propertyAdapter)
	{
		synchronized (propertyAdapter)
		{
			SDNonNavigablePropertyAdapter nonNavigablePropertyAdapter = nonNavigablePropertyAdapters.get(propertyAdapter);

			if (nonNavigablePropertyAdapter == null)
			{
				nonNavigablePropertyAdapter = createNonNavigablePropertyAdapter(getMainAdapterFactory(), classifierAdapter);

				nonNavigablePropertyAdapters.put(propertyAdapter, nonNavigablePropertyAdapter);
			}

			return nonNavigablePropertyAdapter;
		}
	}
	
	public SDBackwardNavigablePropertyAdapter getBackwardNavigablePropertyAdapter(IClassifierAdapter classifierAdapter,
         SDPropertyAdapter propertyAdapter)
   {
      synchronized (propertyAdapter)
      {
         SDBackwardNavigablePropertyAdapter backwardNavigablePropertyAdapter = backwardNavigablePropertyAdapters.get(propertyAdapter);

         if (backwardNavigablePropertyAdapter == null)
         {
            backwardNavigablePropertyAdapter = new SDBackwardNavigablePropertyAdapter(getMainAdapterFactory(), classifierAdapter);

            backwardNavigablePropertyAdapters.put(propertyAdapter, backwardNavigablePropertyAdapter);
         }

         return backwardNavigablePropertyAdapter;
      }
   }

	protected SDNonNavigablePropertyAdapter createNonNavigablePropertyAdapter(SDMainAdapterFactory mainAdapterFactory,
			IClassifierAdapter classifierAdapter)
	{
		return new SDNonNavigablePropertyAdapter(mainAdapterFactory, classifierAdapter);
	}

	public SDEContainerPropertyAdapter getEContainerPropertyAdapter(IClassifierAdapter classifierAdapter,
			SDPropertyAdapter sourcePropertyAdapter, boolean indirectContainment)
	{
		synchronized (sourcePropertyAdapter)
		{
			SDEContainerPropertyAdapter eContainerPropertyAdapter = eContainerPropertyAdapters.get(sourcePropertyAdapter);

			if (eContainerPropertyAdapter == null)
			{
				eContainerPropertyAdapter = createEContainerPropertyAdapter(getMainAdapterFactory(), classifierAdapter, indirectContainment);

				eContainerPropertyAdapters.put(sourcePropertyAdapter, eContainerPropertyAdapter);
			}

			return eContainerPropertyAdapter;
		}
	}

	protected SDEContainerPropertyAdapter createEContainerPropertyAdapter(SDMainAdapterFactory mainAdapterFactory,
			IClassifierAdapter classifierAdapter, boolean indirectContainment)
	{
		return new SDEContainerPropertyAdapter(mainAdapterFactory, classifierAdapter, indirectContainment);
	}

	public SDMapEntryReferencePropertyAdapter getMapEntryReferencePropertyAdapter(EReference mapEntryReference)
	{
		assert mapEntryReference != null;

		synchronized (mapEntryReference)
		{
			SDMapEntryReferencePropertyAdapter mapEntryReferencePropertyAdapter = mapEntryReferencePropertyAdapters.get(mapEntryReference);

			if (mapEntryReferencePropertyAdapter == null)
			{
				mapEntryReferencePropertyAdapter = createMapEntryReferencePropertyAdapter(getMainAdapterFactory(), mapEntryReference);

				mapEntryReferencePropertyAdapters.put(mapEntryReference, mapEntryReferencePropertyAdapter);
			}

			return mapEntryReferencePropertyAdapter;
		}
	}

	protected SDMapEntryReferencePropertyAdapter createMapEntryReferencePropertyAdapter(SDMainAdapterFactory mainAdapterFactory,
			EReference eReference)
	{
		return new SDMapEntryReferencePropertyAdapter(mainAdapterFactory, eReference);
	}

	public SDMapEntryKeyPropertyAdapter getMapEntryKeyPropertyAdapter(IClassifierAdapter keyClassifierAdapter,
			SDMapEntryReferencePropertyAdapter mapEntryReferencePropertyAdapter)
	{
		synchronized (mapEntryReferencePropertyAdapter)
		{
			SDMapEntryKeyPropertyAdapter keyPropertyAdapter = mapEntryKeyPropertyAdapters.get(mapEntryReferencePropertyAdapter);
			
			if (keyPropertyAdapter == null)
			{
				keyPropertyAdapter = createMapEntryKeyPropertyAdapter(getMainAdapterFactory(), keyClassifierAdapter, mapEntryReferencePropertyAdapter);
				
				mapEntryKeyPropertyAdapters.put(mapEntryReferencePropertyAdapter, keyPropertyAdapter);
			}
			
			return keyPropertyAdapter;
		}
	}

	private SDMapEntryKeyPropertyAdapter createMapEntryKeyPropertyAdapter(SDMainAdapterFactory mainAdapterFactory, 
			IClassifierAdapter keyClassifierAdapter, SDMapEntryReferencePropertyAdapter mapEntryReferencePropertyAdapter)
	{
		return new SDMapEntryKeyPropertyAdapter(mainAdapterFactory, keyClassifierAdapter, mapEntryReferencePropertyAdapter);
	}

	public SDMapEntryValuePropertyAdapter getMapEntryValuePropertyAdapter(IClassifierAdapter valueClassifierAdapter,
			SDMapEntryReferencePropertyAdapter mapEntryReferencePropertyAdapter)
	{
		synchronized (mapEntryReferencePropertyAdapter)
		{
			SDMapEntryValuePropertyAdapter valuePropertyAdapter = mapEntryValuePropertyAdapters.get(mapEntryReferencePropertyAdapter);
			
			if (valuePropertyAdapter == null)
			{
				valuePropertyAdapter = createMapEntryValuePropertyAdapter(getMainAdapterFactory(), valueClassifierAdapter, mapEntryReferencePropertyAdapter);
				
				mapEntryValuePropertyAdapters.put(mapEntryReferencePropertyAdapter, valuePropertyAdapter);
			}
			
			return valuePropertyAdapter;
		}
	}

	private SDMapEntryValuePropertyAdapter createMapEntryValuePropertyAdapter(SDMainAdapterFactory mainAdapterFactory,
			IClassifierAdapter valueClassifierAdapter, SDMapEntryReferencePropertyAdapter mapEntryReferencePropertyAdapter)
	{
		return new SDMapEntryValuePropertyAdapter(mainAdapterFactory);
	}
}

