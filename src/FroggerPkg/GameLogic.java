package FroggerPkg;

import javax.swing.*;
import java.awt.*;

/**
 * Created by JenniferBalling on 4/3/14.
 */
//Create the frame
//Hold the listeners
//Game logic for collision bool


//Music
public class GameLogic extends JFrame {

    public JPanel titlePanel, MainPanel, greenPanel, lanePanel, safetyPanel, startingPanel, dottedPanel, laneOne, laneTwo, laneThree, lane1Car1, lane1Car2, lane1Car3, lane1Car4, lane1Car5, lane2Car1, lane2Car2, lane2Car3, lane2Car4, lane2Car5, lane3Car1, lane3Car2, lane3Car3, lane3Car4, lane3Car5;
    //protected JFrame frame;
    protected JLabel title;
    protected Frog frogPlayer;

    private int Width=650, Length = 700;

    public GameLogic(){

        Initialization();
        GameSetup();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(700, 700);
        pack();
        setVisible(true);
    }
    public void Initialization(){
        MainPanel = new JPanel();
        titlePanel = new JPanel();

        //frame =  new JFrame();

        frogPlayer= new Frog();
        frogPlayer.frogPanel = new JPanel();

        dottedPanel = new JPanel();
        safetyPanel = new JPanel();
        startingPanel = new JPanel();
        lanePanel =  new JPanel();
        greenPanel= new JPanel();

        laneOne = new JPanel();
        laneTwo = new JPanel();
        laneThree = new JPanel();

        lane1Car1 = new JPanel();
        lane1Car2 = new JPanel();
        lane1Car3 = new JPanel();
        lane1Car4 = new JPanel();
        lane1Car5 = new JPanel();

        lane2Car1 = new JPanel();
        lane2Car2 = new JPanel();
        lane2Car3 = new JPanel();
        lane2Car4 = new JPanel();
        lane2Car5 = new JPanel();

        lane3Car1 = new JPanel();
        lane3Car2 = new JPanel();
        lane3Car3 = new JPanel();
        lane3Car4 = new JPanel();
        lane3Car5 = new JPanel();

        title = new JLabel("Frogger");
    }
    public void GameSetup(){

        frogPlayer.frogPanel.setBackground(Color.green);
        frogPlayer.frogPanel.setPreferredSize(new Dimension(100, 100));
        //Add frogger Icon to panel

        lane1Car1.setBackground(Color.BLACK);
        lane1Car1.setLayout(new FlowLayout(FlowLayout.CENTER));
        //Animate animate = new Animate(lane1Car1, start, finish)
        //Add motion and speed

        lane1Car2.setBackground(Color.BLACK);
        lane1Car2.setLayout(new FlowLayout(FlowLayout.CENTER));
        //Add motion and speed

        lane1Car3.setBackground(Color.BLACK);
        lane1Car3.setLayout(new FlowLayout(FlowLayout.CENTER));
        //Add motion and speed

        lane1Car4.setBackground(Color.BLACK);
        lane1Car4.setLayout(new FlowLayout(FlowLayout.CENTER));
        //Add motion and speed

        lane1Car5.setBackground(Color.BLACK);
        lane1Car5.setLayout(new FlowLayout(FlowLayout.CENTER));
        //Add motion and speed

        lane2Car1.setBackground(Color.BLACK);
        lane2Car1.setLayout(new FlowLayout(FlowLayout.CENTER));
        //Add motion and speed

        lane2Car2.setBackground(Color.BLACK);
        lane2Car2.setLayout(new FlowLayout(FlowLayout.CENTER));
        //Add motion and speed

        lane2Car3.setBackground(Color.BLACK);
        lane2Car3.setLayout(new FlowLayout(FlowLayout.CENTER));
        //Add motion and speed

        lane2Car4.setBackground(Color.BLACK);
        lane2Car4.setLayout(new FlowLayout(FlowLayout.CENTER));
        //Add motion and speed

        lane2Car5.setBackground(Color.BLACK);
        lane2Car5.setLayout(new FlowLayout(FlowLayout.CENTER));
        //Add motion and speed

        lane3Car1.setBackground(Color.BLACK);
        lane3Car1.setLayout(new FlowLayout(FlowLayout.CENTER));
        //Add motion and speed

        lane3Car2.setBackground(Color.BLACK);
        lane3Car2.setLayout(new FlowLayout(FlowLayout.CENTER));
        //Add motion and speed

        lane3Car3.setBackground(Color.BLACK);
        lane3Car3.setLayout(new FlowLayout(FlowLayout.CENTER));
        //Add motion and speed

        lane3Car4.setBackground(Color.BLACK);
        lane3Car4.setLayout(new FlowLayout(FlowLayout.CENTER));
        //Add motion and speed

        lane3Car5.setBackground(Color.BLACK);
        lane3Car5.setLayout(new FlowLayout(FlowLayout.CENTER));
        //Add motion and speed

        laneOne.setPreferredSize(new Dimension(500, 105));
        laneOne.setLayout(new FlowLayout(FlowLayout.CENTER));
        laneOne.setBackground(Color.darkGray);
        laneOne.add(lane1Car1);
        laneOne.add(lane1Car2);
        laneOne.add(lane1Car3);
        laneOne.add(lane1Car4);
        laneOne.add(lane1Car5);


        laneTwo.setPreferredSize(new Dimension(500, 105));
        laneTwo.setLayout(new FlowLayout(FlowLayout.CENTER));
        laneTwo.setBackground(Color.darkGray);
        laneTwo.add(lane2Car1);
        laneTwo.add(lane2Car2);
        laneTwo.add(lane2Car3);
        laneTwo.add(lane2Car4);
        laneTwo.add(lane2Car5);


        laneThree.setPreferredSize(new Dimension(500, 105));
        laneThree.setLayout(new FlowLayout(FlowLayout.CENTER));
        laneThree.setBackground(Color.darkGray);
        laneThree.add(lane3Car1);
        laneThree.add(lane3Car2);
        laneThree.add(lane3Car3);
        laneThree.add(lane3Car4);
        laneThree.add(lane3Car5);

        title.setLayout(new FlowLayout(FlowLayout.CENTER));
        title.setFont(title.getFont().deriveFont(30f));
        title.setForeground(Color.WHITE);

        titlePanel.setBackground(Color.blue);
        titlePanel.setPreferredSize(new Dimension(500, 70));
        titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        titlePanel.add(title);

        startingPanel.setBackground(Color.GREEN);
        startingPanel.setPreferredSize(new Dimension(500, 70));

        safetyPanel.setBackground(Color.green);
        safetyPanel.setPreferredSize(new Dimension(500, 70));

        lanePanel.setPreferredSize(new Dimension(500, 335));
        lanePanel.setBackground(Color.lightGray);
        lanePanel.add(laneOne);
        lanePanel.add(laneTwo);
        lanePanel.add(laneThree);

        greenPanel.setBackground(Color.green);
        greenPanel.setPreferredSize(new Dimension(500, 500));

        greenPanel.add(safetyPanel);
        greenPanel.add(lanePanel);
        greenPanel.add(startingPanel);

        //dottedPanel.setPreferredSize(new Dimension(25, 5));
        //dottedPanel.setBackground(Color.yellow);

        MainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        MainPanel.setBackground(Color.blue);
        MainPanel.setPreferredSize(new Dimension(Width, Length));
        MainPanel.add(titlePanel);
        MainPanel.add(greenPanel);

        add(MainPanel, BorderLayout.CENTER);

        //MainPanel.update(this.getGraphics());
        MainPanel.revalidate();
        MainPanel.repaint();
    }
}
