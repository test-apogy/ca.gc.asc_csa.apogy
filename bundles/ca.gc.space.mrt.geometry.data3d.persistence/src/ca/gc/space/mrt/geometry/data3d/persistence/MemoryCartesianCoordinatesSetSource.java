/**
 * <copyright>
 * </copyright>
 *
 * $Id: MemoryCartesianCoordinatesSetSource.java,v 1.2.4.2 2015/05/21 15:51:05 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.persistence;

import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Cartesian Coordinates Set Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.persistence.MemoryCartesianCoordinatesSetSource#getInternalDataSet <em>Internal Data Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data3d.persistence.PersistencePackage#getMemoryCartesianCoordinatesSetSource()
 * @model
 * @generated
 */
public interface MemoryCartesianCoordinatesSetSource extends CartesianCoordinatesSetSource {
	/**
	 * Returns the value of the '<em><b>Internal Data Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Data Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Data Set</em>' containment reference.
	 * @see #setInternalDataSet(CartesianCoordinatesSet)
	 * @see ca.gc.space.mrt.geometry.data3d.persistence.PersistencePackage#getMemoryCartesianCoordinatesSetSource_InternalDataSet()
	 * @model containment="true"
	 * @generated
	 */
	CartesianCoordinatesSet getInternalDataSet();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.persistence.MemoryCartesianCoordinatesSetSource#getInternalDataSet <em>Internal Data Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Data Set</em>' containment reference.
	 * @see #getInternalDataSet()
	 * @generated
	 */
	void setInternalDataSet(CartesianCoordinatesSet value);

} // MemoryCartesianCoordinatesSetSource
