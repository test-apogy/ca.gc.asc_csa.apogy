/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data25d.ui;

import ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricCoordinatesSet25D;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volumetric Coordinates Set25 DPresentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data25d.ui.VolumetricCoordinatesSet25DPresentation#getPointsCloud <em>Points Cloud</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.ui.ApogyCommonGeometryData25DUIPackage#getVolumetricCoordinatesSet25DPresentation()
 * @model
 * @generated
 */
public interface VolumetricCoordinatesSet25DPresentation extends NodePresentation {
	/**
	 * Returns the value of the '<em><b>Points Cloud</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points Cloud</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points Cloud</em>' reference.
	 * @see #setPointsCloud(VolumetricCoordinatesSet25D)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.ui.ApogyCommonGeometryData25DUIPackage#getVolumetricCoordinatesSet25DPresentation_PointsCloud()
	 * @model
	 * @generated
	 */
	VolumetricCoordinatesSet25D getPointsCloud();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.ui.VolumetricCoordinatesSet25DPresentation#getPointsCloud <em>Points Cloud</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points Cloud</em>' reference.
	 * @see #getPointsCloud()
	 * @generated
	 */
	void setPointsCloud(VolumetricCoordinatesSet25D value);

} // VolumetricCoordinatesSet25DPresentation
