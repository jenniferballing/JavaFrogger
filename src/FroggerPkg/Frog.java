package FroggerPkg;

import javax.swing.*;

/**
 * Created by JenniferBalling on 4/3/14.
 */
//images
//collision detection
//movement and keylistener
//location setting and getting

//Changing images
//Hopping animation
public class Frog {

    ImageIcon frogImg;
    Boolean collision;
    String frogLoc;
    JPanel frogPanel;

    public Frog(){}

    public Frog(ImageIcon frogImg, Boolean collision, String frogLoc, JPanel frogPanel){
        this.frogImg= frogImg;
        this.collision= collision;
        this.frogLoc= frogLoc;
        this.frogPanel= frogPanel;
    }

    public ImageIcon getFrogImg() {
        return frogImg;
    }

    public void setFrogImg(ImageIcon frogImg) {
        this.frogImg = frogImg;
    }

    public Boolean getCollision() {
        return collision;
    }

    public void setCollision(Boolean collision) {
        this.collision = collision;
    }

    public String getFrogLoc() {
        return frogLoc;
    }

    public void setFrogLoc(String frogLoc) {
        this.frogLoc = frogLoc;
    }

    public JPanel getFrogPanel() {
        return frogPanel;
    }

    public void setFrogPanel(JPanel frogPanel) {
        this.frogPanel = frogPanel;
    }

}


