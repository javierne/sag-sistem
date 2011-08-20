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

import controlador.Sistema;

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
public class ActualizarRodeoViw extends javax.swing.JPanel {
	private JLabel lblActualizarRodeo;
	private JTextField txtIdRodeo;
	private JTextField txtIdCategoria;
	private JButton btAceptar;
	private JButton btCancelar;
	private JPanel jPanel2;
	private JLabel lblIdCategoria;
	private JLabel lblIdRodeo;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Sistema sistema=Sistema.getInstancia();
		frame.getContentPane().add(new ActualizarRodeoViw(sistema));
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public ActualizarRodeoViw(Sistema sistema) {
		super();
		initGUI(sistema);
	}
	
	private void initGUI(final Sistema sistema) {
		try {
			GridLayout thisLayout = new GridLayout(5, 1);
			thisLayout.setHgap(5);
			thisLayout.setVgap(5);
			thisLayout.setColumns(1);
			thisLayout.setRows(5);
			this.setLayout(thisLayout);
			setPreferredSize(new Dimension(400, 300));
			{
				lblActualizarRodeo = new JLabel();
				this.add(lblActualizarRodeo);
				lblActualizarRodeo.setText("Actualizar Rodeo");
			}
			{
				lblIdRodeo = new JLabel();
				FlowLayout lblIdRodeoLayout = new FlowLayout();
				lblIdRodeo.setLayout(lblIdRodeoLayout);
				this.add(lblIdRodeo);
				lblIdRodeo.setText("ID Rodeo");
				{
					txtIdRodeo = new JTextField();
					lblIdRodeo.add(txtIdRodeo);
					txtIdRodeo.setPreferredSize(new java.awt.Dimension(185, 55));
				}
			}
			{
				lblIdCategoria = new JLabel();
				FlowLayout lblIdCategoriaLayout = new FlowLayout();
				lblIdCategoria.setLayout(lblIdCategoriaLayout);
				this.add(lblIdCategoria);
				lblIdCategoria.setText("ID Categoria");
				{
					txtIdCategoria = new JTextField();
					lblIdCategoria.add(txtIdCategoria);
					txtIdCategoria.setPreferredSize(new java.awt.Dimension(179, 44));
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
					FlowLayout btAceptarLayout = new FlowLayout();
					btAceptarLayout.setAlignment(FlowLayout.LEFT);
					jPanel2.add(btAceptar);
					btAceptar.setLayout(null);
					btAceptar.setText("Aceptar");
					btAceptar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							
								int idRodeo=Integer.parseInt(txtIdRodeo.getText());
								int idCategoria=Integer.parseInt(txtIdCategoria.getText());
								sistema.actualizarRodeo(idRodeo, idCategoria);
							
						}
					});
					btCancelar = new JButton();
					jPanel2.add(btCancelar);
					btCancelar.setLayout(null);
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
