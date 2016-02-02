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
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.statistics.Population#getData <em>Data</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.statistics.Population#getStandardDeviation <em>Standard Deviation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.statistics.Population#getAverage <em>Average</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.statistics.Population#getSum <em>Sum</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.statistics.Population#getMedian <em>Median</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.statistics.Population#getSumSquared <em>Sum Squared</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.statistics.Population#getVariance <em>Variance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.statistics.Population#getMin <em>Min</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.statistics.Population#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.math.statistics.ApogyCommonMathStatisticsPackage#getPopulation()
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
	 * @see ca.gc.asc_csa.apogy.common.math.statistics.ApogyCommonMathStatisticsPackage#getPopulation_Data()
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
	 * @see ca.gc.asc_csa.apogy.common.math.statistics.ApogyCommonMathStatisticsPackage#getPopulation_StandardDeviation()
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
	 * @see ca.gc.asc_csa.apogy.common.math.statistics.ApogyCommonMathStatisticsPackage#getPopulation_Average()
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
	 * @see ca.gc.asc_csa.apogy.common.math.statistics.ApogyCommonMathStatisticsPackage#getPopulation_Sum()
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
	 * @see ca.gc.asc_csa.apogy.common.math.statistics.ApogyCommonMathStatisticsPackage#getPopulation_Median()
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
	 * @see ca.gc.asc_csa.apogy.common.math.statistics.ApogyCommonMathStatisticsPackage#getPopulation_SumSquared()
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
	 * @see ca.gc.asc_csa.apogy.common.math.statistics.ApogyCommonMathStatisticsPackage#getPopulation_Variance()
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
	 * @see ca.gc.asc_csa.apogy.common.math.statistics.ApogyCommonMathStatisticsPackage#getPopulation_Min()
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
	 * @see ca.gc.asc_csa.apogy.common.math.statistics.ApogyCommonMathStatisticsPackage#getPopulation_Max()
	 * @model default="0.0" unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getMax();

} // Population
