public class IDinformation {
    public static void main(String[] args) {
        String id = "321281202001011234";

        String year = id.substring(6, 10);
        String month = id.substring(10,12);
        String day = id.substring(12, 14);

        char gen = id.charAt(16);
        String gender = "";
        int num = gen - 48;
        if(num % 2 == 0) {
            gender = "女";
        }else{
            gender = "男";
        }

        System.out.println("人物信息为：");
        System.out.println("出生年月日：" + year + "年" + month + "月" + day + "日");
        System.out.println("性别为：" + gender);
    }
}
