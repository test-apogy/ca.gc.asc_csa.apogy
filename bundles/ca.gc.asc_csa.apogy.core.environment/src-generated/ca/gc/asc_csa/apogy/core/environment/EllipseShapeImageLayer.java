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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ellipse Shape Image Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An image map layer representing an ellipse.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.EllipseShapeImageLayer#getEllipseWidth <em>Ellipse Width</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.EllipseShapeImageLayer#getEllipseHeight <em>Ellipse Height</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.EllipseShapeImageLayer#isShowCenterLines <em>Show Center Lines</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getEllipseShapeImageLayer()
 * @model
 * @generated
 */
public interface EllipseShapeImageLayer extends AbstractShapeImageLayer {
	/**
	 * Returns the value of the '<em><b>Ellipse Width</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ellipse Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ellipse Width</em>' attribute.
	 * @see #setEllipseWidth(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getEllipseShapeImageLayer_EllipseWidth()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='ELLIPSE_SETTINGS' apogy_units='m'"
	 * @generated
	 */
	double getEllipseWidth();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.EllipseShapeImageLayer#getEllipseWidth <em>Ellipse Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipse Width</em>' attribute.
	 * @see #getEllipseWidth()
	 * @generated
	 */
	void setEllipseWidth(double value);

	/**
	 * Returns the value of the '<em><b>Ellipse Height</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ellipse Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ellipse Height</em>' attribute.
	 * @see #setEllipseHeight(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getEllipseShapeImageLayer_EllipseHeight()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='ELLIPSE_SETTINGS' apogy_units='m'"
	 * @generated
	 */
	double getEllipseHeight();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.EllipseShapeImageLayer#getEllipseHeight <em>Ellipse Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipse Height</em>' attribute.
	 * @see #getEllipseHeight()
	 * @generated
	 */
	void setEllipseHeight(double value);

	/**
	 * Returns the value of the '<em><b>Show Center Lines</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Center Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Center Lines</em>' attribute.
	 * @see #setShowCenterLines(boolean)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getEllipseShapeImageLayer_ShowCenterLines()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='ELLIPSE_SETTINGS'"
	 * @generated
	 */
	boolean isShowCenterLines();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.EllipseShapeImageLayer#isShowCenterLines <em>Show Center Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Center Lines</em>' attribute.
	 * @see #isShowCenterLines()
	 * @generated
	 */
	void setShowCenterLines(boolean value);

} // EllipseShapeImageLayer
