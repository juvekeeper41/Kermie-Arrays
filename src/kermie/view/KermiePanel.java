package kermie.view;

	import javax.swing.*;
	import kermie.controller.KermieController;
	import java.awt.Color;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;



	public class KermiePanel extends JPanel
	{
	private SpringLayout baseLayout;
	private JComboBox dropDown;
	private JLabel infoLabel;
	private JButton myButton;
	private KermieController baseController;


	public KermiePanel(KermieController baseController)

	{

	this.baseController = baseController;
	this.baseLayout = new SpringLayout();
	this.myButton = new JButton("Click the button");
	this.infoLabel = new JLabel("Wow words!");
	this.dropDown = new JComboBox(baseController.getKermies());
	
	baseLayout.putConstraint(SpringLayout.SOUTH, myButton, -37, SpringLayout.SOUTH, this);
	baseLayout.putConstraint(SpringLayout.NORTH, infoLabel, 122, SpringLayout.NORTH, this);
	baseLayout.putConstraint(SpringLayout.WEST, infoLabel, 176, SpringLayout.WEST, this);
	baseLayout.putConstraint(SpringLayout.EAST, dropDown, -313, SpringLayout.EAST, this);
	baseLayout.putConstraint(SpringLayout.NORTH, dropDown, 1, SpringLayout.NORTH, myButton);
	baseLayout.putConstraint(SpringLayout.WEST, dropDown, 10, SpringLayout.WEST, this);


	setupPanel();
	setupLayout();
	setupListeners();

	}


	private void setupPanel()

	{

	this.setBackground(Color.CYAN);
	this.setLayout(baseLayout);
	this.add(dropDown);
	this.add(infoLabel);
	this.add(myButton);

	}


	private void setupLayout()

	{

	baseLayout.putConstraint(SpringLayout.EAST, myButton, -10, SpringLayout.EAST, this);


	}


	private void setupListeners()
	{

	
	dropDown.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent selection)
		{
			infoLabel.setText(dropDown.getSelectedItem().toString());
		}
	});
	
	myButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent click)
		{
			baseController.impactKermies();
			repaint();
		}
	});
	}
}
