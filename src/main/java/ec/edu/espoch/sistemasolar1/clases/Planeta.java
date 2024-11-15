
package ec.edu.espoch.sistemasolar1.clases;

import ec.edu.espoch.sistemasolar1.enumeraciones.TipoPlaneta;

public class Planeta {
    // atributos
    public String nombrePlaneta;
    public double masadelPlanetaenKilogramos;
    public double volumendelPlanetaenKilogramoscubicos;
    public double diametrodelPlanetaenKilometros;
    public double distanciadelsolenMillonesdekilometros;
    public TipoPlaneta tipoPlaneta;
    public boolean exterior=false;
   

    public Planeta(String nombrePlaneta, double masadelPlanetaenKilogramos, double volumendelPlanetaenKilogramoscubicos, double diametrodelPlanetaenKilometros, double distanciadelsolenMillonesdekilometros, TipoPlaneta tipoPlaneta, String nombre) {
        this.nombrePlaneta = nombrePlaneta;
        this.masadelPlanetaenKilogramos = masadelPlanetaenKilogramos;
        this.volumendelPlanetaenKilogramoscubicos = volumendelPlanetaenKilogramoscubicos;
        this.diametrodelPlanetaenKilometros = diametrodelPlanetaenKilometros;
        this.distanciadelsolenMillonesdekilometros = distanciadelsolenMillonesdekilometros;
        this.tipoPlaneta = tipoPlaneta;
        this.exterior();
       
    }
    
    
   
    
    
    
    public void imprimir(){
        System.out.println("Nombre Planeta:" + nombrePlaneta);
        System.out.println("Masa del Planeta en Kilogramos:" + masadelPlanetaenKilogramos);
        System.out.println("Volumen del Planeta en Kilogramoscubicos:" + volumendelPlanetaenKilogramoscubicos);
        System.out.println("Diametro del Planeta en Kilometros:" + diametrodelPlanetaenKilometros);
        System.out.println("Distancia del sol en Millones de kilometros:" + distanciadelsolenMillonesdekilometros);
        System.out.println("Tipo Planeta:" + tipoPlaneta);
       
    }
    public double calculodensidaddelplaneta(){
        return masadelPlanetaenKilogramos/volumendelPlanetaenKilogramoscubicos;
    }
    public boolean exterior(){
        
        double maximo=3.4;
        double distancia=149597870;
        
        double limite=maximo*distancia;
        
        
        if(distanciadelsolenMillonesdekilometros > limite){
            exterior = true;
        }
        
        return exterior;
    }
}
