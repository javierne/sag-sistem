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
import javax.swing.JPanel;
import javax.swing.JTextField;

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
public class NuevoRodeoView extends javax.swing.JPanel {
	private JLabel lblNuevoRodeo;
	private JTextField txtIdRodeo;
	private JTextField txtCategoria;
	private JLabel lblIdCategoria;
	private JTextField txtFecha;
	private JTextField txtRaza;
	private JButton btAceptar;
	private JButton btCancelar;
	private JPanel jPanel2;
	private JPanel jPanel3;
	private JPanel jPanel1;
	private JPanel jPanel4;
	private JLabel lblFecha;
	private JLabel lblRaza;
	private JLabel lblIdRodeo;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new NuevoRodeoView());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public NuevoRodeoView() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GridLayout thisLayout = new GridLayout(5, 1);
			thisLayout.setHgap(5);
			thisLayout.setVgap(5);
			thisLayout.setColumns(1);
			thisLayout.setRows(6);
			this.setLayout(thisLayout);
			setPreferredSize(new Dimension(400, 300));
			{
				lblNuevoRodeo = new JLabel();
				this.add(lblNuevoRodeo);
				lblNuevoRodeo.setText("Nuevo Rodeo");
			}
			{
				lblIdRodeo = new JLabel();
				this.add(lblIdRodeo);
				FlowLayout lblIdRodeoLayout = new FlowLayout();
				lblIdRodeoLayout.setHgap(10);
				lblIdRodeo.setLayout(lblIdRodeoLayout);
				lblIdRodeo.setText("ID Rodeo");
				{
					txtIdRodeo = new JTextField();
					lblIdRodeo.add(txtIdRodeo);
					txtIdRodeo.setPreferredSize(new java.awt.Dimension(251, 47));
				}
			}
			{
				lblIdCategoria = new JLabel();
				FlowLayout lblIdCategoriaLayout = new FlowLayout();
				lblIdCategoria.setLayout(lblIdCategoriaLayout);
				this.add(lblIdCategoria);
				lblIdCategoria.setText("ID Categoria");
				{
					txtCategoria = new JTextField();
					lblIdCategoria.add(txtCategoria);
					txtCategoria.setBounds(158, 56, 10, 23);
					txtCategoria.setPreferredSize(new java.awt.Dimension(206, 38));
				}
			}
			{
				lblRaza = new JLabel();
				FlowLayout lblRazaLayout = new FlowLayout();
				lblRaza.setLayout(lblRazaLayout);
				this.add(lblRaza);
				lblRaza.setText("Raza");
				{
					txtRaza = new JTextField();
					lblRaza.add(txtRaza);
					txtRaza.setPreferredSize(new java.awt.Dimension(238, 46));
				}
			}
			
			{
				
					lblFecha = new JLabel();
					FlowLayout lblFechaLayout = new FlowLayout();
					lblFecha.setLayout(lblFechaLayout);
				
				this.add(lblFecha);
				lblFecha.setText("Fecha");
				{
					txtFecha = new JTextField();
					lblFecha.add(txtFecha);
					txtFecha.setPreferredSize(new java.awt.Dimension(252, 43));
				}
			}
			{
				jPanel2 = new JPanel();
				GridLayout jPanel2Layout = new GridLayout(1, 2);
				jPanel2Layout.setHgap(5);
				jPanel2Layout.setVgap(5);
				jPanel2Layout.setColumns(2);
				jPanel2.setLayout(jPanel2Layout);
				this.add(jPanel2);
				{
					btAceptar = new JButton();
					btAceptar.setText("Aceptar");
					btAceptar.setPreferredSize(new java.awt.Dimension(193, 38));
					btCancelar=new JButton();
					btCancelar.setText("Cancelar");
					jPanel2.add(btCancelar);
					btCancelar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							removeAll();
							repaint();
							updateUI();
							validate();
						}
					});
					jPanel2.add(btAceptar);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
