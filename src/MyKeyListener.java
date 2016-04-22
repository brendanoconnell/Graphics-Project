import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

	public class MyKeyListener implements KeyListener {
		
		public String currentKey = " ";
		
		
		
		@Override
		public void keyTyped(KeyEvent e) {
			currentKey = KeyEvent.getKeyText(e.getKeyCode());
		}

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
		}
		
		
		public String currentKey(String temp){

			return currentKey;
		}
	}

