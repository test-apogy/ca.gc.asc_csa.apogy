package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.jme3.adapters;
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

import ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.jme3.scene_objects.ColoredCartesianCoordinateSetJME3SceneObject;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Adapter;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3SceneObject;

/**
 * JME3 Adapter for ContentNode<ColoredCartesianCoordinatesSet> nodes.
 * @author pallard
 */
public class ColoredCartesianCoordinateSetJME3Adapter implements JME3Adapter 
{

	public ColoredCartesianCoordinateSetJME3Adapter() {
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public JME3SceneObject getAdapter(Node obj, Object context) 
	{

		JME3SceneObject object = null;

		if (isAdapterFor(obj)) 
		{
			// Context should be an Application
			if (!(context instanceof JME3RenderEngineDelegate)) 
			{
				throw new IllegalArgumentException("Context must be a JME3RenderEngineDelegate.");
			}
			
			ContentNode<ColoredCartesianCoordinatesSet> cNode = (ContentNode<ColoredCartesianCoordinatesSet>) obj;
			object = new ColoredCartesianCoordinateSetJME3SceneObject<ColoredCartesianCoordinatesSet>(cNode, (JME3RenderEngineDelegate) context);
		}

		return object;
	}

	@Override
	public boolean isAdapterFor(Node obj) {

		boolean matches = false;
				
		if (obj instanceof ContentNode) 
		{
			ContentNode<?> node = (ContentNode<?>) obj;
			matches = node.getContent() instanceof ColoredCartesianCoordinatesSet;
		}		

		return matches;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return ColoredCartesianCoordinatesSet.class;
	}
}
