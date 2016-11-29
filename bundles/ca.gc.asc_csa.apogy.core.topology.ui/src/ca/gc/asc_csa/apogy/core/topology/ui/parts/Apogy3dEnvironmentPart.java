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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.core.ResultNode;
import ca.gc.asc_csa.apogy.core.invocator.AbstractResult;
import ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation;

public class Apogy3dEnvironmentPart extends AbstractApogy3dPart {

	@Override
	protected void setNullSelection() {
		// selectionService.setSelection(ApogyCoreInvocatorUIFactory.eINSTANCE.createScriptBasedProgramsListPartSelection());
	}

	// FIXME: Add List<AbstractResult> selection. List results = ApogyCommonConvertersUIFacade.INSTANCE.convert(selection, AbstractResult.class);	
	
	/**
	 * Method that create the JME3RenderEngineDelegate to be used.
	 * 
	 * @return The JME3RenderEngineDelegate to be used.
	 */
	protected JME3RenderEngineDelegate createJME3RenderEngineDelegate() {
		return new JME3RenderEngineDelegate();
	}

	public void show(List<AbstractResult> results) {
		if (getTopologyViewer() != null && getTopologyViewer().getInput() instanceof GraphicsContext) {
			GraphicsContext graphicsContext = (GraphicsContext) getTopologyViewer().getInput();
			TopologyPresentationSet presentationTopologySet = graphicsContext.getTopologyPresentationSet();

			List<Node> nodes = presentationTopologySet.getNodes();
			Map<AbstractResult, ResultNodePresentation> resultToPresentationMap = new HashMap<AbstractResult, ResultNodePresentation>();

			for (Node node : nodes) {
				if (node instanceof ResultNode) {
					ResultNode resultNode = (ResultNode) node;
					NodePresentation nodePresentation = presentationTopologySet.getPresentationNode(node);
					if (nodePresentation instanceof ResultNodePresentation) {
						ResultNodePresentation resultNodePresentation = (ResultNodePresentation) nodePresentation;
						resultToPresentationMap.put(resultNode.getResult(), resultNodePresentation);
					}
				}
			}

			// Set invisible all ResultNode
			for (ResultNodePresentation resultNodePresentation : resultToPresentationMap.values()) {
				resultNodePresentation.setVisible(false);
			}

			// Set visible the selected ones.
			for (AbstractResult abstractResult : results) {
				ResultNodePresentation resultNodePresentation = resultToPresentationMap.get(abstractResult);
				if (resultNodePresentation != null)
					resultNodePresentation.setVisible(true);
			}
		}
	}
	// FIXME Remove THIS. It is just an example.
	// @PostConstruct
	// public void createControl(MPart part) {
	// Map<String, String> state = part.getPersistedState();
	// String value = state.get("key");
	// ...
	// }
	//
	// @PersistState
	// public void persistState(MPart part) {
	// Map<String, String> state = part.getPersistedState();
	// state.put("key", "newValue");
	// ...
	// }
}