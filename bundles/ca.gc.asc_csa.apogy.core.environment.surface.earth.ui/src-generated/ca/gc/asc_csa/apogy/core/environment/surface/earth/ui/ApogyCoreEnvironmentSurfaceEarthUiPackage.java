/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.core.environment.surface.earth.ui;

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
 *     Pierre Allard (Pierre.Allard@canada.ca),
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.core.environment.surface.earth.ui.ApogyCoreEnvironmentSurfaceEarthUiFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCoreEnvironmentSurfaceEarthUi' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCoreEnvironmentSurfaceEarthUi' complianceLevel='8.0' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/ca.gc.asc_csa.apogy.core.environment.surface.earth.ui/src-generated' editDirectory='/ca.gc.asc_csa.apogy.core.environment.surface.earth.ui/src-generated' basePackage='ca.gc.asc_csa.apogy.core.environment.surface.earth'"
 * @generated
 */
public interface ApogyCoreEnvironmentSurfaceEarthUiPackage extends EPackage {
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
	String eNS_URI = "ca.gc.asc_csa.apogy.core.environment.surface.earth.ui";

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
	ApogyCoreEnvironmentSurfaceEarthUiPackage eINSTANCE = ca.gc.asc_csa.apogy.core.environment.surface.earth.ui.impl.ApogyCoreEnvironmentSurfaceEarthUiPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.earth.ui.impl.ApogyCoreEnvironmentSurfaceEarthUiFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.earth.ui.impl.ApogyCoreEnvironmentSurfaceEarthUiFacadeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.earth.ui.impl.ApogyCoreEnvironmentSurfaceEarthUiPackageImpl#getApogyCoreEnvironmentSurfaceEarthUiFacade()
	 * @generated
	 */
	int APOGY_CORE_ENVIRONMENT_SURFACE_EARTH_UI_FACADE = 0;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_SURFACE_EARTH_UI_FACADE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_SURFACE_EARTH_UI_FACADE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.earth.ui.ApogyCoreEnvironmentSurfaceEarthUiFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.earth.ui.ApogyCoreEnvironmentSurfaceEarthUiFacade
	 * @generated
	 */
	EClass getApogyCoreEnvironmentSurfaceEarthUiFacade();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCoreEnvironmentSurfaceEarthUiFactory getApogyCoreEnvironmentSurfaceEarthUiFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.earth.ui.impl.ApogyCoreEnvironmentSurfaceEarthUiFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.earth.ui.impl.ApogyCoreEnvironmentSurfaceEarthUiFacadeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.earth.ui.impl.ApogyCoreEnvironmentSurfaceEarthUiPackageImpl#getApogyCoreEnvironmentSurfaceEarthUiFacade()
		 * @generated
		 */
		EClass APOGY_CORE_ENVIRONMENT_SURFACE_EARTH_UI_FACADE = eINSTANCE.getApogyCoreEnvironmentSurfaceEarthUiFacade();

	}

} //ApogyCoreEnvironmentSurfaceEarthUiPackage
