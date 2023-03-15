/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.tpcustomerjohan.jsf;

import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import mg.itu.tpcustomerjohan.ejb.CustomerManager;
import mg.itu.tpcustomerjohan.entities.Customer;

/**
 *
 * @author ASUS
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {

    /**
     * Creates a new instance of CustomerBean
     */
   private List<Customer> customerList;
  @EJB
  private CustomerManager customerManager; 
    
    public CustomerBean() {
    }
    
    /** 
   * Retourne la liste des clients pour affichage dans une DataTable.
     * @return 
   */  
  public List<Customer> getCustomers() {
    if (customerList == null) {
      customerList = customerManager.getAllCustomers();
    }
    return customerList;
  }  
}
