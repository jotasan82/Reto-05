package Modelo;

import Clases.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pixel
 */
public class TerceraConsulta {
    public void terceraconsulta(DefaultTableModel modelo) throws ClassNotFoundException{
        Compras compra = new Compras();
        try{
            //Establecer la conexión a la Base de Datos
            Conexion conexion = new Conexion();
            Connection cn = conexion.conectar();
            //Cadena de consulta
            String consulta="SELECT c.ID_Compra, p.Constructora, p.Banco_Vinculado FROM Compra c JOIN Proyecto p ON (c.ID_Proyecto = p.ID_Proyecto) WHERE c.Proveedor = 'Homecenter' AND p.Ciudad = 'Salento';";
            Statement query = cn.createStatement();
            ResultSet result = query.executeQuery(consulta);
            while(result.next()){
                compra.setIdCompras(result.getInt(1));
                compra.setConstructora(result.getString(2));
                compra.setBancoVinculado(result.getString(3));
                //Adicionar la información recibida de la BD (Tabla Lider a la Tabla o grilla
                modelo.addRow(new Object[]{compra.getIdCompras(), compra.getConstructora(), compra.getBancoVinculado()});            }
            //Cerrar instancias (Statement / ResultSet)
            result.close();
            query.close();
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
