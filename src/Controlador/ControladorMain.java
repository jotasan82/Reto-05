package Controlador;

import javax.swing.table.DefaultTableModel;
import Modelo.*;


public class ControladorMain {

    public void informeLider(DefaultTableModel modelo) {
        try{
            PrimeraConsulta primeraConsulta = new PrimeraConsulta();
            primeraConsulta.primeraconsulta(modelo);
        }catch(Exception e){}
    }

    public void informeProyectos(DefaultTableModel modelo){
        try{
            SegundaConsulta segundaConsulta = new SegundaConsulta();
            segundaConsulta.segundaconsulta(modelo);
        }catch(Exception e){}
    }

    public void informeCompras(DefaultTableModel modelo){
        try{
            TerceraConsulta terceraConsulta = new TerceraConsulta();
            terceraConsulta.terceraconsulta(modelo);
        }catch(Exception e){}
    }
}