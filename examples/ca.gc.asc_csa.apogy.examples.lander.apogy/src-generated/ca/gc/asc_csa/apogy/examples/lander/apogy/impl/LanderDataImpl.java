/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.lander.apogy.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.core.impl.ApogyInitializationDataImpl;
import ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension;
import ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData;
import ca.gc.asc_csa.apogy.examples.lander.apogy.ApogyExamplesLanderApogyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lander Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.impl.LanderDataImpl#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.impl.LanderDataImpl#isDisposed <em>Disposed</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.impl.LanderDataImpl#isFlyingEnabled <em>Flying Enabled</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.impl.LanderDataImpl#getLegAExtension <em>Leg AExtension</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.impl.LanderDataImpl#getLegBExtension <em>Leg BExtension</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.impl.LanderDataImpl#getLegCExtension <em>Leg CExtension</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.impl.LanderDataImpl#getCurrThrustLevel <em>Curr Thrust Level</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.impl.LanderDataImpl#getMinThrustLevel <em>Min Thrust Level</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.impl.LanderDataImpl#getMaxThrustLevel <em>Max Thrust Level</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.impl.LanderDataImpl#getXAngularVelocity <em>XAngular Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.impl.LanderDataImpl#getYAngularVelocity <em>YAngular Velocity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LanderDataImpl extends ApogyInitializationDataImpl implements LanderData {
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
	 * The default value of the '{@link #getCurrThrustLevel() <em>Curr Thrust Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrThrustLevel()
	 * @generated
	 * @ordered
	 */
	protected static final double CURR_THRUST_LEVEL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCurrThrustLevel() <em>Curr Thrust Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrThrustLevel()
	 * @generated
	 * @ordered
	 */
	protected double currThrustLevel = CURR_THRUST_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinThrustLevel() <em>Min Thrust Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinThrustLevel()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_THRUST_LEVEL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinThrustLevel() <em>Min Thrust Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinThrustLevel()
	 * @generated
	 * @ordered
	 */
	protected double minThrustLevel = MIN_THRUST_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxThrustLevel() <em>Max Thrust Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxThrustLevel()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_THRUST_LEVEL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxThrustLevel() <em>Max Thrust Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxThrustLevel()
	 * @generated
	 * @ordered
	 */
	protected double maxThrustLevel = MAX_THRUST_LEVEL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanderDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesLanderApogyPackage.Literals.LANDER_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesLanderApogyPackage.LANDER_DATA__INITIALIZED, oldInitialized, initialized));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesLanderApogyPackage.LANDER_DATA__DISPOSED, oldDisposed, disposed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesLanderApogyPackage.LANDER_DATA__FLYING_ENABLED, oldFlyingEnabled, flyingEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanderLegExtension getLegAExtension() {
		return legAExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegAExtension(LanderLegExtension newLegAExtension) {
		LanderLegExtension oldLegAExtension = legAExtension;
		legAExtension = newLegAExtension == null ? LEG_AEXTENSION_EDEFAULT : newLegAExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesLanderApogyPackage.LANDER_DATA__LEG_AEXTENSION, oldLegAExtension, legAExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanderLegExtension getLegBExtension() {
		return legBExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegBExtension(LanderLegExtension newLegBExtension) {
		LanderLegExtension oldLegBExtension = legBExtension;
		legBExtension = newLegBExtension == null ? LEG_BEXTENSION_EDEFAULT : newLegBExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesLanderApogyPackage.LANDER_DATA__LEG_BEXTENSION, oldLegBExtension, legBExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanderLegExtension getLegCExtension() {
		return legCExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegCExtension(LanderLegExtension newLegCExtension) {
		LanderLegExtension oldLegCExtension = legCExtension;
		legCExtension = newLegCExtension == null ? LEG_CEXTENSION_EDEFAULT : newLegCExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesLanderApogyPackage.LANDER_DATA__LEG_CEXTENSION, oldLegCExtension, legCExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCurrThrustLevel() {
		return currThrustLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrThrustLevel(double newCurrThrustLevel) {
		double oldCurrThrustLevel = currThrustLevel;
		currThrustLevel = newCurrThrustLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesLanderApogyPackage.LANDER_DATA__CURR_THRUST_LEVEL, oldCurrThrustLevel, currThrustLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinThrustLevel() {
		return minThrustLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinThrustLevel(double newMinThrustLevel) {
		double oldMinThrustLevel = minThrustLevel;
		minThrustLevel = newMinThrustLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesLanderApogyPackage.LANDER_DATA__MIN_THRUST_LEVEL, oldMinThrustLevel, minThrustLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxThrustLevel() {
		return maxThrustLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxThrustLevel(double newMaxThrustLevel) {
		double oldMaxThrustLevel = maxThrustLevel;
		maxThrustLevel = newMaxThrustLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesLanderApogyPackage.LANDER_DATA__MAX_THRUST_LEVEL, oldMaxThrustLevel, maxThrustLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXAngularVelocity() {
		return xAngularVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAngularVelocity(double newXAngularVelocity) {
		double oldXAngularVelocity = xAngularVelocity;
		xAngularVelocity = newXAngularVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesLanderApogyPackage.LANDER_DATA__XANGULAR_VELOCITY, oldXAngularVelocity, xAngularVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYAngularVelocity() {
		return yAngularVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYAngularVelocity(double newYAngularVelocity) {
		double oldYAngularVelocity = yAngularVelocity;
		yAngularVelocity = newYAngularVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesLanderApogyPackage.LANDER_DATA__YANGULAR_VELOCITY, oldYAngularVelocity, yAngularVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__INITIALIZED:
				return isInitialized();
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__DISPOSED:
				return isDisposed();
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__FLYING_ENABLED:
				return isFlyingEnabled();
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__LEG_AEXTENSION:
				return getLegAExtension();
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__LEG_BEXTENSION:
				return getLegBExtension();
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__LEG_CEXTENSION:
				return getLegCExtension();
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__CURR_THRUST_LEVEL:
				return getCurrThrustLevel();
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__MIN_THRUST_LEVEL:
				return getMinThrustLevel();
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__MAX_THRUST_LEVEL:
				return getMaxThrustLevel();
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__XANGULAR_VELOCITY:
				return getXAngularVelocity();
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__YANGULAR_VELOCITY:
				return getYAngularVelocity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__INITIALIZED:
				setInitialized((Boolean)newValue);
				return;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__DISPOSED:
				setDisposed((Boolean)newValue);
				return;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__FLYING_ENABLED:
				setFlyingEnabled((Boolean)newValue);
				return;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__LEG_AEXTENSION:
				setLegAExtension((LanderLegExtension)newValue);
				return;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__LEG_BEXTENSION:
				setLegBExtension((LanderLegExtension)newValue);
				return;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__LEG_CEXTENSION:
				setLegCExtension((LanderLegExtension)newValue);
				return;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__CURR_THRUST_LEVEL:
				setCurrThrustLevel((Double)newValue);
				return;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__MIN_THRUST_LEVEL:
				setMinThrustLevel((Double)newValue);
				return;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__MAX_THRUST_LEVEL:
				setMaxThrustLevel((Double)newValue);
				return;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__XANGULAR_VELOCITY:
				setXAngularVelocity((Double)newValue);
				return;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__YANGULAR_VELOCITY:
				setYAngularVelocity((Double)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__INITIALIZED:
				setInitialized(INITIALIZED_EDEFAULT);
				return;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__DISPOSED:
				setDisposed(DISPOSED_EDEFAULT);
				return;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__FLYING_ENABLED:
				setFlyingEnabled(FLYING_ENABLED_EDEFAULT);
				return;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__LEG_AEXTENSION:
				setLegAExtension(LEG_AEXTENSION_EDEFAULT);
				return;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__LEG_BEXTENSION:
				setLegBExtension(LEG_BEXTENSION_EDEFAULT);
				return;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__LEG_CEXTENSION:
				setLegCExtension(LEG_CEXTENSION_EDEFAULT);
				return;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__CURR_THRUST_LEVEL:
				setCurrThrustLevel(CURR_THRUST_LEVEL_EDEFAULT);
				return;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__MIN_THRUST_LEVEL:
				setMinThrustLevel(MIN_THRUST_LEVEL_EDEFAULT);
				return;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__MAX_THRUST_LEVEL:
				setMaxThrustLevel(MAX_THRUST_LEVEL_EDEFAULT);
				return;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__XANGULAR_VELOCITY:
				setXAngularVelocity(XANGULAR_VELOCITY_EDEFAULT);
				return;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__YANGULAR_VELOCITY:
				setYAngularVelocity(YANGULAR_VELOCITY_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__INITIALIZED:
				return initialized != INITIALIZED_EDEFAULT;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__DISPOSED:
				return disposed != DISPOSED_EDEFAULT;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__FLYING_ENABLED:
				return flyingEnabled != FLYING_ENABLED_EDEFAULT;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__LEG_AEXTENSION:
				return legAExtension != LEG_AEXTENSION_EDEFAULT;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__LEG_BEXTENSION:
				return legBExtension != LEG_BEXTENSION_EDEFAULT;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__LEG_CEXTENSION:
				return legCExtension != LEG_CEXTENSION_EDEFAULT;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__CURR_THRUST_LEVEL:
				return currThrustLevel != CURR_THRUST_LEVEL_EDEFAULT;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__MIN_THRUST_LEVEL:
				return minThrustLevel != MIN_THRUST_LEVEL_EDEFAULT;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__MAX_THRUST_LEVEL:
				return maxThrustLevel != MAX_THRUST_LEVEL_EDEFAULT;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__XANGULAR_VELOCITY:
				return xAngularVelocity != XANGULAR_VELOCITY_EDEFAULT;
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__YANGULAR_VELOCITY:
				return yAngularVelocity != YANGULAR_VELOCITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (initialized: ");
		result.append(initialized);
		result.append(", disposed: ");
		result.append(disposed);
		result.append(", flyingEnabled: ");
		result.append(flyingEnabled);
		result.append(", legAExtension: ");
		result.append(legAExtension);
		result.append(", legBExtension: ");
		result.append(legBExtension);
		result.append(", legCExtension: ");
		result.append(legCExtension);
		result.append(", currThrustLevel: ");
		result.append(currThrustLevel);
		result.append(", minThrustLevel: ");
		result.append(minThrustLevel);
		result.append(", maxThrustLevel: ");
		result.append(maxThrustLevel);
		result.append(", xAngularVelocity: ");
		result.append(xAngularVelocity);
		result.append(", yAngularVelocity: ");
		result.append(yAngularVelocity);
		result.append(')');
		return result.toString();
	}

} //LanderDataImpl
