/**
 * <copyright>
 * </copyright>
 *
 * $Id: RotationNodeImpl.java,v 1.12.2.2 2015/02/03 20:01:30 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.impl;

import javax.vecmath.Matrix3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.math.Symphony__CommonMathFacade;
import org.eclipse.symphony.common.math.Matrix3x3;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.topology.INodeVisitor;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.RotationNode;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Rotation Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.impl.RotationNodeImpl#getRotationMatrix <em>Rotation Matrix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotationNodeImpl extends AggregateGroupNodeImpl implements
		RotationNode {

	/**
	 * The cached value of the '{@link #getRotationMatrix() <em>Rotation Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationMatrix()
	 * @generated
	 * @ordered
	 */
	protected Matrix3x3 rotationMatrix;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRotation()
	 * @generated_NOT
	 * @ordered
	 */
	protected static final Tuple3d ROTATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRotationMatrix()
	 * <em>Rotation Matrix</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getRotationMatrix()
	 * @generated_NOT
	 * @ordered
	 */
	protected static final Matrix3d ROTATION_MATRIX_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RotationNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonTopologyPackage.Literals.ROTATION_NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Matrix3x3 getRotationMatrix() 
	{
		Matrix3x3 tmp = getRotationMatrixGen();
		if(tmp == null)
		{
			Matrix3d matrix = new Matrix3d();
			matrix.setIdentity();
			tmp = Symphony__CommonMathFacade.INSTANCE.createMatrix3x3(matrix);
			setRotationMatrix(tmp);
		}
		return tmp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix3x3 getRotationMatrixGen() {
		return rotationMatrix;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotationMatrix(
			Matrix3x3 newRotationMatrix, NotificationChain msgs) {
		Matrix3x3 oldRotationMatrix = rotationMatrix;
		rotationMatrix = newRotationMatrix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__CommonTopologyPackage.ROTATION_NODE__ROTATION_MATRIX, oldRotationMatrix, newRotationMatrix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationMatrix(Matrix3x3 newRotationMatrix) {
		if (newRotationMatrix != rotationMatrix) {
			NotificationChain msgs = null;
			if (rotationMatrix != null)
				msgs = ((InternalEObject)rotationMatrix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__CommonTopologyPackage.ROTATION_NODE__ROTATION_MATRIX, null, msgs);
			if (newRotationMatrix != null)
				msgs = ((InternalEObject)newRotationMatrix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Symphony__CommonTopologyPackage.ROTATION_NODE__ROTATION_MATRIX, null, msgs);
			msgs = basicSetRotationMatrix(newRotationMatrix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonTopologyPackage.ROTATION_NODE__ROTATION_MATRIX, newRotationMatrix, newRotationMatrix));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__CommonTopologyPackage.ROTATION_NODE__ROTATION_MATRIX:
				return basicSetRotationMatrix(null, msgs);
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
			case Symphony__CommonTopologyPackage.ROTATION_NODE__ROTATION_MATRIX:
				return getRotationMatrix();
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
			case Symphony__CommonTopologyPackage.ROTATION_NODE__ROTATION_MATRIX:
				setRotationMatrix((Matrix3x3)newValue);
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
			case Symphony__CommonTopologyPackage.ROTATION_NODE__ROTATION_MATRIX:
				setRotationMatrix((Matrix3x3)null);
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
			case Symphony__CommonTopologyPackage.ROTATION_NODE__ROTATION_MATRIX:
				return rotationMatrix != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void accept(INodeVisitor visitor) {
		if (visitor.getType().isInstance(this)) {
			System.out.println("RotationNodeImpl.accept() visiting "
					+ getDescription());
			visitor.visit(this);
		}

		// We do the same for all the children.
		for (Node child : getChildren()) {
			child.accept(visitor);
		}
	}

} // RotationNodeImpl
