package game.startFile.dop;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public abstract class GameObjectClass implements GameObjectInterface 
{
	//birds
	Bitmap bird;
	InputStream inputStream = assetManager.open("bird.png")
	Bitmap bitmap = BitmapFactory.decodeStream(inputStream)
	this.width = bitmap.getWidth();
	this.height = bitmap.getHeight();
	Bitmap.Config config = bitmap,getConfig();
	this.vx = 0;
	this.vy = 10;
	
	spawn(x, y)
	{
		canvas.drawBitmap(bird, x, y, null);
	}
	flyAway()
	{
		this.curSpriteAnim.x += this.vy;
		this.curSriteAnim.x = this.vx;
		if(this.y == 0 || this.x == 0 || this.x == canvas.width)
		{
			delete() bird;
			bitmap.recycle();
		}
		return 0;
	}
	
	dropBomb(this.ObjectTimer)
	{
		//bombs.push()
		return 0;
	}
}
