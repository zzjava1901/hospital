package com.xiao.hospital.controller;


import com.xiao.hospital.dao.SysTitleMapper;
import com.xiao.hospital.entity.SysTitle;
import com.xiao.hospital.service.SysTitleService;
import com.xiao.hospital.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Feri
 * @since 2019-06-05
 */
@Api
@RequestMapping("/sysTitle")
@RestController
public class SysTitleController {
    @Autowired
    private SysTitleService titleService;

    @CrossOrigin
    @ApiOperation(value = "查看信息",notes = "这是一个查看信息")
    @RequestMapping(value = "find.do", method = RequestMethod.GET)
    public R findById(int id){

        return R.setOK("OK",titleService.selectById(id));

    }



}

