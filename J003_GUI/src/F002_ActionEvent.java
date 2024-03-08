import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class F002_ActionEvent implements ActionListener {
	
	JButton add,sub,mul,div;
	JTextField t1,t2,t3;
	public F002_ActionEvent() {
		JFrame frame = new JFrame("Demo");
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		
		JLabel l1 = new JLabel("Enter number");
		 t1 = new JTextField(5);
		JLabel l2 = new JLabel("Enter number");
		 t2 = new JTextField(5);
		JLabel l3 = new JLabel("result");
		 t3 = new JTextField(5);
		
		 add = new JButton("Add");
		 sub = new JButton("SUB");
		 mul = new JButton("MUL");
		 div = new JButton("DIV");
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		
//		add.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				int a  = Integer.parseInt(t1.getText());
//				int b =  Integer.parseInt(t2.getText());
//				
//				int c = a+b;
//				t3.setText(c+"");
//				
//			}
//		});
		
		frame.add(l1);
		frame.add(t1);
		frame.add(l2);
		frame.add(t2);
		frame.add(l3);
		frame.add(t3);
		frame.add(add);
		frame.add(sub);
		frame.add(mul);
		frame.add(div);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		int a  = Integer.parseInt(t1.getText());
		int b =  Integer.parseInt(t2.getText());
		if(e.getSource()==add)
		{
			int c = a+b;
			t3.setText(c+"");
		}
		else if(e.getSource()==sub)
		{
			int c = a-b;
			t3.setText(c+"");
		}
		else if(e.getSource()==mul)
		{
			int c = a*b;
			t3.setText(c+"");
		}
		else if(e.getSource()==div)
		{
			int c = a/b;
			t3.setText(c+"");
		}
		
	}
	
	public static void main(String[] args) {
		
		F002_ActionEvent f = new F002_ActionEvent();
		
	}

	
}
