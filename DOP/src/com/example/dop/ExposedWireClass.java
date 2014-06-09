package com.example.dop;

public class ExposedWireClass extends GameObject  implements ExposedWireInterface 
{

	public ExposedWireClass(double x0, double y0, double q0) {
		super(x0, y0, q0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void delete()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void isTouched(/*PlayerClass*/) 
	{
		// TODO Auto-generated method stub
		//electrocutePlayer();
	}

}
