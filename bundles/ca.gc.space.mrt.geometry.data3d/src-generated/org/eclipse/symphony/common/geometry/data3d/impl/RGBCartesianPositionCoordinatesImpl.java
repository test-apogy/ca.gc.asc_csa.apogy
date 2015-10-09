/**
 * Canadian Space Agency 2008.
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;
import org.eclipse.symphony.common.geometry.data3d.RGBCartesianPositionCoordinates;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RGB Cartesian Position Coordinates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.impl.RGBCartesianPositionCoordinatesImpl#getRed <em>Red</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.impl.RGBCartesianPositionCoordinatesImpl#getGreen <em>Green</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.impl.RGBCartesianPositionCoordinatesImpl#getBlue <em>Blue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RGBCartesianPositionCoordinatesImpl extends CartesianPositionCoordinatesImpl implements RGBCartesianPositionCoordinates
{
	/**
	 * The default value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected static final byte RED_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected byte red = RED_EDEFAULT;

	/**
	 * The default value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected static final byte GREEN_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected byte green = GREEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected static final byte BLUE_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected byte blue = BLUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RGBCartesianPositionCoordinatesImpl()
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
		return Data3dPackage.Literals.RGB_CARTESIAN_POSITION_COORDINATES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getRed()
	{
		return red;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRed(byte newRed)
	{
		byte oldRed = red;
		red = newRed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.RGB_CARTESIAN_POSITION_COORDINATES__RED, oldRed, red));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getGreen()
	{
		return green;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreen(byte newGreen)
	{
		byte oldGreen = green;
		green = newGreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.RGB_CARTESIAN_POSITION_COORDINATES__GREEN, oldGreen, green));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getBlue()
	{
		return blue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlue(byte newBlue)
	{
		byte oldBlue = blue;
		blue = newBlue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.RGB_CARTESIAN_POSITION_COORDINATES__BLUE, oldBlue, blue));
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
			case Data3dPackage.RGB_CARTESIAN_POSITION_COORDINATES__RED:
				return getRed();
			case Data3dPackage.RGB_CARTESIAN_POSITION_COORDINATES__GREEN:
				return getGreen();
			case Data3dPackage.RGB_CARTESIAN_POSITION_COORDINATES__BLUE:
				return getBlue();
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
			case Data3dPackage.RGB_CARTESIAN_POSITION_COORDINATES__RED:
				setRed((Byte)newValue);
				return;
			case Data3dPackage.RGB_CARTESIAN_POSITION_COORDINATES__GREEN:
				setGreen((Byte)newValue);
				return;
			case Data3dPackage.RGB_CARTESIAN_POSITION_COORDINATES__BLUE:
				setBlue((Byte)newValue);
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
			case Data3dPackage.RGB_CARTESIAN_POSITION_COORDINATES__RED:
				setRed(RED_EDEFAULT);
				return;
			case Data3dPackage.RGB_CARTESIAN_POSITION_COORDINATES__GREEN:
				setGreen(GREEN_EDEFAULT);
				return;
			case Data3dPackage.RGB_CARTESIAN_POSITION_COORDINATES__BLUE:
				setBlue(BLUE_EDEFAULT);
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
			case Data3dPackage.RGB_CARTESIAN_POSITION_COORDINATES__RED:
				return red != RED_EDEFAULT;
			case Data3dPackage.RGB_CARTESIAN_POSITION_COORDINATES__GREEN:
				return green != GREEN_EDEFAULT;
			case Data3dPackage.RGB_CARTESIAN_POSITION_COORDINATES__BLUE:
				return blue != BLUE_EDEFAULT;
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
		result.append(" (red: ");
		result.append(red);
		result.append(", green: ");
		result.append(green);
		result.append(", blue: ");
		result.append(blue);
		result.append(')');
		return result.toString();
	}

} //RGBCartesianPositionCoordinatesImpl
