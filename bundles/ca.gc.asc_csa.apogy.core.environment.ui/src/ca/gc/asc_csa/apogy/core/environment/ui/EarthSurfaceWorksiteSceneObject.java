package ca.gc.asc_csa.apogy.core.environment.ui;
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

public interface EarthSurfaceWorksiteSceneObject extends SceneObject {

	 public void setAxisVisible(boolean newAxisVisible);
	
	 public void setAxisLength(double newAxisLength);
	 
	 public void setAzimuthVisible(boolean newAzimuthVisible);
	 
	 public void setElevationLinesVisible(boolean newElevationLinesVisible);
	 
	 public void setAzimuthLinesVisible(boolean newAzimuthLinesVisible);
	 
	 public void setPlaneVisible(boolean newPlaneVisible);
	 
	 public void setPlaneParameters(double newPlaneGridSize, double newPlaneSize);
	
}
