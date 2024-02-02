import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class F001_Frame {
	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame();
		frame.setSize(500, 700);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setTitle("Demo");
		
		JLabel l1 = new JLabel("Registration form");
		l1.setBounds(150, 50, 100, 20);
		JLabel l2 = new JLabel("First Name");
		l2.setBounds(100, 100, 100, 20);
		JTextField f1  =new JTextField();
		f1.setBounds(200, 100, 200, 20);
		
		
		JLabel l3 = new JLabel("Last Name");
		l3.setBounds(100, 130, 100, 20);
		JTextField f2  =new JTextField();
		f2.setBounds(200, 130, 200, 20);
		
		JLabel l4 = new JLabel("Password");
		l4.setBounds(100, 160, 100, 20);
		JPasswordField f3  =new JPasswordField();
		f3.setBounds(200, 160, 200, 20);
		
		JLabel l5 = new JLabel("Gender");
		l5.setBounds(100, 190, 100, 20);
		JRadioButton b1 = new JRadioButton("Male");
		JRadioButton b2 = new JRadioButton("FeMale");
		b1.setBounds(200,190,100,20);
		b2.setBounds(300,190,100,20);
		ButtonGroup group = new ButtonGroup();
		group.add(b1);
		group.add(b2);
		
		JLabel l6 = new JLabel("Language");
		l6.setBounds(100, 220, 100, 20);
		JCheckBox ch1 = new JCheckBox("English");
		JCheckBox ch2 = new JCheckBox("Hindi");
		JCheckBox ch3 = new JCheckBox("Gujarati");
		JCheckBox ch4 = new JCheckBox("Marathi");
		ch1.setBounds(200,220,100,20);
		ch2.setBounds(300,220,100,20);
		ch3.setBounds(200,250,100,20);
		ch4.setBounds(300,250,100,20);
		
		JLabel l7 = new JLabel("P.Language");
		l7.setBounds(100, 280, 100, 20);
		
		String planguage[]={"java","php","python"}; 
		JList<String> planguage1=new JList<String>(planguage);
		planguage1.setBounds(200, 280, 200, 50);
		
		String clist[] = {"India","USA","UK","Canada"};
		JLabel l8 = new JLabel("country");
		l8.setBounds(100, 350, 100, 20);
		JComboBox<String> country = new JComboBox<String>(clist);
		country.setBounds(200, 350, 200, 20);
		
		JLabel l9 = new JLabel("Address");
		l9.setBounds(100, 380, 100, 20);
		JTextArea area = new JTextArea();
		area.setBounds(200, 380, 200, 50);
		
		JButton submit = new JButton("Submit");
		submit.setBounds(100, 450, 300, 20);
		
		
		JMenuBar menubar = new JMenuBar();
		menubar.setBounds(0, 0, 500, 20);
		
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu help = new JMenu("Help");
		JMenu run = new JMenu("Run");
		
		menubar.add(file);
		menubar.add(edit);
		menubar.add(help);
		menubar.add(run);
		
		JMenuItem open = new JMenuItem("Open");
		JMenuItem save = new JMenuItem("Save");
		JMenuItem refresh = new JMenuItem("Refresh");
		
		file.add(open);
		file.add(save);
		file.add(refresh);
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(f1);
		frame.add(f2);
		frame.add(l4);
		frame.add(f3);
		frame.add(l5);
		frame.add(b1);
		frame.add(b2);
		frame.add(l6);
		frame.add(ch1);
		frame.add(ch2);
		frame.add(ch3);
		frame.add(ch4);
		frame.add(l7);
		frame.add(planguage1);
		frame.add(l8);
		frame.add(country);
		frame.add(l9);
		frame.add(area);
		frame.add(submit);
		frame.add(menubar);
	}
}
