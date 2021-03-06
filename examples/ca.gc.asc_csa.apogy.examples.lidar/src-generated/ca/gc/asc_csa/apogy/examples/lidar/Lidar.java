package ca.gc.asc_csa.apogy.examples.lidar;
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
import ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lidar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is an abstraction of the Lidar unit, a 3D laser-based range
 * finder which is capable of scanning the environment and returning
 * a point cloud encompassing the resulting information.  It has a
 * field of view, which determines the subsection of the environment
 * that the unit can scan.  It also can keep track of whether or not
 * the unit was initialized.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lidar.Lidar#getFov <em>Fov</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lidar.Lidar#isInitialized <em>Initialized</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.lidar.ApogyExamplesLidarPackage#getLidar()
 * @model abstract="true"
 * @generated
 */
public interface Lidar extends EObject
{
  /**
	 * Returns the value of the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fov</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the Lidar's field of view, which corresponds to a rectangular
	 * frustrum with defined limits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fov</em>' containment reference.
	 * @see #setFov(RectangularFrustrumFieldOfView)
	 * @see ca.gc.asc_csa.apogy.examples.lidar.ApogyExamplesLidarPackage#getLidar_Fov()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='Readonly' propertyCategory='Field Of View'"
	 * @generated
	 */
  RectangularFrustrumFieldOfView getFov();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.lidar.Lidar#getFov <em>Fov</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fov</em>' containment reference.
	 * @see #getFov()
	 * @generated
	 */
  void setFov(RectangularFrustrumFieldOfView value);

  /**
	 * Returns the value of the '<em><b>Initialized</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is whether or not the Lidar unit has been been successfully
	 * initialized; initially false.
	 * @see #init()
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialized</em>' attribute.
	 * @see #setInitialized(boolean)
	 * @see ca.gc.asc_csa.apogy.examples.lidar.ApogyExamplesLidarPackage#getLidar_Initialized()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Status'"
	 * @generated
	 */
	boolean isInitialized();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.lidar.Lidar#isInitialized <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialized</em>' attribute.
	 * @see #isInitialized()
	 * @generated
	 */
	void setInitialized(boolean value);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to perform the steps necessary to initialize
	 * the Lidar unit.
	 * @return Whether or not the Lidar's initialization was successfully completed
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean init();

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to acquire a depth scan of the field of view, with the given
	 * horizontal and vertical resolution.
	 * <p>
	 * Note: This method operates synchronously and will block until the entire scan has been
	 *       completed.
	 * @param horizontalResolution The horizontal angular resolution of the scan (in radians.)
	 * @param verticalResolution The vertical angular resolution of the scan (in radians.)
	 * @return The resulting scan with the given horizontal and vertical angular resolution.
	 * @see #acquireScanNonBlocking(double, double)
	 * <!-- end-model-doc -->
	 * @model unique="false" horizontalResolutionUnique="false"
	 *        horizontalResolutionAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'" verticalResolutionUnique="false"
	 *        verticalResolutionAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
  CartesianCoordinatesSet acquireScan(double horizontalResolution, double verticalResolution);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to acquire a depth scan of the field of view, with the given
	 * horizontal and vertical resolution.
	 * <p>
	 * Note: This method operates asynchronously and as such, will return immediately, even
	 *       if the scan is not yet completed.
	 * @param horizontalResolution The horizontal angular resolution of the scan (in radians.)
	 * @param verticalResolution The vertical angular resolution of the scan (in radians.)
	 * @return The resulting scan with the given horizontal and vertical angular resolution.
	 * @see #acquireScan(double, double)
	 * <!-- end-model-doc -->
	 * @model unique="false" horizontalResolutionUnique="false"
	 *        horizontalResolutionAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'" verticalResolutionUnique="false"
	 *        verticalResolutionAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
  CartesianCoordinatesSet acquireScanNonBlocking(double horizontalResolution, double verticalResolution);

} // Lidar
