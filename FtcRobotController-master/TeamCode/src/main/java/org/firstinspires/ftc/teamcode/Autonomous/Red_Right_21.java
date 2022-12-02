package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous
public class Red_Right_21 extends  org.firstinspires.ftc.teamcode.Autonomous.Auto_Base_21 {

    public void runOpMode() throws InterruptedException {
        init_classes(true);
        waitForStart();
        //one tile is 24 in
        //Start
        //run lift up so camera can see
        lift.run_lift_21945_auto(telemetry,  0.5);
        simpleWait(100);
        //Scan the cone
        camera.init_camera(hardwareMap, "webcam", telemetry);
        zone = camera.zone();
        //move forward until the seam is under center of bot
        auto_motors.goToSpot(15, 0.5);
        while (auto_motors.isBusy()) {
        }
        lift.run_lift_21945_auto(telemetry,  0);
        simpleWait(1000);
        if (placeCone) {
            //4-bar to top
            lift.run_lift_21945_auto(telemetry, 1);
            simpleWait(1000);
            //turntable 90 degrees to the left
            turntable.run_turntable_21945_auto(telemetry, 0);
            simpleWait(1000);
            //intake drop cone
            intake.run_intake_21945_auto(telemetry, 1);
            simpleWait(1000);
            intake.run_intake_21945_auto(telemetry, 0);
            //turntable back to the middle (right 90 degrees)
            turntable.run_turntable_21945_auto(telemetry, 0.5);
            simpleWait(1000);
            //4-bar down to drive
            lift.run_lift_21945_auto(telemetry, 0);
            simpleWait(1000);
        }
        //drive forward to middle
        auto_motors.goToSpot(10, 0.5);
        while (auto_motors.isBusy()){
        }
        //SPLIT TO PARK
        //LEFT (1)
        if (zone == 1) {
            auto_motors.strafeLeft(0.5, 24);
            //stop
        }
        //Middle (2)
        else if (zone == 2){
            //stop
        }
        //Right
        else if (zone == 3) {
            auto_motors.strafeRight(0.5, 24);
            //stop
        }
    }
}