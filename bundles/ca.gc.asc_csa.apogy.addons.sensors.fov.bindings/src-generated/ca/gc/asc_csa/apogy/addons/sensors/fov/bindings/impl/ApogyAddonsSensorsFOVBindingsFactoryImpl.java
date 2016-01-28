/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.fov.bindings.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.addons.sensors.fov.bindings.CircularSectorFieldOfViewBinding;
import org.eclipse.symphony.addons.sensors.fov.bindings.ConicalFieldOfViewBinding;
import org.eclipse.symphony.addons.sensors.fov.bindings.Symphony__AddonsSensorsFOVBindingsFactory;
import org.eclipse.symphony.addons.sensors.fov.bindings.Symphony__AddonsSensorsFOVBindingsPackage;
import org.eclipse.symphony.addons.sensors.fov.bindings.RectangularFrustrumFieldOfViewBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsSensorsFOVBindingsFactoryImpl extends EFactoryImpl implements Symphony__AddonsSensorsFOVBindingsFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Symphony__AddonsSensorsFOVBindingsFactory init()
  {
		try {
			Symphony__AddonsSensorsFOVBindingsFactory theSymphony__AddonsSensorsFOVBindingsFactory = (Symphony__AddonsSensorsFOVBindingsFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__AddonsSensorsFOVBindingsPackage.eNS_URI);
			if (theSymphony__AddonsSensorsFOVBindingsFactory != null) {
				return theSymphony__AddonsSensorsFOVBindingsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__AddonsSensorsFOVBindingsFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__AddonsSensorsFOVBindingsFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case Symphony__AddonsSensorsFOVBindingsPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING: return createCircularSectorFieldOfViewBinding();
			case Symphony__AddonsSensorsFOVBindingsPackage.CONICAL_FIELD_OF_VIEW_BINDING: return createConicalFieldOfViewBinding();
			case Symphony__AddonsSensorsFOVBindingsPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING: return createRectangularFrustrumFieldOfViewBinding();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CircularSectorFieldOfViewBinding createCircularSectorFieldOfViewBinding()
  {
		CircularSectorFieldOfViewBindingImpl circularSectorFieldOfViewBinding = new CircularSectorFieldOfViewBindingImpl();
		return circularSectorFieldOfViewBinding;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ConicalFieldOfViewBinding createConicalFieldOfViewBinding()
  {
		ConicalFieldOfViewBindingImpl conicalFieldOfViewBinding = new ConicalFieldOfViewBindingImpl();
		return conicalFieldOfViewBinding;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RectangularFrustrumFieldOfViewBinding createRectangularFrustrumFieldOfViewBinding()
  {
		RectangularFrustrumFieldOfViewBindingImpl rectangularFrustrumFieldOfViewBinding = new RectangularFrustrumFieldOfViewBindingImpl();
		return rectangularFrustrumFieldOfViewBinding;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsSensorsFOVBindingsPackage getSymphony__AddonsSensorsFOVBindingsPackage() {
		return (Symphony__AddonsSensorsFOVBindingsPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static Symphony__AddonsSensorsFOVBindingsPackage getPackage()
  {
		return Symphony__AddonsSensorsFOVBindingsPackage.eINSTANCE;
	}

} //Symphony__AddonsSensorsFOVBindingsFactoryImpl
