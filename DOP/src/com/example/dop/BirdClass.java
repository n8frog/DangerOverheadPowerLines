
package com.example.dop;
import java.util.Timer;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class BirdClass extends GameObject implements BirdInterface 
{
	public BirdClass(double x0, double y0, double q0) 
	{
		super(x0, y0, q0);
		// TODO Auto-generated constructor stub
	}

	Bitmap bird;
	Timer BombTimer = new Timer();
	//InputStream inputStream = assetManager.open("bird.png")
	//Bitmap bitmap = BitmapFactory.decodeStream(InputStream)
	

	@Override
	public void delete() 
	{
		// TODO Auto-generated method stub

	}

	//@Override
	/*public void spawn(SpawnLocale) 
	{
		// TODO Auto-generated method stub

	}*/

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

	@Override
	public void spawn(int x, int y) {
		// TODO Auto-generated method stub
		
	}

}
