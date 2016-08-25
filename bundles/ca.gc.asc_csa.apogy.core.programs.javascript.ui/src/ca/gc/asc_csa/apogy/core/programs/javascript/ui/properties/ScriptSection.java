/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Alexey Balyberdin (alexey.balyberdin@savoirfairelinux.com)
 *     Savoir-faire Linux - Initial API and implementation
 */

package ca.gc.asc_csa.apogy.core.programs.javascript.ui.properties;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade;
import ca.gc.asc_csa.apogy.common.ui.properties.sections.AbstractExtendedPropertySection;
import ca.gc.asc_csa.apogy.core.programs.javascript.JavaScriptProgram;

public class ScriptSection extends AbstractExtendedPropertySection {

	@Override
	protected void render(EObject eObject) {

		JavaScriptProgram script = (JavaScriptProgram) ApogyCommonConvertersFacade.INSTANCE.convert(eObject, JavaScriptProgram.class);

		if (script != null) {
			((ScriptComposite) getComposite()).setJavaScriptProgram(script);
		}
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	protected Composite createComposite(Composite parent) {
		return new ScriptComposite(parent, SWT.NONE);
	}

}
