int x = 400;
int y = 70;

void setup()
{
	size(800,300);
}
void draw()
{
    background(50,150,200);
    x = x + 2;
    if (x > 880) {
        x = -80;
    }
	body();
	head();
}
void body()
{
	//body
        fill(255);
        ellipse(x,y+110,90,140);
	//legs
        fill(255, 145, 213);
        ellipse(x-35, y+110, 35, 35);
        ellipse(x+35, y+110, 35, 35);
        ellipse(x-35,y+160,35,35);
        ellipse(x+35,y+160,35,35);
}
void head()
{
    //mane
        //Point2D start = new Point2D.Float(0, 0);
        //Point2D end = new Point2D.Float(50, 50);
        //float[] dist = {0.0f, 0.2f, 1.0f};
        //Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.VIOLET};
        //LinearGradientPaint p =
            //new LinearGradientPaint(start, end, dist, colors);
        quad(x-15, y-25, x+15, y-25, x+10, y, x-10, y);
    //head
    	fill(255);
        ellipse(x,y+40,60,100);
    //eyes
        ellipse(x-20,y+20,20,20);
        ellipse(x+20,y+20,20,20);
    //pupils
        fill(0);
        ellipse(x-20,y+20,2,2);
        ellipse(x+20,y+20,2,2);
    //nostrils
        ellipse(x-20,y+75,2,2);
        ellipse(x+20,y+75,2,2);
    //horn
        fill(196, 170, 0);
        triangle(x-10, y, x, y-50, x+10, y);
}