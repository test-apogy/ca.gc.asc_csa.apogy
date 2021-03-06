package ca.gc.asc_csa.apogy.addons;
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

import org.eclipse.emf.common.util.EList;
import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath;
import ca.gc.asc_csa.apogy.core.PoseProvider;
import ca.gc.asc_csa.apogy.core.invocator.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trajectory3 DTool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A 3D tool used to trace the trajectory of a Variable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.Trajectory3DTool#isPenDown <em>Pen Down</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.Trajectory3DTool#getVariable <em>Variable</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.Trajectory3DTool#getDistanceThreshold <em>Distance Threshold</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.Trajectory3DTool#getTotalDistance <em>Total Distance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.Trajectory3DTool#getPaths <em>Paths</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.Trajectory3DTool#getPoseProvider <em>Pose Provider</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.Trajectory3DTool#getTrajectory3DToolNode <em>Trajectory3 DTool Node</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getTrajectory3DTool()
 * @model
 * @generated
 */
public interface Trajectory3DTool extends Simple3DTool {
	/**
	 * Returns the value of the '<em><b>Pen Down</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pen Down</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Whether of not the trajectory is traced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pen Down</em>' attribute.
	 * @see #setPenDown(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getTrajectory3DTool_PenDown()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='TRAJECTORY_3D_TOOL'"
	 * @generated
	 */
	boolean isPenDown();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.Trajectory3DTool#isPenDown <em>Pen Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pen Down</em>' attribute.
	 * @see #isPenDown()
	 * @generated
	 */
	void setPenDown(boolean value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The Apogy System being displayed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getTrajectory3DTool_Variable()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='TRAJECTORY_3D_TOOL'"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.Trajectory3DTool#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Distance Threshold</b></em>' attribute.
	 * The default value is <code>"0.01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Minimum distance used to trigger a new point being accepted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distance Threshold</em>' attribute.
	 * @see #setDistanceThreshold(double)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getTrajectory3DTool_DistanceThreshold()
	 * @model default="0.01" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='TRAJECTORY_3D_TOOL' apogy_units='m'"
	 * @generated
	 */
	double getDistanceThreshold();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.Trajectory3DTool#getDistanceThreshold <em>Distance Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Threshold</em>' attribute.
	 * @see #getDistanceThreshold()
	 * @generated
	 */
	void setDistanceThreshold(double value);

	/**
	 * Returns the value of the '<em><b>Total Distance</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Distance</em>' attribute.
	 * @see #setTotalDistance(double)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getTrajectory3DTool_TotalDistance()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' propertyCategory='TRAJECTORY_3D_TOOL' apogy_units='m'"
	 * @generated
	 */
	double getTotalDistance();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.Trajectory3DTool#getTotalDistance <em>Total Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Distance</em>' attribute.
	 * @see #getTotalDistance()
	 * @generated
	 */
	void setTotalDistance(double value);

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paths</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The  WayPointPath currently recorded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getTrajectory3DTool_Paths()
	 * @model containment="true"
	 * @generated
	 */
	EList<WayPointPath> getPaths();

	/**
	 * Returns the value of the '<em><b>Pose Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pose Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The pose provide providing pose data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pose Provider</em>' reference.
	 * @see #setPoseProvider(PoseProvider)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getTrajectory3DTool_PoseProvider()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' property='Readonly' propertyCategory='TRAJECTORY_3D_TOOL'"
	 * @generated
	 */
	PoseProvider getPoseProvider();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.Trajectory3DTool#getPoseProvider <em>Pose Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pose Provider</em>' reference.
	 * @see #getPoseProvider()
	 * @generated
	 */
	void setPoseProvider(PoseProvider value);

	/**
	 * Returns the value of the '<em><b>Trajectory3 DTool Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.addons.Trajectory3DToolNode#getTrajectory3DTool <em>Trajectory3 DTool</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trajectory3 DTool Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trajectory3 DTool Node</em>' reference.
	 * @see #setTrajectory3DToolNode(Trajectory3DToolNode)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getTrajectory3DTool_Trajectory3DToolNode()
	 * @see ca.gc.asc_csa.apogy.addons.Trajectory3DToolNode#getTrajectory3DTool
	 * @model opposite="trajectory3DTool" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' property='Readonly' propertyCategory='TRAJECTORY_3D_TOOL'"
	 * @generated
	 */
	Trajectory3DToolNode getTrajectory3DToolNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.Trajectory3DTool#getTrajectory3DToolNode <em>Trajectory3 DTool Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trajectory3 DTool Node</em>' reference.
	 * @see #getTrajectory3DToolNode()
	 * @generated
	 */
	void setTrajectory3DToolNode(Trajectory3DToolNode value);

} // Trajectory3DTool
