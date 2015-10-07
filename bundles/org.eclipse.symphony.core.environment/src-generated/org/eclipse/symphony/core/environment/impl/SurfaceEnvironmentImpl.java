/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.core.environment.Atmosphere;
import org.eclipse.symphony.core.environment.SurfaceEnvironment;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Surface Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.SurfaceEnvironmentImpl#getAtmosphere <em>Atmosphere</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.SurfaceEnvironmentImpl#getGravity <em>Gravity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SurfaceEnvironmentImpl extends EnvironmentImpl implements SurfaceEnvironment
{
  /**
	 * The cached value of the '{@link #getAtmosphere() <em>Atmosphere</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAtmosphere()
	 * @generated
	 * @ordered
	 */
  protected Atmosphere atmosphere;
  /**
	 * The cached value of the '{@link #getGravity() <em>Gravity</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getGravity()
	 * @generated
	 * @ordered
	 */
  protected Tuple3d gravity;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SurfaceEnvironmentImpl()
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
		return SymphonyEnvironmentPackage.Literals.SURFACE_ENVIRONMENT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Atmosphere getAtmosphere()
  {
		return atmosphere;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAtmosphere(Atmosphere newAtmosphere, NotificationChain msgs)
  {
		Atmosphere oldAtmosphere = atmosphere;
		atmosphere = newAtmosphere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.SURFACE_ENVIRONMENT__ATMOSPHERE, oldAtmosphere, newAtmosphere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAtmosphere(Atmosphere newAtmosphere)
  {
		if (newAtmosphere != atmosphere) {
			NotificationChain msgs = null;
			if (atmosphere != null)
				msgs = ((InternalEObject)atmosphere).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyEnvironmentPackage.SURFACE_ENVIRONMENT__ATMOSPHERE, null, msgs);
			if (newAtmosphere != null)
				msgs = ((InternalEObject)newAtmosphere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyEnvironmentPackage.SURFACE_ENVIRONMENT__ATMOSPHERE, null, msgs);
			msgs = basicSetAtmosphere(newAtmosphere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.SURFACE_ENVIRONMENT__ATMOSPHERE, newAtmosphere, newAtmosphere));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Tuple3d getGravity()
  {
		return gravity;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetGravity(Tuple3d newGravity, NotificationChain msgs)
  {
		Tuple3d oldGravity = gravity;
		gravity = newGravity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.SURFACE_ENVIRONMENT__GRAVITY, oldGravity, newGravity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setGravity(Tuple3d newGravity)
  {
		if (newGravity != gravity) {
			NotificationChain msgs = null;
			if (gravity != null)
				msgs = ((InternalEObject)gravity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyEnvironmentPackage.SURFACE_ENVIRONMENT__GRAVITY, null, msgs);
			if (newGravity != null)
				msgs = ((InternalEObject)newGravity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyEnvironmentPackage.SURFACE_ENVIRONMENT__GRAVITY, null, msgs);
			msgs = basicSetGravity(newGravity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.SURFACE_ENVIRONMENT__GRAVITY, newGravity, newGravity));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case SymphonyEnvironmentPackage.SURFACE_ENVIRONMENT__ATMOSPHERE:
				return basicSetAtmosphere(null, msgs);
			case SymphonyEnvironmentPackage.SURFACE_ENVIRONMENT__GRAVITY:
				return basicSetGravity(null, msgs);
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
			case SymphonyEnvironmentPackage.SURFACE_ENVIRONMENT__ATMOSPHERE:
				return getAtmosphere();
			case SymphonyEnvironmentPackage.SURFACE_ENVIRONMENT__GRAVITY:
				return getGravity();
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
			case SymphonyEnvironmentPackage.SURFACE_ENVIRONMENT__ATMOSPHERE:
				setAtmosphere((Atmosphere)newValue);
				return;
			case SymphonyEnvironmentPackage.SURFACE_ENVIRONMENT__GRAVITY:
				setGravity((Tuple3d)newValue);
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
			case SymphonyEnvironmentPackage.SURFACE_ENVIRONMENT__ATMOSPHERE:
				setAtmosphere((Atmosphere)null);
				return;
			case SymphonyEnvironmentPackage.SURFACE_ENVIRONMENT__GRAVITY:
				setGravity((Tuple3d)null);
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
			case SymphonyEnvironmentPackage.SURFACE_ENVIRONMENT__ATMOSPHERE:
				return atmosphere != null;
			case SymphonyEnvironmentPackage.SURFACE_ENVIRONMENT__GRAVITY:
				return gravity != null;
		}
		return super.eIsSet(featureID);
	}

} //SurfaceEnvironmentImpl
