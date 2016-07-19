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

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.reflect.FieldUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.dltk.core.IBuffer;
import org.eclipse.dltk.core.IProjectFragment;
import org.eclipse.dltk.core.IScriptFolder;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.internal.core.BufferManager;
import org.eclipse.dltk.internal.core.Model;
import org.eclipse.dltk.internal.core.ModelManager;
import org.eclipse.dltk.javascript.internal.ui.text.completion.JavaScriptTypeCompletionProposalComputer;
import org.eclipse.dltk.ui.text.completion.ScriptContentAssistInvocationContext;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.ui.IEditorPart;
import org.eclipse.wst.jsdt.internal.core.CompilationUnit;
import org.eclipse.wst.jsdt.internal.core.JavaProject;
import org.eclipse.wst.jsdt.internal.core.PackageFragment;
import org.eclipse.wst.jsdt.ui.text.java.ContentAssistInvocationContext;
import org.eclipse.wst.jsdt.ui.text.java.IJavaCompletionProposalComputer;
import org.eclipse.wst.jsdt.ui.text.java.JavaContentAssistInvocationContext;

import ca.gc.asc_csa.apogy.core.ui.natures.ApogyProjectNature;

/**
 * Provides code completion for Apogy in the JSDT editor. It adapts the
 * completion engine of DLTK JavaScript to JSDT. See
 * {@link ca.gc.asc_csa.apogy.core.programs.javascript.ApogyTypeProvider}.
 *
 *
 */
@SuppressWarnings("restriction")
public class ApogyCompletionProposalComputer implements IJavaCompletionProposalComputer {

	public ApogyCompletionProposalComputer() {
	}

	@Override
	public void sessionStarted() {
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List computeCompletionProposals(ContentAssistInvocationContext context, IProgressMonitor monitor) {
		if (!(context instanceof JavaContentAssistInvocationContext)) {
			return Collections.EMPTY_LIST;
		}

		JavaContentAssistInvocationContext javaContext = (JavaContentAssistInvocationContext) context;
		updateDLTKBufferCache(context.getDocument().get(), javaContext);

		// TODO: When migrating to Neon, replace this:
		IEditorPart editorPart = null;
		try {
			editorPart = (IEditorPart) FieldUtils.readField(javaContext, "fEditor", true);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		// with:
		// IEditorPart editorPart = javaContext.getEditor();

		ScriptContentAssistInvocationContext dltkContext = new ScriptContentAssistInvocationContext(context.getViewer(), context.getInvocationOffset(), editorPart, ApogyProjectNature.NATURE_ID);
		JavaScriptTypeCompletionProposalComputer dltkProposalComputer = new JavaScriptTypeCompletionProposalComputer();
		List<ICompletionProposal> result = dltkProposalComputer.computeCompletionProposals(dltkContext, monitor);
		return result;
	}

	private void updateDLTKBufferCache(String content, JavaContentAssistInvocationContext javaContext) {
		BufferManager bufferManager = BufferManager.getDefaultBufferManager();

		// JSDT
		CompilationUnit compilationUnit = (CompilationUnit) javaContext.getCompilationUnit();
		PackageFragment packageFragment = (PackageFragment) compilationUnit.getParent();
		JavaProject javaProject = (JavaProject) packageFragment.getParent().getParent();

		// DLTK
		ModelManager modelManager = ModelManager.getModelManager();
		Model model = modelManager.getModel();
		IScriptProject scriptProject = model.getScriptProject(javaProject.getElementName());
		IProjectFragment projectFragment = scriptProject.getProjectFragment("");
		IScriptFolder scriptFolder = projectFragment.getScriptFolder(packageFragment.getElementName());
		ISourceModule sourceModule = scriptFolder.getSourceModule(compilationUnit.getElementName());

		IBuffer buffer = bufferManager.getBuffer(sourceModule);
		if (buffer != null) {
			buffer.setContents(content);
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List computeContextInformation(ContentAssistInvocationContext context, IProgressMonitor monitor) {
		return Collections.EMPTY_LIST;
	}

	@Override
	public String getErrorMessage() {
		return null;
	}

	@Override
	public void sessionEnded() {
	}

}
