package FroggerPkg;

import javax.swing.*;

/**
 * Created by JenniferBalling on 4/3/14.
 */
//Holds multiple cars
//Holds multiple types of cars
//Repeats
//Sets car locations
//Sets lane speed
//image

//texture
public class Lane {

    ImageIcon laneImg;
    Vehicle carOne;
    Vehicle carTwo;
    Vehicle carThree;
    Vehicle carFour;
    Vehicle carFive;

    public Lane(){
    }

    public Lane(ImageIcon laneImg, Vehicle carOne, Vehicle carTwo, Vehicle carThree, Vehicle carFour, Vehicle carFive){
        this.laneImg = laneImg;
        this.carOne = carOne;
        this.carTwo = carTwo;
        this.carThree = carThree;
        this.carFour = carFour;
        this.carFive = carFive;
    }

    public ImageIcon getLaneImg() {
        return laneImg;
    }

    public void setLaneImg(ImageIcon laneImg) {
        this.laneImg = laneImg;
    }

    public Vehicle getCarOne() {
        return carOne;
    }

    public void setCarOne(Vehicle carOne) {
        this.carOne = carOne;
    }

    public Vehicle getCarTwo() {
        return carTwo;
    }

    public void setCarTwo(Vehicle carTwo) {
        this.carTwo = carTwo;
    }

    public Vehicle getCarThree() {
        return carThree;
    }

    public void setCarThree(Vehicle carThree) {
        this.carThree = carThree;
    }

    public Vehicle getCarFour() {
        return carFour;
    }

    public void setCarFour(Vehicle carFour) {
        this.carFour = carFour;
    }

    public Vehicle getCarFive() {
        return carFive;
    }

    public void setCarFive(Vehicle carFive) {
        this.carFive = carFive;
    }
}
