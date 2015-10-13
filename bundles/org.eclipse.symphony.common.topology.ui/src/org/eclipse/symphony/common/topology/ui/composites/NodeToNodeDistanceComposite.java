package org.eclipse.symphony.common.topology.ui.composites;

import java.text.DecimalFormat;

import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.symphony.common.math.GeometricUtils;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.math.ui.composites.Tuple3dComposite;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.TopologyFacade;
import org.eclipse.ui.progress.UIJob;

public class NodeToNodeDistanceComposite extends Composite 
{
	public static final long AUTO_UPDATE_PERIOD_MILLISECONDS = 1000;
	
	private DecimalFormat distanceFormat = new DecimalFormat("0.000");
	private UIJob updateJob = null;
	
	protected int selectionCount = 0;
	protected Node fromNode = null;
	protected Node toNode = null;
	
	protected double euclidianDistanceBetweenNodes = 0;
	protected double geodesicDistanceBetweenNodes = 0;

	protected Tuple3d positionTuple3d; 
	protected Tuple3d orientationTuple3d;
	
	protected boolean autoUpdateEnabled = false;
	protected boolean lockFrom = false;
	protected boolean lockTo = false;
	
	// Composites attributes.
	protected Button lockFromButton = null;
	protected Button lockToButton = null;	
	protected Button updateButton = null;
	protected Button swapNodesButton = null;
	
	protected Label fromNodeValueLabel = null;
	protected Label toNodeValueLabel = null;
	
	protected Label euclidianDistanceValueLabel = null;
	protected Label geodesicDistanceValueLabel = null;
	
	protected Tuple3dComposite positionTupleComposite = null;
	protected Tuple3dComposite orientationTupleComposite = null;
	
	public NodeToNodeDistanceComposite(Composite parent, int style) 
	{	
		super(parent, style);
		
		GridLayout layout = new GridLayout(1, false);
		this.setLayout(layout);
		
		
		Group nodesGroup = new Group(this, SWT.NONE);
		nodesGroup.setText("Nodes");
		GridLayout nodesGroupLayout = new GridLayout(4, false);				
		nodesGroup.setLayout(nodesGroupLayout);
		GridData nodesGroupGridData = new GridData();
		nodesGroupGridData.horizontalAlignment = SWT.FILL;
		nodesGroup.setLayoutData(nodesGroupGridData);
		
		Label fromNodeLabel = new Label(nodesGroup, SWT.NONE);
		fromNodeLabel.setText("From Node:");
		
		GridData gridDataFrom = new GridData();
		gridDataFrom.horizontalAlignment = SWT.FILL;
		gridDataFrom.grabExcessHorizontalSpace= true;
		gridDataFrom.minimumWidth = 200;
		fromNodeValueLabel = new Label(nodesGroup, SWT.NONE);
		fromNodeValueLabel.setText("N/A");
		fromNodeValueLabel.setLayoutData(gridDataFrom);
		
		lockFromButton = new Button(nodesGroup, SWT.TOGGLE);
		lockFromButton.setText("Lock");
		lockFromButton.addSelectionListener(new SelectionListener() 
		{		
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				lockFrom = lockFromButton.getSelection();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) 
			{						
			}
		});
		
		swapNodesButton = new Button(nodesGroup, SWT.PUSH);
		swapNodesButton.setText("Swap Nodes");
		
		GridData gridSwapNodesButton = new GridData();
		gridSwapNodesButton.verticalSpan = 2;
		gridSwapNodesButton.verticalAlignment = SWT.FILL;
		swapNodesButton.setLayoutData(gridSwapNodesButton);
		swapNodesButton.addSelectionListener(new SelectionListener() 
		{		
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				swapNodes();
				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) 
			{						
			}
		});
		
		Label toNodeLabel = new Label(nodesGroup, SWT.NONE);
		toNodeLabel.setText("To Node:");
		
		GridData gridDataTo = new GridData();
		gridDataTo.horizontalAlignment = SWT.FILL;
		gridDataTo.grabExcessHorizontalSpace= true;
		gridDataTo.minimumWidth = 200;
		
		toNodeValueLabel = new Label(nodesGroup, SWT.NONE);
		toNodeValueLabel.setText("N/A");
		toNodeValueLabel.setLayoutData(gridDataFrom);
		
		lockToButton = new Button(nodesGroup, SWT.TOGGLE);
		lockToButton.setText("Lock");
		lockToButton.addSelectionListener(new SelectionListener() 
		{		
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				lockTo = lockToButton.getSelection();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) 
			{						
			}
		});
		
		Group distancesGroup = new Group(this, SWT.NONE);
		distancesGroup.setText("Distances");
		GridLayout distancesGroupLayout = new GridLayout(3, false);				
		distancesGroup.setLayout(distancesGroupLayout);
		GridData distancesGroupGridData = new GridData();
		distancesGroupGridData.horizontalAlignment = SWT.FILL;
		distancesGroup.setLayoutData(distancesGroupGridData);
		
		Label euclidianDistanceLabel = new Label(distancesGroup, SWT.NONE);
		euclidianDistanceLabel.setText("Euclidian Distance :");

		GridData gridDataEuclidian = new GridData();
		gridDataEuclidian.horizontalAlignment = SWT.LEFT;
		gridDataEuclidian.grabExcessHorizontalSpace= true;
		gridDataEuclidian.minimumWidth = 100;
		gridDataEuclidian.widthHint = 100;
		
		euclidianDistanceValueLabel = new Label(distancesGroup, SWT.BORDER);
		euclidianDistanceValueLabel.setText("N/A");
		euclidianDistanceValueLabel.setLayoutData(gridDataEuclidian);
					
		updateButton = new Button(distancesGroup, SWT.TOGGLE);
		updateButton.setText("Auto Update");
		GridData gridDataUpdateButton = new GridData();
		gridDataUpdateButton.verticalSpan = 2;
		gridDataUpdateButton.verticalAlignment = SWT.FILL;
		updateButton.setLayoutData(gridDataUpdateButton);
		updateButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) 
			{				
				autoUpdateEnabled = updateButton.getSelection();
				if(autoUpdateEnabled) updateValues();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) 
			{			
			}
		});
		
		Label geodesicDistanceLabel = new Label(distancesGroup, SWT.NONE);
		geodesicDistanceLabel.setText("Geodesic Distance :");
		
		GridData gridDataGeodesic = new GridData();
		gridDataGeodesic.horizontalAlignment = SWT.LEFT;
		gridDataGeodesic.grabExcessHorizontalSpace= true;
		gridDataGeodesic.minimumWidth = 100;
		gridDataGeodesic.widthHint = 100;
		
		geodesicDistanceValueLabel = new Label(distancesGroup, SWT.BORDER);
		geodesicDistanceValueLabel.setText("N/A");
		geodesicDistanceValueLabel.setLayoutData(gridDataGeodesic);
		
		Group grpTranslation = new Group(distancesGroup, SWT.NONE);
		grpTranslation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		grpTranslation.setLayout(new FillLayout(SWT.HORIZONTAL));
		grpTranslation.setText("Relative Position (x,y,z)");				
		positionTupleComposite = new Tuple3dComposite(grpTranslation, SWT.NONE);
		positionTupleComposite.setEnableEditing(false);
		
		Group grpRotation = new Group(distancesGroup, SWT.NONE);
		grpRotation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		grpRotation.setLayout(new FillLayout(SWT.HORIZONTAL));
		grpRotation.setText("Relative Orientation (rx,ry,rz)");				
		orientationTupleComposite = new Tuple3dComposite(grpRotation, SWT.NONE);
		orientationTupleComposite.setEnableEditing(false);
	}
	
	@Override
	public void dispose() 
	{	
		autoUpdateEnabled = false;
		super.dispose();
	}
	
	public void selectNode(Node newNode)
	{
		if(newNode != null)
		{			
			if(selectionCount == 0)
			{
				if(!lockFrom)
				{
					setFromNode(newNode);
				}
				else if(!lockTo)
				{
					setToNode(newNode);
				}
			}
			else
			{
				if(!lockTo)
				{
					setToNode(newNode);
				}
				else if(!lockFrom)
				{
					setFromNode(newNode);
				}
			}
			selectionCount++;
			
			if(selectionCount > 1)
			{
				selectionCount = 0;
			}
		}
	}
	
	public Node getFromNode() {
		return fromNode;
	}

	public void setFromNode(Node fromNode) 
	{
		if(!lockFrom)
		{
			this.fromNode = fromNode;		
			if(!autoUpdateEnabled) updateValues();
		}
	}

	public Node getToNode() {
		return toNode;
	}

	public void setToNode(Node toNode) 
	{
		if(!lockTo)
		{
			this.toNode = toNode;		
			if(!autoUpdateEnabled) updateValues();
		}
	}

	public void swapNodes()
	{
		Node from = getFromNode();
		Node to = getToNode();
		
		this.fromNode = to;
		this.toNode = from;
		if(!autoUpdateEnabled) updateValues();
	}
	
	public double getEuclidianDistanceBetweenNodes()
	{
		return euclidianDistanceBetweenNodes;
	}
	
	protected double computeEuclidianDistanceBetweenNodes(final Node fromNode, final Node toNode)
	{
		double distance = 0.0;
		if(fromNode != null && this.toNode != null)
		{
			distance = TopologyFacade.INSTANCE.getEuclideanDistance(fromNode, toNode);
		}
		
		return distance;
	}

	public double getGeodesicDistanceBetweenNodes() 
	{
		return geodesicDistanceBetweenNodes;
	}
	
	protected double computeGeodesicDistanceBetweenNodes(final Node fromNode, final Node toNode)
	{
		double distance = 0.0;
		if(fromNode != null && this.toNode != null)
		{
			distance = TopologyFacade.INSTANCE.getGeodesicDistance(fromNode, toNode);
		}
		
		return distance;
	}
	

	
	protected void updateValues()
	{		
		getUpdateJob().schedule();
	}
	
	protected UIJob getUpdateJob()
	{
		if(updateJob == null)
		{
			updateJob = new UIJob("NodeToNodeDistanceComposite Update")
			{							
				@Override
				public IStatus runInUIThread(IProgressMonitor monitor) 
				{		
					try
					{					
						// Updates Nodes
						String from = "N/A";
						if(fromNode != null)
						{						
							from = fromNode.getNodeId();
							if(from == null)
							{
								from = fromNode.getDescription();
								if(from == null)
								{
									from = fromNode.toString();
								}
							}
						}
						fromNodeValueLabel.setText(from);
					
						String to = "N/A";
						if(toNode != null)
						{						
							to = toNode.getNodeId();
							if(to == null)
							{
								to = toNode.getDescription();
								if(to == null)
								{
									to = toNode.toString();
								}
							}
						}
						
						toNodeValueLabel.setText(to);						
						
						// Updates distances.
						euclidianDistanceBetweenNodes = computeEuclidianDistanceBetweenNodes(fromNode, toNode);
						geodesicDistanceBetweenNodes = computeGeodesicDistanceBetweenNodes(fromNode, toNode);
						
						euclidianDistanceValueLabel.setText(distanceFormat.format(getEuclidianDistanceBetweenNodes()));
						geodesicDistanceValueLabel.setText(distanceFormat.format(getGeodesicDistanceBetweenNodes()));
	
						// Updates relative position.
						Matrix4d m = TopologyFacade.INSTANCE.expressInFrame(fromNode, toNode);
						Vector3d position = new Vector3d();
						m.get(position);
		 				
						positionTupleComposite.setTuple3d(MathFacade.INSTANCE.createTuple3d(position));
						
						// Update relative rotation.
						Matrix3d rotation = new Matrix3d();
						rotation.setIdentity();
						m.get(rotation);
						
						Vector3d rotationVectorRad = GeometricUtils.extractRotationFromXYZRotMatrix(rotation);
						Vector3d rotationVectorDeg = new Vector3d(Math.toDegrees(rotationVectorRad.x), Math.toDegrees(rotationVectorRad.y), Math.toDegrees(rotationVectorRad.z));
						orientationTupleComposite.setTuple3d(MathFacade.INSTANCE.createTuple3d(rotationVectorDeg));
					}
					catch(Exception e)
					{						
					}		
					
					if(autoUpdateEnabled)
					{
						updateJob.schedule(AUTO_UPDATE_PERIOD_MILLISECONDS);
					}
					return Status.OK_STATUS;					
				}				
			};
		}
		
		return updateJob;
	}
}
