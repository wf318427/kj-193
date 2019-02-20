package cn.tedu.dao;

import cn.tedu.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 19.2.20.
 */
public interface EmpDao extends JpaRepository<Emp,Long> {
    @Query(value = "select * from emp where id=?1",nativeQuery = true)
     Emp s(int id);

    @Transactional
    List<Emp> save(List<Emp> iterable);
}
