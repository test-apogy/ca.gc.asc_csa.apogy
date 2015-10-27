/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.impl;

import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.AbstractTwoPoints3DTool;
import org.eclipse.symphony.addons.Symphony__AddonsPackage;
import org.eclipse.symphony.common.math.Symphony__CommonMathFacade;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyFacade;
import org.eclipse.symphony.common.topology.util.NodeRelativePoseListener;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Two Points3 DTool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.impl.AbstractTwoPoints3DToolImpl#getFromAbsolutePosition <em>From Absolute Position</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.AbstractTwoPoints3DToolImpl#getFromRelativePosition <em>From Relative Position</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.AbstractTwoPoints3DToolImpl#getFromNode <em>From Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.AbstractTwoPoints3DToolImpl#isFromNodeLock <em>From Node Lock</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.AbstractTwoPoints3DToolImpl#getToAbsolutePosition <em>To Absolute Position</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.AbstractTwoPoints3DToolImpl#getToRelativePosition <em>To Relative Position</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.AbstractTwoPoints3DToolImpl#getToNode <em>To Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.AbstractTwoPoints3DToolImpl#isToNodeLock <em>To Node Lock</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.AbstractTwoPoints3DToolImpl#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTwoPoints3DToolImpl extends Simple3DToolImpl implements AbstractTwoPoints3DTool 
{		
	private NodeRelativePoseListener nodeRelativePoseListener;
		
	/**
	 * The cached value of the '{@link #getFromAbsolutePosition() <em>From Absolute Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAbsolutePosition()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d fromAbsolutePosition;

	/**
	 * The cached value of the '{@link #getFromRelativePosition() <em>From Relative Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromRelativePosition()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d fromRelativePosition;

	/**
	 * The cached value of the '{@link #getFromNode() <em>From Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromNode()
	 * @generated
	 * @ordered
	 */
	protected Node fromNode;

	/**
	 * The default value of the '{@link #isFromNodeLock() <em>From Node Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFromNodeLock()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FROM_NODE_LOCK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFromNodeLock() <em>From Node Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFromNodeLock()
	 * @generated
	 * @ordered
	 */
	protected boolean fromNodeLock = FROM_NODE_LOCK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToAbsolutePosition() <em>To Absolute Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAbsolutePosition()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d toAbsolutePosition;

	/**
	 * The cached value of the '{@link #getToRelativePosition() <em>To Relative Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToRelativePosition()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d toRelativePosition;

	/**
	 * The cached value of the '{@link #getToNode() <em>To Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToNode()
	 * @generated
	 * @ordered
	 */
	protected Node toNode;

	/**
	 * The default value of the '{@link #isToNodeLock() <em>To Node Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToNodeLock()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TO_NODE_LOCK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isToNodeLock() <em>To Node Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToNodeLock()
	 * @generated
	 * @ordered
	 */
	protected boolean toNodeLock = TO_NODE_LOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected double distance = DISTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTwoPoints3DToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__AddonsPackage.Literals.ABSTRACT_TWO_POINTS3_DTOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getFromAbsolutePosition() {
		if (fromAbsolutePosition != null && fromAbsolutePosition.eIsProxy()) {
			InternalEObject oldFromAbsolutePosition = (InternalEObject)fromAbsolutePosition;
			fromAbsolutePosition = (Tuple3d)eResolveProxy(oldFromAbsolutePosition);
			if (fromAbsolutePosition != oldFromAbsolutePosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_ABSOLUTE_POSITION, oldFromAbsolutePosition, fromAbsolutePosition));
			}
		}
		return fromAbsolutePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d basicGetFromAbsolutePosition() {
		return fromAbsolutePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromAbsolutePosition(Tuple3d newFromAbsolutePosition) {
		Tuple3d oldFromAbsolutePosition = fromAbsolutePosition;
		fromAbsolutePosition = newFromAbsolutePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_ABSOLUTE_POSITION, oldFromAbsolutePosition, fromAbsolutePosition));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getFromRelativePosition() {
		if (fromRelativePosition != null && fromRelativePosition.eIsProxy()) {
			InternalEObject oldFromRelativePosition = (InternalEObject)fromRelativePosition;
			fromRelativePosition = (Tuple3d)eResolveProxy(oldFromRelativePosition);
			if (fromRelativePosition != oldFromRelativePosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_RELATIVE_POSITION, oldFromRelativePosition, fromRelativePosition));
			}
		}
		return fromRelativePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d basicGetFromRelativePosition() {
		return fromRelativePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setFromRelativePosition(Tuple3d newFromRelativePosition)
	{
		setFromRelativePositionGen(newFromRelativePosition);
		updateFromAbsolutePosition();
		updateDistance();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromRelativePositionGen(Tuple3d newFromRelativePosition) {
		Tuple3d oldFromRelativePosition = fromRelativePosition;
		fromRelativePosition = newFromRelativePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_RELATIVE_POSITION, oldFromRelativePosition, fromRelativePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFromNode() {
		if (fromNode != null && fromNode.eIsProxy()) {
			InternalEObject oldFromNode = (InternalEObject)fromNode;
			fromNode = (Node)eResolveProxy(oldFromNode);
			if (fromNode != oldFromNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE, oldFromNode, fromNode));
			}
		}
		return fromNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetFromNode() {
		return fromNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setFromNode(Node newFromNode) 
	{
		setFromNodeGen(newFromNode);
		updateFromAbsolutePosition();
		updateDistance();
		getNodeRelativePoseListener().setFromNode(newFromNode);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromNodeGen(Node newFromNode) {
		Node oldFromNode = fromNode;
		fromNode = newFromNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE, oldFromNode, fromNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFromNodeLock() {
		return fromNodeLock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromNodeLock(boolean newFromNodeLock) {
		boolean oldFromNodeLock = fromNodeLock;
		fromNodeLock = newFromNodeLock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE_LOCK, oldFromNodeLock, fromNodeLock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getToAbsolutePosition() {
		if (toAbsolutePosition != null && toAbsolutePosition.eIsProxy()) {
			InternalEObject oldToAbsolutePosition = (InternalEObject)toAbsolutePosition;
			toAbsolutePosition = (Tuple3d)eResolveProxy(oldToAbsolutePosition);
			if (toAbsolutePosition != oldToAbsolutePosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_ABSOLUTE_POSITION, oldToAbsolutePosition, toAbsolutePosition));
			}
		}
		return toAbsolutePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d basicGetToAbsolutePosition() {
		return toAbsolutePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToAbsolutePosition(Tuple3d newToAbsolutePosition) {
		Tuple3d oldToAbsolutePosition = toAbsolutePosition;
		toAbsolutePosition = newToAbsolutePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_ABSOLUTE_POSITION, oldToAbsolutePosition, toAbsolutePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getToRelativePosition() {
		if (toRelativePosition != null && toRelativePosition.eIsProxy()) {
			InternalEObject oldToRelativePosition = (InternalEObject)toRelativePosition;
			toRelativePosition = (Tuple3d)eResolveProxy(oldToRelativePosition);
			if (toRelativePosition != oldToRelativePosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_RELATIVE_POSITION, oldToRelativePosition, toRelativePosition));
			}
		}
		return toRelativePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d basicGetToRelativePosition() {
		return toRelativePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setToRelativePosition(Tuple3d newToRelativePosition) 
	{
		setToRelativePositionGen(newToRelativePosition);
		updateToAbsolutePosition();
		updateDistance();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToRelativePositionGen(Tuple3d newToRelativePosition) {
		Tuple3d oldToRelativePosition = toRelativePosition;
		toRelativePosition = newToRelativePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_RELATIVE_POSITION, oldToRelativePosition, toRelativePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getToNode() {
		if (toNode != null && toNode.eIsProxy()) {
			InternalEObject oldToNode = (InternalEObject)toNode;
			toNode = (Node)eResolveProxy(oldToNode);
			if (toNode != oldToNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE, oldToNode, toNode));
			}
		}
		return toNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetToNode() {
		return toNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setToNode(Node newToNode) 
	{
		setToNodeGen(newToNode);
		updateToAbsolutePosition();
		updateDistance();
		getNodeRelativePoseListener().setToNode(newToNode);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToNodeGen(Node newToNode) {
		Node oldToNode = toNode;
		toNode = newToNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE, oldToNode, toNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isToNodeLock() {
		return toNodeLock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToNodeLock(boolean newToNodeLock) {
		boolean oldToNodeLock = toNodeLock;
		toNodeLock = newToNodeLock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE_LOCK, oldToNodeLock, toNodeLock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(double newDistance) {
		double oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__DISTANCE, oldDistance, distance));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public abstract void pointsRelativePoseChanged(Matrix4d newPose);

	@Override
	public void dispose() 
	{
		if(nodeRelativePoseListener != null)
		{
			nodeRelativePoseListener.dispose();			
			nodeRelativePoseListener = null;
		}
		
		super.dispose();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_ABSOLUTE_POSITION:
				if (resolve) return getFromAbsolutePosition();
				return basicGetFromAbsolutePosition();
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_RELATIVE_POSITION:
				if (resolve) return getFromRelativePosition();
				return basicGetFromRelativePosition();
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE:
				if (resolve) return getFromNode();
				return basicGetFromNode();
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE_LOCK:
				return isFromNodeLock();
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_ABSOLUTE_POSITION:
				if (resolve) return getToAbsolutePosition();
				return basicGetToAbsolutePosition();
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_RELATIVE_POSITION:
				if (resolve) return getToRelativePosition();
				return basicGetToRelativePosition();
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE:
				if (resolve) return getToNode();
				return basicGetToNode();
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE_LOCK:
				return isToNodeLock();
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__DISTANCE:
				return getDistance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_ABSOLUTE_POSITION:
				setFromAbsolutePosition((Tuple3d)newValue);
				return;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_RELATIVE_POSITION:
				setFromRelativePosition((Tuple3d)newValue);
				return;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE:
				setFromNode((Node)newValue);
				return;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE_LOCK:
				setFromNodeLock((Boolean)newValue);
				return;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_ABSOLUTE_POSITION:
				setToAbsolutePosition((Tuple3d)newValue);
				return;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_RELATIVE_POSITION:
				setToRelativePosition((Tuple3d)newValue);
				return;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE:
				setToNode((Node)newValue);
				return;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE_LOCK:
				setToNodeLock((Boolean)newValue);
				return;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__DISTANCE:
				setDistance((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_ABSOLUTE_POSITION:
				setFromAbsolutePosition((Tuple3d)null);
				return;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_RELATIVE_POSITION:
				setFromRelativePosition((Tuple3d)null);
				return;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE:
				setFromNode((Node)null);
				return;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE_LOCK:
				setFromNodeLock(FROM_NODE_LOCK_EDEFAULT);
				return;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_ABSOLUTE_POSITION:
				setToAbsolutePosition((Tuple3d)null);
				return;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_RELATIVE_POSITION:
				setToRelativePosition((Tuple3d)null);
				return;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE:
				setToNode((Node)null);
				return;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE_LOCK:
				setToNodeLock(TO_NODE_LOCK_EDEFAULT);
				return;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_ABSOLUTE_POSITION:
				return fromAbsolutePosition != null;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_RELATIVE_POSITION:
				return fromRelativePosition != null;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE:
				return fromNode != null;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE_LOCK:
				return fromNodeLock != FROM_NODE_LOCK_EDEFAULT;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_ABSOLUTE_POSITION:
				return toAbsolutePosition != null;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_RELATIVE_POSITION:
				return toRelativePosition != null;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE:
				return toNode != null;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE_LOCK:
				return toNodeLock != TO_NODE_LOCK_EDEFAULT;
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__AddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL___POINTS_RELATIVE_POSE_CHANGED__MATRIX4D:
				pointsRelativePoseChanged((Matrix4d)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fromNodeLock: ");
		result.append(fromNodeLock);
		result.append(", toNodeLock: ");
		result.append(toNodeLock);
		result.append(", distance: ");
		result.append(distance);
		result.append(')');
		return result.toString();
	}

	/*
	 * Updates the absolute position of the FROM node.
	 */
	protected void updateFromAbsolutePosition()
	{
		// Updates From Node Absolute Position.
		if(getFromNode() != null)
		{
			Matrix4d m = Symphony__CommonTopologyFacade.INSTANCE.expressNodeInRootFrame(getFromNode());
			Point3d from = new Point3d();
			if(getFromRelativePosition() != null)
			{
				from = new Point3d(getFromRelativePosition().asTuple3d());
			}
			m.transform(from);
			setFromAbsolutePosition(Symphony__CommonMathFacade.INSTANCE.createTuple3d(from));
		}
	}
	
	/*
	 * Updates the absolute position of the TO node.
	 */
	protected void updateToAbsolutePosition()
	{
		// Updates To Node Absolute Position.
		if(getToNode() != null)
		{
			Matrix4d m = Symphony__CommonTopologyFacade.INSTANCE.expressNodeInRootFrame(getToNode());
			Point3d to = new Point3d();
			if(getToRelativePosition() != null)
			{
				to = new Point3d(getToRelativePosition().asTuple3d());
			}
			m.transform(to);
			setToAbsolutePosition(Symphony__CommonMathFacade.INSTANCE.createTuple3d(to));
		}
	}
	
	protected void updateDistance()
	{
		if(getFromAbsolutePosition() != null && getToAbsolutePosition() != null)
		{
			Point3d from = new Point3d(getFromAbsolutePosition().asTuple3d());
			Point3d to = new Point3d(getToAbsolutePosition().asTuple3d());
			double newDistance = to.distance(from);
			setDistance(newDistance);
		}
		else
		{
			setDistance(0.0);
		}
	}
	
	private NodeRelativePoseListener getNodeRelativePoseListener() 
	{
		if(nodeRelativePoseListener == null)
		{
			nodeRelativePoseListener = new NodeRelativePoseListener()
			{
				@Override
				public void relativePoseChanged(Matrix4d newPose) 
				{
					if(!isDisposed())
					{
						// Updates both node absolute position.
						updateFromAbsolutePosition();
						updateToAbsolutePosition();
						
						// Updates distance
						updateDistance();
						
						pointsRelativePoseChanged(newPose);
					}
				}
			};
		}
		return nodeRelativePoseListener;
	}
} //AbstractTwoPoints3DToolImpl
