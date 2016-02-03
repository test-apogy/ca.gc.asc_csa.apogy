package ca.gc.asc_csa.apogy.common.topology.ui.jme3;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.util.List;

import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;

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
