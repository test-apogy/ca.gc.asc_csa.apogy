/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage;
import org.eclipse.symphony.addons.vehicle.Thruster;
import org.eclipse.symphony.common.topology.impl.NodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thruster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.impl.ThrusterImpl#getMinimumThrust <em>Minimum Thrust</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.impl.ThrusterImpl#getMaximumThrust <em>Maximum Thrust</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.impl.ThrusterImpl#getCurrentThrust <em>Current Thrust</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.impl.ThrusterImpl#getThrustLevel <em>Thrust Level</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.impl.ThrusterImpl#getPlumeAngle <em>Plume Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThrusterImpl extends NodeImpl implements Thruster
{
  /**
	 * The default value of the '{@link #getMinimumThrust() <em>Minimum Thrust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumThrust()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_THRUST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumThrust() <em>Minimum Thrust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumThrust()
	 * @generated
	 * @ordered
	 */
	protected double minimumThrust = MINIMUM_THRUST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumThrust() <em>Maximum Thrust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumThrust()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_THRUST_EDEFAULT = 100.0;

	/**
	 * The cached value of the '{@link #getMaximumThrust() <em>Maximum Thrust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumThrust()
	 * @generated
	 * @ordered
	 */
	protected double maximumThrust = MAXIMUM_THRUST_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentThrust() <em>Current Thrust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentThrust()
	 * @generated
	 * @ordered
	 */
	protected static final double CURRENT_THRUST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCurrentThrust() <em>Current Thrust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentThrust()
	 * @generated
	 * @ordered
	 */
	protected double currentThrust = CURRENT_THRUST_EDEFAULT;

		/**
	 * The default value of the '{@link #getThrustLevel() <em>Thrust Level</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getThrustLevel()
	 * @generated
	 * @ordered
	 */
  protected static final double THRUST_LEVEL_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getThrustLevel() <em>Thrust Level</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getThrustLevel()
	 * @generated
	 * @ordered
	 */
  protected double thrustLevel = THRUST_LEVEL_EDEFAULT;

		/**
	 * The default value of the '{@link #getPlumeAngle() <em>Plume Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPlumeAngle()
	 * @generated
	 * @ordered
	 */
  protected static final double PLUME_ANGLE_EDEFAULT = 0.5;

		/**
	 * The cached value of the '{@link #getPlumeAngle() <em>Plume Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPlumeAngle()
	 * @generated
	 * @ordered
	 */
  protected double plumeAngle = PLUME_ANGLE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ThrusterImpl()
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
		return SymphonyToolsVehiclePackage.Literals.THRUSTER;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumThrust() {
		return minimumThrust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setMinimumThrust(double newMinimumThrust) 
	{
		if(newMinimumThrust < 0)
		{
			setMinimumThrustGen(0);
		}
		else
		{
			setMinimumThrustGen(newMinimumThrust);
		}
		updateThrustLevel();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumThrustGen(double newMinimumThrust) 
	{
		double oldMinimumThrust = minimumThrust;
		minimumThrust = newMinimumThrust;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsVehiclePackage.THRUSTER__MINIMUM_THRUST, oldMinimumThrust, minimumThrust));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumThrust() {
		return maximumThrust;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setMaximumThrust(double newMaximumThrust) 
	{
		if(newMaximumThrust < 0)
		{
			setMaximumThrustGen(0);
		}
		else
		{
			setMaximumThrustGen(newMaximumThrust);
		}
		
		updateThrustLevel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumThrustGen(double newMaximumThrust) {
		double oldMaximumThrust = maximumThrust;
		maximumThrust = newMaximumThrust;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsVehiclePackage.THRUSTER__MAXIMUM_THRUST, oldMaximumThrust, maximumThrust));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCurrentThrust() {
		return currentThrust;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setCurrentThrust(double newCurrentThrust) 
	{
		// Clamps the thrust level between min and max.
		if(newCurrentThrust < getMinimumThrust())
		{
			setCurrentThrustGen(getMinimumThrust());
		}
		else if(newCurrentThrust > getMaximumThrust())
		{
			setCurrentThrustGen(getMaximumThrust());
		}
		else
		{
			setCurrentThrustGen(newCurrentThrust);
		}
		updateThrustLevel();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentThrustGen(double newCurrentThrust) {
		double oldCurrentThrust = currentThrust;
		currentThrust = newCurrentThrust;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsVehiclePackage.THRUSTER__CURRENT_THRUST, oldCurrentThrust, currentThrust));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getPlumeAngle()
  {
		return plumeAngle;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPlumeAngle(double newPlumeAngle)
  {
		double oldPlumeAngle = plumeAngle;
		plumeAngle = newPlumeAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsVehiclePackage.THRUSTER__PLUME_ANGLE, oldPlumeAngle, plumeAngle));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getThrustLevel()
  {
		return thrustLevel;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setThrustLevel(double newThrustLevel)
  {
		double oldThrustLevel = thrustLevel;
		thrustLevel = newThrustLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsVehiclePackage.THRUSTER__THRUST_LEVEL, oldThrustLevel, thrustLevel));
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
			case SymphonyToolsVehiclePackage.THRUSTER__MINIMUM_THRUST:
				return getMinimumThrust();
			case SymphonyToolsVehiclePackage.THRUSTER__MAXIMUM_THRUST:
				return getMaximumThrust();
			case SymphonyToolsVehiclePackage.THRUSTER__CURRENT_THRUST:
				return getCurrentThrust();
			case SymphonyToolsVehiclePackage.THRUSTER__THRUST_LEVEL:
				return getThrustLevel();
			case SymphonyToolsVehiclePackage.THRUSTER__PLUME_ANGLE:
				return getPlumeAngle();
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
			case SymphonyToolsVehiclePackage.THRUSTER__MINIMUM_THRUST:
				setMinimumThrust((Double)newValue);
				return;
			case SymphonyToolsVehiclePackage.THRUSTER__MAXIMUM_THRUST:
				setMaximumThrust((Double)newValue);
				return;
			case SymphonyToolsVehiclePackage.THRUSTER__CURRENT_THRUST:
				setCurrentThrust((Double)newValue);
				return;
			case SymphonyToolsVehiclePackage.THRUSTER__THRUST_LEVEL:
				setThrustLevel((Double)newValue);
				return;
			case SymphonyToolsVehiclePackage.THRUSTER__PLUME_ANGLE:
				setPlumeAngle((Double)newValue);
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
			case SymphonyToolsVehiclePackage.THRUSTER__MINIMUM_THRUST:
				setMinimumThrust(MINIMUM_THRUST_EDEFAULT);
				return;
			case SymphonyToolsVehiclePackage.THRUSTER__MAXIMUM_THRUST:
				setMaximumThrust(MAXIMUM_THRUST_EDEFAULT);
				return;
			case SymphonyToolsVehiclePackage.THRUSTER__CURRENT_THRUST:
				setCurrentThrust(CURRENT_THRUST_EDEFAULT);
				return;
			case SymphonyToolsVehiclePackage.THRUSTER__THRUST_LEVEL:
				setThrustLevel(THRUST_LEVEL_EDEFAULT);
				return;
			case SymphonyToolsVehiclePackage.THRUSTER__PLUME_ANGLE:
				setPlumeAngle(PLUME_ANGLE_EDEFAULT);
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
			case SymphonyToolsVehiclePackage.THRUSTER__MINIMUM_THRUST:
				return minimumThrust != MINIMUM_THRUST_EDEFAULT;
			case SymphonyToolsVehiclePackage.THRUSTER__MAXIMUM_THRUST:
				return maximumThrust != MAXIMUM_THRUST_EDEFAULT;
			case SymphonyToolsVehiclePackage.THRUSTER__CURRENT_THRUST:
				return currentThrust != CURRENT_THRUST_EDEFAULT;
			case SymphonyToolsVehiclePackage.THRUSTER__THRUST_LEVEL:
				return thrustLevel != THRUST_LEVEL_EDEFAULT;
			case SymphonyToolsVehiclePackage.THRUSTER__PLUME_ANGLE:
				return plumeAngle != PLUME_ANGLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (minimumThrust: ");
		result.append(minimumThrust);
		result.append(", maximumThrust: ");
		result.append(maximumThrust);
		result.append(", currentThrust: ");
		result.append(currentThrust);
		result.append(", thrustLevel: ");
		result.append(thrustLevel);
		result.append(", plumeAngle: ");
		result.append(plumeAngle);
		result.append(')');
		return result.toString();
	}
  
  	private void updateThrustLevel()
  	{
  		double newThrustLevel = (getCurrentThrust()  / getMaximumThrust());
  		
  		if(newThrustLevel < 0.0)
  		{
  			newThrustLevel = 0.0;
  		}
  		else if(newThrustLevel > 1.0)
  		{
  			newThrustLevel = 1.0;
  		}
  		
  		setThrustLevel(newThrustLevel);
  	}

} //ThrusterImpl
