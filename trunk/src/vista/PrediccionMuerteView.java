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
public class PrediccionMuerteView extends javax.swing.JPanel {
	private JLabel lblPrediccionMuertes;
	private JLabel lblPeriodoInicial;
	private JTextField txtIdCategoria;
	private JButton btCancelar;
	private JTextField txtPeriodoFinal;
	private JButton btGenerarPrediccion;
	private JTextField txtPeriodoInicial;
	private JTextArea txtArea;
	private JLabel lblPrediccion;
	private JLabel lblIdCategoria;
	private JLabel lblPeriodoFinal;
	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		SistemaAdministracionGanadera sistema=SistemaAdministracionGanadera.getInstancia();
		frame.getContentPane().add(new PrediccionMuerteView(sistema));
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public PrediccionMuerteView(SistemaAdministracionGanadera sistema) {
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
				lblPrediccionMuertes = new JLabel();
				this.add(lblPrediccionMuertes);
				lblPrediccionMuertes.setText("Prediccion de Muertes");
			}
			{
				lblPeriodoInicial = new JLabel();
				FlowLayout lblPeriodoInicialLayout = new FlowLayout();
				lblPeriodoInicial.setLayout(lblPeriodoInicialLayout);
				this.add(lblPeriodoInicial);
				lblPeriodoInicial.setText("Periodo Inicial");
				{
					txtPeriodoInicial = new JTextField();
					lblPeriodoInicial.add(txtPeriodoInicial);
					txtPeriodoInicial.setPreferredSize(new java.awt.Dimension(111, 23));
				}
				{
					btGenerarPrediccion = new JButton();
					lblPeriodoInicial.add(btGenerarPrediccion);
					btGenerarPrediccion.setText("Generar Prediccion");
				}
			}
			{
				lblPeriodoFinal = new JLabel();
				FlowLayout lblPeriodoFinalLayout = new FlowLayout();
				lblPeriodoFinal.setLayout(lblPeriodoFinalLayout);
				this.add(lblPeriodoFinal);
				lblPeriodoFinal.setText("Periodo Final");
				{
					txtPeriodoFinal = new JTextField();
					lblPeriodoFinal.add(txtPeriodoFinal);
					txtPeriodoFinal.setPreferredSize(new java.awt.Dimension(94, 23));
				}
				{
					btCancelar = new JButton();
					lblPeriodoFinal.add(btCancelar);
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
				lblIdCategoria = new JLabel();
				FlowLayout lblIdCategoriaLayout = new FlowLayout();
				lblIdCategoria.setLayout(lblIdCategoriaLayout);
				this.add(lblIdCategoria);
				lblIdCategoria.setText("ID Categoria");
				{
					txtIdCategoria = new JTextField();
					lblIdCategoria.add(txtIdCategoria);
					txtIdCategoria.setPreferredSize(new java.awt.Dimension(186, 23));
				}
			}
			{
				lblPrediccion = new JLabel();
				this.add(lblPrediccion);
				lblPrediccion.setText("Prediccion");
			}
			{
				txtArea = new JTextArea();
				this.add(txtArea);
				txtArea.setPreferredSize(new java.awt.Dimension(400, 76));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
