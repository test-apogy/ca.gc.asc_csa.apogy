package ca.gc.asc_csa.apogy.common.topology.ui;
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

import java.util.Iterator;
import java.util.List;

import javax.vecmath.Vector3d;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;

public class TopologyViewerSelection implements IStructuredSelection {

	/**
	 * The {@link NodePresentation} object associated with the selection.
	 */
	private NodePresentation nodePresentation;

	/**
	 * The intersection, expressed in the NodePresentation's local frame
	 * coordinates. May be <code>null</code>.
	 */
	private Vector3d intersection;

	/**
	 * The structured selection object used to implement the
	 * {@link IStructuredSelection} interface.
	 */
	private StructuredSelection ssel;

	/**
	 * 
	 * <dl>
	 * <dt>Name:</dt>
	 * <dd>TopologyViewerSelection</dd>
	 * <dt>Description:</dt>
	 * <dd>creates a new instance.</dd>
	 * <dt>Pre-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>nodePresentation != null</li>
	 * </ul>
	 * </dd>
	 * <dt>Post-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>{@link #nodePresentation} == nodePresentation</li>
	 * </ul>
	 * </dd>
	 * </dl>
	 * 
	 * @param nodePresentation
	 *            the node presentation associated to it
	 * @throws IllegalArgumentException
	 *             if nodePresentation is null.
	 */
	public TopologyViewerSelection(NodePresentation nodePresentation) {

		if (nodePresentation == null) {
			throw new IllegalArgumentException();
		}

		setNodePresentation(nodePresentation);
		ssel = new StructuredSelection(this.nodePresentation);
	}

	/**
	 * 
	 * <dl>
	 * <dt>Name:</dt>
	 * <dd>TopologyViewerSelection</dd>
	 * <dt>Description:</dt>
	 * <dd>creates a new instance.</dd>
	 * <dt>Pre-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>nodePresentation != null</li>
	 * </ul>
	 * </dd>
	 * <dt>Post-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>{@link #nodePresentation} == nodePresentation</li>
	 * <li>{@link #intersection} == intersection</li>
	 * </ul>
	 * </dd>
	 * </dl>
	 * 
	 * @param nodePresentation
	 *            the node presentation associated to it
	 * @param intersection
	 *            the intersection point in nodePresentation, expressed in
	 *            nodePresentation's local coordinates frame. May be null.
	 * @throws IllegalArgumentException
	 *             if nodePresentation is null.
	 */
	public TopologyViewerSelection(NodePresentation nodePresentation,
			Vector3d intersection) {

		if (nodePresentation == null) {
			throw new IllegalArgumentException();
		}

		setNodePresentation(nodePresentation);
		this.intersection = intersection;

	}

	private void setNodePresentation(NodePresentation nodePresentation) {
		if (this.nodePresentation != nodePresentation) {
			this.nodePresentation = nodePresentation;
			ssel = new StructuredSelection(this.nodePresentation);
		}
	}

	/**
	 * This selection is never empty.
	 */
	@Override
	public boolean isEmpty() {
		return ssel.isEmpty();
	}

	/**
	 * 
	 * <dl>
	 * <dt>Name:</dt>
	 * <dd>getNodePresentation</dd>
	 * <dt>Description:</dt>
	 * <dd>returns the {@link NodePresentation} object selected.</dd>
	 * <dt>Pre-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>None</li>
	 * </ul>
	 * </dd>
	 * <dt>Post-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>None</li>
	 * </ul>
	 * </dd>
	 * </dl>
	 * 
	 * @return the {@link NodePresentation} object selected.
	 */
	public NodePresentation getNodePresentation() {
		return nodePresentation;
	}

	/**
	 * 
	 * <dl>
	 * <dt>Name:</dt>
	 * <dd>getIntersection</dd>
	 * <dt>Description:</dt>
	 * <dd>returns the intersection point in the nodePresentation's local frame.
	 * May be null</dd>
	 * <dt>Pre-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>None</li>
	 * </ul>
	 * </dd>
	 * <dt>Post-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>None</li>
	 * </ul>
	 * </dd>
	 * </dl>
	 * 
	 * @return returns the intersection point in the nodePresentation's local
	 *         frame. May be null
	 */
	public Vector3d getIntersection() {
		return intersection;
	}

	@Override
	public Object getFirstElement() {
		return ssel.getFirstElement();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Iterator iterator() {
		return ssel.iterator();
	}

	@Override
	public int size() {
		return ssel.size();
	}

	@Override
	public Object[] toArray() {
		return ssel.toArray();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List toList() {
		return ssel.toList();
	}

}
