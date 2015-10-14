/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import java.awt.Color;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangle;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.core.environment.Activator;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshSlopeImageMapLayer;
import org.eclipse.symphony.core.environment.RectangularVolumeRegion;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;

import edu.wlu.cs.levy.CG.KDTree;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Triangular Mesh Slope Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.CartesianTriangularMeshSlopeImageMapLayerImpl#isAutoScale <em>Auto Scale</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.CartesianTriangularMeshSlopeImageMapLayerImpl#getMinimumSlope <em>Minimum Slope</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.CartesianTriangularMeshSlopeImageMapLayerImpl#getMaximumSlope <em>Maximum Slope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CartesianTriangularMeshSlopeImageMapLayerImpl extends CartesianTriangularMeshDerivedImageMapLayerImpl implements CartesianTriangularMeshSlopeImageMapLayer {
	/**
	 * The default value of the '{@link #isAutoScale() <em>Auto Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoScale()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_SCALE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isAutoScale() <em>Auto Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoScale()
	 * @generated
	 * @ordered
	 */
	protected boolean autoScale = AUTO_SCALE_EDEFAULT;
	/**
	 * The default value of the '{@link #getMinimumSlope() <em>Minimum Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSlope()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_SLOPE_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getMinimumSlope() <em>Minimum Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSlope()
	 * @generated
	 * @ordered
	 */
	protected double minimumSlope = MINIMUM_SLOPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getMaximumSlope() <em>Maximum Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSlope()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_SLOPE_EDEFAULT = 50.0;
	/**
	 * The cached value of the '{@link #getMaximumSlope() <em>Maximum Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSlope()
	 * @generated
	 * @ordered
	 */
	protected double maximumSlope = MAXIMUM_SLOPE_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianTriangularMeshSlopeImageMapLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoScale() {
		return autoScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoScale(boolean newAutoScale) {
		boolean oldAutoScale = autoScale;
		autoScale = newAutoScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__AUTO_SCALE, oldAutoScale, autoScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumSlope() {
		return minimumSlope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumSlope(double newMinimumSlope) {
		double oldMinimumSlope = minimumSlope;
		minimumSlope = newMinimumSlope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MINIMUM_SLOPE, oldMinimumSlope, minimumSlope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumSlope() {
		return maximumSlope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumSlope(double newMaximumSlope) {
		double oldMaximumSlope = maximumSlope;
		maximumSlope = newMaximumSlope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MAXIMUM_SLOPE, oldMaximumSlope, maximumSlope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__AUTO_SCALE:
				return isAutoScale();
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MINIMUM_SLOPE:
				return getMinimumSlope();
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MAXIMUM_SLOPE:
				return getMaximumSlope();
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
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__AUTO_SCALE:
				setAutoScale((Boolean)newValue);
				return;
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MINIMUM_SLOPE:
				setMinimumSlope((Double)newValue);
				return;
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MAXIMUM_SLOPE:
				setMaximumSlope((Double)newValue);
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
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__AUTO_SCALE:
				setAutoScale(AUTO_SCALE_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MINIMUM_SLOPE:
				setMinimumSlope(MINIMUM_SLOPE_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MAXIMUM_SLOPE:
				setMaximumSlope(MAXIMUM_SLOPE_EDEFAULT);
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
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__AUTO_SCALE:
				return autoScale != AUTO_SCALE_EDEFAULT;
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MINIMUM_SLOPE:
				return minimumSlope != MINIMUM_SLOPE_EDEFAULT;
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MAXIMUM_SLOPE:
				return maximumSlope != MAXIMUM_SLOPE_EDEFAULT;
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
		result.append(" (autoScale: ");
		result.append(autoScale);
		result.append(", minimumSlope: ");
		result.append(minimumSlope);
		result.append(", maximumSlope: ");
		result.append(maximumSlope);
		result.append(')');
		return result.toString();
	}

	@Override
	public void updateImage(IProgressMonitor progressMonitor) 
	{
		if(getCartesianTriangularMeshMapLayer() != null)
		{
			CartesianTriangularMesh mesh = getCartesianTriangularMeshMapLayer().getCurrentMesh();
			
			if(mesh != null)
			{				
				SubMonitor subMonitor = SubMonitor.convert(progressMonitor, 4);
				
				long startTime = System.currentTimeMillis();		
				
				// Updates the mesh volume
				RectangularVolumeRegion meshRegion = getRectangularVolumeRegion();				
			
				if(meshRegion.getXDimension() > 0 && meshRegion.getYDimension() > 0)
				{													
					// Generate the pixel locations.	
					if(progressMonitor.isCanceled()) return;
					Point3d[][] pixelsLocation = getPixelsLocation(getCartesianTriangularMeshMapLayer().getCurrentMesh(), subMonitor.newChild(1));							
					
					int numberPixelAlongX = pixelsLocation.length;
					int numberPixelAlongY = pixelsLocation[0].length;
								
					double xIncrement = meshRegion.getXDimension() / numberPixelAlongX;
					double yIncrement = meshRegion.getYDimension() / numberPixelAlongY;										
					double averagingRadius = Math.sqrt(xIncrement*xIncrement + yIncrement*yIncrement);
					
					// Create KD Tree.		
					// Bail out if cancel is requested.
					if(progressMonitor.isCanceled()) return;					
					KDTree kdTree = createTriangleKDTree(mesh, subMonitor.newChild(1));
					
					// Find intersections.
					// Bail out if cancel is requested.
					if(progressMonitor.isCanceled()) return;
					
					CartesianTriangle[][] pixelsIntersectionTriangles = getPixelsIntersectionTriangle(pixelsLocation, mesh, kdTree, averagingRadius, progressMonitor);
	
					// Finds the normals.
					// Bail out if cancel is requested.
					if(progressMonitor.isCanceled()) return;
					
					Vector3d normalsArray[][] = getNormals(pixelsLocation, pixelsIntersectionTriangles, mesh,  kdTree, averagingRadius, progressMonitor);															
					SlopeExtremes slopeExtremes = getSlopeExtremes(pixelsIntersectionTriangles);
										
					double meshMinimumSlope = slopeExtremes.minimumSlope;
					double meshMaximumSlope = slopeExtremes.maximumSlope;
															
					// Generate the color
					// Bail out if cancel is requested.
					if(progressMonitor.isCanceled()) return;
					int[][] pixelColors = getPixelsColor(normalsArray, meshMinimumSlope, meshMaximumSlope);
					
					// Generate the image.				
					// Bail out if cancel is requested.
					if(progressMonitor.isCanceled()) return;
					AbstractEImage image = convertToImage(pixelColors, subMonitor.newChild(1));
					
					long endTime = System.currentTimeMillis();
					double duration =  (endTime - startTime) * 0.001;
					Logger.INSTANCE.log(Activator.ID, this, "Updated image in <" + duration + "> seconds.", EventSeverity.INFO);
					
					setImage(image);
				}
			}
		}
	}
	
	protected int[][] getPixelsColor(Vector3d normalsArray[][] , double meshMinimumSlope, double meshMaximumSlope)
	{
		int numberPixelAlongX = normalsArray.length;
		int numberPixelAlongY = normalsArray[0].length;
		
		int[][] pixelColors = new int[numberPixelAlongX][numberPixelAlongY];					
		for(int i=0; i< numberPixelAlongX; i++)
		{
			for(int j=0; j< numberPixelAlongY; j++)
			{
				Vector3d normal = normalsArray[i][j];
				if(normal != null)
				{							
					double slope =  Math.acos(Math.abs(normal.z));
					pixelColors[i][j] = getColor(meshMinimumSlope, meshMaximumSlope, slope);					
				}
			}	
		}	
		
		return pixelColors;
	}
	
	/**
	 * Return the slope extremes (minimum and maximum) for a given list of triangles.
	 * @param triangles The list of triangle.
	 * @return The SlopeExtremes. 
	 */
	protected SlopeExtremes getSlopeExtremes(CartesianTriangle[][] triangles)
	{
		double minSlope = Double.POSITIVE_INFINITY;
		double maxSlope = Double.NEGATIVE_INFINITY;
		
		for(int i = 0; i < triangles.length; i++)
		{
			for(int j = 0; j < triangles[0].length; j++)
			{
				CartesianTriangle triangle = triangles[i][j];
				if(triangle != null)
				{					
					Vector3d normal = triangle.getNormal();
					normal.normalize();										
					double slope = Math.acos(Math.abs(normal.z));										
					
					if(slope < minSlope) minSlope = slope;
					if(slope > maxSlope) maxSlope = slope;					
				}
			}
		}
		
		SlopeExtremes result = new SlopeExtremes();
		
		result.minimumSlope = minSlope;
		result.maximumSlope = maxSlope;
		
		return result;
	}
	
	/**
	 * Class representing the maximum and minimum slopes.
	 * @author pallard
	 *
	 */
	protected class SlopeExtremes
	{
		// Maximum slope, in radians.
		public double maximumSlope = 0;
		
		// Minimum slope, in radians.
		public double minimumSlope = 0;
	}
	
	/**
	 * Get the color associated with a given triangle
	 * @param pixelLocation The location of the pixel in the XY plane.
	 * @param triangle The triangle onto which the pixel location falls. Can be null.
	 * @param meshMinimumSlope The mesh minimum slope, in radians.
	 * @param meshMaximumSlope The mesh maximum slope, in radians.
	 * @return The color as an RGB integer.
	 */
	protected int getColor(double meshMinimumSlope, double meshMaximumSlope, double slope)
	{				
		double factor = 0.0;				
		if(isAutoScale())
		{
			factor = (slope - meshMinimumSlope) / (meshMaximumSlope - meshMinimumSlope);
		}
		else
		{
			factor = (slope - Math.toRadians(getMinimumSlope())) / (Math.toRadians(getMaximumSlope()) - Math.toRadians(getMinimumSlope()));
		}
		
		// Clamps factor between 0 and 1.
		if(factor < 0) factor = 0;
		if(factor > 1) factor = 1;
	  
	    float hue = (float)(0.666 - (factor * 0.666));	    
	    Color color = Color.getHSBColor(hue, 0.9f, 0.9f);    
	    return color.getRGB();
	}
	
} //CartesianTriangularMeshSlopeImageMapLayerImpl
