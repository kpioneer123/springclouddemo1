package com.kpioneer.sericefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author xionghu
 * @create 2019-07-23
 * @Desc
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
