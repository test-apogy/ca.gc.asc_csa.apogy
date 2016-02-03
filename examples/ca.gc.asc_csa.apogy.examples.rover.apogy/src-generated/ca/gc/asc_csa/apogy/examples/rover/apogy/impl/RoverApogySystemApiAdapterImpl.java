package ca.gc.asc_csa.apogy.examples.rover.apogy.impl;
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

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.core.impl.ApogySystemApiAdapterImpl;
import ca.gc.asc_csa.apogy.core.invocator.AbstractInitializationData;
import ca.gc.asc_csa.apogy.examples.rover.Rover;
import ca.gc.asc_csa.apogy.examples.rover.apogy.RoverData;
import ca.gc.asc_csa.apogy.examples.rover.apogy.RoverApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.examples.rover.apogy.ApogyExamplesRoverApogyFactory;
import ca.gc.asc_csa.apogy.examples.rover.apogy.ApogyExamplesRoverApogyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rover Apogy System Api Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RoverApogySystemApiAdapterImpl extends ApogySystemApiAdapterImpl implements RoverApogySystemApiAdapter
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoverApogySystemApiAdapterImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ApogyExamplesRoverApogyPackage.Literals.ROVER_APOGY_SYSTEM_API_ADAPTER;
	}
	
	/**
	 * This private helper method is used to extract
	 * the rover instance from this API adapter
	 * 
	 * @return The Rover instance associated with this API adapter
	 * @generated_NOT
	 */
	protected Rover getRover()
	{
		// Just cast the instance and return it
		return (Rover) this.getInstance();
	}
	
	/**
	 * This is the callback method that is called by the API adapter
	 * when the rover instance is being disposed (i.e. shutdown /
	 * destroyed) by Apogy
	 */
	@Override
	public void dispose()
	{
		// If there is a rover instance being handled by the API adapter
		if (this.getRover() != null)
		{
			// Dispose of the rover
			this.getRover().dispose();
		}
		
		// Call the superclass's version of this method
		super.dispose();
	}
	
	/**
	 * This is a factory method that can be used to generate
	 * initialization data instances of an appropriate type
	 * for this adapter.
	 * 
	 * @return The newly created initialization data object
	 */
	@Override
	public AbstractInitializationData createInitializationData()
	{
		// Call the appropriate factory method for this package to get
		// a RoverData instance and then return it.
		return ApogyExamplesRoverApogyFactory.eINSTANCE.createRoverData();
	}
	
	/**
	 * This is a method which is used to apply the given
	 * initialization data object to the API adapter's instance;
	 * this is particularly useful in conjunction with collect()
	 * as it can be used to save state and then load it back later.
	 * 
	 * @param initializationData The initialization data that is to be applied to the adapter's instance.
	 * @see #collect(AbstractInitializationData)
	 */
	@Override
	public void apply(AbstractInitializationData initializationData)
	{
		// Call the superclass's version of this method
		super.apply(initializationData);
		
		// If the given initialization object matches the desired type
		if (initializationData instanceof RoverData)
		{
			// Cast down appropriately
			RoverData roverData = (RoverData) initializationData;
			
			// If the rover is not supposed to be initialized but
			// the rover is already initialized OR the rover is not
			// supposed to be disposed but the the rover is already
			// disposed.
			if (((roverData.isInitialized() == false) &&
				 (this.getRover().isInitialized() == true)) ||
				((roverData.isDisposed() == false) &&
				 (this.getRover().isDisposed() == true)))
			{
				// Generate the error message
				String message = "The given initialization data cannot be applied " +
								 "to this rover; the given init data says that the " +
								 "rover should not be initialized or disposed, when " +
								 "it already is in that state.";
				
				// Throw an exception to indicate that the apply() has failed; this will
				// be caught and logged by Apogy
				throw new RuntimeException(message);
			}
			
			// If the rover is supposed to be initialized
			if (roverData.isInitialized() == true)
			{
				// If the rover isn't currently initialized
				if (this.getRover().isInitialized() == false)
				{
					// Just initialize it
					this.getRover().init();
				}
			}
			
			// The apply() for each of the subcomponents (e.g. mobile
			// platform, robotic arm, etc.) in the assembly will be
			// called by Apogy
			
			// If the rover is supposed to be disposed
			if (roverData.isDisposed() == true)
			{
				// If the rover isn't currently initialized
				if (this.getRover().isDisposed() == false)
				{
					// Just dispose of it
					this.getRover().dispose();
				}
			}
		}
	}
	
	/**
	 * This is a method which is used to collect and fill the given
	 * initialization data object with relevant data from the API
	 * adapter's instance; this is particularly useful in conjunction
	 * with apply() as it can be used to save data, which can then be
	 * loaded back later.
	 * 
	 * @param initializationData The initialization data that is to store the state of the adapter's instance.
	 * @see #apply(AbstractInitializationData)
	 */
	@Override
	public void collect(AbstractInitializationData initializationData)
	{
		// Call the superclass's version of this method
		super.collect(initializationData);
		
		// If this initialization data object is relevant for this adapter
		if (initializationData instanceof RoverData)
		{
			// Cast down appropriately
			RoverData roverData = (RoverData) initializationData;
			
			// Store the relevant data in the initialization data object
			roverData.setInitialized(this.getRover().isInitialized());
			roverData.setDisposed(this.getRover().isDisposed());
		}
	}

} //RoverApogySystemApiAdapterImpl
