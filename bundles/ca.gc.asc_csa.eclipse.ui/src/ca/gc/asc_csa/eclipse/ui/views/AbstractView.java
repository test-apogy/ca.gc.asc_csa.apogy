package ca.gc.asc_csa.eclipse.ui.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

import ca.gc.asc_csa.eclipse.ui.actions.PinViewAction;
import ca.gc.asc_csa.eclipse.ui.properties.ExtendedTabbedPropertySheetPage;

public abstract class AbstractView extends ViewPart implements ISelectionListener, Pinnable, ITabbedPropertySheetPageContributor
{
	/**
	 * List of listeners registered to be notify of new selection.
	 */
	private List<ISelectionListener> selectionListeners = null;
	
	
	protected ISelection currentSelection = null;
			
	protected boolean pinned = false;
	protected boolean busy = false;


	private ISelectionProvider selectionProvider;

	abstract public void updatePartName();	
	abstract public void updateSelection(ISelection selection);

	public void createPartControl(Composite parent) 
	{
		addActions();		
		getSite().getPage().addSelectionListener(this);
		getSite().setSelectionProvider(getSelectionProvider());
	}
	
	/**
	 * Returns the {@link ISelectionProvider} used by this part.
	 * @return Reference to the {@link ISelectionProvider}
	 */
	protected ISelectionProvider getSelectionProvider(){
		if (selectionProvider == null){
			selectionProvider = new SelectionProvider();
		}
		return selectionProvider;
	}
	
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) 
	{
		if(!isPinned() && !isBusy() && part!=this)
		{
			if(!selection.equals(currentSelection))
			{
				this.currentSelection = selection;
				updateSelection(selection);	
				
				// Notify listener that have registered to new selection.
				notifySelectionListeners(selection);
			}			
		}			
	}
			
	@Override
	public void dispose() 
	{
		getSite().getPage().removeSelectionListener(this);
		getSite().setSelectionProvider(getSelectionProvider());
		super.dispose();
	}
	
	@Override
	public boolean isPinned() 
	{		
		return this.pinned;
	}

	@Override
	public void setPinned(boolean pinView) 
	{		
		this.pinned = pinView;
	}
	
	@Override
	public void showBusy(boolean busy) 
	{
		setBusy(busy);		
		super.showBusy(busy);				
	}
			
	@Override
	public void setFocus() {	
	}
	
	public boolean isBusy()
	{
		return busy;
	}
	
	public void setBusy(boolean busy)
	{
		this.busy = busy;
		
		updatePartName();
	}
	
	public void addActions()
	{
		/* Creates Pin Action */
		PinViewAction pinViewAction = new PinViewAction(this);
		pinViewAction.setChecked(isPinned());
		
		/* Add Pin action to toolbars*/
		this.getViewSite().getActionBars().getToolBarManager().add(pinViewAction);
		this.getViewSite().getActionBars().getMenuManager().add(pinViewAction);
	}
	
	public void addSelectionListener(ISelectionListener listener)
	{
		if(listener != null)
		{
			getSelectionListeners().add(listener);
			
			if(currentSelection != null)
			{
				listener.selectionChanged(this, currentSelection);
			}
		}		
	}
	
	public void removeSelectionListener(ISelectionListener listener)
	{
		if(listener != null)
		{
			getSelectionListeners().remove(listener);
		}
	}
	
	private void notifySelectionListeners(ISelection newsSelection)
	{
		for(ISelectionListener listener : getSelectionListeners())
		{
			try
			{
				listener.selectionChanged(this, newsSelection);
			}
			catch(Throwable t)
			{
				t.printStackTrace();
			}
		}
	}
	
	private List<ISelectionListener> getSelectionListeners()
	{
		if(selectionListeners == null)
		{
			selectionListeners = new ArrayList<ISelectionListener>();
		}
		
		return selectionListeners;
	}
	
	/**
	 * Default class implementation of the {@link ISelectionProvider}.
	 */
	private class SelectionProvider implements ISelectionProvider{

		private ListenerList listeners = new ListenerList();
		private ISelection currentSelection = null;
		
		@Override
		public void addSelectionChangedListener(
				ISelectionChangedListener listener) {
			listeners.add(listener);			
		}

		@Override
		public ISelection getSelection() {
			return currentSelection;
		}

		@Override
		public void removeSelectionChangedListener(
				ISelectionChangedListener listener) {
			listeners.remove(listener);			
		}

		@Override
		public void setSelection(ISelection selection) {
			this.currentSelection = selection;
			Object[] list = listeners.getListeners();
			  for (int i = 0; i < list.length; i++) {
			   ((ISelectionChangedListener) list[i])
			     .selectionChanged(new SelectionChangedEvent(this, selection));
			  }
		}		
	}
	
	@Override
	public String getContributorId() {
		return ExtendedTabbedPropertySheetPage.PROPERTY_CONTRIBUTOR_ID;
	}
	
	public Object getAdapter(@SuppressWarnings("rawtypes") Class key) {
		if (key.equals(IPropertySheetPage.class)) {
			IPropertySheetPage propertySheetPage = new ExtendedTabbedPropertySheetPage(
					this,
					new ComposedAdapterFactory(
							ComposedAdapterFactory.Descriptor.Registry.INSTANCE));
			return propertySheetPage;
		} else {
			return super.getAdapter(key);
		}
	}
}