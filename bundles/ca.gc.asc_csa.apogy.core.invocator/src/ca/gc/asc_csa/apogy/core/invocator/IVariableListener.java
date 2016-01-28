package org.eclipse.symphony.core.invocator;

/*
 * Interface used to listen for new and clear Variable instance events.
 */
public interface IVariableListener {
	public void variableListenerNotification(Variable variable, VariableListenerEventType event);
}