/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.las;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LAS Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getFileSignature <em>File Signature</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getFileSourceID <em>File Source ID</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getGlobalEncoding <em>Global Encoding</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getProjectID_GUID_data_1 <em>Project ID GUID data 1</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getProjectID_GUID_data_2 <em>Project ID GUID data 2</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getProjectID_GUID_data_3 <em>Project ID GUID data 3</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getProjectID_GUID_data_4 <em>Project ID GUID data 4</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getVersionMajor <em>Version Major</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getVersionMinor <em>Version Minor</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getSystemIdentifier <em>System Identifier</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getGeneratingSoftware <em>Generating Software</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getFileCreationDayOfYear <em>File Creation Day Of Year</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getFileCreationYear <em>File Creation Year</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getHeaderSize <em>Header Size</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getOffsetToPointData <em>Offset To Point Data</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getNVariableLengthRecords <em>NVariable Length Records</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getPointDataFormatID <em>Point Data Format ID</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getPointDataRecordLength <em>Point Data Record Length</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getNumberOfPointRecords <em>Number Of Point Records</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getNumberOfPointsByReturn <em>Number Of Points By Return</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getXScaleFactor <em>XScale Factor</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getYScaleFactor <em>YScale Factor</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getZScaleFactor <em>ZScale Factor</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getXOffset <em>XOffset</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getYOffset <em>YOffset</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getZOffset <em>ZOffset</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMaxX <em>Max X</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMinX <em>Min X</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMaxY <em>Max Y</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMinY <em>Min Y</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMaxZ <em>Max Z</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMinZ <em>Min Z</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getStartOfWaveformDataPacketRecord <em>Start Of Waveform Data Packet Record</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader()
 * @model
 * @generated
 */
public interface LASHeader extends EObject {
	/**
	 * Returns the value of the '<em><b>File Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Signature</em>' attribute.
	 * @see #setFileSignature(String)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_FileSignature()
	 * @model unique="false"
	 * @generated
	 */
	String getFileSignature();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getFileSignature <em>File Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Signature</em>' attribute.
	 * @see #getFileSignature()
	 * @generated
	 */
	void setFileSignature(String value);

	/**
	 * Returns the value of the '<em><b>File Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Source ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Source ID</em>' attribute.
	 * @see #setFileSourceID(int)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_FileSourceID()
	 * @model unique="false"
	 * @generated
	 */
	int getFileSourceID();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getFileSourceID <em>File Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Source ID</em>' attribute.
	 * @see #getFileSourceID()
	 * @generated
	 */
	void setFileSourceID(int value);

	/**
	 * Returns the value of the '<em><b>Global Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Encoding</em>' attribute.
	 * @see #setGlobalEncoding(int)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_GlobalEncoding()
	 * @model unique="false"
	 * @generated
	 */
	int getGlobalEncoding();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getGlobalEncoding <em>Global Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Encoding</em>' attribute.
	 * @see #getGlobalEncoding()
	 * @generated
	 */
	void setGlobalEncoding(int value);

	/**
	 * Returns the value of the '<em><b>Project ID GUID data 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project ID GUID data 1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project ID GUID data 1</em>' attribute.
	 * @see #setProjectID_GUID_data_1(long)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_ProjectID_GUID_data_1()
	 * @model unique="false"
	 * @generated
	 */
	long getProjectID_GUID_data_1();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getProjectID_GUID_data_1 <em>Project ID GUID data 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project ID GUID data 1</em>' attribute.
	 * @see #getProjectID_GUID_data_1()
	 * @generated
	 */
	void setProjectID_GUID_data_1(long value);

	/**
	 * Returns the value of the '<em><b>Project ID GUID data 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project ID GUID data 2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project ID GUID data 2</em>' attribute.
	 * @see #setProjectID_GUID_data_2(int)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_ProjectID_GUID_data_2()
	 * @model unique="false"
	 * @generated
	 */
	int getProjectID_GUID_data_2();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getProjectID_GUID_data_2 <em>Project ID GUID data 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project ID GUID data 2</em>' attribute.
	 * @see #getProjectID_GUID_data_2()
	 * @generated
	 */
	void setProjectID_GUID_data_2(int value);

	/**
	 * Returns the value of the '<em><b>Project ID GUID data 3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project ID GUID data 3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project ID GUID data 3</em>' attribute.
	 * @see #setProjectID_GUID_data_3(int)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_ProjectID_GUID_data_3()
	 * @model unique="false"
	 * @generated
	 */
	int getProjectID_GUID_data_3();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getProjectID_GUID_data_3 <em>Project ID GUID data 3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project ID GUID data 3</em>' attribute.
	 * @see #getProjectID_GUID_data_3()
	 * @generated
	 */
	void setProjectID_GUID_data_3(int value);

	/**
	 * Returns the value of the '<em><b>Project ID GUID data 4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project ID GUID data 4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project ID GUID data 4</em>' attribute.
	 * @see #setProjectID_GUID_data_4(byte[])
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_ProjectID_GUID_data_4()
	 * @model unique="false"
	 * @generated
	 */
	byte[] getProjectID_GUID_data_4();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getProjectID_GUID_data_4 <em>Project ID GUID data 4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project ID GUID data 4</em>' attribute.
	 * @see #getProjectID_GUID_data_4()
	 * @generated
	 */
	void setProjectID_GUID_data_4(byte[] value);

	/**
	 * Returns the value of the '<em><b>Version Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Major</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Major</em>' attribute.
	 * @see #setVersionMajor(int)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_VersionMajor()
	 * @model unique="false"
	 * @generated
	 */
	int getVersionMajor();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getVersionMajor <em>Version Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Major</em>' attribute.
	 * @see #getVersionMajor()
	 * @generated
	 */
	void setVersionMajor(int value);

	/**
	 * Returns the value of the '<em><b>Version Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Minor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Minor</em>' attribute.
	 * @see #setVersionMinor(int)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_VersionMinor()
	 * @model unique="false"
	 * @generated
	 */
	int getVersionMinor();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getVersionMinor <em>Version Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Minor</em>' attribute.
	 * @see #getVersionMinor()
	 * @generated
	 */
	void setVersionMinor(int value);

	/**
	 * Returns the value of the '<em><b>System Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Identifier</em>' attribute.
	 * @see #setSystemIdentifier(String)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_SystemIdentifier()
	 * @model unique="false"
	 * @generated
	 */
	String getSystemIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getSystemIdentifier <em>System Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Identifier</em>' attribute.
	 * @see #getSystemIdentifier()
	 * @generated
	 */
	void setSystemIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Generating Software</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generating Software</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating Software</em>' attribute.
	 * @see #setGeneratingSoftware(String)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_GeneratingSoftware()
	 * @model unique="false"
	 * @generated
	 */
	String getGeneratingSoftware();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getGeneratingSoftware <em>Generating Software</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generating Software</em>' attribute.
	 * @see #getGeneratingSoftware()
	 * @generated
	 */
	void setGeneratingSoftware(String value);

	/**
	 * Returns the value of the '<em><b>File Creation Day Of Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Creation Day Of Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Creation Day Of Year</em>' attribute.
	 * @see #setFileCreationDayOfYear(int)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_FileCreationDayOfYear()
	 * @model unique="false"
	 * @generated
	 */
	int getFileCreationDayOfYear();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getFileCreationDayOfYear <em>File Creation Day Of Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Creation Day Of Year</em>' attribute.
	 * @see #getFileCreationDayOfYear()
	 * @generated
	 */
	void setFileCreationDayOfYear(int value);

	/**
	 * Returns the value of the '<em><b>File Creation Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Creation Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Creation Year</em>' attribute.
	 * @see #setFileCreationYear(int)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_FileCreationYear()
	 * @model unique="false"
	 * @generated
	 */
	int getFileCreationYear();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getFileCreationYear <em>File Creation Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Creation Year</em>' attribute.
	 * @see #getFileCreationYear()
	 * @generated
	 */
	void setFileCreationYear(int value);

	/**
	 * Returns the value of the '<em><b>Header Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Size</em>' attribute.
	 * @see #setHeaderSize(int)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_HeaderSize()
	 * @model unique="false"
	 * @generated
	 */
	int getHeaderSize();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getHeaderSize <em>Header Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Size</em>' attribute.
	 * @see #getHeaderSize()
	 * @generated
	 */
	void setHeaderSize(int value);

	/**
	 * Returns the value of the '<em><b>Offset To Point Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset To Point Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset To Point Data</em>' attribute.
	 * @see #setOffsetToPointData(long)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_OffsetToPointData()
	 * @model unique="false"
	 * @generated
	 */
	long getOffsetToPointData();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getOffsetToPointData <em>Offset To Point Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset To Point Data</em>' attribute.
	 * @see #getOffsetToPointData()
	 * @generated
	 */
	void setOffsetToPointData(long value);

	/**
	 * Returns the value of the '<em><b>NVariable Length Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NVariable Length Records</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NVariable Length Records</em>' attribute.
	 * @see #setNVariableLengthRecords(long)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_NVariableLengthRecords()
	 * @model unique="false"
	 * @generated
	 */
	long getNVariableLengthRecords();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getNVariableLengthRecords <em>NVariable Length Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NVariable Length Records</em>' attribute.
	 * @see #getNVariableLengthRecords()
	 * @generated
	 */
	void setNVariableLengthRecords(long value);

	/**
	 * Returns the value of the '<em><b>Point Data Format ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Data Format ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Data Format ID</em>' attribute.
	 * @see #setPointDataFormatID(int)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_PointDataFormatID()
	 * @model unique="false"
	 * @generated
	 */
	int getPointDataFormatID();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getPointDataFormatID <em>Point Data Format ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Data Format ID</em>' attribute.
	 * @see #getPointDataFormatID()
	 * @generated
	 */
	void setPointDataFormatID(int value);

	/**
	 * Returns the value of the '<em><b>Point Data Record Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Data Record Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Data Record Length</em>' attribute.
	 * @see #setPointDataRecordLength(int)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_PointDataRecordLength()
	 * @model unique="false"
	 * @generated
	 */
	int getPointDataRecordLength();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getPointDataRecordLength <em>Point Data Record Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Data Record Length</em>' attribute.
	 * @see #getPointDataRecordLength()
	 * @generated
	 */
	void setPointDataRecordLength(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Point Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Point Records</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Point Records</em>' attribute.
	 * @see #setNumberOfPointRecords(long)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_NumberOfPointRecords()
	 * @model unique="false"
	 * @generated
	 */
	long getNumberOfPointRecords();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getNumberOfPointRecords <em>Number Of Point Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Point Records</em>' attribute.
	 * @see #getNumberOfPointRecords()
	 * @generated
	 */
	void setNumberOfPointRecords(long value);

	/**
	 * Returns the value of the '<em><b>Number Of Points By Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Points By Return</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Points By Return</em>' attribute.
	 * @see #setNumberOfPointsByReturn(long[])
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_NumberOfPointsByReturn()
	 * @model unique="false" dataType="org.eclipse.symphony.common.geometry.data3d.las.LongArray"
	 * @generated
	 */
	long[] getNumberOfPointsByReturn();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getNumberOfPointsByReturn <em>Number Of Points By Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Points By Return</em>' attribute.
	 * @see #getNumberOfPointsByReturn()
	 * @generated
	 */
	void setNumberOfPointsByReturn(long[] value);

	/**
	 * Returns the value of the '<em><b>XScale Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XScale Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XScale Factor</em>' attribute.
	 * @see #setXScaleFactor(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_XScaleFactor()
	 * @model unique="false"
	 * @generated
	 */
	double getXScaleFactor();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getXScaleFactor <em>XScale Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XScale Factor</em>' attribute.
	 * @see #getXScaleFactor()
	 * @generated
	 */
	void setXScaleFactor(double value);

	/**
	 * Returns the value of the '<em><b>YScale Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YScale Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YScale Factor</em>' attribute.
	 * @see #setYScaleFactor(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_YScaleFactor()
	 * @model unique="false"
	 * @generated
	 */
	double getYScaleFactor();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getYScaleFactor <em>YScale Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YScale Factor</em>' attribute.
	 * @see #getYScaleFactor()
	 * @generated
	 */
	void setYScaleFactor(double value);

	/**
	 * Returns the value of the '<em><b>ZScale Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZScale Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZScale Factor</em>' attribute.
	 * @see #setZScaleFactor(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_ZScaleFactor()
	 * @model unique="false"
	 * @generated
	 */
	double getZScaleFactor();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getZScaleFactor <em>ZScale Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZScale Factor</em>' attribute.
	 * @see #getZScaleFactor()
	 * @generated
	 */
	void setZScaleFactor(double value);

	/**
	 * Returns the value of the '<em><b>XOffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XOffset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XOffset</em>' attribute.
	 * @see #setXOffset(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_XOffset()
	 * @model unique="false"
	 * @generated
	 */
	double getXOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getXOffset <em>XOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XOffset</em>' attribute.
	 * @see #getXOffset()
	 * @generated
	 */
	void setXOffset(double value);

	/**
	 * Returns the value of the '<em><b>YOffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YOffset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YOffset</em>' attribute.
	 * @see #setYOffset(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_YOffset()
	 * @model unique="false"
	 * @generated
	 */
	double getYOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getYOffset <em>YOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YOffset</em>' attribute.
	 * @see #getYOffset()
	 * @generated
	 */
	void setYOffset(double value);

	/**
	 * Returns the value of the '<em><b>ZOffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZOffset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZOffset</em>' attribute.
	 * @see #setZOffset(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_ZOffset()
	 * @model unique="false"
	 * @generated
	 */
	double getZOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getZOffset <em>ZOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZOffset</em>' attribute.
	 * @see #getZOffset()
	 * @generated
	 */
	void setZOffset(double value);

	/**
	 * Returns the value of the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max X</em>' attribute.
	 * @see #setMaxX(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_MaxX()
	 * @model unique="false"
	 * @generated
	 */
	double getMaxX();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMaxX <em>Max X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max X</em>' attribute.
	 * @see #getMaxX()
	 * @generated
	 */
	void setMaxX(double value);

	/**
	 * Returns the value of the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min X</em>' attribute.
	 * @see #setMinX(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_MinX()
	 * @model unique="false"
	 * @generated
	 */
	double getMinX();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMinX <em>Min X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min X</em>' attribute.
	 * @see #getMinX()
	 * @generated
	 */
	void setMinX(double value);

	/**
	 * Returns the value of the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Y</em>' attribute.
	 * @see #setMaxY(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_MaxY()
	 * @model unique="false"
	 * @generated
	 */
	double getMaxY();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMaxY <em>Max Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Y</em>' attribute.
	 * @see #getMaxY()
	 * @generated
	 */
	void setMaxY(double value);

	/**
	 * Returns the value of the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Y</em>' attribute.
	 * @see #setMinY(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_MinY()
	 * @model unique="false"
	 * @generated
	 */
	double getMinY();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMinY <em>Min Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Y</em>' attribute.
	 * @see #getMinY()
	 * @generated
	 */
	void setMinY(double value);

	/**
	 * Returns the value of the '<em><b>Max Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Z</em>' attribute.
	 * @see #setMaxZ(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_MaxZ()
	 * @model unique="false"
	 * @generated
	 */
	double getMaxZ();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMaxZ <em>Max Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Z</em>' attribute.
	 * @see #getMaxZ()
	 * @generated
	 */
	void setMaxZ(double value);

	/**
	 * Returns the value of the '<em><b>Min Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Z</em>' attribute.
	 * @see #setMinZ(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_MinZ()
	 * @model unique="false"
	 * @generated
	 */
	double getMinZ();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getMinZ <em>Min Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Z</em>' attribute.
	 * @see #getMinZ()
	 * @generated
	 */
	void setMinZ(double value);

	/**
	 * Returns the value of the '<em><b>Start Of Waveform Data Packet Record</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Of Waveform Data Packet Record</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Of Waveform Data Packet Record</em>' attribute.
	 * @see #setStartOfWaveformDataPacketRecord(long)
	 * @see org.eclipse.symphony.common.geometry.data3d.las.LasPackage#getLASHeader_StartOfWaveformDataPacketRecord()
	 * @model unique="false"
	 * @generated
	 */
	long getStartOfWaveformDataPacketRecord();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.las.LASHeader#getStartOfWaveformDataPacketRecord <em>Start Of Waveform Data Packet Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Of Waveform Data Packet Record</em>' attribute.
	 * @see #getStartOfWaveformDataPacketRecord()
	 * @generated
	 */
	void setStartOfWaveformDataPacketRecord(long value);

} // LASHeader
