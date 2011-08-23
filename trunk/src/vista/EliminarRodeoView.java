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

import negocio.Rodeo;

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
public class EliminarRodeoView extends javax.swing.JPanel {
	private JLabel lblEliminarRodeo;
	private JPanel jPanel1;
	private JTextField txtIdRodeo;
	private JButton btEliminar;
	private JButton btCancelar;
	private JLabel lblIdRodeo;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Sistema sistema=Sistema.getInstancia();
		frame.getContentPane().add(new EliminarRodeoView(sistema));
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public EliminarRodeoView(Sistema sistema) {
		super();
		initGUI(sistema);
	}
	
	private void initGUI(final Sistema sistema) {
		try {
			GridLayout thisLayout = new GridLayout(4, 1);
			thisLayout.setHgap(5);
			thisLayout.setVgap(5);
			thisLayout.setColumns(1);
			thisLayout.setRows(4);
			this.setLayout(thisLayout);
			setPreferredSize(new Dimension(400, 300));
			{
				lblEliminarRodeo = new JLabel();
				this.add(lblEliminarRodeo);
				lblEliminarRodeo.setText("Eliminar Rodeo");
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
					txtIdRodeo.setPreferredSize(new java.awt.Dimension(197, 52));
				}
			}
			{
				jPanel1 = new JPanel();
				GridLayout jPanel1Layout = new GridLayout(1, 2);
				jPanel1Layout.setHgap(5);
				jPanel1Layout.setVgap(5);
				jPanel1Layout.setColumns(2);
				this.add(jPanel1);
				jPanel1.setLayout(jPanel1Layout);
				{
					btEliminar = new JButton();
					jPanel1.add(btEliminar);
					btEliminar.setText("Eliminar");
					btEliminar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							int idRodeo=Integer.parseInt(txtIdRodeo.getText());
							Rodeo r=sistema.buscarRodeo(idRodeo);
							if(r!=null)
								sistema.borrarRodeo(idRodeo);
							else
								System.out.println("El rodeo no existe");
						}
					});
					btCancelar=new JButton();
					jPanel1.add(btCancelar);
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
