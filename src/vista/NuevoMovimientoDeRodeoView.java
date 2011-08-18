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
public class NuevoMovimientoDeRodeoView extends javax.swing.JPanel {
	private JLabel lblNuevoMovRodeo;
	private JButton btAceptar;
	private JButton btCancelar;
	private JButton btAgregar;
	private JPanel jPanel1;
	private JLabel lblTransferenciaRodeo;
	private JLabel lblTransferenciaDescarte;
	private JLabel lblCantAbortos;
	private JLabel lblCantidadDeMuertes;
	private JLabel lblCantNac;
	private JLabel lblIdRodeo;
	private JLabel lblIdMovimientoRodeo;
	private JTextField txtRodeo;
	private JTextField txtDescarte;
	private JTextField txtAbortos;
	private JTextField txtMuertes;
	private JTextField txtNac;
	private JTextField txtIdRodeo;
	private JTextField txtIdMovRodeo;
	private JTextField txtFecha;
	private JTextField txtLegajo;
	private JLabel lblFecha;
	private JLabel lblLegajo;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new NuevoMovimientoDeRodeoView());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public NuevoMovimientoDeRodeoView() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GridLayout thisLayout = new GridLayout(12, 1);
			thisLayout.setHgap(5);
			thisLayout.setVgap(5);
			thisLayout.setColumns(1);
			thisLayout.setRows(12);
			this.setLayout(thisLayout);
			setPreferredSize(new Dimension(400, 300));
			{
				lblNuevoMovRodeo = new JLabel();
				this.add(lblNuevoMovRodeo);
				lblNuevoMovRodeo.setText("Nuevo Movimiento de Rodeo");
			}
			{
				lblLegajo = new JLabel();
				FlowLayout lblLegajoLayout = new FlowLayout();
				lblLegajo.setLayout(lblLegajoLayout);
				this.add(lblLegajo);
				lblLegajo.setText("Legajo");
				{
					txtLegajo = new JTextField();
					lblLegajo.add(txtLegajo);
					txtLegajo.setPreferredSize(new java.awt.Dimension(278, 23));
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
					txtFecha.setPreferredSize(new java.awt.Dimension(232, 23));
				}
			}
			{
				lblIdMovimientoRodeo = new JLabel();
				FlowLayout lblIdMovimientoRodeoLayout = new FlowLayout();
				lblIdMovimientoRodeo.setLayout(lblIdMovimientoRodeoLayout);
				this.add(lblIdMovimientoRodeo);
				lblIdMovimientoRodeo.setText("ID Movimiento de Rodeo");
				{
					txtIdMovRodeo = new JTextField();
					lblIdMovimientoRodeo.add(txtIdMovRodeo);
					txtIdMovRodeo.setPreferredSize(new java.awt.Dimension(120, 23));
				}
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
					txtIdRodeo.setPreferredSize(new java.awt.Dimension(223, 23));
				}
			}
			{
				lblCantNac = new JLabel();
				FlowLayout lblCantNacLayout = new FlowLayout();
				lblCantNac.setLayout(lblCantNacLayout);
				this.add(lblCantNac);
				lblCantNac.setText("Cantidad Nacimientos");
				{
					txtNac = new JTextField();
					lblCantNac.add(txtNac);
					txtNac.setPreferredSize(new java.awt.Dimension(156, 23));
				}
			}
			{
				lblCantidadDeMuertes = new JLabel();
				FlowLayout lblCantidadDeMuertesLayout = new FlowLayout();
				lblCantidadDeMuertes.setLayout(lblCantidadDeMuertesLayout);
				this.add(lblCantidadDeMuertes);
				lblCantidadDeMuertes.setText("Cantidad de Muertes");
				{
					txtMuertes = new JTextField();
					lblCantidadDeMuertes.add(txtMuertes);
					txtMuertes.setPreferredSize(new java.awt.Dimension(161, 23));
				}
			}
			{
				lblCantAbortos = new JLabel();
				FlowLayout lblCantAbortosLayout = new FlowLayout();
				lblCantAbortos.setLayout(lblCantAbortosLayout);
				this.add(lblCantAbortos);
				lblCantAbortos.setText("Cantidad Abortos");
				{
					txtAbortos = new JTextField();
					lblCantAbortos.add(txtAbortos);
					txtAbortos.setPreferredSize(new java.awt.Dimension(158, 23));
				}
			}
			{
				lblTransferenciaDescarte = new JLabel();
				FlowLayout lblTransferenciaDescarteLayout = new FlowLayout();
				lblTransferenciaDescarte.setLayout(lblTransferenciaDescarteLayout);
				this.add(lblTransferenciaDescarte);
				lblTransferenciaDescarte.setText("Transferencia Descarte");
				{
					txtDescarte = new JTextField();
					lblTransferenciaDescarte.add(txtDescarte);
					txtDescarte.setPreferredSize(new java.awt.Dimension(140, 23));
				}
			}
			{
				lblTransferenciaRodeo = new JLabel();
				FlowLayout lblTransferenciaRodeoLayout = new FlowLayout();
				lblTransferenciaRodeo.setLayout(lblTransferenciaRodeoLayout);
				this.add(lblTransferenciaRodeo);
				lblTransferenciaRodeo.setText("Transferencia Rodeo");
				{
					txtRodeo = new JTextField();
					lblTransferenciaRodeo.add(txtRodeo);
					txtRodeo.setPreferredSize(new java.awt.Dimension(170, 23));
				}
			}
			{
				jPanel1 = new JPanel();
				GridLayout jPanel1Layout = new GridLayout(1, 2);
				jPanel1Layout.setHgap(5);
				jPanel1Layout.setVgap(5);
				jPanel1Layout.setColumns(3);
				this.add(jPanel1);
				jPanel1.setLayout(jPanel1Layout);
				{
					btAceptar = new JButton();
					jPanel1.add(btAceptar);
					btAceptar.setText("Aceptar");
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
					btAgregar=new JButton();
					jPanel1.add(btAgregar);
					btAgregar.setText("Agregar Rodeo");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
