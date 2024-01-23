package com.flipkart.client;

import com.flipkart.service.CustomerService;

public class CustomerClient {
    public static void main(String[] args){
        CustomerService service = new CustomerService();

        //call all the methods
        service.createCustomer();
        System.out.println("delete Customer by id-->" + service.deleteCustomer(104));
        System.out.println("update Customer by id-->" + service.updateCustomer(104));
        service.listCustomer();
    }
}
