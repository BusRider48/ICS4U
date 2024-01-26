/*
digital stopwatch
Tyler Wong
12/20/2023
*/
int last=0;
int current=0;
int seconds=0;
int minutes=0;
void setup() {
  size(500,500);
}
void draw() {
current=millis();
  if (current-last>=1000) {
    last=current;
    seconds++;
    if (seconds==60) {
      minutes++;
      seconds=0;
    }
    background(0);
    textSize(100);
    text(minutes+":"+seconds,200,250);
    println(minutes+":"+seconds);
  }
}
