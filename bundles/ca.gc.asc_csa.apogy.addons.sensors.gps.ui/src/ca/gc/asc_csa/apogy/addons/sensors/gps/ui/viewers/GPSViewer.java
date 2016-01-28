package ca.gc.asc_csa.apogy.addons.sensors.gps.ui.viewers;

import java.text.NumberFormat;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import ca.gc.asc_csa.apogy.addons.sensors.gps.Activator;
import ca.gc.asc_csa.apogy.addons.sensors.gps.GPS;
import ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading;
import ca.gc.asc_csa.apogy.addons.sensors.gps.GPSRepository;
import ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSPackage;
import ca.gc.asc_csa.apogy.common.emf.EListAdapter;
import ca.gc.asc_csa.apogy.common.emf.ListEventDelegate;
import ca.gc.asc_csa.apogy.common.lang.java.Timer;

/**
 * This class is a GPS viewer. that displays a {@link GPS} object.
 * 
 * @author sgemme
 * 
 */
public class GPSViewer extends Viewer {

	private Composite parent;
	private Composite content;
	private GPS input;

	// Widgets
	private Label tLongitude;
	private Label tLatitude;
	private Label tElevation;
	private Label tQuality;
	private Label tNOS;
	private Label tTimeStamp;
	private Label tHDP;
	private Label tMSL;
	private Label tUpdateRate;
	private Label tStatus;
	private Adapter gpsListener;
	// The gps timer that determines the update rate.
	private Timer gpsTimer;
	// The list of available gps.
	private Combo availableGps;
	private ISelection selection;
	private EListAdapter<GPS> gpsRepListener;

	public GPSViewer(Composite parent) {
		super();
		this.parent = parent;
		init();
	}

	/**
	 * Initializes the content of the viewer. Creates all the GUI layout.
	 * <p>
	 * Pre-condition: None
	 * </p>
	 * <p>
	 * Post-condition: content is initialized.
	 * </p>
	 */
	private void init() {
		content = new Composite(parent, SWT.NONE);

		content.setLayout(new GridLayout(2, true));

		// We populate the content.

		// Available gps.
		Label lAvailableGps = new Label(content, SWT.NONE);
		lAvailableGps.setText("GPS: ");
		availableGps = new Combo(content, SWT.SINGLE);
		availableGps.setLayoutData(new GridData(GridData.FILL, GridData.FILL,
				true, true));

		// Longitude
		Label lLongitude = new Label(content, SWT.NONE);
		lLongitude.setText("Longitude");

		tLongitude = new Label(content, SWT.NONE);
		tLongitude.setLayoutData(new GridData(GridData.FILL, GridData.FILL,
				true, true));

		// Latitude
		Label lLatitude = new Label(content, SWT.NONE);
		lLatitude.setText("Latitude");

		tLatitude = new Label(content, SWT.NONE);
		tLatitude.setLayoutData(new GridData(GridData.FILL, GridData.FILL,
				true, true));

		// Elevation
		Label lElevation = new Label(content, SWT.NONE);
		lElevation.setText("Elevation");

		tElevation = new Label(content, SWT.NONE);
		tElevation.setLayoutData(new GridData(GridData.FILL, GridData.FILL,
				true, true));

		// Quality
		Label lQuality = new Label(content, SWT.NONE);
		lQuality.setText("Quality");

		tQuality = new Label(content, SWT.NONE);
		tQuality.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true,
				true));

		// Time Stamp
		Label lTimeStamp = new Label(content, SWT.NONE);
		lTimeStamp.setText("Time Stamp");

		tTimeStamp = new Label(content, SWT.NONE);
		tTimeStamp.setLayoutData(new GridData(GridData.FILL, GridData.FILL,
				true, true));

		// Number of satellites
		Label lNOS = new Label(content, SWT.NONE);
		lNOS.setText("Number of Satellites");

		tNOS = new Label(content, SWT.NONE);
		tNOS.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true,
				true));

		// Horizontal dilution position
		Label lHDP = new Label(content, SWT.NONE);
		lHDP.setText("Horizontal Dilution Pos.");

		tHDP = new Label(content, SWT.NONE);
		tHDP.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true,
				true));

		// Mean Sea Level
		Label lMSL = new Label(content, SWT.NONE);
		lMSL.setText("Mea Sea Level");

		tMSL = new Label(content, SWT.NONE);
		tMSL.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true,
				true));

		// Update rate
		Label lUpdateRate = new Label(content, SWT.NONE);
		lUpdateRate.setText("Update Rate");

		tUpdateRate = new Label(content, SWT.NONE);
		tUpdateRate.setLayoutData(new GridData(GridData.FILL, GridData.FILL,
				true, true));

		// Status
		Label lStatus = new Label(content, SWT.NONE);
		lStatus.setText("Status");

		tStatus = new Label(content, SWT.NONE);
		tStatus.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true,
				true));

		Activator.getDefault().getGPSRepository().eAdapters().add(
				getGPSRepositoryListener());

		// We populate the list of available gps.
		populateGpsList();

		// We register the listener on the gps list.
		availableGps.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				Runnable run = new Runnable() {

					@Override
					public void run() {
						int idx = availableGps.getSelectionIndex();
						String id = availableGps.getItem(idx);

						GPS gps = Activator.getDefault().getGPSRepository()
								.getGPSById(id);

						// We set the selection to be this gps.
						StructuredSelection ssel = new StructuredSelection(gps);

						setSelection(ssel);
					}
				};
				parent.getShell().getDisplay().asyncExec(run);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		// Start / stop buttons
		Button bStart = new Button(content, SWT.PUSH);
		bStart.setText("Start");

		bStart.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {

				Runnable run = new Runnable() {

					@Override
					public void run() {
						int idx = availableGps.getSelectionIndex();

						String id = availableGps.getItem(idx);

						// We retrieve the GPS object.
						GPS gps = Activator.getDefault().getGPSRepository()
								.getGPSById(id);

						setSelection(new StructuredSelection(gps));

						gps.start();

					}
				};

				parent.getShell().getDisplay().asyncExec(run);

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		Button bStop = new Button(content, SWT.PUSH);
		bStop.setText("Stop");
	}

	/**
	 * Populates the list of available GPS based on the {@link GPSRepository}
	 * .INSTANCE object that contains the list of available gps.
	 */
	private void populateGpsList() {

		Runnable run = new Runnable() {

			@Override
			public void run() {

				availableGps.removeAll();

				// We get a list of gps.
				EList<GPS> gpsDevices = Activator.getDefault()
						.getGPSRepository().getGpsDevices();

				for (GPS gps : gpsDevices) {
					String id = gps.getConnection().toString();
					availableGps.add(id);
				}

				if (availableGps.getItemCount() > 0) {
					availableGps.select(0);
				}
			}
		};

		parent.getShell().getDisplay().asyncExec(run);

	}

	private EListAdapter<GPS> getGPSRepositoryListener() {
		if (gpsRepListener == null) {
			ListEventDelegate<GPS> delegate = new ListEventDelegate<GPS>() {

				@Override
				public void removedMany(java.util.List<GPS> elements) {
					populateGpsList();
				}

				@Override
				public void removed(GPS element) {
					populateGpsList();
				}

				@Override
				public void addedMany(java.util.List<GPS> elements) {
					populateGpsList();
				}

				@Override
				public void added(GPS element) {
					populateGpsList();
				}
			};

			gpsRepListener = new EListAdapter<GPS>(
					ApogyAddonsSensorsGPSPackage.GPS_REPOSITORY__GPS_DEVICES, delegate,
					GPSRepository.class);
		}
		return gpsRepListener;
	}

	@Override
	public Control getControl() {
		return content;
	}

	@Override
	public Object getInput() {
		return input;
	}

	@Override
	public ISelection getSelection() {
		return selection;
	}

	@Override
	public void refresh() {
	}

	@Override
	public void setInput(Object input) {
		if (input instanceof GPS) {
			this.input = (GPS) input;
		} else {
			throw new IllegalArgumentException("Input must be a GPS");
		}
	}

	@Override
	public void setSelection(ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection strSelection = (IStructuredSelection) selection;

			// We first unsubscribe from the current gps.
			if (getGPS() != null) {
				getGpsTimer().reset();
				input.eAdapters().remove(getGPSListener());
			}

			// We subscribe to the new gps.
			if (strSelection.getFirstElement() instanceof GPS) {
				this.selection = selection;
				// We start the timer.
				getGpsTimer().start();
				input = (GPS) strSelection.getFirstElement();
				input.eAdapters().add(getGPSListener());
			}
		}
	}

	private Adapter getGPSListener() {
		if (gpsListener == null) {
			gpsListener = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {

					int featureId = msg.getFeatureID(GPS.class);

					// A new gps reading is available.
					if (featureId == ApogyAddonsSensorsGPSPackage.GPS__READING
							&& msg.getEventType() == Notification.SET
							&& msg.getNewValue() != null) {
						getGpsTimer().stop();

						// We compute the refresh rate.
						double refreshRate = (1000.0 / (double) getGpsTimer()
								.average());
						getGpsTimer().start();

						GPSReading reading = (GPSReading) msg.getNewValue();

						updateGUIThreadSafe(reading, refreshRate);
					} else if (featureId == ApogyAddonsSensorsGPSPackage.GPS__STATUS) {
						updateGUIThreadSafe(null, 0);
					}

				}
			};
		}
		return gpsListener;
	}

	private GPS getGPS() {
		return input;
	}

	private void updateGUI(final GPSReading reading, final double refreshRate) {

		if (reading != null) {

			tLatitude.setText(reading.getLatitude() + "");
			tLongitude.setText(reading.getLongitude() + "");
			tElevation.setText(reading.getElevation() + "m");
			tHDP.setText(reading.getHorizontalDilutionPos() + "");
			tNOS.setText(reading.getNumberOfSatellites() + "");
			tQuality.setText(reading.getQuality().toString());
			tMSL.setText(reading.getMeanSeaLevel() + "m");
			if (reading.getTimeStamp() != null) {
				tTimeStamp.setText(reading.getTimeStamp().toString());
			}
			String updateText = NumberFormat.getInstance().format(refreshRate);
			tUpdateRate.setText(updateText + "Hz");
		}
		if (getGPS() != null) {
			tStatus.setText(getGPS().getStatus().getName());
		}
	}

	private void updateGUIThreadSafe(final GPSReading reading,
			final double refreshRate) {
		Runnable run = new Runnable() {

			@Override
			public void run() {

				updateGUI(reading, refreshRate);
			}
		};

		Display.getDefault().asyncExec(run);
	}

	private Timer getGpsTimer() {
		if (gpsTimer == null) {
			gpsTimer = new Timer();
		}
		return gpsTimer;
	}

	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		setSelection(selection);
	}

}
