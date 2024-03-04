package a2223330168_PA_ejercicios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ejercicio02 extends JFrame  implements ActionListener{

	private static final long serialVersionUID = 1L;

	private JPanel panel;
	private JButton Bcalcular,Bsalir;
	private JTextField Tc;
	private JTextField Tr;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			try {
			ejercicio02 frame = new ejercicio02();
			frame.setVisible(true);
			}catch(Exception e) {
			e.printStackTrace();
			}	
			}
			});
			}

			/**
			 * Create the frame.
			 */
			public ejercicio02() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100,100,450,300);
			panel = new JPanel();
			panel.setBorder(new EmptyBorder(5,5,5,5));
			setContentPane(panel);
			panel.setLayout(null);
			JLabel lblNewLabel1_1 = new JLabel("Introduce la temperatura en Celcius");
			lblNewLabel1_1.setBounds(31,18,190,14);
			panel.add(lblNewLabel1_1);
			Tc = new JTextField();
			Tc.setBounds(231,15,96,20);
			panel.add(Tc);
			Tc.setColumns(10);

			Bcalcular = new JButton("Oprime");
			Bcalcular.setBounds(172,50,96,23);
			this.panel.add(Bcalcular);

			JLabel lblNesLabel = new JLabel("Temperatura real");
			lblNesLabel.setBounds(31,84,190,14);
			panel.add(lblNesLabel);

			Tr = new JTextField();
			Tr.setColumns(10);
			Tr.setBounds(231,81,96,20);
			panel.add(Tr);

			Bsalir = new JButton("Salir");
			Bsalir.setBounds(171,130,96,23);
			panel.add(Bsalir);

			this.Bcalcular.addActionListener(this);
			this.Bsalir.addActionListener(this);

			}

			@Override
			public void actionPerformed(ActionEvent e) {

			if(e.getSource()== this.Bcalcular)
			{
			String tc = this.Tc.getText();
			Double c = Double.parseDouble(tc);
			if( c<20)
			c=c-4;
			else
			c=c+4;
			this.Tr.setText(c.toString());
			}
			else
				if (e.getSource() == this.Bsalir )

			this.dispose();
		

}

			
}