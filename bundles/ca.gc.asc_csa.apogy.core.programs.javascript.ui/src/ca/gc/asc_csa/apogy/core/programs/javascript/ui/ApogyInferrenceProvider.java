/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mathieu Larose (mathieu.larose@savoirfairelinux.com)
 *     Savoir-faire Linux - Initial API and implementation
 */

package ca.gc.asc_csa.apogy.core.programs.javascript.ui;

import org.eclipse.wst.jsdt.core.infer.IInferEngine;
import org.eclipse.wst.jsdt.core.infer.IInferenceFile;
import org.eclipse.wst.jsdt.core.infer.InferrenceProvider;
import org.eclipse.wst.jsdt.core.infer.RefactoringSupport;
import org.eclipse.wst.jsdt.core.infer.ResolutionConfiguration;

/**
 * Used in the org.eclipse.wst.jsdt.core.inferrenceSupport extension point.
 *
 */
public class ApogyInferrenceProvider implements InferrenceProvider {

	@Override
	public IInferEngine getInferEngine() {
		ApogyInferEngine engine = new ApogyInferEngine(this);
		return engine;
	}

	@Override
	public int applysTo(IInferenceFile scriptFile) {
		return InferrenceProvider.ONLY_THIS;
	}

	@Override
	public String getID() {
		return ApogyInferrenceProvider.class.getCanonicalName();
	}

	@Override
	public ResolutionConfiguration getResolutionConfiguration() {
		return new ResolutionConfiguration();
	}

	@Override
	public RefactoringSupport getRefactoringSupport() {
		return null;
	}
}
