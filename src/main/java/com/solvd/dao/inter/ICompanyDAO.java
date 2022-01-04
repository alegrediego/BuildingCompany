package com.solvd.dao.inter;

import com.solvd.binary.Company;

import java.util.List;

public interface ICompanyDAO extends IEntityDAO<Company> {


        List<Company> getCompany();

        Company getCompany(int id);
}
