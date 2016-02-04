package ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects;
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

import javax.vecmath.Point3d;

import ca.gc.asc_csa.apogy.common.topology.ReferencedGroupNode;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;

public class ReferencedGroupNodeJM3SceneObject extends DefaultJME3SceneObject<ReferencedGroupNode> {

	private Point3d centroid;

	public ReferencedGroupNodeJM3SceneObject(ReferencedGroupNode topologyNode, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(topologyNode, jme3RenderEngineDelegate);

		centroid = new Point3d(0, 0, 0);

	}

	@Override
	public Point3d getCentroid() {
		return centroid;
	}

}
