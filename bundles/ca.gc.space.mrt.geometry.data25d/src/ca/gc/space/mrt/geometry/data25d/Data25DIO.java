/**
 * Canadian Space Agency 2007.
 */
package ca.gc.space.mrt.geometry.data25d;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data25 DIO</b></em>'. <!-- end-user-doc -->
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
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";
	public static final Data25DIO INSTANCE = Data25dFactory.eINSTANCE
			.createData25DIO();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException"
	 * @generated
	 */
	void saveXYZ(VolumetricCoordinatesSet25D points, String fileName)
			throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException"
	 * @generated
	 */
	VolumetricCoordinatesSet25D loadXYZ(String fileName) throws IOException;
	

} // Data25DIO
