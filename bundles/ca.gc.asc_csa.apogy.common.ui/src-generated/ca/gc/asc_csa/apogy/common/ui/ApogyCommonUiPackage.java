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
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonUi' childCreationExtenders='true' extensibleProviderFactory='true' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCommonUi' modelDirectory='/ca.gc.asc_csa.apogy.common.ui/src-generated' editDirectory='/ca.gc.asc_csa.apogy.common.ui/src-generated' basePackage='ca.gc.asc_csa.apogy.common'"
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
	 * The operation id for the '<em>Adjust Wizard Page</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_UI_FACADE___ADJUST_WIZARD_PAGE__WIZARDPAGE_DOUBLE = 1;

	/**
	 * The operation id for the '<em>Add Expand On Double Click</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_UI_FACADE___ADD_EXPAND_ON_DOUBLE_CLICK__TREEVIEWER = 2;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_UI_FACADE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '<em>Image Descriptor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jface.resource.ImageDescriptor
	 * @see ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiPackageImpl#getImageDescriptor()
	 * @generated
	 */
	int IMAGE_DESCRIPTOR = 1;


	/**
	 * The meta object id for the '<em>ISelection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jface.viewers.ISelection
	 * @see ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiPackageImpl#getISelection()
	 * @generated
	 */
	int ISELECTION = 2;


	/**
	 * The meta object id for the '<em>Wizard Page</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jface.wizard.WizardPage
	 * @see ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiPackageImpl#getWizardPage()
	 * @generated
	 */
	int WIZARD_PAGE = 3;


	/**
	 * The meta object id for the '<em>Tree Viewer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jface.viewers.TreeViewer
	 * @see ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiPackageImpl#getTreeViewer()
	 * @generated
	 */
	int TREE_VIEWER = 4;


	/**
	 * The meta object id for the '<em>Display</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.swt.widgets.Display
	 * @see ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiPackageImpl#getDisplay()
	 * @generated
	 */
	int DISPLAY = 5;


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
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade#adjustWizardPage(org.eclipse.jface.wizard.WizardPage, java.lang.Double) <em>Adjust Wizard Page</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Adjust Wizard Page</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade#adjustWizardPage(org.eclipse.jface.wizard.WizardPage, java.lang.Double)
	 * @generated
	 */
	EOperation getApogyCommonUiFacade__AdjustWizardPage__WizardPage_Double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade#addExpandOnDoubleClick(org.eclipse.jface.viewers.TreeViewer) <em>Add Expand On Double Click</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Expand On Double Click</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade#addExpandOnDoubleClick(org.eclipse.jface.viewers.TreeViewer)
	 * @generated
	 */
	EOperation getApogyCommonUiFacade__AddExpandOnDoubleClick__TreeViewer();

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
	 * Returns the meta object for data type '{@link org.eclipse.jface.wizard.WizardPage <em>Wizard Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Wizard Page</em>'.
	 * @see org.eclipse.jface.wizard.WizardPage
	 * @model instanceClass="org.eclipse.jface.wizard.WizardPage"
	 * @generated
	 */
	EDataType getWizardPage();

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
	 * Returns the meta object for data type '{@link org.eclipse.swt.widgets.Display <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Display</em>'.
	 * @see org.eclipse.swt.widgets.Display
	 * @model instanceClass="org.eclipse.swt.widgets.Display"
	 * @generated
	 */
	EDataType getDisplay();

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
		 * The meta object literal for the '<em><b>Adjust Wizard Page</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_UI_FACADE___ADJUST_WIZARD_PAGE__WIZARDPAGE_DOUBLE = eINSTANCE.getApogyCommonUiFacade__AdjustWizardPage__WizardPage_Double();

		/**
		 * The meta object literal for the '<em><b>Add Expand On Double Click</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_UI_FACADE___ADD_EXPAND_ON_DOUBLE_CLICK__TREEVIEWER = eINSTANCE.getApogyCommonUiFacade__AddExpandOnDoubleClick__TreeViewer();

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

		/**
		 * The meta object literal for the '<em>Wizard Page</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jface.wizard.WizardPage
		 * @see ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiPackageImpl#getWizardPage()
		 * @generated
		 */
		EDataType WIZARD_PAGE = eINSTANCE.getWizardPage();

		/**
		 * The meta object literal for the '<em>Tree Viewer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jface.viewers.TreeViewer
		 * @see ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiPackageImpl#getTreeViewer()
		 * @generated
		 */
		EDataType TREE_VIEWER = eINSTANCE.getTreeViewer();

		/**
		 * The meta object literal for the '<em>Display</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.swt.widgets.Display
		 * @see ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiPackageImpl#getDisplay()
		 * @generated
		 */
		EDataType DISPLAY = eINSTANCE.getDisplay();

	}

} //ApogyCommonUiPackage
