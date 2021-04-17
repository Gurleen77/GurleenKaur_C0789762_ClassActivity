package com.GurleenKaur_C0789762.Employee.employee;

import com.GurleenKaur_C0789762.Employee.Gender;
import com.GurleenKaur_C0789762.Employee.vehicle.Vehicle;

public class Faculty extends Employee {
    String department;

    public Faculty(int id, String first_name, String last_name, Gender gender, Vehicle vehicle, double totalSalary, String department) {
        super(id, first_name, last_name, gender, vehicle, totalSalary);
        department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        department = department;
    }
}
//run kr k batayo