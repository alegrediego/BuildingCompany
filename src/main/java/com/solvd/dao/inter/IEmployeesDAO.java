package com.solvd.dao.inter;

import com.solvd.binary.Employees;

import java.util.List;

public interface IEmployeesDAO extends IEntityDAO<Employees>{

    List<Employees> getEmployees();

    Employees getEmployees(int id);

}
