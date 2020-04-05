package View;

import Controller.BodyController;
import Dao.BodyDao;
import Entity.body;

import java.util.List;
import java.util.Scanner;

/**
 * @program: Body
 * @description: 视图层
 * @author: Wang Jun
 * @create: 2020-04-04 20:56
 */
public class MainView {
    private BodyController bodyController = new BodyController();
    Scanner scanner = new Scanner(System.in);
    private int flag = 0;
    public void run(){
        while (true){
            System.out.println("*****************欢迎使用身高体重监测系统*****************");
            System.out.println("请选择一下共功能：1、新增数据         2、查询数据      3、修改数据      4、删除数据      5、退出系统");
            flag = scanner.nextInt();
            switch (flag){
                case 1:
                    addData();
                    break;
                case 2:
                    serchData();
                    break;
                case 3:
                    updateData();
                case 4:
                    deleteData();
                    break;
                case 5:
                    System.out.println("谢谢使用！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误！");
            }

        }
    }

    private void deleteData() {
        System.out.print("请先输入需要删除用户的姓名：");
        String name = scanner.nextLine();
        //展示该用户的所有数据
        display(name);
        System.out.print("请再输入需要删除用户数据的ID：");
        int ID = scanner.nextInt();
        bodyController.deleteData(ID);
        System.out.println();
    }

    private void updateData() {
        System.out.print("请先输入需要修改用户的姓名：");
        String name = scanner.nextLine();
        //展示该用户的所有数据
        display(name);
        System.out.print("请再输入需要修改用户数据的ID：");
        flag = scanner.nextInt();
        System.out.print("请输入身高：");
        double height = scanner.nextDouble();
        System.out.println("请输入体重：");
        double weight = scanner.nextDouble();
        bodyController.updateData(flag,height,weight);
        System.out.println();
    }

    private void serchData() {
        System.out.print("请输入查询用户的姓名：");
        String username = scanner.next();
        display(username);
    }

    private void addData() {
        System.out.print("请输入姓名：");
        String username = scanner.next();
        System.out.print("请输入性别：");
        String sex = scanner.next();
        System.out.print("请输入生日，例如****-**-**；");
        String birth = scanner.next();
        System.out.println("请输入身高：");
        double height = scanner.nextDouble();
        System.out.println("请输入体重：");
        double weigth = scanner.nextDouble();
        bodyController.addData(username,sex,birth,height,weigth);
    }

    private void display(String username) {
        List<body> list = bodyController.serchData(username);
        if (list.size()==0)
            System.out.println("没用找到该用户的数据");
        else {
            System.out.println("ID\t\t"+"   姓名\t\t"+"   性别\t\t"+"    年龄\t\t"+"    生日\t\t"+"  时间\t\t"+"     身高\t\t"+"    体重");
            for (body BODY :list)
                System.out.println(BODY.getID()+" "+BODY.getUsername()+"   "+BODY.getSex()+"    "+BODY.getAge()+"    "+BODY.getBirth()+"  "+BODY.getInputtime()+"  "+BODY.getHeight()+" "+BODY.getWeight());
        }
    }
}
