package com.example.dop;

import com.badlogic.androidgames.framework.Game;
import com.badlogic.androidgames.framework.Graphics;
import com.badlogic.androidgames.framework.Screen;
import com.badlogic.androidgames.framework.Graphics.PixmapFormat;

public class LoadingScreen extends Screen {
	public LoadingScreen(Game game) {
		super(game);
	}
	
	public void update(float deltaTime) {
		Graphics g = game.getGraphics();
		//TODO Load up graphics for in game use here
		// example:
		// Assets.background = g.newPixmap("background.png", PixmapFormat.RGB565);
	}

	@Override
	public void present(float deltaTime) {
		// TODO Auto-generated method stub
		// nothing needed here
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		// nothing needed here
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		// nothing needed here
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		// nothing needed here
	}
}
