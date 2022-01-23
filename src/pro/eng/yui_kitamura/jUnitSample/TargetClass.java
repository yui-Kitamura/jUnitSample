package pro.eng.yui_kitamura.jUnitSample;

public class TargetClass {

    public int publicVal = 2_727;
    protected int protectedVal = 272;
    int defaultVal = 27;
    private int privateVal = 2;

    public int publicMethod(int val){
        System.out.println("this is public method");
        return publicVal + val;
    }

    protected int protectedMethod(int val){
        System.out.println("this is protected method");
        return protectedVal + val;
    }

    int defaultMethod(int val){
        System.out.println("this is default visibility method");
        return defaultVal + val;
    }

    private int privateMethod(int val){
        System.out.println("this is private method");
        return privateVal + val;
    }
}
