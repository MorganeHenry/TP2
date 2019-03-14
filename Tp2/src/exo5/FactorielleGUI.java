package exo5;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class FactorielleGUI extends JFrame {

    public FactorielleGUI()
    {
        super();
        build();
    }

    void build()
    {
        setTitle("Convert Celsius Fahrenhiet");
        setPreferredSize(new Dimension(300, 100));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(buildContentPane());
    }


    Container buildContentPane()
    {
        // pour la saisie del’entier n
        final JTextField textField;

        // pour l’affichage du résultat n!
        final JButton resultat;
        final JLabel label;

        // pour la saisie del’entier n
        textField = new JTextField(4);

        // pour l’affichage du résultat n!
        resultat = new JButton("Convert ");
        label = new JLabel();

        this.setLayout(new FlowLayout());
        this.add(textField );
        this.add(resultat);
        this.add(label);

        resultat.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String name;
                double n;

                // on récupère la chaine contenue dans le champ texte
                name = textField .getText();
                // on convertit la chaine en entier;
                n = Integer.parseInt(name);

                    // on calcule la factorielle de l'entier
                    double res = ((9.0/5.0) * n) + 32.0;
                    // on convertit le résultat trouvé de type entier en type String
                    String result = String.valueOf(res);
                    // on met à jour le label
                    label.setText(result + "°F");

                    resultat.setText(name + "°C = ");


            }
        });

        pack();
        return getContentPane();
    }
}

