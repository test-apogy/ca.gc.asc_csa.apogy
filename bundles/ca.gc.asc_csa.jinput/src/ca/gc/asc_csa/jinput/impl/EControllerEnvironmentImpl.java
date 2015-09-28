/**
 * Copyrights Canadian Space Agency 2012. All rights reserved.
 */
package ca.gc.asc_csa.jinput.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import net.java.games.input.Controller;
import net.java.games.input.ControllerEnvironment;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.gc.asc_csa.jinput.Activator;
import ca.gc.asc_csa.jinput.EComponent;
import ca.gc.asc_csa.jinput.EComponentQualifier;
import ca.gc.asc_csa.jinput.EController;
import ca.gc.asc_csa.jinput.EControllerEnvironment;
import ca.gc.asc_csa.jinput.JInputFactory;
import ca.gc.asc_csa.jinput.JInputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EController Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.jinput.impl.EControllerEnvironmentImpl#isSupported <em>Supported</em>}</li>
 *   <li>{@link ca.gc.asc_csa.jinput.impl.EControllerEnvironmentImpl#getControllers <em>Controllers</em>}</li>
 *   <li>{@link ca.gc.asc_csa.jinput.impl.EControllerEnvironmentImpl#isRefreshRequested <em>Refresh Requested</em>}</li>
 *   <li>{@link ca.gc.asc_csa.jinput.impl.EControllerEnvironmentImpl#getPollingCount <em>Polling Count</em>}</li>
 *   <li>{@link ca.gc.asc_csa.jinput.impl.EControllerEnvironmentImpl#getPollingJob <em>Polling Job</em>}</li>
 *   <li>{@link ca.gc.asc_csa.jinput.impl.EControllerEnvironmentImpl#isPollingProblem <em>Polling Problem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EControllerEnvironmentImpl extends EObjectImpl implements EControllerEnvironment {
	
	//TODO: Transferer cette constante dans les préférences.
	private static final long MILLIS_BEFORE_NEXT_POLLING = 50;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyrights Canadian Space Agency 2012. All rights reserved.";

	/**
	 * The default value of the '{@link #isSupported() <em>Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupported()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUPPORTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getControllers() <em>Controllers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllers()
	 * @generated
	 * @ordered
	 */
	protected EList<EController> controllers;

	/**
	 * The default value of the '{@link #isRefreshRequested() <em>Refresh Requested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefreshRequested()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REFRESH_REQUESTED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRefreshRequested() <em>Refresh Requested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefreshRequested()
	 * @generated
	 * @ordered
	 */
	protected boolean refreshRequested = REFRESH_REQUESTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPollingCount() <em>Polling Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingCount()
	 * @generated
	 * @ordered
	 */
	protected static final long POLLING_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPollingCount() <em>Polling Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingCount()
	 * @generated
	 * @ordered
	 */
	protected long pollingCount = POLLING_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPollingJob() <em>Polling Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingJob()
	 * @generated
	 * @ordered
	 */
	protected static final Job POLLING_JOB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPollingJob() <em>Polling Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingJob()
	 * @generated
	 * @ordered
	 */
	protected Job pollingJob = POLLING_JOB_EDEFAULT;

	/**
	 * The default value of the '{@link #isPollingProblem() <em>Polling Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPollingProblem()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POLLING_PROBLEM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPollingProblem() <em>Polling Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPollingProblem()
	 * @generated
	 * @ordered
	 */
	protected boolean pollingProblem = POLLING_PROBLEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EControllerEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JInputPackage.Literals.ECONTROLLER_ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public boolean isSupported() {
		return ControllerEnvironment.getDefaultEnvironment().isSupported();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EController> getControllersGen() {
		if (controllers == null) {
			controllers = new EObjectContainmentEList<EController>(EController.class, this, JInputPackage.ECONTROLLER_ENVIRONMENT__CONTROLLERS);
		}
		return controllers;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public EList<EController> getControllers() 
	{
		EList<EController> returnList = getControllersGen();
		if(isRefreshRequested()) 
		{
			returnList.clear();				
	
			Controller[] controllerList = ControllerEnvironment.getDefaultEnvironment().getControllers();			
			for(Controller c : controllerList) 
			{
				if(c.poll()) 
				{
					EController ec = JInputFactory.eINSTANCE.createEController();
					ec.setPojoController(c);
					returnList.add(ec);
				}
			}
			assignControllerCounts(returnList);
			setRefreshRequested(false);
		}		
		
		return returnList;
	}

	private void assignControllerCounts(EList<EController> controllers)
	{
		Map<String, Integer> nameToCountMap = new HashMap<String, Integer>();
		
		for(EController controller: controllers)
		{
			String pojoName = controller.getPojoController().getName();
			
			// Check if the name is already in the map.
			if(nameToCountMap.get(pojoName) != null)
			{
				int controllerCount = nameToCountMap.get(pojoName).intValue() + 1;
				controller.setControllerCount(controllerCount);
				
				// Update the count in the map.				
				nameToCountMap.put(pojoName, controllerCount);
			}
			else
			{				
				controller.setControllerCount(1);
				
				// Update the count in the map.
				nameToCountMap.put(pojoName, 1);
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRefreshRequested() {
		return refreshRequested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefreshRequested(boolean newRefreshRequested) {
		boolean oldRefreshRequested = refreshRequested;
		refreshRequested = newRefreshRequested;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JInputPackage.ECONTROLLER_ENVIRONMENT__REFRESH_REQUESTED, oldRefreshRequested, refreshRequested));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPollingCount() {
		return pollingCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPollingCount(long newPollingCount) {
		long oldPollingCount = pollingCount;
		pollingCount = newPollingCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JInputPackage.ECONTROLLER_ENVIRONMENT__POLLING_COUNT, oldPollingCount, pollingCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Job getPollingJob() {
		if(pollingJob == null) { 
			pollingJob = new Job("Controllers polling job") {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					while(!monitor.isCanceled()) {
						Date startExecDate = new Date();
						pollControllers();
						increasePollCounter();
						Date finishExecDate = new Date();
						long runningTime = finishExecDate.getTime() - startExecDate.getTime();
						long waitTime = MILLIS_BEFORE_NEXT_POLLING - runningTime;
						if(waitTime > 0) {
							try { Thread.sleep(waitTime); } catch (InterruptedException e) { e.printStackTrace(); }
						} else {
							try { Thread.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
						}
					}
					return Status.OK_STATUS;
				}
			};
		}
		return pollingJob;
	}
	
	private void pollControllers() {
		EControllerEnvironment ece = Activator.getEControllerEnvironment();
		EList<EController> list = ece.getControllers();
		for(EController ec : list) {
			if(!isPollingProblem())
				setPollingProblem(!ec.poll());
			else
				ec.poll();
		}
	}
	
	private void increasePollCounter() {
		long actualPollingCount = getPollingCount();
		actualPollingCount++;
		if(actualPollingCount > Long.MAX_VALUE - 2)
			actualPollingCount = 0;
		setPollingCount(actualPollingCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPollingProblem() {
		return pollingProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPollingProblem(boolean newPollingProblem) {
		boolean oldPollingProblem = pollingProblem;
		pollingProblem = newPollingProblem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JInputPackage.ECONTROLLER_ENVIRONMENT__POLLING_PROBLEM, oldPollingProblem, pollingProblem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public void refresh() {
		setRefreshRequested(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void startPolling() {
		getPollingJob().schedule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void stopPolling() {
		getPollingJob().cancel(); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public EController resolveController(String controllerName) 
	{
		EController controller = null;
		
		if(controllerName != null)
		{
			Iterator<EController> it  = getControllers().iterator();
			while(controller == null && it.hasNext())
			{
				EController c = it.next();
				if((c.getName() != null) && (c.getName().compareTo(controllerName)) == 0)
				{
					controller = c;
				}
			}
		}
		
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public EComponent resolveEComponent(String componentName, EController eController) 
	{
		EComponent component = null;
		
		if(componentName != null)
		{
			Iterator<EComponent> it  = eController.getEComponents().getComponents().iterator();
			while(component == null && it.hasNext())
			{
				EComponent c = it.next();
				if((c.getName() != null) && (c.getName().compareTo(componentName)) == 0)
				{
					component = c;
				}
			}
		}
		
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public EComponent resolveEComponent(EComponentQualifier eComponentQualifier) 
	{
		EComponent eComponent = null;
		
		EController eController = resolveController(eComponentQualifier.getEControllerName());
		
		if(eController != null)
		{
			eComponent = resolveEComponent(eComponentQualifier.getEComponentName(), eController);
		}
		
		return eComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JInputPackage.ECONTROLLER_ENVIRONMENT__CONTROLLERS:
				return ((InternalEList<?>)getControllers()).basicRemove(otherEnd, msgs);
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
			case JInputPackage.ECONTROLLER_ENVIRONMENT__SUPPORTED:
				return isSupported();
			case JInputPackage.ECONTROLLER_ENVIRONMENT__CONTROLLERS:
				return getControllers();
			case JInputPackage.ECONTROLLER_ENVIRONMENT__REFRESH_REQUESTED:
				return isRefreshRequested();
			case JInputPackage.ECONTROLLER_ENVIRONMENT__POLLING_COUNT:
				return getPollingCount();
			case JInputPackage.ECONTROLLER_ENVIRONMENT__POLLING_JOB:
				return getPollingJob();
			case JInputPackage.ECONTROLLER_ENVIRONMENT__POLLING_PROBLEM:
				return isPollingProblem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JInputPackage.ECONTROLLER_ENVIRONMENT__REFRESH_REQUESTED:
				setRefreshRequested((Boolean)newValue);
				return;
			case JInputPackage.ECONTROLLER_ENVIRONMENT__POLLING_COUNT:
				setPollingCount((Long)newValue);
				return;
			case JInputPackage.ECONTROLLER_ENVIRONMENT__POLLING_PROBLEM:
				setPollingProblem((Boolean)newValue);
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
			case JInputPackage.ECONTROLLER_ENVIRONMENT__REFRESH_REQUESTED:
				setRefreshRequested(REFRESH_REQUESTED_EDEFAULT);
				return;
			case JInputPackage.ECONTROLLER_ENVIRONMENT__POLLING_COUNT:
				setPollingCount(POLLING_COUNT_EDEFAULT);
				return;
			case JInputPackage.ECONTROLLER_ENVIRONMENT__POLLING_PROBLEM:
				setPollingProblem(POLLING_PROBLEM_EDEFAULT);
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
			case JInputPackage.ECONTROLLER_ENVIRONMENT__SUPPORTED:
				return isSupported() != SUPPORTED_EDEFAULT;
			case JInputPackage.ECONTROLLER_ENVIRONMENT__CONTROLLERS:
				return controllers != null && !controllers.isEmpty();
			case JInputPackage.ECONTROLLER_ENVIRONMENT__REFRESH_REQUESTED:
				return refreshRequested != REFRESH_REQUESTED_EDEFAULT;
			case JInputPackage.ECONTROLLER_ENVIRONMENT__POLLING_COUNT:
				return pollingCount != POLLING_COUNT_EDEFAULT;
			case JInputPackage.ECONTROLLER_ENVIRONMENT__POLLING_JOB:
				return POLLING_JOB_EDEFAULT == null ? pollingJob != null : !POLLING_JOB_EDEFAULT.equals(pollingJob);
			case JInputPackage.ECONTROLLER_ENVIRONMENT__POLLING_PROBLEM:
				return pollingProblem != POLLING_PROBLEM_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JInputPackage.ECONTROLLER_ENVIRONMENT___REFRESH:
				refresh();
				return null;
			case JInputPackage.ECONTROLLER_ENVIRONMENT___START_POLLING:
				startPolling();
				return null;
			case JInputPackage.ECONTROLLER_ENVIRONMENT___STOP_POLLING:
				stopPolling();
				return null;
			case JInputPackage.ECONTROLLER_ENVIRONMENT___RESOLVE_CONTROLLER__STRING:
				return resolveController((String)arguments.get(0));
			case JInputPackage.ECONTROLLER_ENVIRONMENT___RESOLVE_ECOMPONENT__STRING_ECONTROLLER:
				return resolveEComponent((String)arguments.get(0), (EController)arguments.get(1));
			case JInputPackage.ECONTROLLER_ENVIRONMENT___RESOLVE_ECOMPONENT__ECOMPONENTQUALIFIER:
				return resolveEComponent((EComponentQualifier)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (refreshRequested: ");
		result.append(refreshRequested);
		result.append(", pollingCount: ");
		result.append(pollingCount);
		result.append(", pollingJob: ");
		result.append(pollingJob);
		result.append(", pollingProblem: ");
		result.append(pollingProblem);
		result.append(')');
		return result.toString();
	}

} //EControllerEnvironmentImpl
