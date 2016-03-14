package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.scene_objects;
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

public interface ColoredCartesianTriangularMeshSceneObject extends CartesianTriangularMeshSceneObject 
{
	/**
	 * Specifies whether or not to overrides the vertex color with the color set by setColor(RGB rgb)
	 * @param overrideColor True overrides the vertex color, false uses the color defined in the vertices.
	 */
	public void setOverrideColor(boolean overrideColor);
}
