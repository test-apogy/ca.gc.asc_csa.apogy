package ca.gc.asc_csa.apogy.examples.antenna.apogy;
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

import ca.gc.asc_csa.apogy.addons.sensors.fov.ConicalFieldOfView;
import ca.gc.asc_csa.apogy.core.ApogyInitializationData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PTU Dish Antenna Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class specifies the initialization data that Apogy
 * should be interested in when (re)initializing the PTU dish
 * antenna with the API Adapter (which in this case is
 * {ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaApogySystemApiAdapter})
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData#getFov <em>Fov</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData#getPanAngle <em>Pan Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData#getTiltAngle <em>Tilt Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData#isTrackingSun <em>Tracking Sun</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData#isInitialized <em>Initialized</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.ApogyExamplesAntennaApogyPackage#getPTUDishAntennaData()
 * @model
 * @generated
 */
public interface PTUDishAntennaData extends ApogyInitializationData
{
  /**
	 * Returns the value of the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the dish antenna's current field of view (FOV).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fov</em>' containment reference.
	 * @see #setFov(ConicalFieldOfView)
	 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.ApogyExamplesAntennaApogyPackage#getPTUDishAntennaData_Fov()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='Field Of View'"
	 * @generated
	 */
	ConicalFieldOfView getFov();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData#getFov <em>Fov</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fov</em>' containment reference.
	 * @see #getFov()
	 * @generated
	 */
	void setFov(ConicalFieldOfView value);

		/**
	 * Returns the value of the '<em><b>Pan Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the current pan angle of the dish antenna's
	 * Pan-Tilt Unit (PTU).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pan Angle</em>' attribute.
	 * @see #setPanAngle(double)
	 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.ApogyExamplesAntennaApogyPackage#getPTUDishAntennaData_PanAngle()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad' notify='true' property='Editable' propertyCategory='Pan-Tilt Unit'"
	 * @generated
	 */
  double getPanAngle();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData#getPanAngle <em>Pan Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pan Angle</em>' attribute.
	 * @see #getPanAngle()
	 * @generated
	 */
  void setPanAngle(double value);

  /**
	 * Returns the value of the '<em><b>Tilt Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the current tilt angle of the dish antenna's
	 * Pan-Tilt Unit (PTU).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tilt Angle</em>' attribute.
	 * @see #setTiltAngle(double)
	 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.ApogyExamplesAntennaApogyPackage#getPTUDishAntennaData_TiltAngle()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad' notify='true' property='Editable' propertyCategory='Pan-Tilt Unit'"
	 * @generated
	 */
  double getTiltAngle();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData#getTiltAngle <em>Tilt Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tilt Angle</em>' attribute.
	 * @see #getTiltAngle()
	 * @generated
	 */
  void setTiltAngle(double value);

		/**
	 * Returns the value of the '<em><b>Tracking Sun</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is whether or not the dish antenna's Pan-Tilt Unit (PTU)
	 * is tracking the sun
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tracking Sun</em>' attribute.
	 * @see #setTrackingSun(boolean)
	 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.ApogyExamplesAntennaApogyPackage#getPTUDishAntennaData_TrackingSun()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='Status'"
	 * @generated
	 */
	boolean isTrackingSun();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData#isTrackingSun <em>Tracking Sun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking Sun</em>' attribute.
	 * @see #isTrackingSun()
	 * @generated
	 */
	void setTrackingSun(boolean value);

		/**
	 * Returns the value of the '<em><b>Initialized</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is whether or not the dish antenna has been initialized
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialized</em>' attribute.
	 * @see #setInitialized(boolean)
	 * @see ca.gc.asc_csa.apogy.examples.antenna.apogy.ApogyExamplesAntennaApogyPackage#getPTUDishAntennaData_Initialized()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='Status'"
	 * @generated
	 */
	boolean isInitialized();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData#isInitialized <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialized</em>' attribute.
	 * @see #isInitialized()
	 * @generated
	 */
	void setInitialized(boolean value);

} // PTUDishAntennaData
