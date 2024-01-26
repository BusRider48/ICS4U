/*
A Random Particle
Tyler Wong
12/19/2023
*/
int x=250;
int y=250;
void setup() {
  size(500,500);
}
void draw() {
  background(#ffffff);
  ellipse(x,y,20,20);
  x+=int(random(-6,6));
  y+=int(random(-6,6));
}
