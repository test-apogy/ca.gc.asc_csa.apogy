/**
 * <copyright>
 * </copyright>
 *
 * $Id: FileCartesianCoordinatesSetSource.java,v 1.2.4.2 2015/05/21 15:51:05 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.persistence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Cartesian Coordinates Set Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.persistence.FileCartesianCoordinatesSetSource#getFileName <em>File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data3d.persistence.PersistencePackage#getFileCartesianCoordinatesSetSource()
 * @model
 * @generated
 */
public interface FileCartesianCoordinatesSetSource extends CartesianCoordinatesSetSource {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see ca.gc.space.mrt.geometry.data3d.persistence.PersistencePackage#getFileCartesianCoordinatesSetSource_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.persistence.FileCartesianCoordinatesSetSource#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

} // FileCartesianCoordinatesSetSource
