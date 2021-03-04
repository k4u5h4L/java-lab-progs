
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Prog3 {
    public static void main(String args[]) {
    	JFrame frame = new JFrame();  // creating frame
    	frame.setSize(500, 500); // declaring frame size
    	GridLayout g = new GridLayout(5, 2); // layout of the frame
    	
    	frame.setLayout(g); //layout is set to the frame created
    	
    	JPanel p1 = new JPanel(); // creating panels
    	JPanel p2 = new JPanel();
    	JPanel p3 = new JPanel();
    	JPanel p4 = new JPanel();
    	JPanel p5 = new JPanel();
    	JPanel p6 = new JPanel();
    	JPanel p7 = new JPanel();
    	JPanel p8 = new JPanel();
    	JPanel p9 = new JPanel();
    	JPanel p10 = new JPanel();
    	
    	JLabel l1 = new JLabel("Name"); // creating labels
    	JLabel l2 = new JLabel("ID");
    	JLabel l3 = new JLabel("Date of joining");
    	JLabel l4 = new JLabel("DOB");
    	
    	JTextField f1 = new JTextField(); // create obj for txtfield
    	JTextField f2 = new JTextField();
    	JTextField f3 = new JTextField();
    	JTextField f4 = new JTextField();
    	
    	f1.setPreferredSize(new Dimension(200, 30)); // size of txtfield
		f2.setPreferredSize(new Dimension(200, 30));
		f3.setPreferredSize(new Dimension(200, 30));
		f4.setPreferredSize(new Dimension(200, 30));
    	
    	JButton b1 = new JButton("Submit");
    	JButton b2 = new JButton("Reset");
    	
    	b1.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent ae) {
    			File f = new File("/home/k4u5h4l/java-swing.txt");
    			
    			try {
    				FileWriter fw = new FileWriter(f.getAbsoluteFile(), true);
    				
    				System.out.println("Name: " + f1.getText() + "\nID: " + f2.getText()
    						+ "\nDOJ: " + f3.getText() + "\nDOB: " + f4.getText());
    				
    				fw.write("Name: " + f1.getText() + "\nID: " + f2.getText()
					+ "\nDOJ: " + f3.getText() + "\nDOB: " + f4.getText());
    				
    				fw.close();
    				
    			} catch(Exception e) {
    				e.printStackTrace();    				
    			}
    		}
    	});
    	
    	b2.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent ae) {
    			f1.setText(null);
    			f2.setText(null);
    			f3.setText(null);
    			f4.setText(null);
    		}
    	});
    	
    	p1.add(l1); // add labels to panels where labels=name,id,doj,dob
		p3.add(l2);
		p5.add(l3);
		p7.add(l4);
		p2.add(f1); // add textfield to panels where txtfield is user defined
		p4.add(f2);
		p6.add(f3);
		p8.add(f4);
		p9.add(b1); // add buttons to panel
		p10.add(b2);
		
		frame.add(p1); // add panels to frames
		frame.add(p2);
		frame.add(p3);
		frame.add(p4);
		frame.add(p5);
		frame.add(p6);
		frame.add(p7);
		frame.add(p8);
		frame.add(p9);
		frame.add(p10);
		frame.setVisible(true);
    }
}
