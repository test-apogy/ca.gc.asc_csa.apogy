/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

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
import org.eclipse.symphony.common.images.EImage;
import org.eclipse.symphony.common.images.EImagesUtilities;
import org.eclipse.symphony.common.images.Symphony__CommonImagesFactory;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.core.environment.PolygonShapeImageMapLayer;
import org.eclipse.symphony.core.environment.RectangularRegion;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage;

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
		return Symphony__CoreEnvironmentPackage.Literals.POLYGON_SHAPE_IMAGE_MAP_LAYER;
	}

	


//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated_NOT
//	 */
//	public void setShapedFilled(boolean newShapedFilled)
//	{
//		boolean previous = isShapedFilled();
//		setShapedFilledGen(newShapedFilled);
//		
//		// DEBUG
//		if(previous != newShapedFilled)
//		{
//			updateImage(new NullProgressMonitor());
//		}
//	}
	
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
			case Symphony__CoreEnvironmentPackage.POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_VERTICES:
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
		EImage eImage = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
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
		RectangularRegion rectangularRegion = Symphony__CoreEnvironmentFactory.eINSTANCE.createRectangularRegion();
		rectangularRegion.setTransformation(MathFacade.INSTANCE.createIdentityMatrix4x4());
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
			rectangularRegion.setTransformation(MathFacade.INSTANCE.createMatrix4x4(matrix));
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
