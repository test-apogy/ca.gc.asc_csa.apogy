package org.eclipse.symphony.common.topology.ui.jme3;

import java.util.List;

import org.eclipse.symphony.common.topology.ui.SceneObject;

import com.jme3.app.Application;
import com.jme3.bounding.BoundingVolume;
import com.jme3.scene.Geometry;

public interface JME3SceneObject extends SceneObject 
{
	public Application getApplication();
	
	/**
	 * Returns the root node that must be added to the scene graph.
	 * 
	 * @return The root Node..
	 */
	public com.jme3.scene.Node getRoot();

	/**
	 * Returns the node to which children of this JME3SceneObject must be
	 * attached to.
	 * 
	 * @return The Node use to attach child objects.
	 */
	public com.jme3.scene.Node getAttachmentNode();

	/**
	 * Return the geometries associated with this JME3SceneObject.
	 * @return The list containing the geometries. Never null, but can contain null objects.
	 */
	public List<Geometry> getGeometries();

	/**
	 * Returns the bounding volume of the SceneObject.
	 * @return The Bounding volume. Never null.
	 */
	public BoundingVolume getBounds();
	
	/**
	 * Method called by the viewer when the Scene Object is not longer needed.
	 */
	public void dispose();
}
