package vista;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JFrame;

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
public class RelacionPreniezNacimientoView extends javax.swing.JPanel {
	private JLabel lblRelPrenieNac;
	private JButton btCancelar;
	private JButton btCalcularRelacion;
	private JTextField txtAnio;
	private JTextArea txtArea;
	private JLabel lblRelPN;
	private JLabel lblAnio;
	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Sistema sistema=Sistema.getInstancia();
		frame.getContentPane().add(new RelacionPreniezNacimientoView(sistema));
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public RelacionPreniezNacimientoView(Sistema sistema) {
		super();
		initGUI(sistema);
	}
	
	private void initGUI(Sistema sistema) {
		try {
			GridLayout thisLayout = new GridLayout(5, 1);
			thisLayout.setHgap(5);
			thisLayout.setVgap(5);
			thisLayout.setColumns(1);
			thisLayout.setRows(5);
			this.setLayout(thisLayout);
			setPreferredSize(new Dimension(400, 300));
			{
				lblRelPrenieNac = new JLabel();
				this.add(lblRelPrenieNac);
				lblRelPrenieNac.setText("Relacion Preñe Nacimientos");
			}
			{
				lblAnio = new JLabel();
				FlowLayout lblAnioLayout = new FlowLayout();
				lblAnio.setLayout(lblAnioLayout);
				this.add(lblAnio);
				lblAnio.setText("Año");
				{
					txtAnio = new JTextField();
					lblAnio.add(txtAnio);
					txtAnio.setPreferredSize(new java.awt.Dimension(102, 41));
				}
				{
					btCalcularRelacion = new JButton();
					lblAnio.add(btCalcularRelacion);
					btCalcularRelacion.setText("Calcular Relacion");
				}
				{
					btCancelar = new JButton();
					lblAnio.add(btCancelar);
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
				lblRelPN = new JLabel();
				this.add(lblRelPN);
				lblRelPN.setText("Relacion Preñe-Nacimiento");
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
