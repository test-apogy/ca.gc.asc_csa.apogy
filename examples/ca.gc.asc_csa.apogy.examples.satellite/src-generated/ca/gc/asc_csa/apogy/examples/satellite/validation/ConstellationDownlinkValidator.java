/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.examples.satellite.validation;

import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationDownlinkItem;

import ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlinksList;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlink}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ConstellationDownlinkValidator {
	boolean validate();

	boolean validateConstellationDownlinksList(ConstellationDownlinksList value);

	boolean validateDownlinkItems(EList<AbstractConstellationDownlinkItem> value);
}
