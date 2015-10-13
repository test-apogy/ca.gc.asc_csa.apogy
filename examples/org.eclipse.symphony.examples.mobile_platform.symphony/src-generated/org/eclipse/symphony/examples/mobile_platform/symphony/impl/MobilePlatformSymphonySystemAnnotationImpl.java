/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.mobile_platform.symphony.impl;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.core.environment.ui.impl.PoseVariableAnnotationImpl;
import org.eclipse.symphony.examples.mobile_platform.MobilePlatform;
import org.eclipse.symphony.examples.mobile_platform.symphony.MobilePlatformSymphonySystemAnnotation;
import org.eclipse.symphony.examples.mobile_platform.symphony.SymphonyExampleMobilePlatformPackage;
import org.jfree.chart.annotations.AbstractXYAnnotation;
import org.jfree.chart.annotations.XYShapeAnnotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mobile Platform Symphony System Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MobilePlatformSymphonySystemAnnotationImpl extends PoseVariableAnnotationImpl
														implements MobilePlatformSymphonySystemAnnotation
{
	/**
	 * This is the stroke which should be used when
	 * rendering the mobile platform's annotation on the Map Viewer
	 */
	private static final Stroke ANNOTATION_STROKE = new BasicStroke(1.0f);
	
	/**
	 * This is the colour which should be used when
	 * rendering the mobile platform's annotation on the Map Viewer
	 */
	private static final Color ANNOTATION_COLOUR = Color.RED;
	
	/**
	 * This is the minimum error that will be used when rendering
	 * the annotation on the Map Viewer; this will ensure that the
	 * annotation is always visible. 
	 */
	private static final double MIN_ANNOTATION_ERROR = 0.5;
	
	/**
	 * This is the current shape annotation, indicating
	 * the mobile platform's position and the error
	 */
	private XYShapeAnnotation errorAnnotation = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobilePlatformSymphonySystemAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyExampleMobilePlatformPackage.Literals.MOBILE_PLATFORM_SYMPHONY_SYSTEM_ANNOTATION;
	}

	/**
	 * This is used to extract the mobile platform's position error
	 * @return The mobile platform's position error, if it was available
	 */
	private double getPositionError()
	{
		// Used to keep track of the platform's error
		double error = MIN_ANNOTATION_ERROR;

		// If the instance associated with this annotation was,
		// in fact, a mobile platform.
		if(this.getVariableInstance() instanceof MobilePlatform)
		{
			// Cast down appropriately
			MobilePlatform mobilePlatform = (MobilePlatform) getVariableInstance();
			
			// If the mobile platform's current position error estimate
			// is greater or equal to the minimum allowed annotation error.
			// Note: This is necessary to ensure that the annotation is always
			//       visible.
			if (mobilePlatform.getPositionError() >= MIN_ANNOTATION_ERROR)
			{
				// Use the platform's current position error
				error = mobilePlatform.getPositionError();
			}
		}
		
		// Return the error
		return error;
	}

	/**
	 * This is a callback method, which is called whenever the pose of the mobile
	 * platform has been updated.
	 * 
	 * @param x The new X position of the mobile platform.
	 * @param y The new Y position of the mobile platform.
	 * @param zRotation The new Z rotation angle of the mobile platform.
	 */
	@Override
	public void updatePose(double x, double y, double zRotation)
	{
		// Call the superclass's version of this method
		super.updatePose(x, y, zRotation);

		// Extract the current position error
		double error = getPositionError();
		
		// Create an circle, whose radius is the position error,
		// centered at the mobile platform's current position. 
		Ellipse2D posCircle = new Ellipse2D.Double(x - error,
										   		   y - error,
										   		   2 * error,
										   		   2 * error);
		
		// Keep track of the current annotation
		errorAnnotation = new XYShapeAnnotation(posCircle,
												ANNOTATION_STROKE,
												ANNOTATION_COLOUR);
	}

	/**
	 * This is a callback method, which is used to get the list of XY
	 * shape annotations for the mobile platform which need to be
	 * rendered on the Map Viewer. 
	 *  
	 * @return The list of annotations which should be rendered for the mobile platform
	 */
	@Override
	public List<AbstractXYAnnotation> getXYShapeAnnotation() 
	{
		// Call the superclass's version of this method
		List<AbstractXYAnnotation> list = super.getXYShapeAnnotation();

		// If the current error annotation isn't already in the list
		if(errorAnnotation != null)
		{
			// Add it to the list
			list.add(errorAnnotation);
		}

		// Return the list
		return list;
	}

} //MobilePlatformSymphonySystemAnnotationImpl
