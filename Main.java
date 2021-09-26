import package.frame.Scene;

import javax.swing.JFrame;

public class Main {
    public static Scene s;

    public static void main(String[] args) {

		JFrame frame = new JFrame("Astro"); 
		
		frame.setSize(600,335);
        frame.setResizable(false); 
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        s=new Scene();
        frame.setContentPane(s); 
        frame.setVisible(true); 
  }
}