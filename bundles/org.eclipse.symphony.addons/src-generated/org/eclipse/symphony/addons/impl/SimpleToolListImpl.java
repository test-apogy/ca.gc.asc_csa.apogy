/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.addons.SimpleTool;
import org.eclipse.symphony.addons.SimpleToolList;
import org.eclipse.symphony.addons.SymphonyToolsCorePackage;
import org.eclipse.symphony.core.invocator.impl.AbstractToolsListContainerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Tool List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.impl.SimpleToolListImpl#getSimpleTools <em>Simple Tools</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleToolListImpl extends AbstractToolsListContainerImpl implements SimpleToolList 
{
	private Adapter adapter = null;
	
	/**
	 * The cached value of the '{@link #getSimpleTools() <em>Simple Tools</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleTools()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleTool> simpleTools;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected SimpleToolListImpl() 
	{
		super();
		
		this.eAdapters().add(getAdapter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyToolsCorePackage.Literals.SIMPLE_TOOL_LIST;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleTool> getSimpleTools() {
		if (simpleTools == null) {
			simpleTools = new EObjectContainmentWithInverseEList<SimpleTool>(SimpleTool.class, this, SymphonyToolsCorePackage.SIMPLE_TOOL_LIST__SIMPLE_TOOLS, SymphonyToolsCorePackage.SIMPLE_TOOL__TOOL_LIST);
		}
		return simpleTools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyToolsCorePackage.SIMPLE_TOOL_LIST__SIMPLE_TOOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSimpleTools()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyToolsCorePackage.SIMPLE_TOOL_LIST__SIMPLE_TOOLS:
				return ((InternalEList<?>)getSimpleTools()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyToolsCorePackage.SIMPLE_TOOL_LIST__SIMPLE_TOOLS:
				return getSimpleTools();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SymphonyToolsCorePackage.SIMPLE_TOOL_LIST__SIMPLE_TOOLS:
				getSimpleTools().clear();
				getSimpleTools().addAll((Collection<? extends SimpleTool>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SymphonyToolsCorePackage.SIMPLE_TOOL_LIST__SIMPLE_TOOLS:
				getSimpleTools().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SymphonyToolsCorePackage.SIMPLE_TOOL_LIST__SIMPLE_TOOLS:
				return simpleTools != null && !simpleTools.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	private Adapter getAdapter()
	{
		if(adapter == null)
		{
			adapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof SimpleToolList)
					{												
						int featureId = msg.getFeatureID(SimpleToolList.class);
						
						switch(featureId)
						{
							case SymphonyToolsCorePackage.SIMPLE_TOOL_LIST__SIMPLE_TOOLS:
							{
								if(msg.getEventType() == Notification.REMOVE)
								{
									if(msg.getOldValue() instanceof SimpleTool)
									{
										SimpleTool simpleTool = (SimpleTool) msg.getOldValue();
										simpleTool.dispose();
									}
								}
								else if(msg.getEventType() == Notification.REMOVE_MANY)
								{
									if(msg.getOldValue() instanceof List)
									{
										@SuppressWarnings("unchecked")
										List<SimpleTool> tools = (List<SimpleTool>) msg.getOldValue();
										for(SimpleTool simpleTool : tools)
										{
											simpleTool.dispose();
										}
									}
								}
							}
							break;
						}
					}
				}
			};
		}
		
		return adapter;
	}

} //SimpleToolListImpl
