package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.scene_objects;

public interface ColoredCartesianCoordinatesSetSceneObject extends CartesianCoordinatesSetSceneObject
{
	/**
	 * Specifies whether or not to overrides the vertex color with the color set by setColor(RGB rgb)
	 * @param overrideColor True overrides the vertex color, false uses the color defined in the vertices.
	 */
	public void setOverrideColor(boolean overrideColor);
}
