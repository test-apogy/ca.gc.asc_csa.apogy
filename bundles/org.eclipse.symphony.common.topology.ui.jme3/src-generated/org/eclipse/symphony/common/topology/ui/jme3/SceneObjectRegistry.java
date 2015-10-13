/**
 * Canadian Space Agency / Agence spatiale canadienne 2014 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.ui.jme3;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.SceneObject;

import com.jme3.scene.Geometry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scene Object Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.common.topology.ui.jme3.JME3Package#getSceneObjectRegistry()
 * @model
 * @generated
 */
public interface SceneObjectRegistry extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model npUnique="false"
	 * @generated
	 */
	void register(NodePresentation np);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.topology.ui.jme3.SceneObject" unique="false" jme3GeometryDataType="org.eclipse.symphony.common.topology.ui.jme3.JME3Geometry" jme3GeometryUnique="false"
	 * @generated
	 */
	SceneObject getSceneObject(Geometry jme3Geometry);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" jme3GeometryDataType="org.eclipse.symphony.common.topology.ui.jme3.JME3Geometry" jme3GeometryUnique="false"
	 * @generated
	 */
	NodePresentation getPresentationNode(Geometry jme3Geometry);

} // SceneObjectRegistry
