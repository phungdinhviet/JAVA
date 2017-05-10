/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pheptoan;
import java.awt.*;
import java.awt.event.*;


public class PhepToan extends Frame implements ActionListener, WindowListener {
	
	private Label lblA;
	private Label lblB;
	private TextField tfA;
	private TextField tfB;
	private Button btcong;
	private Button bttru;
	private Button btnhan;
	private Button btchia;
	private Label lblkq;
	private TextField tfkq;

	
	public PhepToan(){
		setLayout(new FlowLayout());
		
		lblA = new Label(" a= ");
		add(lblA);
		tfA = new TextField("",20);
		add(tfA);
		
		lblB = new Label(" b= ");
		add(lblB);
		tfB = new TextField("",20);
		add(tfB);
		
		btcong = new Button ("     +     ");
		add(btcong);
		btcong.addActionListener(this);
		
		bttru = new Button ("     -     ");
		add(bttru);
		bttru.addActionListener(this);
		btnhan = new Button ("     *     ");
		add(btnhan);
		btnhan.addActionListener(this);
		btchia = new Button ("     /     ");
		add(btchia);
		btchia.addActionListener(this);
		
		addWindowListener(this);
		
		lblkq = new Label(" kq=");
		add(lblkq);
		tfkq = new TextField("",20);
		tfkq.setEditable(false);
		add(tfkq);
		
		
		
		
		
		setTitle("phép toán ");
		setSize(250, 200);
		setVisible(true); 
	}


	public static void main(String[] args) {
		PhepToan app = new PhepToan();

	}


	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btcong){
		double tong;
	    double a = Double.parseDouble(tfA.getText());
	    double b = Double.parseDouble(tfB.getText());
	     tong= a+ b;
	      // hien thi gia tri tren textfield
	      tfkq.setText(tong + ""); // chuyen doi in sang string
		}
		else if (e.getSource()==bttru){
		double hieu;
	    double a = Double.parseDouble(tfA.getText());
	    double b = Double.parseDouble(tfB.getText());
	     hieu= a- b;
	      // hien thi gia tri tren textfield
	      tfkq.setText(hieu + ""); // chuyen doi in sang string
		}
		if (e.getSource()==btnhan){
		double tich;
	    double a = Double.parseDouble(tfA.getText());
	    double b = Double.parseDouble(tfB.getText());
	     tich= a * b;
	      // hien thi gia tri tren textfield
	      tfkq.setText(tich + ""); // chuyen doi in sang string
		}
		if (e.getSource()==btchia){
		double thuong;
	    double a = Double.parseDouble(tfA.getText());
	    double b = Double.parseDouble(tfB.getText());
	     thuong= a / b;
	      // hien thi gia tri tren textfield
	      tfkq.setText(thuong + ""); // chuyen doi in sang string
		}
		
	}
	   public void windowClosing(WindowEvent evt) {
		      System.exit(0);  // Terminate the program
		   }
		 
		   // Not Used, but need to provide an empty body to compile.
		 public void windowOpened(WindowEvent evt) { }
		 public void windowClosed(WindowEvent evt) { }
		 public void windowIconified(WindowEvent evt) { }
		 public void windowDeiconified(WindowEvent evt) { }
		 public void windowActivated(WindowEvent evt) { }
		 public void windowDeactivated(WindowEvent evt) { }
	


}
