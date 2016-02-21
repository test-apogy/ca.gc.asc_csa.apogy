package ca.gc.asc_csa.apogy.common.math.statistics;
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
 * @see ca.gc.asc_csa.apogy.common.math.statistics.ApogyCommonMathStatisticsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonMathStatistics' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCommonMathStatistics' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.asc_csa.apogy.common.math.statistics/src-generated' basePackage='ca.gc.asc_csa.apogy.common.math'"
 * @generated
 */
public interface ApogyCommonMathStatisticsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "statistics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.common.math.statistics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "statistics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonMathStatisticsPackage eINSTANCE = ca.gc.asc_csa.apogy.common.math.statistics.impl.ApogyCommonMathStatisticsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.math.statistics.impl.PopulationImpl <em>Population</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.math.statistics.impl.PopulationImpl
	 * @see ca.gc.asc_csa.apogy.common.math.statistics.impl.ApogyCommonMathStatisticsPackageImpl#getPopulation()
	 * @generated
	 */
	int POPULATION = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__DATA = 0;

	/**
	 * The feature id for the '<em><b>Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__STANDARD_DEVIATION = 1;

	/**
	 * The feature id for the '<em><b>Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__AVERAGE = 2;

	/**
	 * The feature id for the '<em><b>Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__SUM = 3;

	/**
	 * The feature id for the '<em><b>Median</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__MEDIAN = 4;

	/**
	 * The feature id for the '<em><b>Sum Squared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__SUM_SQUARED = 5;

	/**
	 * The feature id for the '<em><b>Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__VARIANCE = 6;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__MIN = 7;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__MAX = 8;

	/**
	 * The number of structural features of the '<em>Population</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Population</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.math.statistics.Population <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Population</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.statistics.Population
	 * @generated
	 */
	EClass getPopulation();

	/**
	 * Returns the meta object for the attribute list '{@link ca.gc.asc_csa.apogy.common.math.statistics.Population#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.statistics.Population#getData()
	 * @see #getPopulation()
	 * @generated
	 */
	EAttribute getPopulation_Data();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.statistics.Population#getStandardDeviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Deviation</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.statistics.Population#getStandardDeviation()
	 * @see #getPopulation()
	 * @generated
	 */
	EAttribute getPopulation_StandardDeviation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.statistics.Population#getAverage <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.statistics.Population#getAverage()
	 * @see #getPopulation()
	 * @generated
	 */
	EAttribute getPopulation_Average();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.statistics.Population#getSum <em>Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sum</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.statistics.Population#getSum()
	 * @see #getPopulation()
	 * @generated
	 */
	EAttribute getPopulation_Sum();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.statistics.Population#getMedian <em>Median</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Median</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.statistics.Population#getMedian()
	 * @see #getPopulation()
	 * @generated
	 */
	EAttribute getPopulation_Median();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.statistics.Population#getSumSquared <em>Sum Squared</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sum Squared</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.statistics.Population#getSumSquared()
	 * @see #getPopulation()
	 * @generated
	 */
	EAttribute getPopulation_SumSquared();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.statistics.Population#getVariance <em>Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variance</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.statistics.Population#getVariance()
	 * @see #getPopulation()
	 * @generated
	 */
	EAttribute getPopulation_Variance();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.statistics.Population#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.statistics.Population#getMin()
	 * @see #getPopulation()
	 * @generated
	 */
	EAttribute getPopulation_Min();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.statistics.Population#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.statistics.Population#getMax()
	 * @see #getPopulation()
	 * @generated
	 */
	EAttribute getPopulation_Max();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCommonMathStatisticsFactory getApogyCommonMathStatisticsFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.math.statistics.impl.PopulationImpl <em>Population</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.math.statistics.impl.PopulationImpl
		 * @see ca.gc.asc_csa.apogy.common.math.statistics.impl.ApogyCommonMathStatisticsPackageImpl#getPopulation()
		 * @generated
		 */
		EClass POPULATION = eINSTANCE.getPopulation();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPULATION__DATA = eINSTANCE.getPopulation_Data();

		/**
		 * The meta object literal for the '<em><b>Standard Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPULATION__STANDARD_DEVIATION = eINSTANCE.getPopulation_StandardDeviation();

		/**
		 * The meta object literal for the '<em><b>Average</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPULATION__AVERAGE = eINSTANCE.getPopulation_Average();

		/**
		 * The meta object literal for the '<em><b>Sum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPULATION__SUM = eINSTANCE.getPopulation_Sum();

		/**
		 * The meta object literal for the '<em><b>Median</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPULATION__MEDIAN = eINSTANCE.getPopulation_Median();

		/**
		 * The meta object literal for the '<em><b>Sum Squared</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPULATION__SUM_SQUARED = eINSTANCE.getPopulation_SumSquared();

		/**
		 * The meta object literal for the '<em><b>Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPULATION__VARIANCE = eINSTANCE.getPopulation_Variance();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPULATION__MIN = eINSTANCE.getPopulation_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPULATION__MAX = eINSTANCE.getPopulation_Max();

	}

} //ApogyCommonMathStatisticsPackage
