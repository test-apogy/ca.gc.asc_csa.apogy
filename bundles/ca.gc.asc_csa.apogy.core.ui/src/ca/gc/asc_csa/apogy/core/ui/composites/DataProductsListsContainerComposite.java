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

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITableColorProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.PlatformUI;

import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.emf.Timed;
import ca.gc.asc_csa.apogy.common.emf.edit.utils.ApogyCommonEMFEditUtilsFacade;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.core.OperationCallPositionedResult;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsList;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResult;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList;

public class DataProductsListsContainerComposite extends Composite {
	private DataBindingContext m_currentDataBindings;

	private final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private TreeViewer treeViewer;

	private DataProductsListsContainer dataProductsListsContainer;

	private ISelectionChangedListener treeViewerSelectionChangedListener;

	public DataProductsListsContainerComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(1, true));

		treeViewer = new TreeViewer(this, SWT.BORDER | SWT.SINGLE
				| SWT.V_SCROLL);
		ColumnViewerToolTipSupport.enableFor(treeViewer, ToolTip.NO_RECREATE);
		Tree tree = treeViewer.getTree();
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		TreeViewerColumn treeViewerColumnItem_Name = new TreeViewerColumn(
				treeViewer, SWT.NONE);
		TreeColumn trclmnItem = treeViewerColumnItem_Name.getColumn();
		trclmnItem.setWidth(350);
		trclmnItem.setText("Name");

		TreeViewerColumn treeViewerColumnItem_Time = new TreeViewerColumn(
				treeViewer, SWT.NONE);
		TreeColumn trclmnTime = treeViewerColumnItem_Time.getColumn();
		trclmnTime.setWidth(200);
		trclmnTime.setText("Time");

		TreeViewerColumn treeViewerColumnItem_Context = new TreeViewerColumn(
				treeViewer, SWT.NONE);
		TreeColumn trclmnContext = treeViewerColumnItem_Context.getColumn();
		trclmnContext.setWidth(100);
		trclmnContext.setText("Context");

		TreeViewerColumn treeViewerColumnItem_Position = new TreeViewerColumn(
				treeViewer, SWT.NONE);
		TreeColumn trclmnPosition = treeViewerColumnItem_Position.getColumn();
		trclmnPosition.setWidth(150);
		trclmnPosition.setText("Position");

		TreeViewerColumn treeViewerColumnItem_Orientation = new TreeViewerColumn(
				treeViewer, SWT.NONE);
		TreeColumn trclmnOrientation = treeViewerColumnItem_Orientation
				.getColumn();
		trclmnOrientation.setWidth(150);
		trclmnOrientation.setText("Orientation");

		TreeViewerColumn treeViewerColumnItem_Exception = new TreeViewerColumn(
				treeViewer, SWT.NONE);
		TreeColumn trclmnException = treeViewerColumnItem_Exception.getColumn();
		trclmnException.setWidth(120);
		trclmnException.setText("Value");

		treeViewer.setContentProvider(new AdapterFactoryContentProvider(
				adapterFactory) {
			@Override
			public Object[] getChildren(Object object) {
				if (object instanceof DataProductsListsContainer
						|| object instanceof DataProductsList
						|| object instanceof OperationCallResultsList) {
					return super.getChildren(object);
				} else {
					return null;
				}
			}

			@Override
			public boolean hasChildren(Object object) {
				if (object instanceof DataProductsListsContainer
						|| object instanceof DataProductsList
						|| object instanceof OperationCallResultsList) {
					return super.hasChildren(object);
				} else {
					return false;
				}
			}
		});
		treeViewer
				.setLabelProvider(new DataProductsListsContainerLabelProvider(
						adapterFactory));

		treeViewer
				.addSelectionChangedListener(getTreeViewerSelectionChangedListener());
	}

	/**
	 * Returns the Tree Viewer Selection Listener.
	 * 
	 * @return Tree selection listener singleton.
	 */
	private ISelectionChangedListener getTreeViewerSelectionChangedListener() {
		if (treeViewerSelectionChangedListener == null) {
			treeViewerSelectionChangedListener = new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					DataProductsListsContainerComposite.this.newSelection(event
							.getSelection());
				}
			};
		}
		return treeViewerSelectionChangedListener;
	}

	/**
	 * This method is called when a new selection is made in the composite.
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
	}

	/**
	 * Sets the {@link DataProductsListsContainer} to be displayed in the
	 * composite.
	 * 
	 * @param dataProductsListsContainer
	 *            Reference to the {@link DataProductsListsContainer}.
	 */
	public void setDataProductsListsContainer(
			DataProductsListsContainer dataProductsListsContainer) {
		this.dataProductsListsContainer = dataProductsListsContainer;

		if (dataProductsListsContainer != null) {
			if (m_currentDataBindings != null) {
				m_currentDataBindings.dispose();
			}
			m_currentDataBindings = initDataBindings();
		}
	}

	/**
	 * Initializes the bindings. Invokes {@link #initDataBindingsCustom()}. This
	 * pattern is used to prevent Window Pro Builder to erase custom
	 * implementation.
	 * 
	 * @return Bindings context.
	 */
	protected DataBindingContext initDataBindings() {
		return initDataBindingsCustom();
	}

	/**
	 * Initializes the bindings. Invokes {@link #initDataBindingsCustom()}.
	 * 
	 * @return Bindings context.
	 */
	protected DataBindingContext initDataBindingsCustom() {
		DataBindingContext bindingContext = new DataBindingContext();

		if (dataProductsListsContainer != null) {
			if (!treeViewer.getTree().isDisposed()) {
				treeViewer.setInput(dataProductsListsContainer);
				treeViewer.expandAll();
			}
		}

		return bindingContext;
	}

	@Override
	public void dispose() {
		if (m_currentDataBindings != null) {
			m_currentDataBindings.dispose();
		}
		super.dispose();
		treeViewer
				.removeSelectionChangedListener(getTreeViewerSelectionChangedListener());
	}

	/**
	 * 
	 * Label Provider.
	 *
	 */
	private class DataProductsListsContainerLabelProvider extends
			AdapterFactoryLabelProvider implements ITableLabelProvider,
			ITableColorProvider {

		private final static int NAME_COLUMN_ID = 0;
		private final static int TIME_COLUMN_ID = 1;
		private final static int CONTEXT_COLUMN_ID = 2;
		private final static int POSITION_COLUMN_ID = 3;
		private final static int ORIENTATION_COLUMN_ID = 4;
		private final static int VALUE_COLUMN_ID = 5;

		public DataProductsListsContainerLabelProvider(
				AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		public String getColumnText(Object object, int columnIndex) {
			String str = "<undefined>";

			switch (columnIndex) {
			case NAME_COLUMN_ID:
				if (object instanceof Named) {
					str = ApogyCommonEMFEditUtilsFacade.INSTANCE.getText(object);
				} else if (object instanceof OperationCallResult) {
					OperationCallResult result = (OperationCallResult) object;
					str = ApogyCommonEMFEditUtilsFacade.INSTANCE.getText(result
							.getOperationCall());
				}
				break;

			case TIME_COLUMN_ID:
				str = "";
				if (object instanceof Timed) {
					Date date = ((Timed) object).getTime();
					str = date == null ? "N/A." : new SimpleDateFormat(
							"MM/dd/yyyy HH:mm:ss.SSS").format(((Timed) object)
							.getTime());
				}
				break;

			case CONTEXT_COLUMN_ID:
				str = "";
				if (object instanceof OperationCallResult) {
					Context context = ((OperationCallResult) object)
							.getContext();
					str = ApogyCommonEMFEditUtilsFacade.INSTANCE.getText(context);
				}
				break;

			case POSITION_COLUMN_ID:
				str = "";
				if (object instanceof OperationCallResult) {
					if (object instanceof OperationCallPositionedResult) {
						OperationCallPositionedResult result = (OperationCallPositionedResult) object;
						if (result.getPose() == null) {
							str = "Null";
						} else {
							Tuple3d position = ApogyCommonMathFacade.INSTANCE
									.extractPosition(result.getPose());
							str = ApogyCommonEMFEditUtilsFacade.INSTANCE
									.getText(position);
						}
					} else {
						str = "N/A.";
					}
				}
				break;

			case ORIENTATION_COLUMN_ID:
				str = "";
				if (object instanceof OperationCallResult) {
					if (object instanceof OperationCallPositionedResult) {
						OperationCallPositionedResult result = (OperationCallPositionedResult) object;
						if (result.getPose() == null) {
							str = "Null";
						} else {

							Tuple3d orientation = ApogyCommonMathFacade.INSTANCE
									.extractOrientation(result.getPose());
							/** Convert in degrees. */
							orientation
									.setX(Math.toDegrees(orientation.getX()));
							orientation
									.setY(Math.toDegrees(orientation.getY()));
							orientation
									.setZ(Math.toDegrees(orientation.getZ()));

							str = ApogyCommonEMFEditUtilsFacade.INSTANCE
									.getText(orientation);
						}
					} else {
						str = "N/A.";
					}
				}
				break;

			case VALUE_COLUMN_ID:
				str = "";
				if (object instanceof OperationCallResult) {
					OperationCallResult result = (OperationCallResult) object;

					if (result.getExceptionContainer() != null
							&& result.getExceptionContainer().getException() != null) {
						str = result.getExceptionContainer().getException()
								.getMessage();
					} else {
						str = result.getResultValue() == null ? "Null"
								: ApogyCommonEMFEditUtilsFacade.INSTANCE
										.getText(result.getResultValue());
					}
				}
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

		@Override
		public Color getBackground(Object object, int columnIndex) {
			Color color = super.getBackground(object, columnIndex);

			/** Put the background in red if any exception occurred on the call. */
			if (object instanceof OperationCallResult) {
				OperationCallResult opResult = (OperationCallResult) object;
				if (opResult.getExceptionContainer() != null
						&& opResult.getExceptionContainer().getException() != null) {
					color = PlatformUI.getWorkbench().getDisplay()
							.getSystemColor(SWT.COLOR_RED);
				}
			}
			return color;
		}
	}
}