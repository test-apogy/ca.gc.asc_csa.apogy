/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.addons.vehicle.ui.LanderSphericalFootPresentation;
import org.eclipse.symphony.addons.vehicle.ui.PhysicalWheelPresentation;
import org.eclipse.symphony.addons.vehicle.ui.Symphony__AddonsVehicleUIFactory;
import org.eclipse.symphony.addons.vehicle.ui.Symphony__AddonsVehicleUIPackage;
import org.eclipse.symphony.addons.vehicle.ui.ThrusterPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsVehicleUIFactoryImpl extends EFactoryImpl implements Symphony__AddonsVehicleUIFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Symphony__AddonsVehicleUIFactory init()
  {
		try {
			Symphony__AddonsVehicleUIFactory theSymphony__AddonsVehicleUIFactory = (Symphony__AddonsVehicleUIFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__AddonsVehicleUIPackage.eNS_URI);
			if (theSymphony__AddonsVehicleUIFactory != null) {
				return theSymphony__AddonsVehicleUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__AddonsVehicleUIFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__AddonsVehicleUIFactoryImpl()
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
			case Symphony__AddonsVehicleUIPackage.PHYSICAL_WHEEL_PRESENTATION: return createPhysicalWheelPresentation();
			case Symphony__AddonsVehicleUIPackage.LANDER_SPHERICAL_FOOT_PRESENTATION: return createLanderSphericalFootPresentation();
			case Symphony__AddonsVehicleUIPackage.THRUSTER_PRESENTATION: return createThrusterPresentation();
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
	public Symphony__AddonsVehicleUIPackage getSymphony__AddonsVehicleUIPackage() {
		return (Symphony__AddonsVehicleUIPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static Symphony__AddonsVehicleUIPackage getPackage()
  {
		return Symphony__AddonsVehicleUIPackage.eINSTANCE;
	}

} //Symphony__AddonsVehicleUIFactoryImpl
