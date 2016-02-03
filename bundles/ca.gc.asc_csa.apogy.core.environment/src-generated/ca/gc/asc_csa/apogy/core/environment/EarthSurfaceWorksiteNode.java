package ca.gc.asc_csa.apogy.core.environment;
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

import ca.gc.asc_csa.apogy.common.topology.TransformNode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth Surface Worksite Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksiteNode#getSkyTransformNode <em>Sky Transform Node</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getEarthSurfaceWorksiteNode()
 * @model
 * @generated
 */
public interface EarthSurfaceWorksiteNode extends SurfaceWorksiteNode
{

  /**
	 * Returns the value of the '<em><b>Sky Transform Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sky Transform Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Sky Transform Node</em>' reference.
	 * @see #setSkyTransformNode(TransformNode)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getEarthSurfaceWorksiteNode_SkyTransformNode()
	 * @model transient="true"
	 * @generated
	 */
  TransformNode getSkyTransformNode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksiteNode#getSkyTransformNode <em>Sky Transform Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sky Transform Node</em>' reference.
	 * @see #getSkyTransformNode()
	 * @generated
	 */
  void setSkyTransformNode(TransformNode value);
} // EarthSurfaceWorksiteNode
