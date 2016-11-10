package kermie.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import kermie.controller.KermieController;

public class KermieFrame extends JFrame
{
	
	private KermiePanel appPanel;
	private KermieController baseController;
	
	public KermieFrame(KermieController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new KermiePanel(baseController);
		
		setupFrame();
	}
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(new Dimension(600, 400));
		this.setTitle("Hipster Day 2016");
		this.setResizable(false);
		this.setVisible(true);
	}
}
