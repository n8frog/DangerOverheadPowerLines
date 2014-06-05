package com.example.dop;
import java.util.*;
import com.badlogic.androidgames.framework.*;
import com.badlogic.androidgames.framework.Input.*;
import com.badlogic.androidgames.framework.impl.*;

public class GameScreen extends Screen {

	Enemy enemies []; // pool of enemy objects - size 6 objects
	Obstacle obstacles []; // pool of obstacle objects - size 5 objects
	Transformer transformers []; // pool of transformer objects - size 3 objects
	ForegroundCloud fgclouds []; // pool of cloud objects - size 4 objects
	BackgroundCloud bgclouds []; // pool of cloud objects - size 4 objects
	PowerLine powerlines []; // pool of power line objects - size 3 objects
	Turd turds []; // pool of bird turd objects - size 10 objects?
	Player player; // the player object
	Cat cat;	// the cat object
	Camera camera; // the camera view object
	
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
	
	public Enemy getEnemy(){ // returns an enemy object from the pool
		
	}
	
	public Obstacle getObstacle(){ // returns an obstacle object from the pool
		
	}
	
	public Transformer getTransformer(){ // returns a transformer object from the pool
		
	}
	
	public ForegroundCloud getFgCloud(){ // returns a cloud object from the pool
		
	}
	
	public BackgroundCloud getBgCloud(){ // returns a cloud object from the pool
		
	}
	
	public PowerLine getPowerLine(){ // returns a power line object from the pool
		
	}
	
	public Turd getTurd(){ // returns a bird turd object from the pool
		
	}
	
	public void recycleEnemy(Enemy){ // puts the passed in enemy object back into the pool
		
	}
	
	public void recycleObstacle(Obstacle){ // puts the passed in Obstacle object back into the pool
		
	}
	
	public void recycleTransformer(Transformer){ // puts the passed in Transformer object back into the pool
		
	}
	
	public void recycleFgCloud(ForegroundCloud){ // puts the passed in Cloud object back into the pool
		
	}
	
	public void recycleBgCloud(BackgroundCloud){ // puts the passed in Cloud object back into the pool
		
	}
	
	public void recyclePowerLine(PowerLine){ // puts the passed in PowerLine object back into the pool
		
	}
	
	public void recycleTurd(Turd){ // puts the passed in Turd object back into the pool
		
	}
	
	public void update(float deltaTime) { // updates game logic and object positions, uses deltaTime
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
		}
	}
	
	private void updatePaused(List <TouchEvent> touchEvents) {
		int len = touchEvents.size();
		for(int i = 0; i < len; ++i){
			TouchEvent event = touchEvents.get(i);
			if(event.type == TouchEvent.TOUCH_UP) {
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
		}
	}
	
	public void present(float deltaTime) { // renders game objects, uses deltaTime
		
	}
}
