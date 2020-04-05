package Dao;

import Entity.body;
import Utils.GetAge;
import Utils.JDBCUtils;
import com.sun.xml.internal.ws.wsdl.writer.document.soap.Body;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @program: Body
 * @description: Dao层
 * @author: Wang Jun
 * @create: 2020-04-04 21:00
 */
public class BodyDao {

    private QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());

    public void deleteData(int ID){
        String sql = "DELETE FROM people WHERE ID = ?;";
        try {
            int num = queryRunner.update(sql,ID);
            if (num>0)
                System.out.println("删除数据成功！");
        }catch (Exception ex){
            System.out.println(ex);
            throw new RuntimeException("删除数据失败！");
        }
    }

    public void updateData(int ID, double heigth, double weight){
        String sql = "UPDATE people SET height = ? , weight = ? WHERE ID = ?;";
        try {
            int num = queryRunner.update(sql,heigth,weight,ID);
            if (num>0)
                System.out.println("数据更新成功！");
        }catch (Exception ex){
            System.out.println(ex);
            throw new RuntimeException("更新数据失败！");
        }
    }

    public List<body> serchData(String username){
        String sql = "SELECT * FROM people WHERE username = ?  ORDER BY inputtime;";
        try {
            return queryRunner.query(sql,new BeanListHandler<>(body.class),username);
        }catch (Exception ex){
            System.out.println(ex);
            throw new RuntimeException("条件查询失败！");
        }
    }

    public void addData(String username,String sex,String birth,double height,double weight){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        int age = GetAge.getAge(birth);
        String inputtime = sdf.format(new Date());
        String sql = "INSERT INTO people(username,sex,age,birth,inputtime,height,weight) VALUES (?,?,?,?,?,?,?);";
        try {
            int num = queryRunner.update(sql,username,sex,age,birth,inputtime,height,weight);
            if (num>0)
                System.out.println("添加数据成功！");
        }catch (Exception ex){
            ex.printStackTrace();
            throw new RuntimeException("添加数据失败！");
        }

    }
}
