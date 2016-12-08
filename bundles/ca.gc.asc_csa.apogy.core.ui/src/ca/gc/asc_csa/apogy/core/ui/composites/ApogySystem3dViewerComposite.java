package ca.gc.asc_csa.apogy.core.ui.composites;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.core.ApogySystem;

public class ApogySystem3dViewerComposite extends Composite {
	
	private ApogySystem apogySystem;
	
	//private ITopologyViewer topologyViewer;	
	public ApogySystem3dViewerComposite(Composite parent, int style) 
	{
		this(parent, style, null);		
	}
	
	public ApogySystem3dViewerComposite(Composite parent, int style, ApogySystem apogySystem) 
	{
		super(parent, style);		
		setLayout(new FillLayout());
//
//		topologyViewer = new JME3TopologyViewer(this);
//		topologyViewer.setAntiAliasing(true);		
		
		setApogySystem(apogySystem, true);
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents sub-classing of SWT components
	}

	public ApogySystem getApogySystem() {
		return apogySystem;
	}

	public void setApogySystem(ApogySystem apogySystem) {
		setApogySystem(apogySystem, true);
	}

	public void setApogySystem(ApogySystem apogySystem, boolean update) 
	{
//		try
//		{
//			this.apogySystem = apogySystem;
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
//				GraphicsContext graphicsContext = topology.ui.UiFactory.eINSTANCE.createGraphicsContext();
//				GroupNode root = ApogyCommonTopologyFacade.INSTANCE.createTransformNodeXYZ(0, 0, 0, 0, 0, 0);		
//				
//				if (apogySystem != null) 
//				{
//					ReferencedGroupNode rgn = ApogyCommonTopologyFactory.eINSTANCE.createReferencedGroupNode();
//					root.getChildren().add(rgn);
//					
//					// FIXME : Do not make a copy after bug#1429 in Link and ReferenceGroupNode is fixed.
//					Node copy = EcoreUtil.copy(apogySystem.getTopologyRoot().getOriginNode());
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
//			Logger.INSTANCE.log(Activator.ID, this, "Could not display Apogy System", EventSeverity.ERROR, t);
//		}
	}

	protected DataBindingContext initCustomDataBindings() 
	{
		DataBindingContext bindingContext = new DataBindingContext();

		return bindingContext;
	}		
}