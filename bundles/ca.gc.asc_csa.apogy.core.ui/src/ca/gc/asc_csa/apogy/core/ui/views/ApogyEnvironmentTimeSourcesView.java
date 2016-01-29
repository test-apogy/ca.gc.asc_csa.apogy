package ca.gc.asc_csa.apogy.core.ui.views;

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
import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade;
import ca.gc.asc_csa.apogy.common.ui.views.AbstractView;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.ui.Activator;
import ca.gc.asc_csa.apogy.core.ui.composites.ApogyEnvironmentTimeSourceComposite;

public class ApogyEnvironmentTimeSourcesView extends AbstractView 
{
	private Adapter activeSessionAdapter = null;
	
	public static final String PART_NAME = "Time Source";
	private ApogyEnvironment apogyEnvironment;
	
	private ApogyEnvironmentTimeSourceComposite apogyEnvironmentTimeSourceComposite;
	
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
		apogyEnvironmentTimeSourceComposite = new ApogyEnvironmentTimeSourceComposite(scrolledContentcomposite, SWT.NONE);
		
		scrolledComposite.setContent(scrolledContentcomposite);
		scrolledComposite.setMinSize(scrolledContentcomposite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		
		// Gets the current Active Session if one exists.
		setApogyEnvironment(getActiveApogyEnvironment());
				
		// Register to the active session.
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().add(getActiveSessionAdapter());
	}
	
	@Override
	public void dispose() 
	{
		// Un-Register to the active session.
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().remove(getActiveSessionAdapter());
	
		setApogyEnvironment(null);	
		
		super.dispose();
	}

	@Override
	public void updatePartName() 
	{
		setPartName(PART_NAME);
	}

	@Override
	public void updateSelection(ISelection selection) 
	{		
		Activator.getDefault();
		
		List<Object> ses = ApogyCommonConvertersUIFacade.INSTANCE.convert(selection, ApogyEnvironment.class);
		
		if(!ses.isEmpty())
		{
			ApogyEnvironment se = (ApogyEnvironment) ses.get(0);
			
			if(se != getApogyEnvironment())
			{
				setApogyEnvironment(se);
			}
		}
	}
	
	public ApogyEnvironment getApogyEnvironment() 
	{
		return apogyEnvironment;
	}

	public void setApogyEnvironment(ApogyEnvironment apogyEnvironment) 
	{				
		this.apogyEnvironment = apogyEnvironment;
		
		if(apogyEnvironmentTimeSourceComposite != null && !apogyEnvironmentTimeSourceComposite.isDisposed())
		{
			apogyEnvironmentTimeSourceComposite.setApogyEnvironment(apogyEnvironment);
		}
	}	
	
	protected ApogyEnvironment getActiveApogyEnvironment()
	{
		ApogyEnvironment apogyEnvironment = null;
		
		InvocatorSession session = ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		if(session != null)
		{
			if(session.getEnvironment() instanceof ApogyEnvironment)
			{
				apogyEnvironment = (ApogyEnvironment) session.getEnvironment();
			}
		}
		
		return apogyEnvironment;
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
					if(msg.getNotifier() instanceof ApogyCoreInvocatorFacade)
					{
						int featureId = msg.getFeatureID(ApogyCoreInvocatorFacade.class);
						switch (featureId) 
						{
							case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION:
								if(msg.getNewValue() instanceof InvocatorSession)
								{																		
									// Gets the current Active Session if one exists.
									setApogyEnvironment(getActiveApogyEnvironment());
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
