/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.addons.ros.validation;

import ca.gc.asc_csa.apogy.addons.ros.ROSNode;

import org.ros.internal.message.Message;

import org.ros.message.MessageListener;

import org.ros.node.topic.Subscriber;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.addons.ros.ROSListener}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ROSListenerValidator {
	boolean validate();

	boolean validateRunning(boolean value);
	boolean validateNode(ROSNode value);
	boolean validateRosSubscriber(Subscriber<Message> value);
	boolean validateTopicName(String value);
	boolean validateMessageType(String value);
	boolean validateMessageListener(MessageListener<Message> value);
}
