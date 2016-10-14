/**
 * Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.programs.javascript;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 *     Steve Monnier (steve.monnier@obeo.fr),
 *     OBEO - Initial API and implementation
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.core.programs.javascript.ApogyCoreJavaScriptProgramsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCoreJavaScriptPrograms' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)' modelName='ApogyCoreJavaScriptPrograms' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.asc_csa.apogy.core.programs.javascript/src-generated' editDirectory='/ca.gc.asc_csa.apogy.core.programs.javascript.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.core.programs'"
 * @generated
 */
public interface ApogyCoreJavaScriptProgramsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "javascript";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.core.programs.javascript";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "javascript";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCoreJavaScriptProgramsPackage eINSTANCE = ca.gc.asc_csa.apogy.core.programs.javascript.impl.ApogyCoreJavaScriptProgramsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.programs.javascript.impl.JavaScriptProgramImpl <em>Java Script Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.programs.javascript.impl.JavaScriptProgramImpl
	 * @see ca.gc.asc_csa.apogy.core.programs.javascript.impl.ApogyCoreJavaScriptProgramsPackageImpl#getJavaScriptProgram()
	 * @generated
	 */
	int JAVA_SCRIPT_PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_PROGRAM__NAME = ApogyCoreInvocatorPackage.SCRIPT_BASED_PROGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_PROGRAM__DESCRIPTION = ApogyCoreInvocatorPackage.SCRIPT_BASED_PROGRAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Archived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_PROGRAM__ARCHIVED = ApogyCoreInvocatorPackage.SCRIPT_BASED_PROGRAM__ARCHIVED;

	/**
	 * The feature id for the '<em><b>Programs Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_PROGRAM__PROGRAMS_GROUP = ApogyCoreInvocatorPackage.SCRIPT_BASED_PROGRAM__PROGRAMS_GROUP;

	/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_PROGRAM__INVOCATOR_SESSION = ApogyCoreInvocatorPackage.SCRIPT_BASED_PROGRAM__INVOCATOR_SESSION;

	/**
	 * The feature id for the '<em><b>Operation Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_PROGRAM__OPERATION_CALLS = ApogyCoreInvocatorPackage.SCRIPT_BASED_PROGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_PROGRAM__SCRIPT_PATH = ApogyCoreInvocatorPackage.SCRIPT_BASED_PROGRAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Java Script Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_PROGRAM_FEATURE_COUNT = ApogyCoreInvocatorPackage.SCRIPT_BASED_PROGRAM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Invocator Session</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_PROGRAM___GET_INVOCATOR_SESSION = ApogyCoreInvocatorPackage.SCRIPT_BASED_PROGRAM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Java Script Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_PROGRAM_OPERATION_COUNT = ApogyCoreInvocatorPackage.SCRIPT_BASED_PROGRAM_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.programs.javascript.JavaScriptProgram <em>Java Script Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Script Program</em>'.
	 * @see ca.gc.asc_csa.apogy.core.programs.javascript.JavaScriptProgram
	 * @generated
	 */
	EClass getJavaScriptProgram();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.programs.javascript.JavaScriptProgram#getScriptPath <em>Script Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Path</em>'.
	 * @see ca.gc.asc_csa.apogy.core.programs.javascript.JavaScriptProgram#getScriptPath()
	 * @see #getJavaScriptProgram()
	 * @generated
	 */
	EAttribute getJavaScriptProgram_ScriptPath();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCoreJavaScriptProgramsFactory getApogyCoreJavaScriptProgramsFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.programs.javascript.impl.JavaScriptProgramImpl <em>Java Script Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.programs.javascript.impl.JavaScriptProgramImpl
		 * @see ca.gc.asc_csa.apogy.core.programs.javascript.impl.ApogyCoreJavaScriptProgramsPackageImpl#getJavaScriptProgram()
		 * @generated
		 */
		EClass JAVA_SCRIPT_PROGRAM = eINSTANCE.getJavaScriptProgram();

		/**
		 * The meta object literal for the '<em><b>Script Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_SCRIPT_PROGRAM__SCRIPT_PATH = eINSTANCE.getJavaScriptProgram_ScriptPath();

	}

} //ApogyCoreJavaScriptProgramsPackage
