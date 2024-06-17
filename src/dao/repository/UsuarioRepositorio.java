
package dao.repository;

import dao.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

/**
 * Repositório para manipulação dos dados de usuários no banco de dados.
 *
 * @autor zanna
 * @autor Aldrijon
 */
public class UsuarioRepositorio implements IRepositorio<Usuario> {

    /**
     * Obtém todos os usuários do banco de dados.
     *
     */
    @Override
    public ArrayList<Usuario> obterTodos() {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Usuario> usuarios = new ArrayList<>(); // Lista para armazenar os usuários

        // pecorre sobre os resultados da consulta
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario");// Prepara a consulta SQL
            rs = stmt.executeQuery(); // Executa a consulta

            while (rs.next()) {
                int id= rs.getInt("id_usuario");
                String login = rs.getString("login");
                String senha = rs.getString("senha");
                Usuario usuario = new Usuario(id, login, senha); // Cria um objeto Usuario
                usuarios.add(usuario); // Adiciona o usuário à lista
                System.out.println(usuarios);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // Fecha a conexão, o PreparedStatement e o ResultSet
        }

        return usuarios; // Retorna a lista de usuários
    }

    /**
     * Obtém um usuário pelo login do banco de dados.
     * @param login
     * @return Usuario
     */
    public Usuario obterPorLogin(String login) {

        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados

        PreparedStatement stmt = null;
        ResultSet rs = null;

        Usuario usuario = null; // Inicializa o objeto Usuario

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ?"); // Prepara a consulta SQL
            stmt.setString(1, login); // Define o parâmetro do login
            rs = stmt.executeQuery(); // Executa a consulta

            // Verifica se há resultado
            if (rs.next()) {
                int id_usuario= rs.getInt("id_usuario");
                String dblogin = rs.getString("login");
                String senha = rs.getString("senha");
                usuario = new Usuario(id_usuario, dblogin, senha); // Cria um objeto Usuario
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // Fecha a conexão, o PreparedStatement e o ResultSet
        }

        return usuario; // Retorna o usuário ou null

    }
    
       public ArrayList<Usuario> obterPorLoginn(String loginUsuario) {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null; // Objeto para executar instruções SQL parametrizadas.
        ResultSet rs = null; // Objeto para armazenar e processar resultados de consultas SQL.

        ArrayList<Usuario> usuarios = new ArrayList<>(); // Lista para armazenar os Usuarios.

        // pecorre sobre os resultados da consulta
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login LIKE ?");// Prepara a consulta SQL
            stmt.setString(1, "%"+loginUsuario+"%");
            rs = stmt.executeQuery(); // Executa a consulta

            // while - fique repetido.. repetição
            while (rs.next()) {
                int id = rs.getInt("id_usuario");
                String senha = rs.getString("senha");
                String login = rs.getString("login");
                Usuario usuario = new Usuario(id, login,senha); // Cria um objeto Usuario
                usuarios.add(usuario); // Adiciona o usuario à lista
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // Fecha a conexão, o PreparedStatement e o ResultSet
        }

        return usuarios; // Retorna a lista de usuarios
    }


    @Override
    public void salvar(Usuario obj) {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO usuario (login, senha) VALUES (?, ?)");// Prepara a consulta SQL
            stmt.setString(1, obj.getLogin());
            stmt.setString(2, obj.getSenha());
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fecha a conexão, o PreparedStatement
        }
    }

    @Override
    public void atualizar(Usuario obj) {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE usuario SET login = ?, senha = ? WHERE id_usuario= ?");// Prepara a consulta SQL
            stmt.setString(1, obj.getLogin());
            stmt.setString(2, obj.getSenha());
            stmt.setInt(3, obj.getId());
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fecha a conexão, o PreparedStatement
        }
    }

    @Override
    public void excluir(int id) {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM usuario WHERE id_usuario= ?");// Prepara a consulta SQL
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fecha a conexão, o PreparedStatement
        }
    }

    @Override
    public Usuario obterPorId(int id) {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Usuario usuario = null; // Inicializa o usuário nulo

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE id_usuario= ?");// Prepara a consulta SQL
            stmt.setInt(1, id);
            rs = stmt.executeQuery(); // Executa a consulta

            if (rs.next()) { // Pega a primeira linha
                int id_usuario= rs.getInt("id_usuario"); // Coleta informação da Coluna id_usuario
                String user_login = rs.getString("login"); // Coleta informação da Coluna login
                String user_senha = rs.getString("senha"); // Coleta informação da Coluna senha
                usuario = new Usuario(id_usuario, user_login, user_senha); // Inicializa o usuario
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // Fecha a conexão, o PreparedStatement e o ResultSet
        }

        return usuario; // Retorna um usuário
    }

}

