package Producto_Integrador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Parte1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parte1 frame = new Parte1();
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
	public Parte1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu ventas = new JMenu("Ventas");
		menuBar.add(ventas);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		ventas.add(mntmNewMenuItem);
		
		JMenu almacen = new JMenu("Almacen");
		menuBar.add(almacen);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		almacen.add(mntmNewMenuItem_1);
		
		JMenu configuracion = new JMenu("Configuracion");
		menuBar.add(configuracion);
		
		JMenu productos = new JMenu("Productos");
		configuracion.add(productos);
		
		JMenu salida = new JMenu("Salida");
		menuBar.add(salida);
		
		JMenu salir = new JMenu("Salir");
		salida.add(salir);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0};
		gbl_contentPane.rowHeights = new int[]{0};
		gbl_contentPane.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
	}

}
