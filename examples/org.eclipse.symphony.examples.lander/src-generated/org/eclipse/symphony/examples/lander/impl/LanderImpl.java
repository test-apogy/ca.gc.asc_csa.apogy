/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lander.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.addons.vehicle.Thruster;
import org.eclipse.symphony.examples.lander.EMFEcoreExampleLanderPackage;
import org.eclipse.symphony.examples.lander.Lander;
import org.eclipse.symphony.examples.lander.LanderLegExtension;
import org.eclipse.symphony.examples.lander.Position;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lander</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.LanderImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.LanderImpl#getThruster <em>Thruster</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.LanderImpl#getLegAExtension <em>Leg AExtension</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.LanderImpl#getLegBExtension <em>Leg BExtension</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.LanderImpl#getLegCExtension <em>Leg CExtension</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.LanderImpl#getLegAPosition <em>Leg APosition</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.LanderImpl#getLegBPosition <em>Leg BPosition</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.LanderImpl#getLegCPosition <em>Leg CPosition</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.LanderImpl#getXAngularVelocity <em>XAngular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.LanderImpl#getYAngularVelocity <em>YAngular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.LanderImpl#getMass <em>Mass</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.LanderImpl#getGravitationalPull <em>Gravitational Pull</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.LanderImpl#isChangingLegs <em>Changing Legs</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.LanderImpl#isChangingAttitude <em>Changing Attitude</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.LanderImpl#isChangingLocation <em>Changing Location</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.LanderImpl#isFlyingEnabled <em>Flying Enabled</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.LanderImpl#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.LanderImpl#isDisposed <em>Disposed</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LanderImpl extends MinimalEObjectImpl.Container implements Lander
{
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position;

	/**
	 * The cached value of the '{@link #getThruster() <em>Thruster</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruster()
	 * @generated
	 * @ordered
	 */
	protected Thruster thruster;

	/**
	 * The default value of the '{@link #getLegAExtension() <em>Leg AExtension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegAExtension()
	 * @generated
	 * @ordered
	 */
	protected static final LanderLegExtension LEG_AEXTENSION_EDEFAULT = LanderLegExtension.LEG_POSITION1;
	/**
	 * The cached value of the '{@link #getLegAExtension() <em>Leg AExtension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegAExtension()
	 * @generated
	 * @ordered
	 */
	protected LanderLegExtension legAExtension = LEG_AEXTENSION_EDEFAULT;
	/**
	 * The default value of the '{@link #getLegBExtension() <em>Leg BExtension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegBExtension()
	 * @generated
	 * @ordered
	 */
	protected static final LanderLegExtension LEG_BEXTENSION_EDEFAULT = LanderLegExtension.LEG_POSITION1;
	/**
	 * The cached value of the '{@link #getLegBExtension() <em>Leg BExtension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegBExtension()
	 * @generated
	 * @ordered
	 */
	protected LanderLegExtension legBExtension = LEG_BEXTENSION_EDEFAULT;
	/**
	 * The default value of the '{@link #getLegCExtension() <em>Leg CExtension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegCExtension()
	 * @generated
	 * @ordered
	 */
	protected static final LanderLegExtension LEG_CEXTENSION_EDEFAULT = LanderLegExtension.LEG_POSITION1;
	/**
	 * The cached value of the '{@link #getLegCExtension() <em>Leg CExtension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegCExtension()
	 * @generated
	 * @ordered
	 */
	protected LanderLegExtension legCExtension = LEG_CEXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLegAPosition() <em>Leg APosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegAPosition()
	 * @generated
	 * @ordered
	 */
	protected static final double LEG_APOSITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLegAPosition() <em>Leg APosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegAPosition()
	 * @generated
	 * @ordered
	 */
	protected double legAPosition = LEG_APOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLegBPosition() <em>Leg BPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegBPosition()
	 * @generated
	 * @ordered
	 */
	protected static final double LEG_BPOSITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLegBPosition() <em>Leg BPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegBPosition()
	 * @generated
	 * @ordered
	 */
	protected double legBPosition = LEG_BPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLegCPosition() <em>Leg CPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegCPosition()
	 * @generated
	 * @ordered
	 */
	protected static final double LEG_CPOSITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLegCPosition() <em>Leg CPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegCPosition()
	 * @generated
	 * @ordered
	 */
	protected double legCPosition = LEG_CPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getXAngularVelocity() <em>XAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double XANGULAR_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXAngularVelocity() <em>XAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected double xAngularVelocity = XANGULAR_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getYAngularVelocity() <em>YAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double YANGULAR_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYAngularVelocity() <em>YAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected double yAngularVelocity = YANGULAR_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMass() <em>Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected static final double MASS_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getGravitationalPull() <em>Gravitational Pull</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravitationalPull()
	 * @generated
	 * @ordered
	 */
	protected static final double GRAVITATIONAL_PULL_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #isChangingLegs() <em>Changing Legs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangingLegs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHANGING_LEGS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isChangingLegs() <em>Changing Legs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangingLegs()
	 * @generated
	 * @ordered
	 */
	protected boolean changingLegs = CHANGING_LEGS_EDEFAULT;

	/**
	 * The default value of the '{@link #isChangingAttitude() <em>Changing Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangingAttitude()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHANGING_ATTITUDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isChangingAttitude() <em>Changing Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangingAttitude()
	 * @generated
	 * @ordered
	 */
	protected boolean changingAttitude = CHANGING_ATTITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #isChangingLocation() <em>Changing Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangingLocation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHANGING_LOCATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isChangingLocation() <em>Changing Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangingLocation()
	 * @generated
	 * @ordered
	 */
	protected boolean changingLocation = CHANGING_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isFlyingEnabled() <em>Flying Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlyingEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLYING_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFlyingEnabled() <em>Flying Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlyingEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean flyingEnabled = FLYING_ENABLED_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanderImpl()
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
		return EMFEcoreExampleLanderPackage.Literals.LANDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition()
	{
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Position newPosition, NotificationChain msgs)
	{
		Position oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.LANDER__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition)
	{
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreExampleLanderPackage.LANDER__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFEcoreExampleLanderPackage.LANDER__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.LANDER__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thruster getThruster() {
		return thruster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThruster(Thruster newThruster, NotificationChain msgs) {
		Thruster oldThruster = thruster;
		thruster = newThruster;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.LANDER__THRUSTER, oldThruster, newThruster);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThruster(Thruster newThruster) {
		if (newThruster != thruster) {
			NotificationChain msgs = null;
			if (thruster != null)
				msgs = ((InternalEObject)thruster).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreExampleLanderPackage.LANDER__THRUSTER, null, msgs);
			if (newThruster != null)
				msgs = ((InternalEObject)newThruster).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFEcoreExampleLanderPackage.LANDER__THRUSTER, null, msgs);
			msgs = basicSetThruster(newThruster, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.LANDER__THRUSTER, newThruster, newThruster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLegAPosition()
	{
		return legAPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegAPosition(double newLegAPosition)
	{
		double oldLegAPosition = legAPosition;
		legAPosition = newLegAPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.LANDER__LEG_APOSITION, oldLegAPosition, legAPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanderLegExtension getLegAExtension()
	{
		return legAExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegAExtension(LanderLegExtension newLegAExtension)
	{
		LanderLegExtension oldLegAExtension = legAExtension;
		legAExtension = newLegAExtension == null ? LEG_AEXTENSION_EDEFAULT : newLegAExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.LANDER__LEG_AEXTENSION, oldLegAExtension, legAExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLegBPosition()
	{
		return legBPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegBPosition(double newLegBPosition)
	{
		double oldLegBPosition = legBPosition;
		legBPosition = newLegBPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.LANDER__LEG_BPOSITION, oldLegBPosition, legBPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanderLegExtension getLegBExtension()
	{
		return legBExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegBExtension(LanderLegExtension newLegBExtension)
	{
		LanderLegExtension oldLegBExtension = legBExtension;
		legBExtension = newLegBExtension == null ? LEG_BEXTENSION_EDEFAULT : newLegBExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.LANDER__LEG_BEXTENSION, oldLegBExtension, legBExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLegCPosition()
	{
		return legCPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegCPosition(double newLegCPosition)
	{
		double oldLegCPosition = legCPosition;
		legCPosition = newLegCPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.LANDER__LEG_CPOSITION, oldLegCPosition, legCPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanderLegExtension getLegCExtension()
	{
		return legCExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegCExtension(LanderLegExtension newLegCExtension)
	{
		LanderLegExtension oldLegCExtension = legCExtension;
		legCExtension = newLegCExtension == null ? LEG_CEXTENSION_EDEFAULT : newLegCExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.LANDER__LEG_CEXTENSION, oldLegCExtension, legCExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXAngularVelocity()
	{
		return xAngularVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAngularVelocity(double newXAngularVelocity)
	{
		double oldXAngularVelocity = xAngularVelocity;
		xAngularVelocity = newXAngularVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.LANDER__XANGULAR_VELOCITY, oldXAngularVelocity, xAngularVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYAngularVelocity()
	{
		return yAngularVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYAngularVelocity(double newYAngularVelocity)
	{
		double oldYAngularVelocity = yAngularVelocity;
		yAngularVelocity = newYAngularVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.LANDER__YANGULAR_VELOCITY, oldYAngularVelocity, yAngularVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFlyingEnabled() {
		return flyingEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlyingEnabled(boolean newFlyingEnabled) {
		boolean oldFlyingEnabled = flyingEnabled;
		flyingEnabled = newFlyingEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.LANDER__FLYING_ENABLED, oldFlyingEnabled, flyingEnabled));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.LANDER__INITIALIZED, oldInitialized, initialized));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.LANDER__DISPOSED, oldDisposed, disposed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChangingLegs() {
		return changingLegs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangingLegs(boolean newChangingLegs) {
		boolean oldChangingLegs = changingLegs;
		changingLegs = newChangingLegs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.LANDER__CHANGING_LEGS, oldChangingLegs, changingLegs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChangingAttitude() {
		return changingAttitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangingAttitude(boolean newChangingAttitude) {
		boolean oldChangingAttitude = changingAttitude;
		changingAttitude = newChangingAttitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.LANDER__CHANGING_ATTITUDE, oldChangingAttitude, changingAttitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChangingLocation() {
		return changingLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangingLocation(boolean newChangingLocation) {
		boolean oldChangingLocation = changingLocation;
		changingLocation = newChangingLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.LANDER__CHANGING_LOCATION, oldChangingLocation, changingLocation));
	}

	/**
	 * This is the mass of the lander (in kg).
	 * @return The mass of the lander (in kg).
	 * @generated_NOT
	 */
	abstract public double getMass();

	/**
	 * This is the amount of force (in N) of gravity that is being
	 * imposed upon the lander.
	 * <p>
	 * Recall that that the gravitational force impose on an object
	 * (like a lander) in relation to a celestial body is affected by:
	 * <ul>
	 * 	 <li>the mass of the lander</li>
	 *   <li>the mass of the celestial body the lander is on / above</li>
	 *   <li>the distance between the lander and the body</li>
	 * </ul>
	 * @see #canFly()
	 * @return The amount of gravitational force (in N) imposed upon the lander 
	 * @generated_NOT
	 */
	abstract public double getGravitationalPull();
	
	/**
	 * This operation performs the steps required in order to
	 * initialize the lander.
	 * @return Whether or not the lander was successfully initialized
	 * @generated_NOT
	 */
	abstract public boolean init();

	/**
	 * This operation is used to perform operations to cleanup the lander
	 * when it is no longer needed.
	 * @generated_NOT
	 */
	abstract public void dispose();
	
	/**
	 * This operation is used to change the extension positions
	 * for each of the legs of the lander.  Note that extending or
	 * retracting the legs is a non-instantaneous process and it's
	 * likely it will take some period of time to move the lander's
	 * legs to the target positions.
	 * @param legAExtension The new leg extension position for leg A.
	 * @param legBExtension The new leg extension position for leg B.
	 * @param legCExtension The new leg extension position for leg C.
	 * @generated_NOT
	 */
	abstract public void commandLegPosition(LanderLegExtension legAExtension,
											LanderLegExtension legBExtension,
											LanderLegExtension legCExtension);
	/**
	 * This operation is used to update the both the lander's X and Y
	 * angular velocities (in radians per second.)
	 * <p>
	 * Note: Unlike the traditional definition of angular
	 * velocity as a vector, these are simply signed scalars;
	 * a positive value is the rotation in the counter-
	 * clockwise direction while a negative value implies the
	 * rotation is in the clockwise direction.  Zero means
	 * there is no rotation.
	 * @param xAngularVelocity The new X angular velocity for the lander (given in radians / second)
	 * @param yAngularVelocity The new Y angular velocity for the lander (given in radians / second)
	 * @generated_NOT
	 */
	abstract public void commandAngularVelocities(double xAngularVelocity,
												  double yAngularVelocity);

	/**
	 * This operation is used to update the lander's thrust level
	 * (which is given in newtons.)
	 * <p>
	 * Note: The thrust level is always bounded by
	 * 		 [thruster.getMinimumThrust(), thruster.getMaximumThrust()]
	 * 
	 * @param thrustLevel The lander's new thrust level (given in N)
	 * @generated_NOT
	 */
	abstract public void commandThrust(double thrustLevel);

	/**
	 * This operation is used to change the lander's current thrust
	 * level by the specified (absolute) offset (which is given in
	 * newtons.)
	 * <p> 
	 * Note: The thrust level is always bounded by
	 * 		 [thruster.getMinimumThrust(), thruster.getMaximumThrust()]
	 * 
	 * @param thrustOffset The amount (in N) that the thrust level should be increased / decreased. 
	 * @generated_NOT
	 */
	abstract public void changeThrustBy(double thrustOffset);

	/**
	 * This operation is used to permit the lander to start flying.
	 * <p>
	 * Whether or not the lander is able to actually fly is dependent on
	 * the mass of the lander, the lander's current thrust and the gravity
	 * being used (e.g. the Earth's gravity, g ~= -9.81); there may
	 * potentially be other factors as well.
	 * 
	 * @param logStateChanges Whether or not to log the state changes that occur because it has started flying
	 * @see #stopFlying()
	 * @generated_NOT
	 */
	abstract public void startFlying(boolean logStateChanges);

	/**
	 * This operation is used to indicate that the lander is no longer
	 * allowed to fly and should stop doing so.
	 * 
	 * @see #startFlying()
	 * @generated_NOT
	 */
	abstract public void stopFlying();

	/**
	 * This operation is used to move the lander to the specified X, Y and
	 * Z coordinates.
	 * 
	 * @param x The lander's new desired X coordinate
	 * @param y The lander's new desired Y coordinate
	 * @param z The lander's new desired Z coordinate
	 * @generated_NOT
	 */
	abstract public void moveTo(double x, double y, double z);

	/**
	 * This operation is used to change the lander's attitude /
	 * orientation to the specified angles.
	 * 
	 * @param xAngle The lander's new angle of rotation (in radians) around the X axis
	 * @param yAngle The lander's new angle of rotation (in radians) around the Y axis
	 * @param zAngle The lander's new angle of rotation (in radians) around the Z axis
	 * @generated_NOT
	 */
	abstract public void changeAttitude(double xAngle,
										double yAngle,
										double zAngle);

	/**
	 * This operation is used to reset the lander's attitude /
	 * position to its initial state, namely where there is no
	 * rotation from any of the primary axes (X, Y, Z).
	 * 
	 * @generated_NOT
	 */
	abstract public void resetAttitude();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case EMFEcoreExampleLanderPackage.LANDER__POSITION:
				return basicSetPosition(null, msgs);
			case EMFEcoreExampleLanderPackage.LANDER__THRUSTER:
				return basicSetThruster(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case EMFEcoreExampleLanderPackage.LANDER__POSITION:
				return getPosition();
			case EMFEcoreExampleLanderPackage.LANDER__THRUSTER:
				return getThruster();
			case EMFEcoreExampleLanderPackage.LANDER__LEG_AEXTENSION:
				return getLegAExtension();
			case EMFEcoreExampleLanderPackage.LANDER__LEG_BEXTENSION:
				return getLegBExtension();
			case EMFEcoreExampleLanderPackage.LANDER__LEG_CEXTENSION:
				return getLegCExtension();
			case EMFEcoreExampleLanderPackage.LANDER__LEG_APOSITION:
				return getLegAPosition();
			case EMFEcoreExampleLanderPackage.LANDER__LEG_BPOSITION:
				return getLegBPosition();
			case EMFEcoreExampleLanderPackage.LANDER__LEG_CPOSITION:
				return getLegCPosition();
			case EMFEcoreExampleLanderPackage.LANDER__XANGULAR_VELOCITY:
				return getXAngularVelocity();
			case EMFEcoreExampleLanderPackage.LANDER__YANGULAR_VELOCITY:
				return getYAngularVelocity();
			case EMFEcoreExampleLanderPackage.LANDER__MASS:
				return getMass();
			case EMFEcoreExampleLanderPackage.LANDER__GRAVITATIONAL_PULL:
				return getGravitationalPull();
			case EMFEcoreExampleLanderPackage.LANDER__CHANGING_LEGS:
				return isChangingLegs();
			case EMFEcoreExampleLanderPackage.LANDER__CHANGING_ATTITUDE:
				return isChangingAttitude();
			case EMFEcoreExampleLanderPackage.LANDER__CHANGING_LOCATION:
				return isChangingLocation();
			case EMFEcoreExampleLanderPackage.LANDER__FLYING_ENABLED:
				return isFlyingEnabled();
			case EMFEcoreExampleLanderPackage.LANDER__INITIALIZED:
				return isInitialized();
			case EMFEcoreExampleLanderPackage.LANDER__DISPOSED:
				return isDisposed();
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
			case EMFEcoreExampleLanderPackage.LANDER__POSITION:
				setPosition((Position)newValue);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__THRUSTER:
				setThruster((Thruster)newValue);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__LEG_AEXTENSION:
				setLegAExtension((LanderLegExtension)newValue);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__LEG_BEXTENSION:
				setLegBExtension((LanderLegExtension)newValue);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__LEG_CEXTENSION:
				setLegCExtension((LanderLegExtension)newValue);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__LEG_APOSITION:
				setLegAPosition((Double)newValue);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__LEG_BPOSITION:
				setLegBPosition((Double)newValue);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__LEG_CPOSITION:
				setLegCPosition((Double)newValue);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__XANGULAR_VELOCITY:
				setXAngularVelocity((Double)newValue);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__YANGULAR_VELOCITY:
				setYAngularVelocity((Double)newValue);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__CHANGING_LEGS:
				setChangingLegs((Boolean)newValue);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__CHANGING_ATTITUDE:
				setChangingAttitude((Boolean)newValue);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__CHANGING_LOCATION:
				setChangingLocation((Boolean)newValue);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__FLYING_ENABLED:
				setFlyingEnabled((Boolean)newValue);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__INITIALIZED:
				setInitialized((Boolean)newValue);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__DISPOSED:
				setDisposed((Boolean)newValue);
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
			case EMFEcoreExampleLanderPackage.LANDER__POSITION:
				setPosition((Position)null);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__THRUSTER:
				setThruster((Thruster)null);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__LEG_AEXTENSION:
				setLegAExtension(LEG_AEXTENSION_EDEFAULT);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__LEG_BEXTENSION:
				setLegBExtension(LEG_BEXTENSION_EDEFAULT);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__LEG_CEXTENSION:
				setLegCExtension(LEG_CEXTENSION_EDEFAULT);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__LEG_APOSITION:
				setLegAPosition(LEG_APOSITION_EDEFAULT);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__LEG_BPOSITION:
				setLegBPosition(LEG_BPOSITION_EDEFAULT);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__LEG_CPOSITION:
				setLegCPosition(LEG_CPOSITION_EDEFAULT);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__XANGULAR_VELOCITY:
				setXAngularVelocity(XANGULAR_VELOCITY_EDEFAULT);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__YANGULAR_VELOCITY:
				setYAngularVelocity(YANGULAR_VELOCITY_EDEFAULT);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__CHANGING_LEGS:
				setChangingLegs(CHANGING_LEGS_EDEFAULT);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__CHANGING_ATTITUDE:
				setChangingAttitude(CHANGING_ATTITUDE_EDEFAULT);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__CHANGING_LOCATION:
				setChangingLocation(CHANGING_LOCATION_EDEFAULT);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__FLYING_ENABLED:
				setFlyingEnabled(FLYING_ENABLED_EDEFAULT);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__INITIALIZED:
				setInitialized(INITIALIZED_EDEFAULT);
				return;
			case EMFEcoreExampleLanderPackage.LANDER__DISPOSED:
				setDisposed(DISPOSED_EDEFAULT);
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
			case EMFEcoreExampleLanderPackage.LANDER__POSITION:
				return position != null;
			case EMFEcoreExampleLanderPackage.LANDER__THRUSTER:
				return thruster != null;
			case EMFEcoreExampleLanderPackage.LANDER__LEG_AEXTENSION:
				return legAExtension != LEG_AEXTENSION_EDEFAULT;
			case EMFEcoreExampleLanderPackage.LANDER__LEG_BEXTENSION:
				return legBExtension != LEG_BEXTENSION_EDEFAULT;
			case EMFEcoreExampleLanderPackage.LANDER__LEG_CEXTENSION:
				return legCExtension != LEG_CEXTENSION_EDEFAULT;
			case EMFEcoreExampleLanderPackage.LANDER__LEG_APOSITION:
				return legAPosition != LEG_APOSITION_EDEFAULT;
			case EMFEcoreExampleLanderPackage.LANDER__LEG_BPOSITION:
				return legBPosition != LEG_BPOSITION_EDEFAULT;
			case EMFEcoreExampleLanderPackage.LANDER__LEG_CPOSITION:
				return legCPosition != LEG_CPOSITION_EDEFAULT;
			case EMFEcoreExampleLanderPackage.LANDER__XANGULAR_VELOCITY:
				return xAngularVelocity != XANGULAR_VELOCITY_EDEFAULT;
			case EMFEcoreExampleLanderPackage.LANDER__YANGULAR_VELOCITY:
				return yAngularVelocity != YANGULAR_VELOCITY_EDEFAULT;
			case EMFEcoreExampleLanderPackage.LANDER__MASS:
				return getMass() != MASS_EDEFAULT;
			case EMFEcoreExampleLanderPackage.LANDER__GRAVITATIONAL_PULL:
				return getGravitationalPull() != GRAVITATIONAL_PULL_EDEFAULT;
			case EMFEcoreExampleLanderPackage.LANDER__CHANGING_LEGS:
				return changingLegs != CHANGING_LEGS_EDEFAULT;
			case EMFEcoreExampleLanderPackage.LANDER__CHANGING_ATTITUDE:
				return changingAttitude != CHANGING_ATTITUDE_EDEFAULT;
			case EMFEcoreExampleLanderPackage.LANDER__CHANGING_LOCATION:
				return changingLocation != CHANGING_LOCATION_EDEFAULT;
			case EMFEcoreExampleLanderPackage.LANDER__FLYING_ENABLED:
				return flyingEnabled != FLYING_ENABLED_EDEFAULT;
			case EMFEcoreExampleLanderPackage.LANDER__INITIALIZED:
				return initialized != INITIALIZED_EDEFAULT;
			case EMFEcoreExampleLanderPackage.LANDER__DISPOSED:
				return disposed != DISPOSED_EDEFAULT;
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
			case EMFEcoreExampleLanderPackage.LANDER___INIT:
				return init();
			case EMFEcoreExampleLanderPackage.LANDER___COMMAND_LEG_POSITION__LANDERLEGEXTENSION_LANDERLEGEXTENSION_LANDERLEGEXTENSION:
				commandLegPosition((LanderLegExtension)arguments.get(0), (LanderLegExtension)arguments.get(1), (LanderLegExtension)arguments.get(2));
				return null;
			case EMFEcoreExampleLanderPackage.LANDER___MOVE_TO__DOUBLE_DOUBLE_DOUBLE:
				moveTo((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
				return null;
			case EMFEcoreExampleLanderPackage.LANDER___CHANGE_ATTITUDE__DOUBLE_DOUBLE_DOUBLE:
				changeAttitude((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
				return null;
			case EMFEcoreExampleLanderPackage.LANDER___RESET_ATTITUDE:
				resetAttitude();
				return null;
			case EMFEcoreExampleLanderPackage.LANDER___COMMAND_ANGULAR_VELOCITIES__DOUBLE_DOUBLE:
				commandAngularVelocities((Double)arguments.get(0), (Double)arguments.get(1));
				return null;
			case EMFEcoreExampleLanderPackage.LANDER___COMMAND_THRUST__DOUBLE:
				commandThrust((Double)arguments.get(0));
				return null;
			case EMFEcoreExampleLanderPackage.LANDER___CHANGE_THRUST_BY__DOUBLE:
				changeThrustBy((Double)arguments.get(0));
				return null;
			case EMFEcoreExampleLanderPackage.LANDER___START_FLYING__BOOLEAN:
				startFlying((Boolean)arguments.get(0));
				return null;
			case EMFEcoreExampleLanderPackage.LANDER___STOP_FLYING:
				stopFlying();
				return null;
			case EMFEcoreExampleLanderPackage.LANDER___DISPOSE:
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
		result.append(" (legAExtension: ");
		result.append(legAExtension);
		result.append(", legBExtension: ");
		result.append(legBExtension);
		result.append(", legCExtension: ");
		result.append(legCExtension);
		result.append(", legAPosition: ");
		result.append(legAPosition);
		result.append(", legBPosition: ");
		result.append(legBPosition);
		result.append(", legCPosition: ");
		result.append(legCPosition);
		result.append(", xAngularVelocity: ");
		result.append(xAngularVelocity);
		result.append(", yAngularVelocity: ");
		result.append(yAngularVelocity);
		result.append(", changingLegs: ");
		result.append(changingLegs);
		result.append(", changingAttitude: ");
		result.append(changingAttitude);
		result.append(", changingLocation: ");
		result.append(changingLocation);
		result.append(", flyingEnabled: ");
		result.append(flyingEnabled);
		result.append(", initialized: ");
		result.append(initialized);
		result.append(", disposed: ");
		result.append(disposed);
		result.append(')');
		return result.toString();
	}

} //LanderImpl
