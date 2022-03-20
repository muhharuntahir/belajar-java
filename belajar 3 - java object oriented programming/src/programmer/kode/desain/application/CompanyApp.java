package programmer.kode.desain.application;

import programmer.kode.desain.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Kode Desain");

        Company.Employee employee = company.new Employee();
        employee.setName("Muhammad Harun");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
