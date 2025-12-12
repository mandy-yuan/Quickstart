package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.pedropathing.util.Timer;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import com.qualcomm.robotcore.hardware.Servo;
import com.sun.tools.javac.tree.DCTree;

public class SpindexerSubsystem {
    private final CRServo spindexerServo;
    Timer timer = new Timer();

    private int intakeState;
    private double offset = 0.1;

    public SpindexerSubsystem(CRServo spindexerServo) {
        this.spindexerServo = spindexerServo;
        intakeState = 0;
    }

    public void rotateSpindexerIntake() {

        /*spindexerServo.setPower(0.6);
        timer.resetTimer();
        while (timer.s) {

        }
        spindexerServo.setPower(0.5);*/

    }

    /*public void rotateSpindexerShooter() {
        switch (intakeState) {
            case 0:
                spindexerServo.(0.15);
                intakeState = (intakeState + 1) % 3;
                break;
            case 1:
                spindexerServo.setPosition(0.51 + offset);
                intakeState = (intakeState + 1) % 3;
                break;
            case 2:
                spindexerServo.setPosition(0.87 + offset);
                intakeState = (intakeState + 1) % 3;
                break;
        }
    }*/
}
