package ButtonTest;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JavaSwingTableTest {

	public JavaSwingTableTest() {
		JFrame f = new JFrame();
		String data[] [] = {
				{"12", "Harry", "23"},
				{"34", "Bibek", "54"},
				{"24", "Larry", "34"},
				{"34", "Ram", "36"}
		};
		String[] columns = {"Roll no", "Name", "Marks"};
		
		JTable t = new JTable(data, columns);
		t.setBounds(30, 40, 200, 300);
		
		JScrollPane jp = new JScrollPane(t);
		f.add(jp);
		
		f.setSize(400, 400);
		f.setVisible(true);
		f.setLayout(null);
	}

	public static void main(String[] args) {
		new JavaSwingTableTest();

	}

}
