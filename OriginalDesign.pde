void setup()
{
	size(215,350);
}
void draw()
{
	body();
	head();
}
void body()
{
	int x = 50;
	int y = 50;
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
	int x = 50;
    int y = 50;

    //mane
    quad(x, y, x+20, y, x+5, y+15, x+15, y+15);
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