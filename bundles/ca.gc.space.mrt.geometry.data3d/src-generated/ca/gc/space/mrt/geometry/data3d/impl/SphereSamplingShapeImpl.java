/**
 * Canadian Space Agency 2008.
 *
 * $Id: SphereSamplingShapeImpl.java,v 1.4.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.geometry.data.DataPackage;
import org.eclipse.symphony.common.geometry.data.PolygonSamplingShape;

import ca.gc.space.mrt.geometry.data3d.CartesianPolygon;
import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.space.mrt.geometry.data3d.Data3dPackage;
import ca.gc.space.mrt.geometry.data3d.Geometry3dUtilities;
import ca.gc.space.mrt.geometry.data3d.SphereSamplingShape;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sphere Sampling Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.SphereSamplingShapeImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.SphereSamplingShapeImpl#getCenter <em>Center</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.SphereSamplingShapeImpl#isIncludeJustTouching <em>Include Just Touching</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SphereSamplingShapeImpl<PolygonType extends CartesianPolygon> extends MinimalEObjectImpl.Container implements SphereSamplingShape<PolygonType>
{
	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIUS_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected double radius = RADIUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCenter() <em>Center</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenter()
	 * @generated
	 * @ordered
	 */
	protected CartesianPositionCoordinates center;

	/**
	 * The default value of the '{@link #isIncludeJustTouching() <em>Include Just Touching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeJustTouching()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_JUST_TOUCHING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIncludeJustTouching() <em>Include Just Touching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeJustTouching()
	 * @generated
	 * @ordered
	 */
	protected boolean includeJustTouching = INCLUDE_JUST_TOUCHING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SphereSamplingShapeImpl()
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
		return Data3dPackage.Literals.SPHERE_SAMPLING_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRadius()
	{
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(double newRadius)
	{
		double oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.SPHERE_SAMPLING_SHAPE__RADIUS, oldRadius, radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates getCenter()
	{
		if (center != null && center.eIsProxy()) {
			InternalEObject oldCenter = (InternalEObject)center;
			center = (CartesianPositionCoordinates)eResolveProxy(oldCenter);
			if (center != oldCenter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Data3dPackage.SPHERE_SAMPLING_SHAPE__CENTER, oldCenter, center));
			}
		}
		return center;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates basicGetCenter()
	{
		return center;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenter(CartesianPositionCoordinates newCenter)
	{
		CartesianPositionCoordinates oldCenter = center;
		center = newCenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.SPHERE_SAMPLING_SHAPE__CENTER, oldCenter, center));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludeJustTouching()
	{
		return includeJustTouching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeJustTouching(boolean newIncludeJustTouching)
	{
		boolean oldIncludeJustTouching = includeJustTouching;
		includeJustTouching = newIncludeJustTouching;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.SPHERE_SAMPLING_SHAPE__INCLUDE_JUST_TOUCHING, oldIncludeJustTouching, includeJustTouching));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public boolean isInside(CartesianPositionCoordinates point)
	{
		double distance = Geometry3dUtilities.getDistance(this.getCenter(), point);
		
		if(distance <= getRadius())
		{
			if(isIncludeJustTouching())
			{
				return true;
			}
			else
			{
				return (distance < getRadius());
			}
		}
		return false;
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
			case Data3dPackage.SPHERE_SAMPLING_SHAPE__RADIUS:
				return getRadius();
			case Data3dPackage.SPHERE_SAMPLING_SHAPE__CENTER:
				if (resolve) return getCenter();
				return basicGetCenter();
			case Data3dPackage.SPHERE_SAMPLING_SHAPE__INCLUDE_JUST_TOUCHING:
				return isIncludeJustTouching();
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
			case Data3dPackage.SPHERE_SAMPLING_SHAPE__RADIUS:
				setRadius((Double)newValue);
				return;
			case Data3dPackage.SPHERE_SAMPLING_SHAPE__CENTER:
				setCenter((CartesianPositionCoordinates)newValue);
				return;
			case Data3dPackage.SPHERE_SAMPLING_SHAPE__INCLUDE_JUST_TOUCHING:
				setIncludeJustTouching((Boolean)newValue);
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
			case Data3dPackage.SPHERE_SAMPLING_SHAPE__RADIUS:
				setRadius(RADIUS_EDEFAULT);
				return;
			case Data3dPackage.SPHERE_SAMPLING_SHAPE__CENTER:
				setCenter((CartesianPositionCoordinates)null);
				return;
			case Data3dPackage.SPHERE_SAMPLING_SHAPE__INCLUDE_JUST_TOUCHING:
				setIncludeJustTouching(INCLUDE_JUST_TOUCHING_EDEFAULT);
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
			case Data3dPackage.SPHERE_SAMPLING_SHAPE__RADIUS:
				return radius != RADIUS_EDEFAULT;
			case Data3dPackage.SPHERE_SAMPLING_SHAPE__CENTER:
				return center != null;
			case Data3dPackage.SPHERE_SAMPLING_SHAPE__INCLUDE_JUST_TOUCHING:
				return includeJustTouching != INCLUDE_JUST_TOUCHING_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == PolygonSamplingShape.class) {
			switch (baseOperationID) {
				case DataPackage.POLYGON_SAMPLING_SHAPE___IS_POLYGON_INSIDE__POLYGON: return Data3dPackage.SPHERE_SAMPLING_SHAPE___IS_POLYGON_INSIDE__POLYGON;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Data3dPackage.SPHERE_SAMPLING_SHAPE___IS_POLYGON_INSIDE__POLYGON:
				return isPolygonInside((PolygonType)arguments.get(0));
			case Data3dPackage.SPHERE_SAMPLING_SHAPE___IS_INSIDE__COORDINATES:
				return isInside((CartesianPositionCoordinates)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (radius: ");
		result.append(radius);
		result.append(", includeJustTouching: ");
		result.append(includeJustTouching);
		result.append(')');
		return result.toString();
	}

	public boolean isPolygonInside(PolygonType polygon)
	{
		return Geometry3dUtilities.isSphereIntersectsPolygon(getCenter(), getRadius(), isIncludeJustTouching(), polygon);
	}

} //SphereSamplingShapeImpl
