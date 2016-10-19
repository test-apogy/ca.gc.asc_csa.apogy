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
package ca.gc.asc_csa.apogy.workspace.ui;

import org.eclipse.emf.ecore.EClass;
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
 * @see ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyWorkspaceUi' childCreationExtenders='true' extensibleProviderFactory='true' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyWorkspaceUi' modelDirectory='/ca.gc.asc_csa.apogy.workspace.ui/src-generated' editDirectory='/ca.gc.asc_csa.apogy.workspace.ui/src-generated' basePackage='ca.gc.asc_csa.apogy.workspace'"
 * @generated
 */
public interface ApogyWorkspaceUiPackage extends EPackage {
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
	String eNS_URI = "ca.gc.asc_csa.apogy.workspace.ui";

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
	ApogyWorkspaceUiPackage eINSTANCE = ca.gc.asc_csa.apogy.workspace.ui.impl.ApogyWorkspaceUiPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.workspace.ui.impl.ApogyWorkspaceUiFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.workspace.ui.impl.ApogyWorkspaceUiFacadeImpl
	 * @see ca.gc.asc_csa.apogy.workspace.ui.impl.ApogyWorkspaceUiPackageImpl#getApogyWorkspaceUiFacade()
	 * @generated
	 */
	int APOGY_WORKSPACE_UI_FACADE = 0;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_UI_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>New Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_UI_FACADE___NEW_PROJECT = 0;

	/**
	 * The operation id for the '<em>Open Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_UI_FACADE___OPEN_PROJECT = 1;

	/**
	 * The operation id for the '<em>Import Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_UI_FACADE___IMPORT_PROJECT = 2;

	/**
	 * The operation id for the '<em>Export Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_UI_FACADE___EXPORT_PROJECT = 3;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_UI_FACADE_OPERATION_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiFacade
	 * @generated
	 */
	EClass getApogyWorkspaceUiFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiFacade#newProject() <em>New Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Project</em>' operation.
	 * @see ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiFacade#newProject()
	 * @generated
	 */
	EOperation getApogyWorkspaceUiFacade__NewProject();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiFacade#openProject() <em>Open Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Open Project</em>' operation.
	 * @see ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiFacade#openProject()
	 * @generated
	 */
	EOperation getApogyWorkspaceUiFacade__OpenProject();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiFacade#importProject() <em>Import Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Import Project</em>' operation.
	 * @see ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiFacade#importProject()
	 * @generated
	 */
	EOperation getApogyWorkspaceUiFacade__ImportProject();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiFacade#exportProject() <em>Export Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Export Project</em>' operation.
	 * @see ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiFacade#exportProject()
	 * @generated
	 */
	EOperation getApogyWorkspaceUiFacade__ExportProject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyWorkspaceUiFactory getApogyWorkspaceUiFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.workspace.ui.impl.ApogyWorkspaceUiFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.workspace.ui.impl.ApogyWorkspaceUiFacadeImpl
		 * @see ca.gc.asc_csa.apogy.workspace.ui.impl.ApogyWorkspaceUiPackageImpl#getApogyWorkspaceUiFacade()
		 * @generated
		 */
		EClass APOGY_WORKSPACE_UI_FACADE = eINSTANCE.getApogyWorkspaceUiFacade();
		/**
		 * The meta object literal for the '<em><b>New Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_WORKSPACE_UI_FACADE___NEW_PROJECT = eINSTANCE.getApogyWorkspaceUiFacade__NewProject();
		/**
		 * The meta object literal for the '<em><b>Open Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_WORKSPACE_UI_FACADE___OPEN_PROJECT = eINSTANCE.getApogyWorkspaceUiFacade__OpenProject();
		/**
		 * The meta object literal for the '<em><b>Import Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_WORKSPACE_UI_FACADE___IMPORT_PROJECT = eINSTANCE.getApogyWorkspaceUiFacade__ImportProject();
		/**
		 * The meta object literal for the '<em><b>Export Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_WORKSPACE_UI_FACADE___EXPORT_PROJECT = eINSTANCE.getApogyWorkspaceUiFacade__ExportProject();

	}

} //ApogyWorkspaceUiPackage
