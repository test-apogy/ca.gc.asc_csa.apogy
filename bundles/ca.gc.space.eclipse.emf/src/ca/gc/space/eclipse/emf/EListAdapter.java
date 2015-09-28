package ca.gc.space.eclipse.emf;

import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

/**
 * This class is an adapter that listens to an EList attribute of an EObject.
 * When a {@link Notification#ADD}, {@link Notification#ADD_MANY},
 * {@link Notification#REMOVE} or {@link Notification#REMOVE_MANY} event
 * happens, the appropriate method in the supplied {@link ListEventDelegate} is
 * called.
 * 
 * @author sgemme
 * 
 * @param <T>
 */
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
