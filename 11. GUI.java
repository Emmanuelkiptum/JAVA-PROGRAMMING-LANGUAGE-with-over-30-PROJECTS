
import javax.swing.*;

public class GUI1 {

	public static void main(String[] args) {
            Jframe frame = new Jframe();
            
               
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null,"Hello!! "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
		JOptionPane.showMessageDialog(null,"Hello!! " + "You are "+age+" Years old:");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height:"));
		JOptionPane.showMessageDialog(null,"hello!!"+ "You are "+height+" cm tall:");
		
		int kids = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of childrens you have!!:"));
		JOptionPane.showMessageDialog(null,"You have "+kids+" childrens:");
		
	}

}
