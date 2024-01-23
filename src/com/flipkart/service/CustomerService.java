package com.flipkart.service;

public class CustomerService {


    // all Methods of Customer

    public void createCustomer() {
        System.out.println("customer is created-->");
    }


    public boolean deleteCustomer(int customerId) {
        System.out.println("Customer is deleted with ID-->" + customerId);
        return true;
    }


    public boolean updateCustomer(int customerId) {
        System.out.println("Customer is updated with ID-->" +customerId);
        return false;
    }

    public void listCustomer() {
        System.out.println("All customer displayed-->");
    }



}