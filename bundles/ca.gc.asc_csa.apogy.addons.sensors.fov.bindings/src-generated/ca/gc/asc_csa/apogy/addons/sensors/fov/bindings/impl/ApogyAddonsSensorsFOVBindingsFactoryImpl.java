/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.CircularSectorFieldOfViewBinding;
import ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.ConicalFieldOfViewBinding;
import ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.ApogyAddonsSensorsFOVBindingsFactory;
import ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.ApogyAddonsSensorsFOVBindingsPackage;
import ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.RectangularFrustrumFieldOfViewBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsSensorsFOVBindingsFactoryImpl extends EFactoryImpl implements ApogyAddonsSensorsFOVBindingsFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyAddonsSensorsFOVBindingsFactory init()
  {
		try {
			ApogyAddonsSensorsFOVBindingsFactory theApogyAddonsSensorsFOVBindingsFactory = (ApogyAddonsSensorsFOVBindingsFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsSensorsFOVBindingsPackage.eNS_URI);
			if (theApogyAddonsSensorsFOVBindingsFactory != null) {
				return theApogyAddonsSensorsFOVBindingsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsSensorsFOVBindingsFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyAddonsSensorsFOVBindingsFactoryImpl()
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
			case ApogyAddonsSensorsFOVBindingsPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING: return createCircularSectorFieldOfViewBinding();
			case ApogyAddonsSensorsFOVBindingsPackage.CONICAL_FIELD_OF_VIEW_BINDING: return createConicalFieldOfViewBinding();
			case ApogyAddonsSensorsFOVBindingsPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING: return createRectangularFrustrumFieldOfViewBinding();
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
	public ApogyAddonsSensorsFOVBindingsPackage getApogyAddonsSensorsFOVBindingsPackage() {
		return (ApogyAddonsSensorsFOVBindingsPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyAddonsSensorsFOVBindingsPackage getPackage()
  {
		return ApogyAddonsSensorsFOVBindingsPackage.eINSTANCE;
	}

} //ApogyAddonsSensorsFOVBindingsFactoryImpl
