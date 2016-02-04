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

import org.eclipse.emf.common.util.EList;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Displays List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * DisplaysList
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.DisplaysList#getDisplaysListsContainer <em>Displays Lists Container</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.DisplaysList#getDisplays <em>Displays</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getDisplaysList()
 * @model
 * @generated
 */
public interface DisplaysList extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Displays Lists Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.DisplaysListsContainer#getDisplays <em>Displays</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Displays Lists Container</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Displays Lists Container</em>' container reference.
	 * @see #setDisplaysListsContainer(DisplaysListsContainer)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getDisplaysList_DisplaysListsContainer()
	 * @see ca.gc.asc_csa.apogy.core.invocator.DisplaysListsContainer#getDisplays
	 * @model opposite="displays" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  DisplaysListsContainer getDisplaysListsContainer();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.DisplaysList#getDisplaysListsContainer <em>Displays Lists Container</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displays Lists Container</em>' container reference.
	 * @see #getDisplaysListsContainer()
	 * @generated
	 */
  void setDisplaysListsContainer(DisplaysListsContainer value);

  /**
	 * Returns the value of the '<em><b>Displays</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.invocator.AbstractDisplay}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractDisplay#getDisplaysList <em>Displays List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Displays</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Displays</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getDisplaysList_Displays()
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractDisplay#getDisplaysList
	 * @model opposite="displaysList" containment="true"
	 * @generated
	 */
  EList<AbstractDisplay> getDisplays();

} // DisplaysList
