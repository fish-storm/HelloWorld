package com.demoone.Controller;

import com.demoone.DAO.VersionMapper;
import com.demoone.DTO.Demo;
import com.demoone.DTO.Version;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
public class DemoController {
    private static Logger log = LoggerFactory.getLogger(DemoController.class);
    @Autowired(required = false)
    private VersionMapper versionMapper;

    @RequestMapping("getLastest")
    public Version getLastest(){
        log.info("获取版本");
        return versionMapper.selectLastest();
    }
    @ModelAttribute
    public String easyTest2(){
        log.info("必然经过的");
        return "222ss";
    }


    @RequestMapping(value="/ceshi/{bianliang}", method=RequestMethod.GET)
    public Integer easyTest0(@PathVariable Integer bianliang){
        log.info("简单测试"+bianliang);
        return bianliang;
    }



    @RequestMapping("demoTest")
    public Demo demoTest(){
        return new Demo("mumu",1L);
    }

    @RequestMapping(value="TestValidator", method = RequestMethod.GET)
    public String testV(@ModelAttribute @Valid Demo demo,
                        BindingResult result){
        if(result.hasErrors()){
            for(ObjectError error:result.getAllErrors()){
                log.error(error.getDefaultMessage());
            }
        }

        return  "error";
    }
}
