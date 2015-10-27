package org.eclipse.symphony.core.environment.ui.commands;

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
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.core.AbsolutePoseProvider;
import org.eclipse.symphony.core.FeatureOfInterest;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.core.environment.FeaturesOfInterestMapLayer;
import org.eclipse.symphony.core.environment.ui.dialogs.FeatureOfInterestCreationDialog;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.ui.handlers.HandlerUtil;

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
							Command addCommand = AddCommand.create(editingDomain, featuresOfInterestMapLayer.getFeatures(), Symphony__CorePackage.Literals.FEATURE_OF_INTEREST_LIST__FEATURES_OF_INTEREST, foi);
							
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
