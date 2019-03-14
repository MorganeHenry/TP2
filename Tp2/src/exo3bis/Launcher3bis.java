package exo3bis;


import exo1.ExampleJFrame;

import javax.swing.SwingUtilities;


public class Launcher3bis {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                BoutonsActions exampleJFrame = new BoutonsActions();
                exampleJFrame.setVisible(true);
            }

        });
    }
}
