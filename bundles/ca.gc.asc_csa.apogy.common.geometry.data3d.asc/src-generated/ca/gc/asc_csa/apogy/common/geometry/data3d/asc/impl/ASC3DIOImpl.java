package ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl;
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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMap;
import ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMapMesher;
import ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMapSampler;
import ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO;
import ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASCHeaderData;
import ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Activator;
import ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode;
import ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D;
import ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ApogyCommonGeometryData3DASCFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ApogyCommonGeometryData3DASCPackage;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ASC3DIO</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ASC3DIOImpl extends MinimalEObjectImpl.Container implements ASC3DIO 
{
	private final String NUMBER_OF_ROW_ID = "nrows";
	private final String NUMBER_OF_COLUMNS_ID = "ncols";
	private final String XLL_CENTER_ID = "xllcenter";
	private final String YLL_CENTER_ID = "yllcenter";	
	private final String CELL_SIZE_ID = "cellsize";
	private final String NO_DATA_VALUE_ID = "NODATA_value";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASC3DIOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DASCPackage.Literals.ASC3DIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public DigitalElevationMap loadDigitalElevationMap(String file, AltitudeMode altitudeMode) throws Exception 
	{			
		return internalLoadDigitalElevationMap(file, altitudeMode, null, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public DigitalElevationMap loadDigitalElevationMap(String file, AltitudeMode altitudeMode, double targetResolution) throws Exception 
	{
		DigitalElevationMap dem = internalLoadDigitalElevationMap(file, altitudeMode, null, null);		
		DigitalElevationMapSampler sampler = ApogyCommonGeometryData3DFactory.eINSTANCE.createDigitalElevationMapSampler();		
		sampler.setTargetResolution(targetResolution);
		return sampler.process(dem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public DigitalElevationMap loadDigitalElevationMap(String file, AltitudeMode altitudeMode, Coordinates2D southWestCorner, Coordinates2D northEastCorner) throws Exception 
	{
		return internalLoadDigitalElevationMap(file, altitudeMode, southWestCorner, northEastCorner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public DigitalElevationMap loadDigitalElevationMap(String file, AltitudeMode altitudeMode, Coordinates2D southWestCorner, Coordinates2D northEastCorner, double targetResolution) throws Exception 
	{
		DigitalElevationMap dem = internalLoadDigitalElevationMap(file, altitudeMode, southWestCorner, northEastCorner);		
		DigitalElevationMapSampler sampler = ApogyCommonGeometryData3DFactory.eINSTANCE.createDigitalElevationMapSampler();		
		sampler.setTargetResolution(targetResolution);
		return sampler.process(dem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianTriangularMesh loadTriangularMesh(String file, AltitudeMode altitudeMode) throws Exception 
	{
		return internalLoadTriangularMesh(file, altitudeMode, null, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianTriangularMesh loadTriangularMesh(String file, AltitudeMode altitudeMode, double targetResolution) throws Exception 
	{
		// First, load the DEM
		DigitalElevationMap digitalElevationMap = loadDigitalElevationMap(file, altitudeMode, targetResolution);
						
		// Then mesh the DEM.
		DigitalElevationMapMesher mesher = ApogyCommonGeometryData3DFactory.eINSTANCE.createDigitalElevationMapMesher();						
		CartesianTriangularMesh mesh = mesher.process(digitalElevationMap);					
		return mesh; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianTriangularMesh loadTriangularMesh(String file, AltitudeMode altitudeMode, Coordinates2D southWestCorner, Coordinates2D northEastCorner) throws Exception 
	{		
		return internalLoadTriangularMesh(file, altitudeMode, southWestCorner, northEastCorner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianTriangularMesh loadTriangularMesh(String file, AltitudeMode altitudeMode, Coordinates2D southWestCorner, Coordinates2D northEastCorner, double targetResolution) throws Exception 
	{
		// First, load the DEM
		DigitalElevationMap digitalElevationMap = loadDigitalElevationMap(file, altitudeMode, southWestCorner, northEastCorner, targetResolution);
								
		// Then mesh the DEM.
		DigitalElevationMapMesher mesher = ApogyCommonGeometryData3DFactory.eINSTANCE.createDigitalElevationMapMesher();						
		CartesianTriangularMesh mesh = mesher.process(digitalElevationMap);					
		return mesh; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonGeometryData3DASCPackage.ASC3DIO___LOAD_DIGITAL_ELEVATION_MAP__STRING_ALTITUDEMODE:
				try {
					return loadDigitalElevationMap((String)arguments.get(0), (AltitudeMode)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyCommonGeometryData3DASCPackage.ASC3DIO___LOAD_DIGITAL_ELEVATION_MAP__STRING_ALTITUDEMODE_DOUBLE:
				try {
					return loadDigitalElevationMap((String)arguments.get(0), (AltitudeMode)arguments.get(1), (Double)arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyCommonGeometryData3DASCPackage.ASC3DIO___LOAD_DIGITAL_ELEVATION_MAP__STRING_ALTITUDEMODE_COORDINATES2D_COORDINATES2D:
				try {
					return loadDigitalElevationMap((String)arguments.get(0), (AltitudeMode)arguments.get(1), (Coordinates2D)arguments.get(2), (Coordinates2D)arguments.get(3));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyCommonGeometryData3DASCPackage.ASC3DIO___LOAD_DIGITAL_ELEVATION_MAP__STRING_ALTITUDEMODE_COORDINATES2D_COORDINATES2D_DOUBLE:
				try {
					return loadDigitalElevationMap((String)arguments.get(0), (AltitudeMode)arguments.get(1), (Coordinates2D)arguments.get(2), (Coordinates2D)arguments.get(3), (Double)arguments.get(4));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyCommonGeometryData3DASCPackage.ASC3DIO___LOAD_TRIANGULAR_MESH__STRING_ALTITUDEMODE:
				try {
					return loadTriangularMesh((String)arguments.get(0), (AltitudeMode)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyCommonGeometryData3DASCPackage.ASC3DIO___LOAD_TRIANGULAR_MESH__STRING_ALTITUDEMODE_DOUBLE:
				try {
					return loadTriangularMesh((String)arguments.get(0), (AltitudeMode)arguments.get(1), (Double)arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyCommonGeometryData3DASCPackage.ASC3DIO___LOAD_TRIANGULAR_MESH__STRING_ALTITUDEMODE_COORDINATES2D_COORDINATES2D:
				try {
					return loadTriangularMesh((String)arguments.get(0), (AltitudeMode)arguments.get(1), (Coordinates2D)arguments.get(2), (Coordinates2D)arguments.get(3));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyCommonGeometryData3DASCPackage.ASC3DIO___LOAD_TRIANGULAR_MESH__STRING_ALTITUDEMODE_COORDINATES2D_COORDINATES2D_DOUBLE:
				try {
					return loadTriangularMesh((String)arguments.get(0), (AltitudeMode)arguments.get(1), (Coordinates2D)arguments.get(2), (Coordinates2D)arguments.get(3), (Double)arguments.get(4));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}			
		
	protected ASCHeaderData extractHeader(BufferedReader bufferedReader) throws Exception
	{
		ASCHeaderData header = ApogyCommonGeometryData3DASCFactory.eINSTANCE.createASCHeaderData();

		// Extracts the DEM size.
		String headerLine1 = bufferedReader.readLine();		
		int numberRow = Integer.parseInt(headerLine1.substring(headerLine1.indexOf(NUMBER_OF_ROW_ID) + NUMBER_OF_ROW_ID.length()).trim());
		header.setNumberOfRow(numberRow);
		
		String headerLine2 = bufferedReader.readLine();
		int numberColumns = Integer.parseInt(headerLine2.substring(headerLine2.indexOf(NUMBER_OF_COLUMNS_ID) + NUMBER_OF_COLUMNS_ID.length()).trim());
		header.setNumberOfColumns(numberColumns);
				
		// Extracts the xllCenter.
		String headerLine3 = bufferedReader.readLine();
		double xllCenter = Double.parseDouble(headerLine3.substring(headerLine3.indexOf(XLL_CENTER_ID) + XLL_CENTER_ID.length()).trim());
		header.setXllCenter(xllCenter);
		
		String headerLine4 = bufferedReader.readLine();
		double yllCenter = Double.parseDouble(headerLine4.substring(headerLine4.indexOf(YLL_CENTER_ID) + YLL_CENTER_ID.length()).trim());
		header.setYllCenter(yllCenter);
		
		// Extracts cell size.
		String headerLine5 = bufferedReader.readLine();				
		double cellSize = Double.parseDouble(headerLine5.substring(headerLine5.indexOf(CELL_SIZE_ID) + CELL_SIZE_ID.length()).trim());
		header.setCellSize(cellSize);
		
		// Extracts NO DATA value.
		String headerLine6 = bufferedReader.readLine();
		double noDataValue = Double.parseDouble(headerLine6.substring(headerLine6.indexOf(NO_DATA_VALUE_ID) + NO_DATA_VALUE_ID.length()).trim());
		header.setNoDataValue(noDataValue);
		
		return header;
	}
	
	protected DigitalElevationMap internalLoadDigitalElevationMap(String file, AltitudeMode altitudeMode, Coordinates2D southWestCorner, Coordinates2D northEastCorner) throws Exception 
	{	
		// Check that if an sub-area is defined, it is not of 0 area.
		if(southWestCorner != null && northEastCorner != null)
		{
			if(southWestCorner.getX() == northEastCorner.getX() || southWestCorner.getY() == northEastCorner.getY())
			{
				throw new IllegalArgumentException("Specified rectangle has zero area!");
			}
		}
		
		File fileHandle = new File(file);
		
		// The points streams.
		FileInputStream fileInputStream = new FileInputStream(fileHandle);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));	
		
		ASCHeaderData header = extractHeader(bufferedReader);
		
		// Reads Height map.
		double[][] heights = loadHeightMap(bufferedReader, header.getNumberOfRow(), header.getNumberOfColumns());				
		bufferedReader.close();
				
		int[] fromCorner = null;
		if(southWestCorner == null)
		{
			fromCorner = new int[]{0,0};
		}
		else
		{
			fromCorner = findIndexes(southWestCorner.getX(), southWestCorner.getY(), header.getNumberOfRow(), header.getNumberOfColumns(), header.getCellSize());
		}
		
		int[] toCorner = null;
		if(northEastCorner == null)
		{
			toCorner = new int[]{header.getNumberOfColumns() - 1, header.getNumberOfRow() - 1};
		}
		else
		{
			toCorner = findIndexes(northEastCorner.getX(), northEastCorner.getY(), header.getNumberOfRow(), header.getNumberOfColumns(), header.getCellSize());
		}
		
		int fromXindex = fromCorner[0];
		int fromYindex = fromCorner[1]; 
		int toXindex = toCorner[0]; 
		int toYindex = toCorner[1];
		
		// Extracts the sub-array from the heights map.
		double[][] subArrayHeights = extractSubArray(heights, fromXindex, fromYindex, toXindex, toYindex);
				
		// Apply the Altitude correction.
		double[][] correctedHeights = applyAltitudeMode(subArrayHeights, altitudeMode);
		
		// Converts the sub-array to A DEM.
		List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>(subArrayHeights.length * subArrayHeights[0].length);
		for(int i = 0; i < correctedHeights.length; i++)
		{
			double x = i * header.getCellSize();
			for(int j = 0; j < correctedHeights[0].length; j++)
			{				
				double y = j * header.getCellSize();
				double z = correctedHeights[i][j];
				
				CartesianPositionCoordinates position = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(x, y, z);
				points.add(position);
			}
		}
								
		DigitalElevationMap digitalElevationMap = ApogyCommonGeometryData3DFactory.eINSTANCE.createDigitalElevationMap();
		digitalElevationMap.setXDimension(correctedHeights.length);
		digitalElevationMap.setYDimension(correctedHeights[0].length);
		digitalElevationMap.getPoints().addAll(points);
				
		return digitalElevationMap;		
	}
	
	protected CartesianTriangularMesh internalLoadTriangularMesh(String file, AltitudeMode altitudeMode, Coordinates2D southWestCorner, Coordinates2D northEastCorner) throws Exception 
	{
		// First, load the DEM
		DigitalElevationMap digitalElevationMap = internalLoadDigitalElevationMap(file, altitudeMode, southWestCorner, northEastCorner);
				
		// Then mesh the DEM.
		DigitalElevationMapMesher mesher = ApogyCommonGeometryData3DFactory.eINSTANCE.createDigitalElevationMapMesher();						
		CartesianTriangularMesh mesh = mesher.process(digitalElevationMap);
				
		return mesh; 
	}
	
	protected int[] findIndexes(double x, double y, int numberRow, int numberColumns, double cellSize)
	{
		int xIndex = (int) Math.floor((x / (numberColumns * cellSize)) * numberColumns) - 1;
		int yIndex = (int) Math.floor((y / (numberRow * cellSize)) * numberRow) - 1;						
		
		// Ensure yIndex is inside the range.		
		if(xIndex < 0) xIndex = 0;
		if(xIndex > (numberColumns -1) ) xIndex = (numberColumns -1);
		
		// Ensure yIndex is inside the range.
		if(yIndex < 0) yIndex = 0;
		if(yIndex > (numberRow -1) ) yIndex = (numberRow -1);
	
		
		return new int[]{xIndex,yIndex};
	}
	
	protected double[][] loadHeightMap(BufferedReader bufferedReader, int numberRow, int numberColumns)
	{		
		double[][] heights = new double[numberColumns][numberRow];
		int xIndex = 0;
		int yIndex = numberRow - 1;
				
		try
		{
			String lineOfData = bufferedReader.readLine();
			while(lineOfData != null && yIndex < numberRow)
			{
				// Parses the line.
				String[] values = lineOfData.split(" ");
				for(String value : values)
				{								
					if(value != null && value.length() > 0)
					{
						double z = Double.parseDouble(value);					
						heights[xIndex][yIndex] = z;															
						xIndex++;
											
						if(xIndex > (numberColumns -1))
						{
							xIndex = 0;
							yIndex --;														
						}												
					}										
				}
				
				// Reads in next line.
				lineOfData = bufferedReader.readLine();			
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return heights;
	}
	
	protected double[][] extractSubArray(double[][] originalHeights, int fromX, int fromY, int toX, int toY)
	{
		int xLength = (toX - fromX) + 1;
		int yLength = (toY - fromY) + 1;
		
		double[][] subArray = new double[xLength][yLength];
		
		for(int i = 0; i < xLength; i++)
		{
			for(int j = 0; j < yLength; j++)
			{
				subArray[i][j] = originalHeights[fromX + i][fromY + j];
			}
		}
		
		return subArray;
	}
	
	protected double[][] applyAltitudeMode(double[][] originalHeights, AltitudeMode altitudeMode)
	{
		double[][] processedHeights = null;
		switch (altitudeMode.getValue()) 
		{
			case AltitudeMode.ABSOLUTE_VALUE:
				processedHeights = originalHeights;
			break;
			
			case AltitudeMode.RELATIVE_TO_AVERAGE_VALUE:
				double averageAltitude = findAverageAltitude(originalHeights);				
				processedHeights = applyAltitudeOffset(originalHeights, -averageAltitude);
				Logger.INSTANCE.log(Activator.ID, this, "Applying average altitude offset of <" + -averageAltitude + "m >.", EventSeverity.INFO);
			break;
			
			case AltitudeMode.RELATIVE_TO_SOUTH_WEST_CORNER_VALUE:
				double southWestCornerHeight = originalHeights[0][0];
				Logger.INSTANCE.log(Activator.ID, this, "Applying South-West corner relative altitude offset of <" + -southWestCornerHeight + "m >.", EventSeverity.INFO);
				processedHeights = applyAltitudeOffset(originalHeights, -southWestCornerHeight);
			break;
			
			case AltitudeMode.RELATIVE_TO_NORTH_EAST_CORNER_VALUE:
				int i = originalHeights.length -1;
				int j = originalHeights[0].length -1;
				double northEastCornerHeight = originalHeights[i][j];
				Logger.INSTANCE.log(Activator.ID, this, "Applying North-East corner relative altitude offset of <" + -northEastCornerHeight + "m >.", EventSeverity.INFO);
				processedHeights = applyAltitudeOffset(originalHeights, -northEastCornerHeight);
			break;
			
			case AltitudeMode.RELATIVE_TO_CENTER_VALUE:
				int centerCoordX = (int) Math.floor(originalHeights.length * 0.5);
				int centerCoordY = (int) Math.floor(originalHeights[0].length * 0.5);
				double centerHeight = originalHeights[centerCoordX][centerCoordY];
				Logger.INSTANCE.log(Activator.ID, this, "Applying center relative altitude offset of <" + -centerHeight + "m >.", EventSeverity.INFO);
				processedHeights = applyAltitudeOffset(originalHeights, -centerHeight);
			break;

		default:
			break;
		}
		
		return processedHeights;
	}
		
	protected double findAverageAltitude(double[][] originalHeights)
	{
		long count = 0;
		double average = 0;
		
		for (int i = 0; i < originalHeights.length; i++)
	    {
			for (int j = 0; j<originalHeights[0].length; j++)
			{
				average+= originalHeights[i][j];
				count++;
			}
	    }
		
		return (average / (double) count);				
	}

	protected double[][] applyAltitudeOffset(double[][] originalHeights, double altitudeOffset)
	{
		double[][] offsetedAltitude = new double[originalHeights.length][originalHeights[0].length];
		
		for (int i = 0; i < originalHeights.length; i++)
	    {
			for (int j = 0; j<originalHeights[0].length; j++)
			{
				offsetedAltitude[i][j] = originalHeights[i][j] + altitudeOffset;
			}
	    }
		
		return offsetedAltitude;
	}
		
} //ASC3DIOImpl
