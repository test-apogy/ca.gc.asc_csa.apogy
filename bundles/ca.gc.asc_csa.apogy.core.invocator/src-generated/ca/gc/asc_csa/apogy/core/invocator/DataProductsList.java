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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Products List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.DataProductsList#getDataProductsListsContainer <em>Data Products Lists Container</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.DataProductsList#getOperationCallResultsList <em>Operation Call Results List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.DataProductsList#getInvocatorSession <em>Invocator Session</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getDataProductsList()
 * @model
 * @generated
 */
public interface DataProductsList extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Data Products Lists Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer#getDataProductsList <em>Data Products List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Products Lists Container</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Products Lists Container</em>' container reference.
	 * @see #setDataProductsListsContainer(DataProductsListsContainer)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getDataProductsList_DataProductsListsContainer()
	 * @see ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer#getDataProductsList
	 * @model opposite="dataProductsList" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  DataProductsListsContainer getDataProductsListsContainer();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.DataProductsList#getDataProductsListsContainer <em>Data Products Lists Container</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Products Lists Container</em>' container reference.
	 * @see #getDataProductsListsContainer()
	 * @generated
	 */
  void setDataProductsListsContainer(DataProductsListsContainer value);

  /**
	 * Returns the value of the '<em><b>Operation Call Results List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList#getDataProductsList <em>Data Products List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation Call Results List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Call Results List</em>' containment reference.
	 * @see #setOperationCallResultsList(OperationCallResultsList)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getDataProductsList_OperationCallResultsList()
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList#getDataProductsList
	 * @model opposite="dataProductsList" containment="true" required="true"
	 * @generated
	 */
  OperationCallResultsList getOperationCallResultsList();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.DataProductsList#getOperationCallResultsList <em>Operation Call Results List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Call Results List</em>' containment reference.
	 * @see #getOperationCallResultsList()
	 * @generated
	 */
  void setOperationCallResultsList(OperationCallResultsList value);

  /**
	 * Returns the value of the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invocator Session</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocator Session</em>' reference.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getDataProductsList_InvocatorSession()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' property='None' get='<%ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer%> _dataProductsListsContainer = this.getDataProductsListsContainer();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_dataProductsListsContainer, null);\nif (_equals)\n{\n\treturn null;\n}\nelse\n{\n\t<%ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer%> _dataProductsListsContainer_1 = this.getDataProductsListsContainer();\n\treturn _dataProductsListsContainer_1.getInvocatorSession();\n}'"
	 * @generated
	 */
	InvocatorSession getInvocatorSession();

} // DataProductsList
