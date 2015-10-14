/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.las;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.geometry.data3d.las.impl.LASFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LAS Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASFacade()
 * @model
 * @generated
 */
public interface LASFacade extends EObject {

	public static final LASFacade INSTANCE = LASFacadeImpl.getInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="org.eclipse.symphony.common.geometry.data3d.las.IOException" formatIDUnique="false" dataUnique="false"
	 * @generated
	 */
	LASPoint createPoint(int formatID, byte[] data) throws IOException;

} // LASFacade
