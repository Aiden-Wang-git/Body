package Service;

import Dao.BodyDao;
import Entity.body;

import java.util.List;

/**
 * @program: Body
 * @description: 业务层
 * @author: Wang Jun
 * @create: 2020-04-04 20:58
 */
public class BodyService {
    private BodyDao bodyDao = new BodyDao();

    public void deleteData(int ID){
        bodyDao.deleteData(ID);
    }

    public void updateData(int ID, double heigth, double weight){
        bodyDao.updateData(ID,heigth,weight);
    }

    public List<body> serchData(String username){
        return bodyDao.serchData(username);
    }

    public void addData(String username,String sex,String birth,double height,double weight){
        bodyDao.addData(username,sex,birth,height,weight);
    }
}
