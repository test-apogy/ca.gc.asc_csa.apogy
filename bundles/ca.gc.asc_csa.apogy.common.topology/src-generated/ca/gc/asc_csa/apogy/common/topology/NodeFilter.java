/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.common.topology;

import java.util.Collection;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class of all Node filters.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getNodeFilter()
 * @model abstract="true"
 * @generated
 */
public interface NodeFilter extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Filters a list of Nodes.
	 * @param nodes The list of Nodes on which to apply the filter.
	 * @return The list of Node that passes through the filter.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.topology.Collection<ca.gc.asc_csa.apogy.common.topology.Node>" unique="false" nodesDataType="ca.gc.asc_csa.apogy.common.topology.Collection<ca.gc.asc_csa.apogy.common.topology.Node>" nodesUnique="false"
	 * @generated
	 */
	Collection<Node> filter(Collection<Node> nodes);

} // NodeFilter
