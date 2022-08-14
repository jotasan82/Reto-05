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
public class SegundaConsulta {
     public void segundaconsulta(DefaultTableModel modelo) throws ClassNotFoundException{
        Proyecto proyecto = new Proyecto();
        try{
            //Establecer la conexión a la Base de Datos
            Conexion conexion = new Conexion();
            Connection cn = conexion.conectar();
            //Cadena de consulta
            String consulta="SELECT ID_proyecto, Constructora, Numero_Habitaciones, Ciudad  FROM Proyecto p WHERE Clasificacion = 'Casa Campestre' AND Ciudad IN ('Santa Marta','Cartagena','Barranquilla');";
            Statement query = cn.createStatement();
            ResultSet result = query.executeQuery(consulta);
            while(result.next()){
                proyecto.setIdProyecto(result.getInt(1));
                proyecto.setConstructora(result.getString(2));
                proyecto.setNumeroHabitaciones(result.getInt(3));
                proyecto.setCiudad(result.getString(4));
                //Adicionar la información recibida de la BD (Tabla Lider a la Tabla o grilla
                modelo.addRow(new Object[]{proyecto.getIdProyecto(), proyecto.getConstructora(), proyecto.getNumeroHabitaciones(), proyecto.getCiudad()});            }
            //Cerrar instancias (Statement / ResultSet)
            result.close();
            query.close();
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}