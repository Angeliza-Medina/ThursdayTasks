
/*  TASK 3  */

color red = #FF0000;
color yellow = #D8FF00;
color green = #1CFF00;
color black = #000000;
color grey = #BDBFBD;

int lightbulbSize = 150;
int lightbulbSpacing = 10;

int prevFrameCount = frameCount;
int currentFrameCount;

void setup(){
  size(300, 500);
  background(black);
}

void draw(){
  makeTrafficLight();
  makeALightbulb(grey, width/2, height/2-lightbulbSize-lightbulbSpacing);
  makeALightbulb(grey, width/2, height/2);
  makeALightbulb(grey, width/2, height/2+lightbulbSize+lightbulbSpacing);
  
  currentFrameCount = frameCount;
  int frameCountDifference = currentFrameCount - prevFrameCount;

  if(frameCountDifference >= 0 && frameCountDifference <= 60){
    makeALightbulb(red, width/2, height/2-lightbulbSize-lightbulbSpacing);
  }else if(frameCountDifference >= 61 && frameCountDifference <= 120){
     makeALightbulb(yellow, width/2, height/2);
  }else if(frameCountDifference >= 121 && frameCountDifference <= 180){
    makeALightbulb(green, width/2, height/2+lightbulbSize+lightbulbSpacing);
  }else{
    prevFrameCount = currentFrameCount;
  }
  
}

void makeTrafficLight(){
  rectMode(CENTER);
  stroke(black);
  fill(black);
  rect(width/2, height/2, width, height);
}

void makeALightbulb(color bulbColor, int x, int y){  
  noStroke();
  fill(bulbColor);
  ellipse(x, y, lightbulbSize, lightbulbSize);
}
