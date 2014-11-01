
package game.engine;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Tom
 */
public class RenderPanel extends JPanel {

    
    
    public RenderPanel(){
        super();
        
    }
    
    
    @Override
    public void paintComponent(Graphics g){
        g.fillRect(0, 0, 100, 100);
        
    }
    
}
