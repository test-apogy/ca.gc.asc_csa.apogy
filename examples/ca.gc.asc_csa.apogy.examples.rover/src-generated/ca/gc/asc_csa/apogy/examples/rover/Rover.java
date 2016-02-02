package ca.gc.asc_csa.apogy.examples.rover;
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

import ca.gc.asc_csa.apogy.common.emf.Disposable;
import ca.gc.asc_csa.apogy.examples.camera.PTUCamera;
import ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform;
import ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rover</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract class represents a rover assembly, including
 * its relevant state (e.g. component parts) as well as the
 * operations that it can perform.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.Rover#getRoboticArm <em>Robotic Arm</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.Rover#getMobilePlatform <em>Mobile Platform</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.Rover#getArmCamera <em>Arm Camera</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.Rover#getCenterCamera <em>Center Camera</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.Rover#getPowerSystem <em>Power System</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.Rover#getLinearVelocity <em>Linear Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.Rover#getAngularVelocity <em>Angular Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.Rover#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.Rover#isDisposed <em>Disposed</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage#getRover()
 * @model abstract="true"
 * @generated
 */
public interface Rover extends Disposable
{

  /**
	 * Returns the value of the '<em><b>Robotic Arm</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Robotic Arm</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A robotic arm used by the rover assembly to interact
	 * with the environment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Robotic Arm</em>' reference.
	 * @see #setRoboticArm(RoboticArm)
	 * @see ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage#getRover_RoboticArm()
	 * @model required="true" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='Subcomponents' children='true'"
	 * @generated
	 */
  RoboticArm getRoboticArm();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.rover.Rover#getRoboticArm <em>Robotic Arm</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robotic Arm</em>' reference.
	 * @see #getRoboticArm()
	 * @generated
	 */
  void setRoboticArm(RoboticArm value);

  /**
	 * Returns the value of the '<em><b>Mobile Platform</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mobile Platform</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A mobile platform used by the rover assembly to move
	 * around the environment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mobile Platform</em>' reference.
	 * @see #setMobilePlatform(MobilePlatform)
	 * @see ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage#getRover_MobilePlatform()
	 * @model required="true" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='Subcomponents' children='true'"
	 * @generated
	 */
  MobilePlatform getMobilePlatform();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.rover.Rover#getMobilePlatform <em>Mobile Platform</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobile Platform</em>' reference.
	 * @see #getMobilePlatform()
	 * @generated
	 */
  void setMobilePlatform(MobilePlatform value);

  /**
	 * Returns the value of the '<em><b>Arm Camera</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A camera mounted on the arm of the rover assembly to
	 * take pictures of the environment; from those photos,
	 * additional visual information may be extracted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arm Camera</em>' reference.
	 * @see #setArmCamera(PTUCamera)
	 * @see ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage#getRover_ArmCamera()
	 * @model required="true" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='Subcomponents' children='true'"
	 * @generated
	 */
	PTUCamera getArmCamera();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.rover.Rover#getArmCamera <em>Arm Camera</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arm Camera</em>' reference.
	 * @see #getArmCamera()
	 * @generated
	 */
	void setArmCamera(PTUCamera value);

		/**
	 * Returns the value of the '<em><b>Center Camera</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A camera mounted on the center of the rover mast assembly to
	 * take pictures of the environment; from those photos,
	 * additional visual information may be extracted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Center Camera</em>' reference.
	 * @see #setCenterCamera(PTUCamera)
	 * @see ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage#getRover_CenterCamera()
	 * @model required="true" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='Subcomponents' children='true'"
	 * @generated
	 */
	PTUCamera getCenterCamera();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.rover.Rover#getCenterCamera <em>Center Camera</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center Camera</em>' reference.
	 * @see #getCenterCamera()
	 * @generated
	 */
	void setCenterCamera(PTUCamera value);

		/**
	 * Returns the value of the '<em><b>Power System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A power system which is used to power the Rover.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power System</em>' containment reference.
	 * @see #setPowerSystem(PowerSystem)
	 * @see ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage#getRover_PowerSystem()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='Subcomponents'"
	 * @generated
	 */
	PowerSystem getPowerSystem();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.rover.Rover#getPowerSystem <em>Power System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power System</em>' containment reference.
	 * @see #getPowerSystem()
	 * @generated
	 */
	void setPowerSystem(PowerSystem value);

		/**
	 * Returns the value of the '<em><b>Linear Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the linear velocity of the rover (given in
	 * metres per second.)
	 * <p>
	 * Note: Unlike the traditional definition of linear velocity
	 * as a vector, this is simply a signed scalar; a positive
	 * value indicates the speed forward while a negative value
	 * is the speed backwards.  Zero means there is no movement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linear Velocity</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage#getRover_LinearVelocity()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' apogy_units='m/s' property='Readonly' propertyCategory='Velocities' get='<%ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform%> _mobilePlatform = this.getMobilePlatform();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_mobilePlatform, null));\nif (_notEquals)\n{\n\t<%ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform%> _mobilePlatform_1 = this.getMobilePlatform();\n\treturn _mobilePlatform_1.getLinearVelocity();\n}\nelse\n{\n\treturn 0.0;\n}'"
	 * @generated
	 */
	double getLinearVelocity();

		/**
	 * Returns the value of the '<em><b>Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the angular velocity of the rover (given in
	 * radians per second.)
	 * <p>
	 * Note: Unlike the traditional definition of angular
	 * velocity as a vector, this is simply a signed scalar;
	 * a positive value is the rotation in the clockwise
	 * direction while a negative value implies the rotation
	 * is in the counter-clockwise direction.  Zero means
	 * there is no rotation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angular Velocity</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage#getRover_AngularVelocity()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' apogy_units='rad/s' property='Readonly' propertyCategory='Velocities' get='<%ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform%> _mobilePlatform = this.getMobilePlatform();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_mobilePlatform, null));\nif (_notEquals)\n{\n\t<%ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform%> _mobilePlatform_1 = this.getMobilePlatform();\n\treturn _mobilePlatform_1.getAngularVelocity();\n}\nelse\n{\n\treturn 0.0;\n}'"
	 * @generated
	 */
	double getAngularVelocity();

		/**
	 * Returns the value of the '<em><b>Initialized</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is whether or not the rover has been initialized
	 * successfully; initially false.
	 * @see #init()
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialized</em>' attribute.
	 * @see #setInitialized(boolean)
	 * @see ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage#getRover_Initialized()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Status'"
	 * @generated
	 */
	boolean isInitialized();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.rover.Rover#isInitialized <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialized</em>' attribute.
	 * @see #isInitialized()
	 * @generated
	 */
	void setInitialized(boolean value);

		/**
	 * Returns the value of the '<em><b>Disposed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is whether or not the rover has been disposed
	 * successfully; initially false.
	 * @see #dispose()
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposed</em>' attribute.
	 * @see #setDisposed(boolean)
	 * @see ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage#getRover_Disposed()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Status'"
	 * @generated
	 */
	boolean isDisposed();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.rover.Rover#isDisposed <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposed</em>' attribute.
	 * @see #isDisposed()
	 * @generated
	 */
	void setDisposed(boolean value);

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to perform the required initialization functions
	 * on the rover assembly; this may involve bootstrapping the components
	 * of the rover (e.g. mobile platform, cameras, etc.)
	 * @return Whether or not the rover assembly was successfully initialized
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
  boolean init();

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to change the linear velocity of the rover
	 * assembly to the provided value (given in m/s); internally, this is
	 * likely to cause a change to the mobile platform, as it is this component
	 * which actually moves the rover.
	 * <p>
	 * Note: Unlike the traditional definition of linear velocity as a vector,
	 * this is simply a signed scalar; a positive value indicates the speed
	 * forward while a negative value is the speed backwards.  Zero means there
	 * is no movement.
	 * 
	 * @param linearVelocity The rover assembly's new linear velocity (in m/s)
	 * @see #cmdVelocities(double, double)
	 * <!-- end-model-doc -->
	 * @model linearVelocityUnique="false"
	 *        linearVelocityAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='m/s'"
	 * @generated
	 */
	void cmdLinearVelocity(double linearVelocity);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to change the angular velocity of the rover
	 * assembly to the provided value (given in radians / second); internally,
	 * this is likely to cause a change to the mobile platform, as it is this
	 * component which actually moves the rover.
	 * <p>
	 * Note: Unlike the traditional definition of angular velocity as a vector,
	 * this is simply a signed scalar; a positive value is the rotation in the
	 * clockwise direction while a negative value implies the rotation is in the
	 * counter-clockwise direction.  Zero means there is no rotation.
	 * 
	 * @param angularVelocity The rover assembly's new angular velocity (in rad/s)
	 * @see #cmdVelocities(double, double)
	 * <!-- end-model-doc -->
	 * @model angularVelocityUnique="false"
	 *        angularVelocityAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad/s'"
	 * @generated
	 */
	void cmdAngularVelocity(double angularVelocity);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to change both the linear velocity (given in m/s)
	 * and angular velocity (given in rad/s) of the rover assembly to the
	 * provided values; internally, this is likely to cause a change to the
	 * mobile platform, as it is this component which actually moves the rover.
	 * <p>
	 * Note 1: Unlike the traditional definition of linear velocity as a vector,
	 * this is simply a signed scalar; a positive value indicates the speed
	 * forward while a negative value is the speed backwards.  Zero means there
	 * is no movement.
	 * <p>
	 * Note 2: Unlike the traditional definition of angular velocity as a vector,
	 * this is simply a signed scalar; a positive value is the rotation in the
	 * clockwise direction while a negative value implies the rotation is in the
	 * counter-clockwise direction.  Zero means there is no rotation.
	 * 
	 * @param linearVelocity The rover assembly's new linear velocity (in m/s)
	 * @param angularVelocity The rover assembly's new angular velocity (in rad/s)
	 * @see #cmdLinearVelocity(double)
	 * @see #cmdAngularVelocity(double)
	 * <!-- end-model-doc -->
	 * @model linearVelocityUnique="false"
	 *        linearVelocityAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='m/s'" angularVelocityUnique="false"
	 *        angularVelocityAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad/s'"
	 * @generated
	 */
	void cmdVelocities(double linearVelocity, double angularVelocity);

} // Rover
