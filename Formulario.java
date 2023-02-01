/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario.java;

import com.mysql.jdbc.PreparedStatement;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import sistema.Login;

/**
*/

/**
 *
 * @author eugenio
 */
public class Formulario extends javax.swing.JFrame {
    ;
  
    Statement ejecutor=null;
    Connection con;
    String driver="com.mysql.jdbc.Driver";
    String user="root";
    String pass="";
    String url="jdbc:mysql://localhost:3306/usuarios";
    
private TableRowSorter trsfiltro;
    
    public void filtro() {
trsfiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(), 1));
}

    
    private DefaultTableModel modelo;
   
           public void cargaTabla(){
           String[] titulos={"id","codigo","cantidad","detalle","marca","color","modelo","serie","material","dimension","movimiento","novedades","valor","estado","fecha","ubicacion","custodio"}; 
           String[]datos1=new String[50];
       modelo=new DefaultTableModel(null,titulos);
            
        String sql="select * from vehiculo";
     
       conectar();
      
        try {
            Statement st =(Statement) con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos1[0]=rs.getString("id");
                datos1[1]=rs.getString("codigo");
                datos1[2]=rs.getString("cantidad");
                datos1[3]=rs.getString("detalle");
                datos1[4]=rs.getString("marca");
                datos1[5]=rs.getString("color");
                datos1[6]=rs.getString("modelo");
                datos1[7]=rs.getString("serie");
                datos1[8]=rs.getString("material");
                datos1[9]=rs.getString("dimension");
                datos1[10]=rs.getString("movimiento");
                datos1[11]=rs.getString("novedades");
                datos1[12]=rs.getString("valor");
                datos1[13]=rs.getString("estado");
                datos1[14]=rs.getString("fecha");
                datos1[15]=rs.getString("ubicacion");
                datos1[16]=rs.getString("custodio");
                modelo.addRow(datos1);
               
               
            }
            
            tablaEmpleados.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        
           }
        
   

 private void c1(){
       
       String[] titulo1={"vehiculo"};
       String[]datos=new String[50];
       modelo=new DefaultTableModel(null,titulo1);
       String sql="select * from total";
       conectar();
        try {
            Statement st =(Statement) con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString("vehiculo");
                  modelo.addRow(datos);
               
                 
            }
           tabla.setModel(modelo);
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
           
        }
       
     
      
        }
 
 private void c2(){
       
       String[] titulo1={"maquinaria"};
       String[]datos=new String[50];
       modelo=new DefaultTableModel(null,titulo1);
       String sql="select * from total";
       conectar();
        try {
            Statement st =(Statement) con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString("maquinaria");
                  modelo.addRow(datos);
               
               
            }
            
            tabla.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        }
 
  private void c3(){
       
       String[] titulo1={"equipo"};
       String[]datos=new String[50];
       modelo=new DefaultTableModel(null,titulo1);
       String sql="select * from total";
       conectar();
        try {
            Statement st =(Statement) con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString("equipo");
                  modelo.addRow(datos);
               
               
            }
            
            tabla.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        }
  
  
   private void c4(){
       
       String[] titulo1={"gimnacio"};
       String[]datos=new String[50];
       modelo=new DefaultTableModel(null,titulo1);
       String sql="select * from total";
       conectar();
        try {
            Statement st =(Statement) con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString("gimnacio");
                  modelo.addRow(datos);
               
               
            }
            
            tabla.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        }
   
    private void c5(){
       
       String[] titulo1={"herramientas"};
       String[]datos=new String[50];
       modelo=new DefaultTableModel(null,titulo1);
       String sql="select * from total";
       conectar();
        try {
            Statement st =(Statement) con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString("herramientas");
                  modelo.addRow(datos);
               
               
            }
            
            tabla.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        }
    
    
     private void c6(){
       
       String[] titulo1={"equiposinf"};
       String[]datos=new String[50];
       modelo=new DefaultTableModel(null,titulo1);
       String sql="select * from total";
       conectar();
        try {
            Statement st =(Statement) con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString("equiposinf");
                  modelo.addRow(datos);
               
               
            }
            
            tabla.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        }
     
      private void c7(){
       
       String[] titulo1={"terrenos"};
       String[]datos=new String[50];
       modelo=new DefaultTableModel(null,titulo1);
       String sql="select * from total";
       conectar();
        try {
            Statement st =(Statement) con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString("terrenos");
                  modelo.addRow(datos);
               
               
            }
            
            tabla.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        }
      
      
       private void c8(){
       
       String[] titulo1={"edificio"};
       String[]datos=new String[50];
       modelo=new DefaultTableModel(null,titulo1);
       String sql="select * from total";
       conectar();
        try {
            Statement st =(Statement) con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString("edificio");
                  modelo.addRow(datos);
               
               
            }
            
            tabla.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        }
       
        private void c9(){
       
       String[] titulo1={"trajes"};
       String[]datos=new String[50];
       modelo=new DefaultTableModel(null,titulo1);
       String sql="select * from total";
       conectar();
        try {
            Statement st =(Statement) con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString("trajes");
                  modelo.addRow(datos);
               
               
            }
            
            tabla.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        }
       
 
           
           
           
           
           
            public void cargaTabla1(){
           String[] titulos={"id","codigo","cantidad","detalle","marca","color","modelo","serie","material","dimension","movimiento","novedades","valor","estado","fecha","ubicacion","custodio"}; 
           String[]datos1=new String[50];
       modelo=new DefaultTableModel(null,titulos);
               
        String sql="select * from maquinaria";
     
       conectar();
      
        try {
            Statement st =(Statement) con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos1[0]=rs.getString("id");
                datos1[1]=rs.getString("codigo");
                datos1[2]=rs.getString("cantidad");
                datos1[3]=rs.getString("detalle");
                datos1[4]=rs.getString("marca");
                datos1[5]=rs.getString("color");
                datos1[6]=rs.getString("modelo");
                datos1[7]=rs.getString("serie");
                datos1[8]=rs.getString("material");
                datos1[9]=rs.getString("dimension");
                datos1[10]=rs.getString("movimiento");
                datos1[11]=rs.getString("novedades");
                datos1[12]=rs.getString("valor");
                datos1[13]=rs.getString("estado");
                datos1[14]=rs.getString("fecha");
                datos1[15]=rs.getString("ubicacion");
                datos1[16]=rs.getString("custodio");
                modelo.addRow(datos1);
               
               
            }
            
            tablaEmpleados.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        }
            
            
            
        public void cargaTabla2(){
           String[] titulos={"id","codigo","cantidad","detalle","marca","color","modelo","serie","material","dimension","movimiento","novedades","valor","estado","fecha","ubicacion","custodio"}; 
           String[]datos1=new String[50];
       modelo=new DefaultTableModel(null,titulos);
               
        String sql="select * from equipo";
     
       conectar();
      
        try {
            Statement st =(Statement) con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos1[0]=rs.getString("id");
                datos1[1]=rs.getString("codigo");
                datos1[2]=rs.getString("cantidad");
                datos1[3]=rs.getString("detalle");
                datos1[4]=rs.getString("marca");
                datos1[5]=rs.getString("color");
                datos1[6]=rs.getString("modelo");
                datos1[7]=rs.getString("serie");
                datos1[8]=rs.getString("material");
                datos1[9]=rs.getString("dimension");
                datos1[10]=rs.getString("movimiento");
                datos1[11]=rs.getString("novedades");
                datos1[12]=rs.getString("valor");
                datos1[13]=rs.getString("estado");
                datos1[14]=rs.getString("fecha");
                datos1[15]=rs.getString("ubicacion");
                datos1[16]=rs.getString("custodio");
                modelo.addRow(datos1);
               
               
            }
            
            tablaEmpleados.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        }     
            
    
      public void cargaTabla3(){
           String[] titulos={"id","codigo","cantidad","detalle","marca","color","modelo","serie","material","dimension","movimiento","novedades","valor","estado","fecha","ubicacion","custodio"}; 
           String[]datos1=new String[50];
       modelo=new DefaultTableModel(null,titulos);
               
        String sql="select * from gignacio";
     
       conectar();
      
        try {
            Statement st =(Statement) con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos1[0]=rs.getString("id");
                datos1[1]=rs.getString("codigo");
                datos1[2]=rs.getString("cantidad");
                datos1[3]=rs.getString("detalle");
                datos1[4]=rs.getString("marca");
                datos1[5]=rs.getString("color");
                datos1[6]=rs.getString("modelo");
                datos1[7]=rs.getString("serie");
                datos1[8]=rs.getString("material");
                datos1[9]=rs.getString("dimension");
                datos1[10]=rs.getString("movimiento");
                datos1[11]=rs.getString("novedades");
                datos1[12]=rs.getString("valor");
                datos1[13]=rs.getString("estado");
                datos1[14]=rs.getString("fecha");
                datos1[15]=rs.getString("ubicacion");
                datos1[16]=rs.getString("custodio");
                modelo.addRow(datos1);
               
               
            }
            
            tablaEmpleados.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        }
      
      
     public void cargaTabla4(){
           String[] titulos={"id","codigo","cantidad","detalle","marca","color","modelo","serie","material","dimension","movimiento","novedades","valor","estado","fecha","ubicacion","custodio"}; 
           String[]datos1=new String[50];
       modelo=new DefaultTableModel(null,titulos);
               
        String sql="select * from herramientas";
     
       conectar();
      
        try {
            Statement st =(Statement) con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos1[0]=rs.getString("id");
                datos1[1]=rs.getString("codigo");
                datos1[2]=rs.getString("cantidad");
                datos1[3]=rs.getString("detalle");
                datos1[4]=rs.getString("marca");
                datos1[5]=rs.getString("color");
                datos1[6]=rs.getString("modelo");
                datos1[7]=rs.getString("serie");
                datos1[8]=rs.getString("material");
                datos1[9]=rs.getString("dimension");
                datos1[10]=rs.getString("movimiento");
                datos1[11]=rs.getString("novedades");
                datos1[12]=rs.getString("valor");
                datos1[13]=rs.getString("estado");
                datos1[14]=rs.getString("fecha");
                datos1[15]=rs.getString("ubicacion");
                datos1[16]=rs.getString("custodio");
                modelo.addRow(datos1);
               
               
            }
            
            tablaEmpleados.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        }
            
     public void cargaTabla5(){
           String[] titulos={"id","codigo","cantidad","detalle","marca","color","modelo","serie","material","dimension","movimiento","novedades","valor","estado","fecha","ubicacion","custodio"}; 
           String[]datos1=new String[50];
       modelo=new DefaultTableModel(null,titulos);
               
        String sql="select * from equiposinf";
     
       conectar();
      
        try {
            Statement st =(Statement) con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos1[0]=rs.getString("id");
                datos1[1]=rs.getString("codigo");
                datos1[2]=rs.getString("cantidad");
                datos1[3]=rs.getString("detalle");
                datos1[4]=rs.getString("marca");
                datos1[5]=rs.getString("color");
                datos1[6]=rs.getString("modelo");
                datos1[7]=rs.getString("serie");
                datos1[8]=rs.getString("material");
                datos1[9]=rs.getString("dimension");
                datos1[10]=rs.getString("movimiento");
                datos1[11]=rs.getString("novedades");
                datos1[12]=rs.getString("valor");
                datos1[13]=rs.getString("estado");
                datos1[14]=rs.getString("fecha");
                datos1[15]=rs.getString("ubicacion");
                datos1[16]=rs.getString("custodio");
                modelo.addRow(datos1);
               
               
            }
            
            tablaEmpleados.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        }  
            
          
     
     public void cargaTabla6(){
           String[] titulos={"id","codigo","cantidad","detalle","marca","color","modelo","serie","material","dimension","movimiento","novedades","valor","estado","fecha","ubicacion","custodio"}; 
           String[]datos1=new String[50];
       modelo=new DefaultTableModel(null,titulos);
               
        String sql="select * from terrenos";
     
       conectar();
      
        try {
            Statement st =(Statement) con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos1[0]=rs.getString("id");
                datos1[1]=rs.getString("codigo");
                datos1[2]=rs.getString("cantidad");
                datos1[3]=rs.getString("detalle");
                datos1[4]=rs.getString("marca");
                datos1[5]=rs.getString("color");
                datos1[6]=rs.getString("modelo");
                datos1[7]=rs.getString("serie");
                datos1[8]=rs.getString("material");
                datos1[9]=rs.getString("dimension");
                datos1[10]=rs.getString("movimiento");
                datos1[11]=rs.getString("novedades");
                datos1[12]=rs.getString("valor");
                datos1[13]=rs.getString("estado");
                datos1[14]=rs.getString("fecha");
                datos1[15]=rs.getString("ubicacion");
                datos1[16]=rs.getString("custodio");
                modelo.addRow(datos1);
               
               
            }
            
            tablaEmpleados.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        }
     
     
     
      public void cargaTabla7(){
           String[] titulos={"id","codigo","cantidad","detalle","marca","color","modelo","serie","material","dimension","movimiento","novedades","valor","estado","fecha","ubicacion","custodio"}; 
           String[]datos1=new String[50];
       modelo=new DefaultTableModel(null,titulos);
               
        String sql="select * from edificio";
     
       conectar();
      
        try {
            Statement st =(Statement) con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos1[0]=rs.getString("id");
                datos1[1]=rs.getString("codigo");
                datos1[2]=rs.getString("cantidad");
                datos1[3]=rs.getString("detalle");
                datos1[4]=rs.getString("marca");
                datos1[5]=rs.getString("color");
                datos1[6]=rs.getString("modelo");
                datos1[7]=rs.getString("serie");
                datos1[8]=rs.getString("material");
                datos1[9]=rs.getString("dimension");
                datos1[10]=rs.getString("movimiento");
                datos1[11]=rs.getString("novedades");
                datos1[12]=rs.getString("valor");
                datos1[13]=rs.getString("estado");
                datos1[14]=rs.getString("fecha");
                datos1[15]=rs.getString("ubicacion");
                datos1[16]=rs.getString("custodio");
                modelo.addRow(datos1);
               
               
            }
            
            tablaEmpleados.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        }
       public void cargaTabla8(){
           String[] titulos={"id","codigo","cantidad","detalle","marca","color","modelo","serie","material","dimension","movimiento","novedades","valor","estado","fecha","ubicacion","custodio"}; 
           String[]datos1=new String[50];
       modelo=new DefaultTableModel(null,titulos);
               
        String sql="select * from trajes";
     
       conectar();
      
        try {
            Statement st =(Statement) con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos1[0]=rs.getString("id");
                datos1[1]=rs.getString("codigo");
                datos1[2]=rs.getString("cantidad");
                datos1[3]=rs.getString("detalle");
                datos1[4]=rs.getString("marca");
                datos1[5]=rs.getString("color");
                datos1[6]=rs.getString("modelo");
                datos1[7]=rs.getString("serie");
                datos1[8]=rs.getString("material");
                datos1[9]=rs.getString("dimension");
                datos1[10]=rs.getString("movimiento");
                datos1[11]=rs.getString("novedades");
                datos1[12]=rs.getString("valor");
                datos1[13]=rs.getString("estado");
                datos1[14]=rs.getString("fecha");
                datos1[15]=rs.getString("ubicacion");
                datos1[16]=rs.getString("custodio");
                modelo.addRow(datos1);
               
               
            }
            
            tablaEmpleados.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        }
        
           public void eliminar() {
               int fila=tablaEmpleados.getSelectedRow();
               String valor =tablaEmpleados.getValueAt(fila, 0).toString();
               try {
                   java.sql.PreparedStatement elimi=con.prepareStatement("DELETE FROM vehiculo WHERE id='"+valor+"'");
               elimi.executeUpdate();
               cargaTabla();
               }catch(Exception e){
                   
               }
               
               
           }
           
           
           
               public void eliminar1() {
               int fila=tablaEmpleados.getSelectedRow();
               String valor =tablaEmpleados.getValueAt(fila, 0).toString();
               try {
                   java.sql.PreparedStatement elimi=con.prepareStatement("DELETE FROM maquinaria WHERE id='"+valor+"'");
               elimi.executeUpdate();
               cargaTabla1();
               }catch(Exception e){
                   
               }  
               
          }
          
               public void eliminar2() {
               int fila=tablaEmpleados.getSelectedRow();
               String valor =tablaEmpleados.getValueAt(fila, 0).toString();
               try {
                   java.sql.PreparedStatement elimi=con.prepareStatement("DELETE FROM equipo WHERE id='"+valor+"'");
               elimi.executeUpdate();
               cargaTabla2();
               }catch(Exception e){
                   
               }  
               
          }
              
              
               public void eliminar3() {
               int fila=tablaEmpleados.getSelectedRow();
               String valor =tablaEmpleados.getValueAt(fila, 0).toString();
               try {
                   java.sql.PreparedStatement elimi=con.prepareStatement("DELETE FROM gignacio WHERE id='"+valor+"'");
               elimi.executeUpdate();
               cargaTabla3();
               }catch(Exception e){
                   
               }  
               
          }
               public void eliminar4() {
               int fila=tablaEmpleados.getSelectedRow();
               String valor =tablaEmpleados.getValueAt(fila, 0).toString();
               try {
                   java.sql.PreparedStatement elimi=con.prepareStatement("DELETE FROM herramientas WHERE id='"+valor+"'");
               elimi.executeUpdate();
               cargaTabla4();
               }catch(Exception e){
                   
               }  
               
          }  
               
              public void eliminar5() {
               int fila=tablaEmpleados.getSelectedRow();
               String valor =tablaEmpleados.getValueAt(fila, 0).toString();
               try {
                   java.sql.PreparedStatement elimi=con.prepareStatement("DELETE FROM equiposinf WHERE id='"+valor+"'");
               elimi.executeUpdate();
               cargaTabla5();
               }catch(Exception e){
                   
               }  
               
          }
                
               public void eliminar6() {
               int fila=tablaEmpleados.getSelectedRow();
               String valor =tablaEmpleados.getValueAt(fila, 0).toString();
               try {
                   java.sql.PreparedStatement elimi=con.prepareStatement("DELETE FROM terrenos WHERE id='"+valor+"'");
               elimi.executeUpdate();
               cargaTabla6();
               }catch(Exception e){
                   
               }  
               
          }
                
               public void eliminar7() {
               int fila=tablaEmpleados.getSelectedRow();
               String valor =tablaEmpleados.getValueAt(fila, 0).toString();
               try {
                   java.sql.PreparedStatement elimi=con.prepareStatement("DELETE FROM edificio WHERE id='"+valor+"'");
               elimi.executeUpdate();
               cargaTabla7();
               }catch(Exception e){
                   
               }  
               
          }
               public void eliminar8() {
               int fila=tablaEmpleados.getSelectedRow();
               String valor =tablaEmpleados.getValueAt(fila, 0).toString();
               try {
                   java.sql.PreparedStatement elimi=con.prepareStatement("DELETE FROM trajes WHERE id='"+valor+"'");
               elimi.executeUpdate();
               cargaTabla8();
               }catch(Exception e){
                   
               }  
               
          }
              
            
              
              
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
     public void Modificar() {
               int fila=tablaEmpleados.getSelectedRow();
               int Id=Integer.parseInt(this.tablaEmpleados.getValueAt(fila, 0).toString());
             
String txtCodigo= tablaEmpleados.getValueAt(fila, 1).toString();            
String txtCantidad= tablaEmpleados.getValueAt(fila, 2).toString();
String txtDetalle= tablaEmpleados.getValueAt(fila, 3).toString();
String txtMarca= tablaEmpleados.getValueAt(fila, 4).toString();
String txtColor= tablaEmpleados.getValueAt(fila, 5).toString();
String txtModelo=tablaEmpleados.getValueAt(fila, 6).toString();
String txtSerie=tablaEmpleados.getValueAt(fila, 7).toString();
String txtMaterial=tablaEmpleados.getValueAt(fila, 8).toString();
String txtDimension= tablaEmpleados.getValueAt(fila, 9).toString();
String txtMovimiento=tablaEmpleados.getValueAt(fila, 10).toString();
String txtNovedades=tablaEmpleados.getValueAt(fila, 11).toString();
String txtValor=tablaEmpleados.getValueAt(fila, 12).toString();
String txtEstado=tablaEmpleados.getValueAt(fila, 13).toString();
String txtFecha=tablaEmpleados.getValueAt(fila, 14).toString();
String txtUbicacion=tablaEmpleados.getValueAt(fila, 15).toString();
String txtCustodio=tablaEmpleados.getValueAt(fila, 16).toString();
               try {
                   java.sql.PreparedStatement actu=con.prepareStatement("UPDATE vehiculo SET codigo='"+txtCodigo+"', cantidad='"+txtCantidad+"',detalle='"+txtDetalle+"',marca='"+txtMarca+"',color='"+txtColor+"',modelo='"+txtModelo+"',serie='"+txtSerie+"',material='"+txtMaterial+"',dimension='"+txtDimension+"',movimiento='"+txtMovimiento+"',novedades='"+txtNovedades+"',valor='"+txtValor+"',estado='"+txtEstado+"',fecha='"+txtFecha+"',ubicacion='"+txtUbicacion+"',custodio='"+txtCustodio+"'WHERE id='"+Id+"'");
               actu.executeUpdate();
               cargaTabla();
               }catch(Exception e){
                   
               }
               
           }
     
          public void Modificar1() {
               int fila=tablaEmpleados.getSelectedRow();
               int Id=Integer.parseInt(this.tablaEmpleados.getValueAt(fila, 0).toString());
             
String txtCodigo= tablaEmpleados.getValueAt(fila, 1).toString();            
String txtCantidad= tablaEmpleados.getValueAt(fila, 2).toString();
String txtDetalle= tablaEmpleados.getValueAt(fila, 3).toString();
String txtMarca= tablaEmpleados.getValueAt(fila, 4).toString();
String txtColor= tablaEmpleados.getValueAt(fila, 5).toString();
String txtModelo=tablaEmpleados.getValueAt(fila, 6).toString();
String txtSerie=tablaEmpleados.getValueAt(fila, 7).toString();
String txtMaterial=tablaEmpleados.getValueAt(fila, 8).toString();
String txtDimension= tablaEmpleados.getValueAt(fila, 9).toString();
String txtMovimiento=tablaEmpleados.getValueAt(fila, 10).toString();
String txtNovedades=tablaEmpleados.getValueAt(fila, 11).toString();
String txtValor=tablaEmpleados.getValueAt(fila, 12).toString();
String txtEstado=tablaEmpleados.getValueAt(fila, 13).toString();
String txtFecha=tablaEmpleados.getValueAt(fila, 14).toString();
String txtUbicacion=tablaEmpleados.getValueAt(fila, 15).toString();
String txtCustodio=tablaEmpleados.getValueAt(fila, 16).toString();
               try {
                   java.sql.PreparedStatement actu=con.prepareStatement("UPDATE maquinaria SET codigo='"+txtCodigo+"', cantidad='"+txtCantidad+"',detalle='"+txtDetalle+"',marca='"+txtMarca+"',color='"+txtColor+"',modelo='"+txtModelo+"',serie='"+txtSerie+"',material='"+txtMaterial+"',dimension='"+txtDimension+"',movimiento='"+txtMovimiento+"',novedades='"+txtNovedades+"',valor='"+txtValor+"',estado='"+txtEstado+"',fecha='"+txtFecha+"',ubicacion='"+txtUbicacion+"',custodio='"+txtCustodio+"'WHERE id='"+Id+"'");
               actu.executeUpdate();
               cargaTabla1();
               }catch(Exception e){
                   
               }
               
           }
          
    
         public void Modificar2() {
               int fila=tablaEmpleados.getSelectedRow();
               int Id=Integer.parseInt(this.tablaEmpleados.getValueAt(fila, 0).toString());
             
String txtCodigo= tablaEmpleados.getValueAt(fila, 1).toString();            
String txtCantidad= tablaEmpleados.getValueAt(fila, 2).toString();
String txtDetalle= tablaEmpleados.getValueAt(fila, 3).toString();
String txtMarca= tablaEmpleados.getValueAt(fila, 4).toString();
String txtColor= tablaEmpleados.getValueAt(fila, 5).toString();
String txtModelo=tablaEmpleados.getValueAt(fila, 6).toString();
String txtSerie=tablaEmpleados.getValueAt(fila, 7).toString();
String txtMaterial=tablaEmpleados.getValueAt(fila, 8).toString();
String txtDimension= tablaEmpleados.getValueAt(fila, 9).toString();
String txtMovimiento=tablaEmpleados.getValueAt(fila, 10).toString();
String txtNovedades=tablaEmpleados.getValueAt(fila, 11).toString();
String txtValor=tablaEmpleados.getValueAt(fila, 12).toString();
String txtEstado=tablaEmpleados.getValueAt(fila, 13).toString();
String txtFecha=tablaEmpleados.getValueAt(fila, 14).toString();
String txtUbicacion=tablaEmpleados.getValueAt(fila, 15).toString();
String txtCustodio=tablaEmpleados.getValueAt(fila, 16).toString();
               try {
                   java.sql.PreparedStatement actu=con.prepareStatement("UPDATE equipo SET codigo='"+txtCodigo+"', cantidad='"+txtCantidad+"',detalle='"+txtDetalle+"',marca='"+txtMarca+"',color='"+txtColor+"',modelo='"+txtModelo+"',serie='"+txtSerie+"',material='"+txtMaterial+"',dimension='"+txtDimension+"',movimiento='"+txtMovimiento+"',novedades='"+txtNovedades+"',valor='"+txtValor+"',estado='"+txtEstado+"',fecha='"+txtFecha+"',ubicacion='"+txtUbicacion+"',custodio='"+txtCustodio+"'WHERE id='"+Id+"'");
               actu.executeUpdate();
               cargaTabla2();
               }catch(Exception e){
                   
               }
               
           }
         
         
      public void Modificar3() {
               int fila=tablaEmpleados.getSelectedRow();
               int Id=Integer.parseInt(this.tablaEmpleados.getValueAt(fila, 0).toString());
             
String txtCodigo= tablaEmpleados.getValueAt(fila, 1).toString();            
String txtCantidad= tablaEmpleados.getValueAt(fila, 2).toString();
String txtDetalle= tablaEmpleados.getValueAt(fila, 3).toString();
String txtMarca= tablaEmpleados.getValueAt(fila, 4).toString();
String txtColor= tablaEmpleados.getValueAt(fila, 5).toString();
String txtModelo=tablaEmpleados.getValueAt(fila, 6).toString();
String txtSerie=tablaEmpleados.getValueAt(fila, 7).toString();
String txtMaterial=tablaEmpleados.getValueAt(fila, 8).toString();
String txtDimension= tablaEmpleados.getValueAt(fila, 9).toString();
String txtMovimiento=tablaEmpleados.getValueAt(fila, 10).toString();
String txtNovedades=tablaEmpleados.getValueAt(fila, 11).toString();
String txtValor=tablaEmpleados.getValueAt(fila, 12).toString();
String txtEstado=tablaEmpleados.getValueAt(fila, 13).toString();
String txtFecha=tablaEmpleados.getValueAt(fila, 14).toString();
String txtUbicacion=tablaEmpleados.getValueAt(fila, 15).toString();
String txtCustodio=tablaEmpleados.getValueAt(fila, 16).toString();
               try {
                   java.sql.PreparedStatement actu=con.prepareStatement("UPDATE gignacio SET codigo='"+txtCodigo+"', cantidad='"+txtCantidad+"',detalle='"+txtDetalle+"',marca='"+txtMarca+"',color='"+txtColor+"',modelo='"+txtModelo+"',serie='"+txtSerie+"',material='"+txtMaterial+"',dimension='"+txtDimension+"',movimiento='"+txtMovimiento+"',novedades='"+txtNovedades+"',valor='"+txtValor+"',estado='"+txtEstado+"',fecha='"+txtFecha+"',ubicacion='"+txtUbicacion+"',custodio='"+txtCustodio+"'WHERE id='"+Id+"'");
               actu.executeUpdate();
               cargaTabla3();
               }catch(Exception e){
                   
               }
               
           }
      
      
      
        public void Modificar4() {
               int fila=tablaEmpleados.getSelectedRow();
               int Id=Integer.parseInt(this.tablaEmpleados.getValueAt(fila, 0).toString());
             
String txtCodigo= tablaEmpleados.getValueAt(fila, 1).toString();            
String txtCantidad= tablaEmpleados.getValueAt(fila, 2).toString();
String txtDetalle= tablaEmpleados.getValueAt(fila, 3).toString();
String txtMarca= tablaEmpleados.getValueAt(fila, 4).toString();
String txtColor= tablaEmpleados.getValueAt(fila, 5).toString();
String txtModelo=tablaEmpleados.getValueAt(fila, 6).toString();
String txtSerie=tablaEmpleados.getValueAt(fila, 7).toString();
String txtMaterial=tablaEmpleados.getValueAt(fila, 8).toString();
String txtDimension= tablaEmpleados.getValueAt(fila, 9).toString();
String txtMovimiento=tablaEmpleados.getValueAt(fila, 10).toString();
String txtNovedades=tablaEmpleados.getValueAt(fila, 11).toString();
String txtValor=tablaEmpleados.getValueAt(fila, 12).toString();
String txtEstado=tablaEmpleados.getValueAt(fila, 13).toString();
String txtFecha=tablaEmpleados.getValueAt(fila, 14).toString();
String txtUbicacion=tablaEmpleados.getValueAt(fila, 15).toString();
String txtCustodio=tablaEmpleados.getValueAt(fila, 16).toString();
               try {
                   java.sql.PreparedStatement actu=con.prepareStatement("UPDATE herramientas SET codigo='"+txtCodigo+"', cantidad='"+txtCantidad+"',detalle='"+txtDetalle+"',marca='"+txtMarca+"',color='"+txtColor+"',modelo='"+txtModelo+"',serie='"+txtSerie+"',material='"+txtMaterial+"',dimension='"+txtDimension+"',movimiento='"+txtMovimiento+"',novedades='"+txtNovedades+"',valor='"+txtValor+"',estado='"+txtEstado+"',fecha='"+txtFecha+"',ubicacion='"+txtUbicacion+"',custodio='"+txtCustodio+"'WHERE id='"+Id+"'");
               actu.executeUpdate();
               cargaTabla4();
               }catch(Exception e){
                   
               }
               
           }
        
        
        
         public void Modificar5() {
               int fila=tablaEmpleados.getSelectedRow();
               int Id=Integer.parseInt(this.tablaEmpleados.getValueAt(fila, 0).toString());
             
String txtCodigo= tablaEmpleados.getValueAt(fila, 1).toString();            
String txtCantidad= tablaEmpleados.getValueAt(fila, 2).toString();
String txtDetalle= tablaEmpleados.getValueAt(fila, 3).toString();
String txtMarca= tablaEmpleados.getValueAt(fila, 4).toString();
String txtColor= tablaEmpleados.getValueAt(fila, 5).toString();
String txtModelo=tablaEmpleados.getValueAt(fila, 6).toString();
String txtSerie=tablaEmpleados.getValueAt(fila, 7).toString();
String txtMaterial=tablaEmpleados.getValueAt(fila, 8).toString();
String txtDimension= tablaEmpleados.getValueAt(fila, 9).toString();
String txtMovimiento=tablaEmpleados.getValueAt(fila, 10).toString();
String txtNovedades=tablaEmpleados.getValueAt(fila, 11).toString();
String txtValor=tablaEmpleados.getValueAt(fila, 12).toString();
String txtEstado=tablaEmpleados.getValueAt(fila, 13).toString();
String txtFecha=tablaEmpleados.getValueAt(fila, 14).toString();
String txtUbicacion=tablaEmpleados.getValueAt(fila, 15).toString();
String txtCustodio=tablaEmpleados.getValueAt(fila, 16).toString();
               try {
                   java.sql.PreparedStatement actu=con.prepareStatement("UPDATE equiposinf SET codigo='"+txtCodigo+"', cantidad='"+txtCantidad+"',detalle='"+txtDetalle+"',marca='"+txtMarca+"',color='"+txtColor+"',modelo='"+txtModelo+"',serie='"+txtSerie+"',material='"+txtMaterial+"',dimension='"+txtDimension+"',movimiento='"+txtMovimiento+"',novedades='"+txtNovedades+"',valor='"+txtValor+"',estado='"+txtEstado+"',fecha='"+txtFecha+"',ubicacion='"+txtUbicacion+"',custodio='"+txtCustodio+"'WHERE id='"+Id+"'");
               actu.executeUpdate();
               cargaTabla5();
               }catch(Exception e){
                   
               }
               
           }
  
      
        public void Modificar6() {
               int fila=tablaEmpleados.getSelectedRow();
               int Id=Integer.parseInt(this.tablaEmpleados.getValueAt(fila, 0).toString());
             
String txtCodigo= tablaEmpleados.getValueAt(fila, 1).toString();            
String txtCantidad= tablaEmpleados.getValueAt(fila, 2).toString();
String txtDetalle= tablaEmpleados.getValueAt(fila, 3).toString();
String txtMarca= tablaEmpleados.getValueAt(fila, 4).toString();
String txtColor= tablaEmpleados.getValueAt(fila, 5).toString();
String txtModelo=tablaEmpleados.getValueAt(fila, 6).toString();
String txtSerie=tablaEmpleados.getValueAt(fila, 7).toString();
String txtMaterial=tablaEmpleados.getValueAt(fila, 8).toString();
String txtDimension= tablaEmpleados.getValueAt(fila, 9).toString();
String txtMovimiento=tablaEmpleados.getValueAt(fila, 10).toString();
String txtNovedades=tablaEmpleados.getValueAt(fila, 11).toString();
String txtValor=tablaEmpleados.getValueAt(fila, 12).toString();
String txtEstado=tablaEmpleados.getValueAt(fila, 13).toString();
String txtFecha=tablaEmpleados.getValueAt(fila, 14).toString();
String txtUbicacion=tablaEmpleados.getValueAt(fila, 15).toString();
String txtCustodio=tablaEmpleados.getValueAt(fila, 16).toString();
               try {
                   java.sql.PreparedStatement actu=con.prepareStatement("UPDATE terrenos SET codigo='"+txtCodigo+"', cantidad='"+txtCantidad+"',detalle='"+txtDetalle+"',marca='"+txtMarca+"',color='"+txtColor+"',modelo='"+txtModelo+"',serie='"+txtSerie+"',material='"+txtMaterial+"',dimension='"+txtDimension+"',movimiento='"+txtMovimiento+"',novedades='"+txtNovedades+"',valor='"+txtValor+"',estado='"+txtEstado+"',fecha='"+txtFecha+"',ubicacion='"+txtUbicacion+"',custodio='"+txtCustodio+"'WHERE id='"+Id+"'");
               actu.executeUpdate();
               cargaTabla6();
               }catch(Exception e){
                   
               }
               
           }
  
         
        public void Modificar7() {
               int fila=tablaEmpleados.getSelectedRow();
               int Id=Integer.parseInt(this.tablaEmpleados.getValueAt(fila, 0).toString());
             
String txtCodigo= tablaEmpleados.getValueAt(fila, 1).toString();            
String txtCantidad= tablaEmpleados.getValueAt(fila, 2).toString();
String txtDetalle= tablaEmpleados.getValueAt(fila, 3).toString();
String txtMarca= tablaEmpleados.getValueAt(fila, 4).toString();
String txtColor= tablaEmpleados.getValueAt(fila, 5).toString();
String txtModelo=tablaEmpleados.getValueAt(fila, 6).toString();
String txtSerie=tablaEmpleados.getValueAt(fila, 7).toString();
String txtMaterial=tablaEmpleados.getValueAt(fila, 8).toString();
String txtDimension= tablaEmpleados.getValueAt(fila, 9).toString();
String txtMovimiento=tablaEmpleados.getValueAt(fila, 10).toString();
String txtNovedades=tablaEmpleados.getValueAt(fila, 11).toString();
String txtValor=tablaEmpleados.getValueAt(fila, 12).toString();
String txtEstado=tablaEmpleados.getValueAt(fila, 13).toString();
String txtFecha=tablaEmpleados.getValueAt(fila, 14).toString();
String txtUbicacion=tablaEmpleados.getValueAt(fila, 15).toString();
String txtCustodio=tablaEmpleados.getValueAt(fila, 16).toString();
               try {
                   java.sql.PreparedStatement actu=con.prepareStatement("UPDATE edificio SET codigo='"+txtCodigo+"', cantidad='"+txtCantidad+"',detalle='"+txtDetalle+"',marca='"+txtMarca+"',color='"+txtColor+"',modelo='"+txtModelo+"',serie='"+txtSerie+"',material='"+txtMaterial+"',dimension='"+txtDimension+"',movimiento='"+txtMovimiento+"',novedades='"+txtNovedades+"',valor='"+txtValor+"',estado='"+txtEstado+"',fecha='"+txtFecha+"',ubicacion='"+txtUbicacion+"',custodio='"+txtCustodio+"'WHERE id='"+Id+"'");
               actu.executeUpdate();
               cargaTabla7();
               }catch(Exception e){
                   
               }
               
           }
  
     
         public void Modificar8() {
               int fila=tablaEmpleados.getSelectedRow();
               int Id=Integer.parseInt(this.tablaEmpleados.getValueAt(fila, 0).toString());
             
String txtCodigo= tablaEmpleados.getValueAt(fila, 1).toString();            
String txtCantidad= tablaEmpleados.getValueAt(fila, 2).toString();
String txtDetalle= tablaEmpleados.getValueAt(fila, 3).toString();
String txtMarca= tablaEmpleados.getValueAt(fila, 4).toString();
String txtColor= tablaEmpleados.getValueAt(fila, 5).toString();
String txtModelo=tablaEmpleados.getValueAt(fila, 6).toString();
String txtSerie=tablaEmpleados.getValueAt(fila, 7).toString();
String txtMaterial=tablaEmpleados.getValueAt(fila, 8).toString();
String txtDimension= tablaEmpleados.getValueAt(fila, 9).toString();
String txtMovimiento=tablaEmpleados.getValueAt(fila, 10).toString();
String txtNovedades=tablaEmpleados.getValueAt(fila, 11).toString();
String txtValor=tablaEmpleados.getValueAt(fila, 12).toString();
String txtEstado=tablaEmpleados.getValueAt(fila, 13).toString();
String txtFecha=tablaEmpleados.getValueAt(fila, 14).toString();
String txtUbicacion=tablaEmpleados.getValueAt(fila, 15).toString();
String txtCustodio=tablaEmpleados.getValueAt(fila, 16).toString();
               try {
                   java.sql.PreparedStatement actu=con.prepareStatement("UPDATE trajes SET codigo='"+txtCodigo+"', cantidad='"+txtCantidad+"',detalle='"+txtDetalle+"',marca='"+txtMarca+"',color='"+txtColor+"',modelo='"+txtModelo+"',serie='"+txtSerie+"',material='"+txtMaterial+"',dimension='"+txtDimension+"',movimiento='"+txtMovimiento+"',novedades='"+txtNovedades+"',valor='"+txtValor+"',estado='"+txtEstado+"',fecha='"+txtFecha+"',ubicacion='"+txtUbicacion+"',custodio='"+txtCustodio+"'WHERE id='"+Id+"'");
               actu.executeUpdate();
               cargaTabla8();
               }catch(Exception e){
                   
               }
               
           }
  
    
           
       
    public void conectar(){
        con =null;
      
        try {
            Class.forName(driver);
            con=(Connection) DriverManager.getConnection(url,user,pass);
            if(con!=null){
                estadoCon.setText("");
            }
        } catch (Exception e) {
            estadoCon.setText("Conexion no exitosa "+e);
        }
    }
    /**
     * Creates new form Formulario
     */
    
    
    private void Agrega(){
    try{
     java.sql.PreparedStatement guardar =con.prepareStatement("INSERT INTO vehiculo(codigo, cantidad,detalle,marca,color,modelo,serie,material,dimension,movimiento,novedades,valor,estado,fecha,ubicacion,custodio)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
               
guardar.setString( 1,txtCodigo.getText());
guardar.setString( 2,txtC.getText());
guardar.setString( 3,txtDetalle.getText());
guardar.setString( 4,txtMarca.getText());
guardar.setString( 5,txtColor.getText());
guardar.setString( 6,txtModelo.getText());
guardar.setString( 7,txtSerie.getText());
guardar.setString( 8,txtMaterial.getText());
guardar.setString( 9,txtDimension.getText());
guardar.setString( 10,txtMovimiento.getText());
guardar.setString( 11,txtNovedades.getText());
guardar.setString( 12,txtValor.getText());
guardar.setString( 13,txtEstado.getText());
guardar.setString( 14,txtFecha.getText());
guardar.setString( 15,txtUbicacion.getText());
guardar.setString( 16,txtCustodio.getText());
guardar.executeUpdate();
JOptionPane.showMessageDialog(null, "Registro agregado");

   
}catch(Exception e){
}
    }  
    
  


    
    
    public Formulario() {
        initComponents();
          
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        estadoCon = new javax.swing.JLabel();
        LlenarTabla = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDetalle = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtSerie = new javax.swing.JTextField();
        txtMaterial = new javax.swing.JTextField();
        txtDimension = new javax.swing.JTextField();
        txtMovimiento = new javax.swing.JTextField();
        txtNovedades = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        txtCustodio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtAgregar = new javax.swing.JButton();
        txtC = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtAgregar1 = new javax.swing.JButton();
        txtAgregar2 = new javax.swing.JButton();
        txtAgregar3 = new javax.swing.JButton();
        txtAgregar4 = new javax.swing.JButton();
        txtAgregar5 = new javax.swing.JButton();
        txtAgregar6 = new javax.swing.JButton();
        txtAgregar7 = new javax.swing.JButton();
        txtAgregar8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bntModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        comobo1 = new javax.swing.JComboBox<>();
        tablaTotal = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txtR = new javax.swing.JTextField();
        txtV1 = new javax.swing.JTextField();
        txtFinal = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Inventario Centro de Bomberos de  Guaranda");
        setBackground(new java.awt.Color(255, 51, 102));
        setForeground(new java.awt.Color(255, 0, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(estadoCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1516, 55, 345, 26));

        LlenarTabla.setText("Mostrar Datos");
        LlenarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LlenarTablaActionPerformed(evt);
            }
        });
        getContentPane().add(LlenarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        tablaEmpleados.setBackground(new java.awt.Color(204, 255, 204));
        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "numero", "codigo", "cantidad", "detalle", "marca", "color", "modelo", "serie", "material", "dimension", "movimiento", "novedades", "valor", "estado", "fecha", "ubicacion", "custodio"
            }
        ));
        jScrollPane1.setViewportView(tablaEmpleados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1510, 320));

        txtBuscar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtBuscarCaretUpdate(evt);
            }
        });
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 210, 30));

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setText("Datos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 130, -1));
        jPanel1.add(txtDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 130, -1));
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 130, -1));
        jPanel1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 130, -1));
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 130, -1));
        jPanel1.add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 130, -1));
        jPanel1.add(txtMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 130, -1));
        jPanel1.add(txtDimension, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 110, -1));

        txtMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMovimientoActionPerformed(evt);
            }
        });
        jPanel1.add(txtMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 110, -1));
        jPanel1.add(txtNovedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 110, -1));
        jPanel1.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 110, -1));
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 110, -1));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 110, -1));
        jPanel1.add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 110, -1));

        txtCustodio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustodioActionPerformed(evt);
            }
        });
        jPanel1.add(txtCustodio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 110, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Código");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Cantidad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Detalle");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Marca");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Color");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Modelo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Serie");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Material");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Dimensión");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Movimiento");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Novedades");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("V/U");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Estado");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Fecha");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Ubicación");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Custodio");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        txtAgregar.setText("Vehículo");
        txtAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(txtAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 20));
        jPanel1.add(txtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 130, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel20.setText("Seleccione la categoría ");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, 20));

        jLabel21.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel21.setText("Agregar");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        txtAgregar1.setText("Maquinaria");
        txtAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgregar1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 20));

        txtAgregar2.setText("Equipo");
        txtAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgregar2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtAgregar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 20));

        txtAgregar3.setText("Gimnacio");
        txtAgregar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgregar3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtAgregar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 110, 20));

        txtAgregar4.setText("Herramientas");
        txtAgregar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgregar4ActionPerformed(evt);
            }
        });
        jPanel1.add(txtAgregar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 20));

        txtAgregar5.setText("Equipos.Inf");
        txtAgregar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgregar5ActionPerformed(evt);
            }
        });
        jPanel1.add(txtAgregar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 110, 20));

        txtAgregar6.setText("Terrenos");
        txtAgregar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgregar6ActionPerformed(evt);
            }
        });
        jPanel1.add(txtAgregar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 110, 20));

        txtAgregar7.setText("Edificios");
        txtAgregar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgregar7ActionPerformed(evt);
            }
        });
        jPanel1.add(txtAgregar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 110, 20));

        txtAgregar8.setText("Trajes");
        txtAgregar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgregar8ActionPerformed(evt);
            }
        });
        jPanel1.add(txtAgregar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 110, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 660, 400));

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 100, 30));

        bntModificar.setText("Modificar");
        bntModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntModificarActionPerformed(evt);
            }
        });
        getContentPane().add(bntModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jonathan\\Documents\\NetBeansProjects\\Sistema\\F1.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 900, 400));

        jLabel19.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel19.setText("Buscar ( código)");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 150, -1));

        comobo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "vehiculo", "maquinaria", "equipo", "gimnacio", "herramientas", "equipos informaticos", "terrenos", "edificios", "trajes" }));
        comobo1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comobo1ItemStateChanged(evt);
            }
        });
        getContentPane().add(comobo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 130, 30));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Total"
            }
        ));
        tablaTotal.setViewportView(tabla);

        getContentPane().add(tablaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 270, 50));
        getContentPane().add(txtR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, 100, 30));

        txtV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtV1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, 80, 30));
        getContentPane().add(txtFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 20, 100, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel22.setText("Valor Anterior");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 80, 20));

        jLabel23.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel23.setText("Incremento");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, -1, 20));

        jLabel24.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel24.setText("Total");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 30, 20));

        jButton2.setText("Cerrar sesión");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 0, 100, 40));

        pack();
    }// </editor-fold>                        

    private void LlenarTablaActionPerformed(java.awt.event.ActionEvent evt) {                                            
        conectar();
        int id= comobo1.getSelectedIndex();
        if (id ==0){
        cargaTabla();
        c1();
        }else{ if (id ==1){
            cargaTabla1();
            c2();
        }else{ if (id ==2){
            cargaTabla2();
            c3();
        }else{ if (id ==3){
            cargaTabla3();
            c4();
        }else{ if (id ==4){
            cargaTabla4();
            c5();
        }else{ if (id ==5){
            cargaTabla5();
            c6();
        }else{ if (id ==6){
            cargaTabla6();
            c7();
        }else{ if (id ==7){
            cargaTabla7();
            c8();
        }else{ if (id ==8){
            cargaTabla8();
            c9();
        }
        }
        }}}}}
        }
        }
    }                                           

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {                                   
       txtBuscar.addKeyListener(new KeyAdapter() {
         public void keyReleased(final KeyEvent e) {
         String cadena = (txtBuscar.getText()).toUpperCase();
         txtBuscar.setText(cadena);

         repaint();
         filtro();
         }
         
         });



 trsfiltro = new TableRowSorter(tablaEmpleados.getModel());
tablaEmpleados.setRowSorter(trsfiltro);   
    }                                  

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {                                      

     
       
          
        
        
        
    }                                     

    
    
    
    
    
    private void txtAgregarActionPerformed(java.awt.event.ActionEvent evt) {                                           
   
       
        Agrega();    
      cargaTabla();
                  
                     int num1= Integer.parseInt(txtC.getText());
                     int num2= Integer.parseInt(txtValor.getText());
                     txtR.setText(String.valueOf(tabla.getValueAt(0, 0).toString()));
                     txtV1.setText(String.valueOf(num1*num2));
                     int t1= Integer.parseInt(txtR.getText());
                     int t2= Integer.parseInt(txtV1.getText()); 
                     txtFinal.setText(String.valueOf(t1+t2).toString());
            
       
               try {
                   java.sql.PreparedStatement actu=con.prepareStatement("UPDATE total SET vehiculo='"+txtFinal.getText()+"'");
               actu.executeUpdate();
               cargaTabla();
               }catch(Exception e){
                   
               }
               cargaTabla();
   
    }                                          

    private void txtMovimientoActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void txtCustodioActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        int id= comobo1.getSelectedIndex();
        if (id ==0){
        eliminar();
        }else{ if (id ==1){
            eliminar1();
        }else{ if (id ==2){
            eliminar2();
        }else{ if (id ==3){
            eliminar3();
        }else{ if (id ==4){
            eliminar4();
        }else{ if (id ==5){
            eliminar5();
        }else{ if (id ==6){
            eliminar6();
        }else{ if (id ==7){
            eliminar7();
        }else{ if (id ==8){
            eliminar8();
        }
        }
        }}}}}
        }
        }
        
    }                                        

    private void bntModificarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        int id= comobo1.getSelectedIndex();
        if (id ==0){
        Modificar();
        }else{ 
            if (id ==1){
            Modificar1();
        }else{ if (id ==2){
            Modificar2();
        }else{ if (id ==3){
            Modificar3();
        }else{ if (id ==4){
            Modificar4();
        }else{ if (id ==5){
            Modificar5();
        }else{ if (id ==6){
            Modificar6();
        }else{ if (id ==7){
            Modificar7();
        }else{ if (id ==8){
            Modificar8();}else{}
        }}}}}}}}
    
    }                                            

    private void txtBuscarCaretUpdate(javax.swing.event.CaretEvent evt) {                                      
      
        
        
    }                                     

    private void comobo1ItemStateChanged(java.awt.event.ItemEvent evt) {                                         
      
    }                                        

    private void txtAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
     
    try{
     java.sql.PreparedStatement guardar =con.prepareStatement("INSERT INTO maquinaria(codigo, cantidad,detalle,marca,color,modelo,serie,material,dimension,movimiento,novedades,valor,estado,fecha,ubicacion,custodio)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
               
guardar.setString( 1,txtCodigo.getText());
guardar.setString( 2,txtC.getText());
guardar.setString( 3,txtDetalle.getText());
guardar.setString( 4,txtMarca.getText());
guardar.setString( 5,txtColor.getText());
guardar.setString( 6,txtModelo.getText());
guardar.setString( 7,txtSerie.getText());
guardar.setString( 8,txtMaterial.getText());
guardar.setString( 9,txtDimension.getText());
guardar.setString( 10,txtMovimiento.getText());
guardar.setString( 11,txtNovedades.getText());
guardar.setString( 12,txtValor.getText());
guardar.setString( 13,txtEstado.getText());
guardar.setString( 14,txtFecha.getText());
guardar.setString( 15,txtUbicacion.getText());
guardar.setString( 16,txtCustodio.getText());
guardar.executeUpdate();
JOptionPane.showMessageDialog(null, "Registro agregado");

   
}catch(Exception e){
}
       
      
     cargaTabla1();
      
      
           int num1= Integer.parseInt(txtC.getText());
                     int num2= Integer.parseInt(txtValor.getText());
                     txtR.setText(String.valueOf(tabla.getValueAt(0, 0).toString()));
                     txtV1.setText(String.valueOf(num1*num2));
                     int t1= Integer.parseInt(txtR.getText());
                     int t2= Integer.parseInt(txtV1.getText()); 
                     txtFinal.setText(String.valueOf(t1+t2).toString());
            
       
               try {
                   java.sql.PreparedStatement actu=con.prepareStatement("UPDATE total SET maquinaria='"+txtFinal.getText()+"'");
               actu.executeUpdate();
               cargaTabla();
               }catch(Exception e){
                   
               }
      
      
      
      cargaTabla1();
      
      
      
      
      
      
      
      
      
    }                                           

    private void txtAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
    try{
     java.sql.PreparedStatement guardar =con.prepareStatement("INSERT INTO equipo(codigo, cantidad,detalle,marca,color,modelo,serie,material,dimension,movimiento,novedades,valor,estado,fecha,ubicacion,custodio)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
               
guardar.setString( 1,txtCodigo.getText());
guardar.setString( 2,txtC.getText());
guardar.setString( 3,txtDetalle.getText());
guardar.setString( 4,txtMarca.getText());
guardar.setString( 5,txtColor.getText());
guardar.setString( 6,txtModelo.getText());
guardar.setString( 7,txtSerie.getText());
guardar.setString( 8,txtMaterial.getText());
guardar.setString( 9,txtDimension.getText());
guardar.setString( 10,txtMovimiento.getText());
guardar.setString( 11,txtNovedades.getText());
guardar.setString( 12,txtValor.getText());
guardar.setString( 13,txtEstado.getText());
guardar.setString( 14,txtFecha.getText());
guardar.setString( 15,txtUbicacion.getText());
guardar.setString( 16,txtCustodio.getText());
guardar.executeUpdate();
JOptionPane.showMessageDialog(null, "Registro agregado");

   
}catch(Exception e){
}
  cargaTabla2();  
  
    int num1= Integer.parseInt(txtC.getText());
                     int num2= Integer.parseInt(txtValor.getText());
                     txtR.setText(String.valueOf(tabla.getValueAt(0, 0).toString()));
                     txtV1.setText(String.valueOf(num1*num2));
                     int t1= Integer.parseInt(txtR.getText());
                     int t2= Integer.parseInt(txtV1.getText()); 
                     txtFinal.setText(String.valueOf(t1+t2).toString());
            
       
               try {
                   java.sql.PreparedStatement actu=con.prepareStatement("UPDATE total SET equipo='"+txtFinal.getText()+"'");
               actu.executeUpdate();
               cargaTabla();
               }catch(Exception e){
                   
               }
      
      
      
      cargaTabla2();
  
  
  
  
  
  
  
  
    }                                           

    private void txtAgregar3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
    try{
     java.sql.PreparedStatement guardar =con.prepareStatement("INSERT INTO gignacio(codigo, cantidad,detalle,marca,color,modelo,serie,material,dimension,movimiento,novedades,valor,estado,fecha,ubicacion,custodio)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
               
guardar.setString( 1,txtCodigo.getText());
guardar.setString( 2,txtC.getText());
guardar.setString( 3,txtDetalle.getText());
guardar.setString( 4,txtMarca.getText());
guardar.setString( 5,txtColor.getText());
guardar.setString( 6,txtModelo.getText());
guardar.setString( 7,txtSerie.getText());
guardar.setString( 8,txtMaterial.getText());
guardar.setString( 9,txtDimension.getText());
guardar.setString( 10,txtMovimiento.getText());
guardar.setString( 11,txtNovedades.getText());
guardar.setString( 12,txtValor.getText());
guardar.setString( 13,txtEstado.getText());
guardar.setString( 14,txtFecha.getText());
guardar.setString( 15,txtUbicacion.getText());
guardar.setString( 16,txtCustodio.getText());
guardar.executeUpdate();
JOptionPane.showMessageDialog(null, "Registro agregado");

   
}catch(Exception e){
}
    cargaTabla3();
    
    
    
      int num1= Integer.parseInt(txtC.getText());
                     int num2= Integer.parseInt(txtValor.getText());
                     txtR.setText(String.valueOf(tabla.getValueAt(0, 0).toString()));
                     txtV1.setText(String.valueOf(num1*num2));
                     int t1= Integer.parseInt(txtR.getText());
                     int t2= Integer.parseInt(txtV1.getText()); 
                     txtFinal.setText(String.valueOf(t1+t2).toString());
            
       
               try {
                   java.sql.PreparedStatement actu=con.prepareStatement("UPDATE total SET gimnacio='"+txtFinal.getText()+"'");
               actu.executeUpdate();
               cargaTabla();
               }catch(Exception e){
                   
               }
      
      
      
      cargaTabla3();
    }                                           

    private void txtAgregar4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
    try{
     java.sql.PreparedStatement guardar =con.prepareStatement("INSERT INTO herramientas(codigo, cantidad,detalle,marca,color,modelo,serie,material,dimension,movimiento,novedades,valor,estado,fecha,ubicacion,custodio)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
               
guardar.setString( 1,txtCodigo.getText());
guardar.setString( 2,txtC.getText());
guardar.setString( 3,txtDetalle.getText());
guardar.setString( 4,txtMarca.getText());
guardar.setString( 5,txtColor.getText());
guardar.setString( 6,txtModelo.getText());
guardar.setString( 7,txtSerie.getText());
guardar.setString( 8,txtMaterial.getText());
guardar.setString( 9,txtDimension.getText());
guardar.setString( 10,txtMovimiento.getText());
guardar.setString( 11,txtNovedades.getText());
guardar.setString( 12,txtValor.getText());
guardar.setString( 13,txtEstado.getText());
guardar.setString( 14,txtFecha.getText());
guardar.setString( 15,txtUbicacion.getText());
guardar.setString( 16,txtCustodio.getText());
guardar.executeUpdate();
JOptionPane.showMessageDialog(null, "Registro agregado");

   
}catch(Exception e){
}
    cargaTabla4();
    
    
    
      int num1= Integer.parseInt(txtC.getText());
                     int num2= Integer.parseInt(txtValor.getText());
                     txtR.setText(String.valueOf(tabla.getValueAt(0, 0).toString()));
                     txtV1.setText(String.valueOf(num1*num2));
                     int t1= Integer.parseInt(txtR.getText());
                     int t2= Integer.parseInt(txtV1.getText()); 
                     txtFinal.setText(String.valueOf(t1+t2).toString());
            
       
               try {
                   java.sql.PreparedStatement actu=con.prepareStatement("UPDATE total SET herramientas='"+txtFinal.getText()+"'");
               actu.executeUpdate();
               cargaTabla();
               }catch(Exception e){
                   
               }
      
      
      
      cargaTabla4();
    
    
    
    
    
    
    
    }                                           

    private void txtAgregar5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
      
    try{
     java.sql.PreparedStatement guardar =con.prepareStatement("INSERT INTO equiposinf(codigo, cantidad,detalle,marca,color,modelo,serie,material,dimension,movimiento,novedades,valor,estado,fecha,ubicacion,custodio)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
               
guardar.setString( 1,txtCodigo.getText());
guardar.setString( 2,txtC.getText());
guardar.setString( 3,txtDetalle.getText());
guardar.setString( 4,txtMarca.getText());
guardar.setString( 5,txtColor.getText());
guardar.setString( 6,txtModelo.getText());
guardar.setString( 7,txtSerie.getText());
guardar.setString( 8,txtMaterial.getText());
guardar.setString( 9,txtDimension.getText());
guardar.setString( 10,txtMovimiento.getText());
guardar.setString( 11,txtNovedades.getText());
guardar.setString( 12,txtValor.getText());
guardar.setString( 13,txtEstado.getText());
guardar.setString( 14,txtFecha.getText());
guardar.setString( 15,txtUbicacion.getText());
guardar.setString( 16,txtCustodio.getText());
guardar.executeUpdate();
JOptionPane.showMessageDialog(null, "Registro agregado");

   
}catch(Exception e){
}
    cargaTabla5();
    
    
    
      int num1= Integer.parseInt(txtC.getText());
                     int num2= Integer.parseInt(txtValor.getText());
                     txtR.setText(String.valueOf(tabla.getValueAt(0, 0).toString()));
                     txtV1.setText(String.valueOf(num1*num2));
                     int t1= Integer.parseInt(txtR.getText());
                     int t2= Integer.parseInt(txtV1.getText()); 
                     txtFinal.setText(String.valueOf(t1+t2).toString());
            
       
               try {
                   java.sql.PreparedStatement actu=con.prepareStatement("UPDATE total SET equiposinf='"+txtFinal.getText()+"'");
               actu.executeUpdate();
               cargaTabla();
               }catch(Exception e){
                   
               }
      
      
      
      cargaTabla5();
    
    
    
    
    
    
    
    
    
    
    
    
    }                                           

    private void txtAgregar6ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    
    try{
     java.sql.PreparedStatement guardar =con.prepareStatement("INSERT INTO terrenos(codigo, cantidad,detalle,marca,color,modelo,serie,material,dimension,movimiento,novedades,valor,estado,fecha,ubicacion,custodio)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
               
guardar.setString( 1,txtCodigo.getText());
guardar.setString( 2,txtC.getText());
guardar.setString( 3,txtDetalle.getText());
guardar.setString( 4,txtMarca.getText());
guardar.setString( 5,txtColor.getText());
guardar.setString( 6,txtModelo.getText());
guardar.setString( 7,txtSerie.getText());
guardar.setString( 8,txtMaterial.getText());
guardar.setString( 9,txtDimension.getText());
guardar.setString( 10,txtMovimiento.getText());
guardar.setString( 11,txtNovedades.getText());
guardar.setString( 12,txtValor.getText());
guardar.setString( 13,txtEstado.getText());
guardar.setString( 14,txtFecha.getText());
guardar.setString( 15,txtUbicacion.getText());
guardar.setString( 16,txtCustodio.getText());
guardar.executeUpdate();
JOptionPane.showMessageDialog(null, "Registro agregado");

   
}catch(Exception e){
}
    cargaTabla6();
    
    
    
      int num1= Integer.parseInt(txtC.getText());
                     int num2= Integer.parseInt(txtValor.getText());
                     txtR.setText(String.valueOf(tabla.getValueAt(0, 0).toString()));
                     txtV1.setText(String.valueOf(num1*num2));
                     int t1= Integer.parseInt(txtR.getText());
                     int t2= Integer.parseInt(txtV1.getText()); 
                     txtFinal.setText(String.valueOf(t1+t2).toString());
            
       
               try {
                   java.sql.PreparedStatement actu=con.prepareStatement("UPDATE total SET terrenos='"+txtFinal.getText()+"'");
               actu.executeUpdate();
               cargaTabla();
               }catch(Exception e){
                   
               }
      
      
      
      cargaTabla6();
    
    
    
    
    
    
    
    
    
    
    }                                           

    private void txtAgregar7ActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
    try{
     java.sql.PreparedStatement guardar =con.prepareStatement("INSERT INTO edificio(codigo, cantidad,detalle,marca,color,modelo,serie,material,dimension,movimiento,novedades,valor,estado,fecha,ubicacion,custodio)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
               
guardar.setString( 1,txtCodigo.getText());
guardar.setString( 2,txtC.getText());
guardar.setString( 3,txtDetalle.getText());
guardar.setString( 4,txtMarca.getText());
guardar.setString( 5,txtColor.getText());
guardar.setString( 6,txtModelo.getText());
guardar.setString( 7,txtSerie.getText());
guardar.setString( 8,txtMaterial.getText());
guardar.setString( 9,txtDimension.getText());
guardar.setString( 10,txtMovimiento.getText());
guardar.setString( 11,txtNovedades.getText());
guardar.setString( 12,txtValor.getText());
guardar.setString( 13,txtEstado.getText());
guardar.setString( 14,txtFecha.getText());
guardar.setString( 15,txtUbicacion.getText());
guardar.setString( 16,txtCustodio.getText());
guardar.executeUpdate();
JOptionPane.showMessageDialog(null, "Registro agregado");

   
}catch(Exception e){
}
    cargaTabla7();
    
    
      int num1= Integer.parseInt(txtC.getText());
                     int num2= Integer.parseInt(txtValor.getText());
                     txtR.setText(String.valueOf(tabla.getValueAt(0, 0).toString()));
                     txtV1.setText(String.valueOf(num1*num2));
                     int t1= Integer.parseInt(txtR.getText());
                     int t2= Integer.parseInt(txtV1.getText()); 
                     txtFinal.setText(String.valueOf(t1+t2).toString());
            
       
               try {
                   java.sql.PreparedStatement actu=con.prepareStatement("UPDATE total SET edificio='"+txtFinal.getText()+"'");
               actu.executeUpdate();
               cargaTabla();
               }catch(Exception e){
                   
               }
      
      
      
      cargaTabla7();
    
    
    
    }                                           

    private void txtAgregar8ActionPerformed(java.awt.event.ActionEvent evt) {                                            
      
    try{
     java.sql.PreparedStatement guardar =con.prepareStatement("INSERT INTO trajes(codigo, cantidad,detalle,marca,color,modelo,serie,material,dimension,movimiento,novedades,valor,estado,fecha,ubicacion,custodio)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
               
guardar.setString( 1,txtCodigo.getText());
guardar.setString( 2,txtC.getText());
guardar.setString( 3,txtDetalle.getText());
guardar.setString( 4,txtMarca.getText());
guardar.setString( 5,txtColor.getText());
guardar.setString( 6,txtModelo.getText());
guardar.setString( 7,txtSerie.getText());
guardar.setString( 8,txtMaterial.getText());
guardar.setString( 9,txtDimension.getText());
guardar.setString( 10,txtMovimiento.getText());
guardar.setString( 11,txtNovedades.getText());
guardar.setString( 12,txtValor.getText());
guardar.setString( 13,txtEstado.getText());
guardar.setString( 14,txtFecha.getText());
guardar.setString( 15,txtUbicacion.getText());
guardar.setString( 16,txtCustodio.getText());
guardar.executeUpdate();
JOptionPane.showMessageDialog(null, "Registro agregado");

   
}catch(Exception e){
}
    cargaTabla8();
    
    
      int num1= Integer.parseInt(txtC.getText());
                     int num2= Integer.parseInt(txtValor.getText());
                     txtR.setText(String.valueOf(tabla.getValueAt(0, 0).toString()));
                     txtV1.setText(String.valueOf(num1*num2));
                     int t1= Integer.parseInt(txtR.getText());
                     int t2= Integer.parseInt(txtV1.getText()); 
                     txtFinal.setText(String.valueOf(t1+t2).toString());
            
       
               try {
                   java.sql.PreparedStatement actu=con.prepareStatement("UPDATE total SET trajes='"+txtFinal.getText()+"'");
               actu.executeUpdate();
               cargaTabla();
               }catch(Exception e){
                   
               }
      
      
      
      cargaTabla8();

    }                                           

    private void txtV1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        Login f=new Login();
            f.setVisible(true);
        dispose();
    }                                        

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {                                     
      
          
// TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton LlenarTabla;
    private javax.swing.JButton bntModificar;
    private javax.swing.JComboBox<String> comobo1;
    private javax.swing.JLabel estadoCon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JScrollPane tablaTotal;
    private javax.swing.JButton txtAgregar;
    private javax.swing.JButton txtAgregar1;
    private javax.swing.JButton txtAgregar2;
    private javax.swing.JButton txtAgregar3;
    private javax.swing.JButton txtAgregar4;
    private javax.swing.JButton txtAgregar5;
    private javax.swing.JButton txtAgregar6;
    private javax.swing.JButton txtAgregar7;
    private javax.swing.JButton txtAgregar8;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtCustodio;
    private javax.swing.JTextField txtDetalle;
    private javax.swing.JTextField txtDimension;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFinal;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMaterial;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMovimiento;
    private javax.swing.JTextField txtNovedades;
    private javax.swing.JTextField txtR;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtUbicacion;
    private javax.swing.JTextField txtV1;
    private javax.swing.JTextField txtValor;
    // End of variables declaration                   

   
}
