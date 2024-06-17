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
 * Classe de serviço para operações relacionadas aos usuários.
 * Realiza operações de CRUD (Criar, Ler, Atualizar, Deletar) para a entidade Usuário.
 * 
 * @autor zanna
 */
public class UsuarioServico {
    // Método para consultar todos os usuários
    public ArrayList<Usuario> consultarTodos(){
        UsuarioRepositorio repositorio = new UsuarioRepositorio();
        return repositorio.obterTodos();
    }
    // Método para consultar um usuário pelo ID
    public Usuario consultarPorId(int id){
        UsuarioRepositorio repositorio = new UsuarioRepositorio();
        return repositorio.obterPorId(id);
    }
    // Método para filtrar usuários pelo login
    public ArrayList<Usuario> filtrar(String login){
        UsuarioRepositorio repositorio = new UsuarioRepositorio();
        return repositorio.obterPorLoginn(login);
    }
    // Método para cadastrar um novo usuário
    public boolean cadastrar(String login, String senha) throws ParseException{
        UsuarioRepositorio repositorio = new UsuarioRepositorio();        
        
       
        // Cria um novo objeto Usuario com os dados fornecidos
        Usuario usuario = new Usuario(1, login, senha);
        
         // Salva o usuário no repositório       
        repositorio.salvar(usuario);
        return true;
    }
     // Método para atualizar um usuário existente
    public boolean atualizar(int id,String login, String senha) throws ParseException{
        UsuarioRepositorio repositorio = new UsuarioRepositorio();
        // Obtém o usuário existente pelo ID
        Usuario usuario = repositorio.obterPorId(id);
        usuario.setLogin(login);
        // Atualiza o usuário no repositório
        usuario.setSenha(senha);        
        repositorio.atualizar(usuario);
        return true;
    }
    // Método para deletar um usuário pelo ID
    public boolean deletar(int id){
        UsuarioRepositorio repositorio = new UsuarioRepositorio();
        repositorio.excluir(id);
        return true;
    }
    
    
}
