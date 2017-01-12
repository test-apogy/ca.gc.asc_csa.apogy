package ca.gc.asc_csa.apogy.common.topology.ui.composites;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.fieldassist.AutoCompleteField;
import org.eclipse.jface.fieldassist.ComboContentAdapter;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;

public class NodeTypeComboComposite extends Composite 
{
	// The list of available Node types.	
	protected static Collection<EClass> availableNodeTypes = ApogyCommonEMFFacade.INSTANCE.getAllSubEClasses(ApogyCommonTopologyPackage.Literals.NODE);					
	
	private ComboViewer comboViewer;
	private TypeFilter typeFilter = new TypeFilter();
	
	public NodeTypeComboComposite(Composite parent, int style) 
	{
		super(parent, style);	
		
		setLayout(new FillLayout());
		comboViewer = createCombo(this, SWT.READ_ONLY);		
		comboViewer.addSelectionChangedListener(new ISelectionChangedListener() 
		{		
			@Override
			public void selectionChanged(SelectionChangedEvent event) 
			{	
				System.out.println("HELLO");
				
				if(event.getSelection().isEmpty())
				{
					typeSelected(null);
				}
				else if(event.getSelection() instanceof IStructuredSelection)
				{
					IStructuredSelection iStructuredSelection = (IStructuredSelection) event.getSelection();
					if(iStructuredSelection.getFirstElement() instanceof EClass)
					{
						typeSelected((EClass)iStructuredSelection.getFirstElement());
					}
					else
					{
						typeSelected(null);
					}
				}
			}
		});				
	}		
	
	public void clearSelection()
	{
		//typeFilter.setSearchString("");
		comboViewer.setSelection(null);				
		typeSelected(null);
	}
	
	/**
	 * Method to be overloaded by user.
	 * @param eClass The eClass selected by the user, can be null;
	 */
	public void typeSelected(EClass eClass)
	{		
	}
	
	/**
	 * Returns the name to be displayed for a given EClass. Can be overloaded to change what gets displayed.
	 * @param eClass The specified EClass
	 * @return The String to be displayed for the specified EClass.
	 */
	protected String getTypeNameForEClass(EClass eClass)
	{
		return eClass.getName();
	}
	
	protected SortedSet<EClass> getSortedEClass()
	{
		SortedSet<EClass> sortedEClass = new TreeSet<EClass>(new Comparator<EClass>() 
		{
			@Override
			public int compare(EClass o1, EClass o2) 
			{
				String s1 = getTypeNameForEClass(o1);
				String s2 = getTypeNameForEClass(o2);						
				
				return s1.compareTo(s2);
			}
		});
		
		sortedEClass.addAll(availableNodeTypes);
		
		return sortedEClass;
	}
	
	private ComboViewer createCombo(Composite parent, int style)
	{
		ComboViewer comboViewer = new ComboViewer(parent, SWT.DROP_DOWN);		
		comboViewer.setContentProvider(ArrayContentProvider.getInstance());
		comboViewer.setLabelProvider(new LabelProvider()
		{
			@Override
			public String getText(Object element) 
			{
				if(element instanceof EClass)
				{
					EClass eClass = (EClass) element;
					return getTypeNameForEClass(eClass);
				}
				else
				{
					return "";
				}
			}
		});
				
		// Display the comboe element sorted by displayed name.
		comboViewer.setComparator(new ViewerComparator()
		{
			@Override
			public int compare(Viewer viewer, Object e1, Object e2) 
			{
				EClass eClass1 = (EClass) e1;
				EClass eClass2 = (EClass) e2;
				
				String string1 = getTypeNameForEClass(eClass1);
				String string2 = getTypeNameForEClass(eClass2);
				
				return string1.compareTo(string2);				
			}
		});
		
		// comboViewer.setFilters(typeFilter);
		
//		comboViewer.getCombo().addKeyListener(new KeyListener() 
//		{		
//			@Override
//			public void keyReleased(KeyEvent e) 
//			{
//				if(e.keyCode == SWT.ESC)
//				{
//					typeFilter.clearSearchString();
//				}
//				
//				// Backspace
//				if(e.keyCode == 8)
//				{
//					typeFilter.removeLastCharFromSearchString();
//				}
//				
//				// Alphabetical Chars.
//				else if(e.keyCode >= 97 && e.keyCode <= 122)
//				{					
//					typeFilter.appendToSearchString(new Character(e.character).toString());
//				}
//				// Numericals
//				else if(e.keyCode >= 48 && e.keyCode <= 57)
//				{
//					typeFilter.appendToSearchString(new Character(e.character).toString());
//				}
//				comboViewer.refresh();
//			}
//			
//			@Override
//			public void keyPressed(KeyEvent e) {		
//			}
//		});
		
		SortedSet<EClass> sortedEClass = getSortedEClass();
		
		String[] proposals = new String[sortedEClass.size()];
		int i = 0;
		for(EClass eClass : sortedEClass)
		{
			proposals[i] = getTypeNameForEClass(eClass);
			i++;
		}

		// Adds auto complete function.
		new AutoCompleteField(comboViewer.getControl(), new ComboContentAdapter(), proposals);
		
		comboViewer.setInput(availableNodeTypes);
				
		return comboViewer;
	}	
		
	
	private class TypeFilter extends ViewerFilter
	{
		private String searchString = "";
			
		public void clearSearchString()
		{
			this.searchString = "";
		}
		
		public void removeLastCharFromSearchString()
		{
			if(searchString != null && searchString.length() > 0)
			{
				searchString = searchString.substring(1);
			}
			
			System.out.println("Search : " + searchString);
		}
		
		public void appendToSearchString(String ch)
		{
			this.searchString = searchString + ch;
			
			System.out.println("Search : " + searchString);
		}

		@Override
		public boolean select(Viewer viewer, Object parentElement, Object element) 
		{
			if(searchString == null || searchString.length() == 0)
			{
				return true;
			}
			
			EClass eClass = (EClass) element;
			String label = getTypeNameForEClass(eClass);
			
			System.out.println("NodeTypeComboComposite.TypeFilter.select() " + searchString);
			
			return (label.matches(".*" + searchString + ".*"));
		}
	}
}
