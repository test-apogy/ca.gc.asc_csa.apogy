/**
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
package ca.gc.asc_csa.apogy.core.environment.surface.impl;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayerPresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion;
import ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionImage;
import ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionProvider;
import ca.gc.asc_csa.apogy.core.environment.surface.RectangularVolumeRegion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogySurfaceEnvironmentFacadeImpl extends MinimalEObjectImpl.Container implements ApogySurfaceEnvironmentFacade 
{
	private static ApogySurfaceEnvironmentFacade instance = null;
	
	public static ApogySurfaceEnvironmentFacade getInstance() 
	{
		if (instance == null) 
		{
			instance = new ApogySurfaceEnvironmentFacadeImpl();
		}
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogySurfaceEnvironmentFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogySurfaceEnvironmentPackage.Literals.APOGY_SURFACE_ENVIRONMENT_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage createEImage(List<? extends RectangularRegionImage> rectangularRegionImages) 
	{
		  AbstractEImage result = null;
		  
		  if(!rectangularRegionImages.isEmpty())
		  {
			  // Gets the extend of the terrain covered.
			  Tuple3d lowerLeftCorner = ApogyCommonMathFacade.INSTANCE.createTuple3d(0, 0, 0); 
			  Tuple3d upperRightCorner = ApogyCommonMathFacade.INSTANCE.createTuple3d(0, 0, 0);	  		  		  		  
			  getRectangularRegionImageExtent(rectangularRegionImages, lowerLeftCorner, upperRightCorner);		  
			  Tuple3d upperLeftCorner = ApogyCommonMathFacade.INSTANCE.createTuple3d(lowerLeftCorner.getX(), upperRightCorner.getY(), 0);		  
			
			  // Computes the dimensions of the terrain covered by the layers.
			  double terrainWidth = upperRightCorner.getX() - lowerLeftCorner.getX();
			  double terrainHeight = upperRightCorner.getY() - lowerLeftCorner.getY();
			  
			  // Finds the highest resolution image map.
			  RectangularRegionImage bestResolutionLayer = getBestResolutionRectangularRegionImage(rectangularRegionImages);
			  double bestResolution = bestResolutionLayer.getResolution();
			  
			  // Computes the size of the image to cover the terrain at the best resolution.
			  int width = (int) Math.round((terrainWidth / bestResolution));
			  int height = (int) Math.round((terrainHeight / bestResolution));
			  	
			  // Creates a transparent image of the required size.
			  result = EImagesUtilities.INSTANCE.createTransparentImage(width, height);
			  
			  // Adds the image from each layer onto the transparent image.
			  for(RectangularRegionImage regionImage : rectangularRegionImages)
			  {
				  try
				  {
					  // Finds the terrain position of the lower left corner of the image.				
					  List<Tuple3d> corners = getAbsoluteRectangularRegionCorners(regionImage.getRegion());				  
					  Tuple3d layerUpperLeftCorner = corners.get(3);
					  
					  // Finds the image position of the top left corner.
					  int x = (int) Math.round((layerUpperLeftCorner.getX() - upperLeftCorner.getX()) / bestResolution);
					  int y = (int) Math.round((upperLeftCorner.getY() - layerUpperLeftCorner.getY()) / bestResolution);	  
					  				  				  
					  // Copies the image of the layer
					  AbstractEImage eImage = EImagesUtilities.INSTANCE.copy(regionImage.getRegionImage());
					  
					  // Scale image to match the best resolution.
					  double scaleFactor = (regionImage.getResolution() / bestResolution);
					  eImage = EImagesUtilities.INSTANCE.resize(eImage, scaleFactor);
					  
					  // Rotate image if required.
					  double zRotation = 0;
					  if(regionImage.getRegion().getTransformation() != null)
					  {
						  Tuple3d orientation = ApogyCommonMathFacade.INSTANCE.extractOrientation(regionImage.getRegion().getTransformation());					  
						  zRotation = orientation.getZ();
					  }				  				 
					  AffineTransform affineTransform = new AffineTransform();
					  
					  affineTransform.translate(x, y);
					  affineTransform.rotate(-zRotation);				 
					  		
					  Graphics2D g = (Graphics2D) result.asBufferedImage().createGraphics();
					  g.drawImage(eImage.asBufferedImage(), affineTransform, null);
					  g.dispose();				  				  			  			
				  }
				  catch(Throwable t)
				  {
					  t.printStackTrace();
				  }
			  }		 
		  }
		  else
		  {
			  result = EImagesUtilities.INSTANCE.createTransparentImage(1, 1);
		  }
		  	  		  	  
		  return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public List<Tuple3d> getAbsoluteRectangularRegionCorners(RectangularRegion rectangularRegion) 
	{
		  // Gets the corner of the ImageMapLayer in its own frame.
		  Point3d[] corners = new  Point3d[]{new Point3d(rectangularRegion.getLowerLeftCorner().asTuple3d()), 
				  							 new Point3d(rectangularRegion.getLowerRightCorner().asTuple3d()),
				  							 new Point3d(rectangularRegion.getUpperRightCorner().asTuple3d()),
				  							 new Point3d(rectangularRegion.getUpperLeftCorner().asTuple3d())};
		  
		  // Gets the transform between the ImageMapLayer and the worksite.
		  Matrix4x4 matrix4x4 = rectangularRegion.getTransformation();	  
		  Matrix4d m = null;
		  
		  if(matrix4x4 != null)
		  {
			  m = matrix4x4.asMatrix4d();
		  }
		  else
		  {
			  m = new Matrix4d();
			  m.setIdentity();
		  }
		  
		  // Applies the transform onto the corners;
		  for(int i = 0; i < corners.length; i++)
		  {
			  m.transform(corners[i]);
		  }
		  
		  // Generate the results.
		  List<Tuple3d> results = new ArrayList<Tuple3d>();	  
		  for(int i = 0; i < corners.length; i++)
		  {
			 Tuple3d p = ApogyCommonMathFacade.INSTANCE.createTuple3d(corners[i]);
			 results.add(p);
		  }
		  
		  return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public RectangularRegionImage getBestResolutionRectangularRegionImage(List<? extends RectangularRegionImage> rectangularRegionImages) 
	{
		  RectangularRegionImage best = null;
		  
		  for(RectangularRegionImage layer : rectangularRegionImages)
		  {
			  if(best == null || layer.getResolution() < best.getResolution())
			  {
				  best = layer;			  
			  }		 
		  }
		  
		  return best;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void getRectangularRegionExtent(RectangularRegionProvider rectangularRegionProvider, Tuple3d lowerLeftCorner, Tuple3d upperRightCorner) 
	{
		  // Gets the 4 corners of the ImageLayer  
		  RectangularRegion rectangularRegion = rectangularRegionProvider.getRegion();
		  List<Tuple3d> corners = getAbsoluteRectangularRegionCorners(rectangularRegion);
		  
		  // Finds the minimum and maximum x and y.
		  double xMin = Double.POSITIVE_INFINITY;
		  double xMax = Double.NEGATIVE_INFINITY;
		  double yMin = Double.POSITIVE_INFINITY;
		  double yMax = Double.NEGATIVE_INFINITY;
		  
		  for(Tuple3d p : corners)
		  {
			  if(p.getX() < xMin) xMin = p.getX();
			  if(p.getX() > xMax) xMax = p.getX();
			  if(p.getY() < yMin) yMin = p.getY();
			  if(p.getY() > yMax) yMax = p.getY();
		  }
		  
		  lowerLeftCorner.setX(xMin);
		  lowerLeftCorner.setY(yMin);
		  lowerLeftCorner.setZ(0);
		  
		  upperRightCorner.setX(xMax);
		  upperRightCorner.setY(yMax);
		  upperRightCorner.setZ(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void getRectangularRegionImageExtent(RectangularRegionImage rectangularRegionImage, Tuple3d lowerLeftCorner, Tuple3d upperRightCorner) 
	{
		  // Gets the 4 corners of the ImageLayer  
		  RectangularRegion rectangularRegion = rectangularRegionImage.getRegion();
		  List<Tuple3d> corners = getAbsoluteRectangularRegionCorners(rectangularRegion);
		  
		  // Finds the minimum and maximum x and y.
		  double xMin = Double.POSITIVE_INFINITY;
		  double xMax = Double.NEGATIVE_INFINITY;
		  double yMin = Double.POSITIVE_INFINITY;
		  double yMax = Double.NEGATIVE_INFINITY;
		  
		  for(Tuple3d p : corners)
		  {
			  if(p.getX() < xMin) xMin = p.getX();
			  if(p.getX() > xMax) xMax = p.getX();
			  if(p.getY() < yMin) yMin = p.getY();
			  if(p.getY() > yMax) yMax = p.getY();
		  }
		  
		  lowerLeftCorner.setX(xMin);
		  lowerLeftCorner.setY(yMin);
		  lowerLeftCorner.setZ(0);
		  
		  upperRightCorner.setX(xMax);
		  upperRightCorner.setY(yMax);
		  upperRightCorner.setZ(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void getRectangularRegionExtent(List<? extends RectangularRegionProvider> rectangularRegionProviders, Tuple3d lowerLeftCorner, Tuple3d upperRightCorner) 
	{
		  if(!rectangularRegionProviders.isEmpty())
		  {		  		  
			  // Finds the minimum and maximum x and y.
			  double xMin = Double.POSITIVE_INFINITY;
			  double xMax = Double.NEGATIVE_INFINITY;
			  double yMin = Double.POSITIVE_INFINITY;
			  double yMax = Double.NEGATIVE_INFINITY;
			  		  
			  for(RectangularRegionProvider provider : rectangularRegionProviders)
			  {
				  Tuple3d tmpLowerLeftCorner = ApogyCommonMathFacade.INSTANCE.createTuple3d(0, 0, 0); 
				  Tuple3d tmpUpperRightCorner = ApogyCommonMathFacade.INSTANCE.createTuple3d(0, 0, 0);
				  
				  getRectangularRegionExtent(provider, tmpLowerLeftCorner, tmpUpperRightCorner);
				  
				  if(tmpLowerLeftCorner.getX() < xMin)  xMin = tmpLowerLeftCorner.getX();
				  if(tmpLowerLeftCorner.getY() < yMin)  yMin = tmpLowerLeftCorner.getY();		  
				  if(tmpUpperRightCorner.getX() > xMax) xMax = tmpUpperRightCorner.getX();
				  if(tmpUpperRightCorner.getY() > yMax) yMax = tmpUpperRightCorner.getY();
			  }
			  
			  // Set the corner coordinates.
			  lowerLeftCorner.setX(xMin);
			  lowerLeftCorner.setY(yMin);
			  
			  upperRightCorner.setX(xMax);
			  upperRightCorner.setY(yMax);
		  }	  	
		  else
		  {
			  lowerLeftCorner.setX(0);
			  lowerLeftCorner.setY(0);
			  
			  upperRightCorner.setX(0);
			  upperRightCorner.setY(0);
		  }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void getRectangularRegionImageExtent(List<? extends RectangularRegionImage> rectangularRegionImages, Tuple3d lowerLeftCorner, Tuple3d upperRightCorner) 
	{
		  if(!rectangularRegionImages.isEmpty())
		  {		  		  
			  // Finds the minimum and maximum x and y.
			  double xMin = Double.POSITIVE_INFINITY;
			  double xMax = Double.NEGATIVE_INFINITY;
			  double yMin = Double.POSITIVE_INFINITY;
			  double yMax = Double.NEGATIVE_INFINITY;
			  		  
			  for(RectangularRegionImage layer : rectangularRegionImages)
			  {
				  Tuple3d tmpLowerLeftCorner = ApogyCommonMathFacade.INSTANCE.createTuple3d(0, 0, 0); 
				  Tuple3d tmpUpperRightCorner = ApogyCommonMathFacade.INSTANCE.createTuple3d(0, 0, 0);
				  
				  getRectangularRegionImageExtent(layer, tmpLowerLeftCorner, tmpUpperRightCorner);
				  
				  if(tmpLowerLeftCorner.getX() < xMin)  xMin = tmpLowerLeftCorner.getX();
				  if(tmpLowerLeftCorner.getY() < yMin)  yMin = tmpLowerLeftCorner.getY();		  
				  if(tmpUpperRightCorner.getX() > xMax) xMax = tmpUpperRightCorner.getX();
				  if(tmpUpperRightCorner.getY() > yMax) yMax = tmpUpperRightCorner.getY();
			  }
			  
			  // Set the corner coordinates.
			  lowerLeftCorner.setX(xMin);
			  lowerLeftCorner.setY(yMin);
			  
			  upperRightCorner.setX(xMax);
			  upperRightCorner.setY(yMax);
		  }	  	
		  else
		  {
			  lowerLeftCorner.setX(0);
			  lowerLeftCorner.setY(0);
			  
			  upperRightCorner.setX(0);
			  upperRightCorner.setY(0);
		  }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public boolean fitsInside(RectangularRegion rectangularRegionA, RectangularRegion rectangularRegionB) 
	{
		  // Create the transformation matrix that maps rectangularRegionA to rectangularRegionB.
		  Matrix4d transform = new Matrix4d();
		  transform.setIdentity();
		  if(rectangularRegionA.getTransformation() != null)
		  {		  
			  transform = new Matrix4d(rectangularRegionA.getTransformation().asMatrix4d());		  
		  }	  
		  if(rectangularRegionB.getTransformation() != null)
		  {		  
			  Matrix4d m = new Matrix4d(rectangularRegionB.getTransformation().asMatrix4d());
			  m.invert();
			  transform.mul(m);
		  }
		  	  
		  // Transform rectangularRegionA corners into  rectangularRegionB.
		  Point3d[] corners = new  Point3d[]{new Point3d(rectangularRegionA.getLowerLeftCorner().asTuple3d()), 
				  							 new Point3d(rectangularRegionA.getLowerRightCorner().asTuple3d()),
				  							 new Point3d(rectangularRegionA.getUpperRightCorner().asTuple3d()),
				  							 new Point3d(rectangularRegionA.getUpperLeftCorner().asTuple3d())};
		  for(int i = 0; i < corners.length; i++)
		  {
			  transform.transform(corners[i]);
		  }
		  
		  // Verifies that each corner of rectangularRegionA fits inside rectangularRegionB
		  boolean inside = true;
		  int i = 0;
		  while(i < corners.length && inside)
		  {
			  Point3d corner = corners[i];
			  
			  inside =  corner.getX() >= rectangularRegionB.getXMin() &&
					  	corner.getX() <= rectangularRegionB.getXMax() &&
					  	corner.getY() >= rectangularRegionB.getYMin() &&
					  	corner.getY() <= rectangularRegionB.getYMax();
			  i++;
		  }
		  
		  return inside;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public boolean intersects(RectangularRegion rectangularRegionA, RectangularRegion rectangularRegionB, Matrix4x4 transformAToB) {
		// TODO: implement this method
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void getImageMapLayerPresentationExtent(ImageMapLayerPresentation imageMapLayerPresentation, Tuple3d lowerLeftCorner, Tuple3d upperRightCorner) 
	{
		ApogySurfaceEnvironmentFacade.INSTANCE.getRectangularRegionImageExtent(imageMapLayerPresentation.getImageMapLayer(), lowerLeftCorner, upperRightCorner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void getImageMapLayerPresentationExtent(List<ImageMapLayerPresentation> imageMapLayerPresentations, Tuple3d lowerLeftCorner, Tuple3d upperRightCorner) 
	{
		  List<ImageMapLayerPresentation> visiblePresentations = getVisibleImageMapLayerPresentation(imageMapLayerPresentations);
		  ApogySurfaceEnvironmentFacade.INSTANCE.getRectangularRegionImageExtent(visiblePresentations, lowerLeftCorner, upperRightCorner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage getImageMapLayerPresentationImage(List<ImageMapLayerPresentation> imageMapLayerPresentations) 
	{
		  AbstractEImage result = null;
		  
		  // If there are layers to assemble.
		  if(!imageMapLayerPresentations.isEmpty())
		  {
			  List<ImageMapLayerPresentation> visiblePresentations = getVisibleImageMapLayerPresentation(imageMapLayerPresentations);		  		  
			  result =  ApogySurfaceEnvironmentFacade.INSTANCE.createEImage(visiblePresentations);
		  }
		  	  
		  return result;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public ImageMapLayerPresentation getBestResolutionMapLayer(List<ImageMapLayerPresentation> imageMapLayerPresentations) 
	{
		  List<ImageMapLayerPresentation> visibleLayers = getVisibleImageMapLayerPresentation(imageMapLayerPresentations);
		  
		  ImageMapLayerPresentation best = null;
		  
		  for(ImageMapLayerPresentation layer : visibleLayers)
		  {
			  if(layer != null && layer.getImageMapLayer() != null)
			  {
				  if(best == null || layer.getImageMapLayer().getResolution() < best.getImageMapLayer().getResolution())
				  {
					  best = layer;
				  }
			  }
		  }
		  
		  return best;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public List<ImageMapLayerPresentation> getVisibleImageMapLayerPresentation(List<ImageMapLayerPresentation> imageMapLayerPresentations) 
	{
		  // Creates a list of the visible layers.
		  List<ImageMapLayerPresentation> visibleLayers = new ArrayList<ImageMapLayerPresentation>();
		  for(ImageMapLayerPresentation layer : imageMapLayerPresentations)
		  {
			  if(layer.isVisible() && layer.getImageMapLayer() != null)
			  {
				  visibleLayers.add(layer);
			  }
		  }
		  
		  return visibleLayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public RectangularVolumeRegion getRectangularVolumeRegion(CartesianTriangularMesh mesh) 
	{
		RectangularVolumeRegion rectangularVolumeRegion = ApogySurfaceEnvironmentFactory.eINSTANCE.createRectangularVolumeRegion();
		
		if(mesh != null)
		{
			CartesianCoordinatesSetExtent extent = mesh.getExtent();
			rectangularVolumeRegion.setXMin(extent.getXMin());
			rectangularVolumeRegion.setXMax(extent.getXMax());
			rectangularVolumeRegion.setYMin(extent.getYMin());
			rectangularVolumeRegion.setYMax(extent.getYMax());
			rectangularVolumeRegion.setZMin(extent.getZMin());
			rectangularVolumeRegion.setZMax(extent.getZMax());
		}
		else
		{
			rectangularVolumeRegion = ApogySurfaceEnvironmentFactory.eINSTANCE.createRectangularVolumeRegion();
		}	
		
		rectangularVolumeRegion.setTransformation(ApogyCommonMathFacade.INSTANCE.createIdentityMatrix4x4());
		
		return rectangularVolumeRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogySurfaceEnvironmentPackage.APOGY_SURFACE_ENVIRONMENT_FACADE___CREATE_EIMAGE__LIST:
				return createEImage((List<? extends RectangularRegionImage>)arguments.get(0));
			case ApogySurfaceEnvironmentPackage.APOGY_SURFACE_ENVIRONMENT_FACADE___GET_ABSOLUTE_RECTANGULAR_REGION_CORNERS__RECTANGULARREGION:
				return getAbsoluteRectangularRegionCorners((RectangularRegion)arguments.get(0));
			case ApogySurfaceEnvironmentPackage.APOGY_SURFACE_ENVIRONMENT_FACADE___GET_BEST_RESOLUTION_RECTANGULAR_REGION_IMAGE__LIST:
				return getBestResolutionRectangularRegionImage((List<? extends RectangularRegionImage>)arguments.get(0));
			case ApogySurfaceEnvironmentPackage.APOGY_SURFACE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_EXTENT__RECTANGULARREGIONPROVIDER_TUPLE3D_TUPLE3D:
				getRectangularRegionExtent((RectangularRegionProvider)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
				return null;
			case ApogySurfaceEnvironmentPackage.APOGY_SURFACE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_IMAGE_EXTENT__RECTANGULARREGIONIMAGE_TUPLE3D_TUPLE3D:
				getRectangularRegionImageExtent((RectangularRegionImage)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
				return null;
			case ApogySurfaceEnvironmentPackage.APOGY_SURFACE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_EXTENT__LIST_TUPLE3D_TUPLE3D:
				getRectangularRegionExtent((List<? extends RectangularRegionProvider>)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
				return null;
			case ApogySurfaceEnvironmentPackage.APOGY_SURFACE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_IMAGE_EXTENT__LIST_TUPLE3D_TUPLE3D:
				getRectangularRegionImageExtent((List<? extends RectangularRegionImage>)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
				return null;
			case ApogySurfaceEnvironmentPackage.APOGY_SURFACE_ENVIRONMENT_FACADE___FITS_INSIDE__RECTANGULARREGION_RECTANGULARREGION:
				return fitsInside((RectangularRegion)arguments.get(0), (RectangularRegion)arguments.get(1));
			case ApogySurfaceEnvironmentPackage.APOGY_SURFACE_ENVIRONMENT_FACADE___INTERSECTS__RECTANGULARREGION_RECTANGULARREGION_MATRIX4X4:
				return intersects((RectangularRegion)arguments.get(0), (RectangularRegion)arguments.get(1), (Matrix4x4)arguments.get(2));
			case ApogySurfaceEnvironmentPackage.APOGY_SURFACE_ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_EXTENT__IMAGEMAPLAYERPRESENTATION_TUPLE3D_TUPLE3D:
				getImageMapLayerPresentationExtent((ImageMapLayerPresentation)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
				return null;
			case ApogySurfaceEnvironmentPackage.APOGY_SURFACE_ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_EXTENT__LIST_TUPLE3D_TUPLE3D:
				getImageMapLayerPresentationExtent((List<ImageMapLayerPresentation>)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
				return null;
			case ApogySurfaceEnvironmentPackage.APOGY_SURFACE_ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_IMAGE__LIST:
				return getImageMapLayerPresentationImage((List<ImageMapLayerPresentation>)arguments.get(0));
			case ApogySurfaceEnvironmentPackage.APOGY_SURFACE_ENVIRONMENT_FACADE___GET_BEST_RESOLUTION_MAP_LAYER__LIST:
				return getBestResolutionMapLayer((List<ImageMapLayerPresentation>)arguments.get(0));
			case ApogySurfaceEnvironmentPackage.APOGY_SURFACE_ENVIRONMENT_FACADE___GET_VISIBLE_IMAGE_MAP_LAYER_PRESENTATION__LIST:
				return getVisibleImageMapLayerPresentation((List<ImageMapLayerPresentation>)arguments.get(0));
			case ApogySurfaceEnvironmentPackage.APOGY_SURFACE_ENVIRONMENT_FACADE___GET_RECTANGULAR_VOLUME_REGION__CARTESIANTRIANGULARMESH:
				return getRectangularVolumeRegion((CartesianTriangularMesh)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApogySurfaceEnvironmentFacadeImpl
