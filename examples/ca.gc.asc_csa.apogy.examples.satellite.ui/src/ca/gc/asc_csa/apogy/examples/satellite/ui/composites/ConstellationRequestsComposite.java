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
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlinksList;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList;

public class ConstellationRequestsComposite extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private TableViewer plansViewer;
	private TreeViewer downlinksViewer;
	private TableViewer requestsViewer;
	private AdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private DataBindingContext m_bindingContext;
	private Label lblLoadingStatus;
	private ConstellationRequestsList constellationRequestsList;

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

		Section sctnOverview = toolkit.createSection(this, Section.EXPANDED | Section.TITLE_BAR);
		sctnOverview.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		toolkit.paintBordersFor(sctnOverview);
		sctnOverview.setText("Overview");

		Composite compositeOverview = new Composite(sctnOverview, SWT.NONE);
		toolkit.adapt(compositeOverview);
		toolkit.paintBordersFor(compositeOverview);
		sctnOverview.setClient(compositeOverview);
		compositeOverview.setLayout(new RowLayout(SWT.HORIZONTAL));

		lblLoadingStatus = new Label(compositeOverview, SWT.NONE);
		toolkit.adapt(lblLoadingStatus, true, true);
		lblLoadingStatus.setText("NOT LOADED");

		SashForm sashForm = new SashForm(this, SWT.BORDER | SWT.SMOOTH);
		sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		toolkit.adapt(sashForm);
		toolkit.paintBordersFor(sashForm);

		Composite compositeLeft = toolkit.createComposite(sashForm, SWT.NONE);
		toolkit.paintBordersFor(compositeLeft);
		compositeLeft.setLayout(new GridLayout(1, false));

		/*
		 * Plans Section.
		 */
		Section sctnPlans = toolkit.createSection(compositeLeft, Section.EXPANDED | Section.TITLE_BAR);
		sctnPlans.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		toolkit.paintBordersFor(sctnPlans);
		sctnPlans.setText("Plans");
		plansViewer = new TableViewer(sctnPlans, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		plansViewer.setUseHashlookup(true);
		Table tablePlans = plansViewer.getTable();
		tablePlans.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tablePlans.setLinesVisible(true);
		sctnPlans.setClient(tablePlans);
		plansViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		plansViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		/*
		 * Downlinks Section.
		 */
		Section sctnDownlinks = toolkit.createSection(compositeLeft, Section.EXPANDED | Section.TITLE_BAR);
		sctnDownlinks.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		sctnDownlinks.setBounds(0, 0, 117, 23);
		toolkit.paintBordersFor(sctnDownlinks);
		sctnDownlinks.setText("Downlinks");
		downlinksViewer = new TreeViewer(sctnDownlinks, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		downlinksViewer.setUseHashlookup(true);
		Tree treeDownlinks = downlinksViewer.getTree();
		treeDownlinks.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		treeDownlinks.setLinesVisible(true);
		sctnDownlinks.setClient(treeDownlinks);
		downlinksViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory) {
			@Override
			public boolean hasChildren(Object object) {
				return object instanceof ConstellationDownlinksList ? super.hasChildren(object) : false;
			}

			@Override
			public Object[] getChildren(Object object) {
				return hasChildren(object) ? super.getChildren(object) : null;
			}
		});
		downlinksViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		Composite compositeRight = toolkit.createComposite(sashForm, SWT.NONE);
		toolkit.paintBordersFor(compositeRight);
		compositeRight.setLayout(new GridLayout(1, false));

		/*
		 * Requests Section
		 */
		Section sctnRequests = toolkit.createSection(compositeRight, Section.EXPANDED | Section.TITLE_BAR);
		sctnRequests.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		toolkit.paintBordersFor(sctnRequests);
		sctnRequests.setText("Requests");

		requestsViewer = new TableViewer(sctnRequests, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		requestsViewer.setUseHashlookup(true);
		Table tableRequests = requestsViewer.getTable();
		tableRequests.setHeaderVisible(true);
		tableRequests.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tableRequests.setLinesVisible(true);
		sctnRequests.setClient(tableRequests);

		TableViewerColumn tableViewerColumnUID = new TableViewerColumn(requestsViewer, SWT.NONE);
		TableColumn tblclmnUID = tableViewerColumnUID.getColumn();
		tblclmnUID.setWidth(80);
		tblclmnUID.setText("UID");
		tblclmnUID.setToolTipText("Refers to the constellation Request Unique Identifier.");

		TableViewerColumn tableViewerSatellite = new TableViewerColumn(requestsViewer, SWT.NONE);
		TableColumn tblclmnSatellite = tableViewerSatellite.getColumn();
		tblclmnSatellite.setWidth(150);
		tblclmnSatellite.setText("Satellite");
		tblclmnSatellite.setToolTipText("Specifies the satellite that will process the constellation request.");

		TableViewerColumn tableViewerPriority = new TableViewerColumn(requestsViewer, SWT.NONE);
		TableColumn tblclmnPriority = tableViewerPriority.getColumn();
		tblclmnPriority.setWidth(150);
		tblclmnPriority.setText("Priority");
		tblclmnPriority.setToolTipText("Specifies the priority level the constellation request.");
		
		TableViewerColumn tableViewerColumnStatus = new TableViewerColumn(requestsViewer, SWT.NONE);
		TableColumn tblclmnStatus = tableViewerColumnStatus.getColumn();
		tblclmnStatus.setWidth(100);
		tblclmnStatus.setText("Status");
		tblclmnStatus.setToolTipText("Actual execution status of the constellation Request.");

		TableViewerColumn tableViewerColumnLocation = new TableViewerColumn(requestsViewer, SWT.NONE);
		TableColumn tblclmnLocation = tableViewerColumnLocation.getColumn();
		tblclmnLocation.setWidth(150);
		tblclmnLocation.setText("CMD Location");
		tblclmnLocation.setToolTipText("Requested location where to perform the request.");

		TableViewerColumn tableViewerColumnScheduleTime = new TableViewerColumn(requestsViewer, SWT.NONE);
		TableColumn tblclmnScheduleTime = tableViewerColumnScheduleTime.getColumn();
		tblclmnScheduleTime.setWidth(150);
		tblclmnScheduleTime.setText("CMD Time");
		tblclmnScheduleTime
				.setToolTipText("Time at which the command associated to the constellation request will be executed.");

		TableViewerColumn tableViewerCompletionTime = new TableViewerColumn(requestsViewer, SWT.NONE);
		TableColumn tblclmnCompletionTime = tableViewerCompletionTime.getColumn();
		tblclmnCompletionTime.setWidth(150);
		tblclmnCompletionTime.setText("ACT Time");
		tblclmnCompletionTime.setToolTipText(
				"Time at which the command associated to the constellation request was effectively executed.");

		TableViewerColumn tableViewerColumnActualLocation = new TableViewerColumn(requestsViewer, SWT.NONE);
		TableColumn tblclmnActualLocation = tableViewerColumnActualLocation.getColumn();
		tblclmnActualLocation.setWidth(150);
		tblclmnActualLocation.setText("Actual Location");
		tblclmnActualLocation.setToolTipText(
				"Specifies the location where the command associated to the constellation request was executed.");

		TableViewerColumn tableViewerResult = new TableViewerColumn(requestsViewer, SWT.NONE);
		TableColumn tblclmnResult = tableViewerResult.getColumn();
		tblclmnResult.setWidth(50);
		tblclmnResult.setText("Data");
		tblclmnResult.setToolTipText("Indicates if the constellation request has a result.");

		requestsViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		requestsViewer.setLabelProvider(new RequestsLabelProvider(adapterFactory));

		/*
		 * Show/Hide Column Menu Items.
		 */
		Menu contextMenu = new Menu(tableRequests);
		requestsViewer.getTable().setMenu(contextMenu);
		for (TableColumn tableColumn : requestsViewer.getTable().getColumns()) {

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

		sashForm.setWeights(new int[] { 1, 2 });
	}

	/*
	 * Sets the constellation state reference.
	 * 
	 * @param constellationState Constellation state reference.
	 */
	public void setConstellationRequests(ConstellationRequestsList constellationRequestsList) {
		this.constellationRequestsList = constellationRequestsList;

		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}

		if (this.constellationRequestsList != null) {
			m_bindingContext = initDataBindings();
		}
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

		if (constellationRequestsList != null) {
			requestsViewer.setInput(constellationRequestsList);
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
	}

	public class ActivitiesViewerComparator extends ViewerComparator {
		/*
		 * http://www.vogella.com/tutorials/EclipseJFaceTableAdvanced/article.
		 * html
		 */
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
		private static final int PRIORITY_COLUMN_ID = 2;
//		private static final int STATUS_COLUMN_ID = 3;		
//		private static final int TYPE_COLUMN_ID = 4;

		@Override
		public String getColumnText(Object object, int columnIndex) {
			String str = "<undefined>";
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

			default:
				break;
			}

			return str;
		}
		
		@Override
		public Image getColumnImage(Object object, int columnIndex) {
			return null;
		}
	}
}