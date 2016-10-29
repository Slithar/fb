/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author kapo_
 */
public class controlador {
    private ArrayList<usuario> listaDeUsuarios = new ArrayList();

    public controlador() {
    }
    
    public ArrayList getListaDeUsuarios(){
        return listaDeUsuarios;
    }
    public void agregarUsuario(usuario u){
        listaDeUsuarios.add(u);
    }
    public boolean existeUsuario(String nickname){
        boolean existe = false;
        for(usuario a : listaDeUsuarios){
            if(a.getNick().equals(nickname)){
                existe = true;
            }
        }
        return existe;
    }
    
    public boolean iniciarSesion(String nick, String psw){
        boolean correcto = false;
        for(usuario a : listaDeUsuarios){
            if(a.getNick().equals(nick) && a.getPsw().equals((psw))){
                correcto = true;
            }
        }
        return correcto;
    }
    public usuario getUserByNick(String nick){
        usuario user = new usuario();
        for(usuario a : listaDeUsuarios){
            if(a.getNick().equals(nick)){
                
            }
        }
        return user;
    }
}
