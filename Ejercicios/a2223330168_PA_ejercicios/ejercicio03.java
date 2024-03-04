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

public class ejercicio03 extends JFrame  implements ActionListener{
	
    private JPanel panel;
    private JButton Bcalcular, Bsalir;
    private JTextField Tc, Td, Tr;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ejercicio03 frame = new ejercicio03();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame
     */
    public ejercicio03() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 195);
        panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panel);
        panel.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Introduce la base");
        lblNewLabel_1.setBounds(31, 18, 190, 14);
        panel.add(lblNewLabel_1);
        Tc = new JTextField();
        Tc.setBounds(220, 15, 190, 20);
        panel.add(Tc);
        Tc.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Introduce la altura");
        lblNewLabel_2.setBounds(31, 53, 190, 14);
        panel.add(lblNewLabel_2);
        Td = new JTextField();
        Td.setBounds(220, 43, 190, 20);
        panel.add(Td);
        Td.setColumns(10);

        Bcalcular = new JButton("Calcular");
        Bcalcular.setBounds(273, 68, 96, 23);
        this.panel.add(Bcalcular);

        JLabel lblnewLabel = new JLabel("El area es: ");
        lblnewLabel.setBounds(73, 77, 190, 14);
        panel.add(lblnewLabel);

        Tr = new JTextField();
        Tr.setColumns(10);
        Tr.setBounds(144, 74, 96, 20);
        panel.add(Tr);

        Bsalir = new JButton("Salir");
        Bsalir.setBounds(167, 105, 96, 23);
        panel.add(Bsalir);

        this.Bcalcular.addActionListener(this);
        this.Bsalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.Bcalcular) {
            String tc = this.Tc.getText();
            String td = this.Td.getText();
            Double c = Double.parseDouble(tc);
            double d = Double.parseDouble(td);
            c = c * d / 2;
            this.Tr.setText(c.toString());
        } else if (e.getSource() == this.Bsalir) {
            this.dispose();
        }
    }
		
		
	}


