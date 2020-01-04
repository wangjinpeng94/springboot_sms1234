package cn.sm1234.movie.pojo;

import java.io.Serializable;



public class User implements Serializable {

    private Integer id;//编号
    private String username;//用户名
    private String password;//密码
    private String sex;//性别
    private Double money;//余额

    public User(Integer id, String username, String password, String sex, Double money) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.money = money;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", money=" + money +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public Double getMoney() {
        return money;
    }
}
