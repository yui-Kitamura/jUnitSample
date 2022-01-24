package pro.eng.yui_kitamura.jUnitSample;

public class TargetStaticClass {

    public static int publicVal = 7_272;
    protected static int protectedVal = 727;
    static int defaultVal = 72;
    private static int privateVal = 7;

    /** 可視度が public のメソッド */
    public static int publicStaticMethod(int val){
        System.out.println("this is public static method");
        return publicVal + val;
    }

    /** 可視度が protected のメソッド */
    protected static int protectedStaticMethod(int val){
        System.out.println("this is protected static method");
        return protectedVal + val;
    }

    /** 可視度が package-private のメソッド */
    static int defaultStaticMethod(int val){
        System.out.println("this is default visibility static method");
        return defaultVal + val;
    }

    /** 可視度が private のメソッド */
    private static int privateStaticMethod(int val){
        System.out.println("this is private static method");
        return privateVal + val;
    }

}
