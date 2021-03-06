/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.addons.telecoms.validation;

import ca.gc.asc_csa.apogy.addons.telecoms.TelecomNodeStatus;
import ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorTool;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TelecomNodeValidator {
	boolean validate();

	boolean validateStatusMonitorTool(TelecomStatusMonitorTool value);
	boolean validateEnabled(boolean value);
	boolean validateName(String value);
	boolean validateAddress(String value);
	boolean validatePacketsToSend(int value);
	boolean validateConnectionTimeout(int value);
	boolean validateLatencyWarning(double value);
	boolean validateLatencyAlarm(double value);
	boolean validatePacketLossWarning(double value);
	boolean validatePacketLossAlarm(double value);
	boolean validateLatency(double value);
	boolean validatePacketLoss(double value);
	boolean validateStatus(TelecomNodeStatus value);
}
