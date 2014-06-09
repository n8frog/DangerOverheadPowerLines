package com.example.dop;

import java.util.Timer;

public class TransformerClass extends GameObject implements TransformerInterface 
{
	
	public TransformerClass(double x0, double y0, double q0) 
	{
		super(x0, y0, q0);
		// TODO Auto-generated constructor stub
	}

	Timer electrifyTimer = new Timer();
	@Override
	public void electrify() 
	{
		// TODO Auto-generated method stub
	/*	if (player.y >= tansformer.y  + maximum "pulldown" distance) //If the player is on the same line as the transformer
		{
			electrocutePlayer();
		}
	*/
	}

	@Override
	public void resetTTimer() 
	{
		// TODO Auto-generated method stub
		//Reset electrifyTimer
	}
	
	//void playerWarning(electrifyTimer)
	{
	//	if(this.ObjectTimer == 5)
		{
	//	play(BZZ.mp3);
		}
	}

	@Override
	public void playerWarning() 
	{
		// TODO Auto-generated method stub
		
	}
}
