/**
 * <copyright>
 * </copyright>
 *
 * $Id: CircularSectorFieldOfViewPresentationImpl.java,v 1.1.4.3 2015/09/22 19:39:42 rlarcheveque Exp $
 */
package ca.gc.space.mrt.sensors.fov.ui.impl;

import javax.vecmath.Point3d;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.topology.ui.MeshPresentationMode;

import ca.gc.space.mrt.sensors.fov.ui.Activator;
import ca.gc.space.mrt.sensors.fov.ui.CircularSectorFieldOfViewPresentation;
import ca.gc.space.mrt.sensors.fov.ui.FovUIPackage;
import ca.gc.space.mrt.sensors.fov.ui.preferences.MRTFOVPreferencesConstants;
import ca.gc.space.mrt.sensors.fov.ui.scene_objects.CircularSectorFieldOfViewSceneObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circular Sector Field Of View Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CircularSectorFieldOfViewPresentationImpl extends FieldOfViewPresentationImpl implements CircularSectorFieldOfViewPresentation
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected CircularSectorFieldOfViewPresentationImpl()
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
		return FovUIPackage.Literals.CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION;
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
	
	@Override
	public void setPresentationMode(MeshPresentationMode newPresentationMode) 
	{
	
		setPresentationModeGen(newPresentationMode);
		
		if(getSceneObject() instanceof CircularSectorFieldOfViewSceneObject)
		{
			CircularSectorFieldOfViewSceneObject j3dObject = (CircularSectorFieldOfViewSceneObject) getSceneObject();
			j3dObject.setPresentationMode(newPresentationMode);
		}
	}
	
	@Override
	protected void initialSceneObject() 
	{
		super.initialSceneObject();
	}
	
	@Override
	public double getZRange()
	{		
		return 0.0;
	}
	
	@Override
	protected void applyPreferences() 
	{
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		// Change visibility.
		setVisible(store.getBoolean(MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_VISIBILITY_ID));
		
		// Change color.
		RGB rgb = PreferenceConverter.getColor(store, MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_COLOR_ID);
		if(rgb != null) setColor(rgb);

		// Set Transparency
		// TODO
		
		// Change outline only 
		setShowOutlineOnly(store.getBoolean(MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_SHOW_OUTLINE_ONLY_ID));
								
		// Change projection
		setShowProjection(store.getBoolean(MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_SHOW_PROJECTION_ID));

		// Change projection color.
		RGB projectionColor = PreferenceConverter.getColor(store, MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_PROJECTION_COLOR_ID);
		if(projectionColor != null) setProjectionColor(projectionColor);
		
		// Change mode.
		setPresentationMode(MeshPresentationMode.get(store.getInt(MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_PRESENTATION_MODE_ID)));
		
		super.applyPreferences();
	}
} //CircularSectorFieldOfViewPresentationImpl
