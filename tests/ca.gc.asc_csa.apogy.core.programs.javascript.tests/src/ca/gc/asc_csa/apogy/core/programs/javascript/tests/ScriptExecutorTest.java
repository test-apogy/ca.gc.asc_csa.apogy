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

package ca.gc.asc_csa.apogy.core.programs.javascript.tests;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.junit.Assert;
import org.junit.Test;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.core.invocator.AbstractResult;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsList;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResult;
import ca.gc.asc_csa.apogy.core.invocator.Program;
import ca.gc.asc_csa.apogy.core.programs.javascript.JavaScriptProgram;
import ca.gc.asc_csa.apogy.core.programs.javascript.ScriptExecutor;

/**
 * Tests two {@link JavaScriptProgram} executed by ScriptExecutor.
 *
 * Checks that the {@link OperationCall} calls are invoked through the
 * {@link ApogyCoreInvocatorFacade}.
 * 
 */
public class ScriptExecutorTest {

	/**
	 * Executes a {@link JavaScriptProgram} and checks the {@link OperationCall}
	 * invoked.
	 *
	 */
	@Test
	public void executeRoverExampleDemo() throws Exception {
		final String ROVER_DATA_PRODUCTS_LIST_NAME = "Simulated Data";

		InvocatorSession invocatorSession = loadInvocatorSession("platform:/plugin/ca.gc.asc_csa.apogy.core.programs.javascript.tests/sessions/rover.sym", ROVER_DATA_PRODUCTS_LIST_NAME);
		JavaScriptProgram program = (JavaScriptProgram) getProgramByName(invocatorSession, "Rover Demo");
		URL url = new URL(program.getScriptPath());
		String source = IOUtils.toString(url.openStream());

		ScriptExecutor.executeString(program, source);

		List<ExpectedOperationCall> expectedOperationCalls = new ArrayList<>();
		ExpectedOperationCall expectedOperationCall;

		// Init
		expectedOperationCall = new ExpectedOperationCall();
		expectedOperationCall.operationName = "init";
		expectedOperationCalls.add(expectedOperationCall);

		// cmdLinearVelocity
		expectedOperationCall = new ExpectedOperationCall();
		expectedOperationCall.operationName = "cmdLinearVelocity";
		expectedOperationCalls.add(expectedOperationCall);

		// moveTo
		expectedOperationCall = new ExpectedOperationCall();
		expectedOperationCall.operationName = "moveTo";
		expectedOperationCalls.add(expectedOperationCall);

		// moveTo
		expectedOperationCall = new ExpectedOperationCall();
		expectedOperationCall.operationName = "moveTo";
		expectedOperationCalls.add(expectedOperationCall);

		// takeSnapshot
		expectedOperationCall = new ExpectedOperationCall();
		expectedOperationCall.operationName = "takeSnapshot";
		expectedOperationCalls.add(expectedOperationCall);

		List<AbstractResult> results = getDataProductsByName(invocatorSession, ROVER_DATA_PRODUCTS_LIST_NAME).getOperationCallResultsList().getResults();
		for (int i = 0; i < expectedOperationCalls.size(); i++) {
			expectedOperationCall = expectedOperationCalls.get(i);
			OperationCall result = ((OperationCallResult) results.get(i)).getOperationCall();
			Assert.assertEquals(expectedOperationCall.operationName, result.getEOperation().getName());
		}
		clearDataProduct(invocatorSession, ROVER_DATA_PRODUCTS_LIST_NAME);
	}

	/**
	 * Executes a {@link JavaScriptProgram} and checks the {@link OperationCall}
	 * invoked.
	 *
	 */
	@Test
	public void executeMobilePlatformDemo() throws Exception {
		final String MOBILE_PLATFORM_DATA_PRODUCTS_LIST_NAME = "Simulated Data";

		InvocatorSession invocatorSession = loadInvocatorSession("platform:/plugin/ca.gc.asc_csa.apogy.core.programs.javascript.tests/sessions/mobile-platform.sym",
				MOBILE_PLATFORM_DATA_PRODUCTS_LIST_NAME);
		JavaScriptProgram program = (JavaScriptProgram) getProgramByName(invocatorSession, "Mobile Platform Demo");
		URL url = new URL(program.getScriptPath());
		String source = IOUtils.toString(url.openStream());

		ScriptExecutor.executeString(program, source);

		List<ExpectedOperationCall> expectedOperationCalls = new ArrayList<>();
		ExpectedOperationCall expectedOperationCall;

		// Init
		expectedOperationCall = new ExpectedOperationCall();
		expectedOperationCall.operationName = "init";
		expectedOperationCalls.add(expectedOperationCall);

		// cmdLinearVelocity
		expectedOperationCall = new ExpectedOperationCall();
		expectedOperationCall.operationName = "cmdLinearVelocity";
		expectedOperationCalls.add(expectedOperationCall);

		// moveTo
		expectedOperationCall = new ExpectedOperationCall();
		expectedOperationCall.operationName = "moveTo";
		expectedOperationCalls.add(expectedOperationCall);

		List<AbstractResult> results = getDataProductsByName(invocatorSession, MOBILE_PLATFORM_DATA_PRODUCTS_LIST_NAME).getOperationCallResultsList().getResults();
		for (int i = 0; i < expectedOperationCalls.size(); i++) {
			expectedOperationCall = expectedOperationCalls.get(i);
			OperationCall result = ((OperationCallResult) results.get(i)).getOperationCall();
			Assert.assertEquals(expectedOperationCall.operationName, result.getEOperation().getName());
		}
		clearDataProduct(invocatorSession, MOBILE_PLATFORM_DATA_PRODUCTS_LIST_NAME);
	}

	/**
	 * Loads an {@link InvocatorSession} which contains a
	 * {link @JavaScriptProgram}.
	 */
	private static InvocatorSession loadInvocatorSession(String uri, String dataProductsListName) {
		URI sessionURI = URI.createURI(uri);
		List<EObject> contents = ApogyCommonEMFFacade.INSTANCE.getContent(sessionURI);
		InvocatorSession invocatorSession = (InvocatorSession) contents.get(0);
		ApogyCoreInvocatorFacade.INSTANCE.setActiveInvocatorSession(invocatorSession);
		ApogyCoreInvocatorFacade.INSTANCE.initVariableInstances(invocatorSession.getEnvironment());
		getDataProductsByName(invocatorSession, dataProductsListName).getOperationCallResultsList().getResults().clear();
		return invocatorSession;
	}

	/**
	 * Remove all elemenets from a data products
	 *
	 */
	private static void clearDataProduct(InvocatorSession invocatorSession, String dataProductsListName) {
		ApogyCoreInvocatorFacade.INSTANCE.disposeVariableInstances(invocatorSession.getEnvironment());
		getDataProductsByName(invocatorSession, dataProductsListName).getOperationCallResultsList().getResults().clear();
	}

	private static DataProductsList getDataProductsByName(InvocatorSession invocatorSession, String name) {
		for (DataProductsList dataProductsList : invocatorSession.getDataProductsListContainer().getDataProductsList()) {
			if (dataProductsList.getName().equals(name)) {
				return dataProductsList;
			}
		}
		return null;
	}

	private static Program getProgramByName(InvocatorSession invocatorSession, String name) {
		for (Program program : invocatorSession.getProgramsList().getPrograms()) {
			if (program.getName().equals(name)) {
				return program;
			}
		}
		return null;
	}

	private class ExpectedOperationCall {
		public String operationName;
	}
}
