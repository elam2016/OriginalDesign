void setup()
{
	size(400,300);
    background(grey, alpha);
}
void draw()
{
	body();
	head();
}
void body()
{
	int x = 200;
	int y = 60;
	//body
    fill(255);
    ellipse(x+10,y+115,90,140);
	//legs
    fill(255, 145, 213);
    ellipse(x-25, y+110, 35, 35);
    ellipse(x+45, y+110, 35, 35);
    ellipse(x-25,y+165,35,35);
    ellipse(x+45,y+165,35,35);
}
void head()
{
	int x = 200;
    int y = 60;

    //mane
    //Point2D start = new Point2D.Float(0, 0);
    //Point2D end = new Point2D.Float(50, 50);
    //float[] dist = {0.0f, 0.2f, 1.0f};
    //Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.VIOLET};
    //LinearGradientPaint p =
        //new LinearGradientPaint(start, end, dist, colors);
    quad(x-5, y-25, x+25, y-25, x+20, y-15, x+10, y-15);
    //head
	fill(255);
    ellipse(x+10,y+40,60,100);
    //eyes
    ellipse(x-10,y+20,20,20);
    ellipse(x+30,y+20,20,20);
    //pupils
    fill(0);
    ellipse(x-10,y+20,2,2);
    ellipse(x+30,y+20,2,2);
    //nostrils
    ellipse(x-10,y+75,2,2);
    ellipse(x+30,y+75,2,2);
    //horn
    fill(196, 170, 0);
    triangle(x, y, x+10, y-50, x+20, y);
}