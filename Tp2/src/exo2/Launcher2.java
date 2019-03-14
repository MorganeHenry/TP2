package exo2;


import exo1.ExampleJFrame;

import javax.swing.SwingUtilities;


public class Launcher2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                DecouverteNouveauxComposants exampleJFrame = new DecouverteNouveauxComposants();
                exampleJFrame.setVisible(true);
            }

        });
    }
}
