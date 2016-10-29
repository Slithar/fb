/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.util.ArrayList;
import logica.*;
/**
 *
 * @author kapo_
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        controlador cont = new controlador();
        ArrayList<usuario> lista = new ArrayList();
        lista = cont.getListaDeUsuarios();
        framePrincipal fp = new framePrincipal(cont);
        fp.setVisible(true);
    }
    
}
