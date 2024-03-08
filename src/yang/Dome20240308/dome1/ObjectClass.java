package yang.Dome20240308.dome1;

/**
 * @author Zhong.Yl
 * 2024/3/8 11:11
 * JavaSE_Test
 */

public class ObjectClass {
    public static void main(String[] args) {
        String a = new Object().toString();
        System.out.println(a);
    }
//hashCode获取对象的hashcode值
    public String toString(){
      String  a = getClass().getName() + "@" + Integer.toHexString(hashCode());
        return a;
    }
}
