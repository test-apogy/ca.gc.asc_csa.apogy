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

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesFactory;
import ca.gc.asc_csa.apogy.common.images.EImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.PolygonShapeImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygon Shape Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class PolygonShapeImageMapLayerImpl extends AbstractShapeImageLayerImpl implements PolygonShapeImageMapLayer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolygonShapeImageMapLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogySurfaceEnvironmentPackage.Literals.POLYGON_SHAPE_IMAGE_MAP_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Tuple3d> getVertices() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogySurfaceEnvironmentPackage.POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_VERTICES:
				return getVertices();
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public void updateImage(IProgressMonitor progressMonitor) 
	{
		// First, get the list of vertices.
		List<Tuple3d> vertices = new ArrayList<Tuple3d>();
		vertices.addAll(getVertices());
		
		// Second, find the extend of the area covered by the vertices.
		RectangularRegion rectangularRegion = getImageMapLayerRegion();
		
		// Updates image parameters.
		setWidth(rectangularRegion.getXDimension());
		setHeight(rectangularRegion.getYDimension());
		
		// Generate a transparent image of the required size.
		int width = (int) Math.round(rectangularRegion.getXDimension() / getRequiredResolution());
		int height = (int) Math.round(rectangularRegion.getYDimension() / getRequiredResolution());		
				
		BufferedImage bufferedImage = EImagesUtilities.INSTANCE.createTransparentImage(width, height).asBufferedImage();
		
		// Converts the vertices into the image coordinate frame.
		List<java.awt.Point> points = convertToImageFrame(vertices, rectangularRegion, width, height);
		
		// Create the polygon.
		Polygon polygon = createPolygon(points);
		
		// Draw the polygon inside the image.
		Graphics2D g2d = bufferedImage.createGraphics();		
		g2d.setColor(getDrawingColor());		
		g2d.draw(polygon);
		
		// Fills the polygon if required.
		if(isShapedFilled())
		{
			g2d.fill(polygon);
		}
		
		g2d.dispose();
		
		// Updates the image
		EImage eImage = ApogyCommonImagesFactory.eINSTANCE.createEImage();
		eImage.setImageContent(bufferedImage);;
		setImage(eImage);
	}

	@Override
	public RectangularRegion getImageMapLayerRegion() 
	{
		return getRectangularRegion(getVertices());
	}
	
	protected Color getDrawingColor()
	{
		if(getColor() != null)
		{
			if(getColor().x != -1 && getColor().y != -1 && getColor().z != -1)
			{
				return new Color(getColor().x,getColor().y , getColor().z);
			}
			else
			{
				return null;
			}
		}
		else
		{
			return null;
		}
	}
	
	/*
	 * Returns the RectangularRegion spanned by a specified list of vertices.
	 * @param vertices The list of vertices.
	 * @return The RectangularRegion spanned by the vertices.
	 */
	protected RectangularRegion getRectangularRegion(List<Tuple3d> vertices)
	{
		RectangularRegion rectangularRegion = ApogySurfaceEnvironmentFactory.eINSTANCE.createRectangularRegion();
		rectangularRegion.setTransformation(ApogyCommonMathFacade.INSTANCE.createIdentityMatrix4x4());
		if(vertices.size() > 0)
		{			
			double xMin = Double.POSITIVE_INFINITY;
			double xMax = Double.NEGATIVE_INFINITY;
			double yMin = Double.POSITIVE_INFINITY;
			double yMax = Double.NEGATIVE_INFINITY;
			
			for(Tuple3d vertex : vertices)
			{
				if(vertex.getX() < xMin) xMin = vertex.getX();
				if(vertex.getX() > xMax) xMax = vertex.getX();
				
				if(vertex.getY() < yMin) yMin = vertex.getY();
				if(vertex.getY() > yMax) yMax = vertex.getY();
			}
			
			rectangularRegion.setXMin(xMin);
			rectangularRegion.setXMax(xMax);		
			rectangularRegion.setYMin(yMin);
			rectangularRegion.setYMax(yMax);	
	
			// Sets the transform matrix to the lower left corner coordinates.
			Matrix4d matrix = new Matrix4d();	
			matrix.setIdentity();
			matrix.setTranslation(new Vector3d(xMin, yMin, 0));
			rectangularRegion.setTransformation(ApogyCommonMathFacade.INSTANCE.createMatrix4x4(matrix));
		}

		return rectangularRegion;
	}
	
	protected List<java.awt.Point> convertToImageFrame(List<Tuple3d> vertices, RectangularRegion rectangularRegion, int imageWidth, int imageHeight)
	{
		List<java.awt.Point> points = new ArrayList<java.awt.Point>();
		
		for(Tuple3d vertex : vertices)
		{
			int x = (int) Math.round(((vertex.getX() - rectangularRegion.getXMin()) / rectangularRegion.getXDimension()) * imageWidth); 
			if(x >= imageWidth) x = imageWidth - 1;
			if(x < 0) x = 0;
			
			int y = (int) Math.round(((rectangularRegion.getYMax() - vertex.getY()) / rectangularRegion.getYDimension()) * imageHeight);
			if(y >= imageHeight) y = imageHeight -1;
			if(y < 0) y = 0;
			
			java.awt.Point point = new Point(x, y);
			points.add(point);
		}
		
		return points;
	}
	
	protected Polygon createPolygon(List<java.awt.Point> points)
	{
		Polygon polygon = new Polygon();
		
		if(points.size() > 0)
		{
			for(java.awt.Point point : points)
			{
				polygon.addPoint(point.x, point.y);
			}
			
//			// Adds the first point again
//			java.awt.Point first = points.get(0);
//			polygon.addPoint(first.x, first.y);
		}
		
		return polygon;
	}
} //PolygonShapeImageMapLayerImpl
