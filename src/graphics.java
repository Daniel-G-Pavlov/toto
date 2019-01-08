package com.midgardabc.toto;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.*;
import java.awt.geom.Line2D;

public class graphics extends JPanel{



        public graphics () {

        JFrame Frame = new JFrame("T O T O");
        Frame.setLocation(920,180);
        Frame.setMinimumSize(new Dimension (600,400));
        Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Frame.getContentPane().add(this);

        Frame.pack();

        Frame.setVisible(true);

        repaint();

        }

        @Override
        protected void paintComponent(Graphics g) {
                int x = 1;
                int y = 36;
                for (int i = 0; i <= 6 ; i++) {
                        for (int j = 0; j <= 6 ; j++) {
                                x += 35;
                                g.setColor(Color.red);
                                g.fillRect(x,y,30,30);
                        }       y += 35;
                        x = 1;
                }
                        x = 1;
                for (int i = 0; i < 6 ; i++) {
                        x += 35 ;
                        g.setColor(Color.yellow);
                        g.fillRect(x,300,30,30);
                }

                g.setColor(Color.blue);
                g.fillRect(300,36,60,300);

                int x1 = 346;
                int y1 = 106;
                for (int i = 0; i <= 5 ; i++) {
                        for (int j = 0; j <= 2 ; j++) {
                                x1 += 65;
                                g.setColor(Color.green);
                                g.fillRect(x1,y1,30,30);
                        }       y1 += 35;
                        x1 = 346;
                }

                x = 1;
                for (int i = 0; i < 6 ; i++) {
                        x += 35 ;
                        g.setColor(Color.yellow);
                        g.fillRect(x,300,30,30);
                }

                g.setColor(Color.yellow);
                g.fillRect(30,30,30,30);


        }






        public static void main(String[] args) {
                new graphics();




    }
}
