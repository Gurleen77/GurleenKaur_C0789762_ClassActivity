package com.GurleenKaur_C0789762.Employee.employee;

import com.GurleenKaur_C0789762.Employee.Gender;
import com.GurleenKaur_C0789762.Employee.Person;
import com.GurleenKaur_C0789762.Employee.vehicle.Vehicle;

public class Employee extends Person {
    double totalSalary;

    public Employee(int id, String first_name, String last_name, Gender gender, Vehicle vehicle, double totalSalary) {
        super(id, first_name, last_name, gender, vehicle);
        this.totalSalary = totalSalary;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }
}
