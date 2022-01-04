package com.solvd.dao.inter;

import com.solvd.binary.Projects;
import java.util.List;

public interface IProjectsDAO extends IEntityDAO<Projects>{

    List<Projects> getProject();
    Projects getProjects(int id);

}
