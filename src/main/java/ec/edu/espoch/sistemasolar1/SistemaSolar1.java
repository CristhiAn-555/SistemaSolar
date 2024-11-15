/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.sistemasolar1;

import ec.edu.espoch.sistemasolar1.clases.Planeta;
import ec.edu.espoch.sistemasolar1.enumeraciones.TipoPlaneta;

/**
 *
 * @author PERSONAL
 */
public class SistemaSolar1 {

    public static void main(String[] args) {
        
        Planeta objPlaneta=new Planeta("Tierra",5,15,10,20,TipoPlaneta.ENANO);
        
        //objPlaneta.nombrePlaneta="MARTES";
        //objPlaneta.masadelPlanetaenKilogramos=0;
        //objPlaneta.volumendelPlanetaenKilogramoscubicos=0;
        //objPlaneta.diametrodelPlanetaenKilometros=0;
        //objPlaneta.distanciadelsolenMillonesdekilometros=0;
        //objPlaneta.tipoPlaneta=TipoPlaneta.TERRESTRE;
        
        objPlaneta.imprimir();
        double densidad=objPlaneta.calculodensidaddelplaneta();
        System.out.println("La densidad es :" +densidad);
        
        
        
        
        
        
    }
}
