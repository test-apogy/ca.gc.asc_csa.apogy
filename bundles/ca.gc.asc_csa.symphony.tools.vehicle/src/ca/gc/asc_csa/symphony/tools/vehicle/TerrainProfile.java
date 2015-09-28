package ca.gc.asc_csa.symphony.tools.vehicle;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class TerrainProfile 
{
	private SortedSet<Segment2D> segments = null;
	
	public TerrainProfile()
	{		
	}
	
	public TerrainProfile(List<Segment2D> segments)
	{
		getSegments().addAll(segments);
	}

	public SortedSet<Segment2D> getSegments() 
	{
		if(segments == null)
		{
			segments = new TreeSet<Segment2D>();
		}
		return segments;
	}	
}
