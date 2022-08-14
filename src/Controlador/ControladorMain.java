package Controlador;

import javax.swing.table.DefaultTableModel;
import Modelo.*;


public class ControladorMain {

    public void informeLider(DefaultTableModel modelo1) {
        try{
            PrimeraConsulta primeraConsulta = new PrimeraConsulta();
            primeraConsulta.primeraconsulta(modelo1);
        }catch(Exception e){}
    }

    public void informeProyectos(DefaultTableModel modelo2){
        try{
            SegundaConsulta segundaConsulta = new SegundaConsulta();
            segundaConsulta.segundaconsulta(modelo2);
        }catch(Exception e){}
    }

    public void informeCompras(DefaultTableModel modelo3){
        try{
            TerceraConsulta terceraConsulta = new TerceraConsulta();
            terceraConsulta.terceraconsulta(modelo3);
        }catch(Exception e){}
    }
}