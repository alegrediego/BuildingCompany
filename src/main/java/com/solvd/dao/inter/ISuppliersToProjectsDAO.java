package com.solvd.dao.inter;


import com.solvd.binary.SuppliersToProjects;
import java.util.List;

public interface ISuppliersToProjectsDAO extends IEntityDAO<SuppliersToProjects> {
    List<SuppliersToProjects> getSuppliersToProjects();
    SuppliersToProjects getSuppliersToProjects(int id);
}
