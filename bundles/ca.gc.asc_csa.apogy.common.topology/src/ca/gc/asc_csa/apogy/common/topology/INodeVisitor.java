package ca.gc.asc_csa.apogy.common.topology;
/*
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

import ca.gc.asc_csa.apogy.common.topology.Node;

/**
 * 
 * <dl>
 * <dt>name:</dt><dd>INodeVisitor</dd>
 * <dt>Description:</dt><dd>description</dd>
 * <dt>Version:</dt><dd>$Revision: 1.4.2.2 $</dd>
 * <dt>Creation date:</dt><dd>Feb 20, 2012</dd>
 * </dl>
 * @author sgemme
 *
 * <pre>
 * 'History: 
 *  $Log: INodeVisitor.java,v $
 *  Revision 1.4.2.2  2015/02/03 20:01:30  rlarcheveque
 *  *** empty log message ***
 *
 *  Revision 1.3  2012/02/20 20:18:34  sgemme
 *  *** empty log message ***
 *
 * </pre>
 *
 */
public interface INodeVisitor
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void visit(Node node);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Class)
	 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getNodeVisitor_Type()
	 * @model dataType="ca.gc.space.java.emf.Class<T>"
	 * @generated
	 */
	Class<? extends Node> getType();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.INodeVisitor#getType
	 * <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Class<? extends Node> value);

} // NodeVisitor
