import java.awt.event.*;
import java.applet.*; 
public class MouseEvents extends Applet implements MouseListener, MouseMotionListener {
String msg = ""; int mouseX = 0, mouseY = 0;
@Override
public void init() { addMouseListener(this); addMouseMotionListener(this); }

public void mouseDragged(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseMoved(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseClicked(MouseEvent me) {
	// TODO Auto-generated method stub
	mouseX = 0; mouseY = 10; msg = "Mouse clicked."; repaint();

}
@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mousePressed(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
} 

