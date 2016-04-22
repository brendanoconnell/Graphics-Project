import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import javax.swing.JFrame;

public class Character extends Applet {
	
	
	
	int xPos;
	int yPos;
	int lastState;
	int Lives;
	Image Sprite1, Sprite2, Sprite3;
	String currentKey = " ";
	MyKeyListener listener = new MyKeyListener();

	
	public Character(int xPos,int yPos,Image Sprite1 ){
		xPos = this.xPos;
		yPos = this.yPos;
		Sprite1 = this.Sprite1;
	}
	
	
	public void drawCharacter(Graphics g){
		g.drawImage(Sprite1, xPos, yPos, this);
	}
	
	

	 
	 public void playerMovement(){
		 
		 if(listener.currentKey == "a"){
			 xPos -= 20;
		 }
		 else if (listener.currentKey == "d"){
			 xPos += 20;
		 }
		 else if (listener.currentKey == "w"){
			 yPos += 20;
		 }
		 else if(listener.currentKey == "s"){
			 yPos -= 20;
		 }
		 
	 }


}
