package ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.composites;
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

import java.text.DecimalFormat;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import ca.gc.asc_csa.apogy.common.databinding.converters.DoubleToStringConverter;
import ca.gc.asc_csa.apogy.common.databinding.converters.StringToDoubleConverter;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.core.Positioned;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.databindings.DegreeStringToRadiansConverter;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.databindings.RadiansToDegreesStringConverter;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;

public class CoordinateConversionComposite extends Composite
{
	private static final String GEO_COORD_SECT_TITLE = "Geographic Coordinates";
	private static final String XYZ_COORD_SECT_TITLE = "Positional Coordinates";
	private static final String DEGREE_SYM = "\u00b0";
	private static final DecimalFormat ANGLE_DEC_FORMAT = new DecimalFormat("0.0000000");
	private static final DecimalFormat POS_DEC_FORMAT = new DecimalFormat("0.000");
	
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private EObject boundObj;
	private DataBindingContext dbContext;
	private EditingDomain editingDomain;
	private DoubleValueVerifyAndUpdateListener lstnAllTexts;
	private Text txtLat;
	private Text txtLong;
	private Text txtElev;
	private Text txtX;
	private Text txtY;
	private Text txtZ;
	
	public CoordinateConversionComposite(Composite parent,
									     int style)
	{
		// Call the superclass' constructor
		super(parent, style);
				
		// Create the content for the parentComposite
		createContent();
	}
	
	private void createContent()
	{
		// Setup the parentComposite's layout
		this.setLayout(new GridLayout());
		
		// Add the dispose listener
		this.addDisposeListener(new DisposeListener()
		{
			@Override
			public void widgetDisposed(DisposeEvent e)
			{
				// Dispose of the binding context
				disposeOfBindingContext();
			}
		});
		
		lstnAllTexts = new DoubleValueVerifyAndUpdateListener();
		
		// Create the geographic coordinates
		Section sctnGeoCoords = formToolkit.createSection(this, Section.TITLE_BAR);
		sctnGeoCoords.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolkit.paintBordersFor(sctnGeoCoords);
		sctnGeoCoords.setText(GEO_COORD_SECT_TITLE);
		
		// Create a parentComposite to handle the contents of the parentComposite
		Composite compGeoCoords = formToolkit.createComposite(sctnGeoCoords, SWT.NONE);
		formToolkit.paintBordersFor(compGeoCoords);
		compGeoCoords.setLayout(new GridLayout(3, true));
		sctnGeoCoords.setClient(compGeoCoords);
		
		// Create the labels for the geo-coordinates
		Label lblLat = formToolkit.createLabel(compGeoCoords, "Latitude (" + DEGREE_SYM + ")", SWT.CENTER);
		lblLat.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		Label lblLong = formToolkit.createLabel(compGeoCoords, "Longitude (" + DEGREE_SYM + ")", SWT.CENTER);
		lblLong.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		Label lblElev = formToolkit.createLabel(compGeoCoords, "Elevation (m)", SWT.CENTER);
		lblElev.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		// Create the texts for the geo-coordinates
		txtLat = formToolkit.createText(compGeoCoords, "0.0", SWT.CENTER);
		txtLat.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		txtLat.addVerifyListener(lstnAllTexts);
		
		txtLong = formToolkit.createText(compGeoCoords, "0.0", SWT.CENTER);
		txtLong.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		txtLong.addVerifyListener(lstnAllTexts);
		
		txtElev = formToolkit.createText(compGeoCoords, "0.0", SWT.CENTER);
		txtElev.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		txtElev.addVerifyListener(lstnAllTexts);
		
		// Create the XYZ coordinates
		Section sctnXYZCoords = formToolkit.createSection(this, Section.TITLE_BAR);
		sctnXYZCoords.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolkit.paintBordersFor(sctnXYZCoords);
		sctnXYZCoords.setText(XYZ_COORD_SECT_TITLE);
		
		// Create a parentComposite to handle the contents of the parentComposite
		Composite compXYZCoords = formToolkit.createComposite(sctnXYZCoords, SWT.NONE);
		formToolkit.paintBordersFor(compXYZCoords);
		compXYZCoords.setLayout(new GridLayout(3, true));
		sctnXYZCoords.setClient(compXYZCoords);
		
		// Create the labels for the XYZ-coordinates
		Label lblX = formToolkit.createLabel(compXYZCoords, "X (m)", SWT.CENTER);
		lblX.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		Label lblY = formToolkit.createLabel(compXYZCoords, "Y (m)", SWT.CENTER);
		lblY.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		Label lblZ = formToolkit.createLabel(compXYZCoords, "Z (m)", SWT.CENTER);
		lblZ.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		// Create the texts for the XYZ-coordinates
		txtX = formToolkit.createText(compXYZCoords, "0.0", SWT.CENTER);
		txtX.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		txtX.addVerifyListener(lstnAllTexts);
		
		txtY = formToolkit.createText(compXYZCoords, "0.0", SWT.CENTER);
		txtY.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		txtY.addVerifyListener(lstnAllTexts);
		
		txtZ = formToolkit.createText(compXYZCoords, "0.0", SWT.CENTER);
		txtZ.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		txtZ.addVerifyListener(lstnAllTexts);
	}
	
	private DataBindingContext createBinding(Object obj, EditingDomain objDomain)
	{
		// The new binding context
		DataBindingContext newContext = null; 
		
		// If the object is of type GeographicCoordinates
		if (obj instanceof GeographicCoordinates)
		{
			// Cast down
			GeographicCoordinates coordinates = (GeographicCoordinates) obj;
					
			// Create a new binding context
			newContext = new DataBindingContext();
					
			// Create a binding between the latitude coordinate and
			// its respective Text
			IObservableValue txtLatObsVal = WidgetProperties.text(SWT.Modify).observe(txtLat); 
			
			IObservableValue modelLatObsVal = (objDomain == null ?
											   EMFProperties.value(ApogyCoreEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__LATITUDE).observe(coordinates) :
											   EMFEditProperties.value(objDomain, ApogyCoreEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__LATITUDE).observe(coordinates));
			
			UpdateValueStrategy txtToModelLatUpdateStrategy = new UpdateValueStrategy();
			txtToModelLatUpdateStrategy.setConverter(new DegreeStringToRadiansConverter());
					
			UpdateValueStrategy modelToTxtLatUpdateStrategy = new UpdateValueStrategy();
			modelToTxtLatUpdateStrategy.setConverter(new RadiansToDegreesStringConverter(ANGLE_DEC_FORMAT));
					
			newContext.bindValue(txtLatObsVal,
								 modelLatObsVal,
								 txtToModelLatUpdateStrategy,
								 modelToTxtLatUpdateStrategy);
					
			// Create a binding between the longitude coordinate and
			// its respective Text
			IObservableValue txtLongObsVal = WidgetProperties.text(SWT.Modify).observe(txtLong);
			
			IObservableValue modelLongObsVal = (objDomain == null ?
											    EMFProperties.value(ApogyCoreEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__LONGITUDE).observe(coordinates) :
											    EMFEditProperties.value(objDomain, ApogyCoreEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__LONGITUDE).observe(coordinates));
			
			UpdateValueStrategy txtToModelLongUpdateStrategy = new UpdateValueStrategy();
			txtToModelLongUpdateStrategy.setConverter(new DegreeStringToRadiansConverter());
					
			UpdateValueStrategy modelToTxtLongUpdateStrategy = new UpdateValueStrategy();
			modelToTxtLongUpdateStrategy.setConverter(new RadiansToDegreesStringConverter(ANGLE_DEC_FORMAT));
					
			newContext.bindValue(txtLongObsVal,
								 modelLongObsVal,
								 txtToModelLongUpdateStrategy,
								 modelToTxtLongUpdateStrategy);
			
			// Create a binding between the elevation and
			// its respective Text
			IObservableValue txtElevObsVal = WidgetProperties.text(SWT.Modify).observe(txtElev); 
			
			IObservableValue modelElevObsVal = (objDomain == null ?
												EMFProperties.value(ApogyCoreEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__ELEVATION).observe(coordinates) :
												EMFEditProperties.value(objDomain, ApogyCoreEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__ELEVATION).observe(coordinates));
			
			UpdateValueStrategy txtToModelElevUpdateStrategy = new UpdateValueStrategy();
			txtToModelElevUpdateStrategy.setConverter(new StringToDoubleConverter());
					
			UpdateValueStrategy modelToTxtElevUpdateStrategy = new UpdateValueStrategy();
			modelToTxtElevUpdateStrategy.setConverter(new DoubleToStringConverter(POS_DEC_FORMAT));
					
			newContext.bindValue(txtElevObsVal,
								 modelElevObsVal,
								 txtToModelElevUpdateStrategy,
								 modelToTxtElevUpdateStrategy);
		}
		// Else if the object is of type Positioned
		else if (obj instanceof Positioned)
		{
			// Cast down
			Positioned position = (Positioned) obj;

			// If there is a pose in the position object
			if (position.getPose() != null)
			{	
				// Create a new binding context
				newContext = new DataBindingContext();
				
				// Create a binding between the position object's X position and
				// its respective Text
				IObservableValue txtXObsVal = WidgetProperties.text(SWT.Modify).observe(txtX);
				
				IObservableValue modelXObsVal = (objDomain == null ?
												 EMFProperties.value(ApogyCommonMathPackage.Literals.MATRIX4X4__M03).observe(position.getPose()) :
												 EMFEditProperties.value(objDomain, ApogyCommonMathPackage.Literals.MATRIX4X4__M03).observe(position.getPose()));
				
				UpdateValueStrategy txtToModelXUpdateStrategy = new UpdateValueStrategy();
				txtToModelXUpdateStrategy.setConverter(new StringToDoubleConverter());
				
				UpdateValueStrategy modelToTxtXUpdateStrategy = new UpdateValueStrategy();
				modelToTxtXUpdateStrategy.setConverter(new DoubleToStringConverter(POS_DEC_FORMAT));
		
				newContext.bindValue(txtXObsVal,
									 modelXObsVal,
									 txtToModelXUpdateStrategy,
									 modelToTxtXUpdateStrategy);
				
				// Create a binding between the position object's Y position and
				// its respective Text
				IObservableValue txtYObsVal = WidgetProperties.text(SWT.Modify).observe(txtY);
				
				IObservableValue modelYObsVal = (objDomain == null ?
												 EMFProperties.value(ApogyCommonMathPackage.Literals.MATRIX4X4__M13).observe(position.getPose()) :
												 EMFEditProperties.value(objDomain, ApogyCommonMathPackage.Literals.MATRIX4X4__M13).observe(position.getPose()));
				
				UpdateValueStrategy txtToModelYUpdateStrategy = new UpdateValueStrategy();
				txtToModelYUpdateStrategy.setConverter(new StringToDoubleConverter());
				
				UpdateValueStrategy modelToTxtYUpdateStrategy = new UpdateValueStrategy();
				modelToTxtYUpdateStrategy.setConverter(new DoubleToStringConverter(POS_DEC_FORMAT));
				
				newContext.bindValue(txtYObsVal,
									 modelYObsVal,
									 txtToModelYUpdateStrategy,
									 modelToTxtYUpdateStrategy);
				
				// Create a binding between the position object's Z position and
				// its respective Text
				IObservableValue txtZObsVal = WidgetProperties.text(SWT.Modify).observe(txtZ); 
				
				IObservableValue modelZObsVal = (objDomain == null ?
												 EMFProperties.value(ApogyCommonMathPackage.Literals.MATRIX4X4__M23).observe(position.getPose()) :
											     EMFEditProperties.value(objDomain, ApogyCommonMathPackage.Literals.MATRIX4X4__M23).observe(position.getPose()));
				
				UpdateValueStrategy txtToModelZUpdateStrategy = new UpdateValueStrategy();
				txtToModelZUpdateStrategy.setConverter(new StringToDoubleConverter());
				
				UpdateValueStrategy modelToTxtZUpdateStrategy = new UpdateValueStrategy();
				modelToTxtZUpdateStrategy.setConverter(new DoubleToStringConverter(POS_DEC_FORMAT));
				
				newContext.bindValue(txtZObsVal,
									 modelZObsVal,
									 txtToModelZUpdateStrategy,
									 modelToTxtZUpdateStrategy);
			}
		}
		
		// Return the new binding context
		return newContext;
	}
	
	private void disposeOfBindingContext()
	{
		// If there is a context to dispose
		if (dbContext != null)
		{
			// Dispose of it and null out the reference
			dbContext.dispose();
			dbContext = null;
			
			// Remove the reference to the bound object
			boundObj = null;
			
			// Remove the reference to the editing domain
			editingDomain = null;
		}
	}
	
	public void setBoundObject(Object obj)
	{
		// If this is the same as the currently bound object
		if (boundObj == obj)
		{
			// Nothing to do; just return
			return;
		}
		
		// Dispose of the current binding context
		disposeOfBindingContext();
		
		// Update the listener's worksite
		lstnAllTexts.updateESW((EObject)obj);
		
		// If the given object is one of the two correct types
		if (obj instanceof GeographicCoordinates ||
			obj instanceof Positioned)
		{
			// Update the references accordingly
			boundObj = (EObject) obj;
			editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(obj);
			
			// Create a new binding context
			dbContext = createBinding(obj, editingDomain);
		}
	}
	
	@Override
	protected void checkSubclass()
	{
		// Permit this control to be subclassed
	}
	
	private class DoubleValueVerifyAndUpdateListener implements VerifyListener
	{
		private EarthSurfaceWorksite earthSurfaceWorksite;
		
		private boolean updating;
		
		public DoubleValueVerifyAndUpdateListener()
		{
			// Indicate that initially the listener is not updating
			updating = false;
			
			// Initially, there is no selected object
			updateESW(null);
		}
		
		public void updateESW(EObject selected)
		{
			// Keep track of the earth surface worksite
			EarthSurfaceWorksite esw = null;
			
			// If there was an object selected
			if (selected != null)
			{
				// Keep track of the object's container
				EObject container = selected.eContainer();
				
				// While one hasn't been found and there's
				// still a container level to look through
				while (esw == null && container != null)
				{
					// If this container is a earth surface worksite
					if(container instanceof EarthSurfaceWorksite)
					{
						// Just use this worksite
						esw = (EarthSurfaceWorksite) container;
					}
					// Else if this container is an invocator session
					else if(container instanceof InvocatorSession)
					{
						// Cast down
						InvocatorSession session = (InvocatorSession) container;
						
						// If there is an environment associated with this session
						if(session.getEnvironment() instanceof ApogyEnvironment)
						{
							// Extract the environment
							ApogyEnvironment se = (ApogyEnvironment) session.getEnvironment();
							
							// If there is an earth surface worksite, which is
							// the active worksite for this environment   
							if(se.getActiveWorksite() instanceof EarthSurfaceWorksite)
							{
								// Just use that worksite
								esw = (EarthSurfaceWorksite) se.getActiveWorksite();
							}
						}
					}
					// Otherwise
					else
					{
						// Move on to the next higher-level container (if one exists) 
						container = container.eContainer();
					}
				}
			}
			
//			// If no earth surface worksite could be extracted (i.e.
//			// doesn't exist, no object selected, etc.)
//			if (esw == null)
//			{
//				// Just create one (to facilitate the conversions)
//				esw = ApogyCoreEnvironmentFactory.eINSTANCE.createEarthSurfaceWorksite();				
//			}

			// Update the listener's earth surface worksite accordingly
			earthSurfaceWorksite = esw;
		}
		
		@Override
		public void verifyText(VerifyEvent e)
		{
			// Cast the widget down
			Text text = (Text) e.widget;
			
			// Get the new text string
			String oldStr = text.getText();
			String newStr = oldStr.substring(0, e.start) + e.text + oldStr.substring(e.end);
			
			try
			{
				// If the new string to parse is not empty
				if (newStr.equals("") == false)
				{
					// See if you can convert it to a double
					Double.parseDouble(newStr);
				}
				
				// At this point, it must have been successfully validated
				
				// If no update is already in progress (to prevent endless
				// update loops)
				if (updating == false)
				{
					// Indicate that the update has started
					updating = true;
				
					// If this text corresponds to one of the position texts
					if (text == txtX ||
						text == txtY ||
						text == txtZ)
					{
						String xStrVal = "";
						String yStrVal = "";
						String zStrVal = "";
						
						// If this Text refers to the X Text widget
						if (text == txtX)
						{
							// Set the values accordingly
							xStrVal = newStr;
							yStrVal = txtY.getText();
							zStrVal = txtZ.getText();
						}
						// Else if this Text refers to the Y Text widget
						else if (text == txtY)
						{
							// Set the values accordingly
							xStrVal = txtX.getText();
							yStrVal = newStr;
							zStrVal = txtZ.getText();
						}
						// Else this Text refers to the Z Text widget
						else
						{
							// Set the values accordingly
							xStrVal = txtX.getText();
							yStrVal = txtY.getText();
							zStrVal = newStr;
						}
						
						// If all of the string values are non-empty
						if (xStrVal.equals("") == false &&
							yStrVal.equals("") == false &&
							zStrVal.equals("") == false)
						{
							// Extract the values from the strings
							double xVal = Double.parseDouble(xStrVal);
							double yVal = Double.parseDouble(yStrVal);
							double zVal = Double.parseDouble(zStrVal);
						
							// Create a Tuple3d in order to facilitate conversion
							Tuple3d tuple = ApogyCommonMathFacade.INSTANCE.createTuple3d(xVal, yVal, zVal);
						
							// Perform the actual conversion from the XYZ to Geographic Coordinates
							GeographicCoordinates coords = earthSurfaceWorksite.convertToGeographicCoordinates(tuple);
						
							// Convert the angles from radians to degrees
							double latVal = Math.toDegrees(coords.getLatitude());
							double longVal = Math.toDegrees(coords.getLongitude());
							double elevVal = coords.getElevation();
						
							// Update the appropriate Text fields
							txtLat.setText(ANGLE_DEC_FORMAT.format(latVal));
							txtLong.setText(ANGLE_DEC_FORMAT.format(longVal));
							txtElev.setText(POS_DEC_FORMAT.format(elevVal));
						}
					}
					// Otherwise, if this text refers to the geographic coordinate texts
					else if (text == txtLat  ||
							 text == txtLong ||
							 text == txtElev)
					{
						// Used to keep track of the other 
						String latStrVal = "";
						String longStrVal = "";
						String elevStrVal = "";
						
						// If this Text refers to the Latitude Text widget
						if (text == txtLat)
						{
							// Set the values accordingly
							latStrVal = newStr;
							longStrVal = txtLong.getText();
							elevStrVal = txtElev.getText();
						}
						// Else if this Text refers to the Longitude Text
						else if (text == txtLong)
						{
							// Set the values accordingly
							latStrVal = txtLat.getText();
							longStrVal = newStr;
							elevStrVal = txtElev.getText();
						}
						// Else this Text refers to the Elevation Text
						else
						{
							// Set the values accordingly
							latStrVal = txtLat.getText();
							longStrVal = txtLong.getText();
							elevStrVal = newStr;
						}
						
						// If all of the value strings are non-empty
						if (latStrVal.equals("") == false &&
							longStrVal.equals("") == false &&
							elevStrVal.equals("") == false)
						{
							// Extract the values from the strings
							double latVal = Double.parseDouble(latStrVal);
							double longVal = Double.parseDouble(longStrVal);
							double elevVal = Double.parseDouble(elevStrVal);
							
							// Convert the angles from degrees to radians
							latVal = Math.toRadians(latVal);
							longVal = Math.toRadians(longVal);
						
							// Create a geographic coordinate with those given values
							GeographicCoordinates coords = ApogyEarthEnvironmentFactory.eINSTANCE.createGeographicCoordinates();
							coords.setLatitude(latVal);
							coords.setLongitude(longVal);
							coords.setElevation(elevVal);
						
							// Perform the actual conversion from the Geographic to XYZ Coordinates
							Tuple3d tuple = earthSurfaceWorksite.convertToXYZPosition(coords);
						
							// Update the appropriate Text fields
							txtX.setText(POS_DEC_FORMAT.format(tuple.getX()));
							txtY.setText(POS_DEC_FORMAT.format(tuple.getY()));
							txtZ.setText(POS_DEC_FORMAT.format(tuple.getZ()));
						}
					}
					
					// Indicate that the update has finished
					updating = false;
				}
			}
			catch(NumberFormatException ex)
			{
				// Roll back
				e.text = "";
				e.doit = false;
			}
		}
	}
}
