package ca.gc.space.mrt.geometry.paths;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.vecmath.Point3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

/**
 * Creation of different type of splines. Catmull-Rom and Bezier cubic splines.
 * 
 * @author MCardinal
 * @version 1.2
 */
public class SplinesUtilities {

	/** NO ADDITION OF CONTROL POINTS */
	public static final int AUTO_CTRL_POINTS_NONE = 0;
	
	/** ADDITION OF CONTROL POINTS AT EACH ENDNODES BY DUPLICATION */
	public static final int AUTO_CTRL_POINTS_DUPLICATE_ENDNODES = 1;
	
	/** ADDITION OF CONTROL POINTS AT EACH ENDNODES BY REFLECTION */
	public static final int AUTO_CTRL_POINTS_REFLECTION = 2;
	
	/** ADDITION OF CONTROL POINTS AT EACH ENDNODES FOR SMOOTH CLOSE LOOPS */
	public static final int AUTO_CTRL_POINTS_CLOSE_LOOPS = 3;
	

	// This represents the arc length of every segments at different intervals of
	// t : [0,1]
	private static SortedMap<Integer, SortedMap<Double, Double>> segmentsArcLengths;

	// Each segment chord length(the distance between each control points)
	private static double segmentChordLenght[];

	/**
	 * This generates the points of a CatMull-Rom spline with an uniform
	 * parameterization.
	 * 
	 * @param controlPoints
	 *            The control points we use for building the spline. If there is
	 *            no control points generation we need at least 4 control points
	 *            to make a spline If there is a control points generation we
	 *            need at least 2 control to make a spline
	 * @param nbrOfPointsBetweenEachCtrlPts
	 *            The number of points between each control points. The points
	 *            at the control points locations do not count (we always have
	 *            points at t = 0 and t = 1 for each segments, there will always
	 *            be at least 2 points per segment).
	 * @param splineEndControlPointGenerationMode
	 *            The type of generation for the first and last control points.
	 *            (AUTO_CTRL_POINTS_DUPLICATE_ENDNODES or
	 *            AUTO_CTRL_POINTS_REFLECTION or NONE (no control point
	 *            generation)).
	 * @param tension
	 *            The tension we want for the CatMullRom spline (0 for no
	 *            curvature, 0.5 is the default curvature for Catmull-Rom).
	 * @param Progress monitor to provide feedback on the operation. Can be null.
	 * @return The list of points (Point3d) from the spline that we generated.
	 *
	 */
	public static List<Point3d> generateCatMullSplineUniformParam(
			List<Point3d> controlPoints, double nbrOfPointsBetweenEachCtrlPts,
			SplineEndControlPointGenerationMode splineEndControlPointGenerationMode, 
			double tension,
			IProgressMonitor monitor) {

		// Gets a valid IProgressMonitor.
		IProgressMonitor internalMonitor = monitor;
		if(internalMonitor == null) internalMonitor = new NullProgressMonitor();		
		
		List<Point3d> catMullRomPoints = new ArrayList<Point3d>();
		List<Point3d> modifiedControlPoints = new ArrayList<Point3d>();

		try
		{		
			// Generate the extra control points
			modifiedControlPoints = generateExtraControlPoints(controlPoints, splineEndControlPointGenerationMode);
	
			int nbrOfSegments = modifiedControlPoints.size() - 3;
	
			// Make sure that we don't let the number wanted less than 0
			if (nbrOfPointsBetweenEachCtrlPts < 0) {
				nbrOfPointsBetweenEachCtrlPts = 0;
			}
			
			internalMonitor.beginTask(SplinesUtilities.class.getSimpleName() + ".generateCatMullSplineUniformParam() : Generating points...", ((int)Math.round(nbrOfPointsBetweenEachCtrlPts) * (modifiedControlPoints.size() - 3)) );
			for (int i = 0; i < nbrOfSegments; i++) 
			{
				Point3d p0 = modifiedControlPoints.get(i);
				Point3d p1 = modifiedControlPoints.get(i + 1);
				Point3d p2 = modifiedControlPoints.get(i + 2);
				Point3d p3 = modifiedControlPoints.get(i + 3);
	
				// For each segments we add the t = 0 point plus a number
				// of intermediate points (nbrOfPointsBetweenEachCtrlPts)between
				// each control points.
				// We also need to add a point t = 1 to the last segments.
	
				for (int j = 0; j < nbrOfPointsBetweenEachCtrlPts + 1; j++) 
				{
					double t;
	
					if (nbrOfPointsBetweenEachCtrlPts >= 1) 
					{
						// finding the next t;
						t = (double) j / (double) (nbrOfPointsBetweenEachCtrlPts + 1); // t=[0,1)
					} 
					else 
					{
						t = 0;
					}
	
					// This function returns the curve point at a specified t.
					Point3d curveCurveDot = curvePositionCatmull(t, p0, p1, p2, p3,	tension);
	
					catMullRomPoints.add(curveCurveDot);
	
					internalMonitor.worked(1);
				}
	
				// We must also add a point at the t=1 location for the last
				// segment.
				// i = nbrOfSegments - 1 ----> is the last segment
				if (i == (nbrOfSegments - 1)) {
					catMullRomPoints.add(curvePositionCatmull(1, p0, p1, p2, p3,
							tension));
				}			
			}		
		}
		finally
		{
			internalMonitor.done();
		}
		
		return catMullRomPoints;

	}

	/**
	 * This generates the points of a Catmull-Rom spline with an ChordLenght
	 * parameterization. The points are distributed on each segments by looking
	 * at the percentage of it chord length (Euclidean distance between each
	 * control points) compared to the total chord length (chord length of all
	 * the segments).
	 * 
	 * Per example: if we have 3 segment : (2 length unit,4 length unit,4 length
	 * unit). The points will be distributed to 20%,40%,40% across each
	 * segments.
	 * 
	 * @param controlPoints
	 *            The control points we use for building the spline. If there is
	 *            no control points generation we need at least 4 control points
	 *            to make a spline If there is a control points generation we
	 *            need at least 2 control to make a spline
	 * @param nbrOfPointsOnSpline
	 *            The number of points on the spline. We don't count the control
	 *            point position.
	 * @param splineEndControlPointGenerationMode
	 *            The type of generation for the first and last control points.
	 *            (AUTO_CTRL_POINTS_DUPLICATE_ENDNODES or
	 *            AUTO_CTRL_POINTS_REFLECTION or NONE (no control point
	 *            generation)).
	 * @param tension
	 *            The tension we want for the CatMullRom spline (0 for no
	 *            curvature, 0.5 is the default curvature for Catmull-Rom).
	 * @return The list of points (Point3d) from the spline that we generated.
	 */
	public static List<Point3d> generateCatMullSplineChordLenghtParam(
			List<Point3d> controlPoints, int nbrOfPointsOnSpline,
			SplineEndControlPointGenerationMode splineEndControlPointGenerationMode, 
			double tension,
			IProgressMonitor monitor) {

		List<Point3d> catMullRomPoints = new ArrayList<Point3d>();
		
		// Gets a valid IProgressMonitor.
		IProgressMonitor internalMonitor = monitor;
		if(internalMonitor == null) internalMonitor = new NullProgressMonitor();	
		
		try
		{
			List<Point3d> modifiedControlPoints = new ArrayList<Point3d>();
			double segmentChordLenght[];
			double totalChordLenght = 0;
	
			int nbrOfSegments;
			int intermediatePointsTotal;
	
			// Generate the extra control points
			modifiedControlPoints = generateExtraControlPoints(controlPoints,
					splineEndControlPointGenerationMode);
	
			// Make sure that we don't let the number wanted less than 0
			if (nbrOfPointsOnSpline < 0) {
				nbrOfPointsOnSpline = 0;
			}
	
			// Number of segments
			nbrOfSegments = modifiedControlPoints.size() - 3;
	
			// If it's a less than 0 segments,we have 0 segments.
			if (nbrOfSegments < 0)
				nbrOfSegments = 0;
	
			// number of points in total that will be attributed to the segments
			intermediatePointsTotal = nbrOfPointsOnSpline;
	
			// get each segments chord length.
			segmentChordLenght = getEachSegmentsChordLength(modifiedControlPoints);
	
			// Total length of each segments.
			totalChordLenght = getTotalChordLength(segmentChordLenght);
	
			internalMonitor.beginTask(SplinesUtilities.class.getSimpleName() + ".generateCatMullSplineChordLenghtParam() : Generating points...", nbrOfPointsOnSpline);
			for (int i = 0; i < nbrOfSegments; i++) {
				// Number of points on this segment.
				int nbrPointsSegment = (int) Math
						.round((intermediatePointsTotal * (segmentChordLenght[i] / totalChordLenght)));
	
				// System.out.println("Segment (" + i + ") "
				// + "Nbr de points pour segment: " + nbrPointsSegment
				// + " Lenght : " + segmentChordLenght[i]);
	
				Point3d p0 = modifiedControlPoints.get(i);
				Point3d p1 = modifiedControlPoints.get(i + 1);
				Point3d p2 = modifiedControlPoints.get(i + 2);
				Point3d p3 = modifiedControlPoints.get(i + 3);
	
				for (int j = 0; j < nbrPointsSegment + 1; j++) {
	
					double t;
	
					if (nbrPointsSegment >= 1) {
						t = (double) j / (double) (nbrPointsSegment + 1); // t=[0,1)
	
					} else {
						t = 0;
					}
	
					// This function returns the curve point at a specified t.
					Point3d curveCurveDot = curvePositionCatmull(t, p0, p1, p2, p3,
							tension);
	
					catMullRomPoints.add(curveCurveDot);
	
				}
	
				// We must also add a point at the t=1 location for the last
				// segment.
				// i = nbrOfSegments - 1 ----> is the last segment
				if (i == (nbrOfSegments - 1)) {
					catMullRomPoints.add(curvePositionCatmull(1, p0, p1, p2, p3,
							tension));
				}
	
				internalMonitor.worked(1);
			}
		}
		finally
		{
			internalMonitor.done();
		}
		
		return catMullRomPoints;

	}

	/**
	 * This generates the points of a CatMull-Rom spline with an ArcLength
	 * parameterization. In this parameterization we calculate the length of the
	 * curve of every segment. This enable the option to have points on the
	 * splines being at constant distance from each other.
	 * 
	 * @param controlPoints
	 *            The control points we use for building the spline.
	 * @param distanceBetweenSplinePoints
	 *            The distance between each points on the spline.
	 * 
	 * @param splineEndControlPointGenerationMode
	 *            The type of generation for the first and last control points
	 *            (AUTO_CTRL_POINTS_DUPLICATE_ENDNODES or
	 *            AUTO_CTRL_POINTS_REFLECTION or NONE).
	 * @param tension
	 *            The tension we want for the CatMullRom spline (0 for no
	 *            curvature, 0.5 is the default curvature for CatMull-Rom).
	 * @return The list of points (Point3d) from the spline that we generated.
	 */
	public static List<Point3d> generateCatMullSplineArcLenghtParam(
			List<Point3d> controlPoints, double distanceBetweenSplinePoints,
			SplineEndControlPointGenerationMode splineEndControlPointGenerationMode, 
			double tension,
			IProgressMonitor monitor) {

		// Gets a valid IProgressMonitor.
		IProgressMonitor internalMonitor = monitor;
		if(internalMonitor == null) internalMonitor = new NullProgressMonitor();	
		
		List<Point3d> catMullRomPoints = new ArrayList<Point3d>();
		List<Point3d> modifiedControlPoints = new ArrayList<Point3d>();

		
		try 
		{				
			// If the distance between spline points is less or equal to 0, we
			// cannot make a valid spline.
			if (distanceBetweenSplinePoints <= 0) {
				// we return a empty CatmullRomPoints list.
				return catMullRomPoints;
			}
	
			// Generation of new control points if asked.
			modifiedControlPoints = generateExtraControlPoints(controlPoints, splineEndControlPointGenerationMode);
	
			// Creation of the table that carry the relation between the arc length
			// and the t parameter of each segments.
			// Table (sort map) name : segmentsArcLengths
			createCTMRArcLenghtTable(modifiedControlPoints, tension,
					distanceBetweenSplinePoints);
	
			double distance = 0;
			double distanceRemaining = 0;
	
			int nbrOfSegments = segmentChordLenght.length;
	
			internalMonitor.beginTask(SplinesUtilities.class.getSimpleName() + ".generateCatMullSplineArcLenghtParam() : Generating points...", nbrOfSegments);
			for (int i = 0; i < nbrOfSegments; i++) {
				Point3d p0 = modifiedControlPoints.get(i);
				Point3d p1 = modifiedControlPoints.get(i + 1);
				Point3d p2 = modifiedControlPoints.get(i + 2);
				Point3d p3 = modifiedControlPoints.get(i + 3);
	
				// let's try to add a point on the curve at every same distance.
	
				double arcLength = 0;
	
				SortedMap<Double, Double> segmentArcLenghtAndT = segmentsArcLengths
						.get(i);
	
				// Get the arcLength of the present segment.
				arcLength = segmentArcLenghtAndT.lastKey();
	
				// The distanceRemaining is the distance remaining from the last
				// point
				// of the past segment to reach the arcLength of this past segment.
				distance = 0 + distanceRemaining;
	
				do {
	
					double t = findAssociatedTvalue(i, distance);
					
					Point3d curveCurveDot = curvePositionCatmull(t, p0, p1, p2, p3,
							tension);
	
					catMullRomPoints.add(curveCurveDot);
	
					// Calculate the next distance we are looking for.
					distance = distance + distanceBetweenSplinePoints;
	
					// Calculate the distance remaining until the end of this
					// segment arc length
					distanceRemaining = distance - arcLength;
	
				} while (distanceRemaining <= 0);
	
				internalMonitor.worked(1);
			}
		}
		finally
		{
			internalMonitor.done();
		}
		
		return catMullRomPoints;

	}

	/**
	 * This generates the points of a CatMull-Rom spline with an Degree
	 * parameterization. In this parameterization points are indicated at each
	 * changes of degree of the value of degreeBetweenSplinePoints. The change
	 * of degree is only on the XY plane.
	 * 
	 * @param controlPoints
	 *            The control points we use for building the spline.
	 * @param degreeBetweenSplinePoints
	 *            The degree between each points on the spline.
	 * 
	 * @param splineEndControlPointGenerationMode
	 *            The type of generation for the first and last control points
	 *            (AUTO_CTRL_POINTS_DUPLICATE_ENDNODES or
	 *            AUTO_CTRL_POINTS_REFLECTION or NONE).
	 * @param tension
	 *            The tension we want for the CatMullRom spline (0 for no
	 *            curvature, 0.5 is the default curvature for CatMull-Rom).
	 * @return The list of points (Point3d) from the spline that we generated.
	 */
	@SuppressWarnings("unused")
	public static List<Point3d> generateCatMullSplineDegreeParam(
			List<Point3d> controlPoints, double degreeBetweenSplinePoints,
			SplineEndControlPointGenerationMode splineEndControlPointGenerationMode, 
			double tension,
			IProgressMonitor monitor) {

		// Gets a valid IProgressMonitor.
		IProgressMonitor internalMonitor = monitor;
		if(internalMonitor == null) internalMonitor = new NullProgressMonitor();
		
		List<Point3d> catMullRomPoints = new ArrayList<Point3d>();
		List<Point3d> modifiedControlPoints = new ArrayList<Point3d>();

		try
		{
			// If the degree between spline points = 0;
			if (degreeBetweenSplinePoints == 0) {
				return catMullRomPoints;
			}
	
			// Generation of new control points if asked.
			modifiedControlPoints = generateExtraControlPoints(controlPoints,splineEndControlPointGenerationMode);
	
			double tStepValue = 0.01;
	
			// This is the number of step by segments.
			int numberOfStep = (int) Math.ceil((1 / tStepValue)) + 1;
	
			int nbrOfSegment = modifiedControlPoints.size() - 3;
	
			// The last degree where we put a point.
			double lastDegree = 0;
	
			Point3d position = null, lastPosition;
	
			internalMonitor.beginTask(SplinesUtilities.class.getSimpleName() + ".generateCatMullSplineDegreeParam() : Generating points...", nbrOfSegment);
			for (int i = 0; i < nbrOfSegment; i++) 
			{
				Point3d p0 = modifiedControlPoints.get(i);
				Point3d p1 = modifiedControlPoints.get(i + 1);
				Point3d p2 = modifiedControlPoints.get(i + 2);
				Point3d p3 = modifiedControlPoints.get(i + 3);
	
				double t = 0;
	
				lastPosition = curvePositionCatmull(t, p0, p1, p2, p3, tension);
	
				for (int j = 0; j < numberOfStep; j++) {
	
					t = t + tStepValue;
	
					position = curvePositionCatmull(t, p0, p1, p2, p3, tension);
	
	//				double dx = lastPosition.x - position.x;
	//				double dy = lastPosition.y - position.y;
					// double degree = Math.toDegrees(Math.atan2(dy, dx));
					//
					// System.out.println("degree : " + degree);
	
					Point3d speed = curveSpeedCatmull(t, p0, p1, p2, p3, tension);
					// System.out.println("Speed?! : " + speed);
					// System.out.println("atan2?! : " + Math.atan2(speed.y,
					// speed.x) + "in degree : " +
					// Math.toDegrees(Math.atan2(speed.y, speed.x)));
					double degree = Math.toDegrees(Math.atan2(speed.y, speed.x));
	
					if (Math.abs(lastDegree - degree) >= degreeBetweenSplinePoints) {
						catMullRomPoints.add(position);
						lastDegree = degree;
						// System.out.println("this angle : " + degree);
					}
				}
	
				// Add the last control point as a point of the curve
	
				if (i == (nbrOfSegment - 1)) {
					catMullRomPoints.add(position);
				}
	
				internalMonitor.worked(1);
			}
		}
		finally
		{
			internalMonitor.done();
		}
		
		return catMullRomPoints;

	}

	/**
	 * This generates the points of a B�zier spline with an uniform
	 * parameterization. To draw a B�zier curve we need 2 knot points and 2
	 * control points.
	 * 
	 * @param p1
	 *            first knot point.
	 * @param c1
	 *            first control point.
	 * @param c2
	 *            second control point.
	 * @param p2
	 *            second knot point.
	 * @param nbrOfPointsBetweenEachCtrlPts
	 *            The number of points between each knot points. The points at
	 *            the knot points locations do not count (we always have points
	 *            at t = 0 and t = 1 for each segments, there will always be at
	 *            least 2 points per segment).
	 * @return The list of points (Point3d) from the spline that we generated.
	 */
	@SuppressWarnings("unused")
	public static List<Point3d> generateBezierSplineUniformParam(Point3d p1,
			Point3d c1, Point3d c2, Point3d p2,
			double nbrOfPoints,
			IProgressMonitor monitor) {

		// Gets a valid IProgressMonitor.
		IProgressMonitor internalMonitor = monitor;
		if(internalMonitor == null) internalMonitor = new NullProgressMonitor();
		
		List<Point3d> bezierPoints = new ArrayList<Point3d>();
		List<Point3d> controlPoints = new ArrayList<Point3d>();
		
		try
		{
			// If either of the control or knot point is null, then we return an
			// empty bezier point array
			if (p1 == null || c1 == null || c2 == null || p2 == null) {
				return bezierPoints;
			}
	
			// If the number of points between each ctrl points is less than 0 we
			// set it to 0
			// TODO Is this acceptable?
			if (nbrOfPoints < 0)
				nbrOfPoints = 0;
	
			// We had the defined number of points (nbrOfPointsBetweenEachCtrlPts)
			// between each knot.
			internalMonitor.beginTask(SplinesUtilities.class.getSimpleName() + ".generateBezierSplineUniformParam() : Generating points...",(int) Math.round(nbrOfPoints));
			for (int j = 0; j < nbrOfPoints + 1; j++) {
	
				double t;
	
				// If there is less than 1 point between each ctrl points defined,
				// we only had the first and last point of the segment (t = 0 and t
				// = 1)
				if (nbrOfPoints >= 1) {
					// finding the next t;
					t = (double) j / (double) (nbrOfPoints + 1); // t=[0,1)
	
				} else {
					t = 0;
				}
	
				// This function returns the curve point at a specified t.
				Point3d curveCurveDot = curvePositionBezier(t, p1, c1, c2, p2);
	
				bezierPoints.add(curveCurveDot);
	
				if(monitor != null) monitor.worked(1);
			}
	
			// We must add the point at the t=1
			bezierPoints.add(curvePositionBezier(1, p1, c1, c2, p2));
		}
		finally
		{
			internalMonitor.done();
		}
	
		return bezierPoints;

	}

	@SuppressWarnings("unused")
	public static List<Point3d> generateBezierSplineDegreeParam(Point3d point1,
			Point3d ctrl1, Point3d ctrl2, Point3d point2,
			double degreeBetweenSplinePoints,
			IProgressMonitor monitor) {
	
		// Gets a valid IProgressMonitor.
		IProgressMonitor internalMonitor = monitor;
		if(internalMonitor == null) internalMonitor = new NullProgressMonitor();
				
		List<Point3d> bezierPoints = new ArrayList<Point3d>();
	
		try
		{
			// If either of the control or knot point is null, then we return an
			// empty bezier point array
			if (point1 == null || ctrl1 == null || ctrl2 == null || point2 == null) {
				return bezierPoints;
			}
		
			// If the degree between spline points = 0;
			if (degreeBetweenSplinePoints == 0) {
				return bezierPoints;
			}
		
			double tStepValue = 0.01;
		
			// This is the number of step by segments.
			int numberOfStep = (int) Math.ceil((1 / tStepValue)) + 1;
		
			// The last degree where we put a point.
			double lastDegree = 0;
		
			Point3d position = null, lastPosition;
		
			double t = 0;
		
			lastPosition = curvePositionBezier(t, point1, ctrl1, ctrl2, point2);
		
			internalMonitor.beginTask(SplinesUtilities.class.getSimpleName() + ".generateBezierSplineDegreeParam() : Generating points...", numberOfStep);
			for (int j = 0; j < numberOfStep; j++) {
		
				position = curvePositionBezier(t, point1, ctrl1, ctrl2, point2);
		
	//			double dx = lastPosition.x - position.x;
	//			double dy = lastPosition.y - position.y;
				// double degree = Math.toDegrees(Math.atan2(dy, dx));
				// System.out.println("degree : " + degree);
		
				Point3d speed = curveSpeedBezier(t, point1, ctrl1, ctrl2, point2);	
				double degree = Math.toDegrees(Math.atan2(speed.y, speed.x));
				// Vector3d a = new Vector3d(speed);
				// System.out.println("a vector: " + a);
				// System.out.println("lenghth speed : " + a.length());
				// System.out.println("lenghth speed squared : " +
				// a.lengthSquared());
				//			
				// a.normalize();
				// System.out.println("a vector: normalized " + a);
				//			
				if (Math.abs(lastDegree - degree) >= degreeBetweenSplinePoints
						|| j == 0) {
					bezierPoints.add(position);
					lastDegree = degree;
					// System.out.println("this angle : " + degree);
				}
		
				t = t + tStepValue;
		
				if(monitor != null) monitor.worked(1);
			}
		
			// Add the last control point as a point of the curve
			bezierPoints.add(position);
		}
		finally
		{
			internalMonitor.done();
		}
		
		return bezierPoints;
	}

	/**
	 * This generates the points of a Bezier spline spline with an ArcLength
	 * parameterization. In this parameterization we calculate the length of the
	 * curve of every segment. This enable the option to have points on the
	 * splines being at constant distance from each other according to the arc.
	 * 
	 * To draw a Bezier curve we need 2 knot points and 2 control points.
	 * 
	 * @param p1
	 *            first knot point.
	 * @param c1
	 *            first control point.
	 * @param c2
	 *            second control point.
	 * @param p2
	 *            second knot point.
	 * @param distanceBetweenSplinePoints
	 *            The distance between each points on the spline.
	 * 
	 * @return The list of points (Point3d) from the spline that we generated.
	 */
	public static List<Point3d> generateBezierSplineArcLenghtParam(
			Point3d point1, Point3d ctrl1, Point3d ctrl2, Point3d point2,
			double distanceBetweenSplinePoints,
			IProgressMonitor monitor) {
			
		// Gets a valid IProgressMonitor.
		IProgressMonitor internalMonitor = monitor;
		if(internalMonitor == null) internalMonitor = new NullProgressMonitor();
	
		List<Point3d> bezierPoints = new ArrayList<Point3d>();
	
		try
		{
			// If either of the control or knot point is null, then we return an
			// empty bezier point array
			if (point1 == null || ctrl1 == null || ctrl2 == null || point2 == null) {
				return bezierPoints;
			}
		
			// If the distance between spline points is less or equal to 0, we
			// cannot make a valid spline.
			if (distanceBetweenSplinePoints <= 0) {
				// we return a empty CatmullRomPoints list.
				return bezierPoints;
			}
		
			// Creation of the table that carry the relation between the arc length
			// and the t parameter of each segments.
			// Table (sort map) name : segmentsArcLengths
		
			List<Point3d> ctrlPoints = new ArrayList<Point3d>();
			// The order is really important.
			ctrlPoints.add(point1);
			ctrlPoints.add(ctrl1);
			ctrlPoints.add(ctrl2);
			ctrlPoints.add(point2);
		
			// createBezierArcLenghtTable
			createBezierArcLenghtTable(ctrlPoints, distanceBetweenSplinePoints);
		
			double distance = 0;
			double distanceRemaining = 0;
		
			int nbrOfSegments = segmentChordLenght.length;
		
			internalMonitor.beginTask(SplinesUtilities.class.getSimpleName() + ".generateBezierSplineArcLenghtParam() : Generating points...", nbrOfSegments);
			for (int i = 0; i < nbrOfSegments; i++) {
		
				Point3d p1 = ctrlPoints.get(i * 3);
				Point3d c1 = ctrlPoints.get(i * 3 + 1);
				Point3d c2 = ctrlPoints.get(i * 3 + 2);
				Point3d p2 = ctrlPoints.get(i * 3 + 3);
		
				// let's try to add a point on the curve at every same distance.
		
				double arcLength = 0;
				// segmentsArcLengths.get(i).get(1);
		
				SortedMap<Double, Double> segmentArcLenghtAndT = segmentsArcLengths
						.get(i);
		
				arcLength = segmentArcLenghtAndT.lastKey();
		
				distance = 0 + distanceRemaining;
		
				do {
		
					double t = findAssociatedTvalue(i, distance);
					
					Point3d curveCurveDot = curvePositionBezier(t, p1, c1, c2, p2);
		
					bezierPoints.add(curveCurveDot);
		
					// Calculate the next distance we are looking for.
					distance = distance + distanceBetweenSplinePoints;
		
					// Calculate the distance remaining until the end of this
					// segment arc length
					distanceRemaining = distance - arcLength;
		
				} while (distanceRemaining <= 0);
		
				internalMonitor.worked(1);
			}
		}
		finally
		{
			internalMonitor.done();
		}
	
		return bezierPoints;	
	}


	/**
	 * We generate the extra control points depending on the parameter (NONE,
	 * AUTO_CTRL_POINTS_DUPLICATE_ENDNODES, AUTO_CTRL_POINTS_REFLECTION)
	 * 
	 * @param controlPoints
	 *            The list of control points.
	 * @param auxiliaryControlPoints
	 *            The parameterization for the control points.
	 * @return The control points.
	 * 
	 */
	private static List<Point3d> generateExtraControlPoints(List<Point3d> controlPoints, SplineEndControlPointGenerationMode splineEndControlPointGenerationMode) {

		// If the controlPoints list is null, sends an empty arrayList
		if (controlPoints == null) {
			return new ArrayList<Point3d>();

		}
		// If there is less than 2 control points.
		if (controlPoints.size() < 2) {
			return controlPoints;

		}

		List<Point3d> modifiedControlPoints = new ArrayList<Point3d>();

		modifiedControlPoints.addAll(controlPoints);

		if (splineEndControlPointGenerationMode == SplineEndControlPointGenerationMode.AUTO_CTRL_POINTS_DUPLICATE_ENDNODES) {

			// Duplicate first control points
			modifiedControlPoints.add(0, (Point3d) modifiedControlPoints.get(0)
					.clone());

			// Duplicate last control points
			modifiedControlPoints.add((Point3d) modifiedControlPoints.get(
					modifiedControlPoints.size() - 1).clone());

		}

		// TODO not sure if this is valid.
		if (splineEndControlPointGenerationMode == SplineEndControlPointGenerationMode.AUTO_CTRL_POINTS_REFLECTION) {

			// Not sure about this implementation.

			double x = 2 * (modifiedControlPoints.get(0).x - modifiedControlPoints
					.get(1).x);
			double y = 2 * (modifiedControlPoints.get(0).y - modifiedControlPoints
					.get(1).y);
			double z = 2 * (modifiedControlPoints.get(0).z - modifiedControlPoints
					.get(1).z);
			modifiedControlPoints.add(0, new Point3d(x, y, z));

			int last = controlPoints.size() - 1;

			x = 2 * (modifiedControlPoints.get(last).x - modifiedControlPoints
					.get(last - 1).x);
			y = 2 * (modifiedControlPoints.get(last).y - modifiedControlPoints
					.get(last - 1).y);
			z = 2 * (modifiedControlPoints.get(last).z - modifiedControlPoints
					.get(last - 1).z);

			modifiedControlPoints.add(new Point3d(x, y, z));

		}

		if (splineEndControlPointGenerationMode == SplineEndControlPointGenerationMode.AUTO_CTRL_POINTS_CLOSE_LOOPS) {

			double distance;
			double dX, dY;
			double theta;
			double newDX, newDY;
			int lastCtrlPointIndex;

			// See http://www.algorithmist.net/catmullrom.html Closed Loops

			// For the first auxiliaryControlPoints :
			// Distance is equal to the distance from the first to second knot
			// on the chord
			// and along the chord of the last and next-to-last knot.

			distance = controlPoints.get(1).distance(controlPoints.get(0));

			System.out.println("distance : " + distance);

			lastCtrlPointIndex = controlPoints.size() - 1;

			dX = controlPoints.get(lastCtrlPointIndex).x
					- controlPoints.get(lastCtrlPointIndex - 1).x;
			dY = controlPoints.get(lastCtrlPointIndex).y
					- controlPoints.get(lastCtrlPointIndex - 1).y;

			theta = Math.atan2(dY, dX);
			newDX = -distance * Math.cos(theta);
			newDY = -distance * Math.sin(theta);

			Point3d firstAuxCtrlPts = new Point3d(newDX
					+ controlPoints.get(0).x, newDY + controlPoints.get(0).y, 0);

			modifiedControlPoints.add(0, firstAuxCtrlPts);

			// For the second auxiliaryControlPoints :
			// Distance is equal to the distance from the last to next-to-last
			// knot on the chord
			// and along the chord of the first and second knot.

			lastCtrlPointIndex = controlPoints.size() - 1;

			distance = controlPoints.get(lastCtrlPointIndex).distance(
					controlPoints.get(lastCtrlPointIndex - 1));

			dX = controlPoints.get(1).x - controlPoints.get(0).x;
			dY = controlPoints.get(1).y - controlPoints.get(0).y;

			theta = Math.atan2(dY, dX);
			newDX = distance * Math.cos(theta);
			newDY = distance * Math.sin(theta);

			Point3d lastAuxCtrlPts = new Point3d(newDX
					+ controlPoints.get(lastCtrlPointIndex).x, newDY
					+ controlPoints.get(lastCtrlPointIndex).y, 0);

			modifiedControlPoints.add(lastAuxCtrlPts);

			lastCtrlPointIndex = modifiedControlPoints.size() - 1;

		}

		return modifiedControlPoints;
	}

	/**
	 * This method creates a table (segmentsArcLengths) that will keep a
	 * relation between a multitude of t value and arcLength. By interpolating
	 * the values of this table we will be able to approximate the arc length at
	 * a wanted t and vice versa.
	 * 
	 * @param controlPoints
	 *            The control points.
	 * @param tension
	 *            The tension wanted in the CatMullRom.
	 * @param maximumDistanceBetweenPoints
	 *            maximum distance wanted between each points
	 */
	private static void createCTMRArcLenghtTable(List<Point3d> controlPoints,
			double tension, double maximumDistanceBetweenPoints) {

		// The t value.
		double t;
		// The interval of t at which we will create points in the table
		double tStepValue;
		int numberOfStep;
		int nbrOfSegments;
		double chordLenght;

		segmentChordLenght = getEachSegmentsChordLength(controlPoints);
		nbrOfSegments = segmentChordLenght.length;

		// Get the total chordLenght
		chordLenght = getTotalChordLength(segmentChordLenght);

		// We find an acceptable step value for t.
		tStepValue = (maximumDistanceBetweenPoints / chordLenght)
				* nbrOfSegments / 4;

		// This is the number of step by segments.
		numberOfStep = (int) Math.ceil((1 / tStepValue)) + 1;
		// System.out.println("tStep Value = " + tStepValue
		// + ", maximum Distance between points : "
		// + maximumDistanceBetweenPoints + " ,chordLenght: "
		// + chordLenght);
		// System.out.println("numberOfStep Value = " + numberOfStep);

		segmentsArcLengths = new TreeMap<Integer, SortedMap<Double, Double>>();

		for (int i = 0; i < nbrOfSegments; i++) {
			int ctrlPtsIndex = i;

			Point3d lastPoint = null;

			// Map<Double, Double> arcLengthUDistanceMap = new HashMap<Double,
			// Double>();
			SortedMap<Double, Double> arcLengthUDistanceMap = new TreeMap<Double, Double>();

			// t is set to 0 for the beginning of a segment.
			t = 0;

			int j;
			double segmentArcLenght = 0;

			for (j = 0; j < numberOfStep; j++) {

				Point3d p1 = curvePositionCatmull(t, controlPoints
						.get(ctrlPtsIndex),
						controlPoints.get(ctrlPtsIndex + 1), controlPoints
								.get(ctrlPtsIndex + 2), controlPoints
								.get(ctrlPtsIndex + 3), tension);

				if (lastPoint == null) {
					// The first point so the distance = 0;

					arcLengthUDistanceMap.put(new Double(0), new Double(0));

				} else {
					double distance = p1.distance(lastPoint);

					segmentArcLenght = distance + segmentArcLenght;
					// distance = distance + arcLengthUDistanceMap.lastKey();

					arcLengthUDistanceMap.put(segmentArcLenght, t);

				}

				lastPoint = (Point3d) p1.clone();

				t = t + tStepValue;

				// t should never be bigger than 1.
				if (t > 1)
					t = 1;

			}

			segmentsArcLengths.put(i, arcLengthUDistanceMap);
			// segmentsArcLengths.put(i, new TreeMap<Double,
			// Double>(arcLengthUDistanceMap));

		}

	}

	/**
	 * This method creates a table (segmentsArcLengths) that will keep a
	 * relation between a multitude of t value and arcLength. By interpolating
	 * the values of this table we will be able to approximate the arc length at
	 * a wanted t and vice versa.
	 * 
	 * @param controlPoints
	 *            The control points.
	 * @param maximumDistanceBetweenPoints
	 *            maximum distance wanted between each points
	 */

	private static void createBezierArcLenghtTable(List<Point3d> controlPoints,
			double maximumDistanceBetweenPoints) {

		// The t value.
		double t;
		// The interval of t at which we will create points in the table
		double tStepValue;
		int numberOfStep;
		int nbrOfSegments;
		double chordLenght;

		// How many segment there is here ???
		// (NBROFCONTROLPTS-1)/ 3
		nbrOfSegments = (controlPoints.size() - 1) / 3;

		segmentChordLenght = new double[nbrOfSegments];

		for (int i = 0; i < nbrOfSegments; i++) {
			// The first and the last control points of a series are the knots.
			Point3d p1 = controlPoints.get(i * 3);
			Point3d p2 = controlPoints.get(i * 3 + 3);

			segmentChordLenght[i] = p1.distance(p2);
		}

		// Get the total chordLenght
		chordLenght = getTotalChordLength(segmentChordLenght);

		// We find an acceptable step value for t.
		tStepValue = (maximumDistanceBetweenPoints / chordLenght)
				* nbrOfSegments / 4;

		// This is the number of step by segments.
		numberOfStep = (int) Math.ceil((1 / tStepValue)) + 1;
		// System.out.println("tStep Value = " + tStepValue
		// + ", maximum Distance between points : "
		// + maximumDistanceBetweenPoints + " ,chordLenght: "
		// + chordLenght);
		// System.out.println("numberOfStep Value = " + numberOfStep);

		segmentsArcLengths = new TreeMap<Integer, SortedMap<Double, Double>>();

		for (int i = 0; i < nbrOfSegments; i++) {

			Point3d p1 = controlPoints.get(i * 3);
			Point3d c1 = controlPoints.get(i * 3 + 1);
			Point3d c2 = controlPoints.get(i * 3 + 2);
			Point3d p2 = controlPoints.get(i * 3 + 3);

			Point3d lastPoint = null;

			// Map<Double, Double> arcLengthUDistanceMap = new HashMap<Double,
			// Double>();
			SortedMap<Double, Double> arcLengthUDistanceMap = new TreeMap<Double, Double>();

			// t is set to 0 for the beginning of a segment.
			t = 0;

			int j;
			double segmentArcLenght = 0;

			for (j = 0; j < numberOfStep; j++) {

				Point3d curvePoint = curvePositionBezier(t, p1, c1, c2, p2);

				if (lastPoint == null) {
					// The first point so the distance = 0;

					arcLengthUDistanceMap.put(new Double(0), new Double(0));

				} else {
					double distance = curvePoint.distance(lastPoint);

					segmentArcLenght = distance + segmentArcLenght;
					// distance = distance + arcLengthUDistanceMap.lastKey();

					arcLengthUDistanceMap.put(segmentArcLenght, t);

				}

				lastPoint = (Point3d) curvePoint.clone();

				t = t + tStepValue;

				// t should never be bigger than 1.
				if (t > 1)
					t = 1;

			}

			segmentsArcLengths.put(i, arcLengthUDistanceMap);
			// segmentsArcLengths.put(i, new TreeMap<Double,
			// Double>(arcLengthUDistanceMap));

		}

	}

	/**
	 * This function gets the total arc length of the whole spline.
	 * 
	 * This function must be called after the creation of the arcLengthTable
	 * 
	 * @return total arc length
	 */
	@SuppressWarnings("unused")
	private static double getTotalArcLength() {
		double arcLength = 0;

		for (int i = 0; i < segmentsArcLengths.size(); i++) {
			arcLength = arcLength + getSegmentArcLenght(i);
		}

		return arcLength;

	}

	/**
	 * This function returns the arc length of a segment.
	 * 
	 * @param segmentIndex
	 *            the index of the segment we want to know the arc length.
	 * @return the arc length of the segment.
	 */
	private static double getSegmentArcLenght(int segmentIndex) {
		double arcLength = 0;
		arcLength = segmentsArcLengths.get(segmentIndex).lastKey();

		return arcLength;
	}

	/**
	 * This function returns the total chord length using the control points
	 * position.
	 * 
	 * @param controlPoints
	 *            The control points.
	 * @return total chord length
	 */
	@SuppressWarnings("unused")
	private static double getTotalChordLength(List<Point3d> controlPoints) {

		double chordLenght = 0;

		double segmentLenght[] = getEachSegmentsChordLength(controlPoints);

		int nbrOfSegments = segmentLenght.length;

		// Let's calculate the length of each segments.
		for (int i = 0; i < nbrOfSegments; i++) {
			chordLenght = chordLenght + segmentLenght[i];
		}

		return chordLenght;
	}

	/**
	 * This function returns the total chord length using a table of
	 * segmentLength.
	 * 
	 * @param segmentLenght
	 *            segmentLenght table.
	 * @return total chord length
	 */
	private static double getTotalChordLength(double segmentLenght[]) {

		double chordLenght = 0;

		int nbrOfSegments = segmentLenght.length;

		// Let's calculate the length of each segments.
		for (int i = 0; i < nbrOfSegments; i++) {
			chordLenght = chordLenght + segmentLenght[i];
		}

		return chordLenght;
	}

	/**
	 * This calculates the chord length of every segments.
	 * 
	 * @param controlPoints
	 * @return The array with all the segments length
	 */
	private static double[] getEachSegmentsChordLength(
			List<Point3d> controlPoints) {

		// The number of segment is the number of control points - 3
		int nbrOfSegment = controlPoints.size() - 3;

		if (nbrOfSegment < 0) {
			nbrOfSegment = 0;
		}

		double segmentlength[] = new double[nbrOfSegment];

		for (int i = 0; i < nbrOfSegment; i++) { // Minus the 2 new
			// control point

			segmentlength[i] = controlPoints.get(i + 1).distance(
					controlPoints.get(i + 2));
		}

		return segmentlength;
	}

	/**
	 * calculateCurveFactor: this function calculates the curve and curve_dot
	 * vectors for four points. The math is carried on from Joseph's code, not
	 * verified yet. I.Rekleitis, J-L.Bedwani
	 * 
	 * @param t
	 * @param p0
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param tension
	 *            The tension of the CatMull-Rom spline.
	 * @return an array of two Point3d values that store the curve and the
	 *         curve_dot.
	 * 
	 */
	private static Point3d curvePositionCatmull(double t, Point3d p0,
			Point3d p1, Point3d p2, Point3d p3, double tension) {

		Point3d Zero = new Point3d();

		// Calculate A = 0.5*(-p0 + 3*p1 - 3*p2 + p3)
		Point3d A = new Point3d();
		A.scaleAdd(-1 * tension, p0, Zero);
		A.scaleAdd((2 - tension), p1, A);
		A.scaleAdd((tension - 2), p2, A);
		A.scaleAdd((tension), p3, A);
		// A.scale(0.5);

		// Calculate B = 0.5*(2*p0 - 5*p1 + 4*p2 - p3)
		Point3d B = new Point3d();
		B.scaleAdd(2 * tension, p0, Zero);
		B.scaleAdd(tension - 3, p1, B);
		B.scaleAdd(3 - 2 * tension, p2, B);
		B.scaleAdd(-tension, p3, B);

		// Calculate C = 0.5*(-p0 + p2)
		Point3d C = new Point3d();
		C.scaleAdd(-tension, p0, C);
		C.scaleAdd(tension, p2, C);

		// Calculate D = 0.5*(2*p1) = p1
		Point3d D = new Point3d(p1);

		// Calculate Curve = ((A*t+B)*t+C)*t+D
		Point3d curve = new Point3d(A);
		curve.scaleAdd(t, B);
		curve.scaleAdd(t, C);
		curve.scaleAdd(t, D);

		return curve;
	}

	/**
	 * calculateCurveFactor: this function calculates the curve and curve_dot
	 * vectors for four points. The math is carried on from Joseph's code, not
	 * verified yet. I.Rekleitis, J-L.Bedwani
	 * 
	 * @param t
	 * @param p0
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param tension
	 *            The tension of the CatMull-Rom spline.
	 * @return an array of two Point3d values that store the curve and the
	 *         curve_dot.
	 * 
	 */
	@SuppressWarnings("unused")
	private static Point3d curveSpeedCatmull(double t, Point3d p0, Point3d p1,
			Point3d p2, Point3d p3, double tension) {

		Point3d Zero = new Point3d();

		// Calculate A = 0.5*(-p0 + 3*p1 - 3*p2 + p3)
		Point3d A = new Point3d();
		A.scaleAdd(-1 * tension, p0, Zero);
		A.scaleAdd((2 - tension), p1, A);
		A.scaleAdd((tension - 2), p2, A);
		A.scaleAdd((tension), p3, A);
		// A.scale(0.5);

		// Calculate B = 0.5*(2*p0 - 5*p1 + 4*p2 - p3)
		Point3d B = new Point3d();
		B.scaleAdd(2 * tension, p0, Zero);
		B.scaleAdd(tension - 3, p1, B);
		B.scaleAdd(3 - 2 * tension, p2, B);
		B.scaleAdd(-tension, p3, B);

		// Calculate C = 0.5*(-p0 + p2)
		Point3d C = new Point3d();
		C.scaleAdd(-tension, p0, C);
		C.scaleAdd(tension, p2, C);

		// Calculate D = 0.5*(2*p1) = p1
		Point3d D = new Point3d(p1);

		// Calculate Curve = 3*(A*t*t) + 2*B*t + C
		Point3d curve = new Point3d();
		curve.scaleAdd((3 * t), A, B);
		curve.add(B);
		curve.scaleAdd(t, C);

		return curve;
	}

	/**
	 * 
	 * @param t
	 * @param p0
	 * @param p1
	 * @param p2
	 * @param p3
	 * @return an array of two Point3d values that store the curve and the
	 *         curve_dot.
	 * 
	 */
	private static Point3d curvePositionBezier(double t, Point3d p1,
			Point3d c1, Point3d c2, Point3d p2) {

		Point3d Zero = new Point3d();

		// Calculate A = (-p0 + 3*p1 - 3*p2 + p3)
		Point3d A = new Point3d();
		A.scaleAdd(-1, p1, Zero);
		A.scaleAdd(3, c1, A);
		A.scaleAdd(-3, c2, A);
		A.scaleAdd(1, p2, A);

		// Calculate B = (3*p0 - 6*p1 + 3*p2)
		Point3d B = new Point3d();
		B.scaleAdd(3, p1, Zero);
		B.scaleAdd(-6, c1, B);
		B.scaleAdd(3, c2, B);

		// Calculate C = (-3*p0 + 3*p1)
		Point3d C = new Point3d();
		C.scaleAdd(-3, p1, C);
		C.scaleAdd(3, c1, C);

		// Calculate D = (p0) = p0
		Point3d D = new Point3d(p1);

		// Calculate Curve = ((A*t+B)*t+C)*t+D
		Point3d curve = new Point3d(A);
		curve.scaleAdd(t, B);
		curve.scaleAdd(t, C);
		curve.scaleAdd(t, D);

		return curve;
	}

	/**
	 * 
	 * @param t
	 * @param p0
	 * @param p1
	 * @param p2
	 * @param p3
	 * @return an array of two Point3d values that store the curve and the
	 *         curve_dot.
	 * 
	 */
	@SuppressWarnings("unused")
	private static Point3d curveSpeedBezier(double t, Point3d p1, Point3d c1,
			Point3d c2, Point3d p2) {

		Point3d Zero = new Point3d();

		// Calculate A = (-p0 + 3*p1 - 3*p2 + p3)
		Point3d A = new Point3d();
		A.scaleAdd(-1, p1, Zero);
		A.scaleAdd(3, c1, A);
		A.scaleAdd(-3, c2, A);
		A.scaleAdd(1, p2, A);

		// Calculate B = (3*p0 - 6*p1 + 3*p2)
		Point3d B = new Point3d();
		B.scaleAdd(3, p1, Zero);
		B.scaleAdd(-6, c1, B);
		B.scaleAdd(3, c2, B);

		// Calculate C = (-3*p0 + 3*p1)
		Point3d C = new Point3d();
		C.scaleAdd(-3, p1, C);
		C.scaleAdd(3, c1, C);

		// Calculate D = (p0) = p0
		Point3d D = new Point3d(p1);

		// Calculate Curve = 3*(A*t*t) + 2*B*t + C
		Point3d curve = new Point3d();
		curve.scaleAdd((3 * t), A, B);
		curve.add(B);
		curve.scaleAdd(t, C);

		return curve;
	}

	@SuppressWarnings("unused")
	private static Point3d curvePositionBezier(double t, List<Point3d> controlPoints ) {
		
		Point3d pos = new Point3d();
		
		int nbrOfControlPoints = controlPoints.size();  
		double n = nbrOfControlPoints-1;
		
		String equation = "";
		
		for (int i = 0; i < nbrOfControlPoints; i++) {

			Point3d p;

			double a;
			a = Math.min((i * n), ((n - i) * n));
			a = Math.max(a, 1);

			p = (Point3d) controlPoints.get(i).clone();
			p.scale(a);

			p.scale(Math.pow(t, i));

			equation = equation + a + " * P" + i + " * t^" + i + "*(1-t)^"
					+ (n - i);
			
			if (i != nbrOfControlPoints-1) equation = equation + " + ";

			p.scale(Math.pow((1 - t), (n - i)));
			pos.add(p);

		}
		
		System.out.println(equation);
		
		return pos; 
	}
	
	
	/** 
	 * This finds the associated t with the arcLength at specified 
	 * segment.
	 * @param segmentIndex segment index
	 * @param arcLenghth arcLength at this segment.
	 * @return
	 */
	private static double findAssociatedTvalue(int segmentIndex, double arcLenghth){
		double a = arcLenghth;
		double t = 0, t0 = 0, t1 = 0, a0 = 0, a1 = 0;

		// Finding the t value by interpolating two values found in the
		// table.

		SortedMap<Double, Double> segmentArcLenghtAndT = segmentsArcLengths
		.get(segmentIndex);
		
		SortedMap<Double, Double> downInterval = segmentArcLenghtAndT
				.headMap(arcLenghth);
		SortedMap<Double, Double> upInterval = segmentArcLenghtAndT
				.tailMap(arcLenghth);

		// a0 = the distance just before the distance value
		// we are looking for, found in the table
		// t0 = the t associated to this distance
		if (!downInterval.isEmpty()) {
			a0 = downInterval.lastKey();
			t0 = downInterval.get(downInterval.lastKey());
		} else {
			a0 = 0;
			t0 = 0;
		}

		// a1 = the distance just after the distance value
		// we are looking for, found in the table
		// t1 = the t associated to this distance
		if (!upInterval.isEmpty()) {
			a1 = upInterval.firstKey();
			t1 = upInterval.get(upInterval.firstKey());
		} else {
			a1 = 0;
			t1 = 1;
		}

		// Make the interpolation
		if (a1 != 0 && ((a1 - a0) != 0)) {
			t = t0 + ((a - a0) / (a1 - a0)) * (t1 - t0);
		} else {
			t = t0;
		}
		
		return t;
	}
}
