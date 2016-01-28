package ca.gc.asc_csa.apogy.core.invocator.edit;

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