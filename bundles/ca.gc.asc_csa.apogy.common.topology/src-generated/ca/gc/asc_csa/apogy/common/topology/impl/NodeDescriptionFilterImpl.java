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
package ca.gc.asc_csa.apogy.common.topology.impl;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EClass;

import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.NodeDescriptionFilter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Description Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NodeDescriptionFilterImpl extends RegexNodeFilterImpl implements NodeDescriptionFilter 
{	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeDescriptionFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyPackage.Literals.NODE_DESCRIPTION_FILTER;
	}

	@Override
	public Collection<Node> filter(Collection<Node> nodes) 
	{
		Collection<Node> output = new HashSet<Node>();
		
		for(Node node : nodes)
		{
			if(matches(node.getDescription())) output.add(node);
		}
		
		return output;
	}
} //NodeDescriptionFilterImpl
