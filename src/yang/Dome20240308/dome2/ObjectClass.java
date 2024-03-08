package yang.Dome20240308.dome2;

/**
 * @author Zhong.Yl
 * 2024/3/8 14:12
 * JavaSE_Test
 */
public class ObjectClass {
    public static void main(String[] args) {
        String str = "Hello, World!";
        Class<? extends String> cls = str.getClass();
        System.out.println(cls.getName());
    }
}
// 输出 "java.lang.String"

