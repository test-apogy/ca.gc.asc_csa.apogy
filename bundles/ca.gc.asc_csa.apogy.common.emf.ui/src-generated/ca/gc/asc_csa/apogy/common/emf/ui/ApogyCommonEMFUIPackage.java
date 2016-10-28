package ca.gc.asc_csa.apogy.common.emf.ui;
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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonEMFUI' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' childCreationExtenders='true' modelName='ApogyCommonEMFUI' modelDirectory='/ca.gc.asc_csa.apogy.common.emf.ui/src-generated' editDirectory='/ca.gc.asc_csa.apogy.common.emf.ui.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.common.emf'"
 * @generated
 */
public interface ApogyCommonEMFUIPackage extends EPackage
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
  String eNS_URI = "ca.gc.asc_csa.apogy.common.emf.ui";

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
  ApogyCommonEMFUIPackage eINSTANCE = ca.gc.asc_csa.apogy.common.emf.ui.impl.ApogyCommonEMFUIPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.ui.impl.ApogyCommonEMFUIFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.ui.impl.ApogyCommonEMFUIFacadeImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.ui.impl.ApogyCommonEMFUIPackageImpl#getApogyCommonEMFUIFacade()
	 * @generated
	 */
	int APOGY_COMMON_EMFUI_FACADE = 0;

		/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMFUI_FACADE_FEATURE_COUNT = 0;

		/**
	 * The operation id for the '<em>Get Color For Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMFUI_FACADE___GET_COLOR_FOR_RANGE__RANGES = 0;

		/**
	 * The operation id for the '<em>Get Display Units</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMFUI_FACADE___GET_DISPLAY_UNITS__ETYPEDELEMENT = 1;

		/**
	 * The operation id for the '<em>Add Expand On Double Click</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMFUI_FACADE___ADD_EXPAND_ON_DOUBLE_CLICK__TREEVIEWER = 2;

		/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMFUI_FACADE_OPERATION_COUNT = 3;

		/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.Color
	 * @see ca.gc.asc_csa.apogy.common.emf.ui.impl.ApogyCommonEMFUIPackageImpl#getColor()
	 * @generated
	 */
  int COLOR = 1;


  /**
	 * The meta object id for the '<em>Unit</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see javax.measure.unit.Unit
	 * @see ca.gc.asc_csa.apogy.common.emf.ui.impl.ApogyCommonEMFUIPackageImpl#getUnit()
	 * @generated
	 */
  int UNIT = 2;


  /**
	 * The meta object id for the '<em>Tree Viewer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jface.viewers.TreeViewer
	 * @see ca.gc.asc_csa.apogy.common.emf.ui.impl.ApogyCommonEMFUIPackageImpl#getTreeViewer()
	 * @generated
	 */
	int TREE_VIEWER = 3;


		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade
	 * @generated
	 */
	EClass getApogyCommonEMFUIFacade();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade#getColorForRange(ca.gc.asc_csa.apogy.common.emf.Ranges) <em>Get Color For Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Color For Range</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade#getColorForRange(ca.gc.asc_csa.apogy.common.emf.Ranges)
	 * @generated
	 */
	EOperation getApogyCommonEMFUIFacade__GetColorForRange__Ranges();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade#getDisplayUnits(org.eclipse.emf.ecore.ETypedElement) <em>Get Display Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Display Units</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade#getDisplayUnits(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getApogyCommonEMFUIFacade__GetDisplayUnits__ETypedElement();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade#addExpandOnDoubleClick(org.eclipse.jface.viewers.TreeViewer) <em>Add Expand On Double Click</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Expand On Double Click</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade#addExpandOnDoubleClick(org.eclipse.jface.viewers.TreeViewer)
	 * @generated
	 */
	EOperation getApogyCommonEMFUIFacade__AddExpandOnDoubleClick__TreeViewer();

		/**
	 * Returns the meta object for data type '{@link org.eclipse.swt.graphics.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color</em>'.
	 * @see org.eclipse.swt.graphics.Color
	 * @model instanceClass="org.eclipse.swt.graphics.Color"
	 * @generated
	 */
  EDataType getColor();

  /**
	 * Returns the meta object for data type '{@link javax.measure.unit.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit</em>'.
	 * @see javax.measure.unit.Unit
	 * @model instanceClass="javax.measure.unit.Unit<?>"
	 * @generated
	 */
  EDataType getUnit();

  /**
	 * Returns the meta object for data type '{@link org.eclipse.jface.viewers.TreeViewer <em>Tree Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tree Viewer</em>'.
	 * @see org.eclipse.jface.viewers.TreeViewer
	 * @model instanceClass="org.eclipse.jface.viewers.TreeViewer"
	 * @generated
	 */
	EDataType getTreeViewer();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCommonEMFUIFactory getApogyCommonEMFUIFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.ui.impl.ApogyCommonEMFUIFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.ui.impl.ApogyCommonEMFUIFacadeImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.ui.impl.ApogyCommonEMFUIPackageImpl#getApogyCommonEMFUIFacade()
		 * @generated
		 */
		EClass APOGY_COMMON_EMFUI_FACADE = eINSTANCE.getApogyCommonEMFUIFacade();

			/**
		 * The meta object literal for the '<em><b>Get Color For Range</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMFUI_FACADE___GET_COLOR_FOR_RANGE__RANGES = eINSTANCE.getApogyCommonEMFUIFacade__GetColorForRange__Ranges();

			/**
		 * The meta object literal for the '<em><b>Get Display Units</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMFUI_FACADE___GET_DISPLAY_UNITS__ETYPEDELEMENT = eINSTANCE.getApogyCommonEMFUIFacade__GetDisplayUnits__ETypedElement();

				/**
		 * The meta object literal for the '<em><b>Add Expand On Double Click</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMFUI_FACADE___ADD_EXPAND_ON_DOUBLE_CLICK__TREEVIEWER = eINSTANCE.getApogyCommonEMFUIFacade__AddExpandOnDoubleClick__TreeViewer();

				/**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.swt.graphics.Color
		 * @see ca.gc.asc_csa.apogy.common.emf.ui.impl.ApogyCommonEMFUIPackageImpl#getColor()
		 * @generated
		 */
    EDataType COLOR = eINSTANCE.getColor();

    /**
		 * The meta object literal for the '<em>Unit</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see javax.measure.unit.Unit
		 * @see ca.gc.asc_csa.apogy.common.emf.ui.impl.ApogyCommonEMFUIPackageImpl#getUnit()
		 * @generated
		 */
    EDataType UNIT = eINSTANCE.getUnit();

				/**
		 * The meta object literal for the '<em>Tree Viewer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jface.viewers.TreeViewer
		 * @see ca.gc.asc_csa.apogy.common.emf.ui.impl.ApogyCommonEMFUIPackageImpl#getTreeViewer()
		 * @generated
		 */
		EDataType TREE_VIEWER = eINSTANCE.getTreeViewer();

  }

} //ApogyCommonEMFUIPackage
