/*
Many Random Particles + Colour Changing Particles
Tyler Wong
12/19/2023
*/
class ball {
  int x;
  int y;
  int colour;
}
ball[] balls=new ball[15];
void setup() {
  size(500,500);
  for(int i=0; i<15; i++) {
    balls[i]=new ball();
    balls[i].x=0;
    balls[i].y=0;
    balls[i].colour=0;
  }
}
void draw() {
  background(#ffffff);
  for(int i=0; i<15; i++) {
    ellipse(balls[i].x,balls[i].y,20,20);
    fill(balls[i].colour);
    balls[i].x+=int(random(-5,6));
    balls[i].y+=int(random(-5,6));
    balls[i].colour+=int(random(-255,256));
  }
}
