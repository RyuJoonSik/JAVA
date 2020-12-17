import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComponentEx extends JFrame {

	public JComponentEx() {
		// TODO Auto-generated constructor stub
		super("JComponent의 공통 메서드 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton("	Disabled Button		");
		JButton b3 = new JButton("getX(), getY()");

		b1.setBackground(Color.yellow);
		b1.setForeground(Color.magenta);
		b1.setFont(new Font("Arial", Font.ITALIC, 20));
		b2.setEnabled(false);
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b = (JButton) e.getSource();
				setTitle(b.getX() + ", " + b.getY());
			}
		});

		c.add(b1);
		c.add(b2);
		c.add(b3);

		setSize(260, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JComponentEx();
	}
}