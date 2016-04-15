package ca.gc.asc_csa.apogy.addons.vehicle.ui;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;

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
 * <!-- begin-model-doc -->
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca),
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.ApogyAddonsVehicleUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyAddonsVehicleUI' childCreationExtenders='true' extensibleProviderFactory='true' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyAddonsVehicleUI' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/ca.gc.asc_csa.apogy.addons.vehicle.ui/src-generated' editDirectory='/ca.gc.asc_csa.apogy.addons.vehicle.ui.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.addons.vehicle'"
 * @generated
 */
public interface ApogyAddonsVehicleUIPackage extends EPackage
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
  String eNS_URI = "ca.gc.asc_csa.apogy.addons.vehicle.ui";

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
  ApogyAddonsVehicleUIPackage eINSTANCE = ca.gc.asc_csa.apogy.addons.vehicle.ui.impl.ApogyAddonsVehicleUIPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.ui.impl.PhysicalWheelPresentationImpl <em>Physical Wheel Presentation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.impl.PhysicalWheelPresentationImpl
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.impl.ApogyAddonsVehicleUIPackageImpl#getPhysicalWheelPresentation()
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
	int PHYSICAL_WHEEL_PRESENTATION__TOPOLOGY_PRESENTATION_SET = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

		/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__NODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__NODE;

  /**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__COLOR = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__VISIBLE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

  /**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_WHEEL_PRESENTATION__SHADOW_MODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

		/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__USE_IN_BOUNDING_CALCULATION = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

		/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__CENTROID = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

		/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__MIN = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MIN;

		/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__MAX = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MAX;

		/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__XRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

		/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__YRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

		/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__ZRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

		/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION__SCENE_OBJECT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

		/**
	 * The number of structural features of the '<em>Physical Wheel Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION_FEATURE_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Physical Wheel Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PHYSICAL_WHEEL_PRESENTATION_OPERATION_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;


  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.ui.impl.LanderSphericalFootPresentationImpl <em>Lander Spherical Foot Presentation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.impl.LanderSphericalFootPresentationImpl
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.impl.ApogyAddonsVehicleUIPackageImpl#getLanderSphericalFootPresentation()
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
	int LANDER_SPHERICAL_FOOT_PRESENTATION__TOPOLOGY_PRESENTATION_SET = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

		/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__NODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__NODE;

  /**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__COLOR = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__VISIBLE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

  /**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SPHERICAL_FOOT_PRESENTATION__SHADOW_MODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

		/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__USE_IN_BOUNDING_CALCULATION = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

		/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__CENTROID = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

		/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__MIN = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MIN;

		/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__MAX = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MAX;

		/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__XRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

		/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__YRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

		/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__ZRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

		/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION__SCENE_OBJECT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

		/**
	 * The number of structural features of the '<em>Lander Spherical Foot Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION_FEATURE_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Lander Spherical Foot Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_PRESENTATION_OPERATION_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;


  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.ui.impl.ThrusterPresentationImpl <em>Thruster Presentation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.impl.ThrusterPresentationImpl
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.impl.ApogyAddonsVehicleUIPackageImpl#getThrusterPresentation()
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
	int THRUSTER_PRESENTATION__TOPOLOGY_PRESENTATION_SET = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

		/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__NODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__NODE;

  /**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__COLOR = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__VISIBLE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

  /**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRUSTER_PRESENTATION__SHADOW_MODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

		/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__USE_IN_BOUNDING_CALCULATION = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

		/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__CENTROID = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

		/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__MIN = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MIN;

		/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__MAX = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MAX;

		/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__XRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

		/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__YRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

		/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__ZRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

		/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION__SCENE_OBJECT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

		/**
	 * The feature id for the '<em><b>Plume Envelope Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRUSTER_PRESENTATION__PLUME_ENVELOPE_VISIBLE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Plume Envelope Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRUSTER_PRESENTATION__PLUME_ENVELOPE_LENGTH = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Thruster Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION_FEATURE_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Thruster Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_PRESENTATION_OPERATION_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;


  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.vehicle.ui.PhysicalWheelPresentation <em>Physical Wheel Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Wheel Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.PhysicalWheelPresentation
	 * @generated
	 */
  EClass getPhysicalWheelPresentation();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.vehicle.ui.LanderSphericalFootPresentation <em>Lander Spherical Foot Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lander Spherical Foot Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.LanderSphericalFootPresentation
	 * @generated
	 */
  EClass getLanderSphericalFootPresentation();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.vehicle.ui.ThrusterPresentation <em>Thruster Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thruster Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.ThrusterPresentation
	 * @generated
	 */
  EClass getThrusterPresentation();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.vehicle.ui.ThrusterPresentation#isPlumeEnvelopeVisible <em>Plume Envelope Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plume Envelope Visible</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.ThrusterPresentation#isPlumeEnvelopeVisible()
	 * @see #getThrusterPresentation()
	 * @generated
	 */
	EAttribute getThrusterPresentation_PlumeEnvelopeVisible();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.vehicle.ui.ThrusterPresentation#getPlumeEnvelopeLength <em>Plume Envelope Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plume Envelope Length</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.ThrusterPresentation#getPlumeEnvelopeLength()
	 * @see #getThrusterPresentation()
	 * @generated
	 */
	EAttribute getThrusterPresentation_PlumeEnvelopeLength();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyAddonsVehicleUIFactory getApogyAddonsVehicleUIFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.ui.impl.PhysicalWheelPresentationImpl <em>Physical Wheel Presentation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.impl.PhysicalWheelPresentationImpl
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.impl.ApogyAddonsVehicleUIPackageImpl#getPhysicalWheelPresentation()
		 * @generated
		 */
    EClass PHYSICAL_WHEEL_PRESENTATION = eINSTANCE.getPhysicalWheelPresentation();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.ui.impl.LanderSphericalFootPresentationImpl <em>Lander Spherical Foot Presentation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.impl.LanderSphericalFootPresentationImpl
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.impl.ApogyAddonsVehicleUIPackageImpl#getLanderSphericalFootPresentation()
		 * @generated
		 */
    EClass LANDER_SPHERICAL_FOOT_PRESENTATION = eINSTANCE.getLanderSphericalFootPresentation();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.ui.impl.ThrusterPresentationImpl <em>Thruster Presentation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.impl.ThrusterPresentationImpl
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.impl.ApogyAddonsVehicleUIPackageImpl#getThrusterPresentation()
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
		 * The meta object literal for the '<em><b>Plume Envelope Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRUSTER_PRESENTATION__PLUME_ENVELOPE_LENGTH = eINSTANCE.getThrusterPresentation_PlumeEnvelopeLength();

  }

} //ApogyAddonsVehicleUIPackage
