package mapeo;
// Generated 28-nov-2016 21:21:01 by Hibernate Tools 4.3.1

import accesoHibernate.HibernateUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;
import org.hibernate.Session;




/**
 * Trenes generated by hbm2java
 */
public class Trenes  implements java.io.Serializable {


     private Integer codTren;
     private Cocheras cocheras;
     private Lineas lineas;
     private String compañia;
     private String tipo;
     private String modelo;
     private String estado;

    public Trenes() {
    }

    public Trenes(Cocheras cocheras, Lineas lineas, String compañia, String tipo, String modelo, String estado) {
       this.cocheras = cocheras;
       this.lineas = lineas;
       this.compañia = compañia;
       this.tipo = tipo;
       this.modelo = modelo;
       this.estado = estado;
    }
   
    public Integer getCodTren() {
        return this.codTren;
    }
    
    public void setCodTren(Integer codTren) {
        this.codTren = codTren;
    }
    public Cocheras getCocheras() {
        return this.cocheras;
    }
    
    public void setCocheras(Cocheras cocheras) {
        this.cocheras = cocheras;
    }
    public Lineas getLineas() {
        return this.lineas;
    }
    
    public void setLineas(Lineas lineas) {
        this.lineas = lineas;
    }
    public String getCompañia() {
        return this.compañia;
    }
    
    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }


    public void añadirTren(Lineas lineas, Cocheras cocheras, String compañia, String tipo, String modelo, String estado){
       Transaction tx=null;
       Session session= HibernateUtil.getSessionFactory().openSession();
       tx= (Transaction) session.beginTransaction();
       Trenes t = new Trenes();
        t.setLineas(lineas);
        t.setCocheras(cocheras);
        t.setCompañia(compañia);
        t.setTipo(tipo);
        t.setModelo(modelo);
        t.setEstado(estado);
        
        session.save(t); //Guarda el objeto creado en sa BBDD.
         try {
             tx.commit(); //Materializa la transacción
         } catch (RollbackException ex) {
             Logger.getLogger(Trenes.class.getName()).log(Level.SEVERE, null, ex);
         } catch (HeuristicMixedException ex) {
             Logger.getLogger(Trenes.class.getName()).log(Level.SEVERE, null, ex);
         } catch (HeuristicRollbackException ex) {
             Logger.getLogger(Trenes.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SecurityException ex) {
             Logger.getLogger(Trenes.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SystemException ex) {
             Logger.getLogger(Trenes.class.getName()).log(Level.SEVERE, null, ex);
         }
        session.close();
}

}


