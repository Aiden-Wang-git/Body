package Entity;

/**
 * @program: Body
 * @description: 人的实体类
 * @author: Wang Jun
 * @create: 2020-04-04 20:52
 */
public class body {
    private int ID;
    private String username;
    private  String sex;
    private int age;
    private String birth;
    private String inputtime;
    private double height;
    private double weight;

    public body(int ID, String username, String sex, int age, String birth, String inputtime, double height, double weight) {
        this.ID = ID;
        this.username = username;
        this.sex = sex;
        this.age = age;
        this.birth = birth;
        this.inputtime = inputtime;
        this.height = height;
        this.weight = weight;
    }

    public body(){
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getInputtime() {
        return inputtime;
    }

    public void setInputtime(String inputtime) {
        this.inputtime = inputtime;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
