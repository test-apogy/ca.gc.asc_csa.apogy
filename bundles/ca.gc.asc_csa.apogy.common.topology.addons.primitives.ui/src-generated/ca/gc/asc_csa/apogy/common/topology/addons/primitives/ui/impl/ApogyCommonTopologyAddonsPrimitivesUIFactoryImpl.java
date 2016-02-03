package ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.impl;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.LabelPresentation;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.SpherePrimitivePresentation;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.ApogyCommonTopologyAddonsPrimitivesUIFactory;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.ApogyCommonTopologyAddonsPrimitivesUIPackage;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.VectorPresentation;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.WayPointPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonTopologyAddonsPrimitivesUIFactoryImpl extends EFactoryImpl implements ApogyCommonTopologyAddonsPrimitivesUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCommonTopologyAddonsPrimitivesUIFactory init() {
		try {
			ApogyCommonTopologyAddonsPrimitivesUIFactory theApogyCommonTopologyAddonsPrimitivesUIFactory = (ApogyCommonTopologyAddonsPrimitivesUIFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonTopologyAddonsPrimitivesUIPackage.eNS_URI);
			if (theApogyCommonTopologyAddonsPrimitivesUIFactory != null) {
				return theApogyCommonTopologyAddonsPrimitivesUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonTopologyAddonsPrimitivesUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonTopologyAddonsPrimitivesUIFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ApogyCommonTopologyAddonsPrimitivesUIPackage.VECTOR_PRESENTATION: return createVectorPresentation();
			case ApogyCommonTopologyAddonsPrimitivesUIPackage.WAY_POINT_PRESENTATION: return createWayPointPresentation();
			case ApogyCommonTopologyAddonsPrimitivesUIPackage.LABEL_PRESENTATION: return createLabelPresentation();
			case ApogyCommonTopologyAddonsPrimitivesUIPackage.SPHERE_PRIMITIVE_PRESENTATION: return createSpherePrimitivePresentation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorPresentation createVectorPresentation() {
		VectorPresentationImpl vectorPresentation = new VectorPresentationImpl();
		return vectorPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WayPointPresentation createWayPointPresentation() {
		WayPointPresentationImpl wayPointPresentation = new WayPointPresentationImpl();
		return wayPointPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelPresentation createLabelPresentation() {
		LabelPresentationImpl labelPresentation = new LabelPresentationImpl();
		return labelPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpherePrimitivePresentation createSpherePrimitivePresentation() {
		SpherePrimitivePresentationImpl spherePrimitivePresentation = new SpherePrimitivePresentationImpl();
		return spherePrimitivePresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonTopologyAddonsPrimitivesUIPackage getApogyCommonTopologyAddonsPrimitivesUIPackage() {
		return (ApogyCommonTopologyAddonsPrimitivesUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCommonTopologyAddonsPrimitivesUIPackage getPackage() {
		return ApogyCommonTopologyAddonsPrimitivesUIPackage.eINSTANCE;
	}

} //ApogyCommonTopologyAddonsPrimitivesUIFactoryImpl
