package com.example.dop;
import java.util.*;
import com.badlogic.androidgames.framework.*;
import com.badlogic.androidgames.framework.Input.*;
import com.badlogic.androidgames.framework.impl.*;

public class GameScreen extends Screen {

	public float deltaTime;
	
	enum GameState {
		Ready,
		Running,
		Paused,
		GameOver
	}
	
	GameState state = GameState.Ready;
	World world;
	
	public GameScreen(Game game) {
		super(game);
		world = new World();
	}
	
	
	public void update(float deltaTime) { // delegates update to the correct gameState update method
		List<TouchEvent>touchEvents = game.getInput().getTouchEvents();
		
		if(state == GameState.Ready)
			updateReady(touchEvents);
		if(state == GameState.Running)
			updateRunning(touchEvents, deltaTime);
		if(state == GameState.Paused)
			updatePaused(touchEvents);
		if(state == GameState.GameOver)
			updateGameOver(touchEvents);
	}
	
	private void updateReady(List <TouchEvent> touchEvents) {
		if(touchEvents.size() > 0)
				state = GameState.Running;
	}
	
	private void updateRunning(List <TouchEvent> touchEvents, float deltaTime) {
		int len = touchEvents.size();
		for(int i = 0; i < len; ++i){
			TouchEvent event = touchEvents.get(i);
			if(event.type == TouchEvent.TOUCH_UP) {
				// Do something
			}
			if(event.type == TouchEvent.TOUCH_DOWN) {
				// Do something
				if(event.x < world.player.x) // this isn't going to work - need to research more from textbook and online
			} // in text mrNom example movement is implemented by calling a member function of the snake class
			// we could do similar here example: world.player.moveLeft();
		}
	}
	
	private void updatePaused(List <TouchEvent> touchEvents) {
		int len = touchEvents.size();
		for(int i = 0; i < len; ++i){
			TouchEvent event = touchEvents.get(i);
			if(event.type == TouchEvent.TOUCH_UP) {
				// Do something
			}
			if(event.type == TouchEvent.TOUCH_DOWN) {
				// Do something
			}
		}
	}
	
	private void updateGameOver(List <TouchEvent> touchEvents) {
		int len = touchEvents.size();
		for(int i = 0; i < len; ++i){
			TouchEvent event = touchEvents.get(i);
			if(event.type == TouchEvent.TOUCH_UP) {
				// Do something
			}
			if(event.type == TouchEvent.TOUCH_DOWN) {
				// Do something
			}
		}
	}
	
	@Override
	public void present(float deltaTime) { // renders game objects, uses deltaTime
		Graphics g = game.getGraphics();
		
	}


	@Override
	public void pause() {
		if(state == GameState.Running)
			state = GameState.Paused;
	}


	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
}
