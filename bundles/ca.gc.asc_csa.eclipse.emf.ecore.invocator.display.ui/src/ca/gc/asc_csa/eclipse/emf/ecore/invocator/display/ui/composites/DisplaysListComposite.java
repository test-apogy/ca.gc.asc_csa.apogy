package ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.ui.composites;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureNode;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractDisplay;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Context;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.DisplaysList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Environment;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.DisplayFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.EMFEcoreInvocatorDisplayFactory;

public class DisplaysListComposite extends Composite 
{
	public static final DisplayFacade DISPLAY_FACADE = EMFEcoreInvocatorDisplayFactory.eINSTANCE.createDisplayFacade();
	
	private InvocatorSession invocatorSession = null;
	private Adapter executionEnvironmentAdapter = null;
		
	private DisplaysList displaysList = null;
	private Adapter displaysListAdapter = null;
	
	private DisplayTable watchFeatureTable;
	
	public DisplaysListComposite(Composite parent, int style) 
	{
		super(parent, style);	
		setLayout(new FillLayout());
		
		watchFeatureTable = new DisplayTable(this, SWT.MULTI);
	}

	@Override
	public void dispose() 
	{
		// Remove listener from previous list if applicable.
		if(this.displaysList != null) this.displaysList.eAdapters().remove(getDisplaysListAdapter());
				
		if(watchFeatureTable != null) watchFeatureTable.dispose();
		
		super.dispose();
	}
	
	public void setDisplaysList(final DisplaysList newDisplaysList) 
	{
		Display.getDefault().asyncExec(new Runnable() 
		{			
			@Override
			public void run() 
			{			
				// Remove listener from previous list if applicable.
				if(displaysList != null) displaysList.eAdapters().remove(getDisplaysListAdapter());
						
				// Adds listener to new list if applicable.
				if(newDisplaysList != null) newDisplaysList.eAdapters().add(getDisplaysListAdapter());
						
				// Clears the table;
				watchFeatureTable.removeAll();
				watchFeatureTable.deselectAll();
				
				// Populates the list, if applicable
				if(newDisplaysList != null)
				{					
					Iterator<AbstractDisplay> it = newDisplaysList.getDisplays().iterator();
					while(it.hasNext())
					{
						watchFeatureTable.add(it.next());
					}
					
					// Updates the Invocator Session.
					setInvocatorSession(resolveInvocatorSession(newDisplaysList));
				}
				else
				{
					setInvocatorSession(null);
				}
				
				displaysList = newDisplaysList;
			}
		});		
	}

	public void select(final AbstractDisplay abstractDisplay)
	{
		if(watchFeatureTable != null)
		{
			watchFeatureTable.select(abstractDisplay);
		}
	}
	
	public void select(final AbstractFeatureNode abstractFeatureNode)
	{
		if(watchFeatureTable != null)
		{
			watchFeatureTable.select(abstractFeatureNode);
		}
	}
	
	protected InvocatorSession resolveInvocatorSession(DisplaysList displaysList)
	{
		if(displaysList != null)
		{
			return displaysList.getDisplaysListsContainer().getToolsList().getInvocatorSession();
		}		
		else
		{
			return null;
		}
	}
	
	protected void setInvocatorSession(InvocatorSession newInvocatorSession)
	{
		// Removes listener from previous ExecutionEnvironment.
		if(this.invocatorSession != null) this.invocatorSession.eAdapters().remove(getInvocatorSessionAdapter());

		// Add listener to new execution environment if applicable.
		if(newInvocatorSession != null) newInvocatorSession.eAdapters().add(getInvocatorSessionAdapter());
		
		this.invocatorSession = newInvocatorSession;
	}
	
	protected Adapter getDisplaysListAdapter() 
	{
		if(displaysListAdapter == null)
		{
			displaysListAdapter = new EContentAdapter()
			{
				@SuppressWarnings({ "unchecked"})
				@Override
				public void notifyChanged(Notification notification) 
				{																				
					if(notification.getNotifier() instanceof DisplaysList)
					{
						// Changes in the list of Displays
						if(notification.getFeatureID(DisplaysList.class) == EMFEcoreInvocatorPackage.DISPLAYS_LIST__DISPLAYS)
						{
							if(notification.getEventType() == Notification.ADD)
							{
								addAbstractDisplay((AbstractDisplay) notification.getNewValue());
							}
							else if(notification.getEventType() == Notification.ADD_MANY)
							{
								List<AbstractDisplay> watches = (List<AbstractDisplay>) notification.getNewValue();
								addAbstractDisplays(watches);
							}
							else if(notification.getEventType() == Notification.REMOVE)
							{
								removeAbstractDisplay((AbstractDisplay) notification.getOldValue());
							}
							else if(notification.getEventType() == Notification.REMOVE_MANY)
							{
								List<AbstractDisplay> watches = (List<AbstractDisplay>) notification.getOldValue();
								removeAbstractDisplays(watches);
							}
							else if(notification.getEventType() == Notification.MOVE)
							{
								if(notification.getOldValue() instanceof Integer)
								{
									int fromIndex = ((Integer)notification.getOldValue()).intValue();
									int toIndex = notification.getPosition();
									AbstractDisplay abstractDisplay = (AbstractDisplay)  notification.getNewValue();									
									moveAbstractDisplay(abstractDisplay, fromIndex, toIndex);									
								}
							}
						}	
					}							
															
					super.notifyChanged(notification);
				}
			};
		}
		
		return displaysListAdapter;
	}
	
	protected Adapter getInvocatorSessionAdapter()
	{
		if(executionEnvironmentAdapter == null)
		{
			executionEnvironmentAdapter = new EContentAdapter()
			{
				@Override
				public void notifyChanged(Notification notification) 
				{
					if(notification.getNotifier() instanceof InvocatorSession)
					{
						if(notification.getFeatureID(InvocatorSession.class) == EMFEcoreInvocatorPackage.INVOCATOR_SESSION__ENVIRONMENT)
						{
							// Environment has changed.
							if(notification.getOldValue() instanceof Environment)
							{
								Environment oldEnvironment = (Environment) notification.getOldValue();
								oldEnvironment.eAdapters().remove(getInvocatorSessionAdapter());
							}
							
							if(notification.getNewValue() instanceof Environment)
							{
								Environment newEnvironment = (Environment) notification.getNewValue();
								newEnvironment.eAdapters().add(getInvocatorSessionAdapter());
								
								// Updates the Context.
								updateContext(newEnvironment.getActiveContext());
							}
						}
					}
					else if(notification.getNotifier() instanceof Environment)
					{
						if(notification.getFeatureID(Environment.class) == EMFEcoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT)
						{
							// Active context has changed.
							Context context = (Context) notification.getNewValue();
							updateContext(context);
						}
					}
					
					super.notifyChanged(notification);
				}
			};
		}
		
		return executionEnvironmentAdapter;
	}
			
	@Override
	protected void checkSubclass() {	
	}
	
	protected void addAbstractDisplay(final AbstractDisplay abstractDisplay)
	{
		Display.getDefault().asyncExec(new Runnable() 
		{			
			@Override
			public void run() 
			{			
				watchFeatureTable.add(abstractDisplay);
			}
		});		
	}
	
	protected void addAbstractDisplays(final List<AbstractDisplay> displays)
	{	
		Display.getDefault().asyncExec(new Runnable() 
		{			
			@Override
			public void run() 
			{			
				watchFeatureTable.add(displays);
			}
		});				
	}
	
	protected void removeAbstractDisplay(final AbstractDisplay abstractDisplay)
	{
		Display.getDefault().asyncExec(new Runnable() 
		{			
			@Override
			public void run() 
			{			
				watchFeatureTable.remove(abstractDisplay);
			}
		});		
	}
	
	protected void removeAbstractDisplays(final List<AbstractDisplay> displays)
	{
		Display.getDefault().asyncExec(new Runnable() 
		{			
			@Override
			public void run() 
			{			
				watchFeatureTable.remove(displays);
			}
		});				
	}
	
	protected void moveAbstractDisplay(final AbstractDisplay abstractDisplay, final int fromIndex, final int toIndex)
	{
		Display.getDefault().asyncExec(new Runnable() 
		{			
			@Override
			public void run() 
			{			
				watchFeatureTable.moveDisplay(abstractDisplay, fromIndex, toIndex);
			}
		});			
	}
	
	protected void updateContext(final Context context)
	{
		Display.getDefault().asyncExec(new Runnable() 
		{			
			@Override
			public void run() 
			{			
				watchFeatureTable.updateContext(context);
			}
		});			
	}
}
