/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.mobile_platform.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.examples.mobile_platform.EMFEcoreExampleMobilePlatformFactory;
import org.eclipse.symphony.examples.mobile_platform.EMFEcoreExampleMobilePlatformPackage;
import org.eclipse.symphony.examples.mobile_platform.MobilePlatform;
import org.eclipse.symphony.examples.mobile_platform.Position;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mobile Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.mobile_platform.impl.MobilePlatformImpl#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.mobile_platform.impl.MobilePlatformImpl#isDisposed <em>Disposed</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.mobile_platform.impl.MobilePlatformImpl#getPositionError <em>Position Error</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.mobile_platform.impl.MobilePlatformImpl#getLinearVelocity <em>Linear Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.mobile_platform.impl.MobilePlatformImpl#getAngularVelocity <em>Angular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.mobile_platform.impl.MobilePlatformImpl#getLeftWheelPosition <em>Left Wheel Position</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.mobile_platform.impl.MobilePlatformImpl#getRightWheelPosition <em>Right Wheel Position</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.mobile_platform.impl.MobilePlatformImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MobilePlatformImpl extends MinimalEObjectImpl.Container implements MobilePlatform
{		
	/**
	 * The default value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIALIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
	protected boolean initialized = INITIALIZED_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisposed() <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisposed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPOSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisposed() <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisposed()
	 * @generated
	 * @ordered
	 */
	protected boolean disposed = DISPOSED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionError() <em>Position Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionError()
	 * @generated
	 * @ordered
	 */
	protected static final double POSITION_ERROR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPositionError() <em>Position Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionError()
	 * @generated
	 * @ordered
	 */
	protected double positionError = POSITION_ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinearVelocity() <em>Linear Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double LINEAR_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLinearVelocity() <em>Linear Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearVelocity()
	 * @generated
	 * @ordered
	 */
	protected double linearVelocity = LINEAR_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAngularVelocity() <em>Angular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double ANGULAR_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAngularVelocity() <em>Angular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected double angularVelocity = ANGULAR_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeftWheelPosition() <em>Left Wheel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftWheelPosition()
	 * @generated
	 * @ordered
	 */
	protected static final double LEFT_WHEEL_POSITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLeftWheelPosition() <em>Left Wheel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftWheelPosition()
	 * @generated
	 * @ordered
	 */
	protected double leftWheelPosition = LEFT_WHEEL_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRightWheelPosition() <em>Right Wheel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightWheelPosition()
	 * @generated
	 * @ordered
	 */
	protected static final double RIGHT_WHEEL_POSITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRightWheelPosition() <em>Right Wheel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightWheelPosition()
	 * @generated
	 * @ordered
	 */
	protected double rightWheelPosition = RIGHT_WHEEL_POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobilePlatformImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return EMFEcoreExampleMobilePlatformPackage.Literals.MOBILE_PLATFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialized() {
		return initialized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialized(boolean newInitialized) {
		boolean oldInitialized = initialized;
		initialized = newInitialized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__INITIALIZED, oldInitialized, initialized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisposed() {
		return disposed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposed(boolean newDisposed) {
		boolean oldDisposed = disposed;
		disposed = newDisposed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__DISPOSED, oldDisposed, disposed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Position getPosition()
	{
		if (this.position == null){
			setPosition(EMFEcoreExampleMobilePlatformFactory.eINSTANCE.createPosition());
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position basicGetPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition)
	{
		Position oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPositionError()
	{
		return positionError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionError(double newPositionError)
	{
		double oldPositionError = positionError;
		positionError = newPositionError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__POSITION_ERROR, oldPositionError, positionError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLinearVelocity() {
		return linearVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearVelocity(double newLinearVelocity) {
		double oldLinearVelocity = linearVelocity;
		linearVelocity = newLinearVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__LINEAR_VELOCITY, oldLinearVelocity, linearVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAngularVelocity() {
		return angularVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngularVelocity(double newAngularVelocity) {
		double oldAngularVelocity = angularVelocity;
		angularVelocity = newAngularVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__ANGULAR_VELOCITY, oldAngularVelocity, angularVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLeftWheelPosition()
	{
		return leftWheelPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftWheelPosition(double newLeftWheelPosition)
	{
		double oldLeftWheelPosition = leftWheelPosition;
		leftWheelPosition = newLeftWheelPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__LEFT_WHEEL_POSITION, oldLeftWheelPosition, leftWheelPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRightWheelPosition()
	{
		return rightWheelPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightWheelPosition(double newRightWheelPosition)
	{
		double oldRightWheelPosition = rightWheelPosition;
		rightWheelPosition = newRightWheelPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__RIGHT_WHEEL_POSITION, oldRightWheelPosition, rightWheelPosition));
	}

	/**
	 * This operation is used to initialize the mobile platform
	 * and as such, it will perform the required creation and
	 * initialization steps.
	 * 
	 * @return Whether or not the mobile platform was successfully initialized
	 * @generated_NOT
	 */
	abstract public boolean init();

	/**
	 * This operation is used to dispose of the mobile platform
	 * and as such, it will perform the steps required to
	 * shutdown the platform and any resources it uses.  Note
	 * that implicitly, this means that the mobile platform won't
	 * be available after it has been disposed.
	 * 
	 * @generated_NOT
	 */
	abstract public void dispose();
	
	/**
	 * This operation is used to change the mobile platform to
	 * have the coordinates and pose matching the given position.
	 * That new position will be considered the new starting place
	 * for the mobile platform and as such, the accumulated error will
	 * be cleared; all error will be relative to that new position.
	 * 
	 * @param position The mobile platform's new desired position
	 * @generated_NOT
	 */
	abstract public void resetPosition(Position position);

	/**
	 * This operation is used to clear the mobile platform's positional
	 * error; this could be used to indicate that all error should now
	 * be taken in respect to the robot's current position.
	 * 
	 * @generated_NOT
	 */
	abstract public void clearPositionError();

	/**
	 * This operation is used to stop the mobile platform, if it is 
	 * currently moving.
	 * 
	 * @generated_NOT
	 */
	abstract public void stop();
	
	/**
	 * This operation is used move the mobile platform to the
	 * specified coordinates.
	 * 
	 * @param x This is the mobile platform's desired X coordinate.
	 * @param y This is the mobile platform's desired Y coordinate.
	 * @generated_NOT
	 */
	abstract public void moveTo(double x, double y);

	/**
	 * This operation is used to change the mobile platform's linear
	 * velocity (in metres per second) to the specified value.
	 * <p>
	 * Note: Unlike the traditional definition of linear velocity as a vector,
	 * this is simply a signed scalar; a positive value indicates the speed
	 * forward while a negative value is the speed backwards.  Zero means there
	 * is no movement.
	 * 
	 * @param linearVelocity The mobile platform's new linear velocity (in m/s)
	 * @see #cmdVelocities(double, double)
	 * @generated_NOT
	 */
	abstract public void cmdLinearVelocity(double linearVelocity);

	/**
	 * This operation is used to change the mobile platform's angular
	 * velocity (in radians per second) to the specified value.
	 * <p>
	 * Note: Unlike the traditional definition of angular velocity as a vector,
	 * this is simply a signed scalar; a positive value is the rotation in the
	 * clockwise direction while a negative value implies the rotation is in the
	 * counter-clockwise direction.  Zero means there is no rotation.
	 * 
	 * @param angularVelocity The mobile platform's new angular velocity (in rad/s)
	 * @see #cmdVelocities(double, double)
	 * @generated_NOT
	 */
	abstract public void cmdAngularVelocity(double angularVelocity);

	/**
	 * The operation is used to change the mobile platform's linear and
	 * angular velocities, which are in metres / second and radians / second,
	 * respectively.
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
	 * @param linearVelocity The commanded linear velocity.
	 * @param angularVelocity The commanded angular velocity.
	 * @see #cmdLinearVelocity(double)
	 * @see #cmdAngularVelocity(double)
	 * @generated_NOT
	 */
	abstract public void cmdVelocities(double linearVelocity,
									   double angularVelocity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__INITIALIZED:
				return isInitialized();
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__DISPOSED:
				return isDisposed();
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__POSITION_ERROR:
				return getPositionError();
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__LINEAR_VELOCITY:
				return getLinearVelocity();
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__ANGULAR_VELOCITY:
				return getAngularVelocity();
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__LEFT_WHEEL_POSITION:
				return getLeftWheelPosition();
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__RIGHT_WHEEL_POSITION:
				return getRightWheelPosition();
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__INITIALIZED:
				setInitialized((Boolean)newValue);
				return;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__DISPOSED:
				setDisposed((Boolean)newValue);
				return;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__POSITION_ERROR:
				setPositionError((Double)newValue);
				return;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__LINEAR_VELOCITY:
				setLinearVelocity((Double)newValue);
				return;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__ANGULAR_VELOCITY:
				setAngularVelocity((Double)newValue);
				return;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__LEFT_WHEEL_POSITION:
				setLeftWheelPosition((Double)newValue);
				return;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__RIGHT_WHEEL_POSITION:
				setRightWheelPosition((Double)newValue);
				return;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__POSITION:
				setPosition((Position)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__INITIALIZED:
				setInitialized(INITIALIZED_EDEFAULT);
				return;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__DISPOSED:
				setDisposed(DISPOSED_EDEFAULT);
				return;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__POSITION_ERROR:
				setPositionError(POSITION_ERROR_EDEFAULT);
				return;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__LINEAR_VELOCITY:
				setLinearVelocity(LINEAR_VELOCITY_EDEFAULT);
				return;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__ANGULAR_VELOCITY:
				setAngularVelocity(ANGULAR_VELOCITY_EDEFAULT);
				return;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__LEFT_WHEEL_POSITION:
				setLeftWheelPosition(LEFT_WHEEL_POSITION_EDEFAULT);
				return;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__RIGHT_WHEEL_POSITION:
				setRightWheelPosition(RIGHT_WHEEL_POSITION_EDEFAULT);
				return;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__POSITION:
				setPosition((Position)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__INITIALIZED:
				return initialized != INITIALIZED_EDEFAULT;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__DISPOSED:
				return disposed != DISPOSED_EDEFAULT;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__POSITION_ERROR:
				return positionError != POSITION_ERROR_EDEFAULT;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__LINEAR_VELOCITY:
				return linearVelocity != LINEAR_VELOCITY_EDEFAULT;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__ANGULAR_VELOCITY:
				return angularVelocity != ANGULAR_VELOCITY_EDEFAULT;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__LEFT_WHEEL_POSITION:
				return leftWheelPosition != LEFT_WHEEL_POSITION_EDEFAULT;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__RIGHT_WHEEL_POSITION:
				return rightWheelPosition != RIGHT_WHEEL_POSITION_EDEFAULT;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM__POSITION:
				return position != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID) {
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM___INIT:
				return init();
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM___RESET_POSITION__POSITION:
				resetPosition((Position)arguments.get(0));
				return null;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM___CLEAR_POSITION_ERROR:
				clearPositionError();
				return null;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM___STOP:
				stop();
				return null;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM___MOVE_TO__DOUBLE_DOUBLE:
				moveTo((Double)arguments.get(0), (Double)arguments.get(1));
				return null;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM___CMD_LINEAR_VELOCITY__DOUBLE:
				cmdLinearVelocity((Double)arguments.get(0));
				return null;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM___CMD_ANGULAR_VELOCITY__DOUBLE:
				cmdAngularVelocity((Double)arguments.get(0));
				return null;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM___CMD_VELOCITIES__DOUBLE_DOUBLE:
				cmdVelocities((Double)arguments.get(0), (Double)arguments.get(1));
				return null;
			case EMFEcoreExampleMobilePlatformPackage.MOBILE_PLATFORM___DISPOSE:
				dispose();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (initialized: ");
		result.append(initialized);
		result.append(", disposed: ");
		result.append(disposed);
		result.append(", positionError: ");
		result.append(positionError);
		result.append(", linearVelocity: ");
		result.append(linearVelocity);
		result.append(", angularVelocity: ");
		result.append(angularVelocity);
		result.append(", leftWheelPosition: ");
		result.append(leftWheelPosition);
		result.append(", rightWheelPosition: ");
		result.append(rightWheelPosition);
		result.append(')');
		return result.toString();
	}

} //MobilePlatformImpl
