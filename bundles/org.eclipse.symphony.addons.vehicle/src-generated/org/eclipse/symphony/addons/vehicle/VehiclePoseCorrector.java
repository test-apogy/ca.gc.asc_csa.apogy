/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.math.Matrix3x3;
import org.eclipse.symphony.common.topology.addons.dynamics.PhysicalBody;
import org.eclipse.symphony.core.PoseCorrector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Pose Corrector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector#isInitializing <em>Initializing</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector#getMeshes <em>Meshes</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector#getContactBodies <em>Contact Bodies</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector#getZCorrectionMode <em>ZCorrection Mode</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector#getZCorrection <em>ZCorrection</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector#getOrientationCorrectionMode <em>Orientation Correction Mode</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector#getOrientationCorrection <em>Orientation Correction</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector#getContactProvider <em>Contact Provider</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage#getVehiclePoseCorrector()
 * @model
 * @generated
 */
public interface VehiclePoseCorrector extends PoseCorrector
{
  /**
	 * Returns the value of the '<em><b>Initializing</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the corrector is initializing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initializing</em>' attribute.
	 * @see #setInitializing(boolean)
	 * @see org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage#getVehiclePoseCorrector_Initializing()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' propertyCategory='INTERNAL_INFO'"
	 * @generated
	 */
  boolean isInitializing();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector#isInitializing <em>Initializing</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializing</em>' attribute.
	 * @see #isInitializing()
	 * @generated
	 */
  void setInitializing(boolean value);

  /**
	 * Returns the value of the '<em><b>Meshes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.addons.vehicle.MeshNodeEntry}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of ContentNode containing the meshes being processed to find contact points.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meshes</em>' reference list.
	 * @see org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage#getVehiclePoseCorrector_Meshes()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' propertyCategory='INTERNAL_INFO'"
	 * @generated
	 */
  EList<MeshNodeEntry> getMeshes();

  /**
	 * Returns the value of the '<em><b>Contact Bodies</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.common.topology.addons.dynamics.PhysicalBody}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of physical bodies being processed to find contact points.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Bodies</em>' reference list.
	 * @see org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage#getVehiclePoseCorrector_ContactBodies()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' propertyCategory='INTERNAL_INFO'"
	 * @generated
	 */
  EList<PhysicalBody> getContactBodies();

  /**
	 * Returns the value of the '<em><b>ZCorrection Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.symphony.addons.vehicle.ZCorrectionMode}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method used to compute the correction along the Z axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZCorrection Mode</em>' attribute.
	 * @see org.eclipse.symphony.addons.vehicle.ZCorrectionMode
	 * @see #setZCorrectionMode(ZCorrectionMode)
	 * @see org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage#getVehiclePoseCorrector_ZCorrectionMode()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='SETTINGS_INFO'"
	 * @generated
	 */
  ZCorrectionMode getZCorrectionMode();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector#getZCorrectionMode <em>ZCorrection Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZCorrection Mode</em>' attribute.
	 * @see org.eclipse.symphony.addons.vehicle.ZCorrectionMode
	 * @see #getZCorrectionMode()
	 * @generated
	 */
  void setZCorrectionMode(ZCorrectionMode value);

  /**
	 * Returns the value of the '<em><b>ZCorrection</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The last value of the pose correction along the Z axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZCorrection</em>' attribute.
	 * @see #setZCorrection(double)
	 * @see org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage#getVehiclePoseCorrector_ZCorrection()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' propertyCategory='CORRECTION_INFO' csa_units='m'"
	 * @generated
	 */
  double getZCorrection();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector#getZCorrection <em>ZCorrection</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZCorrection</em>' attribute.
	 * @see #getZCorrection()
	 * @generated
	 */
  void setZCorrection(double value);

  /**
	 * Returns the value of the '<em><b>Orientation Correction Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.symphony.addons.vehicle.OrientationCorrectionMode}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The method used to correct orientation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orientation Correction Mode</em>' attribute.
	 * @see org.eclipse.symphony.addons.vehicle.OrientationCorrectionMode
	 * @see #setOrientationCorrectionMode(OrientationCorrectionMode)
	 * @see org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage#getVehiclePoseCorrector_OrientationCorrectionMode()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='SETTINGS_INFO'"
	 * @generated
	 */
  OrientationCorrectionMode getOrientationCorrectionMode();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector#getOrientationCorrectionMode <em>Orientation Correction Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation Correction Mode</em>' attribute.
	 * @see org.eclipse.symphony.addons.vehicle.OrientationCorrectionMode
	 * @see #getOrientationCorrectionMode()
	 * @generated
	 */
  void setOrientationCorrectionMode(OrientationCorrectionMode value);

  /**
	 * Returns the value of the '<em><b>Orientation Correction</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Orientation Correction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orientation Correction</em>' reference.
	 * @see #setOrientationCorrection(Matrix3x3)
	 * @see org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage#getVehiclePoseCorrector_OrientationCorrection()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' child='true' property='Readonly' propertyCategory='CORRECTION_INFO'"
	 * @generated
	 */
  Matrix3x3 getOrientationCorrection();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector#getOrientationCorrection <em>Orientation Correction</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation Correction</em>' reference.
	 * @see #getOrientationCorrection()
	 * @generated
	 */
  void setOrientationCorrection(Matrix3x3 value);

  /**
	 * Returns the value of the '<em><b>Contact Provider</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.addons.vehicle.ContactProvider#getVehiclePoseCorrector <em>Vehicle Pose Corrector</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Provider of contacts for the VehiclePoseCorrector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Provider</em>' containment reference.
	 * @see #setContactProvider(ContactProvider)
	 * @see org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage#getVehiclePoseCorrector_ContactProvider()
	 * @see org.eclipse.symphony.addons.vehicle.ContactProvider#getVehiclePoseCorrector
	 * @model opposite="vehiclePoseCorrector" containment="true" required="true"
	 * @generated
	 */
  ContactProvider getContactProvider();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.VehiclePoseCorrector#getContactProvider <em>Contact Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Provider</em>' containment reference.
	 * @see #getContactProvider()
	 * @generated
	 */
  void setContactProvider(ContactProvider value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that forces re-initialization of the pose corrector meshes contact geometries.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
  void reInitialize();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the MeshExtent2D associated with the specified mesh.
	 * @param mesh The specified mesh.
	 * @return The MeshExtent2D associated with the mesh or null if none is found.
	 * <!-- end-model-doc -->
	 * @model unique="false" meshUnique="false"
	 * @generated
	 */
  MeshExtent2D getMeshExtent2D(CartesianTriangularMesh mesh);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the ClosestNeighbourIteratorProvider associated with the specified mesh.
	 * @param mesh The specified mesh.
	 * @return The ClosestNeighbourIteratorProvider associated with the mesh or null if none is found.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.addons.vehicle.ClosestNeighbourIteratorProvider" unique="false" meshUnique="false"
	 * @generated
	 */
  ClosestNeighbourIteratorProvider getClosestNeighbourIteratorProvider(CartesianTriangularMesh mesh);

} // VehiclePoseCorrector
