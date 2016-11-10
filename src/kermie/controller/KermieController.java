package kermie.controller;

import kermie.model.Kermie;
import kermie.view.KermieFrame;

public class KermieController
{
	private String [] words = {"this","is","the","next","level","of","hipster","the","initialization","sequence"};
	private Kermie [] kermies;
	private int [] numbers;
	private KermieFrame appFrame;
	
	public KermieController()
	{
		showKermieLevelThree();
		kermies = new Kermie [5];
		appFrame = new KermieFrame(this);
		
	}
	
	public void start()
	{
		for(int index = 0; index < kermies.length; index++)
		{
			kermies[index] = new Kermie("Kermie #" + index);
		}
		
		kermies[0].setName("asdasd");
		
		for(Kermie current : kermies)
		{
			System.out.println(current);
				
		}
			
	}

	private void showKermieLevelThree()
	{
		numbers = new int [] {1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1};
	}
	
	public Kermie[] getKermies()
	{
		return kermies;
	}
	
	public String[] getWords()
	{
		return words;
	}
	
	public int[] getNumbers()
	{
		return numbers;
	}
}
