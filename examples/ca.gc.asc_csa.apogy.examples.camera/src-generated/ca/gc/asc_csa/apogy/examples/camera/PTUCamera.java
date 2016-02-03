package ca.gc.asc_csa.apogy.examples.camera;
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

import ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PTU Camera</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The abstract definition of a basic camera mounted on a Pan-Tilt Unit (PTU).
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.examples.camera.ApogyExamplesCameraPackage#getPTUCamera()
 * @model abstract="true"
 * @generated
 */
public interface PTUCamera extends Camera, PanTiltUnit
{
} // PTUCamera
