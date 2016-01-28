/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.las;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.geometry.data3d.las.impl.Symphony__CommonGeometryData3DLASFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LAS Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.common.geometry.data3d.las.Symphony__CommonGeometryData3DLASPackage#getSymphony__CommonGeometryData3DLASFacade()
 * @model
 * @generated
 */
public interface Symphony__CommonGeometryData3DLASFacade extends EObject {

	public static final Symphony__CommonGeometryData3DLASFacade INSTANCE = Symphony__CommonGeometryData3DLASFacadeImpl.getInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="org.eclipse.symphony.common.geometry.data3d.las.IOException" formatIDUnique="false" dataUnique="false"
	 * @generated
	 */
	LASPoint createPoint(int formatID, byte[] data) throws IOException;

} // Symphony__CommonGeometryData3DLASFacade
