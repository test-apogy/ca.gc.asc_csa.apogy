/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.rover.symphony.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.core.impl.SymphonySystemApiAdapterImpl;
import org.eclipse.symphony.core.invocator.AbstractInitializationData;
import org.eclipse.symphony.examples.rover.Rover;
import org.eclipse.symphony.examples.rover.symphony.RoverData;
import org.eclipse.symphony.examples.rover.symphony.RoverSymphonySystemApiAdapter;
import org.eclipse.symphony.examples.rover.symphony.Symphony__ExamplesRoverSymphonyFactory;
import org.eclipse.symphony.examples.rover.symphony.Symphony__ExamplesRoverSymphonyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rover Symphony System Api Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RoverSymphonySystemApiAdapterImpl extends SymphonySystemApiAdapterImpl implements RoverSymphonySystemApiAdapter
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoverSymphonySystemApiAdapterImpl()
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
		return Symphony__ExamplesRoverSymphonyPackage.Literals.ROVER_SYMPHONY_SYSTEM_API_ADAPTER;
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
	 * destroyed) by Symphony
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
		return Symphony__ExamplesRoverSymphonyFactory.eINSTANCE.createRoverData();
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
				// be caught and logged by Symphony
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
			// called by Symphony
			
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

} //RoverSymphonySystemApiAdapterImpl
