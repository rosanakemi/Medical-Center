/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.repository.UsuarioRepositorio;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Usuario;

/**
 *
 * @author zanna
 */
public class UsuarioServico {
    
    public ArrayList<Usuario> consultarTodos(){
        UsuarioRepositorio repositorio = new UsuarioRepositorio();
        return repositorio.obterTodos();
    }
    
    public Usuario consultarPorId(int id){
        UsuarioRepositorio repositorio = new UsuarioRepositorio();
        return repositorio.obterPorId(id);
    }
    
    public ArrayList<Usuario> filtrar(String login){
        UsuarioRepositorio repositorio = new UsuarioRepositorio();
        return repositorio.obterPorLoginn(login);
    }
    
    public boolean cadastrar(String login, String senha) throws ParseException{
        UsuarioRepositorio repositorio = new UsuarioRepositorio();        
        
       
        
        Usuario usuario = new Usuario(1, login, senha);
        
                
        repositorio.salvar(usuario);
        return true;
    }
    
    public boolean atualizar(int id,String login, String senha) throws ParseException{
        UsuarioRepositorio repositorio = new UsuarioRepositorio();
        
        Usuario usuario = repositorio.obterPorId(id);
        usuario.setLogin(login);
        
        usuario.setSenha(senha);        
        repositorio.atualizar(usuario);
        return true;
    }
    
    public boolean deletar(int id){
        UsuarioRepositorio repositorio = new UsuarioRepositorio();
        repositorio.excluir(id);
        return true;
    }
    
    
}
