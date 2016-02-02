package ca.gc.asc_csa.apogy.addons.vehicle;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.common.util.EList;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.math.Matrix3x3;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody;
import ca.gc.asc_csa.apogy.core.PoseCorrector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Pose Corrector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#isInitializing <em>Initializing</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getMeshes <em>Meshes</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getContactBodies <em>Contact Bodies</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getZCorrectionMode <em>ZCorrection Mode</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getZCorrection <em>ZCorrection</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getOrientationCorrectionMode <em>Orientation Correction Mode</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getOrientationCorrection <em>Orientation Correction</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getContactProvider <em>Contact Provider</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getVehiclePoseCorrector()
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
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getVehiclePoseCorrector_Initializing()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' propertyCategory='INTERNAL_INFO'"
	 * @generated
	 */
  boolean isInitializing();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#isInitializing <em>Initializing</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializing</em>' attribute.
	 * @see #isInitializing()
	 * @generated
	 */
  void setInitializing(boolean value);

  /**
	 * Returns the value of the '<em><b>Meshes</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.addons.vehicle.MeshNodeEntry}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of ContentNode containing the meshes being processed to find contact points.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meshes</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getVehiclePoseCorrector_Meshes()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' propertyCategory='INTERNAL_INFO'"
	 * @generated
	 */
  EList<MeshNodeEntry> getMeshes();

  /**
	 * Returns the value of the '<em><b>Contact Bodies</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of physical bodies being processed to find contact points.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Bodies</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getVehiclePoseCorrector_ContactBodies()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' propertyCategory='INTERNAL_INFO'"
	 * @generated
	 */
  EList<PhysicalBody> getContactBodies();

  /**
	 * Returns the value of the '<em><b>ZCorrection Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.addons.vehicle.ZCorrectionMode}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method used to compute the correction along the Z axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZCorrection Mode</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ZCorrectionMode
	 * @see #setZCorrectionMode(ZCorrectionMode)
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getVehiclePoseCorrector_ZCorrectionMode()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='SETTINGS_INFO'"
	 * @generated
	 */
  ZCorrectionMode getZCorrectionMode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getZCorrectionMode <em>ZCorrection Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZCorrection Mode</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ZCorrectionMode
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
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getVehiclePoseCorrector_ZCorrection()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' propertyCategory='CORRECTION_INFO' apogy_units='m'"
	 * @generated
	 */
  double getZCorrection();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getZCorrection <em>ZCorrection</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZCorrection</em>' attribute.
	 * @see #getZCorrection()
	 * @generated
	 */
  void setZCorrection(double value);

  /**
	 * Returns the value of the '<em><b>Orientation Correction Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.addons.vehicle.OrientationCorrectionMode}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The method used to correct orientation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orientation Correction Mode</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.OrientationCorrectionMode
	 * @see #setOrientationCorrectionMode(OrientationCorrectionMode)
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getVehiclePoseCorrector_OrientationCorrectionMode()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='SETTINGS_INFO'"
	 * @generated
	 */
  OrientationCorrectionMode getOrientationCorrectionMode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getOrientationCorrectionMode <em>Orientation Correction Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation Correction Mode</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.OrientationCorrectionMode
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
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getVehiclePoseCorrector_OrientationCorrection()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' child='true' property='Readonly' propertyCategory='CORRECTION_INFO'"
	 * @generated
	 */
  Matrix3x3 getOrientationCorrection();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getOrientationCorrection <em>Orientation Correction</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation Correction</em>' reference.
	 * @see #getOrientationCorrection()
	 * @generated
	 */
  void setOrientationCorrection(Matrix3x3 value);

  /**
	 * Returns the value of the '<em><b>Contact Provider</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.addons.vehicle.ContactProvider#getVehiclePoseCorrector <em>Vehicle Pose Corrector</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Provider of contacts for the VehiclePoseCorrector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Provider</em>' containment reference.
	 * @see #setContactProvider(ContactProvider)
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getVehiclePoseCorrector_ContactProvider()
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ContactProvider#getVehiclePoseCorrector
	 * @model opposite="vehiclePoseCorrector" containment="true" required="true"
	 * @generated
	 */
  ContactProvider getContactProvider();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getContactProvider <em>Contact Provider</em>}' containment reference.
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
	 * @model dataType="ca.gc.asc_csa.apogy.addons.vehicle.ClosestNeighbourIteratorProvider" unique="false" meshUnique="false"
	 * @generated
	 */
  ClosestNeighbourIteratorProvider getClosestNeighbourIteratorProvider(CartesianTriangularMesh mesh);

} // VehiclePoseCorrector
