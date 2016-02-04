package ca.gc.asc_csa.apogy.core.environment.ui.commands;
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

import java.util.Iterator;

import javax.vecmath.Matrix4d;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Geometry3DUtilities;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.AbstractWorksite;
import ca.gc.asc_csa.apogy.core.OperationCallPositionedResult;
import ca.gc.asc_csa.apogy.core.PositionedResult;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.environment.BasicCartesianTriangularMeshMapLayer;
import ca.gc.asc_csa.apogy.core.environment.Map;
import ca.gc.asc_csa.apogy.core.environment.MapsList;
import ca.gc.asc_csa.apogy.core.environment.SurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.ui.Activator;
import ca.gc.asc_csa.apogy.core.environment.ui.dialogs.MapSelectionDialog;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.ReferenceResultValue;
import org.eclipse.ui.handlers.HandlerUtil;

import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.emf.edit.utils.ApogyCommonEMFEditUtilsFacade;

public class MoveToMapLayer extends AbstractHandler implements IHandler
{
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();
		
		while (selections.hasNext()) 
		{
			Object selection = selections.next();
			
			try
			{					
				if(selection instanceof PositionedResult)
				{
					PositionedResult positionedResult = (PositionedResult) selection;
															
					if(positionedResult.getResultValue() instanceof ReferenceResultValue)
					{
						ReferenceResultValue referenceResultValue = (ReferenceResultValue) positionedResult.getResultValue();
						
						if(referenceResultValue.getValue() instanceof CartesianTriangularMesh)
						{
							CartesianTriangularMesh mesh = (CartesianTriangularMesh) referenceResultValue.getValue();
							
							Map map = selectMapLayer(event, positionedResult);
							 
							if(map != null)
							{
								addToMap(positionedResult, map, mesh);
							}
						}
						else if(referenceResultValue.getValue() instanceof CartesianCoordinatesSet)
						{
							CartesianCoordinatesSet coordSet = (CartesianCoordinatesSet) referenceResultValue.getValue();
							Map map = selectMapLayer(event, positionedResult);
							 
							if(map != null)
							{
								addToMap(positionedResult, map, coordSet);
							}
						}	
						else if(referenceResultValue.getValue() != null)
						{
							Logger.INSTANCE.log(Activator.ID, this, "Data of type <" + referenceResultValue.getValue().getClass().getName() + "> is not supported !", EventSeverity.ERROR);
						}
						else
						{
							Logger.INSTANCE.log(Activator.ID, this, "Data is null !", EventSeverity.ERROR);
						}
					}						
				}				
			}
			catch(Throwable t)
			{
				Logger.INSTANCE.log(Activator.ID, this, "Failed to move <" + selection + "> to Map !", EventSeverity.ERROR, t);
			}
		}
		
		return null;
	}

	protected Map selectMapLayer(ExecutionEvent event, PositionedResult positionedResult)
	{			
		Map map = null;
		
		Context context  = positionedResult.getContext();
		if(context.getEnvironment() instanceof ApogyEnvironment)
		{
			ApogyEnvironment apogyEnvironment = (ApogyEnvironment) context.getEnvironment();
			AbstractWorksite worksite = apogyEnvironment.getActiveWorksite();
			
			if(worksite instanceof SurfaceWorksite)
			{
				SurfaceWorksite surfaceWorksite = (SurfaceWorksite) worksite;
				MapsList mapList = surfaceWorksite.getMapsList();
				
				if(mapList != null && mapList.getMaps() != null && mapList.getMaps().size() > 0)
				{
					final Shell shell = HandlerUtil.getActiveSite(event).getShell();
					MapSelectionDialog mapSelectionDialog = new MapSelectionDialog(shell, context);					
					
					if(mapSelectionDialog.open() == Window.OK)
					{
						map = mapSelectionDialog.getSelectedMap();
					}
				}
			}
		}
		
		return map;
	}
	
	protected void addToMap(final PositionedResult positionedResult, final Map map, final CartesianTriangularMesh mesh)
	{
		// Create a CartesianTriangularMeshMapLayer
		BasicCartesianTriangularMeshMapLayer meshLayer = ApogyCoreEnvironmentFactory.eINSTANCE.createBasicCartesianTriangularMeshMapLayer();
		
		// Sets Name
		meshLayer.setName(getName(positionedResult));
		
		// Sets Description
		meshLayer.setDescription(getDescription(positionedResult));
		
		// Makes a copy of the mesh.
		CartesianTriangularMesh transformedMesh = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianTriangularMesh(mesh);
		
		// Transform the mesh coordinates.
		Matrix4d transform = getTransformForMap(positionedResult, map);		
		transformedMesh = Geometry3DUtilities.createTransformedCartesianTriangularMesh(transform, transformedMesh);
								
		// Sets the mesh
		meshLayer.setMesh(transformedMesh);
		
		// Adds Layer to Map.
		addMap(meshLayer, map);
	}
	
	protected void addToMap(final PositionedResult positionedResult, final Map map, final CartesianCoordinatesSet coordinatesSet)
	{
		// Create a CartesianTriangularMeshMapLayer
		BasicCartesianTriangularMeshMapLayer meshLayer = ApogyCoreEnvironmentFactory.eINSTANCE.createBasicCartesianTriangularMeshMapLayer();
		
		// Sets Name
		meshLayer.setName(getName(positionedResult));
		
		// Sets Description
		meshLayer.setDescription(getDescription(positionedResult));
		
		// Creates a mesh .
		CartesianTriangularMesh mesh = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianTriangularMesh();
		
		// Copies the coordinatesSet point to the mesh.
		for(CartesianPositionCoordinates point : coordinatesSet.getPoints())
		{
			CartesianPositionCoordinates pointCopy = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(point);
			mesh.getPoints().add(pointCopy);
		}
				
		// Transform the points.
		Matrix4d transform = getTransformForMap(positionedResult, map);	
		mesh = Geometry3DUtilities.createTransformedCartesianTriangularMesh(transform, mesh);
									
		// Sets the mesh
		meshLayer.setMesh(mesh);
		
		// Adds Layer to Map.
		addMap(meshLayer, map);
	}
	
	protected void addMap(BasicCartesianTriangularMeshMapLayer meshLayer, Map map)
	{
		EditingDomain editingDomain = org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain.getEditingDomainFor(map);
		
		// Creates an ADD command to add the meshLayer.
		Command addCommand = AddCommand.create(editingDomain, map, ApogyCoreEnvironmentPackage.Literals.MAP__LAYERS, meshLayer);
		
		// Executes the command.
		editingDomain.getCommandStack().execute(addCommand);
	}
	
	/**
	 * Gets the transform needed to keep the current absolute position while changing to the map reference frame.
	 * @param positionedResult The positioned result defining the absolute position.
	 * @param map The Map to which the data will be attached.
	 * @return The transformation matrix expressing the data into the Map frame.
	 */
	protected Matrix4d getTransformForMap(final PositionedResult positionedResult, final Map map)
	{				
		Matrix4d absolutePose = positionedResult.getPose().asMatrix4d();				
		Matrix4d mapPose = new Matrix4d();
		mapPose.setIdentity();
		
		if(map.getTransformation() != null)
		{
			mapPose = map.getTransformation().asMatrix4d();
		}
		
		Matrix4d matrix = null;
		if(!isIdentity(mapPose))
		{
			mapPose.invert();		
			absolutePose.mul(mapPose);
			matrix = new Matrix4d(absolutePose);
		}
		else
		{
			matrix = new Matrix4d(absolutePose);
			matrix.setIdentity();
		}
		
		return matrix;
	}
	
	protected String getName(final PositionedResult positionedResult)
	{
		String name = null;
		
		if(positionedResult instanceof Named)
		{
			Named named = (Named) positionedResult;
			name = named.getName();
		}
		else if(positionedResult instanceof OperationCallPositionedResult)
		{
			OperationCallPositionedResult ocpr = (OperationCallPositionedResult) positionedResult;
			
			if(ocpr.getOperationCall() != null && ocpr.getOperationCall().getName() != null)
			{
				name = ocpr.getOperationCall().getName();
			}
		}				
		else if(positionedResult.getTime() != null)
		{
			name = positionedResult.getTime().toString();
		}
		else
		{
			name = "?";
		}
		return name;
	}
	
	protected String getDescription(final PositionedResult positionedResult)
	{
		String description = "";
		
		if(positionedResult instanceof Described)
		{
			description = ((Described) positionedResult).getDescription();
		}
		else if(positionedResult instanceof OperationCallPositionedResult)
		{
			OperationCallPositionedResult ocpr = (OperationCallPositionedResult) positionedResult;
			description += "Acquired by " + getText(ocpr) + "\n";					
		}		
		
		// Adds the time stamp
		if(positionedResult.getTime() != null)
		{
			description += "\nAcquired on <" + positionedResult.getTime().toString() + ">.";
		}
		
		
		return description;
	}	
	
	protected String getText(OperationCallPositionedResult ocpr)
	{
		OperationCall operationCall = ocpr.getOperationCall();
		
		String name_str = operationCall.getName();
		if (name_str != null && name_str.length() == 0) 
		{
			name_str += " - ";
		}
		else if(name_str == null)
		{
			name_str = "";
		}
	
		String variable_str = "?";
		if( operationCall.getVariable() != null)
		{
			variable_str = ApogyCommonEMFEditUtilsFacade.INSTANCE.getText(operationCall.getVariable());
		}
		
		String feature_str = null;
		if (operationCall.getFeatureRoot() != null) 
		{
			AbstractFeatureListNode leaf = ApogyCommonEMFFacade.INSTANCE.getLeaf(operationCall.getFeatureRoot());
			if (leaf != null) 
			{
				feature_str = ApogyCommonEMFFacade.INSTANCE.getAncestriesString(leaf);
			}
		}
		String operation_str = "?";
		
		if(operationCall.getEOperation() != null)
		{
			operation_str = ApogyCommonEMFEditUtilsFacade.INSTANCE.getText(operationCall.getEOperation());
		}
		
		if (feature_str != null) 
		{
			return name_str + " " + variable_str + "." + feature_str + "." + operation_str;
		} 
		else 
		{
			return name_str + " " + variable_str + "." + operation_str;
		}
	}
	
	protected boolean isIdentity(Matrix4d matrix)
	{
		return false;
	}
}
