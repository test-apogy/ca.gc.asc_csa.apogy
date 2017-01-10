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

import javax.vecmath.Color3f;

import ca.gc.asc_csa.apogy.core.environment.surface.FeaturesOfInterestMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Features Of Interest Map Layer Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Presentation properties for a FeaturesOfInterestMapLayer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.FeaturesOfInterestMapLayerPresentation#getFeaturesOfInterestMapLayer <em>Features Of Interest Map Layer</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.FeaturesOfInterestMapLayerPresentation#getFeatureOfInterestRadius <em>Feature Of Interest Radius</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.FeaturesOfInterestMapLayerPresentation#getFeatureOfInterestColor <em>Feature Of Interest Color</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage#getFeaturesOfInterestMapLayerPresentation()
 * @model
 * @generated
 */
public interface FeaturesOfInterestMapLayerPresentation extends MapAnnotation, RectangularRegionProvider {
	/**
	 * Returns the value of the '<em><b>Features Of Interest Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features Of Interest Map Layer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features Of Interest Map Layer</em>' reference.
	 * @see #setFeaturesOfInterestMapLayer(FeaturesOfInterestMapLayer)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage#getFeaturesOfInterestMapLayerPresentation_FeaturesOfInterestMapLayer()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='FOI_PROPERTIES'"
	 * @generated
	 */
	FeaturesOfInterestMapLayer getFeaturesOfInterestMapLayer();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.FeaturesOfInterestMapLayerPresentation#getFeaturesOfInterestMapLayer <em>Features Of Interest Map Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Features Of Interest Map Layer</em>' reference.
	 * @see #getFeaturesOfInterestMapLayer()
	 * @generated
	 */
	void setFeaturesOfInterestMapLayer(FeaturesOfInterestMapLayer value);

	/**
	 * Returns the value of the '<em><b>Feature Of Interest Radius</b></em>' attribute.
	 * The default value is <code>"0.25"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Of Interest Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Of Interest Radius</em>' attribute.
	 * @see #setFeatureOfInterestRadius(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage#getFeaturesOfInterestMapLayerPresentation_FeatureOfInterestRadius()
	 * @model default="0.25" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='FOI_PROPERTIES' apogy_units='m'"
	 * @generated
	 */
	double getFeatureOfInterestRadius();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.FeaturesOfInterestMapLayerPresentation#getFeatureOfInterestRadius <em>Feature Of Interest Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Of Interest Radius</em>' attribute.
	 * @see #getFeatureOfInterestRadius()
	 * @generated
	 */
	void setFeatureOfInterestRadius(double value);

	/**
	 * Returns the value of the '<em><b>Feature Of Interest Color</b></em>' attribute.
	 * The default value is <code>"0.0,0.0,1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The color of the vector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Of Interest Color</em>' attribute.
	 * @see #setFeatureOfInterestColor(Color3f)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage#getFeaturesOfInterestMapLayerPresentation_FeatureOfInterestColor()
	 * @model default="0.0,0.0,1.0" unique="false" dataType="ca.gc.asc_csa.apogy.core.environment.surface.ui.Color3f"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='FOI_PROPERTIES'"
	 * @generated
	 */
	Color3f getFeatureOfInterestColor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.FeaturesOfInterestMapLayerPresentation#getFeatureOfInterestColor <em>Feature Of Interest Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Of Interest Color</em>' attribute.
	 * @see #getFeatureOfInterestColor()
	 * @generated
	 */
	void setFeatureOfInterestColor(Color3f value);

} // FeaturesOfInterestMapLayerPresentation
