package vista;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
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
public class NuevaCategoriaView extends javax.swing.JPanel {
	private JLabel lblNuevaCategoria;
	private JLabel lblIdCategoria;
	private JLabel lblTipo;
	private JLabel lblPesoMacho;
	private JTextField txtPesoFHembra;
	private JTextField txtPesoFMacho;
	private JTextField txtPesoHembra;
	private JTextField txtPesoMacho;
	private JLabel lblPesoFinalHembre;
	private JLabel lblPesoFinalMacho;
	private JButton btAceptar;
	private JButton btCancelar;
	private JPanel jPanel1;
	private JLabel lblPesoHembra;
	private JTextField txtTipo;
	private JTextField txtIdCategoria;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new NuevaCategoriaView());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public NuevaCategoriaView() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GridLayout thisLayout = new GridLayout(9, 1);
			thisLayout.setColumns(1);
			thisLayout.setHgap(5);
			thisLayout.setVgap(5);
			thisLayout.setRows(9);
			this.setLayout(thisLayout);
			setPreferredSize(new Dimension(400, 300));
			{
				lblNuevaCategoria = new JLabel();
				lblNuevaCategoria.setLayout(null);
				this.add(lblNuevaCategoria);
				lblNuevaCategoria.setText("Nueva Categoria");
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
					txtIdCategoria.setPreferredSize(new java.awt.Dimension(244, 23));
				}
			}
			{
				lblTipo = new JLabel();
				FlowLayout lblTipoLayout = new FlowLayout();
				lblTipo.setLayout(lblTipoLayout);
				this.add(lblTipo);
				lblTipo.setText("TIpo");
				{
					txtTipo = new JTextField();
					lblTipo.add(txtTipo);
					txtTipo.setPreferredSize(new java.awt.Dimension(271, 23));
				}
			}
			{
				lblPesoMacho = new JLabel();
				FlowLayout lblPesoMachoLayout = new FlowLayout();
				lblPesoMacho.setLayout(lblPesoMachoLayout);
				this.add(lblPesoMacho);
				lblPesoMacho.setText("Peso Macho");
				{
					txtPesoMacho = new JTextField();
					lblPesoMacho.add(txtPesoMacho);
					txtPesoMacho.setPreferredSize(new java.awt.Dimension(259, 23));
				}
			}
			{
				lblPesoHembra = new JLabel();
				FlowLayout lblPesoHembraLayout = new FlowLayout();
				lblPesoHembra.setLayout(lblPesoHembraLayout);
				this.add(lblPesoHembra);
				lblPesoHembra.setText("Peso Hembra");
				{
					txtPesoHembra = new JTextField();
					lblPesoHembra.add(txtPesoHembra);
					txtPesoHembra.setPreferredSize(new java.awt.Dimension(237, 23));
				}
			}
			{
				lblPesoFinalMacho = new JLabel();
				FlowLayout lblPesoFinalMachoLayout1 = new FlowLayout();
				FlowLayout lblPesoFinalMachoLayout = new FlowLayout();
				this.add(lblPesoFinalMacho);
				lblPesoFinalMacho.setText("Peso Final Macho");
				lblPesoFinalMacho.setLayout(lblPesoFinalMachoLayout1);
				{
					txtPesoFMacho = new JTextField();
					lblPesoFinalMacho.add(txtPesoFMacho);
					txtPesoFMacho.setPreferredSize(new java.awt.Dimension(203, 23));
				}
			}
			{
				lblPesoFinalHembre = new JLabel();
				FlowLayout lblPesoFinalHembreLayout1 = new FlowLayout();
				FlowLayout lblPesoFinalHembreLayout = new FlowLayout();
				this.add(lblPesoFinalHembre);
				lblPesoFinalHembre.setText("Peso Final Hembra");
				lblPesoFinalHembre.setLayout(lblPesoFinalHembreLayout1);
				{
					txtPesoFHembra = new JTextField();
					lblPesoFinalHembre.add(txtPesoFHembra);
					txtPesoFHembra.setPreferredSize(new java.awt.Dimension(176, 23));
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
					btAceptar = new JButton();
					FlowLayout btAceptarLayout = new FlowLayout();
					jPanel1.add(btAceptar);
					btAceptar.setLayout(null);
					btAceptar.setText("Aceptar");
					btCancelar = new JButton();
					btCancelar.setText("Cancelar");
					jPanel1.add(btCancelar);
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
