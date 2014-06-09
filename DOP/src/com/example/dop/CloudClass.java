package com.example.dop;

public class CloudClass extends GameObject implements CloudInterface 
{

	public CloudClass(double x0, double y0, double q0) {
		super(x0, y0, q0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void moveLeft() 
	{
		// TODO Auto-generated method stub
		//this.x -= this.vx
	}

	@Override
	public void moveRight() 
	{
		// TODO Auto-generated method stub
		//this.x += this.vx
	}

	@Override
	public void moveUp() 
	{
		// TODO Auto-generated method stub
		//this.y -= this.vy
	}

	@Override
	public void moveDown() 
	{
		// TODO Auto-generated method stub
		//this.y += this.vy
	}

}
