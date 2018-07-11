package com.czswho.acms.acms.controller;

import com.czswho.acms.acms.model.column;
import com.czswho.acms.acms.service.columnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class columnController {

    @Autowired
    columnService columnService;

    @RequestMapping(value = "/addColumn",method = {RequestMethod.GET})
    public String addColumn(Model model,
                            @RequestParam("columnName") String columnName,
                            @RequestParam("columnLevel") int columnLevel)
    {
        column column = new column();
        column.setColumnName(columnName);
        column.setColumnLevel(columnLevel);
        columnService.addColumn(column);

        return "Admanagement";
    }
}
