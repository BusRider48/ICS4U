/*
graphing a function
Tyler Wong
12/14/2023
*/
void setup() {
  size(500,500);
  int y=0;
  for (int i=0; i<500; i++) {
    y=((-3*(i*i*i))/87500)+((58*(i*i))/2625)-((302*(i))/105)+200;
    rect(i,y,3,3);
  }
}
