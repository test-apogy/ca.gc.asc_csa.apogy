package ca.gc.asc_csa.apogy.addons.mobility;
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skid Steered Mobile Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getCommandedRightWheelsVelocity <em>Commanded Right Wheels Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getActualRightWheelsVelocity <em>Actual Right Wheels Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getCommandedLeftWheelsVelocity <em>Commanded Left Wheels Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getActualLeftWheelsVelocity <em>Actual Left Wheels Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getCommandedAngularVelocity <em>Commanded Angular Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getActualAngularVelocity <em>Actual Angular Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getCommandedTranslationVelocity <em>Commanded Translation Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getActualTranslationVelocity <em>Actual Translation Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getEffectiveSteeringWidth <em>Effective Steering Width</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.mobility.ApogyAddonsMobilityPackage#getSkidSteeredMobilePlatform()
 * @model
 * @generated
 */
public interface SkidSteeredMobilePlatform extends MobilePlatform {
	/**
	 * Returns the value of the '<em><b>Commanded Right Wheels Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commanded Right Wheels Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commanded Right Wheels Velocity</em>' attribute.
	 * @see #setCommandedRightWheelsVelocity(double)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.ApogyAddonsMobilityPackage#getSkidSteeredMobilePlatform_CommandedRightWheelsVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getCommandedRightWheelsVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getCommandedRightWheelsVelocity <em>Commanded Right Wheels Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commanded Right Wheels Velocity</em>' attribute.
	 * @see #getCommandedRightWheelsVelocity()
	 * @generated
	 */
	void setCommandedRightWheelsVelocity(double value);

	/**
	 * Returns the value of the '<em><b>Actual Right Wheels Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Right Wheels Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Right Wheels Velocity</em>' attribute.
	 * @see #setActualRightWheelsVelocity(double)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.ApogyAddonsMobilityPackage#getSkidSteeredMobilePlatform_ActualRightWheelsVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getActualRightWheelsVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getActualRightWheelsVelocity <em>Actual Right Wheels Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Right Wheels Velocity</em>' attribute.
	 * @see #getActualRightWheelsVelocity()
	 * @generated
	 */
	void setActualRightWheelsVelocity(double value);

	/**
	 * Returns the value of the '<em><b>Commanded Left Wheels Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commanded Left Wheels Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commanded Left Wheels Velocity</em>' attribute.
	 * @see #setCommandedLeftWheelsVelocity(double)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.ApogyAddonsMobilityPackage#getSkidSteeredMobilePlatform_CommandedLeftWheelsVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getCommandedLeftWheelsVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getCommandedLeftWheelsVelocity <em>Commanded Left Wheels Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commanded Left Wheels Velocity</em>' attribute.
	 * @see #getCommandedLeftWheelsVelocity()
	 * @generated
	 */
	void setCommandedLeftWheelsVelocity(double value);

	/**
	 * Returns the value of the '<em><b>Actual Left Wheels Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Left Wheels Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Left Wheels Velocity</em>' attribute.
	 * @see #setActualLeftWheelsVelocity(double)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.ApogyAddonsMobilityPackage#getSkidSteeredMobilePlatform_ActualLeftWheelsVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getActualLeftWheelsVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getActualLeftWheelsVelocity <em>Actual Left Wheels Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Left Wheels Velocity</em>' attribute.
	 * @see #getActualLeftWheelsVelocity()
	 * @generated
	 */
	void setActualLeftWheelsVelocity(double value);

	/**
	 * Returns the value of the '<em><b>Commanded Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commanded Angular Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commanded Angular Velocity</em>' attribute.
	 * @see #setCommandedAngularVelocity(double)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.ApogyAddonsMobilityPackage#getSkidSteeredMobilePlatform_CommandedAngularVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getCommandedAngularVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getCommandedAngularVelocity <em>Commanded Angular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commanded Angular Velocity</em>' attribute.
	 * @see #getCommandedAngularVelocity()
	 * @generated
	 */
	void setCommandedAngularVelocity(double value);

	/**
	 * Returns the value of the '<em><b>Actual Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Angular Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Angular Velocity</em>' attribute.
	 * @see #setActualAngularVelocity(double)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.ApogyAddonsMobilityPackage#getSkidSteeredMobilePlatform_ActualAngularVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getActualAngularVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getActualAngularVelocity <em>Actual Angular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Angular Velocity</em>' attribute.
	 * @see #getActualAngularVelocity()
	 * @generated
	 */
	void setActualAngularVelocity(double value);

	/**
	 * Returns the value of the '<em><b>Commanded Translation Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commanded Translation Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commanded Translation Velocity</em>' attribute.
	 * @see #setCommandedTranslationVelocity(double)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.ApogyAddonsMobilityPackage#getSkidSteeredMobilePlatform_CommandedTranslationVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getCommandedTranslationVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getCommandedTranslationVelocity <em>Commanded Translation Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commanded Translation Velocity</em>' attribute.
	 * @see #getCommandedTranslationVelocity()
	 * @generated
	 */
	void setCommandedTranslationVelocity(double value);

	/**
	 * Returns the value of the '<em><b>Actual Translation Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Translation Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Translation Velocity</em>' attribute.
	 * @see #setActualTranslationVelocity(double)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.ApogyAddonsMobilityPackage#getSkidSteeredMobilePlatform_ActualTranslationVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getActualTranslationVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getActualTranslationVelocity <em>Actual Translation Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Translation Velocity</em>' attribute.
	 * @see #getActualTranslationVelocity()
	 * @generated
	 */
	void setActualTranslationVelocity(double value);

	/**
	 * Returns the value of the '<em><b>Effective Steering Width</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Steering Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Steering Width</em>' attribute.
	 * @see #setEffectiveSteeringWidth(double)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.ApogyAddonsMobilityPackage#getSkidSteeredMobilePlatform_EffectiveSteeringWidth()
	 * @model default="0.5" unique="false"
	 * @generated
	 */
	double getEffectiveSteeringWidth();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getEffectiveSteeringWidth <em>Effective Steering Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Steering Width</em>' attribute.
	 * @see #getEffectiveSteeringWidth()
	 * @generated
	 */
	void setEffectiveSteeringWidth(double value);

} // SkidSteeredMobilePlatform
