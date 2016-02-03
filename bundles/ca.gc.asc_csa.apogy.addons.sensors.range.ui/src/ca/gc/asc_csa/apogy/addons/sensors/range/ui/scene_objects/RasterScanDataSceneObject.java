package ca.gc.asc_csa.apogy.addons.sensors.range.ui.scene_objects;
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

import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;
import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;

public interface RasterScanDataSceneObject extends SceneObject 
{		
	public boolean isFovVisible();

	public void setFovVisible(boolean fovVisible);
	
	public boolean isDataVisible();

	public void setDataVisible(boolean dataVisible);
	
	public MeshPresentationMode getFovMeshPresentationMode();

	public void setFovMeshPresentationMode(MeshPresentationMode fovMeshPresentationMode);
}
