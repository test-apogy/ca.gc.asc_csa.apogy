package org.eclipse.symphony.core.ui.views;

import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.core.SymphonyEnvironment;
import org.eclipse.symphony.core.ui.Activator;
import org.eclipse.symphony.core.ui.composites.SymphonyEnvironmentTimeSourceComposite;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession;
import ca.gc.asc_csa.eclipse.ui.views.AbstractView;

public class SymphonyEnvironmentTimeSourcesView extends AbstractView 
{
	private Adapter activeSessionAdapter = null;
	
	public static final String PART_NAME = "Time Source";
	private SymphonyEnvironment symphonyEnvironment;
	
	private SymphonyEnvironmentTimeSourceComposite symphonyEnvironmentTimeSourceComposite;
	
	@Override
	public void createPartControl(Composite parent) 
	{			
		super.createPartControl(parent);
		
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));	
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(container, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		GridData scrolledCompositeGridData = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);		
		scrolledComposite.setLayoutData(scrolledCompositeGridData);
		
		Composite scrolledContentcomposite = new Composite(scrolledComposite, SWT.NONE);		
		scrolledContentcomposite.setLayout(new FillLayout());					
		
		// Add composite
		symphonyEnvironmentTimeSourceComposite = new SymphonyEnvironmentTimeSourceComposite(scrolledContentcomposite, SWT.NONE);
		
		scrolledComposite.setContent(scrolledContentcomposite);
		scrolledComposite.setMinSize(scrolledContentcomposite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		
		// Gets the current Active Session if one exists.
		setSymphonyEnvironment(getActiveSymphonyEnvironment());
				
		// Register to the active session.
		EMFEcoreInvocatorFacade.INSTANCE.eAdapters().add(getActiveSessionAdapter());
	}
	
	@Override
	public void dispose() 
	{
		// Un-Register to the active session.
		EMFEcoreInvocatorFacade.INSTANCE.eAdapters().remove(getActiveSessionAdapter());
	
		setSymphonyEnvironment(null);	
		
		super.dispose();
	}

	@Override
	public void updatePartName() 
	{
		setPartName(PART_NAME);
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public void updateSelection(ISelection selection) 
	{		
		Activator.getDefault();
		List<SymphonyEnvironment> ses = (List<SymphonyEnvironment>) org.eclipse.symphony.common.converters.Activator.convert(selection, SymphonyEnvironment.class);
		if(!ses.isEmpty())
		{							
			SymphonyEnvironment se = ses.get(0);
			
			if(se != getSymphonyEnvironment())
			{
				setSymphonyEnvironment(se);
			}
		}
	}
	
	public SymphonyEnvironment getSymphonyEnvironment() 
	{
		return symphonyEnvironment;
	}

	public void setSymphonyEnvironment(SymphonyEnvironment symphonyEnvironment) 
	{				
		this.symphonyEnvironment = symphonyEnvironment;
		
		if(symphonyEnvironmentTimeSourceComposite != null && !symphonyEnvironmentTimeSourceComposite.isDisposed())
		{
			symphonyEnvironmentTimeSourceComposite.setSymphonyEnvironment(symphonyEnvironment);
		}
	}	
	
	protected SymphonyEnvironment getActiveSymphonyEnvironment()
	{
		SymphonyEnvironment symphonyEnvironment = null;
		
		InvocatorSession session = EMFEcoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		if(session != null)
		{
			if(session.getEnvironment() instanceof SymphonyEnvironment)
			{
				symphonyEnvironment = (SymphonyEnvironment) session.getEnvironment();
			}
		}
		
		return symphonyEnvironment;
	}
	
	private Adapter getActiveSessionAdapter() 
	{
		if(activeSessionAdapter == null)
		{
			activeSessionAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof EMFEcoreInvocatorFacade)
					{
						int featureId = msg.getFeatureID(EMFEcoreInvocatorFacade.class);
						switch (featureId) 
						{
							case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION:
								if(msg.getNewValue() instanceof InvocatorSession)
								{																		
									// Gets the current Active Session if one exists.
									setSymphonyEnvironment(getActiveSymphonyEnvironment());
								}
								
							break;

						default:
							break;
						}
					}
					
				}
			};
		}
		return activeSessionAdapter;
	}
}