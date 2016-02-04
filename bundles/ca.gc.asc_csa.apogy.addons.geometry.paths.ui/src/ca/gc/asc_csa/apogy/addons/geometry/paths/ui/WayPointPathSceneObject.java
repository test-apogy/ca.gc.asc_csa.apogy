package ca.gc.asc_csa.apogy.addons.geometry.paths.ui;
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

import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;

public interface WayPointPathSceneObject extends SceneObject 
{
	public void setPointSize(int pointSize);
	
	public int getPointSize();
	
	public void setEndPointsRadius(float endPointsRadius);
	
	public float getEndPointsRadius();
	
	public void setPathPresentationMode(PathPresentationMode mode);
	
	public PathPresentationMode getPathPresentationMode();
}