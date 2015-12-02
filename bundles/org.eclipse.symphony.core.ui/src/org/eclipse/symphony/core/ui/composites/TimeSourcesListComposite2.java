package org.eclipse.symphony.core.ui.composites;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.emf.TimeSource;
import org.eclipse.symphony.common.emf.Timed;
import org.eclipse.symphony.core.SymphonyEnvironment;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.core.TimeSourcesList;
import org.eclipse.symphony.core.invocator.Context;
import org.eclipse.symphony.core.invocator.ContextsList;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.ui.composites.ContextsListComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class TimeSourcesListComposite2 extends Composite {

	private final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private DataBindingContext m_bindingContext;
	private EditingDomain editingDomain;
	private TimeSourcesList timeSourcesList;
	private CheckboxTableViewer timeSourcesListViewer;
	private AdapterImpl environmentAdapter;
	private ISelectionChangedListener timeSourcesListViewerSelectionListener;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public TimeSourcesListComposite2(Composite parent, int style) {
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout(1, true));
		
        Table table = new Table(this, SWT.CHECK | SWT.BORDER
				| SWT.SINGLE | SWT.FULL_SELECTION | style);
        table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        table.setLinesVisible(true);
        table.setHeaderVisible(true);
		toolkit.paintBordersFor(table);

		timeSourcesListViewer = new CheckboxTableViewer(table);	
		timeSourcesListViewer.setCheckStateProvider(new ICheckStateProvider() {
			@Override
			public boolean isGrayed(Object element) {
				return false;
			}
			@Override
			public boolean isChecked(Object element) {
				return getEnvironment() != null && getEnvironment().getActiveTimeSource() == element;
			}
		});
		timeSourcesListViewer.addCheckStateListener(new ICheckStateListener() {
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				if (event.getChecked()) {
					SetCommand command = new SetCommand(
							editingDomain,
							getEnvironment(),
							Symphony__CorePackage.Literals.SYMPHONY_ENVIRONMENT__ACTIVE_TIME_SOURCE,
							event.getElement());
					editingDomain.getCommandStack().execute(command);
				}
			}
		});
		
		TableViewerColumn tableViewerColumnItem_Active = new TableViewerColumn(
				timeSourcesListViewer, SWT.NONE);
		TableColumn trclmnItem = tableViewerColumnItem_Active.getColumn();
		trclmnItem.setWidth(60);
		trclmnItem.setText("Active");
		
		TableViewerColumn tableViewerColumnItem_Name = new TableViewerColumn(
				timeSourcesListViewer, SWT.NONE);
		TableColumn trclmnItemName = tableViewerColumnItem_Name.getColumn();
		trclmnItemName.setWidth(200);
		trclmnItemName.setText("Name");
		tableViewerColumnItem_Name.setEditingSupport(new EditingSupport(timeSourcesListViewer) {
			@Override
			protected void setValue(Object element, Object value) {
				TimeSource timeSource = (TimeSource) element;
				SetCommand command = new SetCommand(
						editingDomain,
						timeSource,
						Symphony__CommonEMFPackage.Literals.NAMED__NAME,
						value);
				editingDomain.getCommandStack().execute(command);				
			}
			
			@Override
			protected Object getValue(Object element) {
				return ((TimeSource)element).getName();
			}
			
			@Override
			protected CellEditor getCellEditor(Object element) {
				return new TextCellEditor((Composite)getViewer().getControl());
			}
			
			@Override
			protected boolean canEdit(Object element) {
				return true;
			}
		});
		
		TableViewerColumn tableViewerColumnItem_Type = new TableViewerColumn(
				timeSourcesListViewer, SWT.NONE);
		TableColumn trclmnItemType = tableViewerColumnItem_Type.getColumn();
		trclmnItemType.setWidth(200);
		trclmnItemType.setText("Type");
		
		TableViewerColumn tableViewerColumnItem_Time = new TableViewerColumn(
				timeSourcesListViewer, SWT.NONE);
		TableColumn trclmnItemTime = tableViewerColumnItem_Time.getColumn();
		trclmnItemTime.setWidth(100);
		trclmnItemTime.setText("Time");
		
		timeSourcesListViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));		
		timeSourcesListViewer
		.setLabelProvider(new AdapterFactoryLabelProvider(
				adapterFactory){
			private final static int ACTIVE_COLUMN_ID = 0;
			private final static int NAME_COLUMN_ID = 1;
			private final static int TYPE_COLUMN_ID = 2;
			private final static int TIME_COLUMN_ID = 3;
			
			@Override
			public String getColumnText(Object object, int columnIndex) {				
				String str = "<undefined>";
				TimeSource timeSource = (TimeSource) object;

				switch (columnIndex) {
				case ACTIVE_COLUMN_ID:
					str = "";
					break;

				case NAME_COLUMN_ID:
					str = timeSource.getName();
					break;
					
				case TYPE_COLUMN_ID:
					str = timeSource.getClass().getName().substring(timeSource.getClass().getName().lastIndexOf(".") + 1);
					str = str.substring(0, str.lastIndexOf("Impl"));
					break;
					
				case TIME_COLUMN_ID:
					Date date = timeSource.getTime();
					str = date == null ? "N/A." : new SimpleDateFormat(
							"yyyy/MM/dd HH:mm:ss.SSS").format(((Timed) object)
							.getTime());
					break;
				default:
					break;
				}

				return str;
			}
			
			@Override
			public Image getColumnImage(Object object, int columnIndex) {
				return columnIndex == ACTIVE_COLUMN_ID ? super.getColumnImage(object, columnIndex) : null;
			}
		});
	}
		
	/**
	 * Returns the environment that contains the {@link ContextsList}.
	 * 
	 * @return Reference to the environment.
	 */
	private SymphonyEnvironment getEnvironment() {
		return timeSourcesList == null ? null : timeSourcesList.getEnvironment();
	}
		
	/**
	 * Binds the {@link TimeSourcesList} with the composite.
	 * 
	 * @param context
	 *            Reference to the list of {@link TimeSourcesList}.
	 */
	public void setTimeSourcesList(TimeSourcesList timeSourcesList) {
		setTimeSourcesList(timeSourcesList, true);
	}
	
	/**
	 * Sets the {@link TimeSourcesList}.
	 * 
	 * @param timeSourcesList
	 *            Reference to the list of {@link TimeSourcesList}.
	 * @param update
	 *            If true then data bindings are created.
	 */
	private void setTimeSourcesList(TimeSourcesList timeSourcesList, boolean update) {
		this.timeSourcesList = timeSourcesList;
		editingDomain = AdapterFactoryEditingDomain
				.getEditingDomainFor(timeSourcesList);
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}

			if (timeSourcesList != null) {
				m_bindingContext = initDataBindings();
			}
		}
	}	
	
	/**
	 * Use this to prevent Window Pro Builder code analysis to fail with the
	 * complex data bindings code. Invokes
	 * {@link ContextsListComposite#initDataBindingsCustom()}.
	 * 
	 * @return Reference to the data bindings context.
	 * @see ContextsListComposite#initDataBindingsCustom()
	 */
	private DataBindingContext initDataBindings() {
		return initDataBindingsCustom();
	}

	/**
	 * Creates and returns the data bindings context that takes care of the
	 * Contexts List Viewer.
	 * 
	 * @return Reference to the data bindings context.
	 */
	private DataBindingContext initDataBindingsCustom() {
		DataBindingContext bindingContext = new DataBindingContext();
		

		/**
		 * Set the default selection to the active context if any or the first
		 * item.
		 */
		TimeSource defaultSelectedTimeSource = getEnvironment().getActiveTimeSource();
		if (defaultSelectedTimeSource == null
				&& !getEnvironment().getTimeSourcesList().getTimeSources().isEmpty()) {
			defaultSelectedTimeSource = getEnvironment().getTimeSourcesList().getTimeSources().get(0);
		}
		timeSourcesListViewer.setSelection(new StructuredSelection(
				defaultSelectedTimeSource), true);

		/**
		 * Listens to selection changed.
		 */
		timeSourcesListViewer
		.removeSelectionChangedListener(getContextsListViewerSelectionListener());
		
		timeSourcesListViewer		
				.addSelectionChangedListener(getContextsListViewerSelectionListener());

		/** Listens to changes to the environment. */
		getEnvironment().eAdapters().remove(getEnvironmentAdapter());
		getEnvironment().eAdapters().add(getEnvironmentAdapter());

		/** Sets the input. */
		timeSourcesListViewer.setInput(timeSourcesList);

		return bindingContext;
	}
	
	/**
	 * This method is called when a new selection is made in the composite.
	 * @param selection Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
	}
	
	/**
	 * Returns the selected {@link TimeSource}.
	 * 
	 * @return Reference to the {@link TimeSource}.
	 */
	public TimeSource getSelectedTimeSource() {
		IStructuredSelection selection = (IStructuredSelection) timeSourcesListViewer
				.getSelection();
		return (TimeSource) selection.getFirstElement();
	}
	
	/**
	 * This adapter listens {@link Environment#setActiveContext(Context)}
	 * changes.
	 * 
	 * @return Reference to the adapter.
	 */
	private Adapter getEnvironmentAdapter() {
		if (environmentAdapter == null) {
			environmentAdapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getFeatureID(Environment.class) == Symphony__CorePackage.SYMPHONY_ENVIRONMENT__ACTIVE_TIME_SOURCE) {
						timeSourcesListViewer.refresh();
					}
				}
			};
		}
		return environmentAdapter;
	}
	
	/**
	 * Time Sources List Viewer Selection Listener.
	 * @return Reference to the listener.
	 */
	private ISelectionChangedListener getContextsListViewerSelectionListener() {
		if (timeSourcesListViewerSelectionListener == null) {
			timeSourcesListViewerSelectionListener = new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					newSelection(event.getSelection());
				}
			};
		}
		return timeSourcesListViewerSelectionListener;
	}

	
	@Override
	public void dispose() {
		getEnvironment().eAdapters().remove(getEnvironmentAdapter());
		super.dispose();		
	}	
}