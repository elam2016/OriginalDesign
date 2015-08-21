void setup()
{
	size(220,350);
}
void draw()
{
	body();
	head();
}
void body()
{
	int x = 100;
	int y = 100;
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
	//head
	fill(255);
    ellipse(x+10,140,60,100);
    //eyes
    ellipse(90,120,20,20);
    ellipse(130,120,20,20);
    //pupils
    fill(0);
    ellipse(x-10,100+20,2,2);
    ellipse(x+30,100+20,2,2);
    //pupils
    ellipse(x-10,100+75,2,2);
    ellipse(x+30,100+75,2,2);
    //horn
    fill(196, 170, 0);
    triangle(x,y,100+10,100-50,100+20,100);
}