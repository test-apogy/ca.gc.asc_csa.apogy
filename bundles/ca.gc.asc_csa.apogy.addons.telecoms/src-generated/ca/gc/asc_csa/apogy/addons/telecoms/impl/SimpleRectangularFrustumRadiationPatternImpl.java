/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.telecoms.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.telecoms.SimpleRectangularFrustumRadiationPattern;
import org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Rectangular Frustum Radiation Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.impl.SimpleRectangularFrustumRadiationPatternImpl#getHorizontalFieldOfView <em>Horizontal Field Of View</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.impl.SimpleRectangularFrustumRadiationPatternImpl#getVerticalFieldOfView <em>Vertical Field Of View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleRectangularFrustumRadiationPatternImpl extends AbstractAntennaRadiationPatternImpl implements SimpleRectangularFrustumRadiationPattern 
{
	protected double maxGain = Double.NaN;
	
	/**
	 * The default value of the '{@link #getHorizontalFieldOfView() <em>Horizontal Field Of View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalFieldOfView()
	 * @generated
	 * @ordered
	 */
	protected static final double HORIZONTAL_FIELD_OF_VIEW_EDEFAULT = 0.79;

	/**
	 * The cached value of the '{@link #getHorizontalFieldOfView() <em>Horizontal Field Of View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalFieldOfView()
	 * @generated
	 * @ordered
	 */
	protected double horizontalFieldOfView = HORIZONTAL_FIELD_OF_VIEW_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalFieldOfView() <em>Vertical Field Of View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalFieldOfView()
	 * @generated
	 * @ordered
	 */
	protected static final double VERTICAL_FIELD_OF_VIEW_EDEFAULT = 1.57;

	/**
	 * The cached value of the '{@link #getVerticalFieldOfView() <em>Vertical Field Of View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalFieldOfView()
	 * @generated
	 * @ordered
	 */
	protected double verticalFieldOfView = VERTICAL_FIELD_OF_VIEW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleRectangularFrustumRadiationPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__AddonsTelecomsPackage.Literals.SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHorizontalFieldOfView() {
		return horizontalFieldOfView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setHorizontalFieldOfView(double newHorizontalFieldOfView) 
	{
		setHorizontalFieldOfViewGen(newHorizontalFieldOfView);
		maxGain = computeMaximumGain();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalFieldOfViewGen(double newHorizontalFieldOfView) {
		double oldHorizontalFieldOfView = horizontalFieldOfView;
		horizontalFieldOfView = newHorizontalFieldOfView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsTelecomsPackage.SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__HORIZONTAL_FIELD_OF_VIEW, oldHorizontalFieldOfView, horizontalFieldOfView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVerticalFieldOfView() {
		return verticalFieldOfView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setVerticalFieldOfView(double newVerticalFieldOfView) 
	{
		setVerticalFieldOfViewGen(newVerticalFieldOfView);
		maxGain = computeMaximumGain();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalFieldOfViewGen(double newVerticalFieldOfView) {
		double oldVerticalFieldOfView = verticalFieldOfView;
		verticalFieldOfView = newVerticalFieldOfView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsTelecomsPackage.SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__VERTICAL_FIELD_OF_VIEW, oldVerticalFieldOfView, verticalFieldOfView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__AddonsTelecomsPackage.SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__HORIZONTAL_FIELD_OF_VIEW:
				return getHorizontalFieldOfView();
			case Symphony__AddonsTelecomsPackage.SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__VERTICAL_FIELD_OF_VIEW:
				return getVerticalFieldOfView();
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
			case Symphony__AddonsTelecomsPackage.SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__HORIZONTAL_FIELD_OF_VIEW:
				setHorizontalFieldOfView((Double)newValue);
				return;
			case Symphony__AddonsTelecomsPackage.SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__VERTICAL_FIELD_OF_VIEW:
				setVerticalFieldOfView((Double)newValue);
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
			case Symphony__AddonsTelecomsPackage.SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__HORIZONTAL_FIELD_OF_VIEW:
				setHorizontalFieldOfView(HORIZONTAL_FIELD_OF_VIEW_EDEFAULT);
				return;
			case Symphony__AddonsTelecomsPackage.SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__VERTICAL_FIELD_OF_VIEW:
				setVerticalFieldOfView(VERTICAL_FIELD_OF_VIEW_EDEFAULT);
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
			case Symphony__AddonsTelecomsPackage.SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__HORIZONTAL_FIELD_OF_VIEW:
				return horizontalFieldOfView != HORIZONTAL_FIELD_OF_VIEW_EDEFAULT;
			case Symphony__AddonsTelecomsPackage.SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__VERTICAL_FIELD_OF_VIEW:
				return verticalFieldOfView != VERTICAL_FIELD_OF_VIEW_EDEFAULT;
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
		result.append(" (horizontalFieldOfView: ");
		result.append(horizontalFieldOfView);
		result.append(", verticalFieldOfView: ");
		result.append(verticalFieldOfView);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public double computeGain(double theta, double phi) 
	{	
		double x = Math.sin(theta) * Math.cos(phi);
		double y = Math.sin(theta) * Math.sin(phi);
		double z = Math.cos(theta);
				
		double azimuth = Math.abs(Math.atan2(y, z));
		double elevation = Math.abs(Math.atan2(x, z));
		
		//System.out.println( Math.toDegrees(theta) + " , " + Math.toDegrees(phi) + ", " + Math.toDegrees(azimuth) + ", " + Math.toDegrees(elevation));		
		//System.out.println(x + "," + y + "," + z);
		System.out.println( Math.toDegrees(azimuth) + ", " + Math.toDegrees(elevation));
		
		// Checks to see if the direction falls inside the cone.
		if(azimuth <= (getHorizontalFieldOfView() / 2.0))
		{
			if(elevation <= (getVerticalFieldOfView() / 2.0))
			{
				return getMaxGain();
			}		
		}
		
		return Double.NEGATIVE_INFINITY;
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
		double frustrumSolidAngle = 4.0 * Math.asin((Math.sin(getHorizontalFieldOfView() / 2.0) * Math.sin(getVerticalFieldOfView() / 2.0)));
		double apertureRatio =  4 * Math.PI / frustrumSolidAngle;	
		
		System.out.println("Aperture Ratio " + apertureRatio);
		
		double gain = 10.0 * Math.log10(apertureRatio);
		return gain;
	}

} //SimpleRectangularFrustumRadiationPatternImpl
