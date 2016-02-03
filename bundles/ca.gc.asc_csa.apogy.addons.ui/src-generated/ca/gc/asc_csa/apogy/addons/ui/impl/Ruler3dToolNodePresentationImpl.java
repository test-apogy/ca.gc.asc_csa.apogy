package ca.gc.asc_csa.apogy.addons.ui.impl;
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.ui.Ruler3dToolNodePresentation;
import ca.gc.asc_csa.apogy.addons.ui.ApogyAddonsUIPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ruler3d Tool Node Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Ruler3dToolNodePresentationImpl extends NodePresentationImpl implements Ruler3dToolNodePresentation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ruler3dToolNodePresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsUIPackage.Literals.RULER3D_TOOL_NODE_PRESENTATION;
	}

	@Override
	protected void updateSceneObject(Notification notification) 
	{
		// TODO
		super.updateSceneObject(notification);
	}	
} //Ruler3dToolNodePresentationImpl
