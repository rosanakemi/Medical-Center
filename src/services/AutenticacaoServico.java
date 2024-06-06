/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.repository.UsuarioRepositorio;
import model.Usuario;

/**
 *
 * @author zanna
 */
public class AutenticacaoServico {
   
    public boolean autenticar(String login, String senha){
        UsuarioRepositorio repo = new UsuarioRepositorio();
        Usuario usuario = repo.obterPorLogin(login);
        if (usuario == null){
            return false;
        }
        if (!usuario.getSenha().equals(senha)){
            return false;
        }
        return true;
    }
}
