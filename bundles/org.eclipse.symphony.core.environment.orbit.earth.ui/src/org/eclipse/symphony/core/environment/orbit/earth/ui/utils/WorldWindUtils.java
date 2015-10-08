package org.eclipse.symphony.core.environment.orbit.earth.ui.utils;

import gov.nasa.worldwind.geom.Angle;
import gov.nasa.worldwind.geom.Position;
import gov.nasa.worldwind.render.ExtrudedPolygon;
import gov.nasa.worldwind.render.Polygon;
import gov.nasa.worldwind.render.Polyline;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.symphony.core.environment.GeographicCoordinates;
import org.eclipse.symphony.core.environment.orbit.SpacecraftState;
import org.eclipse.symphony.core.environment.orbit.earth.Corridor;
import org.eclipse.symphony.core.environment.orbit.earth.CorridorPoint;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitFacade;
import org.eclipse.symphony.core.environment.orbit.earth.OreKitBackedSpacecraftState;

public class WorldWindUtils 
{
	
	public static gov.nasa.worldwind.geom.Position convertToPosition(GeographicCoordinates geographicCoordinates)
	{
		// Create latitude, longitude and elevation values.
        Angle latitude = Angle.fromRadiansLatitude(geographicCoordinates.getLatitude());
        Angle longitude = Angle.fromRadiansLongitude(geographicCoordinates.getLongitude());
        double elevation = geographicCoordinates.getElevation();
        	            
        // Creates and adds a position in the linked list.
        Position position = new Position(latitude, longitude, elevation);
        
        return position;
	}
	
	public static List<Polyline> createPolyLineFromGeographicCoordinatesListNoWrapAround(List<GeographicCoordinates> coordinatesList)
	{
		List<Polyline> polylines = new ArrayList<Polyline>();
		LinkedList<Position> positions = new LinkedList<Position>();
		
		for(GeographicCoordinates coord : coordinatesList)
		{
			// Creates and adds a position in the linked list.
            Position position = convertToPosition(coord);
            
            if(positions.size() > 0)
			{
				// If we are going from -180 to + 180
				double currentLongitude = position.longitude.getDegrees();
				double lastLongitude = positions.getLast().longitude.getDegrees();
				
				// If there is a change of sign.
				if(Math.signum(currentLongitude) != Math.signum(lastLongitude))					  
				{
					// If the change of sign does not happen around zero.
					if(Math.abs(currentLongitude) > 90 && (Math.abs(lastLongitude) > 90))
					{
						// Create a new line segment with the current position.
						Polyline polyline = new Polyline(positions);
						polylines.add(polyline);
						
						// Clears the position and start a new line.
						positions.clear();													
					}
				}

			}			
			positions.add(position);
		}
		
		// Adds the last line being processed.
		if(!positions.isEmpty())
		{
			Polyline polyline = new Polyline(positions);
			polylines.add(polyline);
		}
		
		return polylines;
	}
	
	public static Polyline createPolyLine(List<SpacecraftState> spacecraftStates) throws Exception
	{
  		LinkedList<Position> positions = new LinkedList<Position>();
  		
		for(SpacecraftState ss : spacecraftStates)
		{
			if(ss instanceof OreKitBackedSpacecraftState)
			{
				// Gets the geographical coordinates of the spacecraft state.
				GeographicCoordinates coord = EarthOrbitFacade.INSTANCE.convertToGeographicCoordinates((OreKitBackedSpacecraftState) ss);
					            
	            // Creates and adds a position in the linked list.
	            Position position = convertToPosition(coord);
	            positions.add(position);
			}
		}
		
		Polyline polyline = new Polyline(positions);		
		return polyline;
	}	
	
	/**
	 * Creates a List of Polyline that do not wrap around at 180 to -180 degrees longitude.
	 * @param spacecraftStates
	 * @return
	 * @throws Exception
	 */
	public static List<Polyline> createPolyLineWithNoWrapAround(List<SpacecraftState> spacecraftStates) throws Exception
	{
		List<Polyline> polylines = new ArrayList<Polyline>();
				
		LinkedList<Position> positions = new LinkedList<Position>();
		for(SpacecraftState ss : spacecraftStates)
		{
			if(ss instanceof OreKitBackedSpacecraftState)
			{
				// Gets the geographical coordinates of the spacecraft state.
				GeographicCoordinates coord = EarthOrbitFacade.INSTANCE.convertToGeographicCoordinates((OreKitBackedSpacecraftState) ss);

	            // Creates and adds a position in the linked list.
	            Position position = convertToPosition(coord);
				
				if(positions.size() > 0)
				{
					// If we are going from -180 to + 180
					double currentLongitude = position.longitude.getDegrees();
					double lastLongitude = positions.getLast().longitude.getDegrees();
					
					// If there is a change of sign.
					if(Math.signum(currentLongitude) != Math.signum(lastLongitude))					  
					{
						// If the change of sign does not happen around zero.
						if(Math.abs(currentLongitude) > 90 && (Math.abs(lastLongitude) > 90))
						{
							// Create a new line segment with the current position.
							Polyline polyline = new Polyline(positions);
							polylines.add(polyline);
							
							// Clears the position and start a new line.
							positions.clear();													
						}
					}

				}
				
				positions.add(position);
			}
									
			// Adds the last line being processed.
			if(!positions.isEmpty())
			{
				Polyline polyline = new Polyline(positions);
				polylines.add(polyline);
			}
		}
  		
		return polylines;
	}
	
	public static List<gov.nasa.worldwind.render.Polygon> createPolygons(Corridor corridor)
	{
		List<gov.nasa.worldwind.render.Polygon> polygons = new ArrayList<gov.nasa.worldwind.render.Polygon>();
		
		if(corridor.getPoints().size() > 1)
		{
			int index = 1;
			int maxIndex = corridor.getPoints().size() - 1;
			
			CorridorPoint p0 = corridor.getPoints().get(0);			
			while(index < maxIndex)
			{				
				CorridorPoint p1 = corridor.getPoints().get(index);
			
				Position p0Left = convertToPosition(p0.getLeft());				
				Position p0Right = convertToPosition(p0.getRight());
				
				Position p1Left = convertToPosition(p1.getLeft());
				Position p1Right = convertToPosition(p1.getRight());
				
				// Polygon : p0Left, p0Right, p1Right, p1Left
				List<Position> polygon0List = new ArrayList<Position>();
				polygon0List.add(p0Left);
				polygon0List.add(p0Right);
				polygon0List.add(p1Right);
				polygon0List.add(p1Left);				
				Polygon polygon0 = new Polygon(polygon0List);
				polygons.add(polygon0);
				
				p0 = p1;
				
				index++;
			}
		}
		
		return polygons;
	}
	
	public static List<gov.nasa.worldwind.render.ExtrudedPolygon> createExtrudedPolygons(Corridor corridor, double height)
	{
		List<gov.nasa.worldwind.render.ExtrudedPolygon> polygons = new ArrayList<gov.nasa.worldwind.render.ExtrudedPolygon>();
		
		if(corridor.getPoints().size() > 1)
		{
			int index = 1;
			int maxIndex = corridor.getPoints().size() - 1;
			
			CorridorPoint p0 = corridor.getPoints().get(0);			
			while(index <= maxIndex)
			{				
				CorridorPoint p1 = corridor.getPoints().get(index);
			
				Position p0Left = convertToPosition(p0.getLeft());
				Position p0Right = convertToPosition(p0.getRight());
				
				Position p1Left = convertToPosition(p1.getLeft());				
				Position p1Right = convertToPosition(p1.getRight());
								
				// Polygon : p0Left, p0Right, p1Right, p1Left
				List<Position> polygon0List = new ArrayList<Position>();
				polygon0List.add(p0Left);
				polygon0List.add(p0Right);
				polygon0List.add(p1Right);
				polygon0List.add(p1Left);				
				ExtrudedPolygon polygon0 = new ExtrudedPolygon(polygon0List, height);
				polygons.add(polygon0);
							
				p0 = p1;
				
				index++;
			}
		}
		
		return polygons;
	}
}
