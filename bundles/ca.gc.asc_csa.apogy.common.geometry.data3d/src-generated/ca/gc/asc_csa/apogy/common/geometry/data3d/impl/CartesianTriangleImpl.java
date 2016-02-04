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

import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangle;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Cartesian Triangle</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class CartesianTriangleImpl extends CartesianPolygonImpl implements
		CartesianTriangle {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	protected CartesianTriangleImpl() {
		super();

		super.eAdapters().add(new Adapter() {

			public Notifier getTarget() {
				return null;
			}

			public boolean isAdapterForType(Object type) {
				return false;
			}

			@SuppressWarnings("unchecked")
			public void notifyChanged(Notification notification) {
				if (notification.getEventType() == Notification.ADD
						|| notification.getEventType() == Notification.ADD_MANY) {

					if (notification.getNewValue() != null) {

						// System.out.println("New value: "
						// + notification.getNewValue().getClass());

						if (notification.getNewValue() instanceof List) {
							List<CartesianPositionCoordinates> newValues = (List<CartesianPositionCoordinates>) notification
									.getNewValue();
							for (CartesianPositionCoordinates point : newValues) {
								vertexAdded(point);
							}
						} else {
							vertexAdded((CartesianPositionCoordinates) notification
									.getNewValue());
						}
					}

				}
			}

			public void setTarget(Notifier newTarget) {
			}

		});

	}

	private void vertexAdded(CartesianPositionCoordinates point) {
		// We make sure there are only three vertices.
		if (getVertices().size() > 3) {
			getVertices().remove(point);
			throw new IllegalArgumentException("This is a triangle!");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DPackage.Literals.CARTESIAN_TRIANGLE;
	}
} // CartesianTriangleImpl
