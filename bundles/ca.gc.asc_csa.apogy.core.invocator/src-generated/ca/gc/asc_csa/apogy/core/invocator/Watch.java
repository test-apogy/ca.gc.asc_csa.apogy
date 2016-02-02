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

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.emf.TreeRootNode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Watch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Watch
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.Watch#getWatchesList <em>Watches List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.Watch#getVariable <em>Variable</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.Watch#getTypeMemberReferenceTreeElement <em>Type Member Reference Tree Element</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.Watch#getTreeRootNode <em>Tree Root Node</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getWatch()
 * @model
 * @generated
 */
public interface Watch extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Watches List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.WatchesList#getWatches <em>Watches</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Watches List</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Watches List</em>' container reference.
	 * @see #setWatchesList(WatchesList)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getWatch_WatchesList()
	 * @see ca.gc.asc_csa.apogy.core.invocator.WatchesList#getWatches
	 * @model opposite="watches" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  WatchesList getWatchesList();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.Watch#getWatchesList <em>Watches List</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watches List</em>' container reference.
	 * @see #getWatchesList()
	 * @generated
	 */
  void setWatchesList(WatchesList value);

  /**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getWatch_Variable()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  Variable getVariable();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.Watch#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
  void setVariable(Variable value);

  /**
	 * Returns the value of the '<em><b>Type Member Reference Tree Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Member Reference Tree Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Member Reference Tree Element</em>' containment reference.
	 * @see #setTypeMemberReferenceTreeElement(TypeMemberReferenceTreeElement)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getWatch_TypeMemberReferenceTreeElement()
	 * @model containment="true"
	 * @generated
	 */
  TypeMemberReferenceTreeElement getTypeMemberReferenceTreeElement();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.Watch#getTypeMemberReferenceTreeElement <em>Type Member Reference Tree Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Member Reference Tree Element</em>' containment reference.
	 * @see #getTypeMemberReferenceTreeElement()
	 * @generated
	 */
  void setTypeMemberReferenceTreeElement(TypeMemberReferenceTreeElement value);

  /**
	 * Returns the value of the '<em><b>Tree Root Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tree Root Node</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Tree Root Node</em>' containment reference.
	 * @see #setTreeRootNode(TreeRootNode)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getWatch_TreeRootNode()
	 * @model containment="true"
	 * @generated
	 */
  TreeRootNode getTreeRootNode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.Watch#getTreeRootNode <em>Tree Root Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree Root Node</em>' containment reference.
	 * @see #getTreeRootNode()
	 * @generated
	 */
	void setTreeRootNode(TreeRootNode value);

} // Watch
