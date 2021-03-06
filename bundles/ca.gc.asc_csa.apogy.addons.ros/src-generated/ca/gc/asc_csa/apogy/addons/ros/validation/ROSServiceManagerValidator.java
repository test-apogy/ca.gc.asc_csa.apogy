/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.addons.ros.validation;

import ca.gc.asc_csa.apogy.addons.ros.ROSNode;
import ca.gc.asc_csa.apogy.addons.ros.ROSService;

import java.util.HashMap;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ROSServiceManagerValidator {
	boolean validate();

	boolean validateServices(HashMap<String, ROSService<?, ?>> value);
	boolean validateNode(ROSNode value);
	boolean validateRunning(boolean value);
}
