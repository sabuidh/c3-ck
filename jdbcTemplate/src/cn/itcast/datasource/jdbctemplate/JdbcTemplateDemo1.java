package cn.itcast.datasource.jdbctemplate;

import cn.itcast.datasource.utils.JDBCUtils;
import com.alibaba.druid.util.JdbcUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        //导入jar包
        //创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        //调用方法
        String sql = "update student set SNO = 's005' where Name = ?";
        int count = template.update(sql,1);
        System.out.println(count);
    }
}
