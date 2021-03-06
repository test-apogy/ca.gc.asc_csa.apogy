package ca.gc.asc_csa.apogy.core.invocator;
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
 * A representation of the model object '<em><b>Type Member Reference List Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#getChild <em>Child</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#getParent <em>Parent</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#isRoot <em>Root</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#getLeafElement <em>Leaf Element</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#isLeaf <em>Leaf</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#getSubSegmentsCount <em>Sub Segments Count</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypeMemberReferenceListElement()
 * @model
 * @generated
 */
public interface TypeMemberReferenceListElement extends TypeMemberReference
{

  /**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Child</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(TypeMemberReferenceListElement)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypeMemberReferenceListElement_Child()
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  TypeMemberReferenceListElement getChild();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
  void setChild(TypeMemberReferenceListElement value);

  /**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TypeMemberReferenceListElement)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypeMemberReferenceListElement_Parent()
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#getChild
	 * @model opposite="child" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  TypeMemberReferenceListElement getParent();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
  void setParent(TypeMemberReferenceListElement value);

  /**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypeMemberReferenceListElement_Root()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' get='<%ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement%> _parent = this.getParent();\nreturn <%com.google.common.base.Objects%>.equal(_parent, null);'"
	 * @generated
	 */
  boolean isRoot();

  /**
	 * Returns the value of the '<em><b>Root Element</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Element</em>' reference.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypeMemberReferenceListElement_RootElement()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' get='<%ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement%> _xifexpression = null;\nboolean _isRoot = this.isRoot();\nif (_isRoot)\n{\n\treturn this;\n}\nelse\n{\n\t<%ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement%> _parent = this.getParent();\n\t_xifexpression = _parent.getRootElement();\n}\nreturn _xifexpression;'"
	 * @generated
	 */
  TypeMemberReferenceListElement getRootElement();

  /**
	 * Returns the value of the '<em><b>Leaf Element</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Leaf Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Leaf Element</em>' reference.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypeMemberReferenceListElement_LeafElement()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' get='<%ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement%> _xifexpression = null;\nboolean _isLeaf = this.isLeaf();\nif (_isLeaf)\n{\n\treturn this;\n}\nelse\n{\n\t<%ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement%> _child = this.getChild();\n\t_xifexpression = _child.getLeafElement();\n}\nreturn _xifexpression;'"
	 * @generated
	 */
  TypeMemberReferenceListElement getLeafElement();

  /**
	 * Returns the value of the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Leaf</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Leaf</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypeMemberReferenceListElement_Leaf()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' get='<%ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement%> _child = this.getChild();\nreturn <%com.google.common.base.Objects%>.equal(_child, null);'"
	 * @generated
	 */
  boolean isLeaf();

		/**
	 * Returns the value of the '<em><b>Sub Segments Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the number of sub-segments.
	 * @return Number of segment under this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Segments Count</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypeMemberReferenceListElement_SubSegmentsCount()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getSubSegmentsCount();
} // TypeMemberReferenceListElement
