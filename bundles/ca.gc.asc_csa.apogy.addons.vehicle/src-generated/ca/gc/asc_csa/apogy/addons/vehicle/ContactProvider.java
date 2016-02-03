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

import java.util.List;
import java.util.Map;

import javax.vecmath.Point3d;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.ContactProvider#getVehiclePoseCorrector <em>Vehicle Pose Corrector</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getContactProvider()
 * @model abstract="true"
 * @generated
 */
public interface ContactProvider extends EObject
{
  /**
	 * Returns the value of the '<em><b>Vehicle Pose Corrector</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getContactProvider <em>Contact Provider</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vehicle Pose Corrector</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Pose Corrector</em>' container reference.
	 * @see #setVehiclePoseCorrector(VehiclePoseCorrector)
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getContactProvider_VehiclePoseCorrector()
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getContactProvider
	 * @model opposite="contactProvider" transient="false"
	 * @generated
	 */
  VehiclePoseCorrector getVehiclePoseCorrector();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.ContactProvider#getVehiclePoseCorrector <em>Vehicle Pose Corrector</em>}' container reference.
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
	 * @model dataType="ca.gc.asc_csa.apogy.addons.vehicle.List<ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody>" unique="false" many="false"
	 * @generated
	 */
  List<PhysicalBody> extractContactBodies();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model originalPoseUnique="false" bodyToContactsMapDataType="ca.gc.asc_csa.apogy.addons.vehicle.Map<ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody, ca.gc.asc_csa.apogy.addons.vehicle.Point3d>" bodyToContactsMapUnique="false"
	 * @generated
	 */
  void updateContactPoints(Matrix4x4 originalPose, Map<PhysicalBody, Point3d> bodyToContactsMap);

} // ContactProvider
