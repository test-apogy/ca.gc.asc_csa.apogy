/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.telecoms.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.telecoms.SimpleConicalRadiationPattern;
import ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Conical Radiation Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.impl.SimpleConicalRadiationPatternImpl#getApexAngle <em>Apex Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleConicalRadiationPatternImpl extends AbstractAntennaRadiationPatternImpl implements SimpleConicalRadiationPattern 
{
	protected double maxGain = Double.NaN;
	
	/**
	 * The default value of the '{@link #getApexAngle() <em>Apex Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApexAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double APEX_ANGLE_EDEFAULT = 0.79;

	/**
	 * The cached value of the '{@link #getApexAngle() <em>Apex Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApexAngle()
	 * @generated
	 * @ordered
	 */
	protected double apexAngle = APEX_ANGLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleConicalRadiationPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsTelecomsPackage.Literals.SIMPLE_CONICAL_RADIATION_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getApexAngle() {
		return apexAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setApexAngle(double newApexAngle) 
	{
		setApexAngleGen(newApexAngle);
		maxGain = computeMaximumGain();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApexAngleGen(double newApexAngle) {
		double oldApexAngle = apexAngle;
		apexAngle = newApexAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsTelecomsPackage.SIMPLE_CONICAL_RADIATION_PATTERN__APEX_ANGLE, oldApexAngle, apexAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsTelecomsPackage.SIMPLE_CONICAL_RADIATION_PATTERN__APEX_ANGLE:
				return getApexAngle();
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
			case ApogyAddonsTelecomsPackage.SIMPLE_CONICAL_RADIATION_PATTERN__APEX_ANGLE:
				setApexAngle((Double)newValue);
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
			case ApogyAddonsTelecomsPackage.SIMPLE_CONICAL_RADIATION_PATTERN__APEX_ANGLE:
				setApexAngle(APEX_ANGLE_EDEFAULT);
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
			case ApogyAddonsTelecomsPackage.SIMPLE_CONICAL_RADIATION_PATTERN__APEX_ANGLE:
				return apexAngle != APEX_ANGLE_EDEFAULT;
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
		result.append(" (apexAngle: ");
		result.append(apexAngle);
		result.append(')');
		return result.toString();
	}
			
	@Override
	public double computeGain(double theta, double phi) 
	{
		// Checks to see if the direction falls inside the cone.
		if(theta <= (getApexAngle() / 2.0))
		{
			return getMaxGain();
		}
		else
		{
			return Double.NEGATIVE_INFINITY;
		}
	}

	private double getMaxGain()
	{
		if(Double.isNaN(maxGain))
		{
			maxGain = computeMaximumGain();
		}
		
		return maxGain;
	}
	
	private double computeMaximumGain()
	{
		double coneSolidAngle = Math.PI * 2.0 * (1.0 - Math.cos(getApexAngle() / 2.0));
		double apertureRatio =  4*Math.PI / coneSolidAngle;		
		double gain = 10.0 * Math.log10(apertureRatio);
		return gain;
	}
} //SimpleConicalRadiationPatternImpl
