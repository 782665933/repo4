package com.itheima.test;

import com.itheima.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 使用Junit单元测试：测试我们的配置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AccountServiceTest {

    @Autowired
    private  IAccountService as;

    @Test
    public  void testTransfer(){
        as.transfer("aaa","bbb",100f);

    }

    @Test
    public  void testTransfer2(){
        as.transfer("aaa","bbb",100f);

    }

    @Test
    public  void testTransfer3(){
        as.transfer("aaa","bbb",100f);

    }

    @Test
    public  void testTransfer4(){
        as.transfer("aaa","bbb",100f);
        System.out.println("haha");

    }
}
