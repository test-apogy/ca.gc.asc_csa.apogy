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
package ca.gc.asc_csa.apogy.core.environment.surface.ui;

import java.util.List;

import org.jfree.chart.annotations.AbstractXYAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Presentation properties for an ImageMapLayer displayed on the MapView.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage#getMapAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface MapAnnotation extends MapViewItemPresentation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  TheXYPlot being used by MapView.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.apogy.core.environment.surface.ui.List<ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractXYAnnotation>" unique="false" many="false"
	 * @generated
	 */
	List<AbstractXYAnnotation> getXYShapeAnnotation();

} // MapAnnotation
