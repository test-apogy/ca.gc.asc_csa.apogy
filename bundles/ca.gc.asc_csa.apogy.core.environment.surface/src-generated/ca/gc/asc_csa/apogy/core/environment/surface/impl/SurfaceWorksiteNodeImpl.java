/**
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
package ca.gc.asc_csa.apogy.core.environment.surface.impl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;

import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.impl.WorksiteNodeImpl;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.MapsList;
import ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksiteNode;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Surface
 * Worksite Node</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class SurfaceWorksiteNodeImpl extends WorksiteNodeImpl implements SurfaceWorksiteNode {
	private Adapter adapter = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	protected SurfaceWorksiteNodeImpl() {
		super();
		this.eAdapters().add(getAdapter());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogySurfaceEnvironmentPackage.Literals.SURFACE_WORKSITE_NODE;
	}

	private void clearTopology() {
		getChildren().clear();
	}

	protected void addMapsList(final MapsList mapsList) {
		getChildren().add(mapsList.getMapsListNode());
		mapsList.getMapsListNode().setParent(this);
	}

	protected void removeMapsList(final MapsList mapsList) {
		if (mapsList.getMapsListNode() != null) {
			getChildren().remove(mapsList.getMapsListNode());
			mapsList.getMapsListNode().setParent(null);
		}
	}

	protected Adapter getAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification notification) {
					super.notifyChanged(notification);

					if (notification.getNotifier() instanceof SurfaceWorksiteNode) {
						if (notification.getFeatureID(
								SurfaceWorksiteNode.class) == ApogyCoreEnvironmentPackage.WORKSITE_NODE__WORKSITE) {
							// Worksite of SurfaceWorksiteNode has been set.

							// Clears the previous topology.
							clearTopology();

							// Unregister from previous Worksite if applicable.
							if (notification.getOldValue() instanceof SurfaceWorksite) {
								((SurfaceWorksite) notification.getOldValue()).eAdapters().remove(getAdapter());
							}

							// Register to new Worksite if applicable.
							if (notification.getNewValue() instanceof SurfaceWorksite) {
								((SurfaceWorksite) notification.getNewValue()).eAdapters().add(getAdapter());
							}
						}
					} else if (notification.getNotifier() instanceof SurfaceWorksite) {
						if (notification.getFeatureID(
								SurfaceWorksite.class) == ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__MAPS_LIST) {
							// MapsList of Worksite has been set.

							// Unregister from previous MapsList if applicable.
							if (notification.getOldValue() instanceof MapsList) {
								removeMapsList((MapsList) notification.getOldValue());
							}

							// Register to new MapsList if applicable.
							if (notification.getNewValue() instanceof MapsList) {
								addMapsList((MapsList) notification.getNewValue());
							}
						}
					}
				}
			};
		}

		return adapter;
	}
} // SurfaceWorksiteNodeImpl
