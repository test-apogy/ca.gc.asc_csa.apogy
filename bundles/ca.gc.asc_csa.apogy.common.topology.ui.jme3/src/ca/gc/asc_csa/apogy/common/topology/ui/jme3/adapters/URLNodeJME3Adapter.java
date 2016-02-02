package ca.gc.asc_csa.apogy.common.topology.ui.jme3.adapters;
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

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.URLNode;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Adapter;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3SceneObject;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects.URLNodeJME3TopologyObject;

public class URLNodeJME3Adapter implements JME3Adapter {

	@Override
	public Class<?> getAdaptedClass() {
		return URLNode.class;
	}

	@Override
	public JME3SceneObject getAdapter(Node obj, Object context) {

		URLNodeJME3TopologyObject jme3Object = null;
		if (isAdapterFor(obj)) {

			// Context should be an Application
			if (!(context instanceof JME3RenderEngineDelegate)) 
			{
				throw new IllegalArgumentException(
						"Context must be a JME3RenderEngineDelegate.");
			}

			jme3Object = new URLNodeJME3TopologyObject((URLNode) obj, (JME3RenderEngineDelegate) context);
		}
		return jme3Object;
	}

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof URLNode;
	}

}
