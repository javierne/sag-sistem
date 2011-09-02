package vista;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;
import javax.swing.JFrame;

import negocio.Categoria;
import negocio.MovimientoDeRodeo;
import negocio.Rodeo;

import sistemaAdministracionGanadera.*;;


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
public class ModificarMovimientoRodeoView extends javax.swing.JPanel {
        private JLabel lblActualizarMovimientoRodeo;
        private JButton btAceptar;
        private JButton btCancelar;
        private JPanel jPanel1;
        private JLabel lblTransferenciaRodeo;
        private JLabel lblTransferenciaDescarte;
        private JLabel lblCantAbortos;
        private JLabel lblCantidadDeMuertes;
        private JLabel lblCantNac;
        private JLabel lblIdRodeo;
        private JLabel lblIdMovimientoRodeo;
        private JButton btBuscarRodeo;
        private JButton btBuscarMov;
        private JTextField txtRodeo;
        private JTextField txtDescarte;
        private JTextField txtAbortos;
        private JTextField txtMuertes;
        private JTextField txtNac;
        private JTextField txtIdRodeo;
        private JTextField txtIdMovRodeo;
        private JTextField txtLegajo;
        private JList jListaMovimientos;
        private JScrollPane jScrool;
        /**
        * Auto-generated main method to display this 
        * JPanel inside a new JFrame.
        */
        public static void main(String[] args) {
                JFrame frame = new JFrame();
                SistemaAdministracionGanadera sistema=SistemaAdministracionGanadera.getInstancia();
                frame.getContentPane().add(new ModificarMovimientoRodeoView(sistema));
                frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
        }
        
        public ModificarMovimientoRodeoView(SistemaAdministracionGanadera sistema) {
                super();
                initGUI(sistema);
        }
        
        private void initGUI(final SistemaAdministracionGanadera sistema) {
                try {
                        jListaMovimientos=new JList();
                        GridLayout thisLayout = new GridLayout(10, 1);
                        thisLayout.setHgap(5);
                        thisLayout.setVgap(5);
                        thisLayout.setColumns(1);
                        thisLayout.setRows(10);
                        this.setLayout(thisLayout);
                        this.setPreferredSize(new java.awt.Dimension(529, 395));
                        {
                                lblActualizarMovimientoRodeo= new JLabel();
                                this.add(lblActualizarMovimientoRodeo);
                                lblActualizarMovimientoRodeo.setText("Actualizar Movimiento de Rodeo");
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
                                        txtIdMovRodeo.setPreferredSize(new java.awt.Dimension(122, 23));
                                }
                                {
                                        btBuscarMov = new JButton();
                                        lblIdMovimientoRodeo.add(btBuscarMov);
                                        btBuscarMov.setText("Buscar  Mov.");
                                        btBuscarMov.addActionListener(new ActionListener() {
                                                public void actionPerformed(ActionEvent evt) {
                                                        
                                                        MovimientoDeRodeo mov=sistema.buscarMovimientoDeRodeo(Integer.parseInt(txtIdMovRodeo.getText()));                                               
                                                        if(mov!=null){
	                                                        DefaultListModel modelo=new DefaultListModel();
	                                                        for(int i=0; i<mov.getRodeos().size();i++)
	                                                        {
	                                                                modelo.add(i, mov.getRodeos().elementAt(i).getIdRodeo());
	                                                        }
	                                                        jListaMovimientos.setModel(modelo);
                                                        }else{
                                                        	System.out.println("Introduzca un Id de movimiento Valido");
                                                        }
                                                }
                                        });
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
                                {
                                        btBuscarRodeo = new JButton();
                                        lblIdRodeo.add(btBuscarRodeo);
                                        btBuscarRodeo.setText("Buscar Rod");
                                        btBuscarRodeo.setPreferredSize(new java.awt.Dimension(82, 23));
                                        btBuscarRodeo.addActionListener(new ActionListener() {
                                                public void actionPerformed(ActionEvent evt) {
                                                        MovimientoDeRodeo mov=sistema.buscarMovimientoDeRodeo(Integer.parseInt(txtIdMovRodeo.getText()));
                                                        Rodeo r=mov.buscarRodeo(Integer.parseInt(txtIdRodeo.getText()));
	                                                     if(r!=null){
                                                        	txtAbortos.setText(Integer.toString(r.getAbortos()));
	                                                        txtAbortos.updateUI();
	                                                        txtNac.setText(Integer.toString(r.getNacimientos()));
	                                                        txtNac.updateUI();
	                                                        txtMuertes.setText(Integer.toString(r.getMuertes()));
	                                                        txtMuertes.updateUI();
	                                                        txtRodeo.setText(Integer.toString(r.getTransferenciasRodeo()));
	                                                        txtRodeo.updateUI();
	                                                        txtDescarte.setText(Integer.toString(r.getTransferenciasDescarte()));
	                                                        txtDescarte.updateUI();
	                                                     }else{
	                                                    	 System.out.println("El Rodeo no existe, verifique el id");
	                                                     }
	                               
                                                }
                                        });
                                }
                        }
                        {
                                lblCantNac = new JLabel();
                                FlowLayout lblCantNacLayout = new FlowLayout();
                                lblCantNac.setLayout(lblCantNacLayout);
                                this.add(lblCantNac);
                                lblCantNac.setText("Cantidad Nacimientos");
                                lblCantNac.setPreferredSize(new java.awt.Dimension(458, 28));
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
                                jPanel1Layout.setColumns(2);
                                this.add(jPanel1);
                                jPanel1.setLayout(jPanel1Layout);
                                {
                                        btAceptar = new JButton();
                                        jPanel1.add(btAceptar);
                                        btAceptar.setText("Aceptar");
                                        btAceptar.addActionListener(new ActionListener() {
                                                public void actionPerformed(ActionEvent evt) {
                                                        MovimientoDeRodeo mov=sistema.buscarMovimientoDeRodeo(Integer.parseInt(txtIdMovRodeo.getText()));
                                                        Rodeo r=mov.buscarRodeo(Integer.parseInt(txtIdRodeo.getText()));
                                                        int nacimientos=Integer.parseInt(txtNac.getText());
                                                        int muertes=Integer.parseInt(txtMuertes.getText());
                                                        int abortos=Integer.parseInt(txtAbortos.getText());
                                                        int transferenciasDescarte=Integer.parseInt(txtDescarte.getText());
                                                        int transferenciasRodeo=Integer.parseInt(txtRodeo.getText());
                                                        r.setNacimientos(nacimientos);
                                                        r.setMuertes(muertes);
                                                        r.setAbortos(abortos);
                                                        r.setTransferenciasDescarte(transferenciasDescarte);
                                                        r.setTransferenciasRodeo(transferenciasRodeo);
                                                        
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
                        {
                        	jScrool=new JScrollPane(jListaMovimientos,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                            this.add(jScrool);
                                
                        }
                        
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

}