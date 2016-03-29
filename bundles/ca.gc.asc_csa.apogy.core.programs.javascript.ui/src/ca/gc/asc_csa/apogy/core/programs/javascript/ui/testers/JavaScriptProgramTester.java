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

package ca.gc.asc_csa.apogy.core.programs.javascript.ui.testers;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.expressions.PropertyTester;

import ca.gc.asc_csa.apogy.core.programs.javascript.JavaScriptProgram;

public class JavaScriptProgramTester extends PropertyTester {

    @Override
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
        if (receiver instanceof Collection) {
            @SuppressWarnings({ "rawtypes", "unchecked" })
			Iterator<Object> receiverCollection = ((Collection) receiver).iterator();
            while (receiverCollection.hasNext()) {
                Object object = (Object) receiverCollection.next();
                if (object instanceof JavaScriptProgram) {
                    return true;
                }
            }
        }
        return receiver instanceof JavaScriptProgram;
    }

}
