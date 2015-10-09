package ca.gc.space.mrt.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Vector;

import javax.swing.JFileChooser;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Data3dFacade;
import org.eclipse.symphony.common.geometry.data3d.Data3dFactory;
import org.eclipse.symphony.common.geometry.data3d.Pose;
import org.eclipse.symphony.common.math.GeometricUtils;
/**
 * A class providing basic IO capabilities.
 * See the individual functions for descriptions
 * 
 * <PRE>
 * 
 * $Revision: 1.2.4.2 $
 * 15-Sep-06
 * 
 * Mobile Robotics Testbed (MRT).
 * Canadian Space Agency / Agence spatiale canadienne
 * 6767 route de l'Aeroport
 * St-Hubert, Qu?bec, Canada
 * J3Y 8Y9
 * www.space.gc.ca
 * Copyrights (c)
 * </PRE>
 * @author yiannis jbedwani
 *
 */

public class IO {
	
	/**
	 * A subclass providing input Log file data management.
	 * Field Name, contains a string label, such as a test name
	 * Field File, contains a string with a file name, such as a VTK file
	 * Field Origin, is null when not specified, is a DefaultPoseEstimate where the file (File) is located.
	 * Field Destination, is null when not specified, is a DefaultPoseEstimate for any secondary location associated, such as a destination.
	 * <PRE>
	 * 
	 * $Revision: 1.2.4.2 $
	 * 06-Feb-07
	 * 
	 * Mobile Robotics Testbed (MRT).
	 * Canadian Space Agency / Agence spatiale canadienne
	 * 6767 route de l'Aeroport
	 * St-Hubert, Qu?bec, Canada
	 * J3Y 8Y9
	 * www.space.gc.ca
	 * Copyrights (c)
	 * </PRE>
	 *
	 */
	public static class InputLogData{
		public String Name="";
		public String File="";
		public Pose Origin = null;
		public Pose Destination = null;
	}
	
	/**
	 * 
	 * trueFalseQuestion: This function poses a "question" and returns true if the user entered a string starting with [Yy] 
	 *                    and false if the user entered a string starting with [Nn], otherwise it would continue asking the
	 *                    question. 
	 *
	 * @param question
	 * @return boolean
	 *
	 */
	public static boolean trueFalseQuestion(String question) {
		while(true){
			System.out.println(question + " (Y/N)?");
			String responce=getLine().toUpperCase();
			if (responce.startsWith("Y")) {
				return (true);
			}
			if (responce.startsWith("N")) {
				return (false);
			}
		}
	}
	
	/**
	 * 
	 * getLine: reads a string from std input.
	 *
	 * @return the read string
	 *
	 */
	public static String getLine() {
		String input=null;
		try {
			BufferedReader stdin = new BufferedReader(
					new InputStreamReader(System.in));
			input = stdin.readLine();
			//System.out.println("You entered: '" + input + "'");
			// Integer n = new Integer(input);                  //Declare an Integer object
			
		} catch(IOException e) {
			System.out.println("IO Exception");
			System.exit(1);
		}
		return input;
	}
	/**
	 * 
	 * getPose: Requests for input from the keyboard in order to create a IPoseEstimate
	 *
	 * @param poseName String, the name of the variable for prompting the user for the correct data 
	 * @return IPoseEstimate
	 *
	 */
	public static Pose getPose(String poseName) {
		return getPose(null,poseName);
	}
	
	/**
	 * 
	 * getPose: Requests for input from the keyboard in order to create a IPoseEstimate.
	 *          if an existingPose is passed it reminds the user that the  IPoseEstimate is initialized to 
	 *          that value. If <enter> is the only input the returned IPoseEstimate is the one initialized.
	 *
	 * @param existingPose, null if none passed or an existing value to initialise.
	 * @param poseName String, the name of the variable for prompting the user for the correct data 
	 * @return IPoseEstimate, the returned value.
	 *
	 */
	public static Pose getPose(Pose existingPose, String poseName) {
		Data3dFacade data3d = Data3dFactory.eINSTANCE.createData3dFacade();
		double x=0;
		double y=0;
		double z=0;
		Pose pose=null;
		if(existingPose!=null)
			System.err.println("ExistingPose: Position is: "+existingPose.toString());
		System.out.println("Please enter the "+poseName+" position in the form of:");
		System.out.println("x-coord y-coord z_coord <enter>");
		
		String pstr=IO.getLine();
		System.out.println(">"+pstr+"<");
		String [] properties=pstr.split(" ");
		
		if(existingPose!=null) {
			x=existingPose.getX();
			y=existingPose.getY();
			z=existingPose.getZ();
		}

		if(properties.length==3) {
			x=(new Double(properties[0])).doubleValue();
			y=(new Double(properties[1])).doubleValue();
			z=(new Double(properties[2])).doubleValue();
		}
		pose = data3d.createPose(x,y,z,0,0,0);

		
		if(existingPose!=null)
			System.err.println("ExistingPose: Orientation is:"+Math.toDegrees(existingPose.getXRotation())+" "+
					Math.toDegrees(existingPose.getYRotation())+" "+
					Math.toDegrees(existingPose.getZRotation())+" degrees");
		System.out.println("Please enter the "+poseName+" orientation in the form of:");
		System.out.println("x-coord y-coord z_coord <enter>");

		pstr=IO.getLine();
		System.out.println(">"+pstr+"<");
		properties=pstr.split(" ");
		x=0.0;
		y=0.0;
		z=0.0;
		if(existingPose!=null) {
			x=existingPose.getXRotation();
			y=existingPose.getYRotation();
			z=existingPose.getZRotation();
		}
		if(properties.length==3) {
			x=Math.toRadians((new Double(properties[0])).doubleValue());
			y=Math.toRadians((new Double(properties[1])).doubleValue());
			z=Math.toRadians((new Double(properties[2])).doubleValue());
		}
		pose.setXRotation(x);
		pose.setYRotation(y);
		pose.setZRotation(z);
		return(pose);
	}
	
	/**
	 *
	 * printPose: Prints a CartesianPositionCoordinates prefixed by the string prefix
	 *
	 * @param p : CartesianPositionCoordinates
	 * @param prefix String
	 *
	 */
	public static void printCoordinates(CartesianPositionCoordinates p, String prefix) {		
		printPoint3d(new Point3d(p.getX(),p.getY(),p.getZ()), prefix);
	}
	/**
	 * 
	 * printPose: Prints a CartesianPositionCoordinates 
	 *
	 * @param p : CartesianPositionCoordinates
	 *
	 */
	public static void printCoordinates(CartesianPositionCoordinates p) {
		printCoordinates(p,"");
	}
	
	/**
	 *
	 * printPose: Prints a IPoseEstimate prefixed by the string prefix
	 *
	 * @param p : IPoseEstimate
	 * @param prefix String
	 *
	 */
	public static void printPose(Pose p, String prefix) {
		
		if((p.getX()<999)&&(p.getY()<999)&&(p.getZ()<999)){
			System.out.println(poseToString(p, prefix));
		}
		else {
			System.out.println(prefix+"["+p.getX()+" "+
					p.getY()+" "+
					p.getZ()+"],["+
					format(Math.toDegrees(GeometricUtils.normalizeAngleToPositiveValue(p.getXRotation())),2,7)+" "+
					format(Math.toDegrees(GeometricUtils.normalizeAngleToPositiveValue(p.getYRotation())),2,7)+" "+
					format(Math.toDegrees(GeometricUtils.normalizeAngleToPositiveValue(p.getZRotation())),2,7)+"]");
			
		}
	}
	/**
	 * 
	 * printPose: Prints a IPoseEstimate 
	 *
	 * @param p : Pose
	 *
	 */
	public static void printPose(Pose p) {
		printPose(p,"");
	}
	
	/**
	 *
	 * printPose: Prints a Pose prefixed by the string prefix
	 *
	 * @param p : Pose
	 * @param prefix String
	 *
	 */
	public static String poseToString(Pose p, String prefix) {
		return poseToString(p, prefix, true);
	}
	
	/**
	 *
	 * printPose: Prints a Pose prefixed by the string prefix
	 *
	 * @param p : Pose
	 * @param prefix String
	 *
	 */
	public static String poseToString(Pose p, String prefix, boolean inDegrees) {
	
		
		String str = prefix+"["+format(p.getX(),2,7)+" "+
		format(p.getY(),2,7)+" "+
		format(p.getZ(),2,7)+"],[";
		
		if(inDegrees)
		{
			/* Write angles in Degrees */
			str += format(Math.toDegrees(GeometricUtils.normalizeAngleToPositiveValue(p.getXRotation())),2,7)+" "+
			format(Math.toDegrees(GeometricUtils.normalizeAngleToPositiveValue(p.getYRotation())),2,7)+" "+
			format(Math.toDegrees(GeometricUtils.normalizeAngleToPositiveValue(p.getZRotation())),2,7);
		}
		else
		{
			/* Write angles in Radians */
			str += format(GeometricUtils.normalizeAngleToPositiveValue(p.getXRotation()),2,7)+" "+
			format(GeometricUtils.normalizeAngleToPositiveValue(p.getYRotation()),2,7)+" "+
			format(GeometricUtils.normalizeAngleToPositiveValue(p.getZRotation()),2,7);
		}
		
		str += "]";
			
		return str;
	}
	/**
	 *
	 * poseFromString: Generate a Pose from a string
	 *
	 * @param formated String with angles expressed in Degrees in the string
	 *
	 */
	public static Pose poseFromString(String formatedString) throws Exception{
	
		return poseFromString(formatedString, true);
	}

	/**
	 *
	 * poseFromString: Generate a Pose from a string
	 *
	 * @param String Formated pose string with angles expressed in Degrees or Radians in the string
	 * @param Boolean Degrees flag to specify angles encoding in Degrees(true) or Radians(false).
	 *
	 */
	public static Pose poseFromString(String formatedString, boolean inDegrees) throws Exception{
	
		Pose pose = null;
		Vector3d position;
		Vector3d orientation;		
		Data3dFacade data3d = Data3dFactory.eINSTANCE.createData3dFacade();
		
		String str = formatedString.substring(formatedString.indexOf('['));
		String[] splittedInput = str.split(", *");

		// Extract the position
		position = parseCoordinatesString(splittedInput[0]);
		if (position != null){
			// Extract the orientation
			orientation = parseCoordinatesString(splittedInput[1]);
			if (orientation != null){
				// Convert orientation from degree to radian
				// Assign the scan origin
				if (inDegrees){
					pose = data3d.createPose(position.x,position.y,position.z,Math.toRadians(orientation.x),Math.toRadians(orientation.y),Math.toRadians(orientation.z));
				}
				else{
					pose = data3d.createPose(position.x,position.y,position.z,orientation.x,orientation.y,orientation.z);	
				}
			}
		}
		
		if (pose == null)
		{
			throw new Exception("Invalid pose formated string.");
		}
			
		return pose;
	}
	/**
	 * 
	 * getPoint: prompts the user to enter the coordinates of a 3D point, from standard input, 
	 *
	 * @param existingPoint Point3d, if enter is pressed without coordinates then existingPoint is returned
	 * @return Point3d
	 *
	 */public static Point3d getPoint(Point3d existingPoint) {
		double x=0;
		double y=0;
		double z=0;
		Point3d point=null;
		if(existingPoint!=null)
			printPoint3d(existingPoint,"ExistingPoint: Position is: ");
		System.out.println("\nPlease enter the points coordinates in the form of:");
		System.out.println("x-coord y-coord z_coord <enter>");
		
		String pstr=IO.getLine();
		System.out.println(">"+pstr+"<");
		String [] properties=pstr.split(" ");
		
		if(existingPoint!=null) {
			x=existingPoint.x;
			y=existingPoint.y;
			z=existingPoint.z;
		}

		if(properties.length==3) {
			x=(new Double(properties[0])).doubleValue();
			y=(new Double(properties[1])).doubleValue();
			z=(new Double(properties[2])).doubleValue();
		}
		point = new Point3d(x,y,z);
		return(point);
	}	
	/**
	 * 
	 * printPoint3d: Prints a Point3d prefixed by the string prefix
	 *
	 * @param p Point3d
	 * @param prefix String
	 *
	 */
	public static void printPoint3d(Point3d p, String prefix){
		if (p == null)
		{
			System.err.print(prefix+"(NULL Point3d)");
			return;
		}
		if((p.x<999)&&(p.y<999)&&(p.z<999)){
			System.out.print(prefix+"("+format(p.x,2,7)+" "+
				format(p.y,2,7)+" "+
				format(p.z,2,7)+")");
		}
		else {
			System.out.print(prefix+"("+p.x+" "+
					p.y+" "+
					p.z+")");
		}
	}
	
	/**
	 * 
	 * printPoint3d: Prints a Point3d
	 *
	 * @param p Point3d
	 *
	 */
	public static void printPoint3d(Point3d p){
		printPoint3d(p,"");
	}
	
//	/**
//	 * 
//	 * printPose: Prints a Transform 3D as a pose.
//	 *
//	 * @param t : Transform3D
//	 *
//	 */
//	public static void printPose(Transform3D t) {
//		DefaultPoseEstimate p=data3d.createPose(x,y,z,rx,ry,rz)(t,new GMatrix(6,6));
//		printPose(p,"");
//	}
//	/**
//	 * 
//	 * printPose: Prints a Transform 3D as a pose prefixed by the string prefix.
//	 *
//	 * @param t : Transform3D
//	 *
//	 */
//	public static void printPose(Transform3D t,String prefix) {
//		DefaultPoseEstimate p=data3d.createPose(x,y,z,rx,ry,rz)(t,new GMatrix(6,6));
//		printPose(p,prefix);
//	}

	static final String ZEROES = "000000000000";
	static final String BLANKS = "            ";
	/**
	 * This function returns a string for a formated double that has w total length and n decimal digits.
	 * n : number of decimals
	 * w: total length
	 */
	public static String format( double val, int n, int w)  {
//		rounding
		double incr = 0.5;
		for( int j=n; j>0; j--) incr /= 10;
		val += incr;
		String s = Double.toString(val);
		int n1 = s.indexOf('.');
		int n2 = s.length() - n1 - 1;

		if (n>n2)      s = s+ZEROES.substring(0, n-n2);
		else if (n2>n) s = s.substring(0,n1+n+1);

		if( w>0 & w>s.length() ) s = BLANKS.substring(0,w-s.length()) + s;
		else if ( w<0 & (-w)>s.length() ) {
			w=-w;
			s = s + BLANKS.substring(0,w-s.length()) ;
		}
		return s;
	}

	/**
	 * 
	 * parseCoordinatesString: Parses a string with an x y z coordinate (position or orientation). String can contain brackets and spaces. Spaces must separates the x, y, and z values.
	 *
	 * @param coordinatesXYZstr, String with coordinates formated as follow: "[x.xx y.yy z.zz]". 
	 * @return Vector3d, the returned value.
	 *
	 */
	public static Vector3d parseCoordinatesString(String coordinatesXYZstr) {
		double x;
		double y;
		double z;
		Vector3d vector = null;
		String input;
		String[] coordinates;
		
		// Remove any brackets in the string
		input = coordinatesXYZstr.replaceAll("[\\]\\[]", "");
		
		// Remove any spaces at begining of the string
		input = input.replaceAll("^ *", "");
		
		// Remove any spaces at the end of the string
		input = input.replaceAll(" *$", "");
		
		// Split the inputs coordinates separated by any at least one or more space character 
		coordinates = input.split("  *");
		
		// Verify that there are 3 coordinates
		if (coordinates.length == 3) {
			// Extract the orientation
			x = new Double(coordinates[0]).doubleValue();
			y = new Double(coordinates[1]).doubleValue();
			z = new Double(coordinates[2]).doubleValue();
			vector = new Vector3d(x,y,z);
		}
		return vector;
	}

	/**
	 * 
	 * readInputLogFile: Parses a file formated as a Input Log File. Format is also explained in the file {@link ExampleInputLogFile.txt}.
	 * 
	 * File format is CSV (Comma Separated Values) and is defined as follow:
	 * A '#' character at the begining of a lines comments it out. Fields in {} are required, fields in <> are optionnal. A comma separates the fields and a space is required between the [x y z] coordinates of a position or orientation field.
	 * 
	 * Fields of a line are the following:
	 * {Test name} ,{VTK data file}, <[Origin position]> , <[Origin orientation]>, <[Destination position]> , <[Destination orientation]>
	 * 
	 * Position and Orientation coordinates can be enclosed in brackets [] and each elements must be separated by at least one 'space' character.
	 * ie: [x.xx y.yy z.zz]
	 * 
	 * @param workingDirectory, path of the directory where to find the file.
	 * @param inputFile, name of the Log file. 
	 * @return Vector<InputLogData>, the returned value.
	 *
	 */
	public static Vector<InputLogData> readInputLogFile(String workingDirectory, String inputFile) {
		Data3dFacade data3d = Data3dFactory.eINSTANCE.createData3dFacade();
		BufferedReader inputData;
		Vector<InputLogData> LogEntries = new Vector<InputLogData>();
		InputLogData LogEntry;
		
		try {
			// Input file
			FileInputStream fstream = new FileInputStream(workingDirectory + File.separator + inputFile);
			inputData = new BufferedReader(new InputStreamReader(fstream));
		
			// Read the first input line
			String inputLine = inputData.readLine();
			
			// Scan all the file
			while(inputLine!=null){
				// Skip commented Lines
				if(inputLine.matches("^#.*$"))
				{
					// Skip this line from processing
					
					// Read next line
					inputLine = inputData.readLine();
					
					continue;
				}
				
				// Parse this line
				String[] splittedInput = inputLine.split(", *");
				LogEntry = new InputLogData();
				
				// Retrieve test name
				if(splittedInput.length >= 1){
					LogEntry.Name = splittedInput[0];
				}
				
				// Retrieve file name
				if(splittedInput.length >= 2){
					LogEntry.File = splittedInput[1];
				}
				
				// Retrieve the Scan Origin
				if(splittedInput.length >= 4){
					Vector3d pose;
					Vector3d orientation;
					
					// Extract the position
					pose = parseCoordinatesString(splittedInput[2]);
					if (pose != null){
						// Extract the orientation
						orientation = parseCoordinatesString(splittedInput[3]);
						if (orientation != null){
							// Convert orientation from degree to radian
							// Assign the scan origin
							LogEntry.Origin = data3d.createPose(pose.x,pose.y,pose.z,Math.toRadians(orientation.x),Math.toRadians(orientation.y),Math.toRadians(orientation.z));
						}
					}
				}
				
				// Retrieve the Destination
				if(splittedInput.length >= 6){
					Vector3d pose;
					Vector3d orientation;
					
					// Extract the position
					pose = parseCoordinatesString(splittedInput[4]);
					if (pose != null){
						// Extract the orientation
						orientation = parseCoordinatesString(splittedInput[5]);
						if (orientation != null){
							// Convert orientation from degree to radian
							// Assign the destination coordinates
							LogEntry.Destination = data3d.createPose(pose.x,pose.y,pose.z,Math.toRadians(orientation.x),Math.toRadians(orientation.y),Math.toRadians(orientation.z));
						}
					}
				}
				
				// Add this entry to the list
				LogEntries.add(LogEntry);
				
				// Read next line
				inputLine = inputData.readLine();
			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return LogEntries;
	}
	
	public static void writeInputLogFile(String workingDirectory, String outputFile, Vector<InputLogData> logEntries) {
		BufferedWriter outputData;
		//Vector<InputLogData> LogEntries = new Vector<InputLogData>();
		//InputLogData LogEntry;
		
		try {
			// Output file
			FileOutputStream fstream = new FileOutputStream(concatPath(workingDirectory, outputFile));
			outputData = new BufferedWriter(new OutputStreamWriter(fstream));
		
			// Write the file header
			String header = 
			  "# THIS FILE IS GENERATED AUTOMATICALLY.\n"
			+ "#\n"
			+ "# File format is CSV (Comma Separated Values) and is defined as follow:\n"
			+ "# A '#' character at the begining of a lines comments it out.\n"
			+ "# fields in {} are required, fields in <> are optionnal.\n"
			+ "# A comma separates the fields and a space is required between the [x y z] coordinates of a position or orientation field.\n" 
			+ "#\n"
			+ "# Fields of a line are the following:\n"
			+ "# {Test name} ,{VTK data file}, <[Origin position]> , <[Origin orientation]>, <[Destination position]> , <[Destination orientation]>\n"
			+ "# Position and Orientation coordinates can be enclosed in brackets [] and each elements must separated by at least one 'space' character.\n"
			+ "# ie: [x.xx y.yy z.zz]\n";
			outputData.write(header);
			
			// Write all the log lines
			for(int count = 0; count < logEntries.size(); count++){
				
				// Get first data input
				InputLogData LogEntry =  logEntries.get(count);
					
				// Log input data
				String fomattedOutputLine = LogEntry.Name;
				fomattedOutputLine =  fomattedOutputLine + ", " + LogEntry.File;
				if(LogEntry.Origin != null)
				{
					fomattedOutputLine =  fomattedOutputLine + ", " + poseToString(LogEntry.Origin, "");
					
					if(LogEntry.Destination != null)
					{
						fomattedOutputLine =  fomattedOutputLine + ", " + poseToString(LogEntry.Destination, "");
					}
				}
				
				// Write the log line to the file
				outputData.write(fomattedOutputLine+"\n");
			}
			
			//Close the file
			outputData.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean createPath(String dirName){
		
		// Path sanity check
		IPath filePath = new Path(dirName);
		filePath = filePath.addTrailingSeparator();
		filePath = filePath.makeAbsolute();
		
		// Veriry the path previous to the last element
		if(!filePath.isRoot())
		{
			// Recursively call this function to verify if the parent directory exist
			if (!createPath(filePath.removeLastSegments(1).toOSString()))
			{
				return false;
			}
			
		}
		
		// Create the directory if it does not exist
		if (!filePath.toFile().isDirectory()) {
			// Create the directory
			if(!filePath.toFile().mkdirs()) {
				System.err.println("Directory "+filePath.toOSString()+" was not created");
				return false;
			}
		}
		
		// Succeeded in creating the directory path
		return true;
	}
	
	public static String concatPath(String dirName, String fileName)
	{
		IPath filePath = new Path(dirName);
		filePath = filePath.addTrailingSeparator();
		return filePath.toOSString() + fileName;
	}
	
	private static int RunCommand(String command, boolean verbose, String prefix){
		
		String s = null;
		int code = 0;
		
		// specify a default prefix if none is specified
		if (prefix.compareTo("")==0){
			prefix = "CMD";
		}
		
        try {

        	// Compose the shell and command execution array
        	String runnableCommandArray[] = {"/bin/bash", "-c", command };           	

        	if(verbose)
        	{
        		System.out.println("<"+prefix+"> : "+command);
        	}
        	
        	// Execute the command
        	Process p = Runtime.getRuntime().exec(runnableCommandArray);

        	BufferedReader cmd_stdOut = new BufferedReader(new InputStreamReader(p.getInputStream()));
        	BufferedReader cmd_stdErr = new BufferedReader(new InputStreamReader(p.getErrorStream()));

        	if(verbose)
        	{
        		while ((s = cmd_stdOut.readLine()) != null) {
        			System.out.println("("+prefix+") : "+s);
        		}
        		while ((s = cmd_stdErr.readLine()) != null) {
        			System.err.println("("+prefix+") : "+s);
        		}
        	}

        	// Wait until the process is completed (required if verbose is false)
        	code = p.waitFor();
        		
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        return code;
	}
	
	private static int RunInteractiveCommand(String command, boolean verbose, String prefix){

		String s = null;
		int code = -1;

		// specify a default prefix if none is specified
		if (prefix.compareTo("")==0){
			prefix = "iCMD";
		}

		try {
			// Compose the shell and command execution array
			String runnableCommandArray[] = {"/bin/bash", "-c", command };           	

			if(verbose)
			{
				System.out.print("["+prefix+"] : "+command);
			}

			// Execute the command
			Process p = Runtime.getRuntime().exec(runnableCommandArray);

			BufferedReader cmd_stdOut = new BufferedReader(new InputStreamReader(p.getInputStream()));
			BufferedReader cmd_stdErr = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			BufferedWriter cmd_stdIn  = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
			BufferedReader usr_stdIn  = new BufferedReader(new InputStreamReader(System.in));

			boolean running = true;
			boolean dirty = true;
			while (running){
				try{
					// Check if data is available at the process Output
					while (cmd_stdOut.ready()){
						s = cmd_stdOut.readLine();
						System.out.println("");
						System.out.print(" "+prefix+"> : "+s);
						dirty = true;
					}
					// Check if data is available at the process Error
					while (cmd_stdErr.ready()){
						s = cmd_stdErr.readLine();
						System.err.println("");
						System.err.print(" "+prefix+"> : "+s);
						dirty = true;
					}
					
					// Add the user prompt
					if(dirty && verbose)
					{
						System.out.println("");
						System.out.print(" "+prefix+"< :");
						dirty = false;
					}
					
					// Check if data is available at the user input
					while (usr_stdIn.ready()){
						s = usr_stdIn.readLine();
						if(verbose){
							System.out.println("");
							System.out.print(" "+prefix+"< : "+s);
						}
						cmd_stdIn.write(s);
						cmd_stdIn.newLine();
						cmd_stdIn.flush();
					}
					// Get the process error code, Throw exception if still running.
					code = p.exitValue();
					//System.err.print("Exit code: "+code);
					
					// Operation completed - end the process
					running = false;
					
					// Fix the prompt
					System.out.println("");

				}
				catch(IOException e) {
					System.out.println("IO Exception");
					e.printStackTrace();
				}
				catch(IllegalThreadStateException e) {
					// Process has not completed its task
					//System.err.print(".");
					Time.sleep(100);
				}
			} // While running loop		
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		return code;
	}
	
	public static int RunCommand(String command, boolean verbose){
		// Simply call the RunCommand with the "CMD" prefix
		return RunCommand(command, verbose,"CMD");
	}
	
	public static int RunSudoCommand(String command,String password, boolean verbose){
		
        File passwordFile = null;
        int code = 0;
        
        try {
            
        	// Generate a password temporary file
        	passwordFile = File.createTempFile("passtemp", ".txt");
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(passwordFile)));
            out.print(password);
            out.close();
        	
            // Create the command string  
            String sudoCommand = "sudo -S " + command + " < " + passwordFile.getPath();
                   	
            // Execute the command
            code = RunCommand(sudoCommand, verbose, "SUDO");
        	        	
            // Delete the password generated file
        	passwordFile.delete();
        }
        catch (IOException e) {
            //System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
        }
        
    	return code;
	}   
	
	public static int RunSshCommand(String user, String host, String command, boolean verbose){

        int code = 0;

        // Create the command string  
        String sshCommand = "ssh -X -n "+user+"@"+host+ " " + command;
        //String sshCommand = "ssh "+user+"@"+host+ " " + command;
        //String sshCommand = "octave";
        
        // Execute the command
        code = RunInteractiveCommand(sshCommand, verbose, "SSH");
        
    	return code;
	}
	public static int RunScpToCommand(String user, String host, String sourcePath, String destinationPath, boolean verbose){

        int code = 0;

        // Create the command string  
        String scpCommand = "scp "+ sourcePath + " " +user+"@"+host+ ":" + destinationPath;
        
        // Execute the command
        code = RunInteractiveCommand(scpCommand, verbose, "SCP");
        
    	return code;
	}
	
	public static int RunScpFromCommand(String user, String host, String sourcePath, String destinationPath, boolean verbose){

        int code = 0;

        // Create the command string  
        String scpCommand = "scp "+ user+"@"+host+ ":" +sourcePath + " " + destinationPath;
        
        // Execute the command
        code = RunInteractiveCommand(scpCommand, verbose, "SCP");
        
    	return code;
	}
	
	public static String createTestFolder(String testName){
				
		String workingDirectory = System.getProperties().getProperty("user.home")
		+ File.separator + "data"
		+ File.separator + Time.GetCurrentDateFormated("yyyy")
		+ File.separator + testName
		+ File.separator + "exp_" + Time.GetCurrentDateFormated("yyyyMMMdd_HH'h'mm'm'")
		+ File.separator;
		System.out.println("Working directory is :" + workingDirectory);

		// Create Directory
		if(IO.createPath(workingDirectory)){
			return workingDirectory;
		}
		else{
			return System.getProperties().getProperty("user.home");
		}
	}
	
	/**
	 * 
	 * getFNameNoExt:
	 *
	 * got it from :http://mindprod.com/jgloss/file.html#MANIPULATING
	 * 
	 * @param fname
	 * @return
	 *
	 */
	public static String getFNameNoExt(String fname) {
//		 getting the extension of a filename, (plain or including dirname)
//		 This code is much faster than any regex technique.

//		 filename without the extension
		String choppedFilename;

//		 extension without the dot
		@SuppressWarnings("unused")
		String ext;

//		 where the last dot is. There may be more than one.
		int dotPlace = fname.lastIndexOf ( '.' );

		if ( dotPlace >= 0 ) {
		   // possibly empty
		   choppedFilename = fname.substring( 0, dotPlace );

		   // possibly empty
		   ext = fname.substring( dotPlace + 1 );
		   }
		else
		   {
		   // was no extension
		   choppedFilename = fname;
		   ext = "";
		   }
		return (choppedFilename);
	}
	
	/**
	 * 
	 * getFileGUI: returns a file that is selected via a gui
	 *
	 * @param workingDirectory The starting directory for the gui
	 * @return the file or null
	 *
	 */
	public static File getFileGUI(String title, String workingDirectory) {
		
		JFileChooser fc = new JFileChooser();
        fc.setDialogType(JFileChooser.OPEN_DIALOG); // pas essentiel
        fc.setDialogTitle(title);
        fc.setCurrentDirectory(new File(workingDirectory));
                
        int returnVal = fc.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) { //si bouton "Open"
            File sourceFile = fc.getSelectedFile();
            System.out.println("getAbsolutePath: "+sourceFile.getAbsolutePath());
            return(sourceFile);
        }
        return(null);
	}

	public static void printPolygon(CartesianPolygon polygon, String prefix) {
		System.out.println(prefix);
		printCoordinates(polygon.getVertices().get(0),"v0 :"); System.out.println();
		printCoordinates(polygon.getVertices().get(1),"v1 :"); System.out.println();
		printCoordinates(polygon.getVertices().get(2),"v2 :"); System.out.println();

		
	}
}