import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.Scanner;




public class Board extends Applet{


	
	
	Image Sprite1;
	Character pacman = new Character(400,400, Sprite1);
	
	public void init(){
		Sprite1 = getImage(getDocumentBase(), "Sprite4.png");
		
	}
	
	
	public void paint(Graphics g){
		pacman.drawCharacter(g);
	}
	
	
	
}