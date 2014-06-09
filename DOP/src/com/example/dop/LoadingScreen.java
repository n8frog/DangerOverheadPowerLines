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
		
		//Load up graphics for in game use here
		Assets.ArrowLeft = g.newPixmap("ArrowLeft.png" , PixmapFormat.ARGB8888);
		Assets.ArrowRight = g.newPixmap("ArrowRight.png" , PixmapFormat.ARGB8888);
		Assets.Background = g.newPixmap("Background.png" , PixmapFormat.ARGB8888);
		Assets.BathTime = g.newPixmap("BathTime.png" , PixmapFormat.ARGB8888);
		Assets.BirdFly = g.newPixmap("BirdFly.png" , PixmapFormat.ARGB8888);
		Assets.BirdFlyLeft = g.newPixmap("BirdFlyLeft.png" , PixmapFormat.ARGB8888);
		Assets.BirdFlyRight = g.newPixmap("BirdFlyRight.png" , PixmapFormat.ARGB8888);
		Assets.BirdSit = g.newPixmap("BirdSit.png" , PixmapFormat.ARGB8888);
		Assets.CatLeftTail = g.newPixmap("CatLeftTail.png" , PixmapFormat.ARGB8888);
		Assets.CatLSL = g.newPixmap("CatLSL.png" , PixmapFormat.ARGB8888);
		Assets.CatLSR = g.newPixmap("CatLSR.png" , PixmapFormat.ARGB8888);
		Assets.CatRightTail = g.newPixmap("CatRightTail.png" , PixmapFormat.ARGB8888);
		Assets.CloudLarge = g.newPixmap("CloudLarge.png" , PixmapFormat.ARGB8888);
		Assets.CloudMed = g.newPixmap("CloudMed.png" , PixmapFormat.ARGB8888);
		Assets.CloudSmall = g.newPixmap("CloudSmall.png" , PixmapFormat.ARGB8888);
		Assets.CloudXLarge = g.newPixmap("CloudXLarge.png" , PixmapFormat.ARGB8888);
		Assets.EndGame = g.newPixmap("EndGame.png" , PixmapFormat.ARGB8888);
		Assets.FrayedWire = g.newPixmap("FrayedWire.png" , PixmapFormat.ARGB8888);
		Assets.Help01 = g.newPixmap("Help01.png" , PixmapFormat.ARGB8888);
		Assets.Help02 = g.newPixmap("Help02.png" , PixmapFormat.ARGB8888);
		Assets.Help03 = g.newPixmap("Help03.png" , PixmapFormat.ARGB8888);
		Assets.Help04 = g.newPixmap("Help04.png" , PixmapFormat.ARGB8888);
		Assets.Help05 = g.newPixmap("Help05.png" , PixmapFormat.ARGB8888);
		Assets.Help06 = g.newPixmap("Help06.png" , PixmapFormat.ARGB8888);
		Assets.HighScore = g.newPixmap("HighScore.png" , PixmapFormat.ARGB8888);
		Assets.LoadScreen = g.newPixmap("LoadScreen.png" , PixmapFormat.ARGB8888);
		Assets.MainMenu = g.newPixmap("MainMenu.png" , PixmapFormat.ARGB8888);
		Assets.Number00 = g.newPixmap("Number00.png" , PixmapFormat.ARGB8888);
		Assets.Number01 = g.newPixmap("Number01.png" , PixmapFormat.ARGB8888);
		Assets.Number02 = g.newPixmap("Number02.png" , PixmapFormat.ARGB8888);
		Assets.Number03 = g.newPixmap("Number03.png" , PixmapFormat.ARGB8888);
		Assets.Number04 = g.newPixmap("Number04.png" , PixmapFormat.ARGB8888);
		Assets.Number05 = g.newPixmap("Number05.png" , PixmapFormat.ARGB8888);
		Assets.Number06 = g.newPixmap("Number06.png" , PixmapFormat.ARGB8888);
		Assets.Number07 = g.newPixmap("Number07.png" , PixmapFormat.ARGB8888);
		Assets.Number08 = g.newPixmap("Number08.png" , PixmapFormat.ARGB8888);
		Assets.Number09 = g.newPixmap("Number09.png" , PixmapFormat.ARGB8888);
		Assets.NumberDecimal = g.newPixmap("NumberDecimal.png" , PixmapFormat.ARGB8888);
		Assets.Pause = g.newPixmap("Pause.png" , PixmapFormat.ARGB8888);
		Assets.Poof = g.newPixmap("Poof.png" , PixmapFormat.ARGB8888);
		Assets.PoofLS = g.newPixmap("PoofLS.png" , PixmapFormat.ARGB8888);
		Assets.PowerLine = g.newPixmap("PowerLine.png" , PixmapFormat.ARGB8888);
		Assets.PowerpoleLeft = g.newPixmap("PowerpoleLeft.png" , PixmapFormat.ARGB8888);
		Assets.PowerpoleRight = g.newPixmap("PowerpoleRight.png" , PixmapFormat.ARGB8888);
		Assets.Ready = g.newPixmap("Ready.png" , PixmapFormat.ARGB8888);
		Assets.Resume = g.newPixmap("Resume.png" , PixmapFormat.ARGB8888);
		Assets.RobJumping = g.newPixmap("RobJumping.png" , PixmapFormat.ARGB8888);
		Assets.RobLoadScreen = g.newPixmap("RobLoadScreen.png" , PixmapFormat.ARGB8888);
		Assets.RobNotAgain = g.newPixmap("RobNotAgain.png" , PixmapFormat.ARGB8888);
		Assets.RobSplat = g.newPixmap("RobSplat.png" , PixmapFormat.ARGB8888);
		Assets.RobStanding = g.newPixmap("RobStanding.png" , PixmapFormat.ARGB8888);
		Assets.RobStandingElec = g.newPixmap("RobStandingElec.png" , PixmapFormat.ARGB8888);
		Assets.RobStandingLeft = g.newPixmap("RobStandingLeft.png" , PixmapFormat.ARGB8888);
		Assets.RobStandingRight = g.newPixmap("RobStandingRight.png" , PixmapFormat.ARGB8888);
		Assets.RobUmbrella = g.newPixmap("RobUmbrella.png" , PixmapFormat.ARGB8888);
		Assets.Shoes = g.newPixmap("Shoes.png" , PixmapFormat.ARGB8888);
		Assets.Splat = g.newPixmap("Splat.png" , PixmapFormat.ARGB8888);
		Assets.Transformer = g.newPixmap("Transformer.png" , PixmapFormat.ARGB8888);
		Assets.Turd01 = g.newPixmap("Turd01.png" , PixmapFormat.ARGB8888);
		Assets.Turd02 = g.newPixmap("Turd02.png" , PixmapFormat.ARGB8888);
		Assets.Turd03 = g.newPixmap("Turd03.png" , PixmapFormat.ARGB8888);
		Assets.Umbrella = g.newPixmap("Umbrella.png" , PixmapFormat.ARGB8888);
		Assets.UmbrellaHang = g.newPixmap("UmbrellaHang.png" , PixmapFormat.ARGB8888);
		Assets.WireZap = g.newPixmap("WireZap.png" , PixmapFormat.ARGB8888);
		Settings.load(game.getFileIO());
		game.setScreen(new SplashScreen(game));
		
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
