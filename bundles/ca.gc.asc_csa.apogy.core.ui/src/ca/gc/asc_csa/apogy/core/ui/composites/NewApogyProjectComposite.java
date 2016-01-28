package ca.gc.asc_csa.apogy.core.ui.composites;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage.Literals;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class NewApogyProjectComposite extends Composite {
	private DataBindingContext m_bindingContext;

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Text textFolder;
	private NewApogyProjectSettings settings;
	private Button btnCheckButton;
	
	
	public NewApogyProjectComposite(Composite parent, int style, NewApogyProjectSettings settings) {
		this(parent, style);
		this.settings = settings;
	}
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public NewApogyProjectComposite(Composite parent, int style) {
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout(2, false));
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		toolkit.adapt(lblNewLabel, true, true);
		lblNewLabel.setText("Name :");
		
		textFolder = new Text(this, SWT.BORDER);
		textFolder.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		toolkit.adapt(textFolder, true, true);
		
		btnCheckButton = new Button(this, SWT.CHECK);
		GridData gd_btnCheckButton = new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1);
		gd_btnCheckButton.widthHint = 117;
		btnCheckButton.setLayoutData(gd_btnCheckButton);
		toolkit.adapt(btnCheckButton, true, true);
		btnCheckButton.setText("Import Registered Apogy Project");
		
		if (settings!=null){
			m_bindingContext = initDataBindings();
		}
	}
	
	public NewApogyProjectSettings getNewApogyProjectSettings() {
		return settings;
	}

	public void setNewApogyProjectSettings(NewApogyProjectSettings settings) {
		setNewApogyProjectSettings(settings, true);
	}

	public void setNewApogyProjectSettings(NewApogyProjectSettings settings,
			boolean update) {
		this.settings = settings;
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			if (this.settings != null) {
				m_bindingContext = initDataBindings();
			}
		}
	}	
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeSelectionBtnCheckButtonObserveWidget = WidgetProperties.selection().observe(btnCheckButton);
		IObservableValue createSessionSettingsObserveValue = EMFObservables.observeValue(settings, Literals.NEW_APOGY_PROJECT_SETTINGS__IMPORT_REGISTERED_PROJECT);
		bindingContext.bindValue(observeSelectionBtnCheckButtonObserveWidget, createSessionSettingsObserveValue, null, null);
		//
		IObservableValue observeTextTextFolderObserveWidget_1 = WidgetProperties.text(SWT.Modify).observeDelayed(100, textFolder);
		IObservableValue settingsNameObserveValue = EMFObservables.observeValue(settings, Literals.NEW_APOGY_PROJECT_SETTINGS__NAME);
		bindingContext.bindValue(observeTextTextFolderObserveWidget_1, settingsNameObserveValue, null, null);
		//
		return bindingContext;
	}
}