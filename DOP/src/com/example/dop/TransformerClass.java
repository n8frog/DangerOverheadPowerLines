package game.startFile.dop;

public class TransformerClass implements TransformerInterface 
{
	//int TTimer = 0;
	
	@Override
	public void electrify() 
	{
		// TODO Auto-generated method stub
		if (player.y >= tansformer.y /* + maximum "pulldown" distance*/) //If the player is on the same line as the transformer
		{
			electrocutePlayer();
		}
	}

	@Override
	public void resetTTimer() 
	{
		// TODO Auto-generated method stub
		this.ObjectTimer = 10;
	}
	
	void playerWarning(ObjectTimer)
	{
		if(this.ObjectTimer == 5)
		{
			play(BZZ.mp3);
		}
	}
	

}
