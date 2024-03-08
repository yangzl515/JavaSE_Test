package yang.Dome20240308.dome5;

/**
 * @author Zhong.Yl
 * 2024/3/8 16:42
 * JavaSE_Test
 */
public class Person {
    private String name;
    private int gender;
    private int age;
    private String getName(){
        return name;
    }
    private String getGender(){
        return gender == 0 ? "man" : "woman";
    }
    public void work(){
        if(18 <= age && age <=50){
            System.out.println(name + "is working very hard");
        }else{
            System.out.println(name + "can`t work any more");
        }
    }

    public void setName(String yang) {
        this.name = name;
    }

    public void setAge(int i) {
        this.age = age;
    }

    public void setGender(String lan) {
        this.gender = gender;
    }
}
