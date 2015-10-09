/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.display.impl;

import java.awt.Color;
import java.awt.Point;
import java.util.SortedMap;
import java.util.TreeMap;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.symphony.common.databinding.converters.BooleanToDoubleConverter;
import org.eclipse.symphony.common.databinding.converters.NumberToDoubleConverter;
import org.eclipse.symphony.common.emf.databinding.converters.EnumeratorToDoubleConverter;
import org.eclipse.symphony.common.emf.ui.EMFEcoreUIFacade;
import org.eclipse.symphony.core.display.AbstractFeatureDisplay;
import org.eclipse.symphony.core.display.DisplayFacade;
import org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayFactory;
import org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayPackage;
import org.eclipse.symphony.core.display.HistoryData;
import org.eclipse.symphony.core.display.NumberVersusTimeHistoryData;
import org.eclipse.symphony.core.display.NumberVsTimePlotDisplay;
import org.eclipse.symphony.core.display.composites.NumberVsTimeChartComposite;
import org.eclipse.symphony.core.display.databindings.UpdateValueStrategyWithRange;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.TimeSeriesDataItem;

import ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureSpecifier;
import ca.gc.asc_csa.eclipse.emf.ecore.Ranges;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Vs Time Plot Display</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NumberVsTimePlotDisplayImpl extends AbstractPlotDisplayImpl implements NumberVsTimePlotDisplay
{
	public static final Color RESOLVED_COLOR = new Color(255, 255, 255);
	public static final Color NOT_RESOLVED_COLOR = new Color(128, 128, 128);
		
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected NumberVsTimePlotDisplayImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return EMFEcoreInvocatorDisplayPackage.Literals.NUMBER_VS_TIME_PLOT_DISPLAY;
	}

  @Override
  public Control createControl(Composite parent) 
  {
	  NumberVsTimeChartComposite control = new NumberVsTimeChartComposite(parent, SWT.NONE, this);
	  control.setUseDataBuffering(isUseDataBuffering());
	  control.setRepeatLastValue(isRepeatLastValue());	
	  control.setHistoryLength(getHistoryLength());
	  return control;
  }
  
  @Override
  public DataBindingContext bindControl(Control control) 
  {
		DataBindingContext bindingContext = null;
										
		IObservableValue observeValue = DisplayFacade.INSTANCE.getIObservableValue(this, control);
								
		// Creates a new binding.
		if(observeValue != null)
		{					
			bindingContext = new DataBindingContext();
			
			EStructuralFeature eStructuralFeature = getEStructuralFeature(this);
			
			if(eStructuralFeature != null)
			{				
				if(((eStructuralFeature.getEType().getInstanceClass() == double.class) ||
						(eStructuralFeature.getEType().getInstanceClass() == float.class) ||
						(eStructuralFeature.getEType().getInstanceClass() == short.class) ||
						(eStructuralFeature.getEType().getInstanceClass() == long.class) ||
						(eStructuralFeature.getEType().getInstanceClass() == int.class)))
				{												
							IObservableValue observeWidget = PojoObservables.observeValue(control, "currentValue");									
							UpdateValueStrategy strategy = new UpdateValueStrategyWithRange(eStructuralFeature, this, control);
							strategy.setConverter(new NumberToDoubleConverter());
							
							bindingContext.bindValue(observeWidget, observeValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), strategy);
				}
				else if(eStructuralFeature.getEType().getInstanceClass() == boolean.class)
				{
					IObservableValue observeWidget = PojoObservables.observeValue(control, "currentValue");							
					UpdateValueStrategy strategy = new UpdateValueStrategyWithRange(eStructuralFeature, this, control);
					strategy.setConverter(new BooleanToDoubleConverter());
					
					bindingContext.bindValue(observeWidget, observeValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), strategy);
				}
				else if(eStructuralFeature.getEType() instanceof EEnum)
				{
					IObservableValue observeWidget = PojoObservables.observeValue(control, "currentValue");							 
					UpdateValueStrategy strategy = new UpdateValueStrategyWithRange(eStructuralFeature, this, control);
					strategy.setConverter(new EnumeratorToDoubleConverter());
					
					bindingContext.bindValue(observeWidget, observeValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), strategy);
				}
			}
		}		
		
		return bindingContext;
  }
  
  @Override
  public void updateRange(Control control, Ranges range) 
  {
	  if(!control.isDisposed())
	  {
		    NumberVsTimeChartComposite timeChart = (NumberVsTimeChartComposite) control;
		  
			org.eclipse.swt.graphics.Color color = EMFEcoreUIFacade.INSTANCE.getColorForRange(range);
			
			if(color != null)
			{
				timeChart.getChart().getPlot().setBackgroundPaint(new Color(color.getRed(), color.getGreen(), color.getBlue()));
			}
			else
			{
				org.eclipse.swt.graphics.Color newColor = new org.eclipse.swt.graphics.Color(control.getDisplay(), 255, 255, 255);
				timeChart.getChart().getPlot().setBackgroundPaint(new Color(newColor.getRed(), newColor.getGreen(), newColor.getBlue()));
			}
	  }
  }
  
  @Override
  public void updateResolved(Control control, boolean resolved) 
  {
	  if(control instanceof NumberVsTimeChartComposite)
	  {
		  NumberVsTimeChartComposite numberVsTimeChartComposite = (NumberVsTimeChartComposite) control;
		  
		  if(resolved)
		  {
			  numberVsTimeChartComposite.getChart().setBackgroundPaint(RESOLVED_COLOR);		
		  }
		  else
		  {
			  numberVsTimeChartComposite.getChart().setBackgroundPaint(NOT_RESOLVED_COLOR);	
		  }
	  }	  	 	
  }
  
	protected EStructuralFeature getEStructuralFeature(final AbstractFeatureDisplay watchFeature)
	{
		EStructuralFeature eStructuralFeature = null;
		
		if(watchFeature.getAbstractFeatureNode() instanceof AbstractFeatureSpecifier)
		{
			AbstractFeatureSpecifier abstractFeatureSpecifier = (AbstractFeatureSpecifier) watchFeature.getAbstractFeatureNode();			
			eStructuralFeature = abstractFeatureSpecifier.getStructuralFeature() ;		
		}
		
		return eStructuralFeature;
	}

	@Override
	public void applyHistoryData(Control control, HistoryData historyData) 
	{
		if(control instanceof NumberVsTimeChartComposite)
		{
			NumberVsTimeChartComposite numberVsTimeChartComposite = (NumberVsTimeChartComposite) control;
			
			if(numberVsTimeChartComposite.getTimeSeriesCollection().getSeriesCount() > 0)
			{
				numberVsTimeChartComposite.getTimeSeriesCollection().getSeries(0).clear();
			}
			
			if(historyData instanceof NumberVersusTimeHistoryData)
			{
				NumberVersusTimeHistoryData history = (NumberVersusTimeHistoryData) historyData;
				if(history.getHistoryData() != null)
				{
					for(Long time : history.getHistoryData().keySet())
					{
						Number value  = history.getHistoryData().get(time);
						if(value != null)
						{
							numberVsTimeChartComposite.setCurrentValue(value, time);
						}
					}
				}
			}
		}
	}
	
	@Override
	public HistoryData getHistoryData(Control control) 
	{
		NumberVersusTimeHistoryData data = EMFEcoreInvocatorDisplayFactory.eINSTANCE.createNumberVersusTimeHistoryData();
		SortedMap<Long, Number> map = new TreeMap<Long, Number>();
		
		if(control instanceof NumberVsTimeChartComposite)
		{
			NumberVsTimeChartComposite numberVsTimeChartComposite = (NumberVsTimeChartComposite) control;
			TimeSeriesCollection timeSeriesCollection = numberVsTimeChartComposite.getTimeSeriesCollection();
			
			if(timeSeriesCollection != null && timeSeriesCollection.getSeriesCount() > 0)
			{
				TimeSeries timeSeries = timeSeriesCollection.getSeries(0);				
							
				for(int i = 0; i < timeSeries.getItemCount(); i++)
				{
					TimeSeriesDataItem item = timeSeries.getDataItem(i);
					Long time = item.getPeriod().getStart().getTime();
					Number value = item.getValue();
					
					map.put(time, value);
				}
			}
		}
		
		data.setHistoryData(map);
		return data;		
	}
	
	@Override
	public Point getControlMinimumSize(	AbstractFeatureDisplay abstractFeatureDisplay, Control control) 
	{	
		Point point = super.getControlMinimumSize(abstractFeatureDisplay, control);
		
		
		if(point == null)
		{
			point = new Point(200, 400);
		}
		
		return point;
	}
} //NumberVsTimePlotDisplayImpl
