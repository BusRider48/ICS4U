/*
Progress Bar
Tyler Wong
12/20/2023
*/
int x=0;
int last=0;
int current=0;
void setup() {
  size(500,500);
  rect(50,200,400,100);
}
void draw() {
  fill(0,255,0);
  rect(50,200,x,100);
  current=millis();
  if (x<400){
    if (current-last>=25) {
      last=current;
      x+=1;
    }
  }
  else {
    textSize(50);
    text("done",50,400); 
    fill(255,0,0);
  }
}
