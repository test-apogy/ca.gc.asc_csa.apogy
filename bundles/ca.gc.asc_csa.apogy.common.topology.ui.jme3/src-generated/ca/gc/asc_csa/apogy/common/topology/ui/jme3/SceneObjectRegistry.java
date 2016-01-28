/**
 * Canadian Space Agency / Agence spatiale canadienne 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology.ui.jme3;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;

import com.jme3.scene.Geometry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scene Object Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.ApogyCommonTopologyUIJME3Package#getSceneObjectRegistry()
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
	 * @model dataType="ca.gc.asc_csa.apogy.common.topology.ui.jme3.SceneObject" unique="false" jme3GeometryDataType="ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Geometry" jme3GeometryUnique="false"
	 * @generated
	 */
	SceneObject getSceneObject(Geometry jme3Geometry);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" jme3GeometryDataType="ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Geometry" jme3GeometryUnique="false"
	 * @generated
	 */
	NodePresentation getPresentationNode(Geometry jme3Geometry);

} // SceneObjectRegistry
