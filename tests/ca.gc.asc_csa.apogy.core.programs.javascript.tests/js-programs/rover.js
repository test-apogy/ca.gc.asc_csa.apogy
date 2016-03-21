/*
 * Apogy Rover Example Program
 *
 *  This JavaScript program shows how to get attributes and execute operations on a rover and its subsystems.
 *  The "rover" variable is injected as a global variable.
 */

function degreeToRadian(degree) {
	return degree * (Math.PI / 180);
};

function main() {
	// Invoke "init" on rover. All operations are invoked through the facade
	rover.init();

	// Invoke "cmdLinearVelocity"
	rover.cmdLinearVelocity(0.1);

	// Get the subsystem roboticArm and set it to the "roboticArm" variable
	var roboticArm = rover.roboticArm;
	
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

main();
