/**
 * Canadian Space Agency 2008.
 *
 * $Id: RasterPointCloudToCartesianCoordinatesSetImpl.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage;
import org.eclipse.symphony.common.geometry.data3d.RasterPointCloud;
import org.eclipse.symphony.common.geometry.data3d.RasterPointCloudToCartesianCoordinatesSet;
import org.eclipse.symphony.common.processors.impl.ProcessorImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Raster Point Cloud To Cartesian Coordinates Set</b></em>'. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class RasterPointCloudToCartesianCoordinatesSetImpl extends
		ProcessorImpl<RasterPointCloud, CartesianCoordinatesSet> implements
		RasterPointCloudToCartesianCoordinatesSet {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RasterPointCloudToCartesianCoordinatesSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonGeometryData3DPackage.Literals.RASTER_POINT_CLOUD_TO_CARTESIAN_COORDINATES_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setInput(RasterPointCloud newInput) {
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
	public CartesianCoordinatesSet process(RasterPointCloud input)
			throws Exception {

		if (input == null) {
			throw new IllegalArgumentException("Input is null");
		}

		CartesianCoordinatesSet points = Symphony__CommonGeometryData3DFactory.eINSTANCE
				.createCartesianCoordinatesSet();

		for (int i = 0; i < input.getRows(); i++) {
			for (int j = 0; j < input.getColumns(); j++) {
				points.getPoints().add(input.getPoint(i, j));
			}
		}

		setOutput(points);

		return points;
	}
} // RasterPointCloudToCartesianCoordinatesSetImpl
