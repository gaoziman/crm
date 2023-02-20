package com.manman.crm.controller;


import com.manman.crm.pojo.Staff;
import com.manman.crm.result.Result;
import com.manman.crm.result.ResultDto;
import com.manman.crm.service.StaffService;
import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 员工表 前端控制器
 * </p>
 *
 * @author gaoziman
 * @since 2023-02-20
 */
@RestController
@Slf4j
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @GetMapping("/test")
    public ResultDto test(){
        return Result.success(staffService.list());
    }

}

