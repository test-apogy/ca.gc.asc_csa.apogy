/**
 * Canadian Space Agency 2007.
 *
 * $Id: PoseFacade.java,v 1.3.4.2 2015/05/21 15:51:31 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.pose;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.addons.sensors.pose.PosePackage#getPoseFacade()
 * @model
 * @generated
 */
public interface PoseFacade extends EObject {

	public static final PoseFacade INSTANCE = PoseFactory.eINSTANCE
			.createPoseFacade();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSVDataLogger createCSVDataLogger(String fileName);

} // PoseFacade
