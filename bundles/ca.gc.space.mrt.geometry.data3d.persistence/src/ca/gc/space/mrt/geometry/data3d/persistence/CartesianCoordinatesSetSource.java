/**
 * <copyright>
 * </copyright>
 *
 * $Id: CartesianCoordinatesSetSource.java,v 1.3.4.2 2015/05/21 15:51:05 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.persistence;

import org.eclipse.emf.ecore.EObject;

import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Coordinates Set Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.persistence.CartesianCoordinatesSetSource#getDataSet <em>Data Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data3d.persistence.PersistencePackage#getCartesianCoordinatesSetSource()
 * @model abstract="true"
 * @generated
 */
public interface CartesianCoordinatesSetSource extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set</em>' reference.
	 * @see #setDataSet(CartesianCoordinatesSet)
	 * @see ca.gc.space.mrt.geometry.data3d.persistence.PersistencePackage#getCartesianCoordinatesSetSource_DataSet()
	 * @model transient="true"
	 * @generated
	 */
	CartesianCoordinatesSet getDataSet();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.persistence.CartesianCoordinatesSetSource#getDataSet <em>Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set</em>' reference.
	 * @see #getDataSet()
	 * @generated
	 */
	void setDataSet(CartesianCoordinatesSet value);

} // CartesianCoordinatesSetSource
