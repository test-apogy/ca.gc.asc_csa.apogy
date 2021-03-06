/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.addons.ros.validation;

import ca.gc.asc_csa.apogy.addons.ros.ROSInterface;
import ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager;
import ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager;
import ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher;

import ca.gc.asc_csa.apogy.addons.ros.utilities.NullRequestHandler;
import ca.gc.asc_csa.apogy.addons.ros.utilities.NullResponseHandler;
import ca.gc.asc_csa.apogy.addons.ros.utilities.ResponseLogger;

import org.eclipse.emf.common.util.EList;

import org.ros.node.ConnectedNode;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.addons.ros.ROSNode}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ROSNodeValidator {
	boolean validate();

	boolean validateConnectedNode(ConnectedNode value);
	boolean validateModules(EList<ROSInterface> value);
	boolean validateServiceManagers(EList<ROSServiceManager> value);
	boolean validateTopicLaunchers(EList<ROSTopicLauncher> value);
	boolean validatePublisherManagers(EList<ROSPublisherManager> value);
	boolean validateInitialized(boolean value);
	boolean validateConnected(boolean value);
	boolean validateRestarting(boolean value);
	boolean validateEnableAutoRestartOnConnectionLost(boolean value);
	boolean validateNodeName(String value);
	boolean validateResponseLogger(ResponseLogger value);
	boolean validateNullResponseHandler(NullResponseHandler value);
	boolean validateNullRequestHandler(NullRequestHandler value);
}
