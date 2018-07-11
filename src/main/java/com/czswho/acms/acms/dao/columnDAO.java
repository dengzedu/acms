package com.czswho.acms.acms.dao;

import com.czswho.acms.acms.model.column;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper

public interface columnDAO {
    String TABLE_NAME = "t_column";
    String INSERT_FIELDS = "columnName,columnLevel";
    String SELECT_FIELDS = "id, "+ INSERT_FIELDS;

    @Insert({"insert into ",TABLE_NAME,"(",INSERT_FIELDS,")value(#{columnName},#{columnLevel})"})
    int addColumn(column column);

}
