import javax.swing.JOptionPane;
public class Shuvo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fn = JOptionPane.showInputDialog("Hey Input the First number!");
		String sn = JOptionPane.showInputDialog("Hey Input the Second number!");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		
		int sum = num1 + num2;
		int diff = num1 - num2;
		
		JOptionPane.showMessageDialog(null, "The summation & difference of the Two number is= "+sum+" "+diff, "The SUM" ,JOptionPane.PLAIN_MESSAGE);
	}
	
	
}
