package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zyuvs on 2017/2/2.
 */
public class GirlService {
    @Autowired
    private  GirlRepository  gr;

    /**
     * 事务
     */
    @Transactional
    public void AddTran(){
        Girl g = new Girl();
        g.setAge(1);
        g.setCupSize("b");
        gr.save(g);
        Girl g2 = new Girl();
        g2.setAge(2);
        g2.setCupSize("c");
        gr.save(g2);
    }
}
