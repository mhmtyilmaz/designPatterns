package structuralpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MEHMET on 11.7.2017.
 */
public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDb = new EmployeeDB("123",
                "John",
                "Jamaka",
                "john@jamaka.com");
        employees.add(employeeFromDb);

        EmployeeLdap employeeLdap = new EmployeeLdap("chewie",
                "solo",
                "Han",
                "han@chewie.com");

        employees.add(new EmployeeAdapterLdap(employeeLdap));



        return employees;
    }

}
