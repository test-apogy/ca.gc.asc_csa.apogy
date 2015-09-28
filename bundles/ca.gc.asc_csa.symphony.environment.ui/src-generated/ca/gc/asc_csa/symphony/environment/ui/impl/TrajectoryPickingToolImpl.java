/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.jfree.data.xy.XYDataItem;

import ca.gc.asc_csa.symphony.environment.ui.EnvironmentUiFacade;
import ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage;
import ca.gc.asc_csa.symphony.environment.ui.TrajectoryPickingTool;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trajectory Picking Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
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
		return SymphonyEnvironmentUIPackage.Literals.TRAJECTORY_PICKING_TOOL;
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
	  double length = EnvironmentUiFacade.INSTANCE.getTrajectoryLength(getXYSeries());
	  setTrajectoryLength(length);	  	  
  }
} //TrajectoryPickingToolImpl
