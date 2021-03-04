import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class Control_Circle extends Frame{
Button btenlarge = new Button("Enlarge");
Button btshrink = new Button("Shrink");
CPanel canvas=new CPanel();
public Control_Circle(){
Panel p = new Panel();
p.add(btenlarge);
p.add(btshrink);
this.add(canvas, BorderLayout.CENTER);
this.add(p, BorderLayout.SOUTH);
btenlarge.addActionListener(new EnlargeListener());
btshrink.addActionListener(new ShrinkListener());
}


public static void main(String[] args) {
Frame f = new Control_Circle();
f.setTitle("ControlCircle1");
f.setSize(600, 300);
f.setBackground(Color.green);
f.setVisible(true);
}
class EnlargeListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
canvas.enlarge();
}
}
class ShrinkListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
canvas.shrink();
}}
class CPanel extends Panel
{
private int radius =50;
public void enlarge() {
radius++;
repaint();
}
public void shrink() {
radius--;
repaint();
}
public void paint(Graphics g) {
super.paint(g);
g.setColor(Color.RED);

g.drawOval(getWidth()/2 - radius, getHeight()/2 - radius,2*radius,2*radius);
g.fillOval(getWidth()/2 - radius,getHeight()/2 - radius,2*radius,2*radius);
g.setColor(Color.red);
}
}
}