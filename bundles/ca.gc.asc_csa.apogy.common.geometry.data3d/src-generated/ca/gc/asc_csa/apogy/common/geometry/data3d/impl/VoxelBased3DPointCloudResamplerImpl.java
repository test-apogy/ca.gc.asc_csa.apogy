package ca.gc.asc_csa.apogy.common.geometry.data3d.impl;
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

import java.util.Vector;

import javax.vecmath.Point3d;
import javax.vecmath.Point4d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Activator;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Geometry3DUtilities;
import ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.processors.impl.ProcessorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voxel Based3 DPoint Cloud Resampler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.VoxelBased3DPointCloudResamplerImpl#getResolutionX <em>Resolution X</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.VoxelBased3DPointCloudResamplerImpl#getResolutionY <em>Resolution Y</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.VoxelBased3DPointCloudResamplerImpl#getResolutionZ <em>Resolution Z</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.VoxelBased3DPointCloudResamplerImpl#getMinimumNumberOfPointPerVoxel <em>Minimum Number Of Point Per Voxel</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.VoxelBased3DPointCloudResamplerImpl#getTileResolution <em>Tile Resolution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VoxelBased3DPointCloudResamplerImpl extends ProcessorImpl<CartesianCoordinatesSet, CartesianCoordinatesSet> implements VoxelBased3DPointCloudResampler {
	/**
	 * The default value of the '{@link #getResolutionX() <em>Resolution X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionX()
	 * @generated
	 * @ordered
	 */
	protected static final double RESOLUTION_X_EDEFAULT = 0.1;

	/**
	 * The cached value of the '{@link #getResolutionX() <em>Resolution X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionX()
	 * @generated
	 * @ordered
	 */
	protected double resolutionX = RESOLUTION_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolutionY() <em>Resolution Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionY()
	 * @generated
	 * @ordered
	 */
	protected static final double RESOLUTION_Y_EDEFAULT = 0.1;

	/**
	 * The cached value of the '{@link #getResolutionY() <em>Resolution Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionY()
	 * @generated
	 * @ordered
	 */
	protected double resolutionY = RESOLUTION_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolutionZ() <em>Resolution Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionZ()
	 * @generated
	 * @ordered
	 */
	protected static final double RESOLUTION_Z_EDEFAULT = 0.05;

	/**
	 * The cached value of the '{@link #getResolutionZ() <em>Resolution Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionZ()
	 * @generated
	 * @ordered
	 */
	protected double resolutionZ = RESOLUTION_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumNumberOfPointPerVoxel() <em>Minimum Number Of Point Per Voxel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumNumberOfPointPerVoxel()
	 * @generated
	 * @ordered
	 */
	protected static final int MINIMUM_NUMBER_OF_POINT_PER_VOXEL_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMinimumNumberOfPointPerVoxel() <em>Minimum Number Of Point Per Voxel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumNumberOfPointPerVoxel()
	 * @generated
	 * @ordered
	 */
	protected int minimumNumberOfPointPerVoxel = MINIMUM_NUMBER_OF_POINT_PER_VOXEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTileResolution() <em>Tile Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileResolution()
	 * @generated
	 * @ordered
	 */
	protected static final double TILE_RESOLUTION_EDEFAULT = 5.0;

	/**
	 * The cached value of the '{@link #getTileResolution() <em>Tile Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileResolution()
	 * @generated
	 * @ordered
	 */
	protected double tileResolution = TILE_RESOLUTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoxelBased3DPointCloudResamplerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DPackage.Literals.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setInput(CartesianCoordinatesSet newInput) {
		super.setInput(newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setOutput(CartesianCoordinatesSet newOutput) {
		super.setOutput(newOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getResolutionX() {
		return resolutionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolutionX(double newResolutionX) {
		double oldResolutionX = resolutionX;
		resolutionX = newResolutionX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_X, oldResolutionX, resolutionX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getResolutionY() {
		return resolutionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolutionY(double newResolutionY) {
		double oldResolutionY = resolutionY;
		resolutionY = newResolutionY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Y, oldResolutionY, resolutionY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getResolutionZ() {
		return resolutionZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolutionZ(double newResolutionZ) {
		double oldResolutionZ = resolutionZ;
		resolutionZ = newResolutionZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Z, oldResolutionZ, resolutionZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinimumNumberOfPointPerVoxel() {
		return minimumNumberOfPointPerVoxel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumNumberOfPointPerVoxel(int newMinimumNumberOfPointPerVoxel) {
		int oldMinimumNumberOfPointPerVoxel = minimumNumberOfPointPerVoxel;
		minimumNumberOfPointPerVoxel = newMinimumNumberOfPointPerVoxel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__MINIMUM_NUMBER_OF_POINT_PER_VOXEL, oldMinimumNumberOfPointPerVoxel, minimumNumberOfPointPerVoxel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTileResolution() {
		return tileResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTileResolution(double newTileResolution) {
		double oldTileResolution = tileResolution;
		tileResolution = newTileResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__TILE_RESOLUTION, oldTileResolution, tileResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_X:
				return getResolutionX();
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Y:
				return getResolutionY();
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Z:
				return getResolutionZ();
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__MINIMUM_NUMBER_OF_POINT_PER_VOXEL:
				return getMinimumNumberOfPointPerVoxel();
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__TILE_RESOLUTION:
				return getTileResolution();
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
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_X:
				setResolutionX((Double)newValue);
				return;
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Y:
				setResolutionY((Double)newValue);
				return;
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Z:
				setResolutionZ((Double)newValue);
				return;
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__MINIMUM_NUMBER_OF_POINT_PER_VOXEL:
				setMinimumNumberOfPointPerVoxel((Integer)newValue);
				return;
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__TILE_RESOLUTION:
				setTileResolution((Double)newValue);
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
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_X:
				setResolutionX(RESOLUTION_X_EDEFAULT);
				return;
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Y:
				setResolutionY(RESOLUTION_Y_EDEFAULT);
				return;
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Z:
				setResolutionZ(RESOLUTION_Z_EDEFAULT);
				return;
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__MINIMUM_NUMBER_OF_POINT_PER_VOXEL:
				setMinimumNumberOfPointPerVoxel(MINIMUM_NUMBER_OF_POINT_PER_VOXEL_EDEFAULT);
				return;
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__TILE_RESOLUTION:
				setTileResolution(TILE_RESOLUTION_EDEFAULT);
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
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_X:
				return resolutionX != RESOLUTION_X_EDEFAULT;
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Y:
				return resolutionY != RESOLUTION_Y_EDEFAULT;
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Z:
				return resolutionZ != RESOLUTION_Z_EDEFAULT;
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__MINIMUM_NUMBER_OF_POINT_PER_VOXEL:
				return minimumNumberOfPointPerVoxel != MINIMUM_NUMBER_OF_POINT_PER_VOXEL_EDEFAULT;
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__TILE_RESOLUTION:
				return tileResolution != TILE_RESOLUTION_EDEFAULT;
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
		result.append(" (resolutionX: ");
		result.append(resolutionX);
		result.append(", resolutionY: ");
		result.append(resolutionY);
		result.append(", resolutionZ: ");
		result.append(resolutionZ);
		result.append(", minimumNumberOfPointPerVoxel: ");
		result.append(minimumNumberOfPointPerVoxel);
		result.append(", tileResolution: ");
		result.append(tileResolution);
		result.append(')');
		return result.toString();
	}

	@Override
	public CartesianCoordinatesSet process(CartesianCoordinatesSet input) throws Exception 
	{	
		setInput(input);
		
		Logger.INSTANCE.log(Activator.ID, this, "Resampling point clound containing <" + input.getPoints().size() + "> points...", EventSeverity.INFO);
		
		CartesianCoordinatesSet out = resample(getResolutionX(), getResolutionY(), getResolutionZ(), getMinimumNumberOfPointPerVoxel(), getTileResolution(), getInput());
		
		Logger.INSTANCE.log(Activator.ID, this, "Resampling completed. Resulting point clound contains <" + out.getPoints().size() + "> points.", EventSeverity.INFO);
		
		setOutput(out);
		
		return getOutput();				
	}
	
	private double [] getPointCloudsBounds(CartesianCoordinatesSet pointCloud)
	{
		double bounds[]={0.0,0.0,0.0,0.0,0.0,0.0};
		
		CartesianPositionCoordinates minX = Geometry3DUtilities.getMinimumPosition(CartesianAxis.X, pointCloud.getPoints());
		CartesianPositionCoordinates minY = Geometry3DUtilities.getMinimumPosition(CartesianAxis.Y, pointCloud.getPoints());		
		CartesianPositionCoordinates minZ = Geometry3DUtilities.getMinimumPosition(CartesianAxis.Z, pointCloud.getPoints());
		
		CartesianPositionCoordinates maxX = Geometry3DUtilities.getMaximumPosition(CartesianAxis.X, pointCloud.getPoints());			
		CartesianPositionCoordinates maxY = Geometry3DUtilities.getMaximumPosition(CartesianAxis.Y, pointCloud.getPoints());
		CartesianPositionCoordinates maxZ = Geometry3DUtilities.getMaximumPosition(CartesianAxis.Z, pointCloud.getPoints());
		
		bounds[0] = minX.getX();
		bounds[1] = maxX.getX();
		bounds[2] = minY.getY();
		bounds[3] = maxY.getY();
		bounds[4] = minZ.getZ();
		bounds[5] = maxZ.getZ();		
		
		return bounds;
	}
	
	
	private CartesianCoordinatesSet resample(double resolutionx,
			double resolutiony, double resolutionz, int minpoints,
			double coarseresolution, CartesianCoordinatesSet inputPointCloud) {

		CartesianCoordinatesSet outputPointCloud = ApogyCommonGeometryData3DFactory.eINSTANCE
				.createCartesianCoordinatesSet();

		double bounds[] = null;
		// double point[]={0.0,0.0,0.0};

		int i, j, ip, jp, kp;
		double tmp;
		int size = inputPointCloud.getPoints().size();
		bounds = getPointCloudsBounds(inputPointCloud);

		double xmin = bounds[0], xmax = bounds[1];// left to right
		double ymin = bounds[2], ymax = bounds[3];// south to north
		double zmin = bounds[4], zmax = bounds[5];// down to up

		double sidex = Math.abs(xmax - xmin);
		double sidey = Math.abs(ymax - ymin);
		double sidez = Math.abs(zmax - zmin);

		// x with j and y with i
		int imax = (int) Math.ceil(sidey / coarseresolution);
		if(imax == 0) imax = 1;
		
		int jmax = (int) Math.ceil(sidex / coarseresolution);
		if(jmax == 0) jmax = 1;
		
		int kmax = (int) Math.ceil(sidez / coarseresolution);
		if(kmax == 0) kmax = 1;

		Vector<Vector<Point3d>> coarse3Dgrid = new Vector<Vector<Point3d>>(imax	* jmax * kmax);
		
		// initialize the grid
		for (i = 0; i < imax * jmax * kmax; i++) 
		{
			coarse3Dgrid.add(new Vector<Point3d>());

		}
		double den = 1 / coarseresolution;

		// create coarse 3D grid
		for (i = 0; i < size; i++) 
		{
			Point3d p = inputPointCloud.getPoints().get(i).asPoint3d();
			tmp = (p.y - ymin) * den;
			ip = (int) (tmp);
			tmp = (p.x - xmin) * den;
			jp = (int) (tmp);
			tmp = (p.z - zmin) * den;
			kp = (int) (tmp);
			coarse3Dgrid.get(jp + ip * jmax + kp * imax * jmax).add(p);

		}
		Vector<Point3d> patch = new Vector<Point3d>();
		Vector<Point3d> outputPatch = new Vector<Point3d>();
	
		// Voxelize each sub map
		for (i = 0; i < coarse3Dgrid.size(); i++) 
		{
			patch = coarse3Dgrid.get(i);
			if (patch.size() < minpoints)continue;

			outputPatch = this.voxelize(resolutionx, resolutiony, resolutionz,minpoints, patch);

			for (j = 0; j < outputPatch.size(); j++) 
			{
				CartesianPositionCoordinates newPoint = ApogyCommonGeometryData3DFacade.INSTANCE
						.createCartesianPositionCoordinates(
								outputPatch.get(j).x, outputPatch.get(j).y,
								outputPatch.get(j).z);

				outputPointCloud.getPoints().add(newPoint);			
			}
		}
		coarse3Dgrid.clear();
		return outputPointCloud;

	}
	 
	 /**
	  * Creates a voxel map (points).
	  * @param resolutionx The size of Voxel Cube
	  * @param resolutiony The size of Voxel Cube
	  * @param resolutionz The size of Voxel Cube
	  * @param minpoints The minimum number of points in a voxel to be considered as occupied voxel.
	  * @param data  The vector of Point3d containing points to voxelize
	  * @return a Vector of Point3d - voxelized points map.
	  * 
	  * @author jbakambu /MDA
	  */	 
	 private Vector<Point3d> voxelize(double resolutionx,double resolutiony,double resolutionz, int minpoints,Vector<Point3d> data)
	 {		
		 int i,ip,jp,kp;
		 double xmin,xmax,ymin,ymax,zmin,zmax;
		 Vector<Point3d> output =new Vector<Point3d>();
		 int size = data.size(); 
		 if (size < minpoints) return output;
       
		 xmin=data.get(0).x;
		 xmax=data.get(0).x;
		 ymin=data.get(0).y;
		 ymax=data.get(0).y;
		 zmin=data.get(0).z;
		 zmax=data.get(0).z;
       
		 for (i=0;i<size; i++)
		 {
			 if (xmin > data.get(i).x) xmin = data.get(i).x;
       	   	 if (xmax < data.get(i).x) xmax = data.get(i).x;
       	     if (ymin > data.get(i).y) ymin = data.get(i).y;
       	     if (ymax < data.get(i).y) ymax = data.get(i).y;
       	     if (zmin > data.get(i).z) zmin = data.get(i).z;
       	     if (zmax < data.get(i).z) zmax = data.get(i).z;       	
		 }
       	
	 	 double sidex= Math.abs(xmax- xmin);	 	
	     double sidey= Math.abs(ymax- ymin);
	     double sidez= Math.abs(zmax- zmin);
	     
	     
	     // x with j  and y with i 
	     int imax= (int)Math.ceil(sidey/resolutiony);
	     int jmax= (int)Math.ceil(sidex/resolutionx);
	     int kmax= (int)Math.ceil(sidez/resolutionz);
	     if(imax*jmax*kmax < minpoints) return output;

	     Vector<Point4d> grid = new Vector<Point4d>(imax*jmax*kmax);
	     
	     for(i=0;i<imax*jmax*kmax;i++)
	     {
	    	 grid.add(new Point4d(0,0,0,0));
	     }
	     
	     double denx =1/resolutionx;
	     double deny =1/resolutiony;
	     double denz =1/resolutionz;
	     double x,y,z;
	     for(i=0;i<size;i++)
	     {
	    	 x= data.get(i).x;
	    	 y= data.get(i).y;
	    	 z= data.get(i).z;
	    	 ip = (int)((y - ymin)*deny);	    	
	    	 jp = (int)((x - xmin)*denx);	    	
	    	 kp = (int)((z - zmin)*denz);
	    	 
	    	 Point4d p= grid.get(jp+ip*jmax+ kp*imax*jmax);
	    	 p.x =p.x + x;
	    	 p.y =p.y + y;
	    	 p.z =p.z + z;
	    	 p.w = p.w+1;
	    	 grid.set(jp+ip*jmax+kp*imax*jmax, p);
	     }
	     	     
	     // Computes the average of each voxel 	     
	     for(i=0;i<grid.size();i++)
	     {
	    	 Point4d p= grid.get(i);
	    	 int n=(int)p.w;
	    	 if(n >= minpoints)
	    	 {
	    		 p.x =p.x/n;
	    		 p.y =p.y/n;
	    		 p.z =p.z/n;	    	 
	    		 grid.set(i, p);
	    		 
	    		 //only voxel with at least minpoints are output
	    		 output.add(new Point3d(p.x,p.y,p.z));
	    	 }	    	 	    		 
	     }	     
	     grid.clear();
	     return output;     
	 }
} //VoxelBased3DPointCloudResamplerImpl
