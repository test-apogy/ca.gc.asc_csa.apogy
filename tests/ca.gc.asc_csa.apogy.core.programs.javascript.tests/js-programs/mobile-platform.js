/**
 * Mobile Platform Example Program
 * 
 * This JavaScript program shows how to get attributes and execute operations on
 * a mobile platform and its subsystems. The "mobilePlatform" variable is
 * injected as a global variable.
 *
 * @variable mobilePlatform mobilePlatform
 */

function main(mobilePlatform) {
	// Initialize the mobile platform. All operations are invoked through the
	// facade.
	mobilePlatform.init();

	// Set the linear velocity
	mobilePlatform.cmdLinearVelocity(0.4);

	// Move to a position
	mobilePlatform.moveTo(1, 2);

	// Get the position
	var position = mobilePlatform.position;

	// Print the position
	java.lang.System.out.println("Position: " + position.x + ", " + position.y
			+ ", " + position.theta);
}
