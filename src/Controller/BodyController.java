package Controller;

import Entity.body;
import Service.BodyService;

import java.util.List;

/**
 * @program: Body
 * @description: 控制层
 * @author: Wang Jun
 * @create: 2020-04-04 20:58
 */
public class BodyController {
    private BodyService bodyService = new BodyService();

    public void deleteData(int ID){
        bodyService.deleteData(ID);
    }

    public void updateData(int ID,double heigth,double weight){
        bodyService.updateData(ID,heigth,weight);
    }

    public List<body> serchData(String username){
        return bodyService.serchData(username);
    }

    public void addData(String username,String sex,String birth,double height,double weight){
        bodyService.addData(username,sex,birth,height,weight);
    }
}
