package com.solvd.dao.inter;
import com.solvd.binary.PartMaterialProjects;
import java.util.List;

public interface IPartMaterialProjectsDAO extends IEntityDAO<IPartMaterialProjectsDAO>{

    List<PartMaterialProjects> getMaterialProjects();
    PartMaterialProjects getMaterialProjects(int id);


}
