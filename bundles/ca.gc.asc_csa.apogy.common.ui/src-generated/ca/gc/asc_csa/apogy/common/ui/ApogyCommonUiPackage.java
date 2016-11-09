/**
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
package ca.gc.asc_csa.apogy.common.ui;

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
 * @see ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonUi' childCreationExtenders='true' extensibleProviderFactory='true' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyWorkspaceUi' modelDirectory='/ca.gc.asc_csa.apogy.common.ui/src-generated' editDirectory='/ca.gc.asc_csa.apogy.common.ui/src-generated' basePackage='ca.gc.asc_csa.apogy.common'"
 * @generated
 */
public interface ApogyCommonUiPackage extends EPackage {
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
	String eNS_URI = "ca.gc.asc_csa.apogy.common.ui";

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
	ApogyCommonUiPackage eINSTANCE = ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiFacadeImpl
	 * @see ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiPackageImpl#getApogyCommonUiFacade()
	 * @generated
	 */
	int APOGY_COMMON_UI_FACADE = 0;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_UI_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Image Descriptor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_UI_FACADE___GET_IMAGE_DESCRIPTOR__STRING = 0;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_UI_FACADE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.ui.impl.ApogySelectionImpl <em>Apogy Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.ui.impl.ApogySelectionImpl
	 * @see ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiPackageImpl#getApogySelection()
	 * @generated
	 */
	int APOGY_SELECTION = 1;

	/**
	 * The number of structural features of the '<em>Apogy Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SELECTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Apogy Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SELECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Image Descriptor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jface.resource.ImageDescriptor
	 * @see ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiPackageImpl#getImageDescriptor()
	 * @generated
	 */
	int IMAGE_DESCRIPTOR = 2;


	/**
	 * The meta object id for the '<em>ISelection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jface.viewers.ISelection
	 * @see ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiPackageImpl#getISelection()
	 * @generated
	 */
	int ISELECTION = 3;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade
	 * @generated
	 */
	EClass getApogyCommonUiFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade#getImageDescriptor(java.lang.String) <em>Get Image Descriptor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Image Descriptor</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade#getImageDescriptor(java.lang.String)
	 * @generated
	 */
	EOperation getApogyCommonUiFacade__GetImageDescriptor__String();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.ui.ApogySelection <em>Apogy Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apogy Selection</em>'.
	 * @see ca.gc.asc_csa.apogy.common.ui.ApogySelection
	 * @generated
	 */
	EClass getApogySelection();

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
	ApogyCommonUiFactory getApogyCommonUiFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiFacadeImpl
		 * @see ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiPackageImpl#getApogyCommonUiFacade()
		 * @generated
		 */
		EClass APOGY_COMMON_UI_FACADE = eINSTANCE.getApogyCommonUiFacade();

		/**
		 * The meta object literal for the '<em><b>Get Image Descriptor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_UI_FACADE___GET_IMAGE_DESCRIPTOR__STRING = eINSTANCE.getApogyCommonUiFacade__GetImageDescriptor__String();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.ui.impl.ApogySelectionImpl <em>Apogy Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.ui.impl.ApogySelectionImpl
		 * @see ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiPackageImpl#getApogySelection()
		 * @generated
		 */
		EClass APOGY_SELECTION = eINSTANCE.getApogySelection();

		/**
		 * The meta object literal for the '<em>Image Descriptor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jface.resource.ImageDescriptor
		 * @see ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiPackageImpl#getImageDescriptor()
		 * @generated
		 */
		EDataType IMAGE_DESCRIPTOR = eINSTANCE.getImageDescriptor();

		/**
		 * The meta object literal for the '<em>ISelection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jface.viewers.ISelection
		 * @see ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiPackageImpl#getISelection()
		 * @generated
		 */
		EDataType ISELECTION = eINSTANCE.getISelection();

	}

} //ApogyCommonUiPackage
