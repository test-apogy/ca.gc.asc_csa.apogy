package org.eclipse.symphony.core.ui.views;

import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.symphony.core.PoseProvider;
import org.eclipse.symphony.core.SymphonyCoreFactory;
import org.eclipse.symphony.core.invocator.AbstractTypeImplementation;
import org.eclipse.symphony.core.invocator.TypeMemberImplementation;
import org.eclipse.symphony.core.invocator.VariableImplementation;
import org.eclipse.symphony.core.ui.actions.ClearTrajectoryDataAction;
import org.eclipse.symphony.core.ui.actions.PinTrajectoryViewAction;
import org.eclipse.symphony.core.ui.composites.TrajectoryComposite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;

public class MovableTrajectoryView extends ViewPart implements ISelectionListener
{
	public static final String ID = "org.eclipse.symphony.core.ui.views.MovableTrajectoryView"; //$NON-NLS-1$
	public static final String PART_NAME = "MovableTrajectoryView";

	private ISelection currentSelection = null;
	private boolean pinned = false;
	
	private PoseProvider movable = SymphonyCoreFactory.eINSTANCE.createPoseProvider();
	
	private TrajectoryComposite trajectoryComposite = null;
	
	private Adapter deploymentAdapter = null;
	
	public MovableTrajectoryView() 
	{		
	}

	@Override
	public void createPartControl(Composite parent) 
	{		
		getSite().getPage().addSelectionListener(this);	
		
		parent.setLayout(new FillLayout());
		
		trajectoryComposite = new TrajectoryComposite(parent, SWT.NONE);
		
		populateToolbar();
				
		//setMovable(movable);		
		//Thread t = new Thread(getRunnable());
		//t.start();
	}

	@Override
	public void setFocus() 
	{
	}

	public void setPinned(boolean pinView) 
	{
		this.pinned = pinView;
	}

	public boolean isPinned() {
		return pinned;
	}	
	
	public void clearTrajectoryData()
	{
		if(trajectoryComposite != null && !trajectoryComposite.isDisposed())
		{
			trajectoryComposite.clearTrajectoryData();
		}
	}
	
	private void populateToolbar() 
	{
		// We get the toolbar manager.
		IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();

		toolBarManager.add(new PinTrajectoryViewAction(this));		
		toolBarManager.add(new ClearTrajectoryDataAction(this));		

		getViewSite().getActionBars().updateActionBars();
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) 
	{		
		if(!isPinned())
		{
			if(selection != currentSelection)
			{
				currentSelection = selection;
				
				// Attempts to convert the selection to a Deployment.				
				List list = org.eclipse.symphony.common.converters.Activator.convert(selection, PoseProvider.class);

				if(list.size() > 0) 
				{
					PoseProvider newMovable = (PoseProvider) list.get(0);
					if(newMovable != movable)
					{
						setMovable(newMovable);
					}
				}
				else
				{
					list = org.eclipse.symphony.common.converters.Activator.convert(selection, AbstractTypeImplementation.class);
					if(list.size() > 0)
					{
						AbstractTypeImplementation ati = (AbstractTypeImplementation) list.get(0);						
						if(ati.getInstance() instanceof PoseProvider)
						{
							setMovable((PoseProvider) ati.getInstance());
							
							if(ati instanceof TypeMemberImplementation)
							{
								TypeMemberImplementation ti = (TypeMemberImplementation) ati;
								updatePartName(ti.getTypeMember().getName());
							}
							else if(ati instanceof VariableImplementation)
							{
								VariableImplementation vi = (VariableImplementation) ati;								
								updatePartName(vi.getVariable().getName());
							}							
						}
					}						
				}														
			}			
		}	
	}
	
	@Override
	public void dispose() 
	{
		setMovable(null);						
		getSite().getPage().removeSelectionListener(this);					
		super.dispose();
	}
	
	@Override
	public void showBusy(boolean busy) 
	{		
		updatePartName(this.movable);		
	}
	
	private void updatePartName(final String objectName)
	{
		Display.getDefault().asyncExec(new Runnable() 
		{			
			@Override
			public void run() 
			{					
				String partName = PART_NAME;
				if(objectName != null)
				{
					partName += " - " + objectName;
				}						
				else
				{
					partName += " - ?"; 
				}												
								
				setPartName(partName);
			}
		});		
	}
	
	private void updatePartName(final PoseProvider newMovable)
	{
		if(newMovable instanceof Named)
		{
			updatePartName(((Named) newMovable).getName());
		}
	}
	
	private void setMovable(final PoseProvider newMovable)
	{	
		this.showBusy(true);
		
		if(this.movable != null) this.movable.eAdapters().remove(getDeploymentAdapter());
		if(newMovable != null) newMovable.eAdapters().add(getDeploymentAdapter());
		
		this.movable = newMovable;
		updatePartName(newMovable);
		
		trajectoryComposite.setMovable(newMovable);
	}
	
	private Adapter getDeploymentAdapter()
	{
		  if(deploymentAdapter == null)
		  {
			  	deploymentAdapter = new AdapterImpl()
				{				
					@Override
					public void notifyChanged(Notification msg) 
					{				
						// Events from Deployment
						if(msg.getNotifier() instanceof Named)							
						{														
							if(msg.getFeatureID(PoseProvider.class) == EMFEcorePackage.NAMED__NAME)						
							{							
								updatePartName(msg.getNewStringValue());
							}														
						}
					}
				};
		  }
		  
		  return deploymentAdapter;
	 }
	
//	private Runnable getRunnable1()
//	{
//		Runnable runnable = new Runnable() 
//		{
//			double theta = 0;
//			double radius = 1.0;
//			
//			@Override
//			public void run() 
//			{
//				while(true)
//				{
//					Matrix4d matrix = new Matrix4d();				
//					matrix.setIdentity();
//					
//					theta += 0.15;
//					radius += 0.01;
//					double x = radius * Math.sin(theta);
//					double y = radius * Math.cos(theta);
//					
//					Vector3d position = new Vector3d(x,y,0);				
//					matrix.set(position);										
//					movable.setPoseTransform(MathFacade.INSTANCE.createMatrix4x4(matrix));
//					
//					try 
//					{
//						Thread.sleep(100);
//					} 
//					catch (InterruptedException e) 
//					{				
//						e.printStackTrace();
//					}
//				}
//			}
//		};
//		
//		return runnable;
//	}
}
