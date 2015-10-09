/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.symphony.common.geometry.data3d.las;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>LAS Facade</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASFacade()
 * @model
 * @generated
 */
public interface LASFacade extends EObject {

	public static final LASFacade INSTANCE = LasFactory.eINSTANCE
			.createLASFacade();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.symphony.common.geometry.data3d.las.IOException"
	 * @generated
	 */
	LASPoint createPoint(int formatID, byte[] data) throws IOException;

} // LASFacade
