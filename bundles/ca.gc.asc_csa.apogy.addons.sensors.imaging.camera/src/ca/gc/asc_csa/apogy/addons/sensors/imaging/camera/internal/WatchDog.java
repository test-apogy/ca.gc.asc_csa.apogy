package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.internal;
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

public class WatchDog 
{	
	private Thread updateThread = null;
	private boolean disposed = false;
	private long until = 0;
	private long timeOut = 100;	
	private boolean timeOutOccured = false;
	
	/**
	 * Constructor.
	 * @param timeOut The timeout, in milliseconds.
	 */
	public WatchDog(long timeOut)
	{
		this.timeOut = timeOut;
		getUpdateThread().start();
	}
	
	/**
	 * Kicks the watch dog.
	 */
	public void kick()
	{
		until = System.currentTimeMillis() + timeOut;
		timeOutOccured = false;
	}
	
	/**
	 * Set the timeout duration.
	 * @param newTimeout The new timeout, in milliseconds.
	 */
	public void setTimeout(long newTimeout)
	{
		if(newTimeout > 0)
		{
			this.timeOut = newTimeout;
			
			kick();
		}
	}
	
	/**
	 * Dispose of the watch dog.
	 */
	public void dispose()
	{
		disposed = true;		
	}

	/**
	 * Method called when a time out occurs. Users should override.
	 */
	public void timeoutOccured()
	{		
	}	
		
	private Thread getUpdateThread()
	{
		if(updateThread == null)
		{
			updateThread = new Thread(new Runnable() 
			{			
				@Override
				public void run() 
				{					
					while(!disposed)
					{
						long now = System.currentTimeMillis();												
						
						// If a timeout has not occurred yet.
						if(!timeOutOccured)
						{
							if(now > until)
							{
								timeOutOccured = true;
								timeoutOccured();
							}
							else
							{
								
							}
						}
						
						try 
						{
							if((until - now) > 0)
							{
								Thread.sleep(until - now);
							}
							else
							{
								Thread.sleep(100);
							}
						} 
						catch (InterruptedException e) 
						{													
						} 
					}
				}
			});
		}
		
		return updateThread;
	}
}
