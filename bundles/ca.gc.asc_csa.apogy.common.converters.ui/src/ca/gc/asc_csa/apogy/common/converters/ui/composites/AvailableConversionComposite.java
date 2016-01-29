package ca.gc.asc_csa.apogy.common.converters.ui.composites;


import java.util.ArrayList;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge;
import ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade;
import ca.gc.asc_csa.apogy.common.converters.ui.composites.ConvertersUIConstants.ClassNameDisplayMode;
import ca.gc.asc_csa.apogy.common.converters.ui.utils.FullyQualifiedTypesNameComparator;
import ca.gc.asc_csa.apogy.common.converters.ui.utils.ShortTypesNameComparator;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

public class AvailableConversionComposite extends Composite 
{	
	private List inputTypesList = null;
	private List outputTypesList = null;
	
	private ClassNameDisplayMode classNameDisplayMode = ClassNameDisplayMode.SIMPLE_CLASS_NAME;
	private SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> convertersGraph = null;
	private Map<Class<?>, java.util.List<Class<?>>> conversionsMap = null;
	private java.util.List<Class<?>> inputTypesClassList = null;

	public AvailableConversionComposite(Composite parent, int style) 
	{
		this(parent, style, null);
	}
	
	public AvailableConversionComposite(Composite parent, int style, SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> convertersGraph) 
	{
		super(parent, style);
		
		inputTypesList = createInputTypesList();		
		outputTypesList = new List(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		outputTypesList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		setConvertersGraph(convertersGraph);
	}
	
	public ClassNameDisplayMode getClassNameDisplayMode() {
		return classNameDisplayMode;
	}

	public void setClassNameDisplayMode(ClassNameDisplayMode classNameDisplayMode) {
		this.classNameDisplayMode = classNameDisplayMode;
		populateInputTypesList();
		updateOutputTypesList(inputTypesClassList.get(inputTypesList.getSelectionIndex()));
	}
	
	public SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> getConvertersGraph() {
		return convertersGraph;
	}

	public void setConvertersGraph(
			SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> convertersGraph) 
	{
		this.convertersGraph = convertersGraph;		
	
		conversionsMap = ApogyCommonConvertersGraphsFacade.INSTANCE.getAvailableDestinationTypeMap(convertersGraph);
		populateInputTypesList();		
	}
	
	private List createInputTypesList()
	{
		setLayout(new GridLayout(2, false));
		
		Label lblInputTypes = new Label(this, SWT.NONE);
		lblInputTypes.setText("Input Types");
		
		Label lblOutputTypes = new Label(this, SWT.NONE);
		lblOutputTypes.setText("Output Types");
		final List inputTypesList = new List(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		inputTypesList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		inputTypesList.addSelectionListener(new SelectionListener() 
		{
		      public void widgetSelected(SelectionEvent e) 
		      {
		        updateOutputTypesList(inputTypesClassList.get(inputTypesList.getSelectionIndex()));
		      }

			@Override
			public void widgetDefaultSelected(SelectionEvent e) 
			{
				// TODO Auto-generated method stub			
			}		      
		    });
		
		return inputTypesList;
	}
		
	private void populateInputTypesList()
	{
		inputTypesList.removeAll();
		
		SortedSet<Class<?>> sortedSet = new TreeSet<Class<?>>(new ShortTypesNameComparator());
		
		switch(classNameDisplayMode)
		{
			case SIMPLE_CLASS_NAME:				
				sortedSet = new TreeSet<Class<?>>(new ShortTypesNameComparator());
			break;
			case FULLY_QUALIFIED_CLASS_NAME:				
				sortedSet = new TreeSet<Class<?>>(new FullyQualifiedTypesNameComparator());
			break;
			default:
			break;					
		}
		
		sortedSet.addAll(ApogyCommonConvertersGraphsFacade.INSTANCE.getAllInputTypes(convertersGraph));
		
		inputTypesClassList = new ArrayList<Class<?>>();
		inputTypesClassList.addAll(sortedSet);
		
		for(Class<?> inputType : inputTypesClassList)
		{		
			switch(classNameDisplayMode)
			{
				case SIMPLE_CLASS_NAME:				
				inputTypesList.add(inputType.getSimpleName());
				break;
				case FULLY_QUALIFIED_CLASS_NAME:				
				inputTypesList.add(inputType.getName());
				break;
				default:
				break;					
			}
		}
				
		if(inputTypesClassList.size() > 0)
		{
			inputTypesList.setFocus();
			inputTypesList.setSelection(0);
			inputTypesList.select(0);			
		}
	}
	
	private void updateOutputTypesList(Class<?> inputClass)
	{
		outputTypesList.removeAll();
		
		SortedSet<Class<?>> sortedSet = new TreeSet<Class<?>>(new ShortTypesNameComparator());
		sortedSet.addAll(conversionsMap.get(inputClass));
		
		java.util.List<Class<?>> outputTypes = new ArrayList<Class<?>>();
		outputTypes.addAll(sortedSet);
		
		for(Class<?> outputType : outputTypes)
		{
			switch(classNameDisplayMode)
			{
				case SIMPLE_CLASS_NAME:				
					outputTypesList.add(outputType.getSimpleName());
				break;
				case FULLY_QUALIFIED_CLASS_NAME:				
					outputTypesList.add(outputType.getName());
				break;
				default:
				break;					
			}
			
		}
	}
}
