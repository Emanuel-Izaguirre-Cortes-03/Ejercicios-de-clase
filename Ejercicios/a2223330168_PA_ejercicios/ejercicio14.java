package a2223330168_PA_ejercicios;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ejercicio14 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable Tdatos;
	private DefaultTableModel Mdatos;
	private List lista;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio14 frame = new ejercicio14();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ejercicio14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollPane, "name_688602122764700");
		
		Tdatos = new JTable();
		scrollPane.setViewportView(Tdatos);
		this.CargarDatos();
		this.crearModelo(this.lista);
		Tdatos.setModel(Mdatos);
		this.ConfigurarTable();
	}
	
	public void crearModelo(List datos) {
		String[] nombrecolumnas;
		int[] columnassize;
		Mdatos=new DefaultTableModel();
		Producto nodo=new Producto();
		nombrecolumnas=nodo.ColumnasNombres();
		columnassize=nodo.ColumnasSize();
		int pos=-1;
		for(String nombre:nombrecolumnas)
		Mdatos.addColumn(nombre);
		for(Object aux:datos) {
			Mdatos.addRow(((Producto)aux).ColumnasDatos());
		}
		
	}
	public void ConfigurarTable() {
		int[] columnassize;
		Producto nodo=new Producto();
		columnassize=nodo.ColumnasSize();
		int pos=-1;
		for(int taman:columnassize) {
			pos++;
			this.Tdatos.getColumnModel().getColumn(pos).setPreferredWidth(taman);
		}
	}
	
	public void CargarDatos() {
		lista=new ArrayList();
		lista.add(new Producto("001","Coca Cola 355 Lata"));
		lista.add(new Producto("002","Coca Cola 500 Vidrio"));
		lista.add(new Producto("003","Coca Cola 500 Plastico"));
	}

}
