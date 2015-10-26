/**
 * Canadian Space Agency 2008.
 *
 * $Id: UniquePointsFilterImpl.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Data3dFacade;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage;
import org.eclipse.symphony.common.geometry.data3d.UniquePointsFilter;
import org.eclipse.symphony.common.processors.impl.ProcessorImpl;

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
		return Symphony__CommonGeometryData3DPackage.Literals.UNIQUE_POINTS_FILTER;
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
	public CartesianCoordinatesSet process(CartesianCoordinatesSet input)
			throws Exception {

		if (input == null) {
			throw new IllegalArgumentException();
		}

		KDTree kdTree = new KDTree(3);

		CartesianCoordinatesSet output = Symphony__CommonGeometryData3DFactory.eINSTANCE
				.createCartesianCoordinatesSet();

		for (CartesianPositionCoordinates point : input.getPoints()) {
			// We look for this point in the kd tree.
			double[] key = new double[] { point.getX(), point.getY(),
					point.getZ() };

			if (kdTree.search(key) == null) {
				CartesianPositionCoordinates pointCopy = Data3dFacade.INSTANCE
						.createCartesianPositionCoordinates(point);
				output.getPoints().add(pointCopy);
				kdTree.insert(key, pointCopy);
			}
		}

		setOutput(output);

		return output;
	}

} // UniquePointsFilterImpl
