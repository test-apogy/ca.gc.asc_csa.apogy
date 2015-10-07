package org.eclipse.symphony.core.ui.composites;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.symphony.core.ui.NewSymphonySessionSettings;
import org.eclipse.symphony.core.ui.SymphonyCoreUiPackage.Literals;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class NewSymphonySessionComposite extends Composite {
	private DataBindingContext m_bindingContext;

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Text textFilename;
	private NewSymphonySessionSettings sessionSettings;
	private Button btnEnvironmentCheckButton;
	private Button btnProgramCheckButton;
	private Button btnToolsCheckButton;
	private Button btnDataProductsCheckButton;
	
	
	public NewSymphonySessionComposite(Composite parent, int style, NewSymphonySessionSettings sessionSettings) {
		this(parent, style);
		this.sessionSettings = sessionSettings;
	}
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public NewSymphonySessionComposite(Composite parent, int style) {
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout(2, false));
		
		Label lblFilename = new Label(this, SWT.NONE);
		toolkit.adapt(lblFilename, true, true);
		lblFilename.setText("Filename :");
		
		textFilename = new Text(this, SWT.BORDER);
		textFilename.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		toolkit.adapt(textFilename, true, true);
		
		Group grpContent = new Group(this, SWT.SHADOW_ETCHED_OUT);
		FillLayout fl_grpContent = new FillLayout(SWT.VERTICAL);
		fl_grpContent.marginHeight = 5;
		fl_grpContent.marginWidth = 5;
		fl_grpContent.spacing = 5;
		grpContent.setLayout(fl_grpContent);
		grpContent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
		grpContent.setText("Content");
		toolkit.adapt(grpContent);
		toolkit.paintBordersFor(grpContent);
		
		btnEnvironmentCheckButton = new Button(grpContent, SWT.CHECK);
		btnEnvironmentCheckButton.setSelection(true);
		toolkit.adapt(btnEnvironmentCheckButton, true, true);
		btnEnvironmentCheckButton.setText("Environment");
		
		btnProgramCheckButton = new Button(grpContent, SWT.CHECK);
		btnProgramCheckButton.setSelection(true);
		toolkit.adapt(btnProgramCheckButton, true, true);
		btnProgramCheckButton.setText("Programs");
		
		btnDataProductsCheckButton = new Button(grpContent, SWT.CHECK);
		btnDataProductsCheckButton.setSelection(true);
		toolkit.adapt(btnDataProductsCheckButton, true, true);
		btnDataProductsCheckButton.setText("DataProducts");
		
		btnToolsCheckButton = new Button(grpContent, SWT.CHECK);
		btnToolsCheckButton.setSelection(true);
		toolkit.adapt(btnToolsCheckButton, true, true);
		btnToolsCheckButton.setText("Tools");
		
		if (sessionSettings!=null){
			m_bindingContext = initDataBindings();
		}
	}
	
	public NewSymphonySessionSettings getNewSymphonySessionSettings() {
		return sessionSettings;
	}

	public void setNewSymphonySessionSettings(NewSymphonySessionSettings sessionSettings) {
		setNewSymphonySessionSettings(sessionSettings, true);
	}

	public void setNewSymphonySessionSettings(NewSymphonySessionSettings sessionSettings,
			boolean update) {
		this.sessionSettings = sessionSettings;
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			if (this.sessionSettings != null) {
				m_bindingContext = initDataBindings();
			}
		}
	}	
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextTextFilenameObserveWidget = WidgetProperties.text(SWT.Modify).observe(textFilename);
		IObservableValue sessionSettingsFilenameObserveValue = EMFObservables.observeValue(sessionSettings, Literals.NEW_SYMPHONY_SESSION_SETTINGS__FILENAME);
		bindingContext.bindValue(observeTextTextFilenameObserveWidget, sessionSettingsFilenameObserveValue, null, null);
		//
		IObservableValue observeSelectionBtnToolsCheckButtonObserveWidget = WidgetProperties.selection().observe(btnToolsCheckButton);
		IObservableValue sessionSettingsCreateToolsObserveValue = EMFObservables.observeValue(sessionSettings, Literals.NEW_SYMPHONY_SESSION_SETTINGS__CREATE_TOOLS);
		bindingContext.bindValue(observeSelectionBtnToolsCheckButtonObserveWidget, sessionSettingsCreateToolsObserveValue, null, null);
		//
		IObservableValue observeSelectionBtnProgramCheckButtonObserveWidget = WidgetProperties.selection().observe(btnProgramCheckButton);
		IObservableValue sessionSettingsCreateProgramsObserveValue = EMFObservables.observeValue(sessionSettings, Literals.NEW_SYMPHONY_SESSION_SETTINGS__CREATE_PROGRAMS);
		bindingContext.bindValue(observeSelectionBtnProgramCheckButtonObserveWidget, sessionSettingsCreateProgramsObserveValue, null, null);
		//
		IObservableValue observeSelectionBtnEnvironmentCheckButtonObserveWidget = WidgetProperties.selection().observe(btnEnvironmentCheckButton);
		IObservableValue sessionSettingsCreateEnvironmentObserveValue = EMFObservables.observeValue(sessionSettings, Literals.NEW_SYMPHONY_SESSION_SETTINGS__CREATE_ENVIRONMENT);
		bindingContext.bindValue(observeSelectionBtnEnvironmentCheckButtonObserveWidget, sessionSettingsCreateEnvironmentObserveValue, null, null);
		//
		IObservableValue observeSelectionBtnDataProductsCheckButtonObserveWidget = WidgetProperties.selection().observe(btnDataProductsCheckButton);
		IObservableValue sessionSettingsCreateDataProductsObserveValue = EMFObservables.observeValue(sessionSettings, Literals.NEW_SYMPHONY_SESSION_SETTINGS__CREATE_DATA_PRODUCTS);
		bindingContext.bindValue(observeSelectionBtnDataProductsCheckButtonObserveWidget, sessionSettingsCreateDataProductsObserveValue, null, null);
		//
		return bindingContext;
	}
}