/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons;

import javax.vecmath.Matrix4d;

import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Two Points3 DTool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract tool that is defined by two points.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getFromAbsolutePosition <em>From Absolute Position</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getFromRelativePosition <em>From Relative Position</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getFromNode <em>From Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#isFromNodeLock <em>From Node Lock</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getToAbsolutePosition <em>To Absolute Position</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getToRelativePosition <em>To Relative Position</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getToNode <em>To Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#isToNodeLock <em>To Node Lock</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getAbstractTwoPoints3DTool()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTwoPoints3DTool extends Simple3DTool {
	/**
	 * Returns the value of the '<em><b>From Absolute Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Absolute Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Absolute Position</em>' reference.
	 * @see #setFromAbsolutePosition(Tuple3d)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getAbstractTwoPoints3DTool_FromAbsolutePosition()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' property='Readonly' propertyCategory='FROM_NODE'"
	 * @generated
	 */
	Tuple3d getFromAbsolutePosition();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getFromAbsolutePosition <em>From Absolute Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Absolute Position</em>' reference.
	 * @see #getFromAbsolutePosition()
	 * @generated
	 */
	void setFromAbsolutePosition(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>From Relative Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Relative Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Relative Position</em>' reference.
	 * @see #setFromRelativePosition(Tuple3d)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getAbstractTwoPoints3DTool_FromRelativePosition()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' property='Readonly' propertyCategory='FROM_NODE'"
	 * @generated
	 */
	Tuple3d getFromRelativePosition();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getFromRelativePosition <em>From Relative Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Relative Position</em>' reference.
	 * @see #getFromRelativePosition()
	 * @generated
	 */
	void setFromRelativePosition(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>From Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Node</em>' reference.
	 * @see #setFromNode(Node)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getAbstractTwoPoints3DTool_FromNode()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' property='Readonly' propertyCategory='FROM_NODE'"
	 * @generated
	 */
	Node getFromNode();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getFromNode <em>From Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Node</em>' reference.
	 * @see #getFromNode()
	 * @generated
	 */
	void setFromNode(Node value);

	/**
	 * Returns the value of the '<em><b>From Node Lock</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Node Lock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Node Lock</em>' attribute.
	 * @see #setFromNodeLock(boolean)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getAbstractTwoPoints3DTool_FromNodeLock()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='FROM_NODE'"
	 * @generated
	 */
	boolean isFromNodeLock();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#isFromNodeLock <em>From Node Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Node Lock</em>' attribute.
	 * @see #isFromNodeLock()
	 * @generated
	 */
	void setFromNodeLock(boolean value);

	/**
	 * Returns the value of the '<em><b>To Absolute Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Absolute Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Absolute Position</em>' reference.
	 * @see #setToAbsolutePosition(Tuple3d)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getAbstractTwoPoints3DTool_ToAbsolutePosition()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' property='Readonly' propertyCategory='TO_NODE'"
	 * @generated
	 */
	Tuple3d getToAbsolutePosition();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getToAbsolutePosition <em>To Absolute Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Absolute Position</em>' reference.
	 * @see #getToAbsolutePosition()
	 * @generated
	 */
	void setToAbsolutePosition(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>To Relative Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Relative Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Relative Position</em>' reference.
	 * @see #setToRelativePosition(Tuple3d)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getAbstractTwoPoints3DTool_ToRelativePosition()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' property='Readonly' propertyCategory='TO_NODE'"
	 * @generated
	 */
	Tuple3d getToRelativePosition();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getToRelativePosition <em>To Relative Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Relative Position</em>' reference.
	 * @see #getToRelativePosition()
	 * @generated
	 */
	void setToRelativePosition(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>To Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Node</em>' reference.
	 * @see #setToNode(Node)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getAbstractTwoPoints3DTool_ToNode()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' property='Readonly' propertyCategory='TO_NODE'"
	 * @generated
	 */
	Node getToNode();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getToNode <em>To Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Node</em>' reference.
	 * @see #getToNode()
	 * @generated
	 */
	void setToNode(Node value);

	/**
	 * Returns the value of the '<em><b>To Node Lock</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Node Lock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Node Lock</em>' attribute.
	 * @see #setToNodeLock(boolean)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getAbstractTwoPoints3DTool_ToNodeLock()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='TO_NODE'"
	 * @generated
	 */
	boolean isToNodeLock();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#isToNodeLock <em>To Node Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Node Lock</em>' attribute.
	 * @see #isToNodeLock()
	 * @generated
	 */
	void setToNodeLock(boolean value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(double)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getAbstractTwoPoints3DTool_Distance()
	 * @model default="0" unique="false" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' csa_units='m'"
	 * @generated
	 */
	double getDistance();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Method called when the pose between from and to changes.
	 * <!-- end-model-doc -->
	 * @model newPoseDataType="org.eclipse.symphony.common.math.Matrix4d" newPoseUnique="false"
	 * @generated
	 */
	void pointsRelativePoseChanged(Matrix4d newPose);

} // AbstractTwoPoints3DTool
