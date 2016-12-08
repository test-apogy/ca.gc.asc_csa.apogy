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
package ca.gc.asc_csa.apogy.common.emf.ui.emfforms;

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
 * @see ca.gc.asc_csa.apogy.common.emf.ui.emfforms.ApogyCommonEMFUiEMFFormsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonEMFUiEMFForms' childCreationExtenders='true' extensibleProviderFactory='true' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCommonEMFUiEMFForms' modelDirectory='/ca.gc.asc_csa.apogy.common.emf.ui.emfforms/src-generated' editDirectory='/ca.gc.asc_csa.apogy.common.emf.ui.emfforms/src-generated' basePackage='ca.gc.asc_csa.apogy.common.emf.ui'"
 * @generated
 */
public interface ApogyCommonEMFUiEMFFormsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "emfforms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.common.emf.ui.emfforms";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "emfforms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonEMFUiEMFFormsPackage eINSTANCE = ca.gc.asc_csa.apogy.common.emf.ui.emfforms.impl.ApogyCommonEMFUiEMFFormsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.ui.emfforms.impl.ApogyCommonEMFUiEMFFormsFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.ui.emfforms.impl.ApogyCommonEMFUiEMFFormsFacadeImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.ui.emfforms.impl.ApogyCommonEMFUiEMFFormsPackageImpl#getApogyCommonEMFUiEMFFormsFacade()
	 * @generated
	 */
	int APOGY_COMMON_EMF_UI_EMF_FORMS_FACADE = 0;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_UI_EMF_FORMS_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create EMF Forms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_UI_EMF_FORMS_FACADE___CREATE_EMF_FORMS__COMPOSITE_EOBJECT = 0;

	/**
	 * The operation id for the '<em>Create EMF Forms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_UI_EMF_FORMS_FACADE___CREATE_EMF_FORMS__COMPOSITE_EOBJECT_BOOLEAN = 1;

	/**
	 * The operation id for the '<em>Create EMF Forms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_UI_EMF_FORMS_FACADE___CREATE_EMF_FORMS__COMPOSITE_EOBJECT_VVIEW = 2;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_UI_EMF_FORMS_FACADE_OPERATION_COUNT = 3;


	/**
	 * The meta object id for the '<em>Composite</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.swt.widgets.Composite
	 * @see ca.gc.asc_csa.apogy.common.emf.ui.emfforms.impl.ApogyCommonEMFUiEMFFormsPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 1;


	/**
	 * The meta object id for the '<em>VView</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.view.spi.model.VView
	 * @see ca.gc.asc_csa.apogy.common.emf.ui.emfforms.impl.ApogyCommonEMFUiEMFFormsPackageImpl#getVView()
	 * @generated
	 */
	int VVIEW = 2;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.ui.emfforms.ApogyCommonEMFUiEMFFormsFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.ui.emfforms.ApogyCommonEMFUiEMFFormsFacade
	 * @generated
	 */
	EClass getApogyCommonEMFUiEMFFormsFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ui.emfforms.ApogyCommonEMFUiEMFFormsFacade#createEMFForms(org.eclipse.swt.widgets.Composite, org.eclipse.emf.ecore.EObject) <em>Create EMF Forms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create EMF Forms</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ui.emfforms.ApogyCommonEMFUiEMFFormsFacade#createEMFForms(org.eclipse.swt.widgets.Composite, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getApogyCommonEMFUiEMFFormsFacade__CreateEMFForms__Composite_EObject();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ui.emfforms.ApogyCommonEMFUiEMFFormsFacade#createEMFForms(org.eclipse.swt.widgets.Composite, org.eclipse.emf.ecore.EObject, boolean) <em>Create EMF Forms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create EMF Forms</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ui.emfforms.ApogyCommonEMFUiEMFFormsFacade#createEMFForms(org.eclipse.swt.widgets.Composite, org.eclipse.emf.ecore.EObject, boolean)
	 * @generated
	 */
	EOperation getApogyCommonEMFUiEMFFormsFacade__CreateEMFForms__Composite_EObject_boolean();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ui.emfforms.ApogyCommonEMFUiEMFFormsFacade#createEMFForms(org.eclipse.swt.widgets.Composite, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecp.view.spi.model.VView) <em>Create EMF Forms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create EMF Forms</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ui.emfforms.ApogyCommonEMFUiEMFFormsFacade#createEMFForms(org.eclipse.swt.widgets.Composite, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecp.view.spi.model.VView)
	 * @generated
	 */
	EOperation getApogyCommonEMFUiEMFFormsFacade__CreateEMFForms__Composite_EObject_VView();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.swt.widgets.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Composite</em>'.
	 * @see org.eclipse.swt.widgets.Composite
	 * @model instanceClass="org.eclipse.swt.widgets.Composite"
	 * @generated
	 */
	EDataType getComposite();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecp.view.spi.model.VView <em>VView</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>VView</em>'.
	 * @see org.eclipse.emf.ecp.view.spi.model.VView
	 * @model instanceClass="org.eclipse.emf.ecp.view.spi.model.VView"
	 * @generated
	 */
	EDataType getVView();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCommonEMFUiEMFFormsFactory getApogyCommonEMFUiEMFFormsFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.ui.emfforms.impl.ApogyCommonEMFUiEMFFormsFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.ui.emfforms.impl.ApogyCommonEMFUiEMFFormsFacadeImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.ui.emfforms.impl.ApogyCommonEMFUiEMFFormsPackageImpl#getApogyCommonEMFUiEMFFormsFacade()
		 * @generated
		 */
		EClass APOGY_COMMON_EMF_UI_EMF_FORMS_FACADE = eINSTANCE.getApogyCommonEMFUiEMFFormsFacade();
		/**
		 * The meta object literal for the '<em><b>Create EMF Forms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_UI_EMF_FORMS_FACADE___CREATE_EMF_FORMS__COMPOSITE_EOBJECT = eINSTANCE.getApogyCommonEMFUiEMFFormsFacade__CreateEMFForms__Composite_EObject();
		/**
		 * The meta object literal for the '<em><b>Create EMF Forms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_UI_EMF_FORMS_FACADE___CREATE_EMF_FORMS__COMPOSITE_EOBJECT_BOOLEAN = eINSTANCE.getApogyCommonEMFUiEMFFormsFacade__CreateEMFForms__Composite_EObject_boolean();
		/**
		 * The meta object literal for the '<em><b>Create EMF Forms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_UI_EMF_FORMS_FACADE___CREATE_EMF_FORMS__COMPOSITE_EOBJECT_VVIEW = eINSTANCE.getApogyCommonEMFUiEMFFormsFacade__CreateEMFForms__Composite_EObject_VView();
		/**
		 * The meta object literal for the '<em>Composite</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.swt.widgets.Composite
		 * @see ca.gc.asc_csa.apogy.common.emf.ui.emfforms.impl.ApogyCommonEMFUiEMFFormsPackageImpl#getComposite()
		 * @generated
		 */
		EDataType COMPOSITE = eINSTANCE.getComposite();
		/**
		 * The meta object literal for the '<em>VView</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.view.spi.model.VView
		 * @see ca.gc.asc_csa.apogy.common.emf.ui.emfforms.impl.ApogyCommonEMFUiEMFFormsPackageImpl#getVView()
		 * @generated
		 */
		EDataType VVIEW = eINSTANCE.getVView();

	}

} //ApogyCommonEMFUiEMFFormsPackage
