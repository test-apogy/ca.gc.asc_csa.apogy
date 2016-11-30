package ca.gc.asc_csa.apogy.core.ui;
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
import org.eclipse.emf.ecore.EDataType;
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
 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCoreUI' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCoreUI' modelDirectory='/ca.gc.asc_csa.apogy.core.ui/src-generated' editDirectory='/ca.gc.asc_csa.apogy.core.ui.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.core'"
 * @generated
 */
public interface ApogyCoreUIPackage extends EPackage
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
  String eNS_URI = "ca.gc.asc_csa.apogy.core.ui";

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
  ApogyCoreUIPackage eINSTANCE = ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIFacadeImpl
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getApogyCoreUIFacade()
	 * @generated
	 */
  int APOGY_CORE_UI_FACADE = 0;

  /**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_CORE_UI_FACADE_FEATURE_COUNT = 0;

  /**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int APOGY_CORE_UI_FACADE_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.ui.impl.ResultNodePresentationImpl <em>Result Node Presentation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ResultNodePresentationImpl
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getResultNodePresentation()
	 * @generated
	 */
  int RESULT_NODE_PRESENTATION = 1;

  /**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

		/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__NODE = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__NODE;

  /**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__COLOR = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__COLOR;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__VISIBLE = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__VISIBLE;

  /**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE_PRESENTATION__SHADOW_MODE = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__SHADOW_MODE;

		/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

		/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__CENTROID = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__CENTROID;

		/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__MIN = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__MIN;

		/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__MAX = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__MAX;

		/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__XRANGE = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__XRANGE;

		/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__YRANGE = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__YRANGE;

		/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__ZRANGE = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__ZRANGE;

		/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__SCENE_OBJECT = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__SCENE_OBJECT;

		/**
	 * The feature id for the '<em><b>Axis Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE_PRESENTATION__AXIS_VISIBLE = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__AXIS_VISIBLE;

		/**
	 * The feature id for the '<em><b>Axis Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_NODE_PRESENTATION__AXIS_LENGTH = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION__AXIS_LENGTH;

		/**
	 * The feature id for the '<em><b>Pole Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__POLE_HEIGHT = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Flag Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION__FLAG_VISIBLE = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Result Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION_FEATURE_COUNT = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Result Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESULT_NODE_PRESENTATION_OPERATION_COUNT = ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '<em>IProject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IProject
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getIProject()
	 * @generated
	 */
	int IPROJECT = 2;

		/**
	 * The meta object id for the '<em>IContainer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IContainer
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getIContainer()
	 * @generated
	 */
	int ICONTAINER = 3;

		/**
	 * The meta object id for the '<em>IFile</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IFile
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getIFile()
	 * @generated
	 */
	int IFILE = 4;

		/**
	 * The meta object id for the '<em>IFolder</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IFolder
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getIFolder()
	 * @generated
	 */
	int IFOLDER = 5;

		/**
	 * The meta object id for the '<em>Image Descriptor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jface.resource.ImageDescriptor
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getImageDescriptor()
	 * @generated
	 */
	int IMAGE_DESCRIPTOR = 6;

		/**
	 * The meta object id for the '<em>ISelection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jface.viewers.ISelection
	 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getISelection()
	 * @generated
	 */
	int ISELECTION = 7;

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade
	 * @generated
	 */
	EClass getApogyCoreUIFacade();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation <em>Result Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Node Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation
	 * @generated
	 */
  EClass getResultNodePresentation();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation#getPoleHeight <em>Pole Height</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pole Height</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation#getPoleHeight()
	 * @see #getResultNodePresentation()
	 * @generated
	 */
  EAttribute getResultNodePresentation_PoleHeight();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation#isFlagVisible <em>Flag Visible</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flag Visible</em>'.
	 * @see ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation#isFlagVisible()
	 * @see #getResultNodePresentation()
	 * @generated
	 */
  EAttribute getResultNodePresentation_FlagVisible();

  /**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IProject <em>IProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProject</em>'.
	 * @see org.eclipse.core.resources.IProject
	 * @model instanceClass="org.eclipse.core.resources.IProject"
	 * @generated
	 */
	EDataType getIProject();

		/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IContainer <em>IContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IContainer</em>'.
	 * @see org.eclipse.core.resources.IContainer
	 * @model instanceClass="org.eclipse.core.resources.IContainer"
	 * @generated
	 */
	EDataType getIContainer();

		/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IFile <em>IFile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IFile</em>'.
	 * @see org.eclipse.core.resources.IFile
	 * @model instanceClass="org.eclipse.core.resources.IFile"
	 * @generated
	 */
	EDataType getIFile();

		/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IFolder <em>IFolder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IFolder</em>'.
	 * @see org.eclipse.core.resources.IFolder
	 * @model instanceClass="org.eclipse.core.resources.IFolder"
	 * @generated
	 */
	EDataType getIFolder();

		/**
	 * Returns the meta object for data type '{@link org.eclipse.jface.resource.ImageDescriptor <em>Image Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Image Descriptor</em>'.
	 * @see org.eclipse.jface.resource.ImageDescriptor
	 * @model instanceClass="org.eclipse.jface.resource.ImageDescriptor"
	 * @generated
	 */
	EDataType getImageDescriptor();

		/**
	 * Returns the meta object for data type '{@link org.eclipse.jface.viewers.ISelection <em>ISelection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ISelection</em>'.
	 * @see org.eclipse.jface.viewers.ISelection
	 * @model instanceClass="org.eclipse.jface.viewers.ISelection"
	 * @generated
	 */
	EDataType getISelection();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCoreUIFactory getApogyCoreUIFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIFacadeImpl
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getApogyCoreUIFacade()
		 * @generated
		 */
    EClass APOGY_CORE_UI_FACADE = eINSTANCE.getApogyCoreUIFacade();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.ui.impl.ResultNodePresentationImpl <em>Result Node Presentation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ResultNodePresentationImpl
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getResultNodePresentation()
		 * @generated
		 */
    EClass RESULT_NODE_PRESENTATION = eINSTANCE.getResultNodePresentation();

    /**
		 * The meta object literal for the '<em><b>Pole Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RESULT_NODE_PRESENTATION__POLE_HEIGHT = eINSTANCE.getResultNodePresentation_PoleHeight();

    /**
		 * The meta object literal for the '<em><b>Flag Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RESULT_NODE_PRESENTATION__FLAG_VISIBLE = eINSTANCE.getResultNodePresentation_FlagVisible();

				/**
		 * The meta object literal for the '<em>IProject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IProject
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getIProject()
		 * @generated
		 */
		EDataType IPROJECT = eINSTANCE.getIProject();

				/**
		 * The meta object literal for the '<em>IContainer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IContainer
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getIContainer()
		 * @generated
		 */
		EDataType ICONTAINER = eINSTANCE.getIContainer();

				/**
		 * The meta object literal for the '<em>IFile</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IFile
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getIFile()
		 * @generated
		 */
		EDataType IFILE = eINSTANCE.getIFile();

				/**
		 * The meta object literal for the '<em>IFolder</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IFolder
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getIFolder()
		 * @generated
		 */
		EDataType IFOLDER = eINSTANCE.getIFolder();

				/**
		 * The meta object literal for the '<em>Image Descriptor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jface.resource.ImageDescriptor
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getImageDescriptor()
		 * @generated
		 */
		EDataType IMAGE_DESCRIPTOR = eINSTANCE.getImageDescriptor();

				/**
		 * The meta object literal for the '<em>ISelection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jface.viewers.ISelection
		 * @see ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIPackageImpl#getISelection()
		 * @generated
		 */
		EDataType ISELECTION = eINSTANCE.getISelection();

  }

} //ApogyCoreUIPackage
