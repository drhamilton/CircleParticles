package circles;

import java.util.ArrayList;

import processing.core.PApplet;


public class Circles extends PApplet {
	
	ArrayList<Ball> ballList;
	

	public void setup() {
		size(500, 500);
		smooth();
		this.ballList = new ArrayList<Ball>();
		fill(((int)Math.random() * 255), ((int)Math.random() * 255), ((int)Math.random() * 255));
		Ball firstBall = new Ball(0, 50, 5, 5, 100, this);
		ballList.add(firstBall);
		
		
	}

	public void draw() {
		background(0);
		
		for(int i = 0; i < ballList.size(); i ++){
			this.ballList.get(i).display();
			this.ballList.get(i).move();
			if (this.ballList.get(i).isHit()){
				this.ballList.get(i).size /= 1.1;
				fill((float)(Math.random() * 255), (float)(Math.random() * 255), (float)(Math.random() * 255));
				Ball temp = new Ball(this.ballList.get(i).x, this.ballList.get(i).y, 
						Math.random() * -10, Math.random() * -10,
						(float) (this.ballList.get(i).size/ 1.1) , this);
				this.ballList.add(temp);
			}
			
			
		}
	}
}
