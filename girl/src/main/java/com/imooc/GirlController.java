package com.imooc;

import jdk.internal.org.objectweb.asm.tree.InnerClassNode;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zyuvs on 2017/2/2.
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlR;

    /**
     * 查询所有
     * @return
     */
    @GetMapping(value = "/getGirls")
    public List<Girl> getGirls(){
        return  girlR.findAll();
    }

    @GetMapping(value = "/age/{age}")
    public List<Girl> byage(@PathVariable("age") Integer age){
        return  girlR.findByAge(age);
    }

    @PostMapping(value = "/addgirls")
    public Girl addg(@RequestParam("cupSize") String cupSize,
                      @RequestParam("age") Integer age){
                Girl g = new Girl();
                g.setAge(age);
                g.setCupSize(cupSize);
              return   girlR.save(g);
    }
    @PutMapping(value = "/addgirls")
    public Girl updateg(
            @PathVariable("id") Integer id,
            @RequestParam("cupSize") String cupSize,
            @RequestParam("age") Integer age){
        Girl g = new Girl();
        g.setId(id); //有id 可以更新
        g.setAge(age);
        g.setCupSize(cupSize);
        return   girlR.save(g);
    }
    @DeleteMapping(value = "/deg")
    public  void  deleteg(@PathVariable("id") Integer id){
        girlR.delete(id);
    }
}
