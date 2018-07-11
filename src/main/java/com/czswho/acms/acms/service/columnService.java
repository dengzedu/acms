package com.czswho.acms.acms.service;

import com.czswho.acms.acms.dao.columnDAO;
import com.czswho.acms.acms.model.column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class columnService {
    @Autowired
    private columnDAO columnDAO;

    public int addColumn(column column){
        return columnDAO.addColumn(column);
    }

}
