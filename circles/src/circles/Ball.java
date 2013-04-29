package circles;

import processing.core.*;

public class Ball {
	
	public int x;
	public int y;
	public float size;
	public boolean hit;
	public int xSpeed;
	public int ySpeed;
	
	public PApplet canvas;

	public Ball(int x, int y, double e, double f, float d, PApplet canvas) {
		this.x = x;
		this.y = y;
		this.xSpeed = (int) e;
		this.ySpeed = (int) f;
		this.canvas = canvas;
		this.hit = false;
		this.size = d;
	}
	
	public void display(){
		this.canvas.fill(150);
		this.canvas.ellipse(this.x, this.y, this.size, this.size);
	}
	
	public boolean isHit(){
		return  ((canvas.mouseX > this.x - (this.size / 2)) &&
		   (canvas.mouseX < this.x + (this.size / 2)) &&
		   (canvas.mouseY > this.y - (this.size / 2)) &&
	 	   (canvas.mouseY < this.y + (this.size / 2)));
	}
	
	public void move(){
		
		this.x += xSpeed;
		this.y += ySpeed;
		
		if(this.x > this.canvas.width || this.x < 0){
			this.xSpeed *= -1;
		}
		if(this.y > this.canvas.height || this.y < 0){
			this.ySpeed *= -1;
		}
	}

}
