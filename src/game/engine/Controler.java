
package game.engine;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Tom
 */
public class Controler {
    private final int WIDTH = 300;
    private final int HEIGHT = (WIDTH/16)*9;
    private final int SCALE = 3;
    
    JFrame frame;
    RenderPanel panel;
    
    private boolean running = true;
    
    public void start(){
        frame = new JFrame("A VERY VERY GOOD GAME");
        panel = new RenderPanel();
        panel.setPreferredSize(new Dimension(WIDTH*3,HEIGHT*3));
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        while(running){
            panel.repaint();
            
            
        }
        
        
    }
}
