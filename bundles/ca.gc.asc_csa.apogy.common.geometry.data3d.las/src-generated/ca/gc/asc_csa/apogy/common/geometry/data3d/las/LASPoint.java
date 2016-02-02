package ca.gc.asc_csa.apogy.common.geometry.data3d.las;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LAS Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getX <em>X</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getY <em>Y</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getZ <em>Z</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getIntensity <em>Intensity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getReturnNumber <em>Return Number</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getNumberOfReturns <em>Number Of Returns</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getScanDirection <em>Scan Direction</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getEdgeOfFlightLine <em>Edge Of Flight Line</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getClassification <em>Classification</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getScanAngleRank <em>Scan Angle Rank</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getUserData <em>User Data</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getPointSourceId <em>Point Source Id</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getGpsTime <em>Gps Time</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getRed <em>Red</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getGreen <em>Green</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getBlue <em>Blue</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASPoint()
 * @model
 * @generated
 */
public interface LASPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(long)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASPoint_X()
	 * @model unique="false"
	 * @generated
	 */
	long getX();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(long value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(long)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASPoint_Y()
	 * @model unique="false"
	 * @generated
	 */
	long getY();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(long value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #setZ(long)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASPoint_Z()
	 * @model unique="false"
	 * @generated
	 */
	long getZ();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(long value);

	/**
	 * Returns the value of the '<em><b>Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intensity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intensity</em>' attribute.
	 * @see #setIntensity(int)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASPoint_Intensity()
	 * @model unique="false"
	 * @generated
	 */
	int getIntensity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getIntensity <em>Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intensity</em>' attribute.
	 * @see #getIntensity()
	 * @generated
	 */
	void setIntensity(int value);

	/**
	 * Returns the value of the '<em><b>Return Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Number</em>' attribute.
	 * @see #setReturnNumber(byte)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASPoint_ReturnNumber()
	 * @model unique="false"
	 * @generated
	 */
	byte getReturnNumber();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getReturnNumber <em>Return Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Number</em>' attribute.
	 * @see #getReturnNumber()
	 * @generated
	 */
	void setReturnNumber(byte value);

	/**
	 * Returns the value of the '<em><b>Number Of Returns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Returns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Returns</em>' attribute.
	 * @see #setNumberOfReturns(byte)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASPoint_NumberOfReturns()
	 * @model unique="false"
	 * @generated
	 */
	byte getNumberOfReturns();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getNumberOfReturns <em>Number Of Returns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Returns</em>' attribute.
	 * @see #getNumberOfReturns()
	 * @generated
	 */
	void setNumberOfReturns(byte value);

	/**
	 * Returns the value of the '<em><b>Scan Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.ScanDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scan Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scan Direction</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ScanDirection
	 * @see #setScanDirection(ScanDirection)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASPoint_ScanDirection()
	 * @model unique="false"
	 * @generated
	 */
	ScanDirection getScanDirection();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getScanDirection <em>Scan Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan Direction</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ScanDirection
	 * @see #getScanDirection()
	 * @generated
	 */
	void setScanDirection(ScanDirection value);

	/**
	 * Returns the value of the '<em><b>Edge Of Flight Line</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.EdgeOfFlightLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Of Flight Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Of Flight Line</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.EdgeOfFlightLine
	 * @see #setEdgeOfFlightLine(EdgeOfFlightLine)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASPoint_EdgeOfFlightLine()
	 * @model unique="false"
	 * @generated
	 */
	EdgeOfFlightLine getEdgeOfFlightLine();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getEdgeOfFlightLine <em>Edge Of Flight Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Of Flight Line</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.EdgeOfFlightLine
	 * @see #getEdgeOfFlightLine()
	 * @generated
	 */
	void setEdgeOfFlightLine(EdgeOfFlightLine value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' attribute.
	 * @see #setClassification(short)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASPoint_Classification()
	 * @model unique="false"
	 * @generated
	 */
	short getClassification();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getClassification <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' attribute.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(short value);

	/**
	 * Returns the value of the '<em><b>Scan Angle Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scan Angle Rank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scan Angle Rank</em>' attribute.
	 * @see #setScanAngleRank(byte)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASPoint_ScanAngleRank()
	 * @model unique="false"
	 * @generated
	 */
	byte getScanAngleRank();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getScanAngleRank <em>Scan Angle Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan Angle Rank</em>' attribute.
	 * @see #getScanAngleRank()
	 * @generated
	 */
	void setScanAngleRank(byte value);

	/**
	 * Returns the value of the '<em><b>User Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Data</em>' attribute.
	 * @see #setUserData(short)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASPoint_UserData()
	 * @model unique="false"
	 * @generated
	 */
	short getUserData();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getUserData <em>User Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Data</em>' attribute.
	 * @see #getUserData()
	 * @generated
	 */
	void setUserData(short value);

	/**
	 * Returns the value of the '<em><b>Point Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Source Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Source Id</em>' attribute.
	 * @see #setPointSourceId(int)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASPoint_PointSourceId()
	 * @model unique="false"
	 * @generated
	 */
	int getPointSourceId();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getPointSourceId <em>Point Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Source Id</em>' attribute.
	 * @see #getPointSourceId()
	 * @generated
	 */
	void setPointSourceId(int value);

	/**
	 * Returns the value of the '<em><b>Gps Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gps Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gps Time</em>' attribute.
	 * @see #setGpsTime(double)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASPoint_GpsTime()
	 * @model unique="false"
	 * @generated
	 */
	double getGpsTime();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getGpsTime <em>Gps Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gps Time</em>' attribute.
	 * @see #getGpsTime()
	 * @generated
	 */
	void setGpsTime(double value);

	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #setRed(int)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASPoint_Red()
	 * @model unique="false"
	 * @generated
	 */
	int getRed();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #getRed()
	 * @generated
	 */
	void setRed(int value);

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Green</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #setGreen(int)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASPoint_Green()
	 * @model unique="false"
	 * @generated
	 */
	int getGreen();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(int value);

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #setBlue(int)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getLASPoint_Blue()
	 * @model unique="false"
	 * @generated
	 */
	int getBlue();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(int value);

} // LASPoint
