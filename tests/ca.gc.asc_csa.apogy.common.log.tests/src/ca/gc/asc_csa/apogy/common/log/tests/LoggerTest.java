package ca.gc.asc_csa.apogy.common.log.tests;
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
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import ca.gc.asc_csa.apogy.common.log.Activator;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		Logger.INSTANCE.log(Activator.ID, "OK Log", EventSeverity.OK);
		Logger.INSTANCE.log(Activator.ID, "INFO Log", EventSeverity.INFO);
		Logger.INSTANCE.log(Activator.ID, "WARNING Log", EventSeverity.WARNING);
		Logger.INSTANCE.log(Activator.ID, "ERROR Log", EventSeverity.ERROR);
		Logger.INSTANCE.log(Activator.ID, "CANCEL Log", EventSeverity.CANCEL);
		
		Logger.INSTANCE.log(Activator.ID, this, "object=this Log", EventSeverity.OK);
		Logger.INSTANCE.log(Activator.ID, null, "object=null Log", EventSeverity.OK);
		
		Logger.INSTANCE.log(Activator.ID, this, "object=this, Throwable=t Log", EventSeverity.OK, new Throwable());
		Logger.INSTANCE.log(Activator.ID, this, "object=this, Throwable=null Log", EventSeverity.OK, null);
	}
}
