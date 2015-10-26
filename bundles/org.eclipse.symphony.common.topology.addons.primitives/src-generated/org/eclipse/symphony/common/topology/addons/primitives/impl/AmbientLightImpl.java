/**
 * <copyright>
 * </copyright>
 *
 * $Id: AmbientLightImpl.java,v 1.3.2.2 2015/02/03 20:01:31 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.addons.primitives.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.topology.addons.primitives.AmbientLight;
import org.eclipse.symphony.common.topology.addons.primitives.PrimitivesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ambient Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AmbientLightImpl extends LightImpl implements AmbientLight {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmbientLightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrimitivesPackage.Literals.AMBIENT_LIGHT;
	}

} //AmbientLightImpl
