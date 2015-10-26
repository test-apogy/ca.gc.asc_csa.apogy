package org.eclipse.symphony.addons.telecoms.ui.composites;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.ITableColorProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.TreeViewerEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage;
import org.eclipse.symphony.addons.telecoms.TelecomNode;
import org.eclipse.symphony.addons.telecoms.TelecomNodeStatus;
import org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool;
import org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorToolList;

public class TelecomStatusMonitorToolComposite extends Composite
{
	private final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private final Adapter monitorContentChangeListener;
	private final Adapter listContentChangeListener;
	private final CheckboxTreeViewer treeViewer;
	private TelecomStatusMonitorTool telecomStatusMonitor;
	private TelecomStatusMonitorToolList telecomStatusMonitorList;
	
	private static final int COLUMN_ENABLED = 0;
	private static final int COLUMN_NAME = 1;
	private static final int COLUMN_ADDRESS = 2;
	private static final int COLUMN_STATUS = 3;
	private static final int COLUMN_LATENCY = 4;
	private static final int COLUMN_PACKET_LOSS = 5; 
	private static final int COLUMN_NO_OF_PACKETS_TO_SEND = 6;
	private static final int COLUMN_TIMEOUT = 7;
	private static final int COLUMN_LATENCY_WARNING = 8;
	private static final int COLUMN_LATENCY_ALARM = 9;
	private static final int COLUMN_PACKET_LOSS_WARNING = 10;
	private static final int COLUMN_PACKET_LOSS_ALARM = 11;	
	
	public TelecomStatusMonitorToolComposite(Composite parent, int style)
	{
		super(parent, style);
		
		setLayout(new GridLayout(1, true));
		
		monitorContentChangeListener = new TelecomStatusMonitorToolCompositeMonitorChangeListener();
		listContentChangeListener = new TelecomStatusMonitorToolCompositeListChangeListener();
		
		treeViewer = new CheckboxTreeViewer(this, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL |
										          SWT.FULL_SELECTION | SWT.HIDE_SELECTION);
		
		Tree tree = treeViewer.getTree();
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1 ,1));
		
		TreeViewerColumn enabledTVColumn = new TreeViewerColumn(treeViewer, SWT.CENTER);
		TreeColumn enabledTColumn = enabledTVColumn.getColumn();
		enabledTColumn.setText("Enabled");
		enabledTColumn.setWidth(70);
		
		TreeViewerColumn nameTVColumn = new TreeViewerColumn(treeViewer, SWT.LEFT);
		nameTVColumn.setEditingSupport(new TelecomStatusMonitorToolCompositeEditingSupport(nameTVColumn.getViewer(),
																						   COLUMN_NAME));
		TreeColumn nameTColumn = nameTVColumn.getColumn();
		nameTColumn.setText("Name");
		nameTColumn.setWidth(175);
		
		TreeViewerColumn addressTVColumn = new TreeViewerColumn(treeViewer, SWT.LEFT);
		addressTVColumn.setEditingSupport(new TelecomStatusMonitorToolCompositeEditingSupport(addressTVColumn.getViewer(),
																							  COLUMN_ADDRESS));
		TreeColumn addressTColumn = addressTVColumn.getColumn();
		addressTColumn.setText("Network Address");
		addressTColumn.setWidth(175);
		
		TreeViewerColumn statusTVColumn = new TreeViewerColumn(treeViewer, SWT.LEFT);
		TreeColumn statusTColumn = statusTVColumn.getColumn();
		statusTColumn.setText("Status");
		statusTColumn.setWidth(150);
		
		TreeViewerColumn latencyTVColumn = new TreeViewerColumn(treeViewer, SWT.LEFT);
		TreeColumn latencyTColumn = latencyTVColumn.getColumn();
		latencyTColumn.setText("Current Latency (ms)");
		latencyTColumn.setWidth(155);
		
		TreeViewerColumn packetLossTVColumn = new TreeViewerColumn(treeViewer, SWT.LEFT);
		TreeColumn packetLossTColumn = packetLossTVColumn.getColumn();
		packetLossTColumn.setText("Current Packet Loss (%)");
		packetLossTColumn.setWidth(175);
		
		TreeViewerColumn packetsToSendTVColumn = new TreeViewerColumn(treeViewer, SWT.LEFT);
		packetsToSendTVColumn.setEditingSupport(new TelecomStatusMonitorToolCompositeEditingSupport(packetsToSendTVColumn.getViewer(),
																									COLUMN_NO_OF_PACKETS_TO_SEND));
		TreeColumn packetsToSendTColumn = packetsToSendTVColumn.getColumn();
		packetsToSendTColumn.setText("Packets To Send (#)");
		packetsToSendTColumn.setWidth(150);
		
		TreeViewerColumn timeoutTVColumn = new TreeViewerColumn(treeViewer, SWT.LEFT);
		timeoutTVColumn.setEditingSupport(new TelecomStatusMonitorToolCompositeEditingSupport(timeoutTVColumn.getViewer(),
																							  COLUMN_TIMEOUT));
		TreeColumn timeoutTColumn = timeoutTVColumn.getColumn();
		timeoutTColumn.setText("Timeout (ms)");
		timeoutTColumn.setWidth(105);
		
		TreeViewerColumn latencyWarningTVColumn = new TreeViewerColumn(treeViewer, SWT.LEFT);
		latencyWarningTVColumn.setEditingSupport(new TelecomStatusMonitorToolCompositeEditingSupport(latencyWarningTVColumn.getViewer(),
																									 COLUMN_LATENCY_WARNING));
		TreeColumn latencyWarningTColumn = latencyWarningTVColumn.getColumn();
		latencyWarningTColumn.setText("Latency Warning (ms)");
		latencyWarningTColumn.setWidth(160);
		
		TreeViewerColumn latencyAlarmTVColumn = new TreeViewerColumn(treeViewer, SWT.LEFT);
		latencyAlarmTVColumn.setEditingSupport(new TelecomStatusMonitorToolCompositeEditingSupport(latencyAlarmTVColumn.getViewer(),
																								   COLUMN_LATENCY_ALARM));
		TreeColumn latencyAlarmTColumn = latencyAlarmTVColumn.getColumn();
		latencyAlarmTColumn.setText("Latency Alarm (ms)");
		latencyAlarmTColumn.setWidth(150);
		
		TreeViewerColumn packetLossWarningTVColumn = new TreeViewerColumn(treeViewer, SWT.LEFT);
		packetLossWarningTVColumn.setEditingSupport(new TelecomStatusMonitorToolCompositeEditingSupport(packetLossWarningTVColumn.getViewer(),
																										COLUMN_PACKET_LOSS_WARNING));
		TreeColumn packetLossWarningTColumn = packetLossWarningTVColumn.getColumn();
		packetLossWarningTColumn.setText("Packet Loss Warning (%)");
		packetLossWarningTColumn.setWidth(180);
		
		TreeViewerColumn packetLossAlarmTVColumn = new TreeViewerColumn(treeViewer, SWT.LEFT);
		packetLossAlarmTVColumn.setEditingSupport(new TelecomStatusMonitorToolCompositeEditingSupport(packetLossAlarmTVColumn.getViewer(),
																									  COLUMN_PACKET_LOSS_ALARM));
		TreeColumn packetLossAlarmTColumn = packetLossAlarmTVColumn.getColumn();
		packetLossAlarmTColumn.setText("Packet Loss Alarm (%)");
		packetLossAlarmTColumn.setWidth(165);
				
		/** 
		 * Tree Viewer JFace Settings.
		*/
		treeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory)
		{
			@Override
			public Object[] getElements( Object object )
			{
				return (telecomStatusMonitor == null ? null : telecomStatusMonitor.getTelecomNodes().toArray());			 
			}
		} );
		
		treeViewer.setLabelProvider(new TelecomStatusMonitorToolCompositeLabelProvider(adapterFactory));
		
		TreeViewerEditor.create( treeViewer, new ColumnViewerEditorActivationStrategy( treeViewer )
		{
			@Override
			protected boolean isEditorActivationEvent( ColumnViewerEditorActivationEvent event )
			{
				return event.eventType == ColumnViewerEditorActivationEvent.MOUSE_CLICK_SELECTION;
			}
		}, SWT.NONE );
		
		treeViewer.addCheckStateListener(new ICheckStateListener()
		{
			@Override
			public void checkStateChanged(CheckStateChangedEvent event)
			{
				if (event.getElement() instanceof TelecomNode)
				{
					TelecomNode node = (TelecomNode) event.getElement();
					
					node.setEnabled(event.getChecked());
				}
			}
		});
		
		treeViewer.setCheckStateProvider(new ICheckStateProvider()
		{
			@Override
			public boolean isChecked(Object element)
			{
				if (element instanceof TelecomNode)
				{
					return ((TelecomNode)element).isEnabled();
				}
				else
				{
					return false;
				}
			}

			@Override
			public boolean isGrayed(Object element)
			{
				return false;
			}
		});
		
		treeViewer.getTree().addListener(SWT.Selection, new Listener()
		{
			public void handleEvent(Event event)
			{
				event.doit = false;
				
				try
				{
					treeViewer.getTree().setRedraw(false);
					treeViewer.getTree().deselectAll();
				}
				finally
				{
					treeViewer.getTree().setRedraw(true);
				}
			}
		});
		
		addDisposeListener(new DisposeListener()
		{
			@Override
			public void widgetDisposed(DisposeEvent e)
			{
				dispose();
			}
		});
		
	}
	
	public TelecomStatusMonitorTool getTelecomStatusMonitorTool()
	{
		// Just return the current tool
		return this.telecomStatusMonitor;
	}
	
	public void setTelecomStatusMonitorTool(TelecomStatusMonitorTool statusMonitor)
	{
		// If the new monitor is the same as the old one
		if (this.telecomStatusMonitor == statusMonitor)
		{
			// Just return
			return;
		}
		
		// If there currently is a telecom monitor
		if (this.telecomStatusMonitor != null)
		{
			// If the current telecom monitor is running
			if (this.telecomStatusMonitor.isRunning() == true)
			{
				// Stop it
				this.telecomStatusMonitor.stop();
			}
			
			// Remove the change listener from the old telecom monitor and its list
			this.telecomStatusMonitor.eAdapters().remove(monitorContentChangeListener);
			this.telecomStatusMonitorList.eAdapters().remove(listContentChangeListener);
		}
		
		// Assign the new status monitor
		this.telecomStatusMonitor = statusMonitor;
		
		// If the new status monitor isn't null
		if (this.telecomStatusMonitor != null)
		{
			// Extract its status monitor tool list
			this.telecomStatusMonitorList = statusMonitor.getStatusMonitorToolList();
		}
		// Otherwise, it is null
		else
		{
			// Just set the status monitor tool list to null
			this.telecomStatusMonitorList = null;
		}

		// If the tree is not yet disposed
		if (treeViewer.getTree().isDisposed() == false)
		{
			// Set the value accordingly and expand as necessary
			treeViewer.setInput(statusMonitor);
			treeViewer.expandAll();
			
			// If the new telecom status monitor is not null
			if (statusMonitor != null)
			{
				// Start up the new telecom monitor
				statusMonitor.start();
				
				// Add the change listener to the new telecom monitor and its list
				this.telecomStatusMonitor.eAdapters().add(monitorContentChangeListener);
				this.telecomStatusMonitorList.eAdapters().add(listContentChangeListener);
			}
		}
	}
	
	@Override
	public void dispose()
	{
		// If there is a telecom status monitor
		if (telecomStatusMonitor != null)
		{
			// If it is currently running
			if (telecomStatusMonitor.isRunning() == true)
			{
				// Stop it
				telecomStatusMonitor.stop();
			}
			
			// Remove the relevant adapters
			telecomStatusMonitor.eAdapters().remove(monitorContentChangeListener);
			telecomStatusMonitorList.eAdapters().remove(listContentChangeListener);
			
			// Null out the relevant fields
			telecomStatusMonitor = null;
			telecomStatusMonitorList = null;
		}
		
		// Call the superclass' version
		super.dispose();
	}
	
	
	private class TelecomStatusMonitorToolCompositeLabelProvider extends AdapterFactoryLabelProvider implements ITableLabelProvider, ITableColorProvider
	{	
		public TelecomStatusMonitorToolCompositeLabelProvider(AdapterFactory adapterFactory)
		{
			super(adapterFactory);
		}
		
		@Override
		public Image getColumnImage(Object element, int columnIndex)
		{
			return null;
		}
		
		@Override
		public Color getForeground(Object element, int columnIndex)
		{
			return Display.getCurrent().getSystemColor(SWT.COLOR_BLACK);
		}
		
		@Override
		public Color getBackground(Object element, int columnIndex)
		{
			Color color = null;
			
			if (element instanceof TelecomNode)
			{
				TelecomNode node = (TelecomNode) element;
				
				switch (node.getStatus().getValue())
				{
					case TelecomNodeStatus.NOT_STARTED_VALUE:
						
						color = Display.getCurrent().getSystemColor(SWT.COLOR_DARK_GRAY);
						break;
					
					case TelecomNodeStatus.NOT_ENABLED_VALUE:
						
						color = Display.getCurrent().getSystemColor(SWT.COLOR_GRAY);
						break;
					
					case TelecomNodeStatus.UNREACHABLE_VALUE:
						
						color = Display.getCurrent().getSystemColor(SWT.COLOR_DARK_MAGENTA);
						break;
					
					case TelecomNodeStatus.NORMAL_VALUE:
						
						color = Display.getCurrent().getSystemColor(SWT.COLOR_GREEN);
						break;
						
					case TelecomNodeStatus.LATENCY_WARNING_VALUE:
					case TelecomNodeStatus.PACKET_LOSS_WARNING_VALUE:
					case TelecomNodeStatus.BOTH_WARNING_VALUE:
						
						color = Display.getCurrent().getSystemColor(SWT.COLOR_YELLOW);
						break;
					
					case TelecomNodeStatus.LATENCY_ALARM_VALUE:
					case TelecomNodeStatus.PACKET_LOSS_ALARM_VALUE:
					case TelecomNodeStatus.BOTH_ALARM_VALUE:
						
						color = Display.getCurrent().getSystemColor(SWT.COLOR_RED);
						break;
				}
					
			}
			
			return color;
		}
		
		@Override
		public String getColumnText(Object element, int columnIndex)
		{
			String result = "N/A";
			
			if (element instanceof TelecomNode)
			{
				TelecomNode node = (TelecomNode) element;
				
				switch (columnIndex)
				{
					case COLUMN_ENABLED:
						
						result = "";
						break;
					
					case COLUMN_NAME:
						
						result = node.getName();
						break;
					
					case COLUMN_ADDRESS:
						
						result = node.getAddress();
						break;
						
					case COLUMN_STATUS:
						
						result = node.getStatus().getLiteral();
						break;
						
					case COLUMN_LATENCY:
						
						result = Double.toString(node.getLatency());
						break;
					
					case COLUMN_PACKET_LOSS:
						
						result = Double.toString(node.getPacketLoss());
						break;
					
					case COLUMN_TIMEOUT:

						result = Integer.toString(node.getConnectionTimeout());
						break;
					
					case COLUMN_NO_OF_PACKETS_TO_SEND:
						
						result = Integer.toString(node.getPacketsToSend());
						break;
						
					case COLUMN_LATENCY_WARNING:
						
						result = Double.toString(node.getLatencyWarning());					
						break;
					
					case COLUMN_LATENCY_ALARM:
						
						result = Double.toString(node.getLatencyAlarm());
						break;
					
					case COLUMN_PACKET_LOSS_WARNING:
						
						result = Double.toString(node.getPacketLossWarning());
						break;
						
					case COLUMN_PACKET_LOSS_ALARM:
						
						result = Double.toString(node.getPacketLossAlarm());
						break;
				}
					
			}
			
			return result;
		}
	}
	
	private class TelecomStatusMonitorToolCompositeEditingSupport extends EditingSupport
	{
		private int column;
		
		public TelecomStatusMonitorToolCompositeEditingSupport(ColumnViewer viewer, int col)
		{
			super(viewer);
			
			this.column = col;
		}

		@Override
		protected CellEditor getCellEditor(Object element)
		{
			return new TextCellEditor((Composite) getViewer().getControl());
		}

		@Override
		protected boolean canEdit(Object element)
		{
			switch (column)
			{
				case COLUMN_NAME:
				case COLUMN_ADDRESS:
				case COLUMN_LATENCY_WARNING:
				case COLUMN_LATENCY_ALARM:
				case COLUMN_NO_OF_PACKETS_TO_SEND:
				case COLUMN_PACKET_LOSS_WARNING:
				case COLUMN_PACKET_LOSS_ALARM:
				case COLUMN_TIMEOUT:
					
					return true;
				
				default:
					
					return false;
			}
		}

		@Override
		protected Object getValue(Object element)
		{
			if (element instanceof TelecomNode)
			{
				TelecomNode node = (TelecomNode) element;
				
				switch (column)
				{
					case COLUMN_NAME:
					
						return node.getName();
					
					case COLUMN_ADDRESS:
						
						return node.getAddress();
					
					case COLUMN_NO_OF_PACKETS_TO_SEND:
						
						return Integer.toString(node.getPacketsToSend());
					
					case COLUMN_TIMEOUT:
						
						return Integer.toString(node.getConnectionTimeout());
						
					case COLUMN_LATENCY_WARNING:
						
						return Double.toString(node.getLatencyWarning());
					
					case COLUMN_LATENCY_ALARM:
						
						return Double.toString(node.getLatencyAlarm());
					
					case COLUMN_PACKET_LOSS_WARNING:
						
						return Double.toString(node.getPacketLossWarning());
						
					case COLUMN_PACKET_LOSS_ALARM:
						
						return Double.toString(node.getPacketLossAlarm());
					
					default:
						
						return null;
				}
			}
			else
			{
				return null;
			}
		}

		@Override
		protected void setValue(Object element, Object value)
		{
			if (element instanceof TelecomNode &&
				value instanceof String)
			{
				boolean invalidInput = false;
				String errorMsg = "The provided value was not valid; ";
				
				TelecomNode node = (TelecomNode) element;
				String strVal = (String) value;
				
				EStructuralFeature feature = null;
				Object setVal = null;
				
				switch (column)
				{
					case COLUMN_NAME:
						
						feature = Symphony__AddonsTelecomsPackage.Literals.TELECOM_NODE__NAME;
						setVal = strVal;
						break;
					
					case COLUMN_ADDRESS:
						
						feature = Symphony__AddonsTelecomsPackage.Literals.TELECOM_NODE__ADDRESS;
						setVal = strVal;
						break;
					
					case COLUMN_NO_OF_PACKETS_TO_SEND:
						
						try
						{
							int newNoOfPackets = Integer.parseInt(strVal);
							
							if (newNoOfPackets <= 0)
							{
								invalidInput = true;
							}
							else
							{
								feature = Symphony__AddonsTelecomsPackage.Literals.TELECOM_NODE__PACKETS_TO_SEND;
								setVal = new Integer(newNoOfPackets);
							}
						}
						catch (NumberFormatException ex)
						{
							invalidInput = true;
						}
						
						if (invalidInput == true)
						{
							errorMsg += "The number of packets needs to be a positive whole number (i.e. an integer)";
						}
						
						break;
					
					case COLUMN_TIMEOUT:
						
						try
						{
							int newTimeout = Integer.parseInt(strVal);
							
							if (newTimeout < 0)
							{
								invalidInput = true;
							}
							else
							{
								feature = Symphony__AddonsTelecomsPackage.Literals.TELECOM_NODE__CONNECTION_TIMEOUT;
								setVal = new Integer(newTimeout);
							}
						}
						catch (NumberFormatException ex)
						{
							invalidInput = true;
						}
						
						if (invalidInput == true)
						{
							errorMsg += "The timeout needs to be a non-negative whole number (i.e. an integer)";
						}
						
						break;
					
					case COLUMN_LATENCY_WARNING:
						
						try
						{
							double newLatencyWarning = Double.parseDouble(strVal);
							
							if (newLatencyWarning < 0.0 ||
								newLatencyWarning >= node.getLatencyAlarm())
							{
								invalidInput = true;
							}
							else
							{
								feature = Symphony__AddonsTelecomsPackage.Literals.TELECOM_NODE__LATENCY_WARNING;
								setVal = new Double(newLatencyWarning);
							}
						}
						catch (NumberFormatException ex)
						{
							invalidInput = true;
						}
						
						if (invalidInput == true)
						{
							errorMsg += "The latency warning needs to be a non-negative floating point number, " +
										"that is also less than the current latency alarm value";
						}
						
						break;
					
					case COLUMN_LATENCY_ALARM:
						
						try
						{
							double newLatencyAlarm = Double.parseDouble(strVal);
							
							if (newLatencyAlarm < 0.0 ||
								newLatencyAlarm <= node.getLatencyWarning())
							{
								invalidInput = true;
							}
							else
							{
								feature = Symphony__AddonsTelecomsPackage.Literals.TELECOM_NODE__LATENCY_ALARM;
								setVal = new Double(newLatencyAlarm);
							}
						}
						catch (NumberFormatException ex)
						{
							invalidInput = true;
						}
						
						if (invalidInput == true)
						{
							errorMsg += "The latency alarm needs to be a non-negative floating point number, " +
								    	"that is also greater than the current latency warning value";
						}
						
						break;
					
					case COLUMN_PACKET_LOSS_WARNING:
						
						try
						{
							double newPacketLossWarning = Double.parseDouble(strVal);
							
							if (newPacketLossWarning < 0.0 ||
								newPacketLossWarning >= 100.0 ||
								newPacketLossWarning >= node.getPacketLossAlarm())
							{
								invalidInput = true;
							}
							else
							{
								feature = Symphony__AddonsTelecomsPackage.Literals.TELECOM_NODE__PACKET_LOSS_WARNING;
								setVal = new Double(newPacketLossWarning);
							}
						}
						catch (NumberFormatException ex)
						{
							invalidInput = true;
						}
						
						if (invalidInput == true)
						{
							errorMsg += "The packet loss warning needs to be a floating point number in [0.0, 100.0), " +
										"that is also less than the current packet loss alarm value";
						}
						
						break;
					
					case COLUMN_PACKET_LOSS_ALARM:
						
						try
						{
							double newPacketLossAlarm = Double.parseDouble(strVal);
							
							if (newPacketLossAlarm < 0.0 ||
								newPacketLossAlarm >= 100.0 ||
								newPacketLossAlarm <= node.getPacketLossWarning())
							{
								invalidInput = true;
							}
							else
							{
								feature = Symphony__AddonsTelecomsPackage.Literals.TELECOM_NODE__PACKET_LOSS_ALARM;
								setVal = new Double(newPacketLossAlarm);
							}
						}
						catch (NumberFormatException ex)
						{
							invalidInput = true;
						}
						
						if (invalidInput == true)
						{
							errorMsg += "The packet loss alarm needs to be a floating point number in [0.0, 100.0), " +
										"that is also greater than the current packet loss warning value";
						}
						
						break;
				}
				
				if (invalidInput == true)
				{
					MessageBox msgBox = new MessageBox(getViewer().getControl().getShell(),
													   SWT.ICON_ERROR | SWT.OK);
					msgBox.setText("Invalid Input");
					msgBox.setMessage(errorMsg);
					msgBox.open();
				}
				else
				{
					EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(node);
					
					SetCommand command = new SetCommand(editingDomain,
														node,
														feature,
														setVal);
					
					editingDomain.getCommandStack().execute(command);
				}
			}
		}
	}
	
	private class TelecomStatusMonitorToolCompositeMonitorChangeListener extends AdapterImpl
	{
		@Override
		public void notifyChanged(Notification notification)
		{
			// If the notifier was a status monitor tool
			if (notification.getNotifier() instanceof TelecomStatusMonitorTool)
			{
				// Cast down  
				TelecomStatusMonitorTool statusMonitor = (TelecomStatusMonitorTool) notification.getNotifier();
				
				// If the list of telecom nodes is being changed
				if (notification.getFeatureID(TelecomStatusMonitorTool.class) == Symphony__AddonsTelecomsPackage.TELECOM_STATUS_MONITOR_TOOL__TELECOM_NODES)
				{
					// If neither the composite nor the telecom status monitor has been disposed.
					if (TelecomStatusMonitorToolComposite.this.isDisposed() == false &&
						statusMonitor.isDisposed() == false)
					{
						// If one or more telecom nodes are being added to, moved or removed from the list
						if (notification.getEventType() == Notification.ADD ||
							notification.getEventType() == Notification.ADD_MANY ||
							notification.getEventType() == Notification.REMOVE ||
							notification.getEventType() == Notification.REMOVE_MANY ||
							notification.getEventType() == Notification.MOVE)
						{
							// Refresh the viewer
							treeViewer.refresh();
						}
					}
				}
			}
		}
	}
	
	private class TelecomStatusMonitorToolCompositeListChangeListener extends AdapterImpl
	{
		@Override
		public void notifyChanged(Notification notification)
		{
			// If the notifier is a status monitor tool list
			if (notification.getNotifier() instanceof TelecomStatusMonitorToolList)
			{
				// Cast down
				TelecomStatusMonitorToolList statusMonitorList = (TelecomStatusMonitorToolList) notification.getNotifier();
				
				// If the list of status monitors is being changed
				if (notification.getFeatureID(TelecomStatusMonitorToolList.class) == Symphony__AddonsTelecomsPackage.TELECOM_STATUS_MONITOR_TOOL_LIST__TELECOM_STATUS_MONITORS)
				{
					// If one or more telecom status monitors are being removed from the list
					if (notification.getEventType() == Notification.REMOVE ||
						notification.getEventType() == Notification.REMOVE_MANY)
					{
						// If the telecom status monitor list no longer contains this telecom status monitor
						if (telecomStatusMonitorList.getTelecomStatusMonitors().contains(telecomStatusMonitor) == false)
						{
							// Remove this tool from the composite
							setTelecomStatusMonitorTool(null);
						}
					}
					// Else if there are telecom status monitors being moved
					else if (notification.getEventType() == Notification.MOVE)
					{
						// If the telecom status monitor list no longer contains this telecom status monitor
						if (telecomStatusMonitorList.getTelecomStatusMonitors().contains(telecomStatusMonitor) == false)
						{
							// Stop listening to the old status monitor list
							telecomStatusMonitorList.eAdapters().remove(this);
							
							// Get the new status monitor list
							telecomStatusMonitorList = statusMonitorList;
							
							// Start listening to the new status monitor list
							telecomStatusMonitorList.eAdapters().add(this);
						}
					}
				}
				// Otherwise if the container is changed
				else if (notification.getFeatureID(TelecomStatusMonitorToolList.class) == Symphony__AddonsTelecomsPackage.TELECOM_STATUS_MONITOR_TOOL_LIST__TOOL_LIST)
				{
					// If the container value is being set
					if (notification.getEventType() == Notification.SET)
					{
						// If there is no tool list associated with the monitor list
						if (telecomStatusMonitorList.getToolList() == null)
						{
							// Null out the input
							setTelecomStatusMonitorTool(null);
						}
					}
				}
			}
		}
	}
}
