/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.symphony.common.topology.ui.TopologyUIPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.vehicle.ui.SymphonyToolsVehicleUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='SymphonyToolsVehicleUI' childCreationExtenders='true' extensibleProviderFactory='true' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)' modelName='SymphonyToolsVehicleUI' modelDirectory='/org.eclipse.symphony.addons.vehicle.ui/src-generated' editDirectory='/org.eclipse.symphony.addons.vehicle.ui.edit/src-generated' basePackage='org.eclipse.symphony.addons.vehicle'"
 * @generated
 */
public interface SymphonyToolsVehicleUIPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "ui";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "org.eclipse.symphony.addons.vehicle.ui";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "ui";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  SymphonyToolsVehicleUIPackage eINSTANCE = org.eclipse.symphony.addons.vehicle.ui.impl.SymphonyToolsVehicleUIPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.vehicle.ui.impl.PhysicalWheelPresentationImpl <em>Physical Wheel Presentation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.vehicle.ui.impl.PhysicalWheelPresentationImpl
	 * @see org.eclipse.symphony.addons.vehicle.ui.impl.SymphonyToolsVehicleUIPackageImpl#getPhysicalWheelPresentation()
	 * @generated
	 */
  int PHYSICAL_WHEEL_PRESENTATION = 0;

  /**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_WHEEL_PRESENTATION__TOPOLOGY_PRESENTATION_SET = TopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

		/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__NODE = TopologyUIPackage.NODE_PRESENTATION__NODE;

  /**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__COLOR = TopologyUIPackage.NODE_PRESENTATION__COLOR;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__VISIBLE = TopologyUIPackage.NODE_PRESENTATION__VISIBLE;

  /**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_WHEEL_PRESENTATION__SHADOW_MODE = TopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

		/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__USE_IN_BOUNDING_CALCULATION = TopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

		/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__CENTROID = TopologyUIPackage.NODE_PRESENTATION__CENTROID;

		/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__MIN = TopologyUIPackage.NODE_PRESENTATION__MIN;

		/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__MAX = TopologyUIPackage.NODE_PRESENTATION__MAX;

		/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__XRANGE = TopologyUIPackage.NODE_PRESENTATION__XRANGE;

		/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__YRANGE = TopologyUIPackage.NODE_PRESENTATION__YRANGE;

		/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__ZRANGE = TopologyUIPackage.NODE_PRESENTATION__ZRANGE;

		/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__SCENE_OBJECT = TopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

		/**
	 * The number of structural features of the '<em>Physical Wheel Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION_FEATURE_COUNT = TopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Physical Wheel Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION_OPERATION_COUNT = TopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;


  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.vehicle.ui.impl.LanderSphericalFootPresentationImpl <em>Lander Spherical Foot Presentation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.vehicle.ui.impl.LanderSphericalFootPresentationImpl
	 * @see org.eclipse.symphony.addons.vehicle.ui.impl.SymphonyToolsVehicleUIPackageImpl#getLanderSphericalFootPresentation()
	 * @generated
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION = 1;

  /**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SPHERICAL_FOOT_PRESENTATION__TOPOLOGY_PRESENTATION_SET = TopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

		/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__NODE = TopologyUIPackage.NODE_PRESENTATION__NODE;

  /**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__COLOR = TopologyUIPackage.NODE_PRESENTATION__COLOR;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__VISIBLE = TopologyUIPackage.NODE_PRESENTATION__VISIBLE;

  /**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SPHERICAL_FOOT_PRESENTATION__SHADOW_MODE = TopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

		/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__USE_IN_BOUNDING_CALCULATION = TopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

		/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__CENTROID = TopologyUIPackage.NODE_PRESENTATION__CENTROID;

		/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__MIN = TopologyUIPackage.NODE_PRESENTATION__MIN;

		/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__MAX = TopologyUIPackage.NODE_PRESENTATION__MAX;

		/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__XRANGE = TopologyUIPackage.NODE_PRESENTATION__XRANGE;

		/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__YRANGE = TopologyUIPackage.NODE_PRESENTATION__YRANGE;

		/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__ZRANGE = TopologyUIPackage.NODE_PRESENTATION__ZRANGE;

		/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__SCENE_OBJECT = TopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

		/**
	 * The number of structural features of the '<em>Lander Spherical Foot Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION_FEATURE_COUNT = TopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Lander Spherical Foot Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION_OPERATION_COUNT = TopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;


  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.vehicle.ui.impl.ThrusterPresentationImpl <em>Thruster Presentation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.vehicle.ui.impl.ThrusterPresentationImpl
	 * @see org.eclipse.symphony.addons.vehicle.ui.impl.SymphonyToolsVehicleUIPackageImpl#getThrusterPresentation()
	 * @generated
	 */
  int THRUSTER_PRESENTATION = 2;

  /**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRUSTER_PRESENTATION__TOPOLOGY_PRESENTATION_SET = TopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

		/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__NODE = TopologyUIPackage.NODE_PRESENTATION__NODE;

  /**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__COLOR = TopologyUIPackage.NODE_PRESENTATION__COLOR;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__VISIBLE = TopologyUIPackage.NODE_PRESENTATION__VISIBLE;

  /**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRUSTER_PRESENTATION__SHADOW_MODE = TopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

		/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__USE_IN_BOUNDING_CALCULATION = TopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

		/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__CENTROID = TopologyUIPackage.NODE_PRESENTATION__CENTROID;

		/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__MIN = TopologyUIPackage.NODE_PRESENTATION__MIN;

		/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__MAX = TopologyUIPackage.NODE_PRESENTATION__MAX;

		/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__XRANGE = TopologyUIPackage.NODE_PRESENTATION__XRANGE;

		/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__YRANGE = TopologyUIPackage.NODE_PRESENTATION__YRANGE;

		/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__ZRANGE = TopologyUIPackage.NODE_PRESENTATION__ZRANGE;

		/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__SCENE_OBJECT = TopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

		/**
	 * The feature id for the '<em><b>Plume Envelope Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRUSTER_PRESENTATION__PLUME_ENVELOPE_VISIBLE = TopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Plume Envelope Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRUSTER_PRESENTATION__PLUME_ENVELOPE_LENGHT = TopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Thruster Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION_FEATURE_COUNT = TopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Thruster Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION_OPERATION_COUNT = TopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;


  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.vehicle.ui.PhysicalWheelPresentation <em>Physical Wheel Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Wheel Presentation</em>'.
	 * @see org.eclipse.symphony.addons.vehicle.ui.PhysicalWheelPresentation
	 * @generated
	 */
  EClass getPhysicalWheelPresentation();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.vehicle.ui.LanderSphericalFootPresentation <em>Lander Spherical Foot Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lander Spherical Foot Presentation</em>'.
	 * @see org.eclipse.symphony.addons.vehicle.ui.LanderSphericalFootPresentation
	 * @generated
	 */
  EClass getLanderSphericalFootPresentation();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.vehicle.ui.ThrusterPresentation <em>Thruster Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thruster Presentation</em>'.
	 * @see org.eclipse.symphony.addons.vehicle.ui.ThrusterPresentation
	 * @generated
	 */
  EClass getThrusterPresentation();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.vehicle.ui.ThrusterPresentation#isPlumeEnvelopeVisible <em>Plume Envelope Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plume Envelope Visible</em>'.
	 * @see org.eclipse.symphony.addons.vehicle.ui.ThrusterPresentation#isPlumeEnvelopeVisible()
	 * @see #getThrusterPresentation()
	 * @generated
	 */
	EAttribute getThrusterPresentation_PlumeEnvelopeVisible();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.vehicle.ui.ThrusterPresentation#getPlumeEnvelopeLenght <em>Plume Envelope Lenght</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plume Envelope Lenght</em>'.
	 * @see org.eclipse.symphony.addons.vehicle.ui.ThrusterPresentation#getPlumeEnvelopeLenght()
	 * @see #getThrusterPresentation()
	 * @generated
	 */
	EAttribute getThrusterPresentation_PlumeEnvelopeLenght();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  SymphonyToolsVehicleUIFactory getSymphonyToolsVehicleUIFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.vehicle.ui.impl.PhysicalWheelPresentationImpl <em>Physical Wheel Presentation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.vehicle.ui.impl.PhysicalWheelPresentationImpl
		 * @see org.eclipse.symphony.addons.vehicle.ui.impl.SymphonyToolsVehicleUIPackageImpl#getPhysicalWheelPresentation()
		 * @generated
		 */
    EClass PHYSICAL_WHEEL_PRESENTATION = eINSTANCE.getPhysicalWheelPresentation();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.vehicle.ui.impl.LanderSphericalFootPresentationImpl <em>Lander Spherical Foot Presentation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.vehicle.ui.impl.LanderSphericalFootPresentationImpl
		 * @see org.eclipse.symphony.addons.vehicle.ui.impl.SymphonyToolsVehicleUIPackageImpl#getLanderSphericalFootPresentation()
		 * @generated
		 */
    EClass LANDER_SPHERICAL_FOOT_PRESENTATION = eINSTANCE.getLanderSphericalFootPresentation();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.vehicle.ui.impl.ThrusterPresentationImpl <em>Thruster Presentation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.vehicle.ui.impl.ThrusterPresentationImpl
		 * @see org.eclipse.symphony.addons.vehicle.ui.impl.SymphonyToolsVehicleUIPackageImpl#getThrusterPresentation()
		 * @generated
		 */
    EClass THRUSTER_PRESENTATION = eINSTANCE.getThrusterPresentation();
				/**
		 * The meta object literal for the '<em><b>Plume Envelope Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRUSTER_PRESENTATION__PLUME_ENVELOPE_VISIBLE = eINSTANCE.getThrusterPresentation_PlumeEnvelopeVisible();
				/**
		 * The meta object literal for the '<em><b>Plume Envelope Lenght</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRUSTER_PRESENTATION__PLUME_ENVELOPE_LENGHT = eINSTANCE.getThrusterPresentation_PlumeEnvelopeLenght();

  }

} //SymphonyToolsVehicleUIPackage
