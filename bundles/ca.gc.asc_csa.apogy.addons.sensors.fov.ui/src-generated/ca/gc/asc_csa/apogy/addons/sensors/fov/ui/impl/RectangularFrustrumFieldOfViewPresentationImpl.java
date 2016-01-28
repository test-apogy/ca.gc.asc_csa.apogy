/**
 * Canadian Space Agency 2008
 *
 * $Id: RectangularFrustrumFieldOfViewPresentationImpl.java,v 1.1.4.2 2015/05/21 15:50:53 pallard Exp $
 */
package ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl;

import javax.vecmath.Point3d;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.Activator;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ApogyAddonsSensorsFOVUIPackage;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.RectangularFrustrumFieldOfViewPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.preferences.MRTFOVPreferencesConstants;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.scene_objects.RectangularFrustrumFieldOfViewSceneObject;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Rectangular Frustrum Field Of View Presentation</b></em>'. <!--
 * end-user-doc -->
 *
 * @generated
 */

public class RectangularFrustrumFieldOfViewPresentationImpl extends
		FieldOfViewPresentationImpl implements
		RectangularFrustrumFieldOfViewPresentation {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	protected RectangularFrustrumFieldOfViewPresentationImpl() {
		super();
		
		// Initializes values from preferences
		applyPreferences();	
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsFOVUIPackage.Literals.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION;
	}

	@Override
	public Tuple3d basicGetCentroid() {
		Point3d point3d = new Point3d();
		if (getSceneObject() != null) {
			point3d = getSceneObject().getCentroid();
		}

		return ApogyCommonMathFacade.INSTANCE.createTuple3d(point3d);
	}

	@Override
	public void setPresentationMode(MeshPresentationMode newPresentationMode) 
	{
		setPresentationModeGen(newPresentationMode);
		
		if(getSceneObject() instanceof RectangularFrustrumFieldOfViewSceneObject)
		{
			RectangularFrustrumFieldOfViewSceneObject j3dObject = (RectangularFrustrumFieldOfViewSceneObject) getSceneObject();
			j3dObject.setPresentationMode(newPresentationMode);
		}
	}
	
	@Override
	protected void initialSceneObject() 
	{		
		super.initialSceneObject();
	}

	@Override
	public double getYRange() {
		RectangularFrustrumFieldOfView fov = (RectangularFrustrumFieldOfView) getNode();
		if (fov != null) {
			if (fov.getHorizontalFieldOfViewAngle() < Math.PI) {
				// Compute the length of the segment,c = R * sqrt{2 -2
				// *cos(theta)
				// @see http://en.wikipedia.org/wiki/Circular_segment
				return fov.getRange().getMaximumDistance()
						* Math.sqrt(2 - 2 * Math.cos(fov
								.getHorizontalFieldOfViewAngle()));
			} else {
				return 2 * fov.getRange().getMaximumDistance();
			}
		} else {
			return super.getYRange();
		}
	}

	@Override
	public double getXRange() {
		RectangularFrustrumFieldOfView fov = (RectangularFrustrumFieldOfView) getNode();
		if (fov != null) {
			if (fov.getVerticalFieldOfViewAngle() < Math.PI) {
				// Compute the length of the segment, c = R * sqrt{2 -2 *
				// cos(theta)
				// @see http://en.wikipedia.org/wiki/Circular_segment

				return fov.getRange().getMaximumDistance()
						* Math.sqrt(2 - 2 * Math.cos(fov
								.getVerticalFieldOfViewAngle()));
			} else {
				return 2 * fov.getRange().getMaximumDistance();
			}
		} else {
			return super.getXRange();
		}
	}

	@Override
	public double getZRange() {
		RectangularFrustrumFieldOfView fov = (RectangularFrustrumFieldOfView) getNode();
		if (fov != null) {
			if (fov.getHorizontalFieldOfViewAngle() < Math.PI) {
				double zMin = fov.getRange().getMinimumDistance()
						* Math.cos(fov.getVerticalFieldOfViewAngle() / 2)
						* Math.cos(fov.getHorizontalFieldOfViewAngle() / 2);
				double zMax = fov.getRange().getMaximumDistance();
				return zMax - zMin;
			} else {
				return 2 * fov.getRange().getDistance();
			}
		} else {
			return super.getZRange();
		}
	}

	// VIEWPOINT
//	@Override
//	public double getHorizontalFOV() {
//		RectangularFrustrumFieldOfView fov = (RectangularFrustrumFieldOfView) getNode();
//		return fov.getHorizontalFieldOfViewAngle();
//	}
//
//	@Override
//	public double getVerticalFOV() {
//		RectangularFrustrumFieldOfView fov = (RectangularFrustrumFieldOfView) getNode();
//		return fov.getVerticalFieldOfViewAngle();
//	}
//
//	@Override
//	public double getMaximumDistance() {
//		RectangularFrustrumFieldOfView fov = (RectangularFrustrumFieldOfView) getNode();
//		if (fov.getRange() != null) {
//			return fov.getRange().getMaximumDistance();
//		} else {
//			return 0.0;
//		}
//	}
//
//	@Override
//	public double getMinimumDistance() {
//		RectangularFrustrumFieldOfView fov = (RectangularFrustrumFieldOfView) getNode();
//		if (fov.getRange() != null) {
//			return fov.getRange().getMinimumDistance();
//		} else {
//			return 0.0;
//		}
//	}
	
	@Override
	protected void applyPreferences() 
	{
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Change visibility.
		setVisible(store.getBoolean(MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_VISIBILITY_ID));
		
		// Change color.
		RGB rgb = PreferenceConverter.getColor(store, MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_COLOR_ID);
		if(rgb != null) setColor(rgb);
		
		// Set Transparency
		// TODO
		
		// Change outline only 
		setShowOutlineOnly(store.getBoolean(MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_SHOW_OUTLINE_ONLY_ID));
		
		// Change projection
		setShowProjection(store.getBoolean(MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_SHOW_PROJECTION_ID));
		
		// Change projection color.
		RGB projectionColor = PreferenceConverter.getColor(store, MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_PROJECTION_COLOR_ID);
		if(projectionColor != null) setProjectionColor(projectionColor);
				
		// Change mode.
		setPresentationMode(MeshPresentationMode.get(store.getInt(MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_PRESENTATION_MODE_ID)));
		
		super.applyPreferences();
	}
} // RectangularFrustrumFieldOfViewPresentationImpl
