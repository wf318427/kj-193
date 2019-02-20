package cn.tedu.test;

import cn.tedu.dao.EmpDao;
import cn.tedu.entity.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 19.2.20.
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TestCase1 {
    @Autowired
    EmpDao dao;
    @Test
    public void test() throws Exception {
        System.out.println(dao.findAll());
        System.out.println(dao.s(1));
        Emp emp=new Emp(4l,"cc",55l);
        Emp emp1=new Emp(3l,"dd",77l);
        List<Emp>list=new ArrayList<Emp>();
        list.add(emp);
        list.add(emp1);
        System.out.println(dao.save(list));


    }
}
