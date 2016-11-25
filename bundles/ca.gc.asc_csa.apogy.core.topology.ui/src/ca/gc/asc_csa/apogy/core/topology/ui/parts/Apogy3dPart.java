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

import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;

public class Apogy3dPart extends AbstractApogy3dPart {
		
	@Override
	protected void setNullSelection() {
//		selectionService.setSelection(ApogyCoreInvocatorUIFactory.eINSTANCE.createScriptBasedProgramsListPartSelection());
	}
	
	/**
	 * Method that create the JME3RenderEngineDelegate to be used.
	 * @return The JME3RenderEngineDelegate to be used.
	 */
	protected JME3RenderEngineDelegate createJME3RenderEngineDelegate(){
		System.out.println("Apogy3dPart.createJME3RenderEngineDelegate()");
		return new JME3RenderEngineDelegate();
	}

// FIXME Remove THIS.  It is just an example.	
//	@PostConstruct
//	public void createControl(MPart part) {
//	        Map<String, String> state = part.getPersistedState();
//	        String value = state.get("key");
//	        ...
//	}
//
//	@PersistState
//	public void persistState(MPart part) {
//	        Map<String, String> state = part.getPersistedState();
//	        state.put("key", "newValue");
//	        ...
//	}	
}