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
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Program.
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.Program#getProgramsGroup <em>Programs Group</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.Program#getInvocatorSession <em>Invocator Session</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getProgram()
 * @model abstract="true"
 * @generated
 */
public interface Program extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Programs Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Programs Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs Group</em>' container reference.
	 * @see #setProgramsGroup(ProgramsGroup)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getProgram_ProgramsGroup()
	 * @see ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup#getPrograms
	 * @model opposite="programs" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	ProgramsGroup getProgramsGroup();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.Program#getProgramsGroup <em>Programs Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programs Group</em>' container reference.
	 * @see #getProgramsGroup()
	 * @generated
	 */
	void setProgramsGroup(ProgramsGroup value);

		/**
	 * Returns the value of the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invocator Session</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocator Session</em>' reference.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getProgram_InvocatorSession()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' property='None' get='<%ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup%> _programsGroup = this.getProgramsGroup();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_programsGroup, null);\nif (_equals)\n{\n\treturn null;\n}\nelse\n{\n\t<%ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup%> _programsGroup_1 = this.getProgramsGroup();\n\treturn _programsGroup_1.getInvocatorSession();\n}'"
	 * @generated
	 */
  InvocatorSession getInvocatorSession();

} // Program
