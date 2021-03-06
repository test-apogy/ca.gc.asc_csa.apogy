/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.common.io.jinput.validation;

import ca.gc.asc_csa.apogy.common.io.jinput.EController;

import org.eclipse.core.runtime.jobs.Job;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.common.io.jinput.EControllerEnvironment}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EControllerEnvironmentValidator {
	boolean validate();

	boolean validateSupported(boolean value);
	boolean validateControllers(EList<EController> value);
	boolean validateRefreshRequested(boolean value);
	boolean validatePollingCount(long value);
	boolean validatePollingJob(Job value);
	boolean validatePollingProblem(boolean value);
}
