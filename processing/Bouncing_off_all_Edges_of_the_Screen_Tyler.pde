/*
Bouncing off all Edges of the Screen
Tyler Wong
12/19/2023
*/
int x=400;
int y=100;
boolean xinc=true;
boolean yinc=true;
void setup() {
  size(500,500);
}
void draw() {
  background(0);
  rect(x,y,20,20);
  if (xinc) {
    x+=5;
  }
  if (yinc) {
    y+=4;
  }
  if (!xinc) {
    x-=5;
  }
  if (!yinc) {
    y-=4;
  }
  if (x==480) {
    xinc=false;
  }
  if (x==0) {
    xinc=true;
  }
  if (y==480) {
    yinc=false;
  }
  if (y==0) {
    yinc=true;
  }
}
