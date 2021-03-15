
package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//account表 添加(insert)，修改，删除一条记录
public class Demo2 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        //1.注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取Connection对象
            conn = DriverManager.getConnection("jdbc:mysql:///c3_ck?characterEncoding=utf8","root","203125ck");
            //3.定义sql
            String sql1  = "insert into student values('s001','老二',97,'计算机学院')";
            String sql = "delete from student where score = 21";
            String sql2 = "update student set Age = 20 where SNO = 's001'";
            //4.获取执行sql的对象Statement
            stmt = conn.createStatement();
            //5.执行sql
            //影响的行数
            int count = stmt.executeUpdate(sql);
            //6.处理结果
            System.out.println(count);
            if(count>0) {
                System.out.println("修改成功");
            }
            else
                System.out.println("修改失败");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //避免空指针异常
            if(stmt!=null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}