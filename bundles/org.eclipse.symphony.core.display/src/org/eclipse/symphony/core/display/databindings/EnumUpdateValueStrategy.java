package org.eclipse.symphony.core.display.databindings;

import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Control;
import org.eclipse.symphony.core.display.AbstractFeatureDisplay;

public class EnumUpdateValueStrategy extends UpdateValueStrategy 
{
	private EStructuralFeature eStructuralFeature = null;	
	@SuppressWarnings("unused")
	private AbstractFeatureDisplay watchFeatureDisplayProperty = null;
	private Control control = null;

	public EnumUpdateValueStrategy(EStructuralFeature eStructuralFeature, AbstractFeatureDisplay adapter, Control control)
	{
		this.eStructuralFeature = eStructuralFeature;
		this.watchFeatureDisplayProperty = adapter;
		this.control = control;
	}

	public EnumUpdateValueStrategy(EStructuralFeature eStructuralFeature, Control control)
	{
		this(eStructuralFeature, null, control);
	}
	
	@Override
	public Object convert(Object value) 
	{									
		if(control != null)
		{
			String documentation = "";
			if((value != null) && this.eStructuralFeature.getEType() instanceof EEnum)
			{
				try
				{
					EEnum eenum = (EEnum) this.eStructuralFeature.getEType();
					Enumerator enumerator = (Enumerator) value;
					EEnumLiteral literal = eenum.getEEnumLiteral(enumerator.getValue());
									
					documentation = getAnnotationDetail(literal, "documentation");
					if(documentation == null) documentation = "";								
					control.setToolTipText(documentation);
				}
				catch(Exception e)
				{
					e.printStackTrace();					
				}
			}
			
			control.setToolTipText(documentation);
		}
		return super.convert(value);
	}
	
	private String getAnnotationDetail(EEnumLiteral literal, String key)
	{
		EAnnotation annotation = literal.getEAnnotation("http://www.eclipse.org/emf/2002/GenModel");
		if(annotation != null)
		{
			EMap<String, String> map = annotation.getDetails();
			if(map != null) return map.get(key);			
		}
		return null;
	}
}
