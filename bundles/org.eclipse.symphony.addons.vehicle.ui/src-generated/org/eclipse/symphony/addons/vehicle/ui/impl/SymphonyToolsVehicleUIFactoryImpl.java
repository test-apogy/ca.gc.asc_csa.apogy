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
import org.eclipse.symphony.addons.vehicle.ui.SymphonyToolsVehicleUIFactory;
import org.eclipse.symphony.addons.vehicle.ui.SymphonyToolsVehicleUIPackage;
import org.eclipse.symphony.addons.vehicle.ui.ThrusterPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyToolsVehicleUIFactoryImpl extends EFactoryImpl implements SymphonyToolsVehicleUIFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static SymphonyToolsVehicleUIFactory init()
  {
		try {
			SymphonyToolsVehicleUIFactory theSymphonyToolsVehicleUIFactory = (SymphonyToolsVehicleUIFactory)EPackage.Registry.INSTANCE.getEFactory(SymphonyToolsVehicleUIPackage.eNS_URI);
			if (theSymphonyToolsVehicleUIFactory != null) {
				return theSymphonyToolsVehicleUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SymphonyToolsVehicleUIFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyToolsVehicleUIFactoryImpl()
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
			case SymphonyToolsVehicleUIPackage.PHYSICAL_WHEEL_PRESENTATION: return createPhysicalWheelPresentation();
			case SymphonyToolsVehicleUIPackage.LANDER_SPHERICAL_FOOT_PRESENTATION: return createLanderSphericalFootPresentation();
			case SymphonyToolsVehicleUIPackage.THRUSTER_PRESENTATION: return createThrusterPresentation();
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
  public SymphonyToolsVehicleUIPackage getSymphonyToolsVehicleUIPackage()
  {
		return (SymphonyToolsVehicleUIPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static SymphonyToolsVehicleUIPackage getPackage()
  {
		return SymphonyToolsVehicleUIPackage.eINSTANCE;
	}

} //SymphonyToolsVehicleUIFactoryImpl
