/*
draw a clock
Tyler Wong
12/15/2023
*/
void setup() {
  size(500,500);
  fill(#ffffff);
  ellipse(250,250,450,450);
  for (float i=0; i<PI/2; i+=PI/30) {
    line(225*cos(i)+255,225*sin(i)+255,210*cos(i)+250,210*sin(i)+250);
  }
  for (float i=PI/2; i<PI; i+=PI/30) {
    line(225*cos(i)+255,225*sin(i)+255,210*cos(i)+250,210*sin(i)+250);
  }
  for (float i=PI; i<(3*PI)/2; i+=PI/30) {
    line(225*cos(i)+255,225*sin(i)+255,210*cos(i)+250,210*sin(i)+250);
  }
  for (float i=(3*PI)/2; i<2*PI; i+=PI/30) {
    line(225*cos(i)+255,225*sin(i)+255,210*cos(i)+250,210*sin(i)+250);
  }
}
