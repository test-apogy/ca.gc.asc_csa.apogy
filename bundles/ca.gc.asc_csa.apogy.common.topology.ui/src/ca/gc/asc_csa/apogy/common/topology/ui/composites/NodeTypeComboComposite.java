package ca.gc.asc_csa.apogy.common.topology.ui.composites;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;

public class NodeTypeComboComposite extends Composite 
{
	// The list of available Node types.
	protected static List<EClass> nodeTypes = ApogyCommonEMFFacade.INSTANCE.getAllSubEClasses(ApogyCommonTopologyPackage.Literals.NODE);
	
	protected Map<String, EClass> typeNameToEClassMap = new TreeMap<String, EClass>();
		
	private Combo combo;
	
	public NodeTypeComboComposite(Composite parent, int style) 
	{
		super(parent, style);	
		
		setLayout(new FillLayout());
		combo = createCombo(this, SWT.READ_ONLY);
		combo.select(0);		
		
		combo.addSelectionListener(new SelectionListener() 
		{			
			@Override
			public void widgetSelected(SelectionEvent e) 
			{					
				int index = combo.getSelectionIndex();
				typeSelected(typeNameToEClassMap.get(combo.getItem(index)));
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) 
			{				
			}
		});
	}		
	
	public void clearSelection()
	{
		combo.select(0);
		
		typeSelected(null);
	}
	
	/**
	 * Method to be overloaded by user.
	 * @param eClass The eClass selected by the user, can be null;
	 */
	public void typeSelected(EClass eClass)
	{		
	}
	
	protected String getTypeNameForEClass(EClass eClass)
	{
		return eClass.getName();
	}
	
	private Combo createCombo(Composite parent, int style)
	{
		Combo combo = new Combo(parent, SWT.READ_ONLY);
		
		// Fills in the combo values.
		String[] typeNames = createNodeTypeNames();
			
		combo.setItems(typeNames);
		
		return combo;
	}
	
	private String[] createNodeTypeNames()
	{				
		// Adds the null entry at the top of the list.
		typeNameToEClassMap.put("", null);
		
		for(EClass eClass : nodeTypes)
		{
			typeNameToEClassMap.put(getTypeNameForEClass(eClass), eClass);
		}
	
		String[] typeNames = new String[typeNameToEClassMap.keySet().size()];		
		return typeNameToEClassMap.keySet().toArray(typeNames);
	}

}
