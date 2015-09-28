/**
 * Canadian Space Agency 2007
 *
 * $Id: CsvExporterImpl.java,v 1.3.4.2 2015/05/21 15:51:13 pallard Exp $
 */
package ca.gc.space.mrt.common.recorders.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ca.gc.space.mrt.common.csv.CsvColumsSet;
import ca.gc.space.mrt.common.recorders.CsvExporter;
import ca.gc.space.mrt.common.recorders.RecordersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Csv Exporter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.common.recorders.impl.CsvExporterImpl#isIncludeColumnDescription <em>Include Column Description</em>}</li>
 *   <li>{@link ca.gc.space.mrt.common.recorders.impl.CsvExporterImpl#isIncludeColumnName <em>Include Column Name</em>}</li>
 *   <li>{@link ca.gc.space.mrt.common.recorders.impl.CsvExporterImpl#getColumnSet <em>Column Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CsvExporterImpl extends EObjectImpl implements CsvExporter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007";

	/**
	 * The default value of the '{@link #isIncludeColumnDescription() <em>Include Column Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeColumnDescription()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_COLUMN_DESCRIPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeColumnDescription() <em>Include Column Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeColumnDescription()
	 * @generated
	 * @ordered
	 */
	protected boolean includeColumnDescription = INCLUDE_COLUMN_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncludeColumnName() <em>Include Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_COLUMN_NAME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeColumnName() <em>Include Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeColumnName()
	 * @generated
	 * @ordered
	 */
	protected boolean includeColumnName = INCLUDE_COLUMN_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumnSet() <em>Column Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnSet()
	 * @generated
	 * @ordered
	 */
	protected CsvColumsSet columnSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CsvExporterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecordersPackage.Literals.CSV_EXPORTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludeColumnDescription() {
		return includeColumnDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeColumnDescription(boolean newIncludeColumnDescription) {
		boolean oldIncludeColumnDescription = includeColumnDescription;
		includeColumnDescription = newIncludeColumnDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecordersPackage.CSV_EXPORTER__INCLUDE_COLUMN_DESCRIPTION, oldIncludeColumnDescription, includeColumnDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludeColumnName() {
		return includeColumnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeColumnName(boolean newIncludeColumnName) {
		boolean oldIncludeColumnName = includeColumnName;
		includeColumnName = newIncludeColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecordersPackage.CSV_EXPORTER__INCLUDE_COLUMN_NAME, oldIncludeColumnName, includeColumnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsvColumsSet getColumnSet() {
		if (columnSet != null && columnSet.eIsProxy()) {
			InternalEObject oldColumnSet = (InternalEObject)columnSet;
			columnSet = (CsvColumsSet)eResolveProxy(oldColumnSet);
			if (columnSet != oldColumnSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecordersPackage.CSV_EXPORTER__COLUMN_SET, oldColumnSet, columnSet));
			}
		}
		return columnSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsvColumsSet basicGetColumnSet() {
		return columnSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void exportToCSVFile(String exportPath) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecordersPackage.CSV_EXPORTER__INCLUDE_COLUMN_DESCRIPTION:
				return isIncludeColumnDescription() ? Boolean.TRUE : Boolean.FALSE;
			case RecordersPackage.CSV_EXPORTER__INCLUDE_COLUMN_NAME:
				return isIncludeColumnName() ? Boolean.TRUE : Boolean.FALSE;
			case RecordersPackage.CSV_EXPORTER__COLUMN_SET:
				if (resolve) return getColumnSet();
				return basicGetColumnSet();
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
			case RecordersPackage.CSV_EXPORTER__INCLUDE_COLUMN_DESCRIPTION:
				setIncludeColumnDescription(((Boolean)newValue).booleanValue());
				return;
			case RecordersPackage.CSV_EXPORTER__INCLUDE_COLUMN_NAME:
				setIncludeColumnName(((Boolean)newValue).booleanValue());
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
			case RecordersPackage.CSV_EXPORTER__INCLUDE_COLUMN_DESCRIPTION:
				setIncludeColumnDescription(INCLUDE_COLUMN_DESCRIPTION_EDEFAULT);
				return;
			case RecordersPackage.CSV_EXPORTER__INCLUDE_COLUMN_NAME:
				setIncludeColumnName(INCLUDE_COLUMN_NAME_EDEFAULT);
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
			case RecordersPackage.CSV_EXPORTER__INCLUDE_COLUMN_DESCRIPTION:
				return includeColumnDescription != INCLUDE_COLUMN_DESCRIPTION_EDEFAULT;
			case RecordersPackage.CSV_EXPORTER__INCLUDE_COLUMN_NAME:
				return includeColumnName != INCLUDE_COLUMN_NAME_EDEFAULT;
			case RecordersPackage.CSV_EXPORTER__COLUMN_SET:
				return columnSet != null;
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
		result.append(" (includeColumnDescription: ");
		result.append(includeColumnDescription);
		result.append(", includeColumnName: ");
		result.append(includeColumnName);
		result.append(')');
		return result.toString();
	}

} //CsvExporterImpl
