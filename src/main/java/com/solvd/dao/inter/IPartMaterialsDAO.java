package com.solvd.dao.inter;

import com.solvd.binary.PartMaterials;
import java.util.List;
public interface IPartMaterialsDAO extends IEntityDAO<IPartMaterialsDAO>{

    List <PartMaterials> getPartMaterials();
    PartMaterials getPartMaterials(int id);

}
