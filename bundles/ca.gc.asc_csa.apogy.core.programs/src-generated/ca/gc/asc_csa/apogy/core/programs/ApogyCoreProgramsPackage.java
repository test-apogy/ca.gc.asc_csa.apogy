package ca.gc.asc_csa.apogy.core.programs;
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
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCorePrograms' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCorePrograms' modelDirectory='/ca.gc.asc_csa.apogy.core.programs/src-generated' editDirectory='/ca.gc.asc_csa.apogy.core.programs.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.core'"
 * @generated
 */
public interface ApogyCoreProgramsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "programs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.core.programs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "programs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCoreProgramsPackage eINSTANCE = ca.gc.asc_csa.apogy.core.programs.impl.ApogyCoreProgramsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.programs.impl.ApogyCoreProgramsFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.programs.impl.ApogyCoreProgramsFacadeImpl
	 * @see ca.gc.asc_csa.apogy.core.programs.impl.ApogyCoreProgramsPackageImpl#getApogyCoreProgramsFacade()
	 * @generated
	 */
	int APOGY_CORE_PROGRAMS_FACADE = 0;

	/**
	 * The feature id for the '<em><b>Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_PROGRAMS_FACADE__SESSION = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_PROGRAMS_FACADE__VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_PROGRAMS_FACADE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Exec</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_PROGRAMS_FACADE___EXEC__OPERATIONCALL = 0;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_PROGRAMS_FACADE_OPERATION_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsFacade
	 * @generated
	 */
	EClass getApogyCoreProgramsFacade();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsFacade#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Session</em>'.
	 * @see ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsFacade#getSession()
	 * @see #getApogyCoreProgramsFacade()
	 * @generated
	 */
	EReference getApogyCoreProgramsFacade_Session();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsFacade#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsFacade#getVariables()
	 * @see #getApogyCoreProgramsFacade()
	 * @generated
	 */
	EReference getApogyCoreProgramsFacade_Variables();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsFacade#exec(ca.gc.asc_csa.apogy.core.invocator.OperationCall) <em>Exec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exec</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsFacade#exec(ca.gc.asc_csa.apogy.core.invocator.OperationCall)
	 * @generated
	 */
	EOperation getApogyCoreProgramsFacade__Exec__OperationCall();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCoreProgramsFactory getApogyCoreProgramsFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.programs.impl.ApogyCoreProgramsFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.programs.impl.ApogyCoreProgramsFacadeImpl
		 * @see ca.gc.asc_csa.apogy.core.programs.impl.ApogyCoreProgramsPackageImpl#getApogyCoreProgramsFacade()
		 * @generated
		 */
		EClass APOGY_CORE_PROGRAMS_FACADE = eINSTANCE.getApogyCoreProgramsFacade();

		/**
		 * The meta object literal for the '<em><b>Session</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_CORE_PROGRAMS_FACADE__SESSION = eINSTANCE.getApogyCoreProgramsFacade_Session();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_CORE_PROGRAMS_FACADE__VARIABLES = eINSTANCE.getApogyCoreProgramsFacade_Variables();

		/**
		 * The meta object literal for the '<em><b>Exec</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_PROGRAMS_FACADE___EXEC__OPERATIONCALL = eINSTANCE.getApogyCoreProgramsFacade__Exec__OperationCall();

	}

} //ApogyCoreProgramsPackage
