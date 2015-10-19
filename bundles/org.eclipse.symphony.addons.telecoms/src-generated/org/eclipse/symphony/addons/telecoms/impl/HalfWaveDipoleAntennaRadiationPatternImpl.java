/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.telecoms.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.addons.telecoms.HalfWaveDipoleAntennaRadiationPattern;
import org.eclipse.symphony.addons.telecoms.SymphonyTelecomToolsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Half Wave Dipole Antenna Radiation Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HalfWaveDipoleAntennaRadiationPatternImpl extends AbstractAntennaRadiationPatternImpl implements HalfWaveDipoleAntennaRadiationPattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HalfWaveDipoleAntennaRadiationPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyTelecomToolsPackage.Literals.HALF_WAVE_DIPOLE_ANTENNA_RADIATION_PATTERN;
	}

	@Override
	public double computeGain(double theta, double phi) 
	{
		// TODO
		return 1.5 * Math.sin(theta) * Math.sin(theta);
	}
} //HalfWaveDipoleAntennaRadiationPatternImpl
