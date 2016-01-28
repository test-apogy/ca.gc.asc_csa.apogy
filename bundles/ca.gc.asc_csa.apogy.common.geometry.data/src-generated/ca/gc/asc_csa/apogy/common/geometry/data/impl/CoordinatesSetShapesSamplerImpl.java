/**
 * Canadian Space Agency 2008
 *
 * $Id: CoordinatesSetShapesSamplerImpl.java,v 1.5.4.2 2015/05/21 15:50:05 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.symphony.common.geometry.data.Coordinates;
import org.eclipse.symphony.common.geometry.data.CoordinatesSamplingShape;
import org.eclipse.symphony.common.geometry.data.CoordinatesSet;
import org.eclipse.symphony.common.geometry.data.CoordinatesSetShapesSampler;
import org.eclipse.symphony.common.geometry.data.Symphony__CommonGeometryDataPackage;
import org.eclipse.symphony.common.geometry.data.ShapeSamplingMode;
import org.eclipse.symphony.common.processors.impl.ProcessorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinates Set Shapes Sampler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data.impl.CoordinatesSetShapesSamplerImpl#getCoordinatesSamplingShapes <em>Coordinates Sampling Shapes</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data.impl.CoordinatesSetShapesSamplerImpl#getShapeSamplingMode <em>Shape Sampling Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinatesSetShapesSamplerImpl<T extends Coordinates> extends ProcessorImpl<CoordinatesSet<T>, CoordinatesSet<T>> implements CoordinatesSetShapesSampler<T>
{
	/**
	 * The cached value of the '{@link #getCoordinatesSamplingShapes() <em>Coordinates Sampling Shapes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinatesSamplingShapes()
	 * @generated
	 * @ordered
	 */
	protected EList<CoordinatesSamplingShape<T>> coordinatesSamplingShapes;

	/**
	 * The default value of the '{@link #getShapeSamplingMode() <em>Shape Sampling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeSamplingMode()
	 * @generated
	 * @ordered
	 */
	protected static final ShapeSamplingMode SHAPE_SAMPLING_MODE_EDEFAULT = ShapeSamplingMode.UNION;

	/**
	 * The cached value of the '{@link #getShapeSamplingMode() <em>Shape Sampling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeSamplingMode()
	 * @generated
	 * @ordered
	 */
	protected ShapeSamplingMode shapeSamplingMode = SHAPE_SAMPLING_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinatesSetShapesSamplerImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return Symphony__CommonGeometryDataPackage.Literals.COORDINATES_SET_SHAPES_SAMPLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setInput(CoordinatesSet<T> newInput) {
		super.setInput(newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setOutput(CoordinatesSet<T> newOutput) {
		super.setOutput(newOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoordinatesSamplingShape<T>> getCoordinatesSamplingShapes()
	{
		if (coordinatesSamplingShapes == null) {
			coordinatesSamplingShapes = new EObjectResolvingEList<CoordinatesSamplingShape<T>>(CoordinatesSamplingShape.class, this, Symphony__CommonGeometryDataPackage.COORDINATES_SET_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES);
		}
		return coordinatesSamplingShapes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeSamplingMode getShapeSamplingMode()
	{
		return shapeSamplingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeSamplingMode(ShapeSamplingMode newShapeSamplingMode)
	{
		ShapeSamplingMode oldShapeSamplingMode = shapeSamplingMode;
		shapeSamplingMode = newShapeSamplingMode == null ? SHAPE_SAMPLING_MODE_EDEFAULT : newShapeSamplingMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonGeometryDataPackage.COORDINATES_SET_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE, oldShapeSamplingMode, shapeSamplingMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case Symphony__CommonGeometryDataPackage.COORDINATES_SET_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES:
				return getCoordinatesSamplingShapes();
			case Symphony__CommonGeometryDataPackage.COORDINATES_SET_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE:
				return getShapeSamplingMode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case Symphony__CommonGeometryDataPackage.COORDINATES_SET_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES:
				getCoordinatesSamplingShapes().clear();
				getCoordinatesSamplingShapes().addAll((Collection<? extends CoordinatesSamplingShape<T>>)newValue);
				return;
			case Symphony__CommonGeometryDataPackage.COORDINATES_SET_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE:
				setShapeSamplingMode((ShapeSamplingMode)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case Symphony__CommonGeometryDataPackage.COORDINATES_SET_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES:
				getCoordinatesSamplingShapes().clear();
				return;
			case Symphony__CommonGeometryDataPackage.COORDINATES_SET_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE:
				setShapeSamplingMode(SHAPE_SAMPLING_MODE_EDEFAULT);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case Symphony__CommonGeometryDataPackage.COORDINATES_SET_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES:
				return coordinatesSamplingShapes != null && !coordinatesSamplingShapes.isEmpty();
			case Symphony__CommonGeometryDataPackage.COORDINATES_SET_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE:
				return shapeSamplingMode != SHAPE_SAMPLING_MODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (shapeSamplingMode: ");
		result.append(shapeSamplingMode);
		result.append(')');
		return result.toString();
	}

	@Override
	public CoordinatesSet<T> process(CoordinatesSet<T> input) throws Exception 
	{
		// Updates the processor input.
		setInput(input);
		
		// Creates the coordinate set that will contain the result.
		CoordinatesSet<T> sampled = createCoordinatesSet(input);		
		
		if(getProgressMonitor() != null) getProgressMonitor().beginTask("Sampling using " + getCoordinatesSamplingShapes().size() + " sampling shapes. ", input.getPoints().size());
		
		// Goes through the list of point and checks each of them.
		for(int i=0; i < input.getPoints().size(); i++)
		{
			T point = input.getPoints().get(i);						
						
			// If point is inside, add it to the CoordinatesSet
			if(isPointInside(point))
			{
				sampled.getPoints().add(copyCoordinates(point));				
				if(getProgressMonitor() != null) getProgressMonitor().worked(1);
			}
		}
	
		if(getProgressMonitor() != null) getProgressMonitor().done();
		
		// Updates the processor output.
		setOutput(sampled);
		
		return sampled;	
	}
	
	/**
	 * Must be overwritten by sub-classes to create the right kind of coordinates set
	 * produced by the process method.
	 * @return
	 */
	protected CoordinatesSet<T> createCoordinatesSet(CoordinatesSet<T> input)
	{
		return null;
	}
	
	/**
	 * Must be overwritten by sub-classes to create the right kind of coordinates that is inside the
	 * coordinates set produced by the process method.
	 * @param point
	 * @return
	 */
	protected T copyCoordinates(T point)
	{
		throw new UnsupportedOperationException();
	}
	
	
	/**
	 * Return whether or not a point is inside at least one sampling shape
	 * @param point The point.
	 * @return True if the point is inside, false otherwise.
	 */
	private boolean isPointInside(T point)
	{
		boolean inside = false;
		if(getShapeSamplingMode() == ShapeSamplingMode.UNION)
		{
			inside = false;
			int j = 0;
			
			while (j < getCoordinatesSamplingShapes().size() && !inside)
			{
				CoordinatesSamplingShape<T> samplingShape = getCoordinatesSamplingShapes().get(j);
				inside |= samplingShape.isInside(point);											
				j++;
			}							
		}
		else if(getShapeSamplingMode() == ShapeSamplingMode.INTERSECTION)
		{
			inside = true;
			int j = 0;
			
			while (j < getCoordinatesSamplingShapes().size() && inside)
			{
				CoordinatesSamplingShape<T> samplingShape = getCoordinatesSamplingShapes().get(j);
				inside &= samplingShape.isInside(point);																						
				j++;
			}	
		}
			
		return inside;
	}
} //CoordinatesSetShapesSamplerImpl
