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

import javax.vecmath.Point3d;
import javax.vecmath.Tuple3d;

import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.common.topology.Node;

public interface SceneObject {

	/**
	 * Returns the Topology node associated to this object.
	 * 
	 * @return the topology node listened by this object.
	 */
	public Node getTopologyNode();

	/**
	 * Gets the current color of the object.
	 * 
	 * @return The RBG color of the object.
	 */
	public RGB getColor();

	/**
	 * Sets the color of the object.
	 * 
	 * @param rgb
	 *            The RBG color to be used to render the object.
	 */
	public void setColor(RGB rgb);

	/**
	 * This method is called when the object is selected.
	 */
	public void objectSelected();

	/**
	 * Returns whether the current object is shown.
	 * 
	 * @return True is object is visible, false otherwise.
	 */
	public boolean isVisible();

	/**
	 * Set the object visibility.
	 * 
	 * @param visible
	 *            True make the object visible, false makes it invisible.
	 */
	public void setVisible(boolean visible);


	/**
	 * Sets the shadow mode of the scene object.
	 * @param shadowMode The new ShadowMode.
	 */
	public void setShadowMode(ShadowMode shadowMode);
	
	/**
	 * Returns the current shadow mode of the object.
	 * @return the ShadowMode.
	 */
	public ShadowMode getShadowMode();
	

	public Tuple3d getMin();

	public Tuple3d getMax();

	public void setTransparency(float transparency);

	public Point3d getCentroid();

}
