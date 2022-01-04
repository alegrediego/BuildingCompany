package com.solvd.dao.inter;

import com.solvd.binary.Company;
import com.solvd.binary.Departments;

import java.util.List;

public interface IDepartmentsDAO extends IEntityDAO<Departments> {

    List<Departments> getDepartments();

    Departments getDepartments(int id);
}
