package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zyuvs on 2017/2/2.
 */
@RestController

@RequestMapping(value = {"/hello","/hi"})
public class HelloController {
    @Autowired
    private GirlProperties gp;

    @RequestMapping(value = {"/say/{id}"},method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer myid){
        return "id:"+myid;
        //return  gp.getCupSize();
    }
    @GetMapping(value = "/foo")
    public String foo(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myid){

        return  gp.getCupSize();
    }
}
