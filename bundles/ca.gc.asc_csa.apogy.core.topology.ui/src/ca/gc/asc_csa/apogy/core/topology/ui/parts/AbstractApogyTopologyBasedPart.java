package ca.gc.asc_csa.apogy.core.topology.ui.parts;
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
 *     Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFacade;
import ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewer;
import ca.gc.asc_csa.apogy.common.ui.composites.NoContentComposite;
import ca.gc.asc_csa.apogy.common.ui.parts.AbstractApogyPart;
import ca.gc.asc_csa.apogy.core.ApogyTopology;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFacade;

abstract public class AbstractApogyTopologyBasedPart extends AbstractApogyPart{
	
	private Adapter adapter;
	private TopologyViewer topologyViewer;

	@Override
	protected void createContentComposite(Composite parent, int style) {
		topologyViewer = createTopologyViewer(parent);
	}
	
	public TopologyViewer getTopologyViewer() {
		return topologyViewer;
	}
	
	abstract public TopologyViewer createTopologyViewer(Composite parent);	
	
	@Override
	protected void createNoContentComposite(Composite parent, int style) {
		new NoContentComposite(parent, SWT.None){
			@Override
			protected String getMessage() {
				return "No active session";
			}
		};	
	}
			
	@Override
	protected EObject getInitializeObject() {
		ApogyCoreTopologyFacade.INSTANCE.eAdapters().add(getAdapter());
		return ApogyCoreTopologyFacade.INSTANCE.getApogyTopology();
	} 
	
	protected void newTopology(ApogyTopology apogyTopology) {
		GraphicsContext graphicsContext = ApogyCommonTopologyUIFacade.INSTANCE
				.createGraphicsContext(apogyTopology.getRootNode());
		topologyViewer.setInput(graphicsContext);
	}

	@Override
	protected void setCompositeContent(EObject eObject) {
		newTopology((ApogyTopology) eObject); 
	}
	/**
	 * Gets an adapter that sets the part's parentComposite to a
	 * {@link NoActiveSessionComposite} if there is no active session.
	 * 
	 * @return the {@link Adapter}
	 */
	private Adapter getAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					setEObject(ApogyCoreTopologyFacade.INSTANCE.getApogyTopology());
				}
			};
		}
		return adapter;
	}

	public void dispose() {
		ApogyCoreTopologyFacade.INSTANCE.eAdapters().remove(getAdapter());
	}
	
	
	public void zoomToFit(){
		getTopologyViewer().zoomToFit();
	}
	
	public void setAntiAliasing(boolean enable){		
		getTopologyViewer().setAntiAliasing(enable);
	}
	
	public void setHighSpeedMode(boolean enable){
		getTopologyViewer().setHighSpeedMotionEnabled(enable);
	}
	
	public void setPickingMode(boolean enable){
		getTopologyViewer().setPickingModeEnabled(enable);
	}
	
	public void showStatisticsDisplay(boolean enable){
		getTopologyViewer().setShowStatisticsEnabled(enable);
	}
	
	public void resetLevelViewpoint(){
		getTopologyViewer().levelViewPoint();
	}
	
	public void takeScreenshot(){
		getTopologyViewer().takeScreenshot();
	}
}