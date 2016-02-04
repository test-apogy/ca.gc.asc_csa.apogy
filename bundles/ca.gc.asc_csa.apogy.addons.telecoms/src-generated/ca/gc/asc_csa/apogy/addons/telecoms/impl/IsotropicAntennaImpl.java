package ca.gc.asc_csa.apogy.addons.telecoms.impl;
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

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.telecoms.IsotropicAntenna;
import ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Isotropic Antenna</b></em>'.
 * <!-- end-user-doc -->
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
		return ApogyAddonsTelecomsPackage.Literals.ISOTROPIC_ANTENNA;
	}
	
	@Override
	public double computeGain(double theta, double phi) 
	{	
		// An Isotropic antenna gain is 1.0 (0 dB) in all directions.
		return 0.0;
	}

} //IsotropicAntennaImpl
