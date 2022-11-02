package org.firstinspires.ftc.tzeamcode;

//import classes for objects;
import com.qualcomm.robotcore.eventloop.opmode.*;

import org.firstinspires.ftc.teamcode.Call_Upon_Classes.*;

@TeleOp
public class TeleOp_14954 extends LinearOpMode {
//objects for each function of the robot
private final org.firstinspires.ftc.teamcode.Call_Upon_Classes.Mecanum_Methods_TeleOp drivingMotors = new Mecanum_Methods_TeleOp(false);
private final org.firstinspires.ftc.teamcode.Call_Upon_Classes.Lift_14954 lift = new Lift_14954();
private final org.firstinspires.ftc.teamcode.Call_Upon_Classes.Intake_14954 intake = new Intake_14954();


public void runOpMode() throws InterruptedException {
    //Initialize objects
    drivingMotors.init_drive_motors(hardwareMap);
    lift.init_lift(hardwareMap, "lift");
    intake.init_intake(hardwareMap, "intake");

    waitForStart();

    while (opModeIsActive()) {
        //Driver 1 Functions
        drivingMotors.run_drive_motors_14(gamepad1, telemetry); //driving

        //Driver 2 Functions
        lift.runlift2(gamepad1, telemetry);
        intake.run_intake(gamepad2, telemetry);
        telemetry.update();
        }
    }
}
