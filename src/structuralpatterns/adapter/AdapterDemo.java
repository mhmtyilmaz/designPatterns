package structuralpatterns.adapter;

import java.util.List;

/**
 * Created by MEHMET on 11.7.2017.
 */
public class AdapterDemo {

    public static void main(String[] args){
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();
        System.out.println(employees);
    }

}
