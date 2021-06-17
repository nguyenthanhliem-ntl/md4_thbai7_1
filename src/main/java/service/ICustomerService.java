package service;

import model.Customer;

public interface ICustomerService extends IGeneralService<Customer>{
    void save(Customer customer);
}
