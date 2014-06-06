package game.startFile.dop;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.Timer;

public abstract class GameObject implements GameObjectInterface 
{
	
	int height = 0;
	int width = 0;
	int x = 0;
	int y = 0;
	int vx = 0;
	int vy = 0;

	
	//spriteAnim
	//curSpriteAnim = this.curSpriteAnim;
	
	public GameObject(double x0, double y0, double q0)
	{
		this.width = bitmap.getWidth();
		this.height = bitmap.getHeight();
		Bitmap.Config config = bitmap.getConfig();
		this.vx = 0;
		this.vy = 10;
	}
	
	public void delete()
	{
		//	splice;
	}
	
	//function implementation goes here
	//function declaration go in Interface
	
	
}
