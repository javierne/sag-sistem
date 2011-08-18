package vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import controlador.Sistema;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

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
public class Menu extends javax.swing.JFrame {
	private JMenuBar jMenuBar1;
	private JMenu menuPredicciones;
	private JMenuItem actualizarRodeo;
	private JPanel jPanel1;
	private JMenuItem prediccionMuerte;
	private JMenuItem prediccionDePeso;
	private JMenuItem prediccionPreñez;
	private JMenuItem prediccionNacimiento;
	private JMenuItem prediccionVolumenVenta;
	private JMenuItem menuSalir;
	private JMenuItem modificarMovimientoDeRodeo;
	private JMenuItem nuevaCategoria;
	private JMenuItem nuevoMovimientoDeRodeo;
	private JMenuItem modificarCategoria;
	private JMenuItem bajaRodeo;
	private JMenuItem nuevoRodeo;
	private JMenuItem menuPreniezNacimiento;
	private JMenuItem menuGananciaDiaria;
	private JMenu menuMovimientos;
	private JMenu menuCategoria;
	private JMenu jMenu1;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Sistema sistema=Sistema.getInstancia();
				Menu inst = new Menu(sistema);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public Menu(Sistema sistema) {
		super();
		initGUI(sistema);
	}
	
	private void initGUI(Sistema sistema) {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("S.A.G");
			jPanel1=new JPanel();
			getContentPane().add(jPanel1);
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenu1 = new JMenu();
					FlowLayout jMenFlowLayout=new FlowLayout();
					jMenu1.setLayout(jMenFlowLayout);
					jMenuBar1.add(jMenu1);
					jMenu1.setText("Rodeo");
					{
						nuevoRodeo = new JMenuItem();
						jMenu1.add(nuevoRodeo);
						nuevoRodeo.setText("Nuevo Rodeo");
						nuevoRodeo.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
									getContentPane().remove(jPanel1);
									getContentPane().repaint();
									jPanel1=null;
									jPanel1= new NuevoRodeoView();
									getContentPane().add(jPanel1);
									jPanel1.repaint();
									jPanel1.updateUI();
									validate();
							}
						});
					}
					{
						actualizarRodeo = new JMenuItem();
						jMenu1.add(actualizarRodeo);
						actualizarRodeo.setText("Actualizar Rodeo");
						actualizarRodeo.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
									getContentPane().remove(jPanel1);
									getContentPane().repaint();
									jPanel1=null;
									jPanel1= new ActualizarRodeoViw();
									getContentPane().add(jPanel1);
									jPanel1.repaint();
									jPanel1.updateUI();
									validate();
							}
						});
					}
					{
						bajaRodeo = new JMenuItem();
						jMenu1.add(bajaRodeo);
						bajaRodeo.setText("Eliminar Rodeo");
						bajaRodeo.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
									getContentPane().remove(jPanel1);
									getContentPane().repaint();
									jPanel1=null;
									jPanel1= new EliminarRodeoView();
									getContentPane().add(jPanel1);
									jPanel1.repaint();
									jPanel1.updateUI();
									validate();
								
							}
						});
					}
				}
				{
					menuCategoria = new JMenu();
					jMenuBar1.add(menuCategoria);
					menuCategoria.setText("Categoria");
					{
						nuevaCategoria = new JMenuItem();
						menuCategoria.add(nuevaCategoria);
						nuevaCategoria.setText("Nueva Categoria");
						nuevaCategoria.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
									getContentPane().remove(jPanel1);
									getContentPane().repaint();
									jPanel1=null;
									jPanel1= new NuevaCategoriaView();
									getContentPane().add(jPanel1);
									jPanel1.repaint();
									jPanel1.updateUI();
									validate();
								
							}
						});
					}
					{
						modificarCategoria = new JMenuItem();
						menuCategoria.add(modificarCategoria);
						modificarCategoria.setText("Modificar Categoria");
						modificarCategoria.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								
										getContentPane().remove(jPanel1);
										getContentPane().repaint();
										jPanel1=null;
										jPanel1= new ModificarCategoriaView();
										getContentPane().add(jPanel1);
										jPanel1.repaint();
										jPanel1.updateUI();
										validate();
												
							}
						});
					}
				}
				{
					menuMovimientos = new JMenu();
					jMenuBar1.add(menuMovimientos);
					menuMovimientos.setText("Movimientos De Rodeo");
					{
						nuevoMovimientoDeRodeo = new JMenuItem();
						menuMovimientos.add(nuevoMovimientoDeRodeo);
						nuevoMovimientoDeRodeo.setText("Nuevo Movimiento de Rodeo");
						nuevoMovimientoDeRodeo.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								
										getContentPane().remove(jPanel1);
										getContentPane().repaint();
										jPanel1=null;
										jPanel1= new NuevoMovimientoDeRodeoView();
										getContentPane().add(jPanel1);
										jPanel1.repaint();
										jPanel1.updateUI();
										validate();
										
							}
						});
					}
					{
						modificarMovimientoDeRodeo = new JMenuItem();
						menuMovimientos.add(modificarMovimientoDeRodeo);
						modificarMovimientoDeRodeo.setText("Modificar Movimiento de Rodeo");
						modificarMovimientoDeRodeo.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								
								getContentPane().remove(jPanel1);
								getContentPane().repaint();
								jPanel1=null;
								jPanel1= new ModificarMovimientoRodeoView();
								getContentPane().add(jPanel1);
								jPanel1.repaint();
								jPanel1.updateUI();
								validate();
								
					}
				});
					}
				}
				{
					menuPredicciones = new JMenu();
					jMenuBar1.add(menuPredicciones);
					menuPredicciones.setText("Predicciones");
					{
						prediccionVolumenVenta = new JMenuItem();
						menuPredicciones.add(prediccionVolumenVenta);
						prediccionVolumenVenta.setText("Prediccion de Volumen de Venta");
						prediccionVolumenVenta.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								
								getContentPane().remove(jPanel1);
								getContentPane().repaint();
								jPanel1=null;
								jPanel1= new PrediccionVolumenVentaView();
								getContentPane().add(jPanel1);
								jPanel1.repaint();
								jPanel1.updateUI();
								validate();
								
					}
				});
					}
					{
						prediccionNacimiento = new JMenuItem();
						menuPredicciones.add(prediccionNacimiento);
						prediccionNacimiento.setText("Prediccion de Nacimiento");
						prediccionNacimiento.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								getContentPane().remove(jPanel1);
								getContentPane().repaint();
								jPanel1=null;
								jPanel1= new PrediccionNacimientosView();
								getContentPane().add(jPanel1);
								jPanel1.repaint();
								jPanel1.updateUI();
								validate();
						}
					});
					}
					{
						prediccionPreñez = new JMenuItem();
						menuPredicciones.add(prediccionPreñez);
						prediccionPreñez.setText("Prediccion de Preñez");
						prediccionPreñez.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								getContentPane().remove(jPanel1);
								getContentPane().repaint();
								jPanel1=null;
								jPanel1= new PrediccionPreñezView();
								getContentPane().add(jPanel1);
								jPanel1.repaint();
								jPanel1.updateUI();
								validate();
						}
					});
					}
					{
						prediccionDePeso = new JMenuItem();
						menuPredicciones.add(prediccionDePeso);
						prediccionDePeso.setText("Prediccion de Peso");
						prediccionDePeso.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								getContentPane().remove(jPanel1);
								getContentPane().repaint();
								jPanel1=null;
								jPanel1= new PrediccionPesoView();
								getContentPane().add(jPanel1);
								jPanel1.repaint();
								jPanel1.updateUI();
								validate();
						}
					});
					
					}
					{
						prediccionMuerte = new JMenuItem();
						menuPredicciones.add(prediccionMuerte);
						prediccionMuerte.setText("Prediccion de Muerte");
						prediccionMuerte.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								getContentPane().remove(jPanel1);
								getContentPane().repaint();
								jPanel1=null;
								jPanel1= new PrediccionMuerteView();
								getContentPane().add(jPanel1);
								jPanel1.repaint();
								jPanel1.updateUI();
								validate();
						}
					});
					}
				}
				{
					menuGananciaDiaria = new JMenuItem();
					jMenuBar1.add(menuGananciaDiaria);
					menuGananciaDiaria.setText("Calcular Ganancia Diaria");
					menuGananciaDiaria.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							getContentPane().remove(jPanel1);
							getContentPane().repaint();
							jPanel1=null;
							jPanel1= new CalcularGananciaDiariaView();
							getContentPane().add(jPanel1);
							jPanel1.repaint();
							jPanel1.updateUI();
							validate();
					}
				});
				}
				{
					menuPreniezNacimiento = new JMenuItem();
					jMenuBar1.add(menuPreniezNacimiento);
					menuPreniezNacimiento.setText("Relacion Preñez-Nacimiento");
					menuPreniezNacimiento.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							getContentPane().remove(jPanel1);
							getContentPane().repaint();
							jPanel1=null;
							jPanel1= new RelacionPreniezNacimientoView();
							getContentPane().add(jPanel1);
							jPanel1.repaint();
							jPanel1.updateUI();
							validate();
					}
				});
				}
				{
					menuSalir = new JMenuItem();
					jMenuBar1.add(menuSalir);
					menuSalir.setText("Salir");
					menuSalir.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							dispose();
							
							
							
						}
					});
				}
			}
			pack();
			this.setSize(701, 347);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
