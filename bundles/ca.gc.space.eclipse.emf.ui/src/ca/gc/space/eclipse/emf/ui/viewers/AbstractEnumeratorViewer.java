package ca.gc.space.eclipse.emf.ui.viewers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;


/**
 * Property cell editor for {@link AbstractEnumerator}.
 * 
 * <PRE>
 * 
 * Phoenix Meteorological Station (MET) Ground Data System (GDS)
 * Canadian Space Agency / Agence spatiale canadienne
 * 6767 route de l'Aeroport
 * St-Hubert, Québec, Canada
 * J3Y 8Y9
 * www.space.gc.ca
 * Copyrights (c)
 * </PRE> 
 */
public class AbstractEnumeratorViewer extends Viewer
{
	private AbstractEnumerator enumeratorItem = null;
	private List <AbstractEnumerator> enumeratorList = null;
	private Composite parent = null;
	private ComboViewer comboViewer = null;	
	
	private ILabelProvider labelProvider = null;
	private IStructuredContentProvider contentProvider = null;
	
	public AbstractEnumeratorViewer(Composite parent)
	{
		super();
		this.parent = parent;
	}
	
	@Override
	public Control getControl() {		
		return getComboViewer().getControl();
	}
		
	@Override
	public Object getInput() {	
		return enumeratorItem;
	}

	@Override
	public ISelection getSelection() {		
		return getComboViewer().getSelection();				
	}

	@Override
	public void refresh() 
	{		
		getComboViewer().setInput(getAbstractEnumeratorList());
	}

	@Override
	public void setInput(Object input) {
		
		if(input instanceof AbstractEnumerator)
		{			
			enumeratorItem = (AbstractEnumerator) input;			
		}
		else
		{
			enumeratorItem = null;			
		}
		
		refresh();
	}

	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		getComboViewer().setSelection(selection, reveal);
	}

	private ComboViewer getComboViewer()
	{
		if(comboViewer == null)
		{
			comboViewer = new ComboViewer(parent);	
			comboViewer.setLabelProvider(getLabelProvider());
			comboViewer.setContentProvider(getContentProvider());						
		}
		
		return comboViewer;
	}
	
	@SuppressWarnings("unchecked")
	private List <AbstractEnumerator> getAbstractEnumeratorList()
	{
		if(enumeratorList == null)
		{
			enumeratorList = new ArrayList<AbstractEnumerator>();		
		}		
		enumeratorList.clear();
		
		try 
		{
			if(enumeratorItem != null)
			{
				List list = (List) enumeratorItem.getClass().getDeclaredField("VALUES").get(enumeratorItem);
				for (int i = 0; i < list.size(); i++)
				{				
					enumeratorList.add((AbstractEnumerator) list.get(i));			
				}
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}		
				
		return enumeratorList;
	}
	
	private ILabelProvider getLabelProvider()
	{
		if(labelProvider == null)
		{
			labelProvider = new LabelProvider()
			{
				public String getText(Object element) {
					
					AbstractEnumerator abstractEnumerator = (AbstractEnumerator) element;					
					return abstractEnumerator.getName();
				}	
			};
		}
		
		return labelProvider;
	}
	
	private IStructuredContentProvider getContentProvider()
	{
		if(contentProvider == null)
		{
			contentProvider = new IStructuredContentProvider()
			{
				@SuppressWarnings("unchecked")
				public Object[] getElements(Object inputElement) {					
					
					List <AbstractEnumerator> list = (List <AbstractEnumerator>) inputElement;
					return list.toArray();
				}

				public void dispose() {					
				}

				public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {		
				}
			};
		}
		
		return contentProvider;
	}	
	
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {		
		getComboViewer().addSelectionChangedListener(listener);
	}
	
	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {		
		getComboViewer().removeSelectionChangedListener(listener);
	}
}