/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.symphony.common.math.statistics;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Population</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.math.statistics.Population#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.math.statistics.Population#getStandardDeviation <em>Standard Deviation</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.math.statistics.Population#getAverage <em>Average</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.math.statistics.Population#getSum <em>Sum</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.math.statistics.Population#getMedian <em>Median</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.math.statistics.Population#getSumSquared <em>Sum Squared</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.math.statistics.Population#getVariance <em>Variance</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.math.statistics.Population#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.math.statistics.Population#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.math.statistics.StatisticsPackage#getPopulation()
 * @model
 * @generated
 */
public interface Population extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute list.
	 * @see org.eclipse.symphony.common.math.statistics.StatisticsPackage#getPopulation_Data()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getData();

	/**
	 * Returns the value of the '<em><b>Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Deviation</em>' attribute.
	 * @see org.eclipse.symphony.common.math.statistics.StatisticsPackage#getPopulation_StandardDeviation()
	 * @model unique="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	double getStandardDeviation();

	/**
	 * Returns the value of the '<em><b>Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average</em>' attribute.
	 * @see org.eclipse.symphony.common.math.statistics.StatisticsPackage#getPopulation_Average()
	 * @model unique="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	double getAverage();

	/**
	 * Returns the value of the '<em><b>Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sum</em>' attribute.
	 * @see org.eclipse.symphony.common.math.statistics.StatisticsPackage#getPopulation_Sum()
	 * @model unique="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	double getSum();

	/**
	 * Returns the value of the '<em><b>Median</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Median</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Median</em>' attribute.
	 * @see org.eclipse.symphony.common.math.statistics.StatisticsPackage#getPopulation_Median()
	 * @model unique="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	double getMedian();

	/**
	 * Returns the value of the '<em><b>Sum Squared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sum Squared</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sum Squared</em>' attribute.
	 * @see org.eclipse.symphony.common.math.statistics.StatisticsPackage#getPopulation_SumSquared()
	 * @model unique="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	double getSumSquared();

	/**
	 * Returns the value of the '<em><b>Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variance</em>' attribute.
	 * @see org.eclipse.symphony.common.math.statistics.StatisticsPackage#getPopulation_Variance()
	 * @model unique="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	double getVariance();

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see org.eclipse.symphony.common.math.statistics.StatisticsPackage#getPopulation_Min()
	 * @model default="0.0" unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getMin();

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see org.eclipse.symphony.common.math.statistics.StatisticsPackage#getPopulation_Max()
	 * @model default="0.0" unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getMax();

} // Population
