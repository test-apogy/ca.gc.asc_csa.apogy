package ca.gc.asc_csa.symphony.environment.ui.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.core.FeatureOfInterest;
import org.eclipse.symphony.core.SymphonyCoreFactory;
import org.eclipse.symphony.core.SymphonyEnvironment;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession;
import ca.gc.asc_csa.symphony.environment.AbstractMapLayer;
import ca.gc.asc_csa.symphony.environment.FeaturesOfInterestMapLayer;
import ca.gc.asc_csa.symphony.environment.Map;
import ca.gc.asc_csa.symphony.environment.MapsList;
import ca.gc.asc_csa.symphony.environment.SurfaceWorksite;

public class FeatureOfInterestCreationDialog extends Dialog 
{
	private Matrix4x4 pose;
	private Text nameText;
	private Text descriptionText;
		
	private FeaturesOfInterestMapLayer selectedFeaturesOfInterestMapLayer = null;
	private FeatureOfInterest foi = null;
	
	private List<FeaturesOfInterestMapLayer> availableFeaturesOfInterestMapLayer;	
	
	
	private Combo featuresOfInterestMapLayerCombo;
	
	public FeatureOfInterestCreationDialog(Shell parentShell) 
	{
		super(parentShell);
	}
	
	public FeatureOfInterestCreationDialog(Shell parentShell, Matrix4x4 pose) 
	{
		this(parentShell);
		this.pose = pose;
	}
	
	public FeatureOfInterestCreationDialog(Shell parentShell, Matrix4x4 pose, FeaturesOfInterestMapLayer featuresOfInterestMapLayer) 
	{
		this(parentShell);
		this.pose = pose;
		this.selectedFeaturesOfInterestMapLayer = featuresOfInterestMapLayer;
		availableFeaturesOfInterestMapLayer = findFeaturesOfInterestMapLayers(featuresOfInterestMapLayer);
	}
	
	public FeatureOfInterestCreationDialog(Shell parentShell, Matrix4x4 pose, InvocatorSession invocatorSession) 
	{
		this(parentShell);
		this.pose = pose;		
		availableFeaturesOfInterestMapLayer = findFeaturesOfInterestMapLayers(invocatorSession);
	}
	
	public FeatureOfInterest getFeatureOfInterest() 
	{
		return foi;
	}
	
	public FeaturesOfInterestMapLayer getSelectedFeaturesOfInterestMapLayer()
	{
		return selectedFeaturesOfInterestMapLayer;
	}
			
	@Override
	protected void configureShell(Shell newShell) 
	{	
		super.configureShell(newShell);
		newShell.setText("Create A Feature Of Interest");
	}
	
	@Override
	protected Control createDialogArea(Composite parent) 
	{	
		Composite area = (Composite) super.createDialogArea(parent);
		
	    Composite container = new Composite(area, SWT.NONE);	    
	    container.setLayoutData(new GridData(GridData.FILL_BOTH));
	    GridLayout layout = new GridLayout(2, false);
	    container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	    container.setLayout(layout);
	    
	    Label layerLabel = new Label(container, SWT.NONE);
	    layerLabel.setText("Features Of Interest Map Layer:");	    	    
	    featuresOfInterestMapLayerCombo = createFeaturesOfInterestMapLayerCombo(container, selectedFeaturesOfInterestMapLayer);
	    GridData featuresOfInterestMapLayerComboGridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
	    featuresOfInterestMapLayerCombo.setLayoutData(featuresOfInterestMapLayerComboGridData);
	    
	    Label nameLabel = new Label(container, SWT.NONE);
	    nameLabel.setText("Name:");	    
	    nameText = new Text(container, SWT.BORDER);	  
	    GridData nameTextGridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
	    nameText.setLayoutData(nameTextGridData);
	    	    
	    Label descriptionLabel = new Label(container, SWT.NONE);
	    descriptionLabel.setText("Description:");	
	    descriptionText = new Text(container, SWT.BORDER | SWT.MULTI);
	    GridData descriptionTextGridData = new GridData(SWT.FILL, SWT.FILL, true, false);
	    descriptionTextGridData.heightHint = 200;
	    descriptionTextGridData.minimumHeight = 200;
	    descriptionTextGridData.widthHint = 400;
	    descriptionTextGridData.minimumWidth = 400;
	    descriptionText.setLayoutData(descriptionTextGridData);
	    	   	    	 	    
	    
	    return area;
	}
	
	@Override
	protected void okPressed() 
	{					
		foi = SymphonyCoreFactory.eINSTANCE.createFeatureOfInterest();
		foi.setPose(pose);
		foi.setName(nameText.getText());
		foi.setDescription(descriptionText.getText());
		
		super.okPressed();
	}
	
	private Combo createFeaturesOfInterestMapLayerCombo(Composite parent, FeaturesOfInterestMapLayer currentSelection)
	{
		final Combo combo = new Combo(parent, SWT.READ_ONLY);
		
		String[] comboItems = new String[availableFeaturesOfInterestMapLayer.size()];
			
		for(int i =0; i < availableFeaturesOfInterestMapLayer.size(); i++)
		{
			FeaturesOfInterestMapLayer layer = availableFeaturesOfInterestMapLayer.get(i);
			
			if(layer.getName() != null && layer.getName().length() > 0)
			{
				comboItems[i] = layer.getName();
			}
			else
			{
				comboItems[i] = "Features Of Interest Map Layer";
			}
		}
		
		combo.setItems(comboItems);		
		
		combo.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) 
			{				
				int index = combo.getSelectionIndex();
				selectedFeaturesOfInterestMapLayer = availableFeaturesOfInterestMapLayer.get(index);
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) 
			{								
			}
		});
		
		if(currentSelection != null)
		{
			combo.select(availableFeaturesOfInterestMapLayer.indexOf(currentSelection));
		}
		
		return combo;
	}
	
	protected List<FeaturesOfInterestMapLayer> findFeaturesOfInterestMapLayers(InvocatorSession invocatorSession)
	{		
		List<FeaturesOfInterestMapLayer> list = new ArrayList<FeaturesOfInterestMapLayer>();	
	
		if(invocatorSession.getEnvironment() instanceof SymphonyEnvironment)
		{
			SymphonyEnvironment symphonyEnvironment = (SymphonyEnvironment) invocatorSession.getEnvironment();
		
			if(symphonyEnvironment.getActiveWorksite() instanceof SurfaceWorksite)
			{
				SurfaceWorksite surfaceWorksite  = (SurfaceWorksite) symphonyEnvironment.getActiveWorksite();
				MapsList mapList = surfaceWorksite.getMapsList();			
				for(Map map : mapList.getMaps())
				{
					for(AbstractMapLayer mapLayer : map.getLayers())
					{
						if(mapLayer instanceof FeaturesOfInterestMapLayer)
						{
							FeaturesOfInterestMapLayer featuresOfInterestMapLayer = (FeaturesOfInterestMapLayer) mapLayer;
							list.add(featuresOfInterestMapLayer);
						}
					}
				}	
			}
		}
		
		return list;
	}
	
	protected List<FeaturesOfInterestMapLayer> findFeaturesOfInterestMapLayers(FeaturesOfInterestMapLayer featuresOfInterestMapLayer)
	{
		InvocatorSession invocatorSession= resolveInvocatorSession(featuresOfInterestMapLayer);
		if(invocatorSession != null)
		{
			return findFeaturesOfInterestMapLayers(invocatorSession);
		}
		else
		{
			return new ArrayList<FeaturesOfInterestMapLayer>();	
		}
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
		}
		
		return invocatorSession;
	}
}
