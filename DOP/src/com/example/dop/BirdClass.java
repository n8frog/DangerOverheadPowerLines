
package game.startFile.dop;
import java.util.Timer;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Bird extends GameObjectClass implements BirdInterface 
{
	Bitmap bird;
	Timer BombTimer = new Timer();
	//InputStream inputStream = assetManager.open("bird.png")
	//Bitmap bitmap = BitmapFactory.decodeStream(InputStream)
	
	Bird(World)
	{
		
	}

	@Override
	public void delete() 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void spawn(SpawnLocale) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public int flyAway() 
	{
		//this.curSpriteAnim.x += this.vy;
		//this.curSriteAnim.x = this.vx;
	//	if(this.y == 0 || this.x == 0 || this.x == canvas.width)
	//	{
	//		delete() bird;
	//		bitmap.recycle();
	//	}
	//	return 0;
		return 0;
	}

	@Override
	public void dropBomb() 
	{
		// TODO Auto-generated method stub
		//bombs.push()
	//	World.Add.Bomb
	//	return 0;
	}

}
