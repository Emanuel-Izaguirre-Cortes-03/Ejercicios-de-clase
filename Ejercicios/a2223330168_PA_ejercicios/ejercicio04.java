package a2223330168_PA_ejercicios;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ejercicio04 extends JFrame implements ActionListener, KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JButton Bcalcular, Bsalir;
	private JTextField Tc;
	private JTextField Tr;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio04 frame = new ejercicio04();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ejercicio04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 195);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("Introduce la Temperatura en Celcius");
		panel_1.add(lblNewLabel_1);
		Tc = new JTextField();
		panel_1.add(Tc);
		Tc.setColumns(10);
		
		panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Bcalcular = new JButton("Calcular");
		panel_2.add(Bcalcular);
		
		this.Bcalcular.addActionListener(this);
		
		panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Temperatura Real");
		panel_3.add(lblNewLabel);
		
		Tr = new JTextField();
		panel_3.add(Tr);
		Tr.setColumns(10);
		
		Bsalir = new JButton("Salir");
		panel.add(Bsalir);
		this.Bsalir.addActionListener(this);
		this.Tc.addKeyListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.Bcalcular) {
			String tc = this.Tc.getText();
			Double c = Double.parseDouble(tc);
			if(c<20) {
				c=c-4;
			}
			else {
				c=c+4;
			}
			this.Tr.setText(c.toString());
		}
		else {
			if(e.getSource() == this.Bsalir) {
				this.dispose();
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		if((!Character.isDigit(c)) && (c!='.')) {
			e.consume();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
