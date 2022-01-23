package pro.eng.yui_kitamura.jUnitSample;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrivateTest {

    /** 可視度が private のメソッドを呼び出す
     * @param instance 呼び出すメソッドを持っているクラスのインスタンス
     * @param arg 呼び出すメソッドへ渡す引数
     */
    private int testablePrivateMethod(TargetClass instance, int arg){
        int result;
        try {
            Method method = TargetClass.class.getDeclaredMethod("privateMethod", int.class);
            method.setAccessible(true);

            result = (int) method.invoke(instance, arg);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    /** 可視度が public になっているメソッドのテスト */
    @Test
    void testPublicMethod() {
        TargetClass targetClass = new TargetClass();
        int arg = 0;
        assertEquals(2, testablePrivateMethod(targetClass, arg));
    }

}