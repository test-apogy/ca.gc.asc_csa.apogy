package org.eclipse.symphony.common.obsolete.eclipse.emf;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

/**
 * This class is used by {@link EListAdapter} to delegate the events.
 * <ul>
 * <li>When a {@link Notification#ADD} event happens, method
 * <code>{@link #added(Object)}</code> is called.</li>
 * <li>When a {@link Notification#ADD_MANY} event happens, method
 * <code>{@link #addedMany(List)}</code> is called.</li>
 * <li>When a {@link Notification#REMOVE} event happens, method
 * <code>{@link #removed(Object)}</code> is called.</li>
 * <li>When a {@link Notification#REMOVE_MANY} event happens, method
 * <code>{@link #removedMany(Object)}</code> is called.</li>
 * </ul>
 * 
 * @author sgemme
 * 
 * @param <T>
 */
public interface ListEventDelegate<T> {

	public void added(T element);

	public void removed(T element);

	public void addedMany(List<T> elements);

	public void removedMany(List<T> elements);

}
