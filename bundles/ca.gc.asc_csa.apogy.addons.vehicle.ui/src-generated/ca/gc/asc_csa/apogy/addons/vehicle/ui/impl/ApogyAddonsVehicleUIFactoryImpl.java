/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.vehicle.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.LanderSphericalFootPresentation;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.PhysicalWheelPresentation;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.ApogyAddonsVehicleUIFactory;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.ApogyAddonsVehicleUIPackage;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.ThrusterPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsVehicleUIFactoryImpl extends EFactoryImpl implements ApogyAddonsVehicleUIFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyAddonsVehicleUIFactory init()
  {
		try {
			ApogyAddonsVehicleUIFactory theApogyAddonsVehicleUIFactory = (ApogyAddonsVehicleUIFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsVehicleUIPackage.eNS_URI);
			if (theApogyAddonsVehicleUIFactory != null) {
				return theApogyAddonsVehicleUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsVehicleUIFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyAddonsVehicleUIFactoryImpl()
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
			case ApogyAddonsVehicleUIPackage.PHYSICAL_WHEEL_PRESENTATION: return createPhysicalWheelPresentation();
			case ApogyAddonsVehicleUIPackage.LANDER_SPHERICAL_FOOT_PRESENTATION: return createLanderSphericalFootPresentation();
			case ApogyAddonsVehicleUIPackage.THRUSTER_PRESENTATION: return createThrusterPresentation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PhysicalWheelPresentation createPhysicalWheelPresentation()
  {
		PhysicalWheelPresentationImpl physicalWheelPresentation = new PhysicalWheelPresentationImpl();
		return physicalWheelPresentation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LanderSphericalFootPresentation createLanderSphericalFootPresentation()
  {
		LanderSphericalFootPresentationImpl landerSphericalFootPresentation = new LanderSphericalFootPresentationImpl();
		return landerSphericalFootPresentation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ThrusterPresentation createThrusterPresentation()
  {
		ThrusterPresentationImpl thrusterPresentation = new ThrusterPresentationImpl();
		return thrusterPresentation;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsVehicleUIPackage getApogyAddonsVehicleUIPackage() {
		return (ApogyAddonsVehicleUIPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyAddonsVehicleUIPackage getPackage()
  {
		return ApogyAddonsVehicleUIPackage.eINSTANCE;
	}

} //ApogyAddonsVehicleUIFactoryImpl
