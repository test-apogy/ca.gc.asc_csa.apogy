package ca.gc.asc_csa.apogy.examples.satellite.ui.composites;
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
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsListsContainer;
import ca.gc.asc_csa.apogy.examples.satellite.ObservationConstellationRequest;

public class ConstellationRequestsComposite extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private TreeViewer requestsViewer;
	private AdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private DataBindingContext m_bindingContext;
	private ConstellationRequestsListsContainer constellationRequestsListsContainer;
	private ISelectionChangedListener requestsViewerListener;
	private EContentAdapter eContentAdapter;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 *            Refers to the parent composite.
	 * @param style
	 *            SWT style.
	 */
	public ConstellationRequestsComposite(Composite parent, int style) {
		super(parent, SWT.NONE);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout(1, false));

		requestsViewer = new TreeViewer(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.MULTI);
		requestsViewer.setUseHashlookup(true);
		Tree treeRequests = requestsViewer.getTree();
		treeRequests.setHeaderVisible(true);
		treeRequests.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		treeRequests.setLinesVisible(true);

		TreeViewerColumn treeViewerColumnUID = new TreeViewerColumn(requestsViewer, SWT.NONE);
		TreeColumn treeclmnUID = treeViewerColumnUID.getColumn();
		treeclmnUID.setWidth(150);
		treeclmnUID.setText("UID");
		treeclmnUID.setToolTipText("Refers to the constellation Request Unique Identifier.");
		
		TreeViewerColumn treeViewerColumnType = new TreeViewerColumn(requestsViewer, SWT.NONE);
		TreeColumn treeclmnType = treeViewerColumnType.getColumn();
		treeclmnType.setWidth(150);
		treeclmnType.setText("Type");
		treeclmnType.setToolTipText("Refers to the constellation Request type.");
		
		TreeViewerColumn treeViewerPriority = new TreeViewerColumn(requestsViewer, SWT.NONE);
		TreeColumn treeclmnPriority = treeViewerPriority.getColumn();
		treeclmnPriority.setWidth(100);
		treeclmnPriority.setText("Priority");
		treeclmnPriority.setToolTipText("Specifies the priority level the constellation request.");
		
		TreeViewerColumn treeViewerColumnStatus = new TreeViewerColumn(requestsViewer, SWT.NONE);
		TreeColumn treeclmnStatus = treeViewerColumnStatus.getColumn();
		treeclmnStatus.setWidth(100);
		treeclmnStatus.setText("Status");
		treeclmnStatus.setToolTipText("Actual execution status of the constellation Request.");

		TreeViewerColumn treeViewerLongitude = new TreeViewerColumn(requestsViewer, SWT.NONE);
		TreeColumn treeclmnLongitude = treeViewerLongitude.getColumn();
		treeclmnLongitude.setWidth(150);
		treeclmnLongitude.setText("Longitude (°)");
		treeclmnLongitude.setToolTipText("Specifies the observation request longitude.");
		
		TreeViewerColumn treeViewerLatitude = new TreeViewerColumn(requestsViewer, SWT.NONE);
		TreeColumn treeclmnLatitude = treeViewerLatitude.getColumn();
		treeclmnLatitude.setWidth(150);
		treeclmnLatitude.setText("Latitude (°)");
		treeclmnLatitude.setToolTipText("Specifies the observation request latitude in degrees.");

		TreeViewerColumn treeViewerElevation = new TreeViewerColumn(requestsViewer, SWT.NONE);
		TreeColumn treeclmnElevation = treeViewerElevation.getColumn();
		treeclmnElevation.setWidth(150);
		treeclmnElevation.setText("Elevation (m)");
		treeclmnElevation.setToolTipText("Specifies the observation request altitude in meters.");
				
		requestsViewer.setContentProvider(new RequestsContentProvider(adapterFactory));
		requestsViewer.setLabelProvider(new RequestsLabelProvider(adapterFactory));
		requestsViewer.addSelectionChangedListener(getViewerListener());		

		/*
		 * Show/Hide Column Menu Items.
		 */
		Menu contextMenu = new Menu(treeRequests);
		requestsViewer.getTree().setMenu(contextMenu);
		for (TreeColumn tableColumn : requestsViewer.getTree().getColumns()) {

			final MenuItem itemName = new MenuItem(contextMenu, SWT.CHECK);
			itemName.setText(tableColumn.getText());
			itemName.setSelection(tableColumn.getResizable());
			itemName.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (itemName.getSelection()) {
						tableColumn.setWidth(150);
						tableColumn.setResizable(true);
					} else {
						tableColumn.setWidth(0);
						tableColumn.setResizable(false);
					}
				}
			});
		}
	}

	/*
	 * Sets the constellation requests lists container
	 * @param constellationRequestsListsContainer Constellation requests lists container.
	 */
	public void setConstellationRequestsListsContainer(ConstellationRequestsListsContainer constellationRequestsListsContainer) {
		
		if (this.constellationRequestsListsContainer != null){
			getEContentAdapter().setTarget(null);
			this.constellationRequestsListsContainer.eAdapters().remove(getEContentAdapter());
		}
		
		this.constellationRequestsListsContainer = constellationRequestsListsContainer;

		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}

		if (this.constellationRequestsListsContainer != null) {
			m_bindingContext = initDataBindings();			
		}
		
		if (this.constellationRequestsListsContainer != null){
			getEContentAdapter().setTarget(constellationRequestsListsContainer);
			this.constellationRequestsListsContainer.eAdapters().add(getEContentAdapter());
		}
	}
	
	/*
	 * Content adapter used to listen sub-element changes.
	 */
	private EContentAdapter getEContentAdapter(){
		if (eContentAdapter == null){
			eContentAdapter = new EContentAdapter(){
				@Override
				public void notifyChanged(Notification notification) {
					Object notifier = notification.getNotifier(); 
					if (notifier instanceof EarthSurfaceLocation){
						ObservationConstellationRequest observationConstellationRequest = (ObservationConstellationRequest) ((EarthSurfaceLocation)notifier).eContainer();
						if (observationConstellationRequest != null){						
							PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {							
								@Override
								public void run() {
									requestsViewer.refresh(observationConstellationRequest, true);
								}
							});
						}
					}					
				}
			};			
		}
		return eContentAdapter;
	}

	/**
	 * Use this to prevent Window Pro Builder code analysis to fail with the
	 * complex data bindings code. Invokes
	 * {@link ConstellationRequestsComposite#initDataBindingsCustom()}.
	 * 
	 * @return Reference to the data bindings context.
	 * @see ConstellationRequestsComposite#initDataBindingsCustom()
	 */
	private DataBindingContext initDataBindings() {
		return initDataBindingsCustom();
	}

	/**
	 * Creates and returns the data bindings context that takes care of the
	 * composite.
	 * 
	 * @return Reference to the data bindings context.
	 */
	private DataBindingContext initDataBindingsCustom() {
		DataBindingContext bindingContext = new DataBindingContext();

		if (constellationRequestsListsContainer != null) {
			requestsViewer.setInput(constellationRequestsListsContainer);
		}

		return bindingContext;
	}

	@Override
	public void dispose() {
		super.dispose();		

		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
		
		if (this.constellationRequestsListsContainer != null){
			getEContentAdapter().setTarget(null);
			this.constellationRequestsListsContainer.eAdapters().remove(getEContentAdapter());
		}
		
		requestsViewer.removeSelectionChangedListener(getViewerListener());		
	}
	
	/**
	 * This method is called when a new selection is made in the composite.
	 * @param selection Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
	}
	
	/**
	 * Listener used to listen {{@link #requestsViewer} selection changes.
 	 * @return Reference to the listener (Lazy Loaded).
	 */
	private ISelectionChangedListener getViewerListener() {
		if (requestsViewerListener == null){
			requestsViewerListener = new ISelectionChangedListener() {				
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					newSelection(event.getSelection());
				}
			};
		}		
		return requestsViewerListener;
	}	

	public class ActivitiesViewerComparator extends ViewerComparator {
		/*
		 * http://www.vogella.com/tutorials/EclipseJFaceTableAdvanced/article.
		 * html
		 */
	}

	private class RequestsContentProvider extends AdapterFactoryContentProvider{

		public RequestsContentProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}		
		
		@Override
		public Object[] getChildren(Object object) {
			
			Object[] children = null;
			
			if (object instanceof ConstellationRequestsList){
				children = super.getChildren(object);
			}
			return children;
		}
		
		@Override
		public boolean hasChildren(Object object) {		
			return object instanceof ConstellationRequestsList ? super.hasChildren(object) : false;
		}
	}
	
	/*
	 * 
	 * Requests Label Provider
	 *
	 */
	private class RequestsLabelProvider extends AdapterFactoryLabelProvider implements ITableLabelProvider {

		public RequestsLabelProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		private static final int UID_COLUMN_ID = 0;
		private static final int TYPE_COLUMN_ID = 1;
		private static final int PRIORITY_COLUMN_ID = 2;
		private static final int STATUS_COLUMN_ID = 3;		
		private static final int LONGITUDE_COLUMN_ID = 4;
		private static final int LATITUDE_COLUMN_ID = 5;
		private static final int ELEVATION_COLUMN_ID = 6;

		@Override
		public String getColumnText(Object object, int columnIndex) {
			String str = "<undefined>";
			
			if (object instanceof ConstellationRequestsList){
				ConstellationRequestsList list = (ConstellationRequestsList) object;
				if (columnIndex == UID_COLUMN_ID){
					if (list.getName() != null){
						str = list.getName();	
					}					 
				}else{
					str = "";
				}
			}
			
			if (object instanceof AbstractConstellationRequest){
				AbstractConstellationRequest request = (AbstractConstellationRequest) object;
	
				switch (columnIndex) {
				case UID_COLUMN_ID:
					if (request.getUid() != null){
						str = request.getUid().toString();
					}
					break;			
	
				case PRIORITY_COLUMN_ID:
					str = request.getOrderPriority().getName();
					break;
					
				case STATUS_COLUMN_ID:
					str = request.getOrderStatus().getName();
					break;
					
				case TYPE_COLUMN_ID:
					str = request.eClass().getName();
					break;

				case LONGITUDE_COLUMN_ID:
					if (request instanceof ObservationConstellationRequest){
						ObservationConstellationRequest observationRequest = (ObservationConstellationRequest) request;
						str = observationRequest.getLocation() == null? "N/A" : Double.toString((Math.toDegrees(observationRequest.getLocation().getLongitude())));
					}
					break;

				case LATITUDE_COLUMN_ID:
					if (request instanceof ObservationConstellationRequest){
						ObservationConstellationRequest observationRequest = (ObservationConstellationRequest) request;
						str = observationRequest.getLocation() == null? "N/A" : Double.toString((Math.toDegrees(observationRequest.getLocation().getLatitude())));
					}
					break;

				case ELEVATION_COLUMN_ID:
					if (request instanceof ObservationConstellationRequest){
						ObservationConstellationRequest observationRequest = (ObservationConstellationRequest) request;
						str = observationRequest.getLocation() == null? "N/A" : Double.toString((observationRequest.getLocation().getElevation()));
					}
					break;
										
				default:
					break;
				}
			}

			return str;
		}
		
		@Override
		public Image getColumnImage(Object object, int columnIndex) {
			return null;
		}
	}
}