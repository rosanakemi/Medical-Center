/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao.repository;

import java.util.ArrayList;

/**
 * Interface genérica para repositórios.
 * Define um contrato para operações básicas de repositório.
 * 
 * @autor zanna
 */
public interface IRepositorio <T> {
    /**
     * Obtém todos os objetos do tipo T do repositório.
     * 
     * @return  Uma lista de todos os objetos do tipo T.
     */
    public ArrayList<T> obterTodos();

    // esse metodo salva dados no banco.
    public void salvar(T obj);
    
    // metodo para atualizar um registro no banco.
    public void atualizar(T obj);
    
        // Código para excluir um usuário pelo ID
     public void excluir (int id);
     
     public T obterPorId (int id);
     
}
