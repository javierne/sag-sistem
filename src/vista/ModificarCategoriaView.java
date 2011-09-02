package vista;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import negocio.Categoria;

import sistemaAdministracionGanadera.SistemaAdministracionGanadera;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class ModificarCategoriaView extends javax.swing.JPanel {
	private JLabel lblModificarCategoria;
	private JLabel lblIdCategoria;
	private JLabel lblTipo;
	private JLabel lblPesoMacho;
	private JButton btBuscar;
	private JTextField txtPesoHembra;
	private JTextField txtPesoMacho;
	private JButton btModificar;
	private JTextField txtTipo;
	private JTextField txtPesoFHembra;
	private JButton btCancelar;
	private JTextField txtPesoFMacho;
	private JTextField txtIdCategoria;
	private JLabel lblPesoFHembra;
	private JLabel lblPesoFMacho;
	private JLabel lblPesoHembra;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		SistemaAdministracionGanadera sistema=SistemaAdministracionGanadera.getInstancia();
		frame.getContentPane().add(new ModificarCategoriaView(sistema));
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public ModificarCategoriaView(SistemaAdministracionGanadera sistema) {
		super();
		initGUI(sistema);
	}
	
	private void initGUI(SistemaAdministracionGanadera sistema) {
		try {
			GridLayout thisLayout = new GridLayout(8, 1);
			thisLayout.setHgap(5);
			thisLayout.setVgap(5);
			thisLayout.setColumns(1);
			thisLayout.setRows(8);
			this.setLayout(thisLayout);
			setPreferredSize(new Dimension(400, 300));
			{
				lblModificarCategoria =new JLabel();
				this.add(lblModificarCategoria);
				lblModificarCategoria.setText("Modificar Categoria");
				lblIdCategoria = new JLabel();
				FlowLayout lblIdCategoriaLayout1 = new FlowLayout();
				FlowLayout lblIdCategoriaLayout = new FlowLayout();
				this.add(lblIdCategoria);
				lblIdCategoria.setText("ID Categoria");
				lblIdCategoria.setLayout(lblIdCategoriaLayout1);
				{
					txtIdCategoria = new JTextField();
					lblIdCategoria.add(txtIdCategoria);
					txtIdCategoria.setPreferredSize(new java.awt.Dimension(131, 23));
				}
				{
					btBuscar = new JButton();
					lblIdCategoria.add(btBuscar);
					btBuscar.setText("Buscar");
					btBuscar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							Categoria c=sistema.buscarCategoria(Integer.parseInt(txtIdCategoria.getText()));
							if(c!=null){
								txtPesoMacho.setText(Float.toString(c.getPesoMacho()));
								txtPesoHembra.setText(Float.toString(c.getPesoHembra()));
								txtPesoFMacho.setText(Float.toString(c.getPesoFinalM()));
								txtPesoFHembra.setText(Float.toString(c.getPesoFinalH()));
								txtTipo.setText(c.getTipo());
							}else{
								System.out.println("Error al buscar Categoria, categoria no existe ");
							}
							txtTipo.updateUI();
							txtPesoMacho.updateUI();
							txtPesoHembra.updateUI();
							txtPesoFMacho.updateUI();
							txtPesoFHembra.updateUI();
							
						}
					});
				}

			}
			{
				lblTipo = new JLabel();
				FlowLayout lblTipoLayout1 = new FlowLayout();
				FlowLayout lblTipoLayout = new FlowLayout();
				this.add(lblTipo);
				lblTipo.setText("Tipo");
				lblTipo.setLayout(lblTipoLayout1);
				{
					txtTipo = new JTextField();
					lblTipo.add(txtTipo);
					txtTipo.setPreferredSize(new java.awt.Dimension(134, 23));
				}
				{
					btModificar = new JButton();
					lblTipo.add(btModificar);
					btModificar.setText("Modificar");
					btModificar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							int idCategoria=Integer.parseInt(txtIdCategoria.getText());
							String tipo=txtTipo.getText();
							float pesoMacho=Float.parseFloat(txtPesoMacho.getText());
							float pesoHembra=Float.parseFloat(txtPesoHembra.getText());
							float pesoFMacho=Float.parseFloat(txtPesoFMacho.getText());
							float pesoFHembra=Float.parseFloat(txtPesoFHembra.getText());
							sistema.modificarCategoria(idCategoria, tipo, pesoMacho, pesoHembra, pesoFMacho, pesoFHembra);
						}
					});
				}
			}
			{
				lblPesoMacho = new JLabel();
				FlowLayout lblPesoMachoLayout1 = new FlowLayout();
				FlowLayout lblPesoMachoLayout = new FlowLayout();
				this.add(lblPesoMacho);
				lblPesoMacho.setText("Peso Macho");
				lblPesoMacho.setLayout(lblPesoMachoLayout1);
				{
					txtPesoMacho = new JTextField();
					lblPesoMacho.add(txtPesoMacho);
					txtPesoMacho.setPreferredSize(new java.awt.Dimension(123, 23));
				}
				{
					btCancelar = new JButton();
					lblPesoMacho.add(btCancelar);
					btCancelar.setText("Cancelar");
					btCancelar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							removeAll();
							repaint();
							updateUI();
							validate();
						}
					});
				}
			}
			{
				lblPesoHembra = new JLabel();
				FlowLayout lblPesoHembraLayout1 = new FlowLayout();
				FlowLayout lblPesoHembraLayout = new FlowLayout();
				this.add(lblPesoHembra);
				lblPesoHembra.setText("Peso Hebmra");
				lblPesoHembra.setLayout(lblPesoHembraLayout1);
				{
					txtPesoHembra = new JTextField();
					lblPesoHembra.add(txtPesoHembra);
					txtPesoHembra.setPreferredSize(new java.awt.Dimension(96, 23));
				}
			}
			{
				lblPesoFMacho = new JLabel();
				FlowLayout lblPesoFMachoLayout1 = new FlowLayout();
				FlowLayout lblPesoFMachoLayout = new FlowLayout();
				this.add(lblPesoFMacho);
				lblPesoFMacho.setText("Peso Final Macho");
				lblPesoFMacho.setLayout(lblPesoFMachoLayout1);
				{
					txtPesoFMacho = new JTextField();
					lblPesoFMacho.add(txtPesoFMacho);
					txtPesoFMacho.setPreferredSize(new java.awt.Dimension(130, 23));
				}
			}
			{
				lblPesoFHembra = new JLabel();
				FlowLayout lblPesoFHembraLayout1 = new FlowLayout();
				FlowLayout lblPesoFHembraLayout = new FlowLayout();
				this.add(lblPesoFHembra);
				lblPesoFHembra.setText("Peso Final Hembra");
				lblPesoFHembra.setLayout(lblPesoFHembraLayout1);
				{
					txtPesoFHembra = new JTextField();
					lblPesoFHembra.add(txtPesoFHembra);
					txtPesoFHembra.setPreferredSize(new java.awt.Dimension(154, 23));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
