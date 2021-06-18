/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author ieliz
 */
public class ventanaPrincipal extends javax.swing.JFrame {
    
    private boolean casilla[][] = new boolean [3][3];
    private int matriz[][] = new int [3][3];
    private String turno = "usuario1";
    private String usuario1, usuario2;
    private int vecesGano1 = 0, vecesGano2= 0, vecesEmpate = 0;
    
    public ventanaPrincipal(String usuario1, String usuario2){
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        initComponents();
        setSize(600,600);
        setLocationRelativeTo(null);
        
        llenarCasillas();
        llenarMatriz();
    }
    
    private void llenarCasillas(){
        for(int i=0; i<3; i++){
            for(int j=0;j<3;j++){
                casilla[i][j]=true;
            }
        }
    }
    
    private void llenarMatriz(){
        for(int i=0; i<3; i++){
            for(int j=0;j<3;j++){
                matriz[i][j]=0;
            }
        }
    }
    
    private void dibujarX(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/x.png")));
    }
    private void dibujarO(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/o.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonArribaIzquierda = new javax.swing.JButton();
        botonArriba = new javax.swing.JButton();
        botonArribaDerecha = new javax.swing.JButton();
        botonIzquierda = new javax.swing.JButton();
        botonCentro = new javax.swing.JButton();
        botonDerecha = new javax.swing.JButton();
        botonAbajoIquierda = new javax.swing.JButton();
        botonAbajo = new javax.swing.JButton();
        botonAbajoDerecha = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        ComenzarDeNuevo = new javax.swing.JMenuItem();
        MostrarResultados = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));

        panel.setLayout(new java.awt.GridLayout(3, 3));

        botonArribaIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonArribaIzquierda);

        botonArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaActionPerformed(evt);
            }
        });
        panel.add(botonArriba);

        botonArribaDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaDerechaActionPerformed(evt);
            }
        });
        panel.add(botonArribaDerecha);

        botonIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonIzquierda);

        botonCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCentroActionPerformed(evt);
            }
        });
        panel.add(botonCentro);

        botonDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDerechaActionPerformed(evt);
            }
        });
        panel.add(botonDerecha);

        botonAbajoIquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoIquierdaActionPerformed(evt);
            }
        });
        panel.add(botonAbajoIquierda);

        botonAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoActionPerformed(evt);
            }
        });
        panel.add(botonAbajo);

        botonAbajoDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoDerechaActionPerformed(evt);
            }
        });
        panel.add(botonAbajoDerecha);

        menuJuego.setText("Juego");
        menuJuego.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ComenzarDeNuevo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ComenzarDeNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refre.png"))); // NOI18N
        ComenzarDeNuevo.setText("Comenzar de nuevo");
        ComenzarDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComenzarDeNuevoActionPerformed(evt);
            }
        });
        menuJuego.add(ComenzarDeNuevo);

        MostrarResultados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MostrarResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/table.png"))); // NOI18N
        MostrarResultados.setText("Tabla de Resultados");
        MostrarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarResultadosActionPerformed(evt);
            }
        });
        menuJuego.add(MostrarResultados);
        menuJuego.add(jSeparator1);

        salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menuJuego.add(salir);

        barraMenu.add(menuJuego);

        menuAyuda.setText("Ayuda");
        menuAyuda.setFocusable(false);
        menuAyuda.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        menuAyuda.setHideActionText(true);
        menuAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAyudaMouseClicked(evt);
            }
        });
        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void botonArribaIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaIzquierdaActionPerformed
        if(casilla[0][0] == true){ //verificamos si aun no se ha dado clic
            if(turno.equals("usuario1")){   //varificamos el truno
                dibujarX(botonArribaIzquierda);
                matriz[0][0] = 1;
                turno = "usuario2";
            }else{ //turno usuario 2
                dibujarO(botonArribaIzquierda);
                matriz[0][0] = 2;
                turno="usuario1";
            }
            casilla[0][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonArribaIzquierdaActionPerformed

    private void botonArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaActionPerformed
        if(casilla[0][1]==true){
            if(turno.equals("usuario1")){
                dibujarX(botonArriba);
                matriz[0][1] = 1;
                turno = "usuario2";
            }else{
                dibujarO(botonArriba);
                matriz[0][1] = 2;
                turno = "usuario1";
            }
            casilla[0][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonArribaActionPerformed

    private void botonArribaDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaDerechaActionPerformed
        if(casilla[0][2]==true){
            if(turno.equals("usuario1")){
                dibujarX(botonArribaDerecha);
                matriz[0][2] = 1;
                turno = "usuario2";
            }else{
                dibujarO(botonArribaDerecha);
                matriz[0][2] = 2;
                turno = "usuario1";
            }
            casilla[0][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonArribaDerechaActionPerformed

    private void botonIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIzquierdaActionPerformed
        if(casilla[1][0]==true){
            if(turno.equals("usuario1")){
                dibujarX(botonIzquierda);
                matriz[1][0] = 1;
                turno = "usuario2";
            }else{
                dibujarO(botonIzquierda);
                matriz[1][0] = 2;
                turno = "usuario1";
            }
            casilla[1][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonIzquierdaActionPerformed

    private void botonCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCentroActionPerformed
        if(casilla[1][1]==true){
            if(turno.equals("usuario1")){
                dibujarX(botonCentro);
                matriz[1][1] = 1;
                turno = "usuario2";
            }else{
                dibujarO(botonCentro);
                matriz[1][1] = 2;
                turno = "usuario1";
            }
            casilla[1][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonCentroActionPerformed

    private void botonDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDerechaActionPerformed
        if(casilla[1][2]==true){
            if(turno.equals("usuario1")){
                dibujarX(botonDerecha);
                matriz[1][2] = 1;
                turno = "usuario2";
            }else{
                dibujarO(botonDerecha);
                matriz[1][2] = 2;
                turno = "usuario1";
            }
            casilla[1][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonDerechaActionPerformed

    private void botonAbajoIquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoIquierdaActionPerformed
        if(casilla[2][0]==true){
            if(turno.equals("usuario1")){
                dibujarX(botonAbajoIquierda);
                matriz[2][0] = 1;
                turno = "usuario2";
            }else{
                dibujarO(botonAbajoIquierda);
                matriz[2][0] = 2;
                turno = "usuario1";
            }
            casilla[2][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonAbajoIquierdaActionPerformed

    private void botonAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoActionPerformed
        if(casilla[2][1]==true){
            if(turno.equals("usuario1")){
                dibujarX(botonAbajo);
                matriz[2][1] = 1;
                turno = "usuario2";
            }else{
                dibujarO(botonAbajo);
                matriz[2][1] = 2;
                turno = "usuario1";
            }
            casilla[2][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonAbajoActionPerformed

    private void botonAbajoDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoDerechaActionPerformed
        if(casilla[2][2]==true){
            if(turno.equals("usuario1")){
                dibujarX(botonAbajoDerecha);
                matriz[2][2] = 1;
                turno = "usuario2";
            }else{
                dibujarO(botonAbajoDerecha);
                matriz[2][2] = 2;
                turno = "usuario1";
            }
            casilla[2][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonAbajoDerechaActionPerformed

    private void ComenzarDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComenzarDeNuevoActionPerformed
        vecesGano1 = 0; 
        vecesGano2= 0; 
        vecesEmpate = 0;
        reiniciarJuego();
    }//GEN-LAST:event_ComenzarDeNuevoActionPerformed

    private void MostrarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarResultadosActionPerformed
        ventanaResultados ventanaR = new ventanaResultados(this, true, usuario1, usuario2, vecesGano1, vecesGano2, vecesEmpate);
        ventanaR.setVisible(true);
    }//GEN-LAST:event_MostrarResultadosActionPerformed

    private void menuAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAyudaMouseClicked
        try {
            try {
                Desktop.getDesktop().browse(new URI("https://www.guiainfantil.com/articulos/ocio/juegos/juego-de-tres-en-raya-como-jugar-con-los-ninos-con-papel-y-lapiz/"));
            } catch (IOException ex) {
                //Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            //Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuAyudaMouseClicked

    private void comprobarGanador(){
        boolean ganador1 = false;
        boolean ganador2 = false;
        int casillasEmpate = 0;
        
       ganador1 = comprobar(1); 
       ganador2 = comprobar(2);
       
       if(ganador1 == true){
           vecesGano1++;
           ventanaGanador ventanaG = new ventanaGanador(this, true, usuario1);
           ventanaG.setVisible(true);
           reiniciarJuego();
       }else if(ganador2==true){
           vecesGano2++;
           ventanaGanador ventanaG = new ventanaGanador(this, true, usuario2);
           ventanaG.setVisible(true);
           reiniciarJuego();
       }else {
           for(int i=0; i<3; i++){
               for(int j=0; j<3; j++){
                   if(matriz[i][j] != 0){
                       casillasEmpate++;
                   }
               }
           }
           
           if(casillasEmpate == 9){
               vecesEmpate++;
               ventanaEmpate ventanaE = new ventanaEmpate(this, true);
               ventanaE.setVisible(true);
               reiniciarJuego();
           }else{
               casillasEmpate = 0;
           }
       }
    }
    
    private boolean comprobar(int num){
        boolean ganador = false;
        
        if(matriz[0][0]==num && matriz[0][1]==num && matriz[0][2]==num){
            ganador = true;
        }else if(matriz[1][0]==num && matriz[1][1]==num && matriz[1][2]==num){
            ganador = true;
        }else if(matriz[2][0]==num && matriz[2][1]==num && matriz[2][2]==num){ //filas
            ganador = true;
        }else if(matriz[0][0]==num && matriz[1][0]==num && matriz[2][0]==num){
            ganador = true;
        }else if(matriz[0][1]==num && matriz[1][1]==num && matriz[2][1]==num){
            ganador = true;
        }else if(matriz[0][2]==num && matriz[1][2]==num && matriz[2][2]==num){ //columnas
            ganador = true;
        }else if(matriz[2][0]==num && matriz[1][1]==num && matriz[0][2]==num){ //diagonales
            ganador = true;
        }else if(matriz[0][0]==num && matriz[1][1]==num && matriz[2][2]==num){
            ganador = true;
        }
        
        return ganador;
    }
    
    private void reiniciarJuego(){
        llenarCasillas();
        llenarMatriz();
        
        botonArribaIzquierda.setIcon(null);
        botonArriba.setIcon(null);
        botonArribaDerecha.setIcon(null);
        botonIzquierda.setIcon(null);
        botonCentro.setIcon(null);
        botonDerecha.setIcon(null);
        botonAbajoIquierda.setIcon(null);
        botonAbajo.setIcon(null);
        botonAbajoDerecha.setIcon(null);
        
        quienJuegaPrimero();
        
    }
    
    private void quienJuegaPrimero(){
        escojerTurno ventanaET = new escojerTurno(this, true, usuario1,usuario2);
        ventanaET.setVisible(true);
        turno = ventanaET.getTurno();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ComenzarDeNuevo;
    private javax.swing.JMenuItem MostrarResultados;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton botonAbajo;
    private javax.swing.JButton botonAbajoDerecha;
    private javax.swing.JButton botonAbajoIquierda;
    private javax.swing.JButton botonArriba;
    private javax.swing.JButton botonArribaDerecha;
    private javax.swing.JButton botonArribaIzquierda;
    private javax.swing.JButton botonCentro;
    private javax.swing.JButton botonDerecha;
    private javax.swing.JButton botonIzquierda;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
