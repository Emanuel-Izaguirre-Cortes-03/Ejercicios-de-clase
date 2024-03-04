package a2223330168_PA_ejercicios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;

public class ejercicio12 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 6095969709455213739L;
	private JPanel contentPane;
	private JComboBox Cdatos;
	JRadioButton RFutbol, RBasketball;
	private ButtonGroup grupo;
	private String []Cnba={"Celtics","Bucks","Nuggets","Clipper","Pelicans","Heats"};
	private String []Cnfl={"49s","Chiefs","Baven","Lions","Bills","Buccanner"};
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio12 frame = new ejercicio12();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public ejercicio12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		RBasketball = new JRadioButton("NBA");
		RBasketball.setBounds(70, 10, 45, 23);
		contentPane.add(RBasketball);
		
	    Cdatos = new JComboBox();
		Cdatos.setBounds(142, 37, 139, 22);
		contentPane.add(Cdatos);
		
		RFutbol = new JRadioButton("NFL");
		RFutbol.setBounds(312, 10, 43, 23);
		contentPane.add(RFutbol);
		grupo=new ButtonGroup();
		grupo.add(this.RBasketball);
		grupo.add(RFutbol);
		
		this.RBasketball.setSelected(true);
		this.RBasketball.addActionListener(this);
		this.RFutbol.addActionListener(this);
		this.cargadatos();
		
	}

	public void cargadatos()
	{ 

		this.Cdatos.removeAllItems();
		
		this.Cdatos.repaint();
	if(this.RBasketball.isSelected())
		for(String nodo:this.Cnba)
			this.Cdatos.addItem(nodo);
	else
		for(String nodo: this.Cnfl)
			this.Cdatos.addItem(nodo);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		this.cargadatos();
		
	}

}
