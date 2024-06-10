/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.repository.UsuarioRepositorio;
import model.Usuario;

/**
 * Serviço de autenticação de usuários.
 * Verifica se o login e a senha fornecidos são válidos.
 */
public class AutenticacaoServico {
    /**
     * Autentica um usuário com base no login e senha fornecidos.
     */
   
    public boolean autenticar(String login, String senha){
        UsuarioRepositorio repo = new UsuarioRepositorio(); // Cria um repositório de usuários
        Usuario usuario = repo.obterPorLogin(login); // Obtém o usuário pelo login
        if (usuario == null){
            return false;
        }
        // Verifica se a senha fornecida corresponde à senha armazenada
        if (!usuario.getSenha().equals(senha)){
            return false;
        }
        // Se o login e a senha forem válidos, retorna true
        return true;
    }
}
