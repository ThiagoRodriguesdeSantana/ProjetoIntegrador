package model.DAO;

import java.sql.Connection;
import model.Conexao;

public class AlunoDAO {
    private Connection conectar = null;
    
    public AlunoDAO(){
        conectar = Conexao.getConexao();
    }
}
