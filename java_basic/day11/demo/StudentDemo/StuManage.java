package day11.demo.StudentDemo;
import java.util.ArrayList;
import java.util.Scanner;


public class StuManage {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        while(true) {
            int opt = menu();

            switch (opt) {
                case 1:
                    AddStu(list);
                    break;
                case 2:
                    updateStu(list);
                    break;
                case 3:
                    queryStu(list);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
        

    }
    
    public static int menu() {
        System.out.println("***************学生管理系统控制台***************");
        System.out.println("1. 添加学生：通过键盘录入学生信息，添加到集合中");
        System.out.println("2. 修改学生：通过键盘录入要修改学生的学号，将该学生对象其他信息进行修改");
        System.out.println("3. 查看学生：将集合中的学生对象信息进行展示");
        System.out.println("4. 退出系统：结束程序");
        System.out.println("*********************************************");
        System.out.println("请输入操作序号：");
        Scanner sc = new Scanner(System.in);
        int opt = -1;
        while(true) {
            opt = sc.nextInt();
            if(opt >= 1 && opt <= 4) {
                break;
            }else {
                System.out.println("操作序号输入错误！请重新输入。");
            }
        }
        return opt;
    }

    public static void AddStu (ArrayList<Student> list) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入学生学号：");
            String id = sc.next();
            boolean flag = isExist(list, id);
            if(flag) {
                System.out.println("学号已存在，请重新输入");
            }else {
                stu.setSid(id);
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        stu.setName(name);

        while(true) {
            System.out.println("请输入学生年龄：");
            int age = sc.nextInt();
            if(age <= 0 || age >= 30) {
                System.out.println("非法数据，请重新输入");
            }else {
                stu.setAge(age);
                break;
            }
        }
        boolean result = list.add(stu);

        if(result) {
            System.out.println("学生信息添加成功");
        } else {
            System.out.println("学生信息添加失败");
        }
        
    }

    public static void delStu(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学号");
        String id = sc.next();
        int index = getIndex(list, id);

        if(index >= 0) {
            list.remove(index);
            System.out.println("学号为：" + id + "学生删除成功");
        }else {
            System.out.println("学号不存在， 删除失败");
        } 
    }

    public static void updateStu(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改信息的学号");
        String id = sc.next();
        int index = getIndex(list, id);

        if(index == -1) {
            System.out.println("学号不存在，请重新操作");
            return;
        }

        Student stu = list.get(index);

        System.out.println("请输入学生姓名：");
        String name = sc.next();
        stu.setName(name);

        while(true) {
            System.out.println("请输入学生年龄：");
            int age = sc.nextInt();
            if(age <= 0 || age >= 30) {
                System.out.println("非法数据，请重新输入");
            }else {
                stu.setAge(age);
                break;
            }
        }

        System.out.println("信息修改成功");
        
    }

    public static void queryStu(ArrayList<Student> list) {
        if(list.size() == 0) {
            System.out.println("系统无学生信息，请添加后查询");
            return;
        }

        System.out.println("学号\t姓名\t年龄");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getSid() + "\t" + stu.getName() + "\t" + stu.getAge());
        }
    }

    public static boolean isExist(ArrayList<Student> list, String sid) {   
        for(int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if(sid.equals(stu.getSid())) {
                return true;
            }
        }
        return false;
    }

    public static int getIndex(ArrayList<Student> list, String sid) {
        for(int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if(sid.equals(stu.getSid())) {
                return i;
            }
        }
        return -1;
    }
    
}
