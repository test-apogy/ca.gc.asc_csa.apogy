package ca.gc.asc_csa.apogy.addons.sensors.fov.ui.jme3.utils;
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
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Application;

public abstract class AbstractFieldOfViewImageProjectorControl <T extends Node> extends ImageProjectorControl<T> 
{	
	protected RGB projectionColor = new RGB(0, 255, 0);
	
	public AbstractFieldOfViewImageProjectorControl(JME3Application jme3Application, T node)
	{
		super(jme3Application, node);
	}
	
	public void setProjectionColor(RGB rgb)
	{
		this.projectionColor = rgb;				
		updateProjectorFOVSettings();
	}
	
	public RGB getProjectionColor()
	{
		return projectionColor;
	}
}
