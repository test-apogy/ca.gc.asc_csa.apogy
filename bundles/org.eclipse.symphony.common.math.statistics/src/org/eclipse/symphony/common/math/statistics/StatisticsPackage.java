/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.symphony.common.math.statistics;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.math.statistics.StatisticsFactory
 * @model kind="package"
 * @generated
 */
public interface StatisticsPackage extends EPackage {
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
	String eNS_URI = "http:///ca/gc/space/math/statistics.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ca.gc.space.math";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatisticsPackage eINSTANCE = org.eclipse.symphony.common.math.statistics.impl.StatisticsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.math.statistics.impl.PopulationImpl <em>Population</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.math.statistics.impl.PopulationImpl
	 * @see org.eclipse.symphony.common.math.statistics.impl.StatisticsPackageImpl#getPopulation()
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
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.math.statistics.Population <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Population</em>'.
	 * @see org.eclipse.symphony.common.math.statistics.Population
	 * @generated
	 */
	EClass getPopulation();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.symphony.common.math.statistics.Population#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data</em>'.
	 * @see org.eclipse.symphony.common.math.statistics.Population#getData()
	 * @see #getPopulation()
	 * @generated
	 */
	EAttribute getPopulation_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.math.statistics.Population#getStandardDeviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Deviation</em>'.
	 * @see org.eclipse.symphony.common.math.statistics.Population#getStandardDeviation()
	 * @see #getPopulation()
	 * @generated
	 */
	EAttribute getPopulation_StandardDeviation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.math.statistics.Population#getAverage <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average</em>'.
	 * @see org.eclipse.symphony.common.math.statistics.Population#getAverage()
	 * @see #getPopulation()
	 * @generated
	 */
	EAttribute getPopulation_Average();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.math.statistics.Population#getSum <em>Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sum</em>'.
	 * @see org.eclipse.symphony.common.math.statistics.Population#getSum()
	 * @see #getPopulation()
	 * @generated
	 */
	EAttribute getPopulation_Sum();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.math.statistics.Population#getMedian <em>Median</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Median</em>'.
	 * @see org.eclipse.symphony.common.math.statistics.Population#getMedian()
	 * @see #getPopulation()
	 * @generated
	 */
	EAttribute getPopulation_Median();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.math.statistics.Population#getSumSquared <em>Sum Squared</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sum Squared</em>'.
	 * @see org.eclipse.symphony.common.math.statistics.Population#getSumSquared()
	 * @see #getPopulation()
	 * @generated
	 */
	EAttribute getPopulation_SumSquared();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.math.statistics.Population#getVariance <em>Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variance</em>'.
	 * @see org.eclipse.symphony.common.math.statistics.Population#getVariance()
	 * @see #getPopulation()
	 * @generated
	 */
	EAttribute getPopulation_Variance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.math.statistics.Population#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.eclipse.symphony.common.math.statistics.Population#getMin()
	 * @see #getPopulation()
	 * @generated
	 */
	EAttribute getPopulation_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.math.statistics.Population#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.eclipse.symphony.common.math.statistics.Population#getMax()
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
	StatisticsFactory getStatisticsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.math.statistics.impl.PopulationImpl <em>Population</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.math.statistics.impl.PopulationImpl
		 * @see org.eclipse.symphony.common.math.statistics.impl.StatisticsPackageImpl#getPopulation()
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

} //StatisticsPackage
