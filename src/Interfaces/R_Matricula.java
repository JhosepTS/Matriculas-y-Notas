
package Interfaces;
import Entidades.Matriculas; 
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
 
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author koa
 */
public class R_Matricula extends javax.swing.JFrame {
DefaultTableModel modelo=new DefaultTableModel();
  ArrayList<Matriculas> listamatriculas=new ArrayList<Matriculas>();
    /**
     * Creates new form R_Matricula
     */
    public R_Matricula() {
        initComponents();
        this.setTitle("Registro de notas");
        this.setSize(720,600);
        this.setLocationRelativeTo(null);
        
            modelo.addColumn("APELLIDOS Y NOMBRES");
            modelo.addColumn("DNI");
            modelo.addColumn("FECHA DE NACIMIENTO");
            modelo.addColumn("CORREO");
            cargarDatosDesdeArchivo(); // Llamada al método para cargar los datos desde el archivo
            refrescarTabla();
            
            
    }

    
    @SuppressWarnings("unchecked")
    public void guardarDatosEnArchivo(Matriculas matricula) {
   String rutaArchivo = "registro_matricula.txt";
try (PrintWriter writer = new PrintWriter(new FileWriter(rutaArchivo, true))) {
    writer.println("Apellidos y Nombres: " + matricula.getApellido());
    writer.println("DNI: " + matricula.getDni());
    writer.println("Fecha de nacimiento: " + matricula.getFechaNacimiento());
    writer.println("Correo: " + matricula.getCorreo());
    writer.println("--------------------------------------------------------------------------");
    JOptionPane.showMessageDialog(this, "Información guardada correctamente.");

    // Limpiar los campos después de guardar los datos
    
} catch (IOException ex) {
    ex.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al guardar la información de la matricula.", "Error", JOptionPane.ERROR_MESSAGE);
}
  }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFecha = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBMatriculi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtFecha.setText(" ");
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });

        txtApellidos.setText(" ");
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        btnInsertar.setText("INSERTAR");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        TBMatriculi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "APELLIDOS Y NOMBRES", "DNI", "FECHA DE NACIMIENTO", "CORREO"
            }
        ));
        jScrollPane1.setViewportView(TBMatriculi);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setText("REGISTRAR MATRICULA");

        jLabel2.setText("Apellidos y Nombres:");

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel3.setText("DNI");

        jLabel4.setText("Fecha nacimiento");

        jLabel5.setText("Correo");

        txtDni.setText(" ");
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void cargarDatosDesdeArchivo() {
    String rutaArchivo = "registro_matricula.txt";
    try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            if (linea.startsWith("Apellidos y Nombres:")) {
                String apellidosNombres = linea.substring(21).trim();
                String dni = reader.readLine().substring(6).trim();
                String fechaNacimiento = reader.readLine().substring(19).trim();
                String correo = reader.readLine().substring(8).trim();

                Matriculas m = new Matriculas();
                m.setApellido(apellidosNombres);
                m.setDni(dni);
                m.setFechaNacimiento(fechaNacimiento);
                m.setCorreo(correo);
                listamatriculas.add(m);
            }
        }
    } catch (IOException e) {
        // Manejar el error de lectura del archivo
    }
}

    
    public void refrescarTabla(){
    
        
        while(modelo.getRowCount()>0){
        modelo.removeRow(0);
        
        }
        for (Matriculas matriculas : listamatriculas) {
        Object a[]=new Object[4];
        a[0]=matriculas.getApellido();
        a[1]=matriculas.getDni();
        a[2]=matriculas.getFechaNacimiento();
        a[3]=matriculas.getCorreo();
        
        modelo.addRow(a);
        }
        TBMatriculi.setModel(modelo);
    }
    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
    try {
        // Obtener los datos del formulario
        String apellidos = txtApellidos.getText();
        String dni = txtDni.getText();
        String fechaNacimiento = txtFecha.getText();
        String correo = txtCorreo.getText();

        // Validar que todos los campos estén completos
        if (apellidos.isEmpty() || dni.isEmpty() || fechaNacimiento.isEmpty() || correo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor completa todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método si algún campo está vacío
        }

        // Validar el formato del correo electrónico
        if (!correo.endsWith("@gmail.com")) {
            JOptionPane.showMessageDialog(this, "El correo electrónico debe terminar con '@gmail.com'", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método si el formato del correo es incorrecto
        }

        // Crear una nueva instancia de Matriculas y agregarla a la lista
        Matriculas x = new Matriculas();
        x.setApellido(apellidos);
        x.setDni(dni);
        x.setFechaNacimiento(fechaNacimiento);
        x.setCorreo(correo);
        listamatriculas.add(x);

        // Actualizar la tabla y guardar los datos en el archivo
        refrescarTabla();
        guardarDatosEnArchivo(x);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al ingresar la matrícula", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtApellidos.setText("");
        txtDni.setText("");
        txtFecha.setText("");
        txtCorreo.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
            Matricula ventanaPrincipal = new Matricula(); // Crear una nueva instancia de la ventana principal
    ventanaPrincipal.setVisible(true); // Mostrar la ventana principal
    dispose(); // Cerrar la ventana actual
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
   char c = evt.getKeyChar();
    
    // Verificar si el carácter ingresado es un dígito y si la longitud actual es menor que 8
    if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE) || txtDni.getText().length() >= 8) {
        evt.consume(); // Consumir el evento si no cumple con las condiciones
    }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
char c = evt.getKeyChar();
    String fecha = txtFecha.getText();
    
    // Permitir solo dígitos y los caracteres "/" y un máximo de 10 caracteres
    if (!((Character.isDigit(c) && fecha.length() < 10) || c == '/' || c == KeyEvent.VK_BACK_SPACE)) {
        evt.consume();
    }
    
    // Verificar el formato de la fecha (dd/mm/yyyy)
    if (fecha.length() == 2 || fecha.length() == 5) {
        if (c != '/' && Character.isDigit(c)) {
            txtFecha.setText(fecha + "/");
        }
    }

    }//GEN-LAST:event_txtFechaKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
    char c = evt.getKeyChar();
if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
    evt.consume();
}
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
    
    char c = evt.getKeyChar();
    String correo = txtCorreo.getText();
    int arrobaIndex = correo.indexOf('@');
    
    // Permitir solo caracteres válidos para un correo electrónico
    if (((Character.isLetterOrDigit(c) || c == '.' || c == '_' || c == '-' || c == '@') &&
         (correo.length() < 50)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
        // Verificar si el correo termina en "@gmail.com" o "@hotmail.com"
        if (arrobaIndex >= 0 && (correo.endsWith("@gmail.com") || correo.endsWith("@hotmail.com"))) {
            // Permitir escribir si el correo es válido
            return;
        } else if (arrobaIndex == -1 || (correo.length() - arrobaIndex) <= 10) {
            // Permitir escribir antes del "@" o si falta menos de 10 caracteres para terminar
            return;
        } else {
            // Consumir el evento si el correo no es válido
            evt.consume();
        }
    } else {
        // Consumir el evento si el carácter no es válido
        evt.consume();
    }
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
       
    }//GEN-LAST:event_txtCorreoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBMatriculi;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
