package day15.demo.ObjectDemo;

import java.util.StringJoiner;


public class User implements Cloneable{
    private int id;
    private String username;
    private String password;
    private String path;
    private int[] data;

    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "角色编号：" + id + ", 用户名为：" + username + "， 密码为：" + password + ", 游戏图片为：" + path + ", 进度：" + arrToString();
    }

    public String arrToString() {
        StringJoiner sj = new StringJoiner(",", "[", "]");

        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + "");
        }

        return sj.toString();

    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        // int[] data = this.data;

        // int[] newData = new int[data.length];

        // for (int i = 0; i < data.length; i++) {
        //     newData[i] = data[i];
        // }

        User u = (User)super.clone();

        //u.data = newData;

        return u;
    }
    
}
