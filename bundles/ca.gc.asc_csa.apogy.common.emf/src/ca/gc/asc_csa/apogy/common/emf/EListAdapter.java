package ca.gc.asc_csa.apogy.common.emf;
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

public class EListAdapter<T> implements Adapter {

	private ListEventDelegate<T> delegate;
	private int expectedFeatureId;
	private Class<?> expectedClass;

	/**
	 * Creates a new instance.
	 * 
	 * @param expectedFeatureId
	 *            the feature id we want to listen to.
	 * @param delegate
	 *            the delegate beeing used to delegate the events.
	 * @param expectedClass
	 *            the class we are listening.
	 * 
	 * @throws IllegalArgumentException
	 *             if delegate or expectedClass is null.
	 */
	public EListAdapter(int expectedFeatureId, ListEventDelegate<T> delegate,
			Class<?> expectedClass) {
		if (delegate == null) {
			throw new IllegalArgumentException("delegate is null");
		}

		if (expectedClass == null) {
			throw new IllegalArgumentException("expectedClass is null");
		}

		this.delegate = delegate;
		this.expectedFeatureId = expectedFeatureId;
		this.expectedClass = expectedClass;
	}

	@Override
	public Notifier getTarget() {
		return null;
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void notifyChanged(Notification notification) {
		int featureId = notification.getFeatureID(expectedClass);

		if (featureId == expectedFeatureId) {
			if (notification.getEventType() == Notification.ADD) {
				if (notification.getNewValue() != null) {
					T element = (T) notification.getNewValue();

					delegate.added(element);
				}
			} else if (notification.getEventType() == Notification.ADD_MANY) {
				if (notification.getNewValue() != null) {
					List<T> elements = (List<T>) notification.getNewValue();
					delegate.addedMany(elements);
				}
			} else if (notification.getEventType() == Notification.REMOVE) {
				if (notification.getOldValue() != null) {
					T element = (T) notification.getOldValue();

					delegate.removed(element);
				}
			} else if (notification.getEventType() == Notification.REMOVE_MANY) {
				if (notification.getOldValue() != null) {
					List<T> elements = (List<T>) notification.getOldValue();

					delegate.removedMany(elements);
				}
			}
		}
	}

	@Override
	public void setTarget(Notifier newTarget) {

	}

}
