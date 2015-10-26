/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.images.EImage;
import org.eclipse.symphony.common.images.EImagesUtilities;
import org.eclipse.symphony.common.images.Symphony__CommonImagesFactory;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.core.environment.RectangleShapeImageLayer;
import org.eclipse.symphony.core.environment.RectangularRegion;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentFactory;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangle Shape Image Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.RectangleShapeImageLayerImpl#getRectangleWidth <em>Rectangle Width</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.RectangleShapeImageLayerImpl#getRectangleHeight <em>Rectangle Height</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.RectangleShapeImageLayerImpl#isShowCenterLines <em>Show Center Lines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectangleShapeImageLayerImpl extends AbstractShapeImageLayerImpl implements RectangleShapeImageLayer {
	/**
	 * The default value of the '{@link #getRectangleWidth() <em>Rectangle Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectangleWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double RECTANGLE_WIDTH_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getRectangleWidth() <em>Rectangle Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectangleWidth()
	 * @generated
	 * @ordered
	 */
	protected double rectangleWidth = RECTANGLE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRectangleHeight() <em>Rectangle Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectangleHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double RECTANGLE_HEIGHT_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getRectangleHeight() <em>Rectangle Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectangleHeight()
	 * @generated
	 * @ordered
	 */
	protected double rectangleHeight = RECTANGLE_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowCenterLines() <em>Show Center Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowCenterLines()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_CENTER_LINES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowCenterLines() <em>Show Center Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowCenterLines()
	 * @generated
	 * @ordered
	 */
	protected boolean showCenterLines = SHOW_CENTER_LINES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectangleShapeImageLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEnvironmentPackage.Literals.RECTANGLE_SHAPE_IMAGE_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRectangleWidth() {
		return rectangleWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRectangleWidth(double newRectangleWidth) {
		double oldRectangleWidth = rectangleWidth;
		rectangleWidth = newRectangleWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_WIDTH, oldRectangleWidth, rectangleWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRectangleHeight() {
		return rectangleHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRectangleHeight(double newRectangleHeight) {
		double oldRectangleHeight = rectangleHeight;
		rectangleHeight = newRectangleHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_HEIGHT, oldRectangleHeight, rectangleHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowCenterLines() {
		return showCenterLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowCenterLines(boolean newShowCenterLines) {
		boolean oldShowCenterLines = showCenterLines;
		showCenterLines = newShowCenterLines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.RECTANGLE_SHAPE_IMAGE_LAYER__SHOW_CENTER_LINES, oldShowCenterLines, showCenterLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyEnvironmentPackage.RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_WIDTH:
				return getRectangleWidth();
			case SymphonyEnvironmentPackage.RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_HEIGHT:
				return getRectangleHeight();
			case SymphonyEnvironmentPackage.RECTANGLE_SHAPE_IMAGE_LAYER__SHOW_CENTER_LINES:
				return isShowCenterLines();
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
			case SymphonyEnvironmentPackage.RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_WIDTH:
				setRectangleWidth((Double)newValue);
				return;
			case SymphonyEnvironmentPackage.RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_HEIGHT:
				setRectangleHeight((Double)newValue);
				return;
			case SymphonyEnvironmentPackage.RECTANGLE_SHAPE_IMAGE_LAYER__SHOW_CENTER_LINES:
				setShowCenterLines((Boolean)newValue);
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
			case SymphonyEnvironmentPackage.RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_WIDTH:
				setRectangleWidth(RECTANGLE_WIDTH_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_HEIGHT:
				setRectangleHeight(RECTANGLE_HEIGHT_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.RECTANGLE_SHAPE_IMAGE_LAYER__SHOW_CENTER_LINES:
				setShowCenterLines(SHOW_CENTER_LINES_EDEFAULT);
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
			case SymphonyEnvironmentPackage.RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_WIDTH:
				return rectangleWidth != RECTANGLE_WIDTH_EDEFAULT;
			case SymphonyEnvironmentPackage.RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_HEIGHT:
				return rectangleHeight != RECTANGLE_HEIGHT_EDEFAULT;
			case SymphonyEnvironmentPackage.RECTANGLE_SHAPE_IMAGE_LAYER__SHOW_CENTER_LINES:
				return showCenterLines != SHOW_CENTER_LINES_EDEFAULT;
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
		result.append(" (rectangleWidth: ");
		result.append(rectangleWidth);
		result.append(", rectangleHeight: ");
		result.append(rectangleHeight);
		result.append(", showCenterLines: ");
		result.append(showCenterLines);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public void updateImage(IProgressMonitor progressMonitor) 
	{
		// First, find the extend of the area covered by the vertices.
		RectangularRegion rectangularRegion = getImageMapLayerRegion();
		
		// Updates image parameters.
		setWidth(rectangularRegion.getXDimension());
		setHeight(rectangularRegion.getYDimension());
		
		// Generate a transparent image of the required size.
		int width = (int) Math.round(rectangularRegion.getXDimension() / getRequiredResolution());
		int height = (int) Math.round(rectangularRegion.getYDimension() / getRequiredResolution());
		BufferedImage bufferedImage = EImagesUtilities.INSTANCE.createTransparentImage(width, height).asBufferedImage();
		
		// Draw the polygon inside the image.
		Graphics2D g2d = bufferedImage.createGraphics();		
		g2d.setColor(getDrawingColor());	
		
		// Create the polygon.
		Rectangle2D.Double ellipse = new Rectangle2D.Double(0,0, width-1, height-1);
			
		g2d.draw(ellipse);
		
		if(isShowCenterLines())
		{
			if(Math.IEEEremainder(width, 2.0) == 0)
			{
				int x1 = (int) Math.floor(width * 0.5f);
				int x2 = x1 - 1;
				
				g2d.drawLine(x1, 0, x1, height);
				g2d.drawLine(x2, 0, x2, height);
			}
			else
			{
				int xCenter = (int) Math.floor(width * 0.5f);
				g2d.drawLine(xCenter, 0, xCenter, height);
			}
			
			if(Math.IEEEremainder(height, 2.0) == 0)
			{
				int y1 = (int) Math.round(height * 0.5f);
				int y2 = y1 - 1;
				
				g2d.drawLine(0, y1, width, y1);
				g2d.drawLine(0, y2, width, y2);
			}
			else
			{
				int yCenter = (int) Math.floor(height * 0.5f);
				g2d.drawLine(0, yCenter, width, yCenter);
			}			
		}
		
		// Fills the polygon if required.
		if(isShapedFilled())
		{
			g2d.fill(ellipse);
		}
		
		g2d.dispose();
		
		// Updates the image
		EImage eImage = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
		eImage.setImageContent(bufferedImage);;
		setImage(eImage);
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
	
	@Override
	public RectangularRegion getImageMapLayerRegion() 
	{
		RectangularRegion rectangularRegion = SymphonyEnvironmentFactory.eINSTANCE.createRectangularRegion();
 		rectangularRegion.setTransformation(MathFacade.INSTANCE.createIdentityMatrix4x4());
 		
 		if(getMap() != null && getMap().getTransformation() != null)
 		{ 		 			 			
 			Matrix4d m = getMap().getTransformation().asMatrix4d();
 		
 			// Adds an offset of -rectangleWidth and -rectangleHeight to center the ellipse.
 			Matrix4d translation = new Matrix4d();
 			translation.setIdentity();
 			translation.set(new Vector3d(-getRectangleWidth()/2.0, -getRectangleHeight()/2.0 ,0));
 			
 			m.mul(translation);
 			
 			Matrix4x4 transform = MathFacade.INSTANCE.createMatrix4x4(m);
 			rectangularRegion.setTransformation(transform); 			
 		} 		
 		
 		// Fills in the extent.
 		rectangularRegion.setXMin(-getRectangleWidth() / 2.0);
 		rectangularRegion.setXMax(getRectangleWidth() / 2.0);
 		rectangularRegion.setYMin(-getRectangleHeight() / 2.0);
 		rectangularRegion.setYMax(getRectangleHeight() / 2.0);
 		 		
 		return rectangularRegion;
	}

} //RectangleShapeImageLayerImpl
