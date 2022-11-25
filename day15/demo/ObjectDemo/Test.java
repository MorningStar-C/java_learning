package day15.demo.ObjectDemo;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data = {1, 2, 3, 4, 5, 6, 7};
        User u1 = new User(1, "morningstar", "1234qwer", "girl11", data);

        
        User u2  = (User)u1.clone();
        
        int[] arr = u1.getData();
        arr[0] = 100;

        System.out.println(u1);
        System.out.println(u2);
    }
}
