void setup()
{
	noLoop();
}
void draw()
{
	int Die;
	Die = 1;
	Die.show();

}
void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	//variable declarations here
	
	Die(int x, int y) //constructor
	{
		//variable initializations here
	}
	void roll()
	{
		//your code here
	}
	void show()
	{
		fill((int) Math.random()*254);
		rect();	
	}
}
