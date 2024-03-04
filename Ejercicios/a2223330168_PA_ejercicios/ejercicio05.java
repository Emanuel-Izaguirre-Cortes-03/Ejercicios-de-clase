package a2223330168_PA_ejercicios;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio05 extends JFrame implements ActionListener{
	private JPanel Pane;
	 private JTextField Tinicio;
	 private JTextField Tdetener;
	 private JTextField Ttranscurrido;
	 long stopTime, tiempoInicio, tiempofinal; 
	 long tiempoTranscurrido;
	 JButton Binicio, Bdetener, Bsalir;
	 JLabel lblNewLabel, lblNewLabel_1, lblNewLabel_2;
	 private JButton Breiniciar;


	 /**
	 * Launch the application.
	 */
	 public static void main(String[] args) {
	 EventQueue.invokeLater(new Runnable() {
	 public void run() {
	 try {
	 ejercicio05 frame = new ejercicio05();
	 frame.setVisible(true);
	 } catch (Exception e) {
	 e.printStackTrace();
	 }
	 }
	 });
	 }

	 /**
	 * Create the frame.
	 */
	 public ejercicio05() {
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setBounds(100, 100, 313, 192);
	 Pane = new JPanel();
	 Pane.setBorder(new EmptyBorder(5, 5, 5, 5));

	 setContentPane(Pane);
	 GridBagLayout gbl_Pane = new GridBagLayout();
	 gbl_Pane.columnWidths = new int[] {30, 0, 0, 30, 0, 10};
	 gbl_Pane.rowHeights = new int[] {30, 0, 0, 30, 0, 10};
	 gbl_Pane.columnWeights = new double[]{0.0, 0.0, 1.0, 
	Double.MIN_VALUE};
	 gbl_Pane.rowWeights = new double[]{0.0, 0.0, 0.0, 
			 Double.MIN_VALUE};
			  Pane.setLayout(gbl_Pane);

			  Binicio = new JButton("Iniciar");
			  Binicio.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
			  }
			  });
			  GridBagConstraints gbc_Binicio = new GridBagConstraints();
			  gbc_Binicio.insets = new Insets(0, 0, 5, 5);
			  gbc_Binicio.gridx = 0;
			  gbc_Binicio.gridy = 0;
			  Pane.add(Binicio, gbc_Binicio);

			  lblNewLabel = new JLabel("Tiempo de Inicio");
			  GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			  gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
			  gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			  gbc_lblNewLabel.gridx = 1;
			  gbc_lblNewLabel.gridy = 0;
			  Pane.add(lblNewLabel, gbc_lblNewLabel);

			  Tinicio = new JTextField();
			  GridBagConstraints gbc_Tinicio = new GridBagConstraints();
			  gbc_Tinicio.gridwidth = 4;
			  gbc_Tinicio.insets = new Insets(0, 0, 5, 0);
			  gbc_Tinicio.fill = GridBagConstraints.HORIZONTAL;
			  gbc_Tinicio.gridx = 2;
			  gbc_Tinicio.gridy = 0;
			  Pane.add(Tinicio, gbc_Tinicio);
			  Tinicio.setColumns(10);

			  Bdetener = new JButton("Detener");
			  GridBagConstraints gbc_Bdetener = new GridBagConstraints();
			  gbc_Bdetener.anchor = GridBagConstraints.NORTH;
			  gbc_Bdetener.insets = new Insets(0, 0, 5, 5);
			  gbc_Bdetener.gridx = 0;
			  gbc_Bdetener.gridy = 1;
			  Pane.add(Bdetener, gbc_Bdetener);

			  lblNewLabel_1 = new JLabel("Tiempo de Detener");
			  GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints
			 ();
			  gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
			  gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
			  gbc_lblNewLabel_1.gridx = 1;
			  Pane.add(lblNewLabel_1, gbc_lblNewLabel_1);

			  Tdetener = new JTextField();
			  GridBagConstraints gbc_Tdetener = new GridBagConstraints();
			  gbc_Tdetener.gridwidth = 4;
			  gbc_Tdetener.insets = new Insets(0, 0, 5, 0);
			  gbc_Tdetener.fill = GridBagConstraints.HORIZONTAL;
			  gbc_Tdetener.gridx = 2;
			  gbc_Tdetener.gridy = 1;
			  Pane.add(Tdetener, gbc_Tdetener);
			  Tdetener.setColumns(10);

			  Bsalir = new JButton("Salir");
			  GridBagConstraints gbc_Bsalir = new GridBagConstraints();
			  gbc_Bsalir.insets = new Insets(0, 0, 5, 5);
			  gbc_Bsalir.gridx = 0;
			  gbc_Bsalir.gridy = 2;
			  Pane.add(Bsalir, gbc_Bsalir);

			  lblNewLabel_2 = new JLabel("Tiempo Transcurrido");
			  GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints
			 ();
			  gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
			  gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
			  gbc_lblNewLabel_2.gridx = 1;
			  gbc_lblNewLabel_2.gridy = 2;
			  Pane.add(lblNewLabel_2, gbc_lblNewLabel_2);

			  Ttranscurrido = new JTextField();
			  GridBagConstraints gbc_Ttranscurrido = new GridBagConstraints
			 ();
			  gbc_Ttranscurrido.insets = new Insets(0, 0, 5, 0);
			  gbc_Ttranscurrido.gridwidth = 4;
			  gbc_Ttranscurrido.fill = GridBagConstraints.HORIZONTAL;
			  gbc_Ttranscurrido.gridx = 2;
			  gbc_Ttranscurrido.gridy = 2;
			  Pane.add(Ttranscurrido, gbc_Ttranscurrido);
			  Ttranscurrido.setColumns(10);

			  Breiniciar = new JButton("Reiniciar");
			  GridBagConstraints gbc_Breiciciar = new GridBagConstraints();
			  gbc_Breiciciar.fill = GridBagConstraints.HORIZONTAL;
			  gbc_Breiciciar.gridwidth = 6;
			  gbc_Breiciciar.insets = new Insets(0, 0, 5, 5);
			  gbc_Breiciciar.gridx = 0;
			  gbc_Breiciciar.gridy = 4;
			  Pane.add(Breiniciar, gbc_Breiciciar);
			  this.Binicio.addActionListener(this);
			  this.Bdetener.addActionListener(this);
			  this.Bsalir.addActionListener(this);
			  this.Breiniciar.addActionListener(this);
			  }



			  public void limpieza() {
			  this.Tinicio.setText("");
			  this.Tdetener.setText("");
			  this.Bsalir.setText("");
			  this.tiempofinal=0;
			  }


			  @Override
			  public void actionPerformed(ActionEvent e) {
			  if(e.getSource() == this.Bsalir) {
			  this.dispose();
			  }else {
			  if(e.getSource() == this.Binicio) {
			  this.tiempoInicio = System.currentTimeMillis()/1000;
			  this.Tinicio.setText
			 (String.valueOf(this.tiempoInicio));
			  }else {
			  if(e.getSource()==this.Bdetener) {
			  this.tiempofinal= System.currentTimeMillis()/1000;
			  this.Tdetener.setText
			 (String.valueOf(this.tiempofinal));
			  this.tiempoTranscurrido=
			 (this.tiempofinal-this.tiempoInicio);
			  this.Ttranscurrido.setText
			 (String.valueOf(this.tiempoTranscurrido));
			  }else {
			  if(e.getSource()==this.Breiniciar) {
				  	this.limpieza();
			  		}
			  
				}
			}
		}
	}
				
}
