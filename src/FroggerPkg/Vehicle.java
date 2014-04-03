package FroggerPkg;

import javax.swing.*;

/**
 * Created by JenniferBalling on 4/3/14.
 */
//car type
//image
//location

public class Vehicle {

    String type;
    ImageIcon vehicleImg;
    String vehicleLoc;

    public Vehicle(){
    }

    public String getType() {
        return type;
    }

    public ImageIcon getVehicleImg() {
        return vehicleImg;
    }

    public void setVehicleImg(ImageIcon vehicleImg) {
        this.vehicleImg = vehicleImg;
    }

    public String getVehicleLoc() {
        return vehicleLoc;
    }

    public void setVehicleLoc(String vehicleLoc) {
        this.vehicleLoc = vehicleLoc;
    }

    public Vehicle (String type, ImageIcon vehicleImg, String vehicleLoc){
        this.type=type;
        this.vehicleImg=vehicleImg;
        this.vehicleLoc= vehicleLoc;
    }
}
