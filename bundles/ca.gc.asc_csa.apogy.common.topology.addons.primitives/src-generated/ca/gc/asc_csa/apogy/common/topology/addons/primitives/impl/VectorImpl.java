/**
 * <copyright>
 * </copyright>
 *
 * $Id: VectorImpl.java,v 1.5.2.3 2015/02/03 20:01:31 rlarcheveque Exp $
 */
package ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl;

import javax.vecmath.Matrix3d;
import javax.vecmath.Point3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.math.GeometricUtils;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesPackage;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.Vector;
import ca.gc.asc_csa.apogy.common.topology.impl.NodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.VectorImpl#getXRotation <em>XRotation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.VectorImpl#getYRotation <em>YRotation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.VectorImpl#getZRotation <em>ZRotation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.VectorImpl#getLength <em>Length</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.VectorImpl#getEndPoint <em>End Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VectorImpl extends NodeImpl implements Vector
{
	/**
	 * The default value of the '{@link #getXRotation() <em>XRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRotation()
	 * @generated
	 * @ordered
	 */
	protected static final double XROTATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXRotation() <em>XRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRotation()
	 * @generated
	 * @ordered
	 */
	protected double xRotation = XROTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getYRotation() <em>YRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYRotation()
	 * @generated
	 * @ordered
	 */
	protected static final double YROTATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYRotation() <em>YRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYRotation()
	 * @generated
	 * @ordered
	 */
	protected double yRotation = YROTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getZRotation() <em>ZRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZRotation()
	 * @generated
	 * @ordered
	 */
	protected static final double ZROTATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZRotation() <em>ZRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZRotation()
	 * @generated
	 * @ordered
	 */
	protected double zRotation = ZROTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final double LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected double length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndPoint() <em>End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPoint()
	 * @generated
	 * @ordered
	 */
	protected static final Point3d END_POINT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VectorImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ApogyCommonTopologyAddonsPrimitivesPackage.Literals.VECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXRotation()
	{
		return xRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRotation(double newXRotation)
	{
		double oldXRotation = xRotation;
		xRotation = newXRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__XROTATION, oldXRotation, xRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYRotation()
	{
		return yRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYRotation(double newYRotation)
	{
		double oldYRotation = yRotation;
		yRotation = newYRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__YROTATION, oldYRotation, yRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZRotation()
	{
		return zRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZRotation(double newZRotation)
	{
		double oldZRotation = zRotation;
		zRotation = newZRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__ZROTATION, oldZRotation, zRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLength()
	{
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(double newLength)
	{
		double oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Point3d getEndPoint()
	{
		// Creates a point along the x axis at the proper distance.
		Point3d tip = new Point3d(getLength(), 0,0);
		
		// Creates the matrix representing the rotation.
		Matrix3d matrix = GeometricUtils.packXYZ(getXRotation(), getYRotation(), getZRotation());
		
		// Applies the transform onto the tip point.
		matrix.transform(tip);
		
		return tip;		
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__XROTATION:
				return getXRotation();
			case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__YROTATION:
				return getYRotation();
			case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__ZROTATION:
				return getZRotation();
			case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__LENGTH:
				return getLength();
			case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__END_POINT:
				return getEndPoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__XROTATION:
				setXRotation((Double)newValue);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__YROTATION:
				setYRotation((Double)newValue);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__ZROTATION:
				setZRotation((Double)newValue);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__LENGTH:
				setLength((Double)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__XROTATION:
				setXRotation(XROTATION_EDEFAULT);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__YROTATION:
				setYRotation(YROTATION_EDEFAULT);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__ZROTATION:
				setZRotation(ZROTATION_EDEFAULT);
				return;
			case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__LENGTH:
				setLength(LENGTH_EDEFAULT);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__XROTATION:
				return xRotation != XROTATION_EDEFAULT;
			case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__YROTATION:
				return yRotation != YROTATION_EDEFAULT;
			case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__ZROTATION:
				return zRotation != ZROTATION_EDEFAULT;
			case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__LENGTH:
				return length != LENGTH_EDEFAULT;
			case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__END_POINT:
				return END_POINT_EDEFAULT == null ? getEndPoint() != null : !END_POINT_EDEFAULT.equals(getEndPoint());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (xRotation: ");
		result.append(xRotation);
		result.append(", yRotation: ");
		result.append(yRotation);
		result.append(", zRotation: ");
		result.append(zRotation);
		result.append(", length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}

} //VectorImpl
