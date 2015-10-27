/**
 * Canadian Space Agency / Agence spatiale canadienne 2014 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.ui.jme3;

import javax.vecmath.Color3f;

import org.eclipse.emf.ecore.EObject;

import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Type Factory</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.common.topology.ui.jme3.Symphony__CommonTopologyUIJME3Package#getJME3TypeFactory()
 * @model
 * @generated
 */
public interface JME3TypeFactory extends EObject {

	public JME3TypeFactory INSTANCE = Symphony__CommonTopologyUIJME3Factory.eINSTANCE
			.createJME3TypeFactory();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.topology.ui.jme3.ColorRGBA" unique="false" colorDataType="org.eclipse.symphony.common.topology.ui.jme3.Color3f" colorUnique="false"
	 * @generated
	 */
	ColorRGBA createColorRGBA(Color3f color);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.topology.ui.jme3.JMEVector3f" unique="false" vectorDataType="org.eclipse.symphony.common.topology.ui.jme3.Vector3f" vectorUnique="false"
	 * @generated
	 */
	Vector3f createVector3f(javax.vecmath.Vector3f vector);

} // JME3TypeFactory
