package ca.gc.space.mrt.geometry.data3d.ui.preferences;

import org.eclipse.swt.graphics.RGB;

import ca.gc.space.topology.ui.MeshPresentationMode;

public class MRTData3DUIPreferencesConstants 
{
	// Visibility Constants.
	public static final String DEFAULT_TRIANGULAR_MESH_VISIBILITY_ID = "DEFAULT_TRIANGULAR_MESH_VISIBILITY_ID";	
	public static final Boolean DEFAULT_TRIANGULAR_MESH_VISIBILITY = new Boolean(true);
	
	public static final String DEFAULT_CARTESIAN_COORD_SET_VISIBILITY_ID = "DEFAULT_CARTESIAN_COORD_SET_VISIBILITY_ID";	
	public static final Boolean DEFAULT_CARTESIAN_COORD_SET_VISIBILITY = new Boolean(true);

	// Points size constants
	public static final String DEFAULT_TRIANGULAR_MESH_POINT_SIZE_ID = "DEFAULT_TRIANGULAR_MESH_POINT_SIZE_ID";	
	public static final Integer DEFAULT_TRIANGULAR_MESH_POINT_SIZE = new Integer(1);
	
	public static final String DEFAULT_CARTESIAN_COORD_SET_POINT_SIZE_ID  = "DEFAULT_CARTESIAN_COORD_SET_POINT_SIZE_ID";	
	public static final Integer DEFAULT_CARTESIAN_COORD_SET_POINT_SIZE = new Integer(1);
	
	// Presentation Mode Constants.
	public static final String DEFAULT_TRIANGULAR_MESH_PRESENTATION_MODE_ID = "DEFAULT_TRIANGULAR_MESH_PRESENTATION_MODE_ID";		
	public static final MeshPresentationMode DEFAULT_TRIANGULAR_MESH_PRESENTATION_MODE = MeshPresentationMode.SURFACE;
	
	// Color Constants.
	public static final String DEFAULT_TRIANGULAR_MESH_COLOR_ID = "DEFAULT_TRIANGULAR_MESH_COLOR_ID";		
	public static final RGB DEFAULT_TRIANGULAR_MESH_COLOR          = new RGB(150,75,0);

	public static final String DEFAULT_CARTESIAN_COORD_SET_COLOR_ID = "DEFAULT_CARTESIAN_COORD_SET_COLOR_ID";		
	public static final RGB DEFAULT_CARTESIAN_COORD_SET_COLOR  = new RGB(255,0,0);

	// Shading Constants.
	public static final String DEFAULT_TRIANGULAR_MESH_USE_SHADING_ID = "DEFAULT_TRIANGULAR_MESH_USE_SHADING_ID";	
	public static final Boolean DEFAULT_TRIANGULAR_MESH_USE_SHADING = new Boolean(true);
}
