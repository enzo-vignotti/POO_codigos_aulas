/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
import pojos.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author guest-hv9avy
 */
public class Main {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA2UP");
        EntityManager em = emf.createEntityManager();
        
        Cidades city = new Cidades();
        city.setNome("Marialva");
        
        Governador gov = new Governador();
        gov.setNome("Ratinho");
        
        Estados est = new Estados();
        est.addCidade(city);
        est.setGovernador(gov);
        est.setNome("Paraná");
        est.setUnidade_federativa("PR");
        
        em.getTransaction().begin();
        em.persist(est);
        em.getTransaction().commit();
        
    }
}