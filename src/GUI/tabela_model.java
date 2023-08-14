/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import Controlador.Controlador;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hmmm1
 */
public class tabela_model {
    
    public static javax.swing.table.DefaultTableModel modelo(){
        String[][] data = Controlador.universidade.exibir_funcionarios();
        DefaultTableModel modelo = new DefaultTableModel(data, new String[]{"Código","Nome","Tipo","Nivel","Departameto"});
        return modelo;
    }   
}
