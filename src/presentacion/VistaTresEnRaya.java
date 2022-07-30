
package presentacion;

//import javafx.geometry.VPos;
//import javafx.scene.layout.GridPane;
//import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import negocio.Tablero;
import negocio.Ayuda;

import negocio.TresEnRaya;

public class VistaTresEnRaya extends javax.swing.JFrame {

    /** Creates new form VistaTresEnRaya */
     //Tablero T;
    public VistaTresEnRaya() {
        initComponents();

        iniciarComponentes();
    }
//Autor: Panda
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jBayuda = new javax.swing.JButton();
        jBayuda1 = new javax.swing.JButton();
        jBayuda2 = new javax.swing.JButton();
        jSnivel = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(80, 80));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        jPanel1.setLayout(flowLayout1);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jButton3.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.setBackground(new java.awt.Color(255, 153, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jButton4.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jButton5.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton6.setBackground(new java.awt.Color(102, 102, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jButton6.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);

        jButton7.setBackground(new java.awt.Color(255, 153, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jButton7.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);

        jButton8.setBackground(new java.awt.Color(255, 153, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jButton8.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jButton9.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 270, 270));

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Ingresar Nivel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 190, 40));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("A");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 68, 20));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("B");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 80, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("C");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 65, 20));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("2");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 250, 10, 20));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("3");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 340, 10, 20));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 150, 10, 20));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setText("Establecer");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 130, -1));

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton1.setText("Inicia Maquina");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, -1, -1));

        jBayuda.setBackground(new java.awt.Color(255, 255, 255));
        jBayuda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBayuda.setText("Ayuda");
        jBayuda.setEnabled(false);
        jBayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBayudaActionPerformed(evt);
            }
        });
        getContentPane().add(jBayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 130, -1));

        jBayuda1.setBackground(new java.awt.Color(255, 255, 255));
        jBayuda1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBayuda1.setText("Nuevo Tablero");
        jBayuda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBayuda1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBayuda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, -1, -1));

        jBayuda2.setBackground(new java.awt.Color(255, 255, 255));
        jBayuda2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBayuda2.setText("Salir");
        jBayuda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBayuda2ActionPerformed(evt);
            }
        });
        getContentPane().add(jBayuda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, 115, -1));

        jSnivel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSnivel.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        jSnivel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 3));
        jSnivel.setValue(1);
        getContentPane().add(jSnivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 70, 34));

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("PROYECTO DE INTELIGENCIA ARTIFICIAL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(174, 174, 174))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 410, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel9.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("DOCENTE:Edwin Calle Terrazas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 370, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/new3.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 490));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("PROYECTO DE INTELIGENCIA ARTIFICIAL");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 200, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         // TODO add your handling code here:
      if(jSnivel.getValue()  !=""){
          nivel =(Integer)jSnivel.getValue();
          activarBotones();
        } 
      jSnivel.setEnabled(false);
      jButton10.setEnabled(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(tablero.getElemento(0,0)==0){
        jButton1.setText("0");        
        jButton1.setEnabled(false);
        tablero.setElemento(0, 0, HUMANO);
         if(!gato.finDelJuego(tablero)){
            gato.miniMax(tablero, MAQUINA, nivel, true);
            tablero.setElemento(gato.getPuntoAux().x, gato.getPuntoAux().y, MAQUINA);
            arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setText("X");
            arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setEnabled(false);
        }
           verificarJugada(tablero);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         if(tablero.getElemento(0,1)==0){
           jButton2.setText("0");

           jButton2.setEnabled(false);
           tablero.setElemento(0, 1, HUMANO);
         if(!gato.finDelJuego(tablero)){
            gato.miniMax(tablero, MAQUINA, nivel, true);
            tablero.setElemento(gato.getPuntoAux().x, gato.getPuntoAux().y, MAQUINA);
            arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setText("X");
            arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setEnabled(false);
        }
           verificarJugada(tablero);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         if(tablero.getElemento(0,2)==0){
        jButton3.setText("0");
         jButton3.setEnabled(false);
         tablero.setElemento(0, 2, HUMANO);
         if(!gato.finDelJuego(tablero)){
            gato.miniMax(tablero, MAQUINA, nivel, true);
            tablero.setElemento(gato.getPuntoAux().x, gato.getPuntoAux().y, MAQUINA);
            arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setText("X");
            arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setEnabled(false);
        }
           verificarJugada(tablero);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         if(tablero.getElemento(1,0)==0){
        jButton4.setText("0");
        jButton4.setEnabled(false);
        tablero.setElemento(1,0, HUMANO);
        if(!gato.finDelJuego(tablero)){
            gato.miniMax(tablero, MAQUINA, nivel, true);
            tablero.setElemento(gato.getPuntoAux().x, gato.getPuntoAux().y, MAQUINA);
            arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setText("X");
            arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setEnabled(false);
        }
           verificarJugada(tablero);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(tablero.getElemento(1,1)==0){
        jButton5.setText("0");
        jButton5.setEnabled(false);
        tablero.setElemento(1, 1, HUMANO);
         if(!gato.finDelJuego(tablero)){
            gato.miniMax(tablero, MAQUINA, nivel, true);
            tablero.setElemento(gato.getPuntoAux().x, gato.getPuntoAux().y, MAQUINA);
            arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setText("X");
            arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setEnabled(false);
        }
           verificarJugada(tablero);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         if(tablero.getElemento(1,2)==0){
            jButton6.setText("0");
            jButton6.setEnabled(false);
            tablero.setElemento(1, 2, HUMANO);
         if(!gato.finDelJuego(tablero)){
            gato.miniMax(tablero, MAQUINA, nivel, true);
            tablero.setElemento(gato.getPuntoAux().x, gato.getPuntoAux().y, MAQUINA);
            arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setText("X");
            arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setEnabled(false);
        }
           verificarJugada(tablero);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         if(tablero.getElemento(2,0)==0){
           jButton7.setText("0");
           jButton7.setEnabled(false);
           tablero.setElemento(2, 0, HUMANO);
         if(!gato.finDelJuego(tablero)){
            gato.miniMax(tablero, MAQUINA, nivel, true);
            tablero.setElemento(gato.getPuntoAux().x, gato.getPuntoAux().y, MAQUINA);
            arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setText("X");
            arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setEnabled(false);
        }
           verificarJugada(tablero);
         }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         if(tablero.getElemento(2,1)==0){
           jButton8.setText("0");
           jButton8.setEnabled(false);
           tablero.setElemento(2, 1, HUMANO);
         if(!gato.finDelJuego(tablero)){
            gato.miniMax(tablero, MAQUINA, nivel, true);
            tablero.setElemento(gato.getPuntoAux().x, gato.getPuntoAux().y, MAQUINA);
            arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setText("X");
            arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setEnabled(false);
        }
           verificarJugada(tablero);
         }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         if(tablero.getElemento(2,2)==0){
        jButton9.setText("0");
        jButton9.setEnabled(false);
        tablero.setElemento(2, 2, HUMANO);
         if(!gato.finDelJuego(tablero)){
            gato.miniMax(tablero, MAQUINA, nivel, true);
            tablero.setElemento(gato.getPuntoAux().x, gato.getPuntoAux().y, MAQUINA);
            arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setText("X");
            arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setEnabled(false);
        }
           verificarJugada(tablero);
         }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        gato.miniMax(tablero, MAQUINA, nivel, true);
        tablero.setElemento(gato.getPuntoAux().x, gato.getPuntoAux().y, MAQUINA);
        arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setText("X");
        arrayButton[gato.getPuntoAux().x][gato.getPuntoAux().y].setEnabled(false);
        jToggleButton1.setEnabled(false);

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jBayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBayudaActionPerformed

          gato.minMaxHum(tablero, HUMANO, nivel, true);
          //tablero.setElemento(gato.getPuntoAux().x, gato.getPuntoAux().y, HUMANO);
          int a = gato.getPuntoAux().x;
          int b = gato.getPuntoAux().y;
        
          if((a == 0) && (b == 0)){
              JOptionPane.showMessageDialog(rootPane,"A-1" );
           }
          if((a == 0) && (b == 1)){
              JOptionPane.showMessageDialog(rootPane,"B-1" );
           }
          if((a == 0) && (b == 2)){
              JOptionPane.showMessageDialog(rootPane,"C-1" );
           }
          if((a == 1) && (b == 0)){
              JOptionPane.showMessageDialog(rootPane,"A-2" );
           }
          if((a == 1) && (b == 1)){
              JOptionPane.showMessageDialog(rootPane,"B-2" );
           }
          if((a == 1) && (b == 2)){
              JOptionPane.showMessageDialog(rootPane,"C-2" );
           }
          if((a == 2) && (b == 0)){
              JOptionPane.showMessageDialog(rootPane,"A-3" );
           }
          if((a == 2) && (b == 1)){
              JOptionPane.showMessageDialog(rootPane,"B-3" );
           }
          if((a == 2) && (b == 2)){
              JOptionPane.showMessageDialog(rootPane,"C-3" );
           }
    }//GEN-LAST:event_jBayudaActionPerformed

    private void jBayuda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBayuda1ActionPerformed
        // TODO add your handling code here:
        this.Reiniciar();
        activarBotones();
    }//GEN-LAST:event_jBayuda1ActionPerformed

    private void jBayuda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBayuda2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBayuda2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaTresEnRaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBayuda;
    private javax.swing.JButton jBayuda1;
    private javax.swing.JButton jBayuda2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSpinner jSnivel;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
    
    TresEnRaya gato = new TresEnRaya();
    Tablero tablero = new Tablero(3,3);
    Ayuda ayu = new Ayuda();
    JButton arrayButton [][] = new JButton[3][3];
    int MAQUINA = 1;
    int HUMANO=2;
    int nivel = 0;
    
    public void Reiniciar(){
    gato = new TresEnRaya();
    tablero = new Tablero(3,3);
    Ayuda ayu = new Ayuda();
    JButton arrayButton [][] = new JButton[3][3];
    int MAQUINA = 1;
    int HUMANO=2;
    int nivel = 0;
    this.iniciarComponentes();
    Extraer();
    }
  
    public void Extraer(){
       jButton1.setText("");
       jButton2.setText("");
       jButton3.setText("");
       jButton4.setText("");
       jButton5.setText("");
       jButton6.setText("");
       jButton7.setText("");
       jButton8.setText("");
       jButton9.setText("");     
    }
    private void activarBotones() {
       jButton1.setEnabled(true);
       jButton2.setEnabled(true);
       jButton3.setEnabled(true);
       jButton4.setEnabled(true);
       jButton5.setEnabled(true);
       jButton6.setEnabled(true);
       jButton7.setEnabled(true);
       jButton8.setEnabled(true);
       jButton9.setEnabled(true);
       jBayuda.setEnabled(true); 
       jSnivel.setEnabled(true);
       jButton10.setEnabled(true);
    }
    private void iniciarComponentes() {
       jButton1.setEnabled(false);
       jButton2.setEnabled(false);
       jButton3.setEnabled(false);
       jButton4.setEnabled(false);
       jButton5.setEnabled(false);
       jButton6.setEnabled(false);
       jButton7.setEnabled(false);
       jButton8.setEnabled(false);
       jButton9.setEnabled(false);
       arrayButton[0][0]=jButton1;
       arrayButton[0][1]=jButton2;
       arrayButton[0][2]=jButton3;
       arrayButton[1][0]=jButton4;
       arrayButton[1][1]=jButton5;
       arrayButton[1][2]=jButton6;
       arrayButton[2][0]=jButton7;
       arrayButton[2][1]=jButton8;
       arrayButton[2][2]=jButton9;
    }
    
    private void verificarJugada(Tablero t){
             if(gato.finDelJuego(t)){
                int ganador = gato.existeGanador(t);
                if(ganador ==MAQUINA)
                    JOptionPane.showMessageDialog(null, "Gano la Maquina");
                 else if(ganador == HUMANO)
                     JOptionPane.showMessageDialog(null, "Ganaste");
                else
                      JOptionPane.showMessageDialog(null, "Empataron");
             }
    }

}
