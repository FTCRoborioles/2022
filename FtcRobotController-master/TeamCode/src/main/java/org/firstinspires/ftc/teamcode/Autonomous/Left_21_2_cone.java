package org.firstinspires.ftc.teamcode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous
//


// @Disabled
public class Left_21_2_cone extends  Auto_Base_21 {
    public void runOpMode() throws InterruptedException {
        init_classes(false);
        waitForStart();
        //one tile is 24 in
        //START
        //Scan cone
        lift.run_lift_21945_auto(telemetry, 0.5, 0);
        simpleWait(1000);
        camera.init_camera(hardwareMap, "webcam", telemetry);
        zone = camera.zone();
        lift.run_lift_21945_auto(telemetry, 0, 0);
        simpleWait(1000);
        //GO FOR CONE PLACE
        //push signal cone out of the way then come back
        auto_motors.goToSpot(43, 0.5);
        simpleWait(5000);
        auto_motors.goToSpot(-14, 0.5);
        simpleWait(2000);
        //Move in front of the junction
        auto_motors.strafeRight(0.4, 12.);
        simpleWait(1500);
        //lift up
        lift.run_lift_21945_auto(telemetry, 0.9, 1990);
        simpleWait(3000);
        //move over junction
        auto_motors.goToSpot(1, 0.2);
        simpleWait(1500);
        //release cone
        intake.run_intake_21945_auto(telemetry, -1);
        simpleWait(1500);
        intake.run_intake_21945_auto(telemetry,0);
        //back up and lift down
        auto_motors.goToSpot(-5, 0.2);
        simpleWait(1000);
        lift.run_lift_21945_auto(telemetry, 0, 0);
        simpleWait(1500);
        //back to middle of 2 tile
        auto_motors.strafeLeft(0.5, 12);
        simpleWait(1500);



        //park
        parking21();



    }
}
