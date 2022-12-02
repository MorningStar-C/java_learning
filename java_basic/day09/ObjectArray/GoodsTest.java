package day09.ObjectArray;
/**
 * GoodsTest Class
 * @version v0.1 2022-09-08
 * @author MorningStar
 */
public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];

        Goods g1 = new Goods();
        g1.setId("001");
        g1.setName("手机");
        g1.setPrice(3999);
        g1.setCount(200);
        Goods g2 = new Goods("002", "保温杯", 399, 300);
        Goods g3 = new Goods("003", "枸杞", 99, 250);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for(int i = 0; i < arr.length; i++) {
            Goods g = arr[i];
            System.out.println(g.getId() + ", " + g.getName() + ", " + g.getPrice() + ", " + g.getCount());
        }
    }
}
