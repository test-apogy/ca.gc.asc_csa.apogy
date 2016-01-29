/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransformNodeImpl.java,v 1.13.2.2 2015/02/03 20:01:30 rlarcheveque Exp $
 */
package ca.gc.asc_csa.apogy.common.topology.impl;

import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Matrix3x3;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.INodeVisitor;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.RotationNode;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Transform Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.impl.TransformNodeImpl#getRotationMatrix <em>Rotation Matrix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformNodeImpl extends PositionNodeImpl implements
		TransformNode {

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
	protected TransformNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyPackage.Literals.TRANSFORM_NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void unsetTransformationMatrix() {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public boolean isSetTransformationMatrix() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCommonTopologyPackage.TRANSFORM_NODE__ROTATION_MATRIX:
				return basicSetRotationMatrix(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			tmp = ApogyCommonMathFacade.INSTANCE.createMatrix3x3(matrix);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyPackage.TRANSFORM_NODE__ROTATION_MATRIX, oldRotationMatrix, newRotationMatrix);
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
				msgs = ((InternalEObject)rotationMatrix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyPackage.TRANSFORM_NODE__ROTATION_MATRIX, null, msgs);
			if (newRotationMatrix != null)
				msgs = ((InternalEObject)newRotationMatrix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyPackage.TRANSFORM_NODE__ROTATION_MATRIX, null, msgs);
			msgs = basicSetRotationMatrix(newRotationMatrix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyPackage.TRANSFORM_NODE__ROTATION_MATRIX, newRotationMatrix, newRotationMatrix));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Matrix4d asMatrix4d() {

		Matrix4d result = new Matrix4d();

		result.setIdentity();

		if (getRotationMatrix() != null) {
			result.setRotation(getRotationMatrix().asMatrix3d());
		}

		if (getPosition() != null) {
			result.setTranslation(new Vector3d(getPosition().asTuple3d()));
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setTransformation(Matrix4d matrix) {

		if (matrix == null) {
			throw new IllegalArgumentException();
		}

		Matrix3d rotation = new Matrix3d();
		Vector3d translation = new Vector3d();

		// FIXME This should work, gave a BadTransformException
		matrix.getRotationScale(rotation);
		matrix.get(translation);
		// matrix.get(rotation, translation);

		Matrix3x3 rMat = ApogyCommonMathFacade.INSTANCE.createMatrix3x3(rotation);
		Tuple3d trans = ApogyCommonMathFacade.INSTANCE.createTuple3d(translation);

		this.setRotationMatrix(rMat);
		this.setPosition(trans);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonTopologyPackage.TRANSFORM_NODE__ROTATION_MATRIX:
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
			case ApogyCommonTopologyPackage.TRANSFORM_NODE__ROTATION_MATRIX:
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
			case ApogyCommonTopologyPackage.TRANSFORM_NODE__ROTATION_MATRIX:
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
			case ApogyCommonTopologyPackage.TRANSFORM_NODE__ROTATION_MATRIX:
				return rotationMatrix != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == RotationNode.class) {
			switch (derivedFeatureID) {
				case ApogyCommonTopologyPackage.TRANSFORM_NODE__ROTATION_MATRIX: return ApogyCommonTopologyPackage.ROTATION_NODE__ROTATION_MATRIX;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == RotationNode.class) {
			switch (baseFeatureID) {
				case ApogyCommonTopologyPackage.ROTATION_NODE__ROTATION_MATRIX: return ApogyCommonTopologyPackage.TRANSFORM_NODE__ROTATION_MATRIX;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonTopologyPackage.TRANSFORM_NODE___AS_MATRIX4D:
				return asMatrix4d();
			case ApogyCommonTopologyPackage.TRANSFORM_NODE___SET_TRANSFORMATION__MATRIX4D:
				setTransformation((Matrix4d)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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

} // TransformNodeImpl
