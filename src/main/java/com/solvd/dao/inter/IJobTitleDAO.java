package com.solvd.dao.inter;

import com.solvd.binary.JobTitle;

import java.util.List;

public interface IJobTitleDAO extends IEntityDAO<JobTitle> {

    List<JobTitle> getJobTitle();

    JobTitle getJobTitle(int id);
}
