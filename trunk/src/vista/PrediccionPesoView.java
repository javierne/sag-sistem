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
import javax.swing.JTextArea;
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
public class PrediccionPesoView extends javax.swing.JPanel {
	private JLabel lblPrediccionPeso;
	private JTextField txtIdCat;
	private JButton btCancelar;
	private JTextField txtPeso;
	private JButton btGenerarPrediccion;
	private JLabel lblPesoDec;
	private JTextArea txtArea;
	private JLabel lblPrediccione;
	private JLabel lblIdCategoria;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new PrediccionPesoView());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public PrediccionPesoView() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GridLayout thisLayout = new GridLayout(6, 1);
			thisLayout.setHgap(5);
			thisLayout.setVgap(5);
			thisLayout.setColumns(1);
			thisLayout.setRows(6);
			this.setLayout(thisLayout);
			setPreferredSize(new Dimension(400, 300));
			{
				lblPrediccionPeso = new JLabel();
				FlowLayout lblPrediccionPesoLayout = new FlowLayout();
				lblPrediccionPeso.setLayout(lblPrediccionPesoLayout);
				this.add(lblPrediccionPeso);
				lblPrediccionPeso.setText("Prediccion de Peso");
			}
			{
				lblIdCategoria = new JLabel();
				FlowLayout lblIdCategoriaLayout = new FlowLayout();
				lblIdCategoria.setLayout(lblIdCategoriaLayout);
				this.add(lblIdCategoria);
				lblIdCategoria.setText("Id Categoria");
				{
					txtIdCat = new JTextField();
					lblIdCategoria.add(txtIdCat);
					txtIdCat.setPreferredSize(new java.awt.Dimension(116, 23));
				}
				{
					btGenerarPrediccion = new JButton();
					lblIdCategoria.add(btGenerarPrediccion);
					btGenerarPrediccion.setText("Generar Prediccion");
				}
			}
			{
				lblPesoDec = new JLabel();
				FlowLayout lblPesoDecLayout = new FlowLayout();
				lblPesoDec.setLayout(lblPesoDecLayout);
				this.add(lblPesoDec);
				lblPesoDec.setText("Peso Deseado");
				{
					txtPeso = new JTextField();
					lblPesoDec.add(txtPeso);
					txtPeso.setPreferredSize(new java.awt.Dimension(122, 23));
				}
				{
					btCancelar = new JButton();
					lblPesoDec.add(btCancelar);
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
				lblPrediccione = new JLabel();
				FlowLayout lblPrediccioneLayout = new FlowLayout();
				lblPrediccione.setLayout(lblPrediccioneLayout);
				this.add(lblPrediccione);
				lblPrediccione.setText("Prediccion");
			}
			{
				txtArea = new JTextArea();
				this.add(txtArea);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
