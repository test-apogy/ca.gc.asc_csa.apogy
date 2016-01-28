/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import java.awt.Color;

import javax.vecmath.Point3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.core.environment.Activator;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshHeightImageMapLayer;
import org.eclipse.symphony.core.environment.RectangularVolumeRegion;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage;
import edu.wlu.cs.levy.CG.KDTree;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Triangular Mesh Height Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.CartesianTriangularMeshHeightImageMapLayerImpl#isAutoScale <em>Auto Scale</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.CartesianTriangularMeshHeightImageMapLayerImpl#getMinimumHeight <em>Minimum Height</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.CartesianTriangularMeshHeightImageMapLayerImpl#getMaximumHeight <em>Maximum Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CartesianTriangularMeshHeightImageMapLayerImpl extends CartesianTriangularMeshDerivedImageMapLayerImpl implements CartesianTriangularMeshHeightImageMapLayer 
{
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
	 * The default value of the '{@link #getMinimumHeight() <em>Minimum Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumHeight() <em>Minimum Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumHeight()
	 * @generated
	 * @ordered
	 */
	protected double minimumHeight = MINIMUM_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumHeight() <em>Maximum Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_HEIGHT_EDEFAULT = 50.0;

	/**
	 * The cached value of the '{@link #getMaximumHeight() <em>Maximum Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumHeight()
	 * @generated
	 * @ordered
	 */
	protected double maximumHeight = MAXIMUM_HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianTriangularMeshHeightImageMapLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CoreEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__AUTO_SCALE, oldAutoScale, autoScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumHeight() {
		return minimumHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumHeight(double newMinimumHeight) {
		double oldMinimumHeight = minimumHeight;
		minimumHeight = newMinimumHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MINIMUM_HEIGHT, oldMinimumHeight, minimumHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumHeight() {
		return maximumHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumHeight(double newMaximumHeight) {
		double oldMaximumHeight = maximumHeight;
		maximumHeight = newMaximumHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MAXIMUM_HEIGHT, oldMaximumHeight, maximumHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__AUTO_SCALE:
				return isAutoScale();
			case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MINIMUM_HEIGHT:
				return getMinimumHeight();
			case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MAXIMUM_HEIGHT:
				return getMaximumHeight();
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
			case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__AUTO_SCALE:
				setAutoScale((Boolean)newValue);
				return;
			case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MINIMUM_HEIGHT:
				setMinimumHeight((Double)newValue);
				return;
			case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MAXIMUM_HEIGHT:
				setMaximumHeight((Double)newValue);
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
			case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__AUTO_SCALE:
				setAutoScale(AUTO_SCALE_EDEFAULT);
				return;
			case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MINIMUM_HEIGHT:
				setMinimumHeight(MINIMUM_HEIGHT_EDEFAULT);
				return;
			case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MAXIMUM_HEIGHT:
				setMaximumHeight(MAXIMUM_HEIGHT_EDEFAULT);
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
			case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__AUTO_SCALE:
				return autoScale != AUTO_SCALE_EDEFAULT;
			case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MINIMUM_HEIGHT:
				return minimumHeight != MINIMUM_HEIGHT_EDEFAULT;
			case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MAXIMUM_HEIGHT:
				return maximumHeight != MAXIMUM_HEIGHT_EDEFAULT;
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
		result.append(", minimumHeight: ");
		result.append(minimumHeight);
		result.append(", maximumHeight: ");
		result.append(maximumHeight);
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
					// progressMonitor.subTask("Generating pixel locations");										
					Point3d[][] pixelsLocation = getPixelsLocation(getCartesianTriangularMeshMapLayer().getCurrentMesh(), subMonitor.newChild(1));	
					//progressMonitor.worked(1);							
										
					int numberPixelAlongX = pixelsLocation.length;
					int numberPixelAlongY = pixelsLocation[0].length;
								
					double xIncrement = meshRegion.getXDimension() / numberPixelAlongX;
					double yIncrement = meshRegion.getYDimension() / numberPixelAlongY;
					double averagingRadius = Math.sqrt(xIncrement*xIncrement + yIncrement*yIncrement);
					
					// Create KD Tree.
					//progressMonitor.subTask("Create KD tree");
					KDTree kdTree = createTriangleKDTree(mesh, subMonitor.newChild(1));
					//progressMonitor.worked(1);
					
					// Find intersections.
					//progressMonitor.subTask("Find pixel intersection");
					Point3d[][] pixelsIntersectionPoints = getPixelsIntersectionPoints(pixelsLocation, mesh, kdTree, averagingRadius, subMonitor.newChild(1));
					//progressMonitor.worked(1);	
					
					double minimumMeshHeight = meshRegion.getZMin();
					double maximumMeshHeight = meshRegion.getZMax();
					 									
					// Fills in the colors.
					int[][] pixelColors = new int[numberPixelAlongX][numberPixelAlongY];					
					for(int i=0; i< numberPixelAlongX; i++)
					{
						for(int j=0; j< numberPixelAlongY; j++)
						{
							Point3d point = pixelsIntersectionPoints[i][j];						
							if(point != null)
							{							
								pixelColors[i][j] = getColor(point.z, minimumMeshHeight, maximumMeshHeight);
							}
						}	
					}	
					
					// Generate the image.					
					//progressMonitor.subTask("Converting to color image.");		
					AbstractEImage image = convertToImage(pixelColors, subMonitor.newChild(1));
					//progressMonitor.worked(1);		
					
					long endTime = System.currentTimeMillis();
					double duration =  (endTime - startTime) * 0.001;
					Logger.INSTANCE.log(Activator.ID, this, "Updated image in <" + duration + "> seconds.", EventSeverity.INFO);
					
					setImage(image);
				}
			}
		}
	}
	
	private int getColor(double height, double minimumMeshHeight, double maximumMeshHeight)
	{
		
		double factor = 0.0;
		if(isAutoScale())
		{
			factor = (height - minimumMeshHeight) / (maximumMeshHeight - minimumMeshHeight);
		}
		else
		{
			factor = (height - getMinimumHeight()) / (getMaximumHeight() - getMinimumHeight());
		}
		if(factor < 0) factor = 0;
		if(factor > 1) factor = 1;
	  
	    float hue = (float)(0.666 - (factor * 0.666));	    
	    Color color = Color.getHSBColor(hue, 0.9f, 0.9f);    
	    return color.getRGB();
	}

} //CartesianTriangularMeshHeightImageMapLayerImpl
