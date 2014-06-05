package game.startFile.dop;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class BirdClass implements BirdInterface 
{
	Bitmap bird;
	InputStream inputStream = assetManager.open("bird.png")
	Bitmap bitmap = BitmapFactory.decodeStream(inputStream)
	
	BirdClass()
	{
		
	}
	@Override
	public void electrify() 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void spawn(int x, int y) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public int flyAway() 
	{
		this.curSpriteAnim.x += this.vy;
		this.curSriteAnim.x = this.vx;
		if(this.y == 0 || this.x == 0 || this.x == canvas.width)
		{
			delete() bird;
			bitmap.recycle();
		}
		return 0;
		return 0;
	}

	@Override
	public void dropBomb() 
	{
		// TODO Auto-generated method stub
		//bombs.push()
		object.push(bomb)
		return 0;
	}

}
