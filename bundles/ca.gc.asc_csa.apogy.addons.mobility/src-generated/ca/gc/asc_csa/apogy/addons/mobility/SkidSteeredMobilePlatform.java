/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.addons.mobility;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skid Steered Mobile Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getCommandedRightWheelsVelocity <em>Commanded Right Wheels Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getActualRightWheelsVelocity <em>Actual Right Wheels Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getCommandedLeftWheelsVelocity <em>Commanded Left Wheels Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getActualLeftWheelsVelocity <em>Actual Left Wheels Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getCommandedAngularVelocity <em>Commanded Angular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getActualAngularVelocity <em>Actual Angular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getCommandedTranslationVelocity <em>Commanded Translation Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getActualTranslationVelocity <em>Actual Translation Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getEffectiveSteeringWidth <em>Effective Steering Width</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.mobility.Symphony__AddonsMobilityPackage#getSkidSteeredMobilePlatform()
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
	 * @see org.eclipse.symphony.addons.mobility.Symphony__AddonsMobilityPackage#getSkidSteeredMobilePlatform_CommandedRightWheelsVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getCommandedRightWheelsVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getCommandedRightWheelsVelocity <em>Commanded Right Wheels Velocity</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.mobility.Symphony__AddonsMobilityPackage#getSkidSteeredMobilePlatform_ActualRightWheelsVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getActualRightWheelsVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getActualRightWheelsVelocity <em>Actual Right Wheels Velocity</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.mobility.Symphony__AddonsMobilityPackage#getSkidSteeredMobilePlatform_CommandedLeftWheelsVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getCommandedLeftWheelsVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getCommandedLeftWheelsVelocity <em>Commanded Left Wheels Velocity</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.mobility.Symphony__AddonsMobilityPackage#getSkidSteeredMobilePlatform_ActualLeftWheelsVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getActualLeftWheelsVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getActualLeftWheelsVelocity <em>Actual Left Wheels Velocity</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.mobility.Symphony__AddonsMobilityPackage#getSkidSteeredMobilePlatform_CommandedAngularVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getCommandedAngularVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getCommandedAngularVelocity <em>Commanded Angular Velocity</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.mobility.Symphony__AddonsMobilityPackage#getSkidSteeredMobilePlatform_ActualAngularVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getActualAngularVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getActualAngularVelocity <em>Actual Angular Velocity</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.mobility.Symphony__AddonsMobilityPackage#getSkidSteeredMobilePlatform_CommandedTranslationVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getCommandedTranslationVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getCommandedTranslationVelocity <em>Commanded Translation Velocity</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.mobility.Symphony__AddonsMobilityPackage#getSkidSteeredMobilePlatform_ActualTranslationVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getActualTranslationVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getActualTranslationVelocity <em>Actual Translation Velocity</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.mobility.Symphony__AddonsMobilityPackage#getSkidSteeredMobilePlatform_EffectiveSteeringWidth()
	 * @model default="0.5" unique="false"
	 * @generated
	 */
	double getEffectiveSteeringWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getEffectiveSteeringWidth <em>Effective Steering Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Steering Width</em>' attribute.
	 * @see #getEffectiveSteeringWidth()
	 * @generated
	 */
	void setEffectiveSteeringWidth(double value);

} // SkidSteeredMobilePlatform
