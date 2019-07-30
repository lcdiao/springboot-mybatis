package cn.lcdiao.springbootmybatis;

import cn.lcdiao.springbootmybatis.dao.TbTaskMapper;
import cn.lcdiao.springbootmybatis.entity.TbTask;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback
public class SpringbootMybatisApplicationTests {

    @Autowired
    private TbTaskMapper tbTaskMapper;

    @Test
    public void testSelect() {
        List<TbTask> tbTasks = tbTaskMapper.selectAll();
        for (TbTask tbTask : tbTasks) {
            System.out.println(tbTask);
        }
    }

    @Test
    public void testPageSelect() {
        PageHelper.startPage(2,3);
        //Example example = new Example(TbTask.class);
        List<TbTask> tbTasks = tbTaskMapper.selectAll();
        PageInfo<TbTask> pageInfo = new PageInfo<>(tbTasks);
        for (TbTask tbTask : tbTasks) {
            System.out.println(tbTask.getContent());
        }
        System.out.println(pageInfo);
    }
}
