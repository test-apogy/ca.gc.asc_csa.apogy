/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.bindings.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.topology.bindings.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.topology.bindings.TopologyBindingsPackage
 * @generated
 */
public class TopologyBindingsAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static TopologyBindingsPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TopologyBindingsAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = TopologyBindingsPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TopologyBindingsSwitch<Adapter> modelSwitch =
    new TopologyBindingsSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractTopologyBinding(AbstractTopologyBinding object) {
				return createAbstractTopologyBindingAdapter();
			}
			@Override
			public Adapter caseRotationBinding(RotationBinding object) {
				return createRotationBindingAdapter();
			}
			@Override
			public Adapter caseTranslationBinding(TranslationBinding object) {
				return createTranslationBindingAdapter();
			}
			@Override
			public Adapter caseTransformMatrixBinding(TransformMatrixBinding object) {
				return createTransformMatrixBindingAdapter();
			}
			@Override
			public Adapter caseEnumerationSwitchBinding(EnumerationSwitchBinding object) {
				return createEnumerationSwitchBindingAdapter();
			}
			@Override
			public Adapter caseEnumerationCase(EnumerationCase object) {
				return createEnumerationCaseAdapter();
			}
			@Override
			public Adapter caseBindingsList(BindingsList object) {
				return createBindingsListAdapter();
			}
			@Override
			public Adapter caseFeatureRootsList(FeatureRootsList object) {
				return createFeatureRootsListAdapter();
			}
			@Override
			public Adapter caseBindingsSet(BindingsSet object) {
				return createBindingsSetAdapter();
			}
			@Override
			public Adapter caseTopologyBindingsFacade(TopologyBindingsFacade object) {
				return createTopologyBindingsFacadeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding <em>Abstract Topology Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding
	 * @generated
	 */
  public Adapter createAbstractTopologyBindingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.bindings.RotationBinding <em>Rotation Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.bindings.RotationBinding
	 * @generated
	 */
  public Adapter createRotationBindingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.bindings.TranslationBinding <em>Translation Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.bindings.TranslationBinding
	 * @generated
	 */
  public Adapter createTranslationBindingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.bindings.TransformMatrixBinding <em>Transform Matrix Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.bindings.TransformMatrixBinding
	 * @generated
	 */
  public Adapter createTransformMatrixBindingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.bindings.EnumerationSwitchBinding <em>Enumeration Switch Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.bindings.EnumerationSwitchBinding
	 * @generated
	 */
  public Adapter createEnumerationSwitchBindingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.bindings.EnumerationCase <em>Enumeration Case</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.bindings.EnumerationCase
	 * @generated
	 */
  public Adapter createEnumerationCaseAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.bindings.BindingsList <em>Bindings List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.bindings.BindingsList
	 * @generated
	 */
  public Adapter createBindingsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.bindings.FeatureRootsList <em>Feature Roots List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.bindings.FeatureRootsList
	 * @generated
	 */
  public Adapter createFeatureRootsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.bindings.BindingsSet <em>Bindings Set</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.bindings.BindingsSet
	 * @generated
	 */
  public Adapter createBindingsSetAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.bindings.TopologyBindingsFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.bindings.TopologyBindingsFacade
	 * @generated
	 */
  public Adapter createTopologyBindingsFacadeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //TopologyBindingsAdapterFactory
