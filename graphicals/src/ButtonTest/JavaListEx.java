package ButtonTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionListener;

public class JavaListEx {

	public JavaListEx() {
		
		JFrame f = new JFrame();
		
		
		DefaultListModel<String> l = new DefaultListModel();
		
		l.addElement("Item 1");
		l.addElement("Item 2");
		l.addElement("Item 3");
		l.addElement("Item 4");
		
		JList<String> list = new JList(l);
		list.setBounds(100, 100, 105, 75);
		f.add(list);
		
		JButton btn = new JButton("click");
		btn.setBounds(100, 200, 100, 30);
		f.add(btn);
		
		JLabel lbl = new JLabel();
		lbl.setBounds(100, 250, 200, 30);
		f.add(lbl);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lbl.setText("nothing selected");
				
				if(list.getSelectedIndex() != -1) {
					lbl.setText(list.getSelectedValue());
				}
				
				
			}
		});
			
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new JavaListEx();

	}

}
