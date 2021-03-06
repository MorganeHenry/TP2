package exo5;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTextField;



/**
 * pour les 10 boutons
 *
 buttons[i] = new JButton(new ButtonsAction(this, String.valueOf(i + 1)));
 JButton buttonZero = new JButton(new ButtonsAction(this,"0"));
 */
public class ClicAction extends AbstractAction {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private BoutonsActions boutonsActions;
    private String texte;

    public ClicAction(BoutonsActions boutonsActions, String texte){
        super(texte);
        this.boutonsActions = boutonsActions;
        this.texte = texte;
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("*" + texte + "*");
    }
}