package ca.gc.asc_csa.apogy.common.geometry.data3d.impl;
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
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.UniquePointsFilter;
import ca.gc.asc_csa.apogy.common.processors.impl.ProcessorImpl;

import edu.wlu.cs.levy.CG.KDTree;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Unique Points Filter</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class UniquePointsFilterImpl extends
		ProcessorImpl<CartesianCoordinatesSet, CartesianCoordinatesSet>
		implements UniquePointsFilter {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected UniquePointsFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DPackage.Literals.UNIQUE_POINTS_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setInput(CartesianCoordinatesSet newInput) {
		super.setInput(newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setOutput(CartesianCoordinatesSet newOutput) {
		super.setOutput(newOutput);
	}

	@Override
	public CartesianCoordinatesSet process(CartesianCoordinatesSet input) throws Exception 
	{
		if (input == null) 
		{
			throw new IllegalArgumentException();
		}

		KDTree kdTree = new KDTree(3);		
		
		CartesianCoordinatesSet output = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet();

		for (CartesianPositionCoordinates point : input.getPoints()) 
		{
			// We look for this point in the kd tree.
			double[] key = new double[] { point.getX(), point.getY(),point.getZ() };

			if (kdTree.search(key) == null) 
			{
				CartesianPositionCoordinates pointCopy = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(point);
				output.getPoints().add(pointCopy);
				kdTree.insert(key, pointCopy);
			}
		}

		setOutput(output);

		return output;
	}

} // UniquePointsFilterImpl
