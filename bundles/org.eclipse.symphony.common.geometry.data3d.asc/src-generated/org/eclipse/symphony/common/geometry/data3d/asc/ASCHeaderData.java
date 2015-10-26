/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.asc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ASC Header Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class representing a ASC file header.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.asc.ASCHeaderData#getNumberOfRow <em>Number Of Row</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.asc.ASCHeaderData#getNumberOfColumns <em>Number Of Columns</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.asc.ASCHeaderData#getXllCenter <em>Xll Center</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.asc.ASCHeaderData#getYllCenter <em>Yll Center</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.asc.ASCHeaderData#getCellSize <em>Cell Size</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.asc.ASCHeaderData#getNoDataValue <em>No Data Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.geometry.data3d.asc.Symphony__CommonGeometryData3DASCPackage#getASCHeaderData()
 * @model
 * @generated
 */
public interface ASCHeaderData extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Of Row</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Row</em>' attribute.
	 * @see #setNumberOfRow(int)
	 * @see org.eclipse.symphony.common.geometry.data3d.asc.Symphony__CommonGeometryData3DASCPackage#getASCHeaderData_NumberOfRow()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getNumberOfRow();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.asc.ASCHeaderData#getNumberOfRow <em>Number Of Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Row</em>' attribute.
	 * @see #getNumberOfRow()
	 * @generated
	 */
	void setNumberOfRow(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Columns</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Columns</em>' attribute.
	 * @see #setNumberOfColumns(int)
	 * @see org.eclipse.symphony.common.geometry.data3d.asc.Symphony__CommonGeometryData3DASCPackage#getASCHeaderData_NumberOfColumns()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getNumberOfColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.asc.ASCHeaderData#getNumberOfColumns <em>Number Of Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Columns</em>' attribute.
	 * @see #getNumberOfColumns()
	 * @generated
	 */
	void setNumberOfColumns(int value);

	/**
	 * Returns the value of the '<em><b>Xll Center</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xll Center</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xll Center</em>' attribute.
	 * @see #setXllCenter(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.asc.Symphony__CommonGeometryData3DASCPackage#getASCHeaderData_XllCenter()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getXllCenter();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.asc.ASCHeaderData#getXllCenter <em>Xll Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xll Center</em>' attribute.
	 * @see #getXllCenter()
	 * @generated
	 */
	void setXllCenter(double value);

	/**
	 * Returns the value of the '<em><b>Yll Center</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yll Center</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yll Center</em>' attribute.
	 * @see #setYllCenter(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.asc.Symphony__CommonGeometryData3DASCPackage#getASCHeaderData_YllCenter()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getYllCenter();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.asc.ASCHeaderData#getYllCenter <em>Yll Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yll Center</em>' attribute.
	 * @see #getYllCenter()
	 * @generated
	 */
	void setYllCenter(double value);

	/**
	 * Returns the value of the '<em><b>Cell Size</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Size</em>' attribute.
	 * @see #setCellSize(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.asc.Symphony__CommonGeometryData3DASCPackage#getASCHeaderData_CellSize()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='m'"
	 * @generated
	 */
	double getCellSize();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.asc.ASCHeaderData#getCellSize <em>Cell Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Size</em>' attribute.
	 * @see #getCellSize()
	 * @generated
	 */
	void setCellSize(double value);

	/**
	 * Returns the value of the '<em><b>No Data Value</b></em>' attribute.
	 * The default value is <code>"-9999"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Data Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Data Value</em>' attribute.
	 * @see #setNoDataValue(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.asc.Symphony__CommonGeometryData3DASCPackage#getASCHeaderData_NoDataValue()
	 * @model default="-9999" unique="false"
	 * @generated
	 */
	double getNoDataValue();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.asc.ASCHeaderData#getNoDataValue <em>No Data Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Data Value</em>' attribute.
	 * @see #getNoDataValue()
	 * @generated
	 */
	void setNoDataValue(double value);

} // ASCHeaderData
