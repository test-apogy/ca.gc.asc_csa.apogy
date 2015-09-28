/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProcessorsChainValidator.java,v 1.3.4.2 2015/05/21 15:51:13 pallard Exp $
 */
package ca.gc.space.mrt.common.processors.validation;

import org.eclipse.emf.common.util.EList;

import ca.gc.space.mrt.common.processors.Processor;

/**
 * A sample validator interface for {@link ca.gc.space.mrt.common.processors.ProcessorsChain}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ProcessorsChainValidator {
	boolean validate();

	boolean validateIntermediateResult(Object value);
	boolean validateProcessors(EList<Processor> value);
}
