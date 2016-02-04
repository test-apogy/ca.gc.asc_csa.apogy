package ca.gc.asc_csa.apogy.core.invocator.edit;
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

import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementation;

public class EMFEcoreInvocatorEditUtilities {

	private EMFEcoreInvocatorEditUtilities() {
	}

	final public static String getName(AbstractTypeImplementation implementation){
		String str;
		if (implementation instanceof VariableImplementation) {
			VariableImplementation variableImplementation = (VariableImplementation) implementation;
			str = variableImplementation.getVariable().getName();
		} else {
			TypeMemberImplementation typeMemberImplementation = (TypeMemberImplementation) implementation;
			str = typeMemberImplementation.getTypeMember().getName();
		}
		return str;
	}

	final public static String getInterfaceName(AbstractTypeImplementation implementation, boolean fullyQualified){
		String str = "";
		if (implementation instanceof VariableImplementation) {
			VariableImplementation variableImplementation = (VariableImplementation) implementation;

			if (variableImplementation.getVariable().getVariableType()
					.getInterfaceClass() != null) {
				
				str = fullyQualified ? 
					variableImplementation.getVariable()
						.getVariableType().getInterfaceClass()
						.getInstanceTypeName() : 
					variableImplementation
						.getVariable().getVariableType().getInterfaceClass()
						.getName();
							
			}
		} else {
			TypeMemberImplementation typeMemberImplementation = (TypeMemberImplementation) implementation;

			if (typeMemberImplementation.getTypeMember()
					.getMemberType().getInterfaceClass() != null) {
				str = fullyQualified ? 						
					typeMemberImplementation.getTypeMember()
						.getMemberType().getInterfaceClass().getInstanceTypeName():
					typeMemberImplementation.getTypeMember()
							.getMemberType().getInterfaceClass().getName();
			}
		}
		return str;
	}
	
	final public static String getImplementationName(AbstractTypeImplementation implementation, boolean fullyQualified){		
		String str = "";
		if (implementation.getImplementationClass() != null) {
			str = fullyQualified ? 
					implementation.getImplementationClass().getInstanceTypeName():
					implementation.getImplementationClass().getName(); 
		}
		return str;
	}	
}