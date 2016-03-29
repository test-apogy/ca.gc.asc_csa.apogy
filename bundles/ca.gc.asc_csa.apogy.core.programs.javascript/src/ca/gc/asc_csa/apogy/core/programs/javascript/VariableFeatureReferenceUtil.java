/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mathieu Larose (mathieu.larose@savoirfairelinux.com)
 *     Savoir-faire Linux - Initial API and implementation
 */

package ca.gc.asc_csa.apogy.core.programs.javascript;

import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFactory;
import ca.gc.asc_csa.apogy.common.emf.ListFeatureNode;
import ca.gc.asc_csa.apogy.common.emf.ListRootNode;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement;
import ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference;

public class VariableFeatureReferenceUtil {

	/**
	 * Clones a VariableFeatureReference
	 * 
	 * @param source
	 *            source VariableFeatureReference
	 * @return a new VariableFeatureReference based on the source
	 */
	public static VariableFeatureReference clone(VariableFeatureReference source) {
		VariableFeatureReference destination = ApogyCoreInvocatorFactory.eINSTANCE.createVariableFeatureReference();

		destination.setVariable(source.getVariable());

		ListRootNode srcFeatureRoot = source.getFeatureRoot();
		if (srcFeatureRoot != null) {
			ListRootNode dstFeatureRoot = ApogyCommonEMFFactory.eINSTANCE.createListRootNode();
			dstFeatureRoot.setSourceClass(srcFeatureRoot.getSourceClass());

			AbstractFeatureListNode srcCurrent = srcFeatureRoot;
			AbstractFeatureListNode dstCurrent = dstFeatureRoot;

			while (srcCurrent.getChild() != null) {
				ListFeatureNode srcChild = (ListFeatureNode) srcCurrent.getChild();
				ListFeatureNode dstChild = ApogyCommonEMFFactory.eINSTANCE.createListFeatureNode();
				dstChild.setStructuralFeature(srcChild.getStructuralFeature());
				dstCurrent.setChild(dstChild);

				srcCurrent = srcChild;
				dstCurrent = dstChild;
			}

			destination.setFeatureRoot(dstFeatureRoot);
		}

		if (source.getTypeMemberReferenceListElement() != null) {
			TypeMemberReferenceListElement dstTypeMemberReferenceListElement = ApogyCoreInvocatorFactory.eINSTANCE.createTypeMemberReferenceListElement();

			TypeMemberReferenceListElement srcCurrent = source.getTypeMemberReferenceListElement();
			TypeMemberReferenceListElement dstCurrent = dstTypeMemberReferenceListElement;
			dstCurrent.setTypeMember(srcCurrent.getTypeMember());

			while (srcCurrent.getChild() != null) {
				TypeMemberReferenceListElement srcChild = srcCurrent.getChild();
				TypeMemberReferenceListElement dstChild = ApogyCoreInvocatorFactory.eINSTANCE.createTypeMemberReferenceListElement();
				dstChild.setTypeMember(srcChild.getTypeMember());
				dstCurrent.setChild(dstChild);

				srcCurrent = srcChild;
				dstCurrent = dstChild;
			}

			destination.setTypeMemberReferenceListElement(dstTypeMemberReferenceListElement);
		}

		return destination;
	}

	/**
	 * Creates an {@OperationCall} from a {@VariableFeatureReference}
	 * 
	 * @param source
	 *            source VariableFeatureReference
	 * @return an {@OperationCall} from the source VariableFeatureReference
	 */
	public static OperationCall toOperationCall(VariableFeatureReference source) {
		source = clone(source);
		OperationCall operationCall = ApogyCoreInvocatorFactory.eINSTANCE.createOperationCall();
		operationCall.setVariable(source.getVariable());
		operationCall.setTypeMemberReferenceListElement(source.getTypeMemberReferenceListElement());
		operationCall.setFeatureRoot(source.getFeatureRoot());
		return operationCall;
	}
}
