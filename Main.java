package BB;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame obj =new JFrame();
		GamePlay gameplay=new GamePlay();
		obj.setBounds(450,30,700,600);
		obj.setTitle("Brick Breaker");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gameplay);
		// TODO Auto-generated method stub

	}

}
