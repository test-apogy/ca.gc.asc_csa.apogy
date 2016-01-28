/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.las;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.geometry.data3d.las.impl.ApogyCommonGeometryData3DLASFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LAS Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getApogyCommonGeometryData3DLASFacade()
 * @model
 * @generated
 */
public interface ApogyCommonGeometryData3DLASFacade extends EObject {

	public static final ApogyCommonGeometryData3DLASFacade INSTANCE = ApogyCommonGeometryData3DLASFacadeImpl.getInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.las.IOException" formatIDUnique="false" dataUnique="false"
	 * @generated
	 */
	LASPoint createPoint(int formatID, byte[] data) throws IOException;

} // ApogyCommonGeometryData3DLASFacade
