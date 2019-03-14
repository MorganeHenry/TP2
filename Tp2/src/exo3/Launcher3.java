package exo3;


import exo1.ExampleJFrame;

import javax.swing.SwingUtilities;


public class Launcher3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                BoutonsListeners exampleJFrame = new BoutonsListeners();
                exampleJFrame.setVisible(true);
            }

        });
    }
}
