/*
 * Apogy Rover Example Program
 *
 * This JavaScript program shows how
 *   - to get attributes and execute operations on a rover and its subsystems
 *   - to add JSDoc for type inference
 *    
 * JSDoc: JSDT supports a subset of JSDoc ( http://usejsdoc.org )
 */

function degreeToRadian(degree) {
	return degree * (Math.PI / 180);
};

/**
 * @param {ca.gc.asc_csa.apogy.examples.rover.Rover}
 *            rover
 * @return {ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm}
 */
function getRoboticArm(rover) {
	return rover.roboticArm;
}

/**
 * 
 * This is the entry point of the program. The arguments are passed in the same
 * order as they are in the Apogy Session.
 * 
 * @param {ca.gc.asc_csa.apogy.examples.rover.Rover}
 *            rover
 * @variable rover rover
 */
function main(rover) {
	// Invoke "init" on rover. All operations are invoked through the facade
	rover.init();

	// Invoke "cmdLinearVelocity"
	rover.cmdLinearVelocity(0.1);

	// Get the subsystem roboticArm and set it to the "roboticArm" variable
	var roboticArm = getRoboticArm(rover);

	// Invoke "moveTo" on the "roboticArm".
	// Get the turretAngle, shoulderAngle, elbowAngle and wristAngle attributes
	roboticArm.moveTo(degreeToRadian(roboticArm.turretAngle + 1),
			degreeToRadian(roboticArm.shoulderAngle),
			degreeToRadian(roboticArm.elbowAngle),
			degreeToRadian(roboticArm.wristAngle));

	roboticArm.moveTo(degreeToRadian(roboticArm.turretAngle - 1),
			degreeToRadian(roboticArm.shoulderAngle),
			degreeToRadian(roboticArm.elbowAngle),
			degreeToRadian(roboticArm.wristAngle));

	// Get the position of the mobilePlatform and print it
	var position = rover.mobilePlatform.position;
	java.lang.System.out.println("x = " + position.x + ", y = " + position.y);

	// Take a snapshot with the centerCamera and get the image
	var image = rover.centerCamera.takeSnapshot().image;
	java.lang.System.out.println("width = " + image.width + "; height = "
			+ image.height);
}
