package gr.aueb.cf.ch16.interfaces;

import gr.aueb.cf.ch16.interfaces.model.Customer;

public class CustomerDAOImpl implements ICustomerDAO {

    @Override
    public void addCustomer(Customer customer) {

    }

    @Override
    public void updateCustomer(Long id, Customer customer) {

    }

    @Override
    public boolean removeCustomer(Long id) {
        return false;
    }

    @Override
    public Customer getCustomerById(Long id) {
        return null;
    }

    @Override
    public Customer getCustomerByPhoneNumber(String phoneNumber) {
        return null;
    }

    @Override
    public Customer[] getCustomersByRegion(String region) {
        return new Customer[0];
    }

    @Override
    public Customer getCustomerByVat(String vat) {
        return null;
    }
}
