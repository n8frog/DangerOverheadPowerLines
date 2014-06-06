package com.example.dop;

import android.content.Context;
import android.view.View;

public class World {

	public Enemy enemies []; // pool of enemy objects - size 6 objects
	public Obstacle obstacles []; // pool of obstacle objects - size 5 objects
	public Transformer transformers []; // pool of transformer objects - size 3 objects
	public ForegroundCloud fgclouds []; // pool of cloud objects - size 4 objects
	public BackgroundCloud bgclouds []; // pool of cloud objects - size 4 objects
	public PowerLine powerlines []; // pool of power line objects - size 3 objects
	public Turd turds []; // pool of bird turd objects - size 10 objects?
	public Player player; // the player object
	public Cat cat;	// the cat object
	public Camera camera; // the camera view object
	
	
	public World() {
		
		player = new Player(); // Player class still to be created
		cat = new Cat(); // Cat class still to be created
		
	}
	
	public void update(float deltaTime) {
		
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
	
}
