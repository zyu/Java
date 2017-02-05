package com.imooc;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by zyuvs on 2017/2/2.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {
    //可以自动按照年龄查询
    public List<Girl> findByAge(Integer age);
}
