/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.data25d;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.geometry.data25d.Data25dPackage#getData25DIO()
 * @model
 * @generated
 */
public interface Data25DIO extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data25d.IOException" pointsUnique="false" fileNameUnique="false"
	 * @generated
	 */
	void saveXYZ(VolumetricCoordinatesSet25D points, String fileName) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="ca.gc.space.mrt.geometry.data25d.IOException" fileNameUnique="false"
	 * @generated
	 */
	VolumetricCoordinatesSet25D loadXYZ(String fileName) throws IOException;

} // Data25DIO
