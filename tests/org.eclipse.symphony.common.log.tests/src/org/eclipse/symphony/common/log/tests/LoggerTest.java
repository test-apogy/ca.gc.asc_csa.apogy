package org.eclipse.symphony.common.log.tests;

import org.eclipse.symphony.common.log.Activator;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
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