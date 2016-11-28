package modelo;
// Generated 28-nov-2016 13:35:22 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Accesos generated by hbm2java
 */
public class Accesos  implements java.io.Serializable {


     private Integer codAcceso;
     private String lugar;
     private Set estacioneses = new HashSet(0);

    public Accesos() {
    }

	
    public Accesos(String lugar) {
        this.lugar = lugar;
    }
    public Accesos(String lugar, Set estacioneses) {
       this.lugar = lugar;
       this.estacioneses = estacioneses;
    }
   
    public Integer getCodAcceso() {
        return this.codAcceso;
    }
    
    public void setCodAcceso(Integer codAcceso) {
        this.codAcceso = codAcceso;
    }
    public String getLugar() {
        return this.lugar;
    }
    
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public Set getEstacioneses() {
        return this.estacioneses;
    }
    
    public void setEstacioneses(Set estacioneses) {
        this.estacioneses = estacioneses;
    }




}


