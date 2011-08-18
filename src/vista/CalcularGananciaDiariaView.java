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
public class CalcularGananciaDiariaView extends javax.swing.JPanel {
	private JLabel lblGananciaDiaria;
	private JLabel lblIdCat;
	private JTextArea txtArea;
	private JTextField txtIdCat;
	private JButton btCancelar;
	private JButton btCalcularGanancia;
	private JLabel lblPrediccion;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new CalcularGananciaDiariaView());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public CalcularGananciaDiariaView() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GridLayout thisLayout = new GridLayout(5, 1);
			thisLayout.setHgap(5);
			thisLayout.setVgap(5);
			thisLayout.setColumns(1);
			thisLayout.setRows(5);
			this.setLayout(thisLayout);
			setPreferredSize(new Dimension(400, 300));
			{
				lblGananciaDiaria = new JLabel();
				this.add(lblGananciaDiaria);
				lblGananciaDiaria.setText("Ganancia Diaria");
			}
			{
				lblIdCat = new JLabel();
				FlowLayout lblIdCatLayout = new FlowLayout();
				lblIdCat.setLayout(lblIdCatLayout);
				this.add(lblIdCat);
				lblIdCat.setText("Id Categoria");
				{
					txtIdCat = new JTextField();
					lblIdCat.add(txtIdCat);
					txtIdCat.setPreferredSize(new java.awt.Dimension(101, 41));
				}
				{
					btCalcularGanancia = new JButton();
					lblIdCat.add(btCalcularGanancia);
					btCalcularGanancia.setText("Calcular Ganancia Diaria");
				}
			}
			{
				lblPrediccion = new JLabel();
				FlowLayout lblPrediccionLayout = new FlowLayout();
				lblPrediccion.setLayout(lblPrediccionLayout);
				this.add(lblPrediccion);
				lblPrediccion.setText("Prediccion");
				{
					btCancelar = new JButton();
					lblPrediccion.add(btCancelar);
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
				txtArea = new JTextArea();
				this.add(txtArea);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
