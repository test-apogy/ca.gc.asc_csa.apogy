/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.addons.ros.validation;

import ca.gc.asc_csa.apogy.addons.ros.ROSNode;

import org.ros.internal.message.Message;

import org.ros.node.topic.Publisher;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.addons.ros.ROSPublisher}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ROSPublisherValidator {
	boolean validate();

	boolean validateLaunched(boolean value);
	boolean validateTopicName(String value);
	boolean validateMessageType(String value);
	boolean validatePublisher(Publisher<Message> value);
	boolean validateNode(ROSNode value);
}
