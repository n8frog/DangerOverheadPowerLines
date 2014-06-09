package com.example.dop;

import java.util.List;

import com.badlogic.androidgames.framework.Game;
import com.badlogic.androidgames.framework.Graphics;
import com.badlogic.androidgames.framework.Input.TouchEvent;
import com.badlogic.androidgames.framework.Screen;

public class SplashScreen extends Screen {
	public SplashScreen(Game game) {
		super(game);
	}

	public void present(float deltaTime) {
		Graphics g = game.getGraphics();
	
		g.drawPixmap(Assets.Background, 0, 0);
		g.drawPixmap(Assets.LoadScreen, 540, 0);
	
	}
	public void pause() {
		Settings.save(game.getFileIO());
	}
	public void resume() {
	
	}
	public void dispose() {
	
	}

}
