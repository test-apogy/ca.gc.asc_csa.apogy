package ca.gc.asc_csa.symphony.environment.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession;
import ca.gc.asc_csa.symphony.core.AbsolutePoseProvider;
import ca.gc.asc_csa.symphony.core.FeatureOfInterest;
import ca.gc.asc_csa.symphony.core.SymphonyCorePackage;
import ca.gc.asc_csa.symphony.environment.FeaturesOfInterestMapLayer;
import ca.gc.asc_csa.symphony.environment.ui.dialogs.FeatureOfInterestCreationDialog;
import ca.gc.space.math.MathFacade;
import ca.gc.space.math.Matrix4x4;

public class CreateFOICommand extends AbstractHandler implements IHandler 
{
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();
				
		while (selections.hasNext()) 
		{
			Object selection = selections.next();

			if (selection instanceof AbsolutePoseProvider) 
			{
				final AbsolutePoseProvider absolutePoseProvider = (AbsolutePoseProvider) selection;

				InvocatorSession invocatorSession = resolveInvocatorSession(absolutePoseProvider);
				
				Matrix4x4 pose = absolutePoseProvider.getPoseTransform();
				if(pose == null)
				{		
					pose = MathFacade.INSTANCE.createIdentityMatrix4x4();
				}
				
				final Shell shell = Display.getCurrent().getActiveShell();
				FeatureOfInterestCreationDialog featureOfInterestCreationDialog = new FeatureOfInterestCreationDialog(shell, pose, invocatorSession);					
				
				if(featureOfInterestCreationDialog.open() == Window.OK)		
				{					
					FeatureOfInterest foi = featureOfInterestCreationDialog.getFeatureOfInterest();
					
					if(foi != null)
					{
						FeaturesOfInterestMapLayer featuresOfInterestMapLayer = featureOfInterestCreationDialog.getSelectedFeaturesOfInterestMapLayer();
					
						if(featuresOfInterestMapLayer != null)
						{
							// Gets the Editing Domain.
							EditingDomain editingDomain = org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain.getEditingDomainFor(featuresOfInterestMapLayer.getFeatures());
							
							// Creates an ADD command to add the FeatureOfInterest.
							Command addCommand = AddCommand.create(editingDomain, featuresOfInterestMapLayer.getFeatures(), SymphonyCorePackage.Literals.FEATURE_OF_INTEREST_LIST__FEATURES_OF_INTEREST, foi);
							
							// Executes the command.
							editingDomain.getCommandStack().execute(addCommand);
						}
					}
				}
			}
		}
		return null;
	}
	
	protected InvocatorSession resolveInvocatorSession(EObject eObject)	
	{		
		InvocatorSession invocatorSession = null;
		
		while(invocatorSession == null && eObject != null)
		{
			if(eObject instanceof InvocatorSession)
			{
				invocatorSession = (InvocatorSession) eObject;
			}
			else
			{
				eObject = eObject.eContainer();
			}
			
			System.out.println("eObject : " + eObject);
		}
		
		return invocatorSession;
	}
}
