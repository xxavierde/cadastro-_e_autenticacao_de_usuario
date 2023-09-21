/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.UsuarioDTO;
import com.mysql.cj.jdbc.ConnectionImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastrarUsuarioDAO {

        Connection conn;
        PreparedStatement pstm;

        public void cadastrarUsuario(UsuarioDTO objusuariodto) {
            String sql = "insert into usuario (nome_usuario, email_usuario, "
                    + "login_usuario, senha_usuario) values(?, ?, ?, ?)";

            conn = new ConexaoBD().conectaBD();

            try {
                pstm = conn.prepareStatement(sql);   
                pstm.setString(1, objusuariodto.getNome_usuario());
                pstm.setString(2, objusuariodto.getEmail_usuario());
                pstm.setString(3, objusuariodto.getLogin_usuario());
                pstm.setString(4, objusuariodto.getSenha_usuario());
                
                pstm.execute();
                pstm.close();
                
            } catch (SQLException erro) {
                
                JOptionPane.showMessageDialog(null, "CadastrarUsuarioDAO" + erro);
            }

        }
    }

