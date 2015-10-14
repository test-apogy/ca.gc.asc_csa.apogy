package org.eclipse.symphony.core.ui.composites;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.core.SymphonySystem;

public class SymphonySystem3dViewerComposite extends Composite {
	
	private SymphonySystem symphonySystem;
	
	//private ITopologyViewer topologyViewer;	
	public SymphonySystem3dViewerComposite(Composite parent, int style) 
	{
		this(parent, style, null);		
	}
	
	public SymphonySystem3dViewerComposite(Composite parent, int style, SymphonySystem symphonySystem) 
	{
		super(parent, style);		
		setLayout(new FillLayout());
//
//		topologyViewer = new JME3TopologyViewer(this);
//		topologyViewer.setAntiAliasing(true);		
		
		setSymphonySystem(symphonySystem, true);
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents sub-classing of SWT components
	}

	public SymphonySystem getSymphonySystem() {
		return symphonySystem;
	}

	public void setSymphonySystem(SymphonySystem symphonySystem) {
		setSymphonySystem(symphonySystem, true);
	}

	public void setSymphonySystem(SymphonySystem symphonySystem, boolean update) 
	{
//		try
//		{
//			this.symphonySystem = symphonySystem;
//			if (update) 
//			{
//				
//				if (m_bindingContext != null) 
//				{
//					m_bindingContext.dispose();
//					m_bindingContext = null;
//				}
//				
//				// Initialize a GraphicsContext to be sent to the TopologyViewer
//				GraphicsContext graphicsContext = ca.gc.space.topology.ui.UiFactory.eINSTANCE.createGraphicsContext();
//				GroupNode root = TopologyFacade.INSTANCE.createTransformNodeXYZ(0, 0, 0, 0, 0, 0);		
//				
//				if (symphonySystem != null) 
//				{
//					ReferencedGroupNode rgn = TopologyFactory.eINSTANCE.createReferencedGroupNode();
//					root.getChildren().add(rgn);
//					
//					// FIXME : Do not make a copy after bug#1429 in Link and ReferenceGroupNode is fixed.
//					Node copy = EcoreUtil.copy(symphonySystem.getTopologyRoot().getOriginNode());
//					
//					rgn.getChildren().add(copy);
//					
//					m_bindingContext = initCustomDataBindings();
//				}
//				graphicsContext.setTopology(root);
//				topologyViewer.setInput(graphicsContext);
//			}
//		}
//		catch(Throwable t)
//		{
//			Logger.INSTANCE.log(Activator.ID, this, "Could not display Symphony System", EventSeverity.ERROR, t);
//		}
	}

	protected DataBindingContext initCustomDataBindings() 
	{
		DataBindingContext bindingContext = new DataBindingContext();

		return bindingContext;
	}		
}