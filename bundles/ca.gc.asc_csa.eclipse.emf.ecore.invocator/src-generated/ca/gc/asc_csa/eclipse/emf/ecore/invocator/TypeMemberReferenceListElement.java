/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Member Reference List Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement#getChild <em>Child</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement#getParent <em>Parent</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement#isRoot <em>Root</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement#getLeafElement <em>Leaf Element</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement#isLeaf <em>Leaf</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement#getSubSegmentsCount <em>Sub Segments Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getTypeMemberReferenceListElement()
 * @model
 * @generated
 */
public interface TypeMemberReferenceListElement extends TypeMemberReference
{

  /**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Child</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(TypeMemberReferenceListElement)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getTypeMemberReferenceListElement_Child()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  TypeMemberReferenceListElement getChild();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
  void setChild(TypeMemberReferenceListElement value);

  /**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TypeMemberReferenceListElement)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getTypeMemberReferenceListElement_Parent()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement#getChild
	 * @model opposite="child" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  TypeMemberReferenceListElement getParent();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement#getParent <em>Parent</em>}' container reference.
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
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getTypeMemberReferenceListElement_Root()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' get='<%ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement%> _parent = this.getParent();\nreturn <%com.google.common.base.Objects%>.equal(_parent, null);'"
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
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getTypeMemberReferenceListElement_RootElement()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' get='<%ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement%> _xifexpression = null;\nboolean _isRoot = this.isRoot();\nif (_isRoot)\n{\n\treturn this;\n}\nelse\n{\n\t<%ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement%> _parent = this.getParent();\n\t_xifexpression = _parent.getRootElement();\n}\nreturn _xifexpression;'"
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
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getTypeMemberReferenceListElement_LeafElement()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' get='<%ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement%> _xifexpression = null;\nboolean _isLeaf = this.isLeaf();\nif (_isLeaf)\n{\n\treturn this;\n}\nelse\n{\n\t<%ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement%> _child = this.getChild();\n\t_xifexpression = _child.getLeafElement();\n}\nreturn _xifexpression;'"
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
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getTypeMemberReferenceListElement_Leaf()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' get='<%ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement%> _child = this.getChild();\nreturn <%com.google.common.base.Objects%>.equal(_child, null);'"
	 * @generated
	 */
  boolean isLeaf();

		/**
	 * Returns the value of the '<em><b>Sub Segments Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the number of sub-segments.
	 * @return Number of segment under this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Segments Count</em>' attribute.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getTypeMemberReferenceListElement_SubSegmentsCount()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getSubSegmentsCount();
} // TypeMemberReferenceListElement
