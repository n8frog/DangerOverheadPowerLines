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
	
	public GameScreen(Game game) {
		super(game);
	}
	
	
	public void update(float deltaTime) { // updates touch events
		List<TouchEvent>touchEvents = game.getInput().getTouchEvents();
		
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
			}
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
	
	public void present(float deltaTime) { // renders game objects, uses deltaTime
		
	}
}
