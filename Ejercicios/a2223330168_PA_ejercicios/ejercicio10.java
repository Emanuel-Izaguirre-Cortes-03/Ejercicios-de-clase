package a2223330168_PA_ejercicios;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class ejercicio10 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio10 frame = new ejercicio10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private JCheckBox Cuadro1,Cuadro2;
	private JRadioButton Radio1, Radio2;
	private ButtonGroup grupo;


	public ejercicio10() {
		
		grupo = new ButtonGroup();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		Cuadro1 = new JCheckBox("New check box");
		GridBagConstraints gbc_Cuadro1 = new GridBagConstraints();
		gbc_Cuadro1.insets = new Insets(0, 0, 5, 5);
		gbc_Cuadro1.gridx = 0;
		gbc_Cuadro1.gridy = 1;
		contentPane.add(Cuadro1, gbc_Cuadro1);
		
		Cuadro2 = new JCheckBox("New check box");
		GridBagConstraints gbc_Cuadro2 = new GridBagConstraints();
		gbc_Cuadro2.insets = new Insets(0, 0, 5, 0);
		gbc_Cuadro2.gridx = 2;
		gbc_Cuadro2.gridy = 1;
		contentPane.add(Cuadro2, gbc_Cuadro2);
		
		Radio1 = new JRadioButton("New radio button");
		GridBagConstraints gbc_Radio1 = new GridBagConstraints();
		gbc_Radio1.insets = new Insets(0, 0, 5, 5);
		gbc_Radio1.gridx = 0;
		gbc_Radio1.gridy = 3;
		contentPane.add(Radio1, gbc_Radio1);
		
		Radio2 = new JRadioButton("New radio button");
		GridBagConstraints gbc_Radio2 = new GridBagConstraints();
		gbc_Radio2.insets = new Insets(0, 0, 5, 0);
		gbc_Radio2.gridx = 2;
		gbc_Radio2.gridy = 3;
		contentPane.add(Radio2, gbc_Radio2);
		
		
		
		this.Radio1.addActionListener(this);
		this.Radio2.addActionListener(this);
		this.Cuadro1.addActionListener(this);
		this.Cuadro2.addActionListener(this);
		this.grupo.add(this.Radio1);
		this.grupo.add(this.Radio2);
	}
	
	public String Radioseleccionado() {
		
		String cadena=" ";
		if(this.Radio1.isSelected())
			cadena += " Radio 1 ";
		if(this.Radio2.isSelected())
			cadena += " Radio 2 ";
		if(this.Cuadro1.isSelected())
			cadena += " Cuadro 1 ";
		if(this.Cuadro2.isSelected())
			cadena += " Cuadro 2 ";
		return cadena;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.Cuadro1) 
			this.setTitle(this.Radioseleccionado());
			else
				if(e.getSource()==this.Cuadro2) 
					this.setTitle(this.Radioseleccionado());
				else
					if(e.getSource()==this.Radio1)
						this.setTitle(this.Radioseleccionado());
					else
						if(e.getSource()==this.Radio2)
							this.setTitle(this.Radioseleccionado());
		}

}
