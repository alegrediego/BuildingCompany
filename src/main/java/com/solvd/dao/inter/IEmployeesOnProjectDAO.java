package com.solvd.dao.inter;

import com.solvd.binary.EmployeesOnProjects;

import java.util.List;

public interface IEmployeesOnProjectDAO extends IEntityDAO<EmployeesOnProjects> {
    List<EmployeesOnProjects> getEmployeesOnProject();

    EmployeesOnProjects getEmployeesOnProject(int id);
}
