package ButtonTest;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class JsliderTest {

	public JsliderTest() {
		JFrame f = new JFrame();
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,0,50,25);
		f.add(slider);
		
		slider.setMinorTickSpacing(2);
		slider.setMajorTickSpacing(10);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		
		f.pack();
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new JsliderTest();

	}

}
