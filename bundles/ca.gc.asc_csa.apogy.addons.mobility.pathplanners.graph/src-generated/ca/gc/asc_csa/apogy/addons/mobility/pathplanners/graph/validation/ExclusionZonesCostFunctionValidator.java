/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.validation;

import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ExclusionZone;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ExclusionZonesCostFunction}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ExclusionZonesCostFunctionValidator {
	boolean validate();

	boolean validateExclusionZones(EList<ExclusionZone> value);
}
