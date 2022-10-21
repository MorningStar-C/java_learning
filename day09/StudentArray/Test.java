package day09.StudentArray;

public class Test {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student s1 = new Student(001, "小明", 18);
        Student s2 = new Student(002, "小红", 19);

        addStudent(arr, s1);

        printStudent(arr);

        addStudent(arr, s2);

        printStudent(arr);

        Student s3 = new Student(002, "小lan", 19);

        addStudent(arr, s3);

        printStudent(arr);

        //delStudent(arr, 001);

        //printStudent(arr);

    }

    public static boolean isMax(Student[] arr) {
        int count = getStuNum(arr);

        if(count < arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static int getStuNum(Student[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != null) {
                count++;
            }else {
                break;
            }
        }
        return count;
    }

    public static Student[] addStudent(Student[] arr, Student stu) {
        boolean containFlag = isContained(arr, stu.getId());
        if(!containFlag) {     
            if(isMax(arr)) {
                int count = getStuNum(arr);
                arr[count] = stu;
                return arr;
            }else {
                Student[] newArr = new Student[arr.length + 1];
                for(int i = 0; i < arr.length; i++) {
                    newArr[i] = arr[i];
                }
                newArr[arr.length] = stu;

                return newArr;
            }
            
        } else {
            return null;
        } 
    }

    public static Student[] delStudent(Student[] arr, int id) {
        boolean containFlag = isContained(arr, id);
        if(containFlag) {
            for(int i = 0; i < arr.length; i++) {
                Student t = arr[i];
                if(t.getId() == id) {
                    int j = i;
                    for(; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    arr[j] = null;
                    break;
                }
            }
            return arr;
        } else {
            return null;
        }
    }

    public static void printStudent(Student[] arr) {
        for(int i = 0; i < getStuNum(arr); i++) {
            Student t = arr[i];
            System.out.println(t.getId() + " " + t.getName() + " " + t.getAge());
        }
    }

    public static boolean isContained(Student[] arr, int id) {
        int count = getStuNum(arr);
        if(count == 0) {
            return false;
        }
        for(int i =0; i < count; i++) {
            Student t = arr[i];
            if(id == t.getId()) {
                return true;
            }
        }

        return false;
    }
}
