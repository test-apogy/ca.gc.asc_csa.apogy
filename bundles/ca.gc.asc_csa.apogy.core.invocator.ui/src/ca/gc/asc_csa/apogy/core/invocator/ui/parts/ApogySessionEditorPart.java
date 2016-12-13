package ca.gc.asc_csa.apogy.core.invocator.ui.parts;
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

import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectEditorComposite;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;

public class ApogySessionEditorPart extends AbstractSessionContainedEObjectEditorPart {
	@Override
	protected void newInvocatorSession(InvocatorSession invocatorSession) {
		((EObjectEditorComposite) getActualComposite()).setEObject(invocatorSession);
	}
}