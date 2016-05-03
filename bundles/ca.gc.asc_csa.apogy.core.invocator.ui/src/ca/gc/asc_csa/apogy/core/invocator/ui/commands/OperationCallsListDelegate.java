/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mathieu Larose (mathieu.larose@savoirfairelinux.com)
 *     Savoir-faire Linux - Initial API and implementation
 */

package ca.gc.asc_csa.apogy.core.invocator.ui.commands;

import java.util.List;

import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IMemoryBlock;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallsList;

public class OperationCallsListDelegate extends LaunchConfigurationDelegate {
	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
		OperationCallsList operationCallsList = StaticData.operationCallsList;

		OperationCallsListDebugTarget t = new OperationCallsListDebugTarget(null, launch, operationCallsList);
		launch.addDebugTarget(t);
	}
}

class OperationCallsListDebugTarget extends DebugElement implements IDebugTarget {
	private IProcess process;
	private ILaunch launch;
	private OperationCallsListThread thread;
	private String name;

	public OperationCallsListDebugTarget(IProcess process, ILaunch launch, OperationCallsList operationCallsList) {
		super(null);
		this.process = process;
		this.launch = launch;
		this.thread = new OperationCallsListThread(launch, this, operationCallsList);
		this.name = "Operation Calls " + operationCallsList.getName();
		fireCreationEvent();
	}

	@Override
	public String getModelIdentifier() {
		return null;
	}

	@Override
	public IDebugTarget getDebugTarget() {
		return this;
	}

	@Override
	public ILaunch getLaunch() {
		return launch;
	}

	@Override
	public synchronized boolean canTerminate() {
		return thread.canTerminate();
	}

	@Override
	public synchronized boolean isTerminated() {
		return thread.isTerminated();
	}

	@Override
	public synchronized void terminate() throws DebugException {
		fireTerminateEvent();
	}

	@Override
	public synchronized boolean canResume() {
		return thread.canResume();
	}

	@Override
	public synchronized boolean canSuspend() {
		return thread.canSuspend();
	}

	@Override
	public synchronized boolean isSuspended() {
		return thread.isSuspended();
	}

	@Override
	public synchronized void resume() throws DebugException {
		thread.resume();
	}

	@Override
	public synchronized void suspend() throws DebugException {
		thread.suspend();
	}

	@Override
	public void breakpointAdded(IBreakpoint breakpoint) {
	}

	@Override
	public void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta) {
	}

	@Override
	public void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta) {
	}

	@Override
	public synchronized boolean canDisconnect() {
		return false;
	}

	@Override
	public void disconnect() throws DebugException {
	}

	@Override
	public boolean isDisconnected() {
		return false;
	}

	@Override
	public boolean supportsStorageRetrieval() {
		return false;
	}

	@Override
	public IMemoryBlock getMemoryBlock(long startAddress, long length) throws DebugException {
		return null;
	}

	@Override
	public IProcess getProcess() {
		return process;
	}

	@Override
	public IThread[] getThreads() throws DebugException {
		return new IThread[] { this.thread };
	}

	@Override
	public boolean hasThreads() throws DebugException {
		return true;
	}

	@Override
	public String getName() throws DebugException {
		return name;
	}

	@Override
	public boolean supportsBreakpoint(IBreakpoint breakpoint) {
		return false;
	}

}

class OperationCallsListThread extends DebugElement implements IThread {
	private ILaunch launch;
	private IDebugTarget target;
	private List<OperationCall> operationCalls;
	private int operationCallIndex = 0;
	private boolean stepping = false;
	private boolean suspended = false;
	private boolean terminated = false;

	public OperationCallsListThread(ILaunch launch, IDebugTarget target, OperationCallsList operationCallsList) {
		super(target);
		this.launch = launch;
		this.target = target;
		this.operationCalls = operationCallsList.getOperationCalls();
	}

	@Override
	public String getModelIdentifier() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IDebugTarget getDebugTarget() {
		// TODO Auto-generated method stub
		return this.target;
	}

	@Override
	public ILaunch getLaunch() {
		// TODO Auto-generated method stub
		return this.launch;
	}

	@Override
	public boolean canResume() {
		return false; // target.canResume();
	}

	@Override
	public boolean canSuspend() {
		return false; // target.canSuspend();
	}

	@Override
	public boolean isSuspended() {
		return suspended;
	}

	@Override
	public boolean canStepInto() {
		return false;
	}

	@Override
	public boolean canStepOver() {
		boolean result = !isTerminated();
		System.out.println("canStepOver =" + result);
		return !isTerminated();
	}

	@Override
	public boolean canStepReturn() {
		return false;
	}

	@Override
	public boolean isStepping() {
		return stepping;
	}

	@Override
	public void stepInto() throws DebugException {
	}

	@Override
	public void stepOver() throws DebugException {
		suspended = false;
		stepping = true;
		fireResumeEvent(DebugEvent.STEP_OVER);

		(new Thread() {
			public void run() {
				OperationCall opCall = OperationCallsListThread.this.operationCalls.get(OperationCallsListThread.this.operationCallIndex);
				OperationCallsListThread.this.operationCallIndex++;
				ApogyCoreInvocatorFacade.INSTANCE.exec(opCall);
				stepping = false;
				suspended = true;
				OperationCallsListThread.this.fireSuspendEvent(DebugEvent.STEP_END);
				if (operationCallIndex == operationCalls.size()) {
					try {
						terminate();
					} catch (DebugException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

	@Override
	public void stepReturn() throws DebugException {
	}

	@Override
	public boolean canTerminate() {
		return !isTerminated();
	}

	@Override
	public boolean isTerminated() {
		return terminated;
	}

	@Override
	public void terminate() throws DebugException {
		terminated = true;
		fireTerminateEvent();
		target.terminate();
	}

	@Override
	public IStackFrame[] getStackFrames() throws DebugException {
		return new IStackFrame[0];
	}

	@Override
	public boolean hasStackFrames() throws DebugException {
		return false;
	}

	@Override
	public int getPriority() throws DebugException {
		return 0;
	}

	@Override
	public IStackFrame getTopStackFrame() throws DebugException {
		return null;
	}

	@Override
	public String getName() throws DebugException {
		return "Thread";
	}

	@Override
	public IBreakpoint[] getBreakpoints() {
		return null;
	}

	@Override
	public void resume() throws DebugException {
		// TODO Auto-generated method stub

	}

	@Override
	public void suspend() throws DebugException {
		// TODO Auto-generated method stub

	}
}
