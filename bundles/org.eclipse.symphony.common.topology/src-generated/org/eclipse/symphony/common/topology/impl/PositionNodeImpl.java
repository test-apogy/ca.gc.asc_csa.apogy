/**
 * <copyright>
 * </copyright>
 *
 * $Id: PositionNodeImpl.java,v 1.12.2.2 2015/02/03 20:01:30 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Symphony__CommonMathFactory;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.topology.INodeVisitor;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.PositionNode;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Position Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.impl.PositionNodeImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionNodeImpl extends AggregateGroupNodeImpl implements
		PositionNode {
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d position;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPosition()
	 * @generated_NOT
	 * @ordered
	 */
	protected static final Tuple3d POSITION_EDEFAULT = Symphony__CommonMathFactory.eINSTANCE
			.createTuple3d();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonTopologyPackage.Literals.POSITION_NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Tuple3d getPosition() 
	{
		Tuple3d tmp = getPositionGen();
		if(tmp == null)
		{
			tmp = MathFacade.INSTANCE.createTuple3d(0, 0, 0);
			setPosition(tmp);
		}
		
		return tmp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getPositionGen() {
		return position;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Tuple3d newPosition,
			NotificationChain msgs) {
		Tuple3d oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__CommonTopologyPackage.POSITION_NODE__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Tuple3d newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__CommonTopologyPackage.POSITION_NODE__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Symphony__CommonTopologyPackage.POSITION_NODE__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonTopologyPackage.POSITION_NODE__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__CommonTopologyPackage.POSITION_NODE__POSITION:
				return basicSetPosition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__CommonTopologyPackage.POSITION_NODE__POSITION:
				return getPosition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Symphony__CommonTopologyPackage.POSITION_NODE__POSITION:
				setPosition((Tuple3d)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Symphony__CommonTopologyPackage.POSITION_NODE__POSITION:
				setPosition((Tuple3d)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Symphony__CommonTopologyPackage.POSITION_NODE__POSITION:
				return position != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void accept(INodeVisitor visitor) {
		if (visitor.getType().isInstance(this)) {
			visitor.visit(this);
		}

		// We do the same for all the children.
		for (Node child : getChildren()) {
			child.accept(visitor);
		}
	}

} // PositionNodeImpl
