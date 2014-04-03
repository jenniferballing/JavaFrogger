package FroggerPkg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by JenniferBalling on 4/2/14.
 */

/**
 * Created by JenniferBalling on 4/2/14.
 */
public class Animate{

}
/*public class Motion {
    public static class Animate {
        public static final int RUN_TIME = 2000;
        protected JPanel panel;
        protected Vehicle start;
        protected Vehicle finish;

        protected long startTime;

        public Animate(JPanel panel, Vehicle start, Vehicle finish){
            this.panel= panel;
            this.start= start;
            this.finish= finish;
        }

        public void start(){
            Timer timer = new Timer(40, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    long duration = System.currentTimeMillis() - startTime;
                    double progress = (double)duration / (double) RUN_TIME;
                    if(progress > 1f){
                        progress = 1f;
                        ((Timer)e.getSource()).stop();
                    }
                    //Vehicle target =
                }
            });
            timer.setRepeats(true);
            timer.setCoalesce(true);
            timer.setInitialDelay(0);
            startTime = System.currentTimeMillis();
            timer.start();
        }
    }
    public static Vehicle calculateProgress (Vehicle start, Vehicle finish, double progress ){

        Vehicle checkLocation = new Vehicle();

        if(start!=null && finish!=null){
            checkLocation.setVehicleLoc(calculateProgress(start.getVehicleLoc(), finish.getVehicleLoc(), progress));
        }
        return checkLocation;
    }
    public static Point calculateProgress(Point startPoint, Point finishPoint, double progress){
        Point point= new Point();

        if(startPoint != null && finishPoint != null){

            point.x = calculateProgress(startPoint.x, finishPoint.x, progress);

        }

    }
}*/
//Where the images are initialized:

    /*public class Animation {


        GameLogic game;


        public Animation() {

            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    try {
                        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    }


                    game.lanePanel.add(new MovePane());
                    game.lanePanel.setVisible(true);
                    game.lanePanel.revalidate();
                    game.lanePanel.repaint();
                    /*game.frame.setLayout(new BorderLayout());
                    game.frame.add(new MovePane());
                    game.frame.pack();
                    game.frame.setLocationRelativeTo(null);
                    game.frame.setVisible(true);*/
//game.MainPanel.add(new MovePane());
               /* }
            });
        }

        public class MovePane extends JPanel {

            private JPanel panel;

            public MovePane() {
                setLayout(null);
                panel = new JPanel();
                panel.setBackground(Color.RED);
                add(panel);
                Dimension size = getPreferredSize();

                Rectangle from = new Rectangle(size.width, (size.height - 50) / 2, 50, 50);
                Rectangle to = new Rectangle((size.width - 50) / 2, (size.height - 50) / 2, 50, 50);

                Animate animate = new Animate(panel, from, to);
                animate.start();

            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(200, 200);
            }

        }

        public static class Animate {

            public static final int RUN_TIME = 2000;

            private JPanel panel;
            private Rectangle from;
            private Rectangle to;

            private long startTime;

            public Animate(JPanel panel, Rectangle from, Rectangle to) {
                this.panel = panel;
                this.from = from;
                this.to = to;
            }

            public void start() {
                Timer timer = new Timer(40, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        long duration = System.currentTimeMillis() - startTime;
                        double progress = (double)duration / (double)RUN_TIME;
                        if (progress > 1f) {
                            progress = 1f;
                            ((Timer)e.getSource()).stop();
                        }
                        Rectangle target = calculateProgress(from, to, progress);
                        panel.setBounds(target);
                    }
                });
                timer.setRepeats(true);
                timer.setCoalesce(true);
                timer.setInitialDelay(0);
                startTime = System.currentTimeMillis();
                timer.start();
            }

        }

        public static Rectangle calculateProgress(Rectangle startBounds, Rectangle targetBounds, double progress) {

            Rectangle bounds = new Rectangle();

            if (startBounds != null && targetBounds != null) {

                bounds.setLocation(calculateProgress(startBounds.getLocation(), targetBounds.getLocation(), progress));
                bounds.setSize(calculateProgress(startBounds.getSize(), targetBounds.getSize(), progress));

            }

            return bounds;

        }

        public static Point calculateProgress(Point startPoint, Point targetPoint, double progress) {

            Point point = new Point();

            if (startPoint != null && targetPoint != null) {

                point.x = calculateProgress(startPoint.x, targetPoint.x, progress);
                point.y = calculateProgress(startPoint.y, targetPoint.y, progress);

            }

            return point;

        }

        public static int calculateProgress(int startValue, int endValue, double fraction) {

            int value = 0;
            int distance = endValue - startValue;
            value = (int)Math.round((double)distance * fraction);
            value += startValue;

            return value;

        }

        public static Dimension calculateProgress(Dimension startSize, Dimension targetSize, double progress) {

            Dimension size = new Dimension();

            if (startSize != null && targetSize != null) {

                size.width = calculateProgress(startSize.width, targetSize.width, progress);
                size.height = calculateProgress(startSize.height, targetSize.height, progress);

            }

            return size;

        }
    }*/


