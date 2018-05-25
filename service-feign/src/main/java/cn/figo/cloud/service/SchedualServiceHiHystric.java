package cn.figo.cloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author: HuangC
 * @Description:
 * @Date: 2018/5/23 18:21
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry"+name;
    }
}
