package ca.gc.asc_csa.apogy.core.topology.ui.parts;
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
 *     Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewer;

public abstract class AbstractApogy3dPart extends AbstractApogyTopologyBasedPart {

	public TopologyViewer createTopologyViewer(Composite parent) {
		JME3RenderEngineDelegate jme3RenderEngineDelegate = createJME3RenderEngineDelegate();
		TopologyViewer viewer = new TopologyViewer(parent, jme3RenderEngineDelegate);

		jme3RenderEngineDelegate.setMaximumFrameRate(viewer.getMaximumFrameRate());
		jme3RenderEngineDelegate.setVerbose(viewer.isVerbose());
		jme3RenderEngineDelegate.setAntiAliasing(viewer.isAntiAliasingEnabled());
		jme3RenderEngineDelegate.setShowStatisticsEnabled(viewer.isShowStatisticsEnabled());

		return viewer;
	}

	/**
	 * Method that create the JME3RenderEngineDelegate to be used.
	 * 
	 * @return The JME3RenderEngineDelegate to be used.
	 */
	protected abstract JME3RenderEngineDelegate createJME3RenderEngineDelegate();
}