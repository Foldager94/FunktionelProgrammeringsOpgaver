/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.EmployeesDTO;
import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

/**
 *
 * @author ckfol
 */
public class BackendFacade {
    
    
    private static EntityManagerFactory emf;
    private static BackendFacade instance;

    private BackendFacade() {
    }

    /**
     *
     * @param _emf
     * @return the instance of this facade.
     */
    public static BackendFacade getBackendFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new BackendFacade();
        }
        return instance;
    }
    
    public EmployeesDTO getEmployees(){
        EntityManager em = emf.createEntityManager();
        try {
            return new EmployeesDTO((List<Employee>) em.createQuery("SELECT e FROM Employee e", Employee.class));
        } finally {
            em.close();
        }
        
    }
}
