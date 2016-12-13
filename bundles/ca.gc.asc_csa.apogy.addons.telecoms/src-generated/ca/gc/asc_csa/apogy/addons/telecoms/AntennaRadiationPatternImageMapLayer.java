package ca.gc.asc_csa.apogy.addons.telecoms;
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

import ca.gc.asc_csa.apogy.core.environment.surface.LineOfSightImageMapLayer;
import javax.vecmath.Color3f;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Antenna Radiation Pattern Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.AntennaRadiationPatternImageMapLayer#getAntennaRadiationPattern <em>Antenna Radiation Pattern</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.AntennaRadiationPatternImageMapLayer#getSignalStrengthCutoff <em>Signal Strength Cutoff</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.AntennaRadiationPatternImageMapLayer#getBellowCutoffColor <em>Bellow Cutoff Color</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getAntennaRadiationPatternImageMapLayer()
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
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getAntennaRadiationPatternImageMapLayer_AntennaRadiationPattern()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='ANTENNA'"
	 * @generated
	 */
	AbstractAntennaRadiationPattern getAntennaRadiationPattern();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.telecoms.AntennaRadiationPatternImageMapLayer#getAntennaRadiationPattern <em>Antenna Radiation Pattern</em>}' containment reference.
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
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getAntennaRadiationPatternImageMapLayer_SignalStrengthCutoff()
	 * @model default="-100.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='CUTOFF_SETTINGS' apogy_units='dB'"
	 * @generated
	 */
	double getSignalStrengthCutoff();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.telecoms.AntennaRadiationPatternImageMapLayer#getSignalStrengthCutoff <em>Signal Strength Cutoff</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getAntennaRadiationPatternImageMapLayer_BellowCutoffColor()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.addons.telecoms.Color3f"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='CUTOFF_SETTINGS'"
	 * @generated
	 */
	Color3f getBellowCutoffColor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.telecoms.AntennaRadiationPatternImageMapLayer#getBellowCutoffColor <em>Bellow Cutoff Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bellow Cutoff Color</em>' attribute.
	 * @see #getBellowCutoffColor()
	 * @generated
	 */
	void setBellowCutoffColor(Color3f value);

} // AntennaRadiationPatternImageMapLayer
