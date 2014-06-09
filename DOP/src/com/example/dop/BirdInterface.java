package com.example.dop;

public interface BirdInterface extends GameObjectInterface 
{
	void spawn(int x, int y);
	int flyAway();
	void dropBomb();
		
}

