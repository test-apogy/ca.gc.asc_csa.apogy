/**
 * Canadian Space Agency 2008
 *
 * $Id: ConicalFieldOfViewPresentationImpl.java,v 1.1.4.3 2015/09/22 19:39:42 rlarcheveque Exp $
 */
package ca.gc.space.mrt.sensors.fov.ui.impl;

import javax.vecmath.Point3d;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Tuple3d;

import ca.gc.space.mrt.sensors.fov.ConicalFieldOfView;
import ca.gc.space.mrt.sensors.fov.ui.Activator;
import ca.gc.space.mrt.sensors.fov.ui.ConicalFieldOfViewPresentation;
import ca.gc.space.mrt.sensors.fov.ui.FovUIPackage;
import ca.gc.space.mrt.sensors.fov.ui.preferences.MRTFOVPreferencesConstants;
import ca.gc.space.mrt.sensors.fov.ui.scene_objects.ConicalFieldOfViewSceneObject;
import ca.gc.space.topology.ui.MeshPresentationMode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conical Field Of View Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConicalFieldOfViewPresentationImpl extends FieldOfViewPresentationImpl implements ConicalFieldOfViewPresentation
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected ConicalFieldOfViewPresentationImpl()
	{
		super();	
		
		// Initializes values from preferences
		applyPreferences();	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return FovUIPackage.Literals.CONICAL_FIELD_OF_VIEW_PRESENTATION;
	}

	@Override
	public Tuple3d basicGetCentroid()
	{
		Point3d point3d = new Point3d();		
		if(getSceneObject() != null)
		{
			point3d = getSceneObject().getCentroid();
		}
		
		return MathFacade.INSTANCE.createTuple3d(point3d);
	}
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setPresentationMode(MeshPresentationMode newPresentationMode)
	{
		setPresentationModeGen(newPresentationMode);
		
		if(getSceneObject() instanceof ConicalFieldOfViewSceneObject)
		{
			ConicalFieldOfViewSceneObject j3dObject = (ConicalFieldOfViewSceneObject) getSceneObject();
			j3dObject.setPresentationMode(newPresentationMode);
		}
	}
	
	@Override
	protected void initialSceneObject() 
	{				
		super.initialSceneObject();		
	}
	
	@Override
	public double getXRange()
	{
		ConicalFieldOfView fov = (ConicalFieldOfView) getNode();		
		if(fov != null)
		{
			if(fov.getFieldOfViewAngle() < Math.PI)				
			{
				// Compute the lenght of the segment, c = R * sqrt{2 -2 *cos(theta)
				// @see http://en.wikipedia.org/wiki/Circular_segment				
				return fov.getRange().getMaximumDistance() * Math.sqrt(2 - 2 * Math.cos(fov.getFieldOfViewAngle()));
			}
			else
			{
				return 2 * fov.getRange().getMaximumDistance();
			}
		}
		else
		{
			return super.getXRange();
		}
	}
	
	@Override
	public double getYRange()
	{
		return getXRange();
	}
	
	@Override
	public double getZRange()
	{
		ConicalFieldOfView fov = (ConicalFieldOfView) getNode();		
		if(fov != null)
		{
			if(fov.getFieldOfViewAngle() < Math.PI)				
			{
				double zMin = fov.getRange().getMinimumDistance() * Math.cos(fov.getFieldOfViewAngle() / 2);
				double zMax = fov.getRange().getMaximumDistance();				
				return zMax - zMin;
			}
			else
			{
				return 2 * fov.getRange().getDistance();
			}
		}
		else
		{
			return super.getZRange();
		}
	}
	
	@Override
	protected void applyPreferences() 
	{
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Change visibility.
		setVisible(store.getBoolean(MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_VISIBILITY_ID));
		
		// Change color.
		RGB rgb = PreferenceConverter.getColor(store, MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_COLOR_ID);
		if(rgb != null) setColor(rgb);
		
		// Set Transparency
		// TODO
		
		// Change outline only 
		setShowOutlineOnly(store.getBoolean(MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_SHOW_OUTLINE_ONLY_ID));
						
		// Change projection
		setShowProjection(store.getBoolean(MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_SHOW_PROJECTION_ID));

		// Change projection color.
		RGB projectionColor = PreferenceConverter.getColor(store, MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_PROJECTION_COLOR_ID);
		if(projectionColor != null) setProjectionColor(projectionColor);
		
		// Change mode.
		setPresentationMode(MeshPresentationMode.get(store.getInt(MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_PRESENTATION_MODE_ID)));
		
		super.applyPreferences();
	}
} //ConicalFieldOfViewPresentationImpl
