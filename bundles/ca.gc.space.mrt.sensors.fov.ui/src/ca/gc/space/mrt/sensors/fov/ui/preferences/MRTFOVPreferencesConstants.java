package ca.gc.space.mrt.sensors.fov.ui.preferences;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.common.topology.ui.MeshPresentationMode;

public class MRTFOVPreferencesConstants 
{
	// Visibility Constants.
	public static final String DEFAULT_CIRCULAR_SECTOR_FOV_VISIBILITY_ID = "DEFAULT_CIRCULAR_SECTOR_FOV_VISIBILITY";
	public static final String DEFAULT_CONICAL_FOV_VISIBILITY_ID = "DEFAULT_CONICAL_FOV_VISIBILITY";	
	public static final String DEFAULT_RECTANGULAR_FRUSTUM_FOV_VISIBILITY_ID = "DEFAULT_RECTANGULAR_FRUSTUM_FOV_VISIBILITY";
	
	
	public static final Boolean DEFAULT_CIRCULAR_SECTOR_FOV_VISIBILITY = new Boolean(true);
	public static final Boolean DEFAULT_CONICAL_FOV_VISIBILITY = new Boolean(true);
	public static final Boolean DEFAULT_RECTANGULAR_FRUSTUM_FOV_VISIBILITY = new Boolean(true);
	
	// Presentation Mode Constants.
	public static final String DEFAULT_CIRCULAR_SECTOR_FOV_PRESENTATION_MODE_ID = "DEFAULT_CIRCULAR_SECTOR_FOV_PRESENTATION_MODE";
	public static final String DEFAULT_CONICAL_FOV_PRESENTATION_MODE_ID = "DEFAULT_CONICAL_FOV_PRESENTATION_MODE";	
	public static final String DEFAULT_RECTANGULAR_FRUSTUM_FOV_PRESENTATION_MODE_ID = "DEFAULT_RECTANGULAR_FRUSTUM_FOV_PRESENTATION_MODE";
	
	
	public static final MeshPresentationMode DEFAULT_CIRCULAR_SECTOR_FOV_PRESENTATION_MODE = MeshPresentationMode.WIREFRAME;
	public static final MeshPresentationMode DEFAULT_CONICAL_FOV_PRESENTATION_MODE = MeshPresentationMode.WIREFRAME;
	public static final MeshPresentationMode DEFAULT_RECTANGULAR_FRUSTUM_FOV_PRESENTATION_MODE = MeshPresentationMode.WIREFRAME;
	
	// Color Constants.
	public static final String DEFAULT_CIRCULAR_SECTOR_FOV_COLOR_ID = "DEFAULT_CIRCULAR_SECTOR_FOV_COLOR";
	public static final String DEFAULT_CONICAL_FOV_COLOR_ID = "DEFAULT_CONICAL_FOV_COLOR";
	public static final String DEFAULT_RECTANGULAR_FRUSTUM_FOV_COLOR_ID = "DEFAULT_RECTANGULAR_FRUSTUM_FOV_COLOR";
		
	public static final RGB DEFAULT_CIRCULAR_SECTOR_FOV_COLOR          = new RGB(255,0,0);
	public static final RGB DEFAULT_CONICAL_FOV_COLOR      			   = new RGB(0, 0, 255);
	public static final RGB DEFAULT_RECTANGULAR_FRUSTUM_FOV_COLOR      = new RGB(0,255,0);
	
	// Outline Constants.
	public static final String  DEFAULT_CIRCULAR_SECTOR_FOV_SHOW_OUTLINE_ONLY_ID = "DEFAULT_CIRCULAR_SECTOR_FOV_SHOW_OUTLINE_ONLY";
	public static final Boolean DEFAULT_CIRCULAR_SECTOR_FOV_SHOW_OUTLINE_ONLY = new Boolean(false);

	public static final String  DEFAULT_RECTANGULAR_FRUSTUM_FOV_SHOW_OUTLINE_ONLY_ID = "DEFAULT_RECTANGULAR_FRUSTUM_FOV_SHOW_OUTLINE_ONLY";
	public static final Boolean DEFAULT_RECTANGULAR_FRUSTUM_FOV_SHOW_OUTLINE_ONLY = new Boolean(false);
	
	public static final String DEFAULT_CONICAL_FOV_SHOW_OUTLINE_ONLY_ID = "DEFAULT_CONICAL_FOV_SHOW_OUTLINE_ONLY";
	public static final Boolean DEFAULT_CONICAL_FOV_SHOW_OUTLINE_ONLY = new Boolean(false);
	
	// Projection Enable Constants.
	public static final String  DEFAULT_CIRCULAR_SECTOR_FOV_SHOW_PROJECTION_ID = "DEFAULT_CIRCULAR_SECTOR_FOV_SHOW_PROJECTION_ID";
	public static final Boolean DEFAULT_CIRCULAR_SECTOR_FOV_SHOW_PROJECTION = new Boolean(false);

	public static final String  DEFAULT_RECTANGULAR_FRUSTUM_FOV_SHOW_PROJECTION_ID = "DEFAULT_RECTANGULAR_FRUSTUM_FOV_SHOW_PROJECTION_ID";
	public static final Boolean DEFAULT_RECTANGULAR_FRUSTUM_FOV_SHOW_PROJECTION = new Boolean(false);
	
	public static final String DEFAULT_CONICAL_FOV_SHOW_PROJECTION_ID = "DEFAULT_CONICAL_FOV_SHOW_PROJECTION_ID";
	public static final Boolean DEFAULT_CONICAL_FOV_SHOW_PROJECTION = new Boolean(false);

	// Projection Color Constants.
	public static final String DEFAULT_CIRCULAR_SECTOR_FOV_PROJECTION_COLOR_ID = "DEFAULT_CIRCULAR_SECTOR_FOV_PROJECTION_COLOR_ID";
	public static final String DEFAULT_CONICAL_FOV_PROJECTION_COLOR_ID = "DEFAULT_CONICAL_FOV_PROJECTION_COLOR_ID";
	public static final String DEFAULT_RECTANGULAR_FRUSTUM_FOV_PROJECTION_COLOR_ID = "DEFAULT_RECTANGULAR_FRUSTUM_FOV_PROJECTION_COLOR_ID";
		
	public static final RGB DEFAULT_CIRCULAR_SECTOR_FOV_PROJECTION_COLOR          = new RGB(255,0,0);
	public static final RGB DEFAULT_CONICAL_FOV_PROJECTION_COLOR      			   = new RGB(0, 0, 255);
	public static final RGB DEFAULT_RECTANGULAR_FRUSTUM_FOV_PROJECTION_COLOR      = new RGB(0,255,0);
	
}
