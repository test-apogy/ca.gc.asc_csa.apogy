/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.telecoms.impl;

import java.awt.Color;

import javax.vecmath.Color3f;
import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.telecoms.AbstractAntennaRadiationPattern;
import org.eclipse.symphony.addons.telecoms.AntennaRadiationPatternImageMapLayer;
import org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage;
import org.eclipse.symphony.core.environment.impl.LineOfSightImageMapLayerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Antenna Radiation Pattern Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.impl.AntennaRadiationPatternImageMapLayerImpl#getAntennaRadiationPattern <em>Antenna Radiation Pattern</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.impl.AntennaRadiationPatternImageMapLayerImpl#getSignalStrengthCutoff <em>Signal Strength Cutoff</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.impl.AntennaRadiationPatternImageMapLayerImpl#getBellowCutoffColor <em>Bellow Cutoff Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AntennaRadiationPatternImageMapLayerImpl extends LineOfSightImageMapLayerImpl implements AntennaRadiationPatternImageMapLayer 
{	
	/**
	 * The cached value of the '{@link #getAntennaRadiationPattern() <em>Antenna Radiation Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntennaRadiationPattern()
	 * @generated
	 * @ordered
	 */
	protected AbstractAntennaRadiationPattern antennaRadiationPattern;

	/**
	 * The default value of the '{@link #getSignalStrengthCutoff() <em>Signal Strength Cutoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalStrengthCutoff()
	 * @generated
	 * @ordered
	 */
	protected static final double SIGNAL_STRENGTH_CUTOFF_EDEFAULT = -100.0;

	/**
	 * The cached value of the '{@link #getSignalStrengthCutoff() <em>Signal Strength Cutoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalStrengthCutoff()
	 * @generated
	 * @ordered
	 */
	protected double signalStrengthCutoff = SIGNAL_STRENGTH_CUTOFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getBellowCutoffColor() <em>Bellow Cutoff Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBellowCutoffColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color3f BELLOW_CUTOFF_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBellowCutoffColor() <em>Bellow Cutoff Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBellowCutoffColor()
	 * @generated
	 * @ordered
	 */
	protected Color3f bellowCutoffColor = BELLOW_CUTOFF_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AntennaRadiationPatternImageMapLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__AddonsTelecomsPackage.Literals.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAntennaRadiationPattern getAntennaRadiationPattern() {
		return antennaRadiationPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAntennaRadiationPattern(AbstractAntennaRadiationPattern newAntennaRadiationPattern, NotificationChain msgs) {
		AbstractAntennaRadiationPattern oldAntennaRadiationPattern = antennaRadiationPattern;
		antennaRadiationPattern = newAntennaRadiationPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__AddonsTelecomsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ANTENNA_RADIATION_PATTERN, oldAntennaRadiationPattern, newAntennaRadiationPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntennaRadiationPattern(AbstractAntennaRadiationPattern newAntennaRadiationPattern) {
		if (newAntennaRadiationPattern != antennaRadiationPattern) {
			NotificationChain msgs = null;
			if (antennaRadiationPattern != null)
				msgs = ((InternalEObject)antennaRadiationPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__AddonsTelecomsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ANTENNA_RADIATION_PATTERN, null, msgs);
			if (newAntennaRadiationPattern != null)
				msgs = ((InternalEObject)newAntennaRadiationPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Symphony__AddonsTelecomsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ANTENNA_RADIATION_PATTERN, null, msgs);
			msgs = basicSetAntennaRadiationPattern(newAntennaRadiationPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsTelecomsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ANTENNA_RADIATION_PATTERN, newAntennaRadiationPattern, newAntennaRadiationPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSignalStrengthCutoff() {
		return signalStrengthCutoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalStrengthCutoff(double newSignalStrengthCutoff) {
		double oldSignalStrengthCutoff = signalStrengthCutoff;
		signalStrengthCutoff = newSignalStrengthCutoff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsTelecomsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__SIGNAL_STRENGTH_CUTOFF, oldSignalStrengthCutoff, signalStrengthCutoff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f getBellowCutoffColor() {
		return bellowCutoffColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBellowCutoffColor(Color3f newBellowCutoffColor) {
		Color3f oldBellowCutoffColor = bellowCutoffColor;
		bellowCutoffColor = newBellowCutoffColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsTelecomsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__BELLOW_CUTOFF_COLOR, oldBellowCutoffColor, bellowCutoffColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__AddonsTelecomsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ANTENNA_RADIATION_PATTERN:
				return basicSetAntennaRadiationPattern(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__AddonsTelecomsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ANTENNA_RADIATION_PATTERN:
				return getAntennaRadiationPattern();
			case Symphony__AddonsTelecomsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__SIGNAL_STRENGTH_CUTOFF:
				return getSignalStrengthCutoff();
			case Symphony__AddonsTelecomsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__BELLOW_CUTOFF_COLOR:
				return getBellowCutoffColor();
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
			case Symphony__AddonsTelecomsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ANTENNA_RADIATION_PATTERN:
				setAntennaRadiationPattern((AbstractAntennaRadiationPattern)newValue);
				return;
			case Symphony__AddonsTelecomsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__SIGNAL_STRENGTH_CUTOFF:
				setSignalStrengthCutoff((Double)newValue);
				return;
			case Symphony__AddonsTelecomsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__BELLOW_CUTOFF_COLOR:
				setBellowCutoffColor((Color3f)newValue);
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
			case Symphony__AddonsTelecomsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ANTENNA_RADIATION_PATTERN:
				setAntennaRadiationPattern((AbstractAntennaRadiationPattern)null);
				return;
			case Symphony__AddonsTelecomsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__SIGNAL_STRENGTH_CUTOFF:
				setSignalStrengthCutoff(SIGNAL_STRENGTH_CUTOFF_EDEFAULT);
				return;
			case Symphony__AddonsTelecomsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__BELLOW_CUTOFF_COLOR:
				setBellowCutoffColor(BELLOW_CUTOFF_COLOR_EDEFAULT);
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
			case Symphony__AddonsTelecomsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ANTENNA_RADIATION_PATTERN:
				return antennaRadiationPattern != null;
			case Symphony__AddonsTelecomsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__SIGNAL_STRENGTH_CUTOFF:
				return signalStrengthCutoff != SIGNAL_STRENGTH_CUTOFF_EDEFAULT;
			case Symphony__AddonsTelecomsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__BELLOW_CUTOFF_COLOR:
				return BELLOW_CUTOFF_COLOR_EDEFAULT == null ? bellowCutoffColor != null : !BELLOW_CUTOFF_COLOR_EDEFAULT.equals(bellowCutoffColor);
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
		result.append(" (signalStrengthCutoff: ");
		result.append(signalStrengthCutoff);
		result.append(", bellowCutoffColor: ");
		result.append(bellowCutoffColor);
		result.append(')');
		return result.toString();
	}

	@Override
	protected int[][] getPixelsColor(short[][] lineOfSights) 
	{
		int numberPixelAlongX = lineOfSights.length;
		int numberPixelAlongY = lineOfSights[0].length;
						
		int noLineOfSightRGB = convertColor(getLineOfSightNotAvailableColor());
		
		double minimumGain = 100;
		double maximumGain = -100;
		
				
		float[][] signalPowerDensity = new float[numberPixelAlongX][numberPixelAlongY];
		
		
		Matrix4d antennaTransform = getObserverPose().asMatrix4d();		
		Matrix4d antennaTransformInverse = new Matrix4d(antennaTransform);
		antennaTransformInverse.invert();
		
		Vector3d antennaPosition = new Vector3d();
		antennaTransform.get(antennaPosition);
		
		for(int i=0; i< numberPixelAlongX; i++)
		{
			for(int j=0; j< numberPixelAlongY; j++)
			{
				short data = lineOfSights[i][j];
				switch (data) 
				{
					case LINE_OF_SIGHT:
																			
						// Computes the position of the location above the mesh.
						Vector3d heightDisplacement = null;
						if(isUseHeightPerpendicularToGround())
						{
							heightDisplacement = new Vector3d(pixelNormals[i][j]);
							heightDisplacement.scale(getTargetHeightAboveGround());							
						}
						else
						{
							heightDisplacement = new Vector3d(0, 0, getTargetHeightAboveGround());
						}
						Point3d position = new Point3d(pixelsIntersectionPoints[i][j]);
						position.add(heightDisplacement);
							
						// Transform the position into the antenna reference frame.
						Point3d positionInAntennaFrame = new Point3d(position);
						antennaTransformInverse.transform(positionInAntennaFrame);
						
						// Finds the direction in the antenna frame.
						Vector3d direction = new Vector3d(positionInAntennaFrame);						
						
						// Gets the distance between the antenna and the location
						double distance = direction.length();
						
						// Normalize the direction vector.
						direction.normalize();
						
						System.out.println("Position  : " + position);
						System.out.println("Direction : " + direction);
						
						// Computes spherical coordinates of the direction vector in the antenna radiation pattern frame.						
						float theta = (float) Math.acos(direction.z);
						float phi = (float) Math.atan2(direction.y, direction.x);
						
						// Computes the antenna power gain
						double antennaGaindB = getAntennaRadiationPattern().computeGain(theta, phi);	
						
						System.out.println("Ant Gain (dB) : " +  antennaGaindB);
						
						double antennaGain = Math.pow(10, (antennaGaindB / 10.0));
						double powerDensity = antennaGain / (4 * Math.PI * distance * distance);
						double powerGain = 10 * Math.log10(powerDensity);
						signalPowerDensity[i][j] = (float) powerGain;
							
						System.out.println("powerGain (" + Math.toDegrees(theta) + ", " + Math.toDegrees(phi) + ") " + powerGain);
						
						if(powerGain >= getSignalStrengthCutoff())
						{
							if(powerGain < minimumGain) minimumGain = powerGain;
							if(powerGain > maximumGain) maximumGain = powerGain;
						}						
						
					break;
														
				}
			}	
		}	
		
		// Second pass to have the gain color scale.
		int[][] pixelColors = new int[numberPixelAlongX][numberPixelAlongY];			
		for(int i=0; i< numberPixelAlongX; i++)
		{
			for(int j=0; j< numberPixelAlongY; j++)
			{
				short data = lineOfSights[i][j];
				switch (data) 
				{
					case LINE_OF_SIGHT:
						pixelColors[i][j] = getColor(minimumGain, maximumGain, signalPowerDensity[i][j]);
					break;
					case NO_LINE_OF_SIGHT:
						pixelColors[i][j] = noLineOfSightRGB;
					break;		
				}
			}
		}
		
		
		return pixelColors;
	}
	
	/**
	 * Get the color associated with a given triangle
	 * @param pixelLocation The location of the pixel in the XY plane.
	 * @param triangle The triangle onto which the pixel location falls. Can be null.
	 * @param meshMinimumSlope The mesh minimum slope, in radians.
	 * @param meshMaximumSlope The mesh maximum slope, in radians.
	 * @return The color as an RGB integer.
	 */
	protected int getColor(double minimumGain, double maximumGain, double gain)
	{				
		if(gain > getSignalStrengthCutoff())
		{
			double factor = 0.0;				
			factor = (gain - minimumGain) / (maximumGain - minimumGain);		
		
			// Clamps factor between 0 and 1.
			if(factor < 0) factor = 0;
			if(factor > 1) factor = 1;
		  
		    float hue = (float)(0.666 - (0.333 * factor));	    
		    Color color = Color.getHSBColor(hue, 0.9f, 0.9f);    
		    return color.getRGB();
		}
		else
		{
			return convertColor(getBellowCutoffColor());			
		}
	}
} //AntennaRadiationPatternImageMapLayerImpl
