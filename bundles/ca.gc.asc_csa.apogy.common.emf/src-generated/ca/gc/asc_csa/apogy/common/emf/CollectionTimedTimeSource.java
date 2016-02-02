package ca.gc.asc_csa.apogy.common.emf;
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

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Timed Time Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Time source that is based on a list of Timed elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#isLoopEnable <em>Loop Enable</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#getTimedsList <em>Timeds List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#getCurrentTimedElement <em>Current Timed Element</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#getEarliestDate <em>Earliest Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#getLatestDate <em>Latest Date</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getCollectionTimedTimeSource()
 * @model
 * @generated
 */
public interface CollectionTimedTimeSource extends BrowseableTimeSource {
	/**
	 * Returns the value of the '<em><b>Loop Enable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not to enable time looping when end of list of time is reached.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop Enable</em>' attribute.
	 * @see #setLoopEnable(boolean)
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getCollectionTimedTimeSource_LoopEnable()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isLoopEnable();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#isLoopEnable <em>Loop Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Enable</em>' attribute.
	 * @see #isLoopEnable()
	 * @generated
	 */
	void setLoopEnable(boolean value);

	/**
	 * Returns the value of the '<em><b>Timeds List</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.common.emf.Timed}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The collection of Timed elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeds List</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getCollectionTimedTimeSource_TimedsList()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	EList<Timed> getTimedsList();

	/**
	 * Returns the value of the '<em><b>Current Timed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current Timed element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Timed Element</em>' reference.
	 * @see #setCurrentTimedElement(Timed)
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getCollectionTimedTimeSource_CurrentTimedElement()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly'"
	 * @generated
	 */
	Timed getCurrentTimedElement();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#getCurrentTimedElement <em>Current Timed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Timed Element</em>' reference.
	 * @see #getCurrentTimedElement()
	 * @generated
	 */
	void setCurrentTimedElement(Timed value);

	/**
	 * Returns the value of the '<em><b>Earliest Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The earliest date found in the collection of Timed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Earliest Date</em>' attribute.
	 * @see #setEarliestDate(Date)
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getCollectionTimedTimeSource_EarliestDate()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly'"
	 * @generated
	 */
	Date getEarliestDate();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#getEarliestDate <em>Earliest Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Earliest Date</em>' attribute.
	 * @see #getEarliestDate()
	 * @generated
	 */
	void setEarliestDate(Date value);

	/**
	 * Returns the value of the '<em><b>Latest Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The latest date found in the collection of Timed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latest Date</em>' attribute.
	 * @see #setLatestDate(Date)
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getCollectionTimedTimeSource_LatestDate()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly'"
	 * @generated
	 */
	Date getLatestDate();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#getLatestDate <em>Latest Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Date</em>' attribute.
	 * @see #getLatestDate()
	 * @generated
	 */
	void setLatestDate(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Jumps to the next Timed element.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void jumpToNext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 *  Jumps to the previous Timed element.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void jumpToPrevious();

} // CollectionTimedTimeSource
