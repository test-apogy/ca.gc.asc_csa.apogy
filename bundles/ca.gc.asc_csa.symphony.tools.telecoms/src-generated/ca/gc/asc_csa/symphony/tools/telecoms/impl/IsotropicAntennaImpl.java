/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.telecoms.impl;

import org.eclipse.emf.ecore.EClass;

import ca.gc.asc_csa.symphony.tools.telecoms.IsotropicAntenna;
import ca.gc.asc_csa.symphony.tools.telecoms.SymphonyTelecomToolsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Isotropic Antenna</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IsotropicAntennaImpl extends AbstractAntennaRadiationPatternImpl implements IsotropicAntenna {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsotropicAntennaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyTelecomToolsPackage.Literals.ISOTROPIC_ANTENNA;
	}
	
	@Override
	public double computeGain(double theta, double phi) 
	{	
		// An Isotropic antenna gain is 1.0 (0 dB) in all directions.
		return 0.0;
	}

} //IsotropicAntennaImpl
