/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.ui;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.SceneObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getTopologyPresentationSet <em>Topology Presentation Set</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getColor <em>Color</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.NodePresentation#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getShadowMode <em>Shadow Mode</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.NodePresentation#isUseInBoundingCalculation <em>Use In Bounding Calculation</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getCentroid <em>Centroid</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getXRange <em>XRange</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getYRange <em>YRange</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getZRange <em>ZRange</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getSceneObject <em>Scene Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.topology.ui.TopologyUIPackage#getNodePresentation()
 * @model
 * @generated
 */
public interface NodePresentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.common.topology.ui.TopologyPresentationSet}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.common.topology.ui.TopologyPresentationSet#getNodePresentationList <em>Node Presentation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The list of TopologyPresentationSet referring to this NodePresentation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topology Presentation Set</em>' reference list.
	 * @see org.eclipse.symphony.common.topology.ui.TopologyUIPackage#getNodePresentation_TopologyPresentationSet()
	 * @see org.eclipse.symphony.common.topology.ui.TopologyPresentationSet#getNodePresentationList
	 * @model opposite="nodePresentationList"
	 * @generated
	 */
	EList<TopologyPresentationSet> getTopologyPresentationSet();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(Node)
	 * @see org.eclipse.symphony.common.topology.ui.TopologyUIPackage#getNodePresentation_Node()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='None' propertyCategory='PRESENTATION_INTERNAL_INFORMATION'"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(RGB)
	 * @see org.eclipse.symphony.common.topology.ui.TopologyUIPackage#getNodePresentation_Color()
	 * @model unique="false" dataType="org.eclipse.symphony.common.topology.ui.RGB"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='VISUAL_INFORMATION'"
	 * @generated
	 */
	RGB getColor();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(RGB value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see org.eclipse.symphony.common.topology.ui.TopologyUIPackage#getNodePresentation_Visible()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='VISUAL_INFORMATION'"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.ui.NodePresentation#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use In Bounding Calculation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use In Bounding Calculation</em>' attribute.
	 * @see #setUseInBoundingCalculation(boolean)
	 * @see org.eclipse.symphony.common.topology.ui.TopologyUIPackage#getNodePresentation_UseInBoundingCalculation()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' propertyCategory='BOUNDING_VOLUME_INFORMATION' child='false'"
	 * @generated
	 */
	boolean isUseInBoundingCalculation();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.ui.NodePresentation#isUseInBoundingCalculation <em>Use In Bounding Calculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use In Bounding Calculation</em>' attribute.
	 * @see #isUseInBoundingCalculation()
	 * @generated
	 */
	void setUseInBoundingCalculation(boolean value);

	/**
	 * Returns the value of the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centroid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centroid</em>' reference.
	 * @see org.eclipse.symphony.common.topology.ui.TopologyUIPackage#getNodePresentation_Centroid()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' propertyCategory='BOUNDING_VOLUME_INFORMATION'"
	 * @generated
	 */
	Tuple3d getCentroid();

	/**
	 * Returns the value of the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' reference.
	 * @see org.eclipse.symphony.common.topology.ui.TopologyUIPackage#getNodePresentation_Min()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' propertyCategory='BOUNDING_VOLUME_INFORMATION'"
	 * @generated
	 */
	Tuple3d getMin();

	/**
	 * Returns the value of the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' reference.
	 * @see org.eclipse.symphony.common.topology.ui.TopologyUIPackage#getNodePresentation_Max()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' propertyCategory='BOUNDING_VOLUME_INFORMATION'"
	 * @generated
	 */
	Tuple3d getMax();

	/**
	 * Returns the value of the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRange</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRange</em>' attribute.
	 * @see org.eclipse.symphony.common.topology.ui.TopologyUIPackage#getNodePresentation_XRange()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' propertyCategory='BOUNDING_VOLUME_INFORMATION'"
	 * @generated
	 */
	double getXRange();

	/**
	 * Returns the value of the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YRange</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YRange</em>' attribute.
	 * @see org.eclipse.symphony.common.topology.ui.TopologyUIPackage#getNodePresentation_YRange()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' propertyCategory='BOUNDING_VOLUME_INFORMATION'"
	 * @generated
	 */
	double getYRange();

	/**
	 * Returns the value of the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZRange</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZRange</em>' attribute.
	 * @see org.eclipse.symphony.common.topology.ui.TopologyUIPackage#getNodePresentation_ZRange()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' propertyCategory='BOUNDING_VOLUME_INFORMATION'"
	 * @generated
	 */
	double getZRange();

	/**
	 * Returns the value of the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scene Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scene Object</em>' attribute.
	 * @see #setSceneObject(SceneObject)
	 * @see org.eclipse.symphony.common.topology.ui.TopologyUIPackage#getNodePresentation_SceneObject()
	 * @model unique="false" dataType="org.eclipse.symphony.common.topology.ui.SceneObject" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' propertyCategory='PRESENTATION_INTERNAL_INFORMATION' child='false'"
	 * @generated
	 */
	SceneObject getSceneObject();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getSceneObject <em>Scene Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scene Object</em>' attribute.
	 * @see #getSceneObject()
	 * @generated
	 */
	void setSceneObject(SceneObject value);

	/**
	 * Returns the value of the '<em><b>Shadow Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.symphony.common.topology.ui.ShadowMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shadow Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadow Mode</em>' attribute.
	 * @see org.eclipse.symphony.common.topology.ui.ShadowMode
	 * @see #setShadowMode(ShadowMode)
	 * @see org.eclipse.symphony.common.topology.ui.TopologyUIPackage#getNodePresentation_ShadowMode()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='VISUAL_INFORMATION' child='false'"
	 * @generated
	 */
	ShadowMode getShadowMode();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getShadowMode <em>Shadow Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow Mode</em>' attribute.
	 * @see org.eclipse.symphony.common.topology.ui.ShadowMode
	 * @see #getShadowMode()
	 * @generated
	 */
	void setShadowMode(ShadowMode value);

} // NodePresentation