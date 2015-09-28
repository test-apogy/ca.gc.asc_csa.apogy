/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimFacade.java,v 1.2.4.2 2015/05/21 15:50:11 pallard Exp $
 */
package ca.gc.space.mrt.sensors.gps.sim;

import org.eclipse.emf.ecore.EObject;

import ca.gc.space.mrt.geometry.data3d.PositionMarker;
import ca.gc.space.mrt.sensors.gps.MarkedGPS;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.sensors.gps.sim.SimPackage#getSimFacade()
 * @model
 * @generated
 */
public interface SimFacade extends EObject {

	public static final SimFacade INSTANCE = SimFactory.eINSTANCE
			.createSimFacade();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	MarkedGPS createSimulatedGPS(double initialLatitude,
			double initialLongitude, PositionMarker marker);

} // SimFacade
