package ca.gc.asc_csa.apogy.core;
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

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.core.invocator.TypeMember;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Assembly Link</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.AssemblyLink#getParentTypeMember <em>Parent Type Member</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.AssemblyLink#getSubSystemTypeMember <em>Sub System Type Member</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.AssemblyLink#getParentConnectionPoint <em>Parent Connection Point</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.AssemblyLink#getTransformationMatrix <em>Transformation Matrix</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.AssemblyLink#getGeometryNode <em>Geometry Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.AssemblyLink#getParentInstance <em>Parent Instance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.AssemblyLink#getSubSystemInstance <em>Sub System Instance</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getAssemblyLink()
 * @model
 * @generated
 */
public interface AssemblyLink extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Sub System Type Member</b></em>'
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub System Type Member</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc --> <!-- begin-model-doc --> The destination type
	 * member of the link. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Sub System Type Member</em>' reference.
	 * @see #setSubSystemTypeMember(TypeMember)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getAssemblyLink_SubSystemTypeMember()
	 * @model required="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel propertyCategory='LINK_CHILD'"
	 * @generated
	 */
	TypeMember getSubSystemTypeMember();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.AssemblyLink#getSubSystemTypeMember <em>Sub System Type Member</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Sub System Type Member</em>' reference.
	 * @see #getSubSystemTypeMember()
	 * @generated
	 */
	void setSubSystemTypeMember(TypeMember value);

	/**
	 * Returns the value of the '<em><b>Parent Type Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type Member</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc --> <!-- begin-model-doc --> The parent type member of
	 * the link. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Parent Type Member</em>' reference.
	 * @see #setParentTypeMember(TypeMember)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getAssemblyLink_ParentTypeMember()
	 * @model required="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel propertyCategory='LINK_PARENT'"
	 * @generated
	 */
	TypeMember getParentTypeMember();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.AssemblyLink#getParentTypeMember <em>Parent Type Member</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Member</em>' reference.
	 * @see #getParentTypeMember()
	 * @generated
	 */
	void setParentTypeMember(TypeMember value);

	/**
	 * Returns the value of the '<em><b>Parent Connection Point</b></em>'
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Connection Point</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc --> <!-- begin-model-doc --> The connection on the
	 * parent member of the link. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Parent Connection Point</em>' reference.
	 * @see #setParentConnectionPoint(ConnectionPoint)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getAssemblyLink_ParentConnectionPoint()
	 * @model required="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel propertyCategory='LINK_PARENT'"
	 * @generated
	 */
	ConnectionPoint getParentConnectionPoint();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.AssemblyLink#getParentConnectionPoint <em>Parent Connection Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Connection Point</em>' reference.
	 * @see #getParentConnectionPoint()
	 * @generated
	 */
	void setParentConnectionPoint(ConnectionPoint value);

	/**
	 * Returns the value of the '<em><b>Transformation Matrix</b></em>'
	 * containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Matrix</em>' containment
	 * reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc --> <!-- begin-model-doc --> The transformation to
	 * position the subSystem relative to the connection point. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Transformation Matrix</em>' containment
	 *         reference.
	 * @see #setTransformationMatrix(Matrix4x4)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getAssemblyLink_TransformationMatrix()
	 * @model containment="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel propertyCategory='LINK_TOPOLOGY'"
	 * @generated
	 */
	Matrix4x4 getTransformationMatrix();

	/**
	 * Sets the value of the '
	 * {@link ca.gc.asc_csa.apogy.core.AssemblyLink#getTransformationMatrix
	 * <em>Transformation Matrix</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Transformation Matrix</em>'
	 *            containment reference.
	 * @see #getTransformationMatrix()
	 * @generated
	 */
	void setTransformationMatrix(Matrix4x4 value);

	/**
	 * Returns the value of the '<em><b>Geometry Node</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry Node</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc --> <!-- begin-model-doc --> Any geometry topology used
	 * to represent interface hardware. This topology will be attached to the
	 * connection point. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Geometry Node</em>' containment reference.
	 * @see #setGeometryNode(Node)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getAssemblyLink_GeometryNode()
	 * @model containment="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel propertyCategory='LINK_TOPOLOGY'"
	 * @generated
	 */
	Node getGeometryNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.AssemblyLink#getGeometryNode <em>Geometry Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry Node</em>' containment reference.
	 * @see #getGeometryNode()
	 * @generated
	 */
	void setGeometryNode(Node value);

	/**
	 * Returns the value of the '<em><b>Parent Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Instance</em>' reference.
	 * @see #setParentInstance(ApogySystem)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getAssemblyLink_ParentInstance()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='LINK_PARENT'"
	 * @generated
	 */
	ApogySystem getParentInstance();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.AssemblyLink#getParentInstance <em>Parent Instance</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Parent Instance</em>' reference.
	 * @see #getParentInstance()
	 * @generated
	 */
	void setParentInstance(ApogySystem value);

	/**
	 * Returns the value of the '<em><b>Sub System Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub System Instance</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub System Instance</em>' reference.
	 * @see #setSubSystemInstance(ApogySystem)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getAssemblyLink_SubSystemInstance()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='LINK_CHILD'"
	 * @generated
	 */
	ApogySystem getSubSystemInstance();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.AssemblyLink#getSubSystemInstance <em>Sub System Instance</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Sub System Instance</em>' reference.
	 * @see #getSubSystemInstance()
	 * @generated
	 */
	void setSubSystemInstance(ApogySystem value);

} // AssemblyLink
