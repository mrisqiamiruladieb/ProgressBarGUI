package progressbargui;

import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {
    
    //declare
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();
    
    //construct
    ProgressBarDemo() {
        
        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        
        frame.add(bar);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
