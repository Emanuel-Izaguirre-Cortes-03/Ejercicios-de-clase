package a2223330168_PA_ejercicios;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JButton;
public class ejercicio012_b extends JFrame implements ActionListener{
	private static final long serialVersionUID = 6095969709455213739L;
	private JPanel contentPane;
	private JComboBox CDatos;
	JRadioButton RFutbol, RBasketball;
	private ButtonGroup grupo;
	private ArrayList<Producto> lista;
	private DefaultComboBoxModel modelo;
	private JButton Belminar;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio012_b frame = new ejercicio012_b();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public ejercicio012_b() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5,5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		RBasketball = new JRadioButton("NBA");
		RBasketball.setBounds(79, 7, 111, 23);
		contentPane.add(RBasketball);
		
		RFutbol = new JRadioButton("NFL");
		RFutbol.setBounds(272, 7, 78, 22);
		contentPane.add(RFutbol);
		
		modelo = new DefaultComboBoxModel();
		CDatos = new JComboBox();
		CDatos.setModel(modelo);
		CDatos.setBounds(131,72,149,21);
		contentPane.add(CDatos);
		grupo=new ButtonGroup();
		grupo.add(this.RBasketball);
		grupo.add(RFutbol);
		
		this.RBasketball.setSelected(true);
		
		JButton Beliminar = new JButton("Eliminar");
		Beliminar.setBounds(159, 140, 85, 21);
		contentPane.add(Beliminar);
		this.RBasketball.addActionListener(this);
		this.RFutbol.addActionListener(this);
		this.cargadatos();
		
	}

	public void cargadatos()
	{ 
		lista = new ArrayList();
		lista.add(new Producto("001","CocaCola"));
		lista.add(new Producto("002","Dr Peper"));
		lista.add(new Producto("003","Escuis"));
		lista.add(new Producto("004","Caballito"));
		lista.add(new Producto("005","Jarrito"));
		this.modelo.addAll(lista);
		
	}
	
	public void eliminar(String id) {
		
		Iterator<Producto> listatemp = this.lista.iterator();
		while (listatemp.hasNext()) {
			
			Producto nodo = listatemp.next();
			if(id.compareTo(nodo.getId())==0)
				listatemp.remove();
		}
		this.modelo.removeAllElements();
		this.modelo.addAll(lista);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		int pos=CDatos.getSelectedIndex();
		if(pos>-1) {
			Producto nodo = (Producto) this.CDatos.getSelectedItem();
				this.setTitle("Codigo "+nodo.getId());
		}
		if(e.getSource()==this.Belminar);
		
			if(pos>-1) {
				
				Producto nodo = (Producto) this.CDatos.getSelectedItem();
				this.eliminar(nodo.getId());
			}
			
	}

}
