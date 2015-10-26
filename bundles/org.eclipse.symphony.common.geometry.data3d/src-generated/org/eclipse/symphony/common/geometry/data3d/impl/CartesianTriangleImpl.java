/**
 * Canadian Space Agency 2007.
 *
 * $Id: CartesianTriangleImpl.java,v 1.3.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangle;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage;

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
		return Symphony__CommonGeometryData3DPackage.Literals.CARTESIAN_TRIANGLE;
	}
} // CartesianTriangleImpl
