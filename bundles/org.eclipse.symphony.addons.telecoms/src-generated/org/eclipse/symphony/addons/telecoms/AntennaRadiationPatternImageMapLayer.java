/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.telecoms;

import javax.vecmath.Color3f;

import org.eclipse.symphony.core.environment.LineOfSightImageMapLayer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Antenna Radiation Pattern Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.AntennaRadiationPatternImageMapLayer#getAntennaRadiationPattern <em>Antenna Radiation Pattern</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.AntennaRadiationPatternImageMapLayer#getSignalStrengthCutoff <em>Signal Strength Cutoff</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.AntennaRadiationPatternImageMapLayer#getBellowCutoffColor <em>Bellow Cutoff Color</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage#getAntennaRadiationPatternImageMapLayer()
 * @model
 * @generated
 */
public interface AntennaRadiationPatternImageMapLayer extends LineOfSightImageMapLayer {
	/**
	 * Returns the value of the '<em><b>Antenna Radiation Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antenna Radiation Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antenna Radiation Pattern</em>' containment reference.
	 * @see #setAntennaRadiationPattern(AbstractAntennaRadiationPattern)
	 * @see org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage#getAntennaRadiationPatternImageMapLayer_AntennaRadiationPattern()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='ANTENNA'"
	 * @generated
	 */
	AbstractAntennaRadiationPattern getAntennaRadiationPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.telecoms.AntennaRadiationPatternImageMapLayer#getAntennaRadiationPattern <em>Antenna Radiation Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antenna Radiation Pattern</em>' containment reference.
	 * @see #getAntennaRadiationPattern()
	 * @generated
	 */
	void setAntennaRadiationPattern(AbstractAntennaRadiationPattern value);

	/**
	 * Returns the value of the '<em><b>Signal Strength Cutoff</b></em>' attribute.
	 * The default value is <code>"-100.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cutoff signal strength under which no signal is usuable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Strength Cutoff</em>' attribute.
	 * @see #setSignalStrengthCutoff(double)
	 * @see org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage#getAntennaRadiationPatternImageMapLayer_SignalStrengthCutoff()
	 * @model default="-100.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='CUTOFF_SETTINGS' csa_units='dB'"
	 * @generated
	 */
	double getSignalStrengthCutoff();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.telecoms.AntennaRadiationPatternImageMapLayer#getSignalStrengthCutoff <em>Signal Strength Cutoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Strength Cutoff</em>' attribute.
	 * @see #getSignalStrengthCutoff()
	 * @generated
	 */
	void setSignalStrengthCutoff(double value);

	/**
	 * Returns the value of the '<em><b>Bellow Cutoff Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Color to use to mark line of sigh is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bellow Cutoff Color</em>' attribute.
	 * @see #setBellowCutoffColor(Color3f)
	 * @see org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage#getAntennaRadiationPatternImageMapLayer_BellowCutoffColor()
	 * @model unique="false" dataType="org.eclipse.symphony.addons.telecoms.Color3f"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='CUTOFF_SETTINGS'"
	 * @generated
	 */
	Color3f getBellowCutoffColor();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.telecoms.AntennaRadiationPatternImageMapLayer#getBellowCutoffColor <em>Bellow Cutoff Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bellow Cutoff Color</em>' attribute.
	 * @see #getBellowCutoffColor()
	 * @generated
	 */
	void setBellowCutoffColor(Color3f value);

} // AntennaRadiationPatternImageMapLayer
