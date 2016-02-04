package ca.gc.asc_csa.apogy.common.geometry.data3d.las.impl;
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

import java.io.ByteArrayInputStream;
import java.io.IOException;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.las.EdgeOfFlightLine;
import ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.las.LASPoint;
import ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.las.ScanDirection;
import ca.gc.asc_csa.apogy.common.lang.java.io.LittleEndianDataInputStream;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>LAS Facade</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCommonGeometryData3DLASFacadeImpl extends MinimalEObjectImpl.Container implements ApogyCommonGeometryData3DLASFacade
{
	private static ApogyCommonGeometryData3DLASFacade instance = null;
	
	public static ApogyCommonGeometryData3DLASFacade getInstance()
	{
		if (instance == null)
		{
			instance = new ApogyCommonGeometryData3DLASFacadeImpl();
		}
		
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCommonGeometryData3DLASFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DLASPackage.Literals.APOGY_COMMON_GEOMETRY_DATA3_DLAS_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws IOException
	 * 
	 * @generated_NOT
	 */
	public LASPoint createPoint(int formatID, byte[] data) throws IOException {

		if (formatID >= 4) {
			throw new IllegalArgumentException("Invalid point format");
		}

		LASPoint point = ApogyCommonGeometryData3DLASFactory.eINSTANCE.createLASPoint();

		// Every point format has at least the 0 format
		ByteArrayInputStream bai = new ByteArrayInputStream(data);		
		LittleEndianDataInputStream input = new LittleEndianDataInputStream(bai);

		// x, 4 bytes
		int x = input.readInt();
		point.setX(x);

		// y, 4 bytes
		int y = input.readInt();
		point.setY(y);

		// z, 4 bytes
		int z = input.readInt();
		point.setZ(z);

		// intensity, 2 bytes
		int intensity = input.readUnsignedShort();
		point.setIntensity(intensity);

		// next byte contains return number (3 bits), number of returns (3
		// bits), scan direction flag (1 bit), edge of flight line (1 bit).
		byte b = input.readByte();

		// Return number mask.
		byte returnNumberMask = (byte) 0xE0;
		byte returnNumber = (byte) ((b & returnNumberMask) >> 5);

		// Number of returns
		byte nReturnsMask = (byte) 0x1C;
		byte nReturns = (byte) ((b & nReturnsMask) >> 2);

		// Scan direction
		byte scanDirFlag = (byte) 0x2;
		int scanDir = (b & scanDirFlag) >> 1;

		// Edge of flight line
		byte eflMask = (byte) 0x1;
		int efl = (b & eflMask);

		point.setReturnNumber(returnNumber);
		point.setNumberOfReturns(nReturns);
		point.setScanDirection(ScanDirection.get(scanDir));
		point.setEdgeOfFlightLine(EdgeOfFlightLine.get(efl));

		// Classification, unsigned char, 1 byte
		int classification = input.readUnsignedByte();
		point.setClassification((short) classification);

		// Scan angle rank, 1 byte
		byte scanAngle = input.readByte();
		point.setScanAngleRank(scanAngle);

		// User data, unsigned char, 1 byte
		int userData = input.readUnsignedByte();
		point.setUserData((short) userData);

		// Point source id, unsigned short, 2 bytes
		int pointSourceId = input.readUnsignedShort();
		point.setPointSourceId(pointSourceId);

		// if format 1, an extra GPS time is added
		if (formatID == 1 || formatID == 3) {
			double gpsTime = input.readDouble();
			point.setGpsTime(gpsTime);
		}

		if (formatID == 2) { // if format 2, an extra red, green, blue value is
								// added.
			// red, unsigned short, 2 bytes
			int red = input.readUnsignedShort();
			point.setRed(red);

			// green, unsigned short, 2 bytes
			int green = input.readUnsignedShort();
			point.setGreen(green);

			// blue, unsigned short, 2 bytes
			int blue = input.readUnsignedShort();
			point.setBlue(blue);
		}
		
		input.close();
		
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonGeometryData3DLASPackage.APOGY_COMMON_GEOMETRY_DATA3_DLAS_FACADE___CREATE_POINT__INT_BYTE:
				try {
					return createPoint((Integer)arguments.get(0), (byte[])arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} // ApogyCommonGeometryData3DLASFacadeImpl
