package kermie.view;

import javax.swing.*;
import controller.KermieController;
import java.awt.Color;

public class KermiePanel extends JPanel
{
	
	private SpringLayout baseLayout;
	private	JComboBox dropDown;
	private	JLabel infoLabel;
	private JButton myButton;
	private KermieController baseController;
	
	public KermiePanel(KermieController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.myButton = new JButton("Click the button");
		this.infoLabel = new JLabel("Wow words!");
		this.dropDown = new JComboBox(baseController.getWords());
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.setLayout(baseLayout);
		this.add(myButton);
		this.add(infoLabel);
		this.add(dropDown);
	}
	
		
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
	}
}
