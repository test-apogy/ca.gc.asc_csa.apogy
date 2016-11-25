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
import org.eclipse.swt.widgets.Label;

import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.core.ApogyTopology;

public class Apogy3dPart extends AbstractApogy3dPart {

	
	
	@Override
	protected void createContentComposite(Composite parent, int style) {
		new Label(parent, style).setText("Apogy 3d");
//		new ScriptBasedProgramsListComposite(parent, SWT.H_SCROLL | SWT.V_SCROLL) {
//			@Override
//			protected void newSelection(ISelection selection) {
//				if (selection.isEmpty()){
//					setNullSelection();					
//				}else {
//					Program program = ((ScriptBasedProgramsListComposite) getActualComposite()).getSelectedProgram();
//					if (program != null){
//						ScriptBasedProgramsListPartSelection selectionSent = ApogyCoreInvocatorUIFactory.eINSTANCE.createScriptBasedProgramsListPartSelection();
//						selectionSent.setProgram(program);		
//						
//						selectionService.setSelection(selectionSent);						
//					}
//				}
//			}
//		};
	}
		
	@Override
	protected void newTopology(ApogyTopology apogyTopology) {
		// TODO Auto-generated method stub
		super.newTopology(apogyTopology);
	}

	@Override
	protected void setNullSelection() {
//		selectionService.setSelection(ApogyCoreInvocatorUIFactory.eINSTANCE.createScriptBasedProgramsListPartSelection());
	}
	
	/**
	 * Method that create the JME3RenderEngineDelegate to be used.
	 * @return The JME3RenderEngineDelegate to be used.
	 */
	protected JME3RenderEngineDelegate createJME3RenderEngineDelegate(){
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