package ca.gc.asc_csa.apogy.addons.sensors.fov.bindings;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage;

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
 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.ApogyAddonsSensorsFOVBindingsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyAddonsSensorsFOVBindings' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne - Canadian Space Agency 2015 Copyrights (c)' modelName='ApogyAddonsSensorsFOVBindings' complianceLevel='6.0' modelDirectory='/ca.gc.asc_csa.apogy.addons.sensors.fov.bindings/src-generated' editDirectory='/ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.addons.sensors.fov'"
 * @generated
 */
public interface ApogyAddonsSensorsFOVBindingsPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "bindings";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "ca.gc.asc_csa.apogy.addons.sensors.fov.bindings";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "bindings";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyAddonsSensorsFOVBindingsPackage eINSTANCE = ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.ApogyAddonsSensorsFOVBindingsPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.CircularSectorFieldOfViewBindingImpl <em>Circular Sector Field Of View Binding</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.CircularSectorFieldOfViewBindingImpl
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.ApogyAddonsSensorsFOVBindingsPackageImpl#getCircularSectorFieldOfViewBinding()
	 * @generated
	 */
  int CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING = 0;

  /**
	 * The feature id for the '<em><b>Binded</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING__BINDED = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__BINDED;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING__DESCRIPTION = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING__NAME = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING__SOURCE = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__SOURCE;

  /**
	 * The feature id for the '<em><b>Feature Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING__FEATURE_NODE = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE;

  /**
	 * The feature id for the '<em><b>Feature Node Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING__FEATURE_NODE_ADAPTER = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE_ADAPTER;

  /**
	 * The feature id for the '<em><b>Fov</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING__FOV = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Circular Sector Field Of View Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING_FEATURE_COUNT = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Bind</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING___BIND = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING___BIND;

  /**
	 * The operation id for the '<em>Unbind</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING___UNBIND = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING___UNBIND;

  /**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING___CLONE__MAP = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING___CLONE__MAP;

		/**
	 * The number of operations of the '<em>Circular Sector Field Of View Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING_OPERATION_COUNT = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.ConicalFieldOfViewBindingImpl <em>Conical Field Of View Binding</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.ConicalFieldOfViewBindingImpl
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.ApogyAddonsSensorsFOVBindingsPackageImpl#getConicalFieldOfViewBinding()
	 * @generated
	 */
  int CONICAL_FIELD_OF_VIEW_BINDING = 1;

  /**
	 * The feature id for the '<em><b>Binded</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONICAL_FIELD_OF_VIEW_BINDING__BINDED = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__BINDED;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONICAL_FIELD_OF_VIEW_BINDING__DESCRIPTION = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONICAL_FIELD_OF_VIEW_BINDING__NAME = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONICAL_FIELD_OF_VIEW_BINDING__SOURCE = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__SOURCE;

  /**
	 * The feature id for the '<em><b>Feature Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONICAL_FIELD_OF_VIEW_BINDING__FEATURE_NODE = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE;

  /**
	 * The feature id for the '<em><b>Feature Node Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONICAL_FIELD_OF_VIEW_BINDING__FEATURE_NODE_ADAPTER = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE_ADAPTER;

  /**
	 * The feature id for the '<em><b>Fov</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONICAL_FIELD_OF_VIEW_BINDING__FOV = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Conical Field Of View Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONICAL_FIELD_OF_VIEW_BINDING_FEATURE_COUNT = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Bind</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONICAL_FIELD_OF_VIEW_BINDING___BIND = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING___BIND;

  /**
	 * The operation id for the '<em>Unbind</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONICAL_FIELD_OF_VIEW_BINDING___UNBIND = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING___UNBIND;

  /**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_BINDING___CLONE__MAP = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING___CLONE__MAP;

		/**
	 * The number of operations of the '<em>Conical Field Of View Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONICAL_FIELD_OF_VIEW_BINDING_OPERATION_COUNT = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.RectangularFrustrumFieldOfViewBindingImpl <em>Rectangular Frustrum Field Of View Binding</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.RectangularFrustrumFieldOfViewBindingImpl
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.ApogyAddonsSensorsFOVBindingsPackageImpl#getRectangularFrustrumFieldOfViewBinding()
	 * @generated
	 */
  int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING = 2;

  /**
	 * The feature id for the '<em><b>Binded</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING__BINDED = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__BINDED;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING__DESCRIPTION = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING__NAME = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING__SOURCE = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__SOURCE;

  /**
	 * The feature id for the '<em><b>Feature Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING__FEATURE_NODE = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE;

  /**
	 * The feature id for the '<em><b>Feature Node Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING__FEATURE_NODE_ADAPTER = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE_ADAPTER;

  /**
	 * The feature id for the '<em><b>Fov</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING__FOV = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Rectangular Frustrum Field Of View Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING_FEATURE_COUNT = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Bind</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING___BIND = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING___BIND;

  /**
	 * The operation id for the '<em>Unbind</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING___UNBIND = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING___UNBIND;

  /**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING___CLONE__MAP = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING___CLONE__MAP;

		/**
	 * The number of operations of the '<em>Rectangular Frustrum Field Of View Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING_OPERATION_COUNT = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING_OPERATION_COUNT + 0;


  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.CircularSectorFieldOfViewBinding <em>Circular Sector Field Of View Binding</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circular Sector Field Of View Binding</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.CircularSectorFieldOfViewBinding
	 * @generated
	 */
  EClass getCircularSectorFieldOfViewBinding();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.CircularSectorFieldOfViewBinding#getFov <em>Fov</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fov</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.CircularSectorFieldOfViewBinding#getFov()
	 * @see #getCircularSectorFieldOfViewBinding()
	 * @generated
	 */
  EReference getCircularSectorFieldOfViewBinding_Fov();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.ConicalFieldOfViewBinding <em>Conical Field Of View Binding</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conical Field Of View Binding</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.ConicalFieldOfViewBinding
	 * @generated
	 */
  EClass getConicalFieldOfViewBinding();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.ConicalFieldOfViewBinding#getFov <em>Fov</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fov</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.ConicalFieldOfViewBinding#getFov()
	 * @see #getConicalFieldOfViewBinding()
	 * @generated
	 */
  EReference getConicalFieldOfViewBinding_Fov();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.RectangularFrustrumFieldOfViewBinding <em>Rectangular Frustrum Field Of View Binding</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangular Frustrum Field Of View Binding</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.RectangularFrustrumFieldOfViewBinding
	 * @generated
	 */
  EClass getRectangularFrustrumFieldOfViewBinding();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.RectangularFrustrumFieldOfViewBinding#getFov <em>Fov</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fov</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.RectangularFrustrumFieldOfViewBinding#getFov()
	 * @see #getRectangularFrustrumFieldOfViewBinding()
	 * @generated
	 */
  EReference getRectangularFrustrumFieldOfViewBinding_Fov();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyAddonsSensorsFOVBindingsFactory getApogyAddonsSensorsFOVBindingsFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.CircularSectorFieldOfViewBindingImpl <em>Circular Sector Field Of View Binding</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.CircularSectorFieldOfViewBindingImpl
		 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.ApogyAddonsSensorsFOVBindingsPackageImpl#getCircularSectorFieldOfViewBinding()
		 * @generated
		 */
    EClass CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING = eINSTANCE.getCircularSectorFieldOfViewBinding();

    /**
		 * The meta object literal for the '<em><b>Fov</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING__FOV = eINSTANCE.getCircularSectorFieldOfViewBinding_Fov();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.ConicalFieldOfViewBindingImpl <em>Conical Field Of View Binding</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.ConicalFieldOfViewBindingImpl
		 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.ApogyAddonsSensorsFOVBindingsPackageImpl#getConicalFieldOfViewBinding()
		 * @generated
		 */
    EClass CONICAL_FIELD_OF_VIEW_BINDING = eINSTANCE.getConicalFieldOfViewBinding();

    /**
		 * The meta object literal for the '<em><b>Fov</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CONICAL_FIELD_OF_VIEW_BINDING__FOV = eINSTANCE.getConicalFieldOfViewBinding_Fov();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.RectangularFrustrumFieldOfViewBindingImpl <em>Rectangular Frustrum Field Of View Binding</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.RectangularFrustrumFieldOfViewBindingImpl
		 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.ApogyAddonsSensorsFOVBindingsPackageImpl#getRectangularFrustrumFieldOfViewBinding()
		 * @generated
		 */
    EClass RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING = eINSTANCE.getRectangularFrustrumFieldOfViewBinding();

    /**
		 * The meta object literal for the '<em><b>Fov</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING__FOV = eINSTANCE.getRectangularFrustrumFieldOfViewBinding_Fov();

  }

} //ApogyAddonsSensorsFOVBindingsPackage
