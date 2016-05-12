/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.validation;


/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.MobilePlatformData}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MobilePlatformDataValidator {
	boolean validate();

	boolean validateInitialized(boolean value);
	boolean validateDisposed(boolean value);
	boolean validateLinearVelocity(double value);
	boolean validateAngularVelocity(double value);
}
