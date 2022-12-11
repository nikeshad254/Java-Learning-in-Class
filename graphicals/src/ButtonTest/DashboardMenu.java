package ButtonTest;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class DashboardMenu {
	
	public DashboardMenu() {
		JFrame jf = new JFrame();
		
		JMenuBar jb = new JMenuBar();	//create menu bar
		
		//declare menu
		JMenu file = new JMenu("File");	
		JMenu account = new JMenu("Account");
		JMenu logout = new JMenu("Logout");
		
		//add items to file menu
		JMenuItem item1 = new JMenuItem("Edit");
		JMenuItem item2 = new JMenuItem("Copy");
		JMenuItem item3 = new JMenuItem("Paste");
		file.add(item1);
		file.add(item2);
		file.add(item3);
		
		//add items to account menu
		JMenuItem aitem1 = new JMenuItem("Info");
		JMenuItem aitem2 = new JMenuItem("Payable");
		JMenuItem aitem3 = new JMenuItem("Salary");
		account.add(aitem1);
		account.add(aitem2);
		account.add(aitem3);
		
		//add menu to the menu bar
		jb.add(file);
		jb.add(account);
		jb.add(logout);
		
		
		JLabel jl = new JLabel("weclome to dashboard");
		jl.setBounds(200, 200, 200, 30);
		jf.add(jl);
		
		jf.setJMenuBar(jb);	//set menu bar to the frame jf
		jf.setSize(600, 600);
		jf.setLayout(null);
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		new DashboardMenu();
	}

}
