/**
 * Canadian Space Agency 2007.
 *
 * $Id: SkidSteeredMobilePlateform.java,v 1.2.4.2 2015/05/21 15:51:26 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skid Steered Mobile Plateform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * FIXME: Change SkidSteeredMobilePlateform to SkidSteeredMobilePlatform
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform#getCommandedRightWheelsVelocity <em>Commanded Right Wheels Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform#getActualRightWheelsVelocity <em>Actual Right Wheels Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform#getCommandedLeftWheelsVelocity <em>Commanded Left Wheels Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform#getActualLeftWheelsVelocity <em>Actual Left Wheels Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform#getCommandedAngularVelocity <em>Commanded Angular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform#getActualAngularVelocity <em>Actual Angular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform#getCommandedTranslationVelocity <em>Commanded Translation Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform#getActualTranslationVelocity <em>Actual Translation Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform#getEffectiveSteeringWidth <em>Effective Steering Width</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.mobility.MobilityPackage#getSkidSteeredMobilePlateform()
 * @model
 * @generated
 */
public interface SkidSteeredMobilePlateform extends MobilePlateform {
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
	 * @see org.eclipse.symphony.addons.mobility.MobilityPackage#getSkidSteeredMobilePlateform_CommandedRightWheelsVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getCommandedRightWheelsVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform#getCommandedRightWheelsVelocity <em>Commanded Right Wheels Velocity</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.mobility.MobilityPackage#getSkidSteeredMobilePlateform_ActualRightWheelsVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getActualRightWheelsVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform#getActualRightWheelsVelocity <em>Actual Right Wheels Velocity</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.mobility.MobilityPackage#getSkidSteeredMobilePlateform_CommandedLeftWheelsVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getCommandedLeftWheelsVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform#getCommandedLeftWheelsVelocity <em>Commanded Left Wheels Velocity</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.mobility.MobilityPackage#getSkidSteeredMobilePlateform_ActualLeftWheelsVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getActualLeftWheelsVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform#getActualLeftWheelsVelocity <em>Actual Left Wheels Velocity</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.mobility.MobilityPackage#getSkidSteeredMobilePlateform_CommandedAngularVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getCommandedAngularVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform#getCommandedAngularVelocity <em>Commanded Angular Velocity</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.mobility.MobilityPackage#getSkidSteeredMobilePlateform_ActualAngularVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getActualAngularVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform#getActualAngularVelocity <em>Actual Angular Velocity</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.mobility.MobilityPackage#getSkidSteeredMobilePlateform_CommandedTranslationVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getCommandedTranslationVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform#getCommandedTranslationVelocity <em>Commanded Translation Velocity</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.mobility.MobilityPackage#getSkidSteeredMobilePlateform_ActualTranslationVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getActualTranslationVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform#getActualTranslationVelocity <em>Actual Translation Velocity</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.mobility.MobilityPackage#getSkidSteeredMobilePlateform_EffectiveSteeringWidth()
	 * @model default="0.5" unique="false"
	 * @generated
	 */
	double getEffectiveSteeringWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform#getEffectiveSteeringWidth <em>Effective Steering Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Steering Width</em>' attribute.
	 * @see #getEffectiveSteeringWidth()
	 * @generated
	 */
	void setEffectiveSteeringWidth(double value);

} // SkidSteeredMobilePlateform
