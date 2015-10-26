/**
 * Canadian Space Agency 2008.
 *
 * $Id: RasterPointCloudImpl.java,v 1.3.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage;
import org.eclipse.symphony.common.geometry.data3d.RasterPointCloud;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Raster Point Cloud</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.impl.RasterPointCloudImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.impl.RasterPointCloudImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RasterPointCloudImpl extends MinimalEObjectImpl.Container implements
		RasterPointCloud {

	private CartesianPositionCoordinates[] points = null;

	/**
	 * The default value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected static final int ROWS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected int rows = ROWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMNS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected int columns = COLUMNS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RasterPointCloudImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonGeometryData3DPackage.Literals.RASTER_POINT_CLOUD;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getRows() {
		return rows;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setRows(int newRows) {

		if (newRows < ROWS_EDEFAULT) {
			throw new IllegalArgumentException("Invalid row value, must be >= "
					+ ROWS_EDEFAULT);
		}

		points = null;

		int oldRows = rows;
		rows = newRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Symphony__CommonGeometryData3DPackage.RASTER_POINT_CLOUD__ROWS, oldRows, rows));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setColumns(int newColumns) {

		if (newColumns < COLUMNS_EDEFAULT) {
			throw new IllegalArgumentException(
					"Invalid column value, must be >= " + COLUMNS_EDEFAULT);
		}

		points = null;

		int oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Symphony__CommonGeometryData3DPackage.RASTER_POINT_CLOUD__COLUMNS, oldColumns,
					columns));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianPositionCoordinates getPoint(int row, int column) {

		validateRowCol(row, column);

		int index = computeIndex(row, column);

		return getPoints()[index];
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setPoint(int row, int column, CartesianPositionCoordinates point) {
		validateRowCol(row, column);

		int index = computeIndex(row, column);

		getPoints()[index] = point;

	}

	private int computeIndex(int row, int col) {
		int index = row * getColumns() + col;
		return index;
	}

	/**
	 * Validates row and col based on the current values of {@link #rows} and
	 * {@link #columns}.
	 * 
	 * @param row
	 *            the row position.
	 * @param col
	 *            the column position.
	 * @throws IllegalArgumentException
	 *             if row < 0 or row >= {@link #getRows()} or col < 0 or col >=
	 *             {@link #getColumns()}.
	 */
	private void validateRowCol(int row, int col)
			throws IllegalArgumentException {
		if (row < 0 || row >= getRows()) {
			throw new IllegalArgumentException("Row must be between [0.."
					+ getRows() + "]");
		}

		if (col < 0 || col >= getColumns()) {
			throw new IllegalArgumentException("Column must be between [0.."
					+ getColumns() + "]");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__CommonGeometryData3DPackage.RASTER_POINT_CLOUD__ROWS:
				return getRows();
			case Symphony__CommonGeometryData3DPackage.RASTER_POINT_CLOUD__COLUMNS:
				return getColumns();
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
			case Symphony__CommonGeometryData3DPackage.RASTER_POINT_CLOUD__ROWS:
				setRows((Integer)newValue);
				return;
			case Symphony__CommonGeometryData3DPackage.RASTER_POINT_CLOUD__COLUMNS:
				setColumns((Integer)newValue);
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
			case Symphony__CommonGeometryData3DPackage.RASTER_POINT_CLOUD__ROWS:
				setRows(ROWS_EDEFAULT);
				return;
			case Symphony__CommonGeometryData3DPackage.RASTER_POINT_CLOUD__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
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
			case Symphony__CommonGeometryData3DPackage.RASTER_POINT_CLOUD__ROWS:
				return rows != ROWS_EDEFAULT;
			case Symphony__CommonGeometryData3DPackage.RASTER_POINT_CLOUD__COLUMNS:
				return columns != COLUMNS_EDEFAULT;
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
			case Symphony__CommonGeometryData3DPackage.RASTER_POINT_CLOUD___GET_POINT__INT_INT:
				return getPoint((Integer)arguments.get(0), (Integer)arguments.get(1));
			case Symphony__CommonGeometryData3DPackage.RASTER_POINT_CLOUD___SET_POINT__INT_INT_CARTESIANPOSITIONCOORDINATES:
				setPoint((Integer)arguments.get(0), (Integer)arguments.get(1), (CartesianPositionCoordinates)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (rows: ");
		result.append(rows);
		result.append(", columns: ");
		result.append(columns);
		result.append(')');
		return result.toString();
	}

	/**
	 * Pre-condition: rows and columns are valid.
	 * 
	 * @return
	 */
	private CartesianPositionCoordinates[] getPoints() {
		if (points == null) {
			points = new CartesianPositionCoordinates[getRows() * getColumns()];
		}
		return points;
	}

} // RasterPointCloudImpl
