package a2223330168_PA_ejercicios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class ejercicio013 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JList Cdatos;
	private ButtonGroup grupo;
	private ArrayList lista;
	private DefaultListModel modelo;
	private JButton Beliminar;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio013 frame = new ejercicio013();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ejercicio013() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		modelo = new DefaultListModel();
		grupo = new ButtonGroup();
		
		Beliminar = new JButton("Eliminar");
		Beliminar.setBounds(169, 221, 85, 21);
		contentPane.add(Beliminar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(123, 45, 175, 93);
		contentPane.add(scrollPane);
		Cdatos = new JList();
		scrollPane.setViewportView(Cdatos);
		Cdatos.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if(Cdatos.getSelectedIndex()>-1) {
					Producto nodo = (Producto) Cdatos.getSelectedValue();
					ejercicio013.this.setTitle(nodo.getProducto());
				}
			}
		});
		Cdatos.setModel(modelo);
		this.cargadatos();

		this.Beliminar.addActionListener(this);
	}
	
	public void cargadatos() {
		lista = new ArrayList();
		lista.add(new Producto("001", "Cocacola"));
		lista.add(new Producto("002", "Dr Peper"));
		lista.add(new Producto("003", "Escuis"));
		lista.add(new Producto("004", "Caballito"));
		lista.add(new Producto("005", "Jarritos"));
		this.modelo.addAll(lista);
	}
	
	public void eliminar(Producto parametro){
		Iterator<Producto> listatemp = this.lista.iterator();
		while(listatemp.hasNext()) {
			Producto nodo = listatemp.next();
			System.out.println(nodo.getId() + "   " + parametro.getId());
			if(nodo!=null) {
				
			}
			if(nodo.equals(parametro)) {
				listatemp.remove();
				break;
			}
		}
		this.Cdatos.setSelectedIndex(1);
		this.modelo.removeAllElements();
		this.modelo.addAll(lista);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int pos=Cdatos.getSelectedIndex();
		if(pos>-1) {
			//Producto nodo = (Producto) this.Cdatos.getSelectedItem();
			//this.setTitle("Código " + nodo.getId());
		}
		if(e.getSource()==this.Beliminar) {
			if(pos>-1) {
				Producto nodo = (Producto) this.Cdatos.getSelectedValue();
				this.eliminar(nodo);
			}
		}
	}
}

