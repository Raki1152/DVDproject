import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Read_Delete extends JFrame{
	public Read_Delete(){
		JFrame frm = new JFrame(); 
		frm.setTitle("Â¼Èë&É¾³ý");
		frm.setLayout(null);
		frm.setBounds(0, 0, 450, 300);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
		
		JButton k = new JButton("Â¼Èë");
		k.setBounds(15, 65, 80, 30);
		frm.getContentPane().add(k);
		kButtonHandler kHandler = new kButtonHandler();
		k.addActionListener(kHandler);
		
		JButton j = new JButton("É¾³ý");
		j.setBounds(15, 115, 80, 30);
		frm.getContentPane().add(j);
		jButtonHandler jHandler = new jButtonHandler();
		j.addActionListener(jHandler);
		
		JButton n = new JButton("ÍË³ö");
		n.setBounds(15, 165, 80, 30);
		frm.getContentPane().add(n);
		nButtonHandler nHandler = new nButtonHandler();
		n.addActionListener(nHandler);
		
		ImagePanel ip = new ImagePanel();
		ip.setBounds(110, 10, 300, 230);
		frm.getContentPane().add(ip);
	}
	
	class ImagePanel extends JPanel{
		Image img;
		
		public void paint(Graphics g){
			try{
				img = ImageIO.read(new File("./DVD_1.png"));
			}catch(IOException e){
				e.printStackTrace();
			}
			g.drawImage(img, 0, 0, 300, 300, null);
		}
	}
	
	class kButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try{
				Read r = new Read();
			}catch(Exception e_r){
				e_r.printStackTrace();
			}
		}
	}
	
	class jButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Delete d = new Delete();
		}
	}
	
	class nButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("ÍË³ö");
		}
	}
	
	public static void main(String[] args) {
		Read_Delete r_d = new Read_Delete();
	}
}