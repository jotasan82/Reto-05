package Modelo;

import Clases.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class PrimeraConsulta {
    public void primeraconsulta(DefaultTableModel modelo) throws ClassNotFoundException{
        Lider lider = new Lider();
        try{
            //Establecer la conexión a la Base de Datos
            Conexion conexion = new Conexion();
            Connection cn = conexion.conectar();
            //Cadena de consulta
            String consulta="SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider l ORDER BY Ciudad_Residencia;";
            Statement query = cn.createStatement();
            ResultSet result = query.executeQuery(consulta);
            while(result.next()){
                lider.setId_lider(result.getInt(1));
                lider.setNombre(result.getString(2));
                lider.setPrimerApellido(result.getString(3));
                lider.setCiudadResidencia(result.getString(4));
                //Adicionar la información recibida de la BD (Tabla Lider a la Tabla o grilla
                modelo.addRow(new Object[]{lider.getId_lider(), lider.getNombre(), lider.getPrimerApellido(), lider.getCiudadResidencia()});
            }
            //Cerrar instancias (Statement / ResultSet)
            result.close();
            query.close();
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
