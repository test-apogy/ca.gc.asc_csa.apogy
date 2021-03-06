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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesh Extent2 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D#getMinimumX <em>Minimum X</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D#getMinimumY <em>Minimum Y</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D#getMaximumX <em>Maximum X</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D#getMaximumY <em>Maximum Y</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getMeshExtent2D()
 * @model
 * @generated
 */
public interface MeshExtent2D extends EObject
{
  /**
	 * Returns the value of the '<em><b>Minimum X</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minimum X</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum X</em>' attribute.
	 * @see #setMinimumX(double)
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getMeshExtent2D_MinimumX()
	 * @model default="0" unique="false"
	 * @generated
	 */
  double getMinimumX();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D#getMinimumX <em>Minimum X</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum X</em>' attribute.
	 * @see #getMinimumX()
	 * @generated
	 */
  void setMinimumX(double value);

  /**
	 * Returns the value of the '<em><b>Minimum Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minimum Y</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Y</em>' attribute.
	 * @see #setMinimumY(double)
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getMeshExtent2D_MinimumY()
	 * @model default="0" unique="false"
	 * @generated
	 */
  double getMinimumY();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D#getMinimumY <em>Minimum Y</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Y</em>' attribute.
	 * @see #getMinimumY()
	 * @generated
	 */
  void setMinimumY(double value);

  /**
	 * Returns the value of the '<em><b>Maximum X</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maximum X</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum X</em>' attribute.
	 * @see #setMaximumX(double)
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getMeshExtent2D_MaximumX()
	 * @model default="0" unique="false"
	 * @generated
	 */
  double getMaximumX();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D#getMaximumX <em>Maximum X</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum X</em>' attribute.
	 * @see #getMaximumX()
	 * @generated
	 */
  void setMaximumX(double value);

  /**
	 * Returns the value of the '<em><b>Maximum Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maximum Y</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Y</em>' attribute.
	 * @see #setMaximumY(double)
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage#getMeshExtent2D_MaximumY()
	 * @model default="0" unique="false"
	 * @generated
	 */
  double getMaximumY();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D#getMaximumY <em>Maximum Y</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Y</em>' attribute.
	 * @see #getMaximumY()
	 * @generated
	 */
  void setMaximumY(double value);

} // MeshExtent2D
