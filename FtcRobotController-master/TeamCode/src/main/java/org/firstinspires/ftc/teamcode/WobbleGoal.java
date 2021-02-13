package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

public class WobbleGoal {
    // Set up Hardware Devices
        /* Motors */
    DcMotor linSlide;
    double slidePower = 1.0;
        /*Servos*/
    Servo claw;
    /*** CLAW Positions ***/
    int neutral = 0;
    int grab = 0.5;
    int store = 1;

    //Constructors
    public WobbleGoal(DcMotor linearSlide, CRServo servo){
        linSlide = linearSlide;
        intake = claw;
    }
    //Methods
    /***SERVO METHODS***/

    public void setClaw(int pos) {
        this.claw.setPosition(pos);
    }

    public void storeClaw(){
        this.setClaw(store);
    }
    public void activateClaw() {
        this.setClaw(grab);
    }
    public void neturalClaw(){
        this.setClaw(neutral);
    }
    public void zeroPosition(){
        this.setClaw(0);
    }
    /*** LINEAR SLIDE METHODS ***/
    public void raiseWobbleGoal(){
        linSlide.setPower(slidePower);
    }
    public void lowerWobbleGoal(){
        linSlide.setPower(-1*slidePower);
    }
    public void stopGoal(){ linSlide.setPower(0);}
    public void deliverWobbleGoal(){
        //lower linear slide  timed??
        //move claw to its stored position
    }
}