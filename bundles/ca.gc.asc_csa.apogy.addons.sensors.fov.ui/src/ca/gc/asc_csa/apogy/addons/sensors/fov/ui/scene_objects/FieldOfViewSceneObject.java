package ca.gc.asc_csa.apogy.addons.sensors.fov.ui.scene_objects;
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

import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;
import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;

public interface FieldOfViewSceneObject extends SceneObject 
{
	public MeshPresentationMode getPresentationMode();
	public void setPresentationMode(MeshPresentationMode presentationMode);
	
	public void setTransparency(float transparency);
	public float getTransparency();
			
	public void setShowOutlineOnly(boolean showOutlineOnly);	
	public boolean isShowOutlineOnly();
	
	public void setShowProjection(boolean showProjection);	
	public boolean isShowProjection();
	
	public void setProjectionColor(RGB color);
	public RGB getProjectionColor();
}
