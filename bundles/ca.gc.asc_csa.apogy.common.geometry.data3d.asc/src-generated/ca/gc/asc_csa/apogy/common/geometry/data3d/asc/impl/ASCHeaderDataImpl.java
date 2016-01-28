/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.asc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.geometry.data3d.asc.ASCHeaderData;
import org.eclipse.symphony.common.geometry.data3d.asc.Symphony__CommonGeometryData3DASCPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ASC Header Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.asc.impl.ASCHeaderDataImpl#getNumberOfRow <em>Number Of Row</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.asc.impl.ASCHeaderDataImpl#getNumberOfColumns <em>Number Of Columns</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.asc.impl.ASCHeaderDataImpl#getXllCenter <em>Xll Center</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.asc.impl.ASCHeaderDataImpl#getYllCenter <em>Yll Center</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.asc.impl.ASCHeaderDataImpl#getCellSize <em>Cell Size</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.asc.impl.ASCHeaderDataImpl#getNoDataValue <em>No Data Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ASCHeaderDataImpl extends MinimalEObjectImpl.Container implements ASCHeaderData {
	/**
	 * The default value of the '{@link #getNumberOfRow() <em>Number Of Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRow()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_ROW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfRow() <em>Number Of Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRow()
	 * @generated
	 * @ordered
	 */
	protected int numberOfRow = NUMBER_OF_ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfColumns() <em>Number Of Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_COLUMNS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfColumns() <em>Number Of Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfColumns()
	 * @generated
	 * @ordered
	 */
	protected int numberOfColumns = NUMBER_OF_COLUMNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getXllCenter() <em>Xll Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXllCenter()
	 * @generated
	 * @ordered
	 */
	protected static final double XLL_CENTER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXllCenter() <em>Xll Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXllCenter()
	 * @generated
	 * @ordered
	 */
	protected double xllCenter = XLL_CENTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getYllCenter() <em>Yll Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYllCenter()
	 * @generated
	 * @ordered
	 */
	protected static final double YLL_CENTER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYllCenter() <em>Yll Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYllCenter()
	 * @generated
	 * @ordered
	 */
	protected double yllCenter = YLL_CENTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCellSize() <em>Cell Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellSize()
	 * @generated
	 * @ordered
	 */
	protected static final double CELL_SIZE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCellSize() <em>Cell Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellSize()
	 * @generated
	 * @ordered
	 */
	protected double cellSize = CELL_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoDataValue() <em>No Data Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoDataValue()
	 * @generated
	 * @ordered
	 */
	protected static final double NO_DATA_VALUE_EDEFAULT = -9999.0;

	/**
	 * The cached value of the '{@link #getNoDataValue() <em>No Data Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoDataValue()
	 * @generated
	 * @ordered
	 */
	protected double noDataValue = NO_DATA_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASCHeaderDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonGeometryData3DASCPackage.Literals.ASC_HEADER_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfRow() {
		return numberOfRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRow(int newNumberOfRow) {
		int oldNumberOfRow = numberOfRow;
		numberOfRow = newNumberOfRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__NUMBER_OF_ROW, oldNumberOfRow, numberOfRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfColumns() {
		return numberOfColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfColumns(int newNumberOfColumns) {
		int oldNumberOfColumns = numberOfColumns;
		numberOfColumns = newNumberOfColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__NUMBER_OF_COLUMNS, oldNumberOfColumns, numberOfColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXllCenter() {
		return xllCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXllCenter(double newXllCenter) {
		double oldXllCenter = xllCenter;
		xllCenter = newXllCenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__XLL_CENTER, oldXllCenter, xllCenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYllCenter() {
		return yllCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYllCenter(double newYllCenter) {
		double oldYllCenter = yllCenter;
		yllCenter = newYllCenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__YLL_CENTER, oldYllCenter, yllCenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCellSize() {
		return cellSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellSize(double newCellSize) {
		double oldCellSize = cellSize;
		cellSize = newCellSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__CELL_SIZE, oldCellSize, cellSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNoDataValue() {
		return noDataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoDataValue(double newNoDataValue) {
		double oldNoDataValue = noDataValue;
		noDataValue = newNoDataValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__NO_DATA_VALUE, oldNoDataValue, noDataValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__NUMBER_OF_ROW:
				return getNumberOfRow();
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__NUMBER_OF_COLUMNS:
				return getNumberOfColumns();
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__XLL_CENTER:
				return getXllCenter();
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__YLL_CENTER:
				return getYllCenter();
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__CELL_SIZE:
				return getCellSize();
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__NO_DATA_VALUE:
				return getNoDataValue();
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
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__NUMBER_OF_ROW:
				setNumberOfRow((Integer)newValue);
				return;
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__NUMBER_OF_COLUMNS:
				setNumberOfColumns((Integer)newValue);
				return;
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__XLL_CENTER:
				setXllCenter((Double)newValue);
				return;
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__YLL_CENTER:
				setYllCenter((Double)newValue);
				return;
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__CELL_SIZE:
				setCellSize((Double)newValue);
				return;
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__NO_DATA_VALUE:
				setNoDataValue((Double)newValue);
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
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__NUMBER_OF_ROW:
				setNumberOfRow(NUMBER_OF_ROW_EDEFAULT);
				return;
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__NUMBER_OF_COLUMNS:
				setNumberOfColumns(NUMBER_OF_COLUMNS_EDEFAULT);
				return;
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__XLL_CENTER:
				setXllCenter(XLL_CENTER_EDEFAULT);
				return;
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__YLL_CENTER:
				setYllCenter(YLL_CENTER_EDEFAULT);
				return;
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__CELL_SIZE:
				setCellSize(CELL_SIZE_EDEFAULT);
				return;
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__NO_DATA_VALUE:
				setNoDataValue(NO_DATA_VALUE_EDEFAULT);
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
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__NUMBER_OF_ROW:
				return numberOfRow != NUMBER_OF_ROW_EDEFAULT;
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__NUMBER_OF_COLUMNS:
				return numberOfColumns != NUMBER_OF_COLUMNS_EDEFAULT;
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__XLL_CENTER:
				return xllCenter != XLL_CENTER_EDEFAULT;
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__YLL_CENTER:
				return yllCenter != YLL_CENTER_EDEFAULT;
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__CELL_SIZE:
				return cellSize != CELL_SIZE_EDEFAULT;
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA__NO_DATA_VALUE:
				return noDataValue != NO_DATA_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (numberOfRow: ");
		result.append(numberOfRow);
		result.append(", numberOfColumns: ");
		result.append(numberOfColumns);
		result.append(", xllCenter: ");
		result.append(xllCenter);
		result.append(", yllCenter: ");
		result.append(yllCenter);
		result.append(", cellSize: ");
		result.append(cellSize);
		result.append(", noDataValue: ");
		result.append(noDataValue);
		result.append(')');
		return result.toString();
	}

} //ASCHeaderDataImpl
