/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.vehicle;

import java.util.List;
import java.util.Map;

import javax.vecmath.Point3d;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.math.Matrix4x4;

import ca.gc.asc_csa.topology.dynamics.PhysicalBody;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.vehicle.ContactProvider#getVehiclePoseCorrector <em>Vehicle Pose Corrector</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.tools.vehicle.SymphonyToolsVehiclePackage#getContactProvider()
 * @model abstract="true"
 * @generated
 */
public interface ContactProvider extends EObject
{
  /**
	 * Returns the value of the '<em><b>Vehicle Pose Corrector</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.symphony.tools.vehicle.VehiclePoseCorrector#getContactProvider <em>Contact Provider</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vehicle Pose Corrector</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Pose Corrector</em>' container reference.
	 * @see #setVehiclePoseCorrector(VehiclePoseCorrector)
	 * @see ca.gc.asc_csa.symphony.tools.vehicle.SymphonyToolsVehiclePackage#getContactProvider_VehiclePoseCorrector()
	 * @see ca.gc.asc_csa.symphony.tools.vehicle.VehiclePoseCorrector#getContactProvider
	 * @model opposite="contactProvider" transient="false"
	 * @generated
	 */
  VehiclePoseCorrector getVehiclePoseCorrector();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.vehicle.ContactProvider#getVehiclePoseCorrector <em>Vehicle Pose Corrector</em>}' container reference.
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
	 * @model dataType="ca.gc.asc_csa.symphony.tools.vehicle.List<ca.gc.asc_csa.topology.dynamics.PhysicalBody>" unique="false" many="false"
	 * @generated
	 */
  List<PhysicalBody> extractContactBodies();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model originalPoseUnique="false" bodyToContactsMapDataType="ca.gc.asc_csa.symphony.tools.vehicle.Map<ca.gc.asc_csa.topology.dynamics.PhysicalBody, ca.gc.asc_csa.symphony.tools.vehicle.Point3d>" bodyToContactsMapUnique="false"
	 * @generated
	 */
  void updateContactPoints(Matrix4x4 originalPose, Map<PhysicalBody, Point3d> bodyToContactsMap);

} // ContactProvider
