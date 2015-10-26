/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle;

import java.util.List;
import java.util.Map;

import javax.vecmath.Point3d;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.topology.addons.dynamics.PhysicalBody;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.ContactProvider#getVehiclePoseCorrector <em>Vehicle Pose Corrector</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage#getContactProvider()
 * @model abstract="true"
 * @generated
 */
public interface ContactProvider extends EObject
{
  /**
	 * Returns the value of the '<em><b>Vehicle Pose Corrector</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector#getContactProvider <em>Contact Provider</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vehicle Pose Corrector</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Pose Corrector</em>' container reference.
	 * @see #setVehiclePoseCorrector(VehiclePoseCorrector)
	 * @see org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage#getContactProvider_VehiclePoseCorrector()
	 * @see org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector#getContactProvider
	 * @model opposite="contactProvider" transient="false"
	 * @generated
	 */
  VehiclePoseCorrector getVehiclePoseCorrector();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.ContactProvider#getVehiclePoseCorrector <em>Vehicle Pose Corrector</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Pose Corrector</em>' container reference.
	 * @see #getVehiclePoseCorrector()
	 * @generated
	 */
  void setVehiclePoseCorrector(VehiclePoseCorrector value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.addons.vehicle.List<org.eclipse.symphony.common.topology.addons.dynamics.PhysicalBody>" unique="false" many="false"
	 * @generated
	 */
  List<PhysicalBody> extractContactBodies();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model originalPoseUnique="false" bodyToContactsMapDataType="org.eclipse.symphony.addons.vehicle.Map<org.eclipse.symphony.common.topology.addons.dynamics.PhysicalBody, org.eclipse.symphony.addons.vehicle.Point3d>" bodyToContactsMapUnique="false"
	 * @generated
	 */
  void updateContactPoints(Matrix4x4 originalPose, Map<PhysicalBody, Point3d> bodyToContactsMap);

} // ContactProvider
