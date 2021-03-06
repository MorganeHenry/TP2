package exo3;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BoutonsListeners extends JFrame {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3928008548751894521L;


	public BoutonsListeners() {
		super();
		build();
	}
	
	void build()
	{
		setTitle("Boutons Listeners");
		setPreferredSize(new Dimension(300, 100));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(buildContentPane());
	}
	
	Container buildContentPane()
	{	
		getContentPane().setLayout(new FlowLayout());
		JButton test = new JButton("Test");
		getContentPane().add(test);
		
		test.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{ 
				System.out.println("Test Clic");
			}
		}
		);
		
		
		JButton buttons [] = { new JButton("Un"),  new JButton("Deux"),  new JButton("Trois") };
				
		for (JButton button : buttons) 
		{
			getContentPane().add(button);
			
			button.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					JButton source = (JButton) e.getSource();
					System.out.println("*" + source.getText() + "*");
				}
			});
		}
		
		pack();
		return getContentPane();
	}	
}
