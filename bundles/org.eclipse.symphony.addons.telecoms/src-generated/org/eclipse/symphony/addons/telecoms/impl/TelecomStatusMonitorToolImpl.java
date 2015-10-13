/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.telecoms.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.addons.telecoms.SymphonyTelecomToolsPackage;
import org.eclipse.symphony.addons.telecoms.TelecomNode;
import org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool;
import org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorToolList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Telecom Status Monitor Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.impl.TelecomStatusMonitorToolImpl#getTelecomNodes <em>Telecom Nodes</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.impl.TelecomStatusMonitorToolImpl#getStatusMonitorToolList <em>Status Monitor Tool List</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.impl.TelecomStatusMonitorToolImpl#isRunning <em>Running</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.impl.TelecomStatusMonitorToolImpl#isDisposed <em>Disposed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TelecomStatusMonitorToolImpl extends MinimalEObjectImpl.Container implements TelecomStatusMonitorTool
{
	/**
	 *  Whether the OS is windows or not
	 */
	private static final boolean IS_WINDOWS = (System.getProperty("os.name").indexOf("Windows") != -1);
	
	/**
	 * Used to keep track of the child threads processing the update
	 * requests.
	 */
	private List<TelecomNodeJob> nodeJobs;
	
	/**
	 * The cached value of the '{@link #getTelecomNodes() <em>Telecom Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecomNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<TelecomNode> telecomNodes;
	
	/**
	 * Used to keep track of changes to the list of telecom nodes 
	 */
	Adapter nodeListener;
	
	/**
	 * The default value of the '{@link #isRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUNNING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunning()
	 * @generated
	 * @ordered
	 */
	protected boolean running = RUNNING_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisposed() <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisposed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPOSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisposed() <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisposed()
	 * @generated
	 * @ordered
	 */
	protected boolean disposed = DISPOSED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected TelecomStatusMonitorToolImpl()
	{
		super();
		
		// Create the list of currently active node jobs
		nodeJobs = new ArrayList<TelecomNodeJob>();
		
		// Create the listener to respond to changes in the set of nodes
		nodeListener = new TelecomStatusMonitorChangeListener();
		
		// Add the listener to the list of telecom nodes
		this.eAdapters().add(nodeListener);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyTelecomToolsPackage.Literals.TELECOM_STATUS_MONITOR_TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TelecomNode> getTelecomNodes() {
		if (telecomNodes == null) {
			telecomNodes = new EObjectContainmentWithInverseEList<TelecomNode>(TelecomNode.class, this, SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__TELECOM_NODES, SymphonyTelecomToolsPackage.TELECOM_NODE__STATUS_MONITOR_TOOL);
		}
		return telecomNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecomStatusMonitorToolList getStatusMonitorToolList() {
		if (eContainerFeatureID() != SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__STATUS_MONITOR_TOOL_LIST) return null;
		return (TelecomStatusMonitorToolList)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecomStatusMonitorToolList basicGetStatusMonitorToolList() {
		if (eContainerFeatureID() != SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__STATUS_MONITOR_TOOL_LIST) return null;
		return (TelecomStatusMonitorToolList)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusMonitorToolList(TelecomStatusMonitorToolList newStatusMonitorToolList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStatusMonitorToolList, SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__STATUS_MONITOR_TOOL_LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusMonitorToolList(TelecomStatusMonitorToolList newStatusMonitorToolList) {
		if (newStatusMonitorToolList != eInternalContainer() || (eContainerFeatureID() != SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__STATUS_MONITOR_TOOL_LIST && newStatusMonitorToolList != null)) {
			if (EcoreUtil.isAncestor(this, newStatusMonitorToolList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStatusMonitorToolList != null)
				msgs = ((InternalEObject)newStatusMonitorToolList).eInverseAdd(this, SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL_LIST__TELECOM_STATUS_MONITORS, TelecomStatusMonitorToolList.class, msgs);
			msgs = basicSetStatusMonitorToolList(newStatusMonitorToolList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__STATUS_MONITOR_TOOL_LIST, newStatusMonitorToolList, newStatusMonitorToolList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunning(boolean newRunning) {
		boolean oldRunning = running;
		running = newRunning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__RUNNING, oldRunning, running));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisposed() {
		return disposed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposed(boolean newDisposed) {
		boolean oldDisposed = disposed;
		disposed = newDisposed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__DISPOSED, oldDisposed, disposed));
	}

	/**
	 * Start the network status monitor running; for each of the
	 * network nodes, a series of ping requests will take place,
	 * provided that the node's value are correct.
	 * @generated_NOT
	 */
	public void start()
	{	
		// If the network monitor is not disposed and
		// currently not running
		if (isDisposed() == false &&
			isRunning() == false)
		{
			// Set the new running status
			setRunning(true);
			
			// Go through all of the nodes
			for (TelecomNode node : telecomNodes)
			{
				// Create a network node job for that network node
				TelecomNodeJob nodeJob = new TelecomNodeJob(node);
				
				// Schedule the job to run
				nodeJob.schedule();
				
				// Add it to the list
				nodeJobs.add(nodeJob);
			}
		}
	}

	/**
	 * Stop the network status monitor, if it is running.
	 * @generated_NOT
	 */
	public void stop()
	{
		// If the network monitor is not disposed and
		// currently running
		if (isDisposed() == false && isRunning() == true)
		{
			// Go through all of the jobs
			for (TelecomNodeJob nodeJob : nodeJobs)
			{
				// Cancel each one
				nodeJob.cancel();
			}
			
			// Remove them from the list of jobs
			nodeJobs.clear();
			
			// Set the updated started status
			setRunning(false);
		}
	}

	/**
	 * Used to cleanup the telecom status monitor and release
	 * any active resources.
	 */
	public void dispose()
	{
		// If the monitor isn't disposed
		if (isDisposed() == false)
		{
			// If the monitor is currently running
			if (isRunning() == true)
			{
				// Stop it
				stop();
			}
			
			// Remove the listener from myself
			this.eAdapters().remove(nodeListener);

			// Set that it's disposed
			setDisposed(true);
		}
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
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__TELECOM_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTelecomNodes()).basicAdd(otherEnd, msgs);
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__STATUS_MONITOR_TOOL_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStatusMonitorToolList((TelecomStatusMonitorToolList)otherEnd, msgs);
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
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__TELECOM_NODES:
				return ((InternalEList<?>)getTelecomNodes()).basicRemove(otherEnd, msgs);
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__STATUS_MONITOR_TOOL_LIST:
				return basicSetStatusMonitorToolList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__STATUS_MONITOR_TOOL_LIST:
				return eInternalContainer().eInverseRemove(this, SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL_LIST__TELECOM_STATUS_MONITORS, TelecomStatusMonitorToolList.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__TELECOM_NODES:
				return getTelecomNodes();
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__STATUS_MONITOR_TOOL_LIST:
				if (resolve) return getStatusMonitorToolList();
				return basicGetStatusMonitorToolList();
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__RUNNING:
				return isRunning();
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__DISPOSED:
				return isDisposed();
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
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__TELECOM_NODES:
				getTelecomNodes().clear();
				getTelecomNodes().addAll((Collection<? extends TelecomNode>)newValue);
				return;
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__STATUS_MONITOR_TOOL_LIST:
				setStatusMonitorToolList((TelecomStatusMonitorToolList)newValue);
				return;
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__RUNNING:
				setRunning((Boolean)newValue);
				return;
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__DISPOSED:
				setDisposed((Boolean)newValue);
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
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__TELECOM_NODES:
				getTelecomNodes().clear();
				return;
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__STATUS_MONITOR_TOOL_LIST:
				setStatusMonitorToolList((TelecomStatusMonitorToolList)null);
				return;
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__RUNNING:
				setRunning(RUNNING_EDEFAULT);
				return;
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__DISPOSED:
				setDisposed(DISPOSED_EDEFAULT);
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
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__TELECOM_NODES:
				return telecomNodes != null && !telecomNodes.isEmpty();
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__STATUS_MONITOR_TOOL_LIST:
				return basicGetStatusMonitorToolList() != null;
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__RUNNING:
				return running != RUNNING_EDEFAULT;
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__DISPOSED:
				return disposed != DISPOSED_EDEFAULT;
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
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL___START:
				start();
				return null;
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL___STOP:
				stop();
				return null;
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL___DISPOSE:
				dispose();
				return null;
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
		result.append(" (running: ");
		result.append(running);
		result.append(", disposed: ");
		result.append(disposed);
		result.append(')');
		return result.toString();
	}
	
	private class TelecomStatusMonitorChangeListener extends AdapterImpl
	{
		@Override
		public void notifyChanged(Notification notification)
		{
			if (notification.getFeatureID(TelecomStatusMonitorTool.class) == SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL__TELECOM_NODES)
			{
				// If this hasn't been disposed and it's currently running
				if (isDisposed() == false && isRunning() == true)
				{
					// If one or more telecom nodes are being added to the list
					if (notification.getEventType() == Notification.ADD ||
						notification.getEventType() == Notification.ADD_MANY)
					{
						// Go through the list of nodes
						for (TelecomNode node : getTelecomNodes())
						{
							// Whether or not it was found
							boolean found = false;
							
							// Go through the list of currently running jobs
							for (TelecomNodeJob job : nodeJobs)
							{
								// If there's a match
								if (job.getTelecomNode() == node)
								{
									// Set a flag and break out
									found = true;
									break;
								}
							}
							
							// If there was no match in the job thread list
							if (found == false)
							{
								// Create a new job for it
								TelecomNodeJob newJob = new TelecomNodeJob(node);
							
								// Schedule it to run
								newJob.schedule();
								
								// Add it to the list of running jobs
								nodeJobs.add(newJob);
							}
						}
					}
					else if (notification.getEventType() == Notification.REMOVE ||
				 			 notification.getEventType() == Notification.REMOVE_MANY)
					{
						List<TelecomNodeJob> removeJobs = new ArrayList<TelecomNodeJob>();
					
						// Go through the current list of jobs
						for (TelecomNodeJob nodeJob : nodeJobs)
						{
							// Whether or not the corresponding node was found
							boolean found = false;
							
							// Go through the list of current nodes
							for (TelecomNode node : getTelecomNodes())
							{
								// If there's a match between the node and the job
								if (nodeJob.getTelecomNode() == node)
								{
									// Indicate that it was found and break out
									found = true;
									break;
								}
							}
							
							// If it wasn't found
							if (found == false)
							{
								// Add this job to the list of jobs to be removed
								removeJobs.add(nodeJob);
							}
						}
						
						// Go through the list of jobs with removed nodes
						for (TelecomNodeJob removeJob : removeJobs)
						{
							// Cancel the job
							removeJob.cancel();
							
							// Remove it from the active node job list
							nodeJobs.remove(removeJob);
						}
					}
				}
			}
		}
	}

	private class TelecomNodeJob extends Job
	{
		// What the amount to sleep between checks should be
		private static final int SLEEP_DURATION = 500;
		
		// The node associated with this job
		private final TelecomNode node;
		
		public TelecomNodeJob(TelecomNode telecomNode)
		{
			// Call the superclass' constructor
			super("Job for NetworkNode " + telecomNode.getName());
			
			// The node from which the ping values are being extracted
			this.node = telecomNode;
			
			// This to be treated like a system job and not shown in the UI
			this.setSystem(true);
		}

		public TelecomNode getTelecomNode()
		{
			// Just return the telecom node associated with this job
			return node;
		}
		
		@Override
		protected IStatus run(IProgressMonitor monitor)
		{
			// While the job hasn't been cancelled
			// and the monitoring tool is still running
			while (monitor.isCanceled() == false &&
				   node.getStatusMonitorTool().isRunning() == true)
			{
				// If the telecom node is actually enabled
				if (node.isEnabled() == true)
				{				
					ProcessBuilder pingPB = null;
				
					// If it's a Windows machine
					if (IS_WINDOWS == true)
					{
						pingPB = new ProcessBuilder("ping",
													"-n",
													Integer.toString(node.getPacketsToSend()),
													"-w",
													Double.toString(node.getConnectionTimeout()),
													node.getAddress());
					}
					// Otherwise, it's a *nix machine
					else
					{
						double timeoutInSec = ((double) node.getConnectionTimeout()) / 1000.0;
						
						pingPB = new ProcessBuilder("ping",
													"-c",
													Integer.toString(node.getPacketsToSend()),
													"-W",
													Double.toString(timeoutInSec),
													node.getAddress());
					}
					
					try
					{
						// Create the process and wait for it to finish
						Process pingProcess = pingPB.start();
						pingProcess.waitFor();
						
						// Extract the appropriate values from the ping process output
						extractValuesFromPingOutput(pingProcess);
					}
					catch (IOException ex)
					{
						ex.printStackTrace();
						break;
					}
					catch (InterruptedException ex)
					{
						ex.printStackTrace();
						break;
					}			
				}
				
				try
				{
					// Sleep this thread for a period of time
					Thread.sleep(SLEEP_DURATION);
				}
				catch (InterruptedException ex)
				{
					
				}
				
			}
			
			// Return the status 
			return Status.OK_STATUS;
		}
		
		private void extractValuesFromPingOutput(Process proc)
		{
			BufferedReader br = null;
			
			try
			{
				// Open up the reader on the process' output
				br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
				String line = null;
				
				// Whether or not the relevant lines have been found
				boolean startStatLineFound = false;
				boolean packetStatLineFound = false;
				boolean latencyStatLineFound = false;
				
				// If this is a windows system
				if (IS_WINDOWS == true)
				{
					// The various patterns for the lines of interest in the process' output
					Pattern statLine = Pattern.compile("^Ping statistics for .+:$");
					Pattern packetLine = Pattern.compile("^Packets: Sent = .+, Received = .+, Lost = .+ \\(.+% loss\\),$");
					Pattern latencyLine = Pattern.compile("^Minimum = .+ms, Maximum = .+ms, Average = .+ms$");
					
					// While there's more lines to read
					while ((line = br.readLine()) != null)
					{
						// Trim the whitespace from the space and end of the string
						line = line.trim();
						
						// If this is the start of the statistics
						if (statLine.matcher(line).matches() == true)
						{
							// Indicate that the start of the statistics has been found
							startStatLineFound = true;
						}
						else
						{
							// If the start of the statistics has already been found
							if (startStatLineFound == true)
							{
								// If the packet statistic line hasn't been processed yet
								if (packetStatLineFound == false)
								{
									// If the packet line was found (which it should be)
									if (packetLine.matcher(line).matches() == true)
									{
										// Indicate that it has now been processed
										packetStatLineFound = true;
										
										// Split up the line using the ',' character
										String[] packetStats = line.split(",");
										
										// Extract the third value and split it on the '(' character
										packetStats = packetStats[2].split("\\(");
										
										// Extract the second value and split it on the '%' character
										packetStats = packetStats[1].split("%");
										
										// Just take the first value as it is the packet loss value
										String packetLossVal = packetStats[0];
										
										// Trim it to ensure no white space is present
										packetLossVal = packetLossVal.trim();
										
										// Just parse that value into a double and store it in the node
										node.setPacketLoss(Double.parseDouble(packetLossVal));
									}
								}
								// Otherwise if the latency statistic line hasn't been processed yet
								else if (latencyStatLineFound == false)
								{
									// If the latency line was found
									if (latencyLine.matcher(line).matches() == true)
									{
										// Indicate that it has now been processed
										latencyStatLineFound = true;
										
										// Split up the line using the ',' character
										String[] latencyStats = line.split(",");
										
										// Extract the third value and split it on the '=' character
										latencyStats = latencyStats[2].split("=");
										
										// Extract the second value and trim it
										String averageLatency = latencyStats[1].trim();
										
										// Strip the "ms" from the end of the value
										averageLatency = averageLatency.substring(0, averageLatency.length()-2);
										
										// Just parse the latency and store it in the node
										node.setLatency(Double.parseDouble(averageLatency));
									}
								}
							}
						}
					}
				}
				// otherwise, this is a *nix (or similar) system
				else
				{
					// The various patterns for the lines of interest in the process' output
					Pattern statLine = Pattern.compile("^--- .+ ping statistics ---$");
					Pattern packetLine = Pattern.compile("^.+ packets transmitted, .+ received, .+% packet loss, time .+ms$");
					Pattern latencyLine = Pattern.compile("^rtt min/avg/max/mdev = .+/.+/.+/.+ ms$");
					
					// While there's more lines to read
					while ((line = br.readLine()) != null)
					{
						// Trim the whitespace from the start and end of the string
						line = line.trim();
						
						// If this is the start of the statistics
						if (statLine.matcher(line).matches() == true)
						{
							// Indicate that the start of the statistics has been found
							startStatLineFound = true;
						}
						else
						{
							// If the start of the statistics has already been found
							if (startStatLineFound == true)
							{
								// If the packet statistic line hasn't been processed yet
								if (packetStatLineFound == false)
								{
									// If the packet line was found (which it should be)
									if (packetLine.matcher(line).matches() == true)
									{
										// Indicate that it has now been processed
										packetStatLineFound = true;
									
										// Split the line up by commas to get the various components
										String[] packetStats = line.split(",");
									
										// Use the third component, which is the packet loss (%)
										// and trim the result
										String packetLossStat = packetStats[2].trim();
										
										// Split on the % character, and extract the first value,
										// which will give me the packet loss as desired.
										String packetLossVal = packetLossStat.split("%")[0];
									
										// Trim it to ensure no whitespace is present
										packetLossVal = packetLossVal.trim();
									
										// Just parse that value into a double and store it in the network node
										node.setPacketLoss(Double.parseDouble(packetLossVal));
									}
								}
								// Else if the latency statistic line hasn't been processed yet
								else if (latencyStatLineFound == false)
								{
									// If the latency line matches, which it should do
									if (latencyLine.matcher(line).matches() == true)
									{
										// Indicate that it has now been processed
										latencyStatLineFound = true;
									
										// Split the line up by the equal sign to get the value portion of the line
										String[] latencyStats = line.split("=");
									
										// Split the second component on '/' to get the actual latency values
										latencyStats = latencyStats[1].split("/");
									
										// Use the second component of this, which is the average latency
										String averageLatency = latencyStats[1];
									
										// Just parse that value into a double and store it into the network node
										node.setLatency(Double.parseDouble(averageLatency));
									}
								}
							}
						}
					}
				}
				
				// If there was no packet stat line found
				if (packetStatLineFound == false)
				{
					// Just set the packet loss to 100 percent
					node.setPacketLoss(100.0);
				}
				
				// If there was no latency stat line found (i.e. the address was unreachable)
				if (latencyStatLineFound == false)
				{
					// Just set the current latency value to zero
					node.setLatency(0.00);
				}
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
			finally
			{
				// If the reader was opened successfully
				if (br != null)
				{
					try
					{
						// Close it
						br.close();
						br = null;
					}
					catch (IOException ex)
					{
						ex.printStackTrace();
					}
				}
			}
		}
	}
} //TelecomStatusMonitorToolImpl
