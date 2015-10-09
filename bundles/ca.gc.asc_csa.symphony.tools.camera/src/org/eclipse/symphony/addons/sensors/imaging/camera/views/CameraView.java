package org.eclipse.symphony.addons.sensors.imaging.camera.views;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.symphony.addons.sensors.imaging.camera.Activator;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewUtilities;
import org.eclipse.symphony.addons.sensors.imaging.camera.actions.NewCameraViewAction;
import org.eclipse.symphony.addons.sensors.imaging.camera.composites.CameraViewConfigurationComposite;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.progress.UIJob;

import ca.gc.asc_csa.eclipse.ui.views.AbstractView;

public class CameraView extends AbstractView implements ISelectionListener 
{	
	public static final String ID = CameraView.class.getName();
	public static final String BUSY = "(BUSY)";
	public static final String PART_NAME = "Camera View";
	public static final String CAMERA_VIEW_CONFIG = Activator.ID  + "." + "CAMERA_VIEW_CONFIG";
	public static final String CAMERA_VIEW_PINNED = Activator.ID  + "." + "CAMERA_VIEW_PINNED";
			
	private String defaultViewName = null;
	private String cameraViewConfigurationId = null;	
	private CameraViewConfiguration cameraViewConfiguration;
	private CameraViewConfigurationComposite cameraComposite;
	
	private Adapter activeSessionAdapter = null;
			
	@Override
	public void createPartControl(Composite parent) 
	{			
		parent.setLayout(new FillLayout());
		
		cameraComposite = new CameraViewConfigurationComposite(parent, SWT.BORDER);			
				
		getSite().getPage().addSelectionListener(this);
		
		addActions();
		
		defaultViewName = this.getPartName();
		
		// Attempts to initialize the CameraViewConfiguration.				
		setCameraViewConfiguration(CameraViewUtilities.INSTANCE.getActiveCameraViewConfiguration(cameraViewConfigurationId));
				
		// Register to EMFEcoreInvocatorFacade to listen for change on Active Session.
		EMFEcoreInvocatorFacade.INSTANCE.eAdapters().add(getActiveSessionAdapter());
	}
	
	@Override
	public void updatePartName() 
	{		
		Display.getDefault().asyncExec(new Runnable() 
		{			
			@Override
			public void run() 
			{					
				String partName = PART_NAME;
				
				if(cameraViewConfiguration != null)
				{
					setPartName(defaultViewName + " (" + cameraViewConfiguration.getName() + ")");
				}
				else
				{
					setPartName(defaultViewName);
				}
				cameraComposite.setCameraViewConfiguration(cameraViewConfiguration);
						
				if(busy) partName += " " + BUSY;
								
				setPartName(partName);
			}
		});		
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void updateSelection(ISelection selection) 
	{		
		List cameraViewConfigurations = org.eclipse.symphony.common.converters.Activator.convert(selection, CameraViewConfiguration.class);
		if(cameraViewConfigurations.size() > 0)
		{
			try
			{
				final CameraViewConfiguration cameraViewConfiguration = (CameraViewConfiguration) cameraViewConfigurations.get(0);																															
				setCameraViewConfiguration(cameraViewConfiguration);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		else 
		{
			// No CameraViewConfiguration found.
		}
	}
	
	@Override
	public void setFocus() 
	{
		// Nothing to do.
	}
	
	@Override
	public void init(IViewSite site, IMemento memento) throws PartInitException 
	{					
		super.init(site, memento);
		
		if(memento != null)
		{
			cameraViewConfigurationId = memento.getString(CAMERA_VIEW_CONFIG);
			
			Logger.INSTANCE.log(Activator.ID, this, "Initializing with CameraViewConfiguration ID <" +cameraViewConfigurationId + ">." , EventSeverity.INFO);
			
			if(memento.getBoolean(CAMERA_VIEW_PINNED) != null)
			{
				setPinned(memento.getBoolean(CAMERA_VIEW_PINNED));	
			}		
		}
	}
	
	@Override
	public void saveState(IMemento memento) 
	{	
		if(cameraViewConfiguration != null)
		{
			cameraViewConfigurationId = CameraViewUtilities.INSTANCE.getCameraViewConfigurationIdentifier(cameraViewConfiguration);
			memento.putString(CAMERA_VIEW_CONFIG, cameraViewConfigurationId);
		}
		memento.putBoolean(CAMERA_VIEW_PINNED, isPinned());

		Logger.INSTANCE.log(Activator.ID, this, "Saving state CameraViewConfiguration ID <" +cameraViewConfigurationId + ">." , EventSeverity.INFO);
		
		super.saveState(memento);		
	}
	
	@Override
	public void dispose() 
	{
		// Unregister to EMFEcoreInvocatorFacade.
		EMFEcoreInvocatorFacade.INSTANCE.eAdapters().remove(getActiveSessionAdapter());
		
		cameraComposite.dispose();		
		super.dispose();
	}
	
//	@SuppressWarnings("rawtypes")
//	@Override
//	public void selectionChanged(IWorkbenchPart part, ISelection selection) 
//	{
//		if(!isPinView())
//		{
//			if (previousSelection != selection)
//			{
//				List images = org.eclipse.symphony.common.converters.Activator.convert(selection, CameraViewConfiguration.class);
//				if(images.size() > 0)
//				{
//					try
//					{
//						final CameraViewConfiguration cameraViewConfiguration = (CameraViewConfiguration) images.get(0);																															
//						setCameraViewConfiguration(cameraViewConfiguration);
//					}
//					catch(Exception e)
//					{
//						e.printStackTrace();
//					}
//				}
//				else 
//				{
//					// No CameraViewConfiguration found.
//				}
//			}
//			previousSelection  = selection;
//		}
//	}
		
	public void setCameraViewConfiguration(final CameraViewConfiguration cameraViewConfiguration)
	{
		this.cameraViewConfiguration = cameraViewConfiguration;
		
		// If the CameraViewConfiguration is different from the current one.
		if(cameraViewConfiguration != cameraComposite.getCameraViewConfiguration())
		{
			UIJob uiJob = new UIJob("Update Camera View") 
			{				
				@Override
				public IStatus runInUIThread(IProgressMonitor monitor) 
				{
					if(cameraViewConfiguration != null)
					{
						setPartName(defaultViewName + " (" + cameraViewConfiguration.getName() + ")");
					}
					else
					{
						setPartName(defaultViewName);
					}
					cameraComposite.setCameraViewConfiguration(cameraViewConfiguration);
					return Status.OK_STATUS;
				}				
			};	
			
			uiJob.schedule();
		}
	}
	
	/**
	 * Creates and adds the various actions available in the view.
	 */
	public void addActions()
	{
		super.addActions();
		
//		/* Creates Link With Selection Action */
//		pinViewAction = new PinViewAction(this);
//		pinViewAction.setChecked(pinView);
							
		NewCameraViewAction newCameraViewAction = new NewCameraViewAction(this);
				
		/* Add actions to toolbars*/
//		this.getViewSite().getActionBars().getToolBarManager().add(pinViewAction);
//		this.getViewSite().getActionBars().getMenuManager().add(pinViewAction);		
		
		this.getViewSite().getActionBars().getToolBarManager().add(newCameraViewAction);
		this.getViewSite().getActionBars().getMenuManager().add(newCameraViewAction);		
	}

	protected Adapter getActiveSessionAdapter()
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
						
						if(featureId == EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION)
						{
							// Tries to update the CameraViewConfiguration being displayed.
							setCameraViewConfiguration(CameraViewUtilities.INSTANCE.getActiveCameraViewConfiguration(cameraViewConfigurationId));
						}						
					}
				}
			};
		}
		
		return activeSessionAdapter;
	}	
}
