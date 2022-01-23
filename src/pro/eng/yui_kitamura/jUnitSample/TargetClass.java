package pro.eng.yui_kitamura.jUnitSample;

public class TargetClass {

    public int publicVal = 2_727;
    protected int protectedVal = 272;
    int defaultVal = 27;
    private int privateVal = 2;

    /** 可視度が public のメソッド */
    public int publicMethod(int val){
        System.out.println("this is public method");
        return publicVal + val;
    }

    /** 可視度が protected のメソッド */
    protected int protectedMethod(int val){
        System.out.println("this is protected method");
        return protectedVal + val;
    }

    /** 可視度が package-private のメソッド */
    int defaultMethod(int val){
        System.out.println("this is default visibility method");
        return defaultVal + val;
    }

    /** 可視度が private のメソッド */
    private int privateMethod(int val){
        System.out.println("this is private method");
        return privateVal + val;
    }
}
