/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.space.mrt.sensors.fov.bindings.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.topology.bindings.AbstractTopologyBinding;
import ca.gc.space.mrt.sensors.fov.bindings.CircularSectorFieldOfViewBinding;
import ca.gc.space.mrt.sensors.fov.bindings.ConicalFieldOfViewBinding;
import ca.gc.space.mrt.sensors.fov.bindings.MRTFOVBindingsPackage;
import ca.gc.space.mrt.sensors.fov.bindings.RectangularFrustrumFieldOfViewBinding;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.sensors.fov.bindings.MRTFOVBindingsPackage
 * @generated
 */
public class MRTFOVBindingsAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static MRTFOVBindingsPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MRTFOVBindingsAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = MRTFOVBindingsPackage.eINSTANCE;
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
  protected MRTFOVBindingsSwitch<Adapter> modelSwitch =
    new MRTFOVBindingsSwitch<Adapter>() {
			@Override
			public Adapter caseCircularSectorFieldOfViewBinding(CircularSectorFieldOfViewBinding object) {
				return createCircularSectorFieldOfViewBindingAdapter();
			}
			@Override
			public Adapter caseConicalFieldOfViewBinding(ConicalFieldOfViewBinding object) {
				return createConicalFieldOfViewBindingAdapter();
			}
			@Override
			public Adapter caseRectangularFrustrumFieldOfViewBinding(RectangularFrustrumFieldOfViewBinding object) {
				return createRectangularFrustrumFieldOfViewBindingAdapter();
			}
			@Override
			public Adapter caseAbstractTopologyBinding(AbstractTopologyBinding object) {
				return createAbstractTopologyBindingAdapter();
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
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.sensors.fov.bindings.CircularSectorFieldOfViewBinding <em>Circular Sector Field Of View Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.sensors.fov.bindings.CircularSectorFieldOfViewBinding
	 * @generated
	 */
  public Adapter createCircularSectorFieldOfViewBindingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.sensors.fov.bindings.ConicalFieldOfViewBinding <em>Conical Field Of View Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.sensors.fov.bindings.ConicalFieldOfViewBinding
	 * @generated
	 */
  public Adapter createConicalFieldOfViewBindingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.sensors.fov.bindings.RectangularFrustrumFieldOfViewBinding <em>Rectangular Frustrum Field Of View Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.sensors.fov.bindings.RectangularFrustrumFieldOfViewBinding
	 * @generated
	 */
  public Adapter createRectangularFrustrumFieldOfViewBindingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.bindings.AbstractTopologyBinding <em>Abstract Topology Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.bindings.AbstractTopologyBinding
	 * @generated
	 */
  public Adapter createAbstractTopologyBindingAdapter()
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

} //MRTFOVBindingsAdapterFactory
