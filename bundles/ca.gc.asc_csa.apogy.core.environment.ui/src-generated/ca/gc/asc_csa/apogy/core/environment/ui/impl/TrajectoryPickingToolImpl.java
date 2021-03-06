package ca.gc.asc_csa.apogy.core.environment.ui.impl;
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
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIFacade;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.environment.ui.TrajectoryPickingTool;
import org.jfree.data.xy.XYDataItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trajectory Picking Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TrajectoryPickingToolImpl extends AbstractTrajectoryToolImpl implements TrajectoryPickingTool
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TrajectoryPickingToolImpl()
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
		return ApogyCoreEnvironmentUIPackage.Literals.TRAJECTORY_PICKING_TOOL;
	} 
   
  @Override
  public void positionSelected(int mouseButton, double x, double y) 
  {
	  if(isActive())
	  {
		  switch(mouseButton)
		  {
			  	case java.awt.event.MouseEvent.BUTTON1:
				{			  
					// Adds the newly selected point to the list.
					XYDataItem xyDataItem = new XYDataItem(x,y);
					getXYSeries().add(xyDataItem);
					
					// Updates latest position
					setLatestPosition(xyDataItem);
				}
				break;
				case java.awt.event.MouseEvent.BUTTON2:
				case java.awt.event.MouseEvent.BUTTON3:
				{			    		
					// Removes the last point of the list, if applicable.
					if(getXYSeries().getItemCount() > 0)
					{												
						int lastIndex = getXYSeries().getItemCount() - 1;						
						XYDataItem lastXYDataItem = getXYSeries().getDataItem(lastIndex);
											
						// Removes last position from the list.
						getXYSeries().remove(lastIndex);
						
						// Updates latest position
						setLatestPosition(lastXYDataItem);																
					}
				}
				break;
		  }		 
		  
		  updateTrajectoryPickingTool();
	  }
  }
  
  protected void updateTrajectoryPickingTool()
  {
	  // Update the trajectory length.
	  double length = ApogyCoreEnvironmentUIFacade.INSTANCE.getTrajectoryLength(getXYSeries());
	  setTrajectoryLength(length);	  	  
  }
} //TrajectoryPickingToolImpl
