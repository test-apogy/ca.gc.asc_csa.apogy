/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.ui;

import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Coordinates Set Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getPointCloud <em>Point Cloud</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getPointSize <em>Point Size</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getNumberOfPoints <em>Number Of Points</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.geometry.data3d.ui.Symphony__CommonGeometryData3DUIPackage#getCartesianCoordinatesSetPresentation()
 * @model
 * @generated
 */
public interface CartesianCoordinatesSetPresentation extends NodePresentation {
	/**
	 * Returns the value of the '<em><b>Point Cloud</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Cloud</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Cloud</em>' reference.
	 * @see #setPointCloud(CartesianCoordinatesSet)
	 * @see org.eclipse.symphony.common.geometry.data3d.ui.Symphony__CommonGeometryData3DUIPackage#getCartesianCoordinatesSetPresentation_PointCloud()
	 * @model
	 * @generated
	 */
	CartesianCoordinatesSet getPointCloud();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getPointCloud <em>Point Cloud</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Cloud</em>' reference.
	 * @see #getPointCloud()
	 * @generated
	 */
	void setPointCloud(CartesianCoordinatesSet value);

	/**
	 * Returns the value of the '<em><b>Point Size</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Size</em>' attribute.
	 * @see #setPointSize(int)
	 * @see org.eclipse.symphony.common.geometry.data3d.ui.Symphony__CommonGeometryData3DUIPackage#getCartesianCoordinatesSetPresentation_PointSize()
	 * @model default="1" unique="false"
	 * @generated
	 */
	int getPointSize();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getPointSize <em>Point Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Size</em>' attribute.
	 * @see #getPointSize()
	 * @generated
	 */
	void setPointSize(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Points</em>' attribute.
	 * @see org.eclipse.symphony.common.geometry.data3d.ui.Symphony__CommonGeometryData3DUIPackage#getCartesianCoordinatesSetPresentation_NumberOfPoints()
	 * @model unique="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	int getNumberOfPoints();

} // CartesianCoordinatesSetPresentation
