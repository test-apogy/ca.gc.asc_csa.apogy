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

package ca.gc.asc_csa.apogy.core.programs.javascript;

/**
 * Debugger frontend for Rhino.
 * 
 * An implementation of this interface must connect to a Rhino debugger backend.
 */
public interface RhinoDebuggerFrontend {

	/**
	 * Called when the debugger backend has been launched.
	 * 
	 * @param address
	 *            Debugger backend listening address
	 * @param port
	 *            Debugger backend listening port
	 * @throws Exception
	 */
	public void start(String address, int port) throws Exception;
}
