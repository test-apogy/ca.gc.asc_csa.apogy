package ca.gc.asc_csa.apogy.common.topology.ui.jme3.internal;
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

import java.lang.ref.WeakReference;

import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3SceneObject;

import com.jme3.scene.Geometry;

public class SceneGraphObjectPredicate
		implements
		org.apache.commons.collections4.Predicate<WeakReference<NodePresentation>> {

	private Object sceneGraphObject;

	public SceneGraphObjectPredicate(Object sceneGraphObject) {
		this.sceneGraphObject = sceneGraphObject;
	}

	@Override
	public boolean evaluate(WeakReference<NodePresentation> np) 
	{
		boolean matches = false;

		matches = np != null && np.get() != null;

		if (matches) {

			matches = np.get().getSceneObject() instanceof JME3SceneObject;

			if (matches) 
			{
				JME3SceneObject jme3SceneObject = (JME3SceneObject) np.get().getSceneObject();

				for (Geometry shape : jme3SceneObject.getGeometries()) 
				{
					matches = shape == sceneGraphObject;
					if (matches) 
					{
						break;
					}
				}
			}
		}

		return matches;
	}

}
