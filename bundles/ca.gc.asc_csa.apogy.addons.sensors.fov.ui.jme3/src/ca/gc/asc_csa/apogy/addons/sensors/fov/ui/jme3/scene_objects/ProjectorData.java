package ca.gc.asc_csa.apogy.addons.sensors.fov.ui.jme3.scene_objects;
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

import com.jme3.math.Vector3f;
import com.jme3.post.SimpleTextureProjector;
import com.jme3.scene.debug.WireFrustum;

public class ProjectorData 
{
	public SimpleTextureProjector projector;
	public WireFrustum frustum;
	public Vector3f[] frustumPoints;
}
