package pro.eng.yui_kitamura.jUnitSample;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrivateStaticTest {

    /** 可視度が private のstaticメソッドを呼び出す
     * @param arg 呼び出すメソッドへ渡す引数
     */
    private int testablePrivateStaticMethod(int arg){
        int result;
        try {
            Method method = TargetStaticClass.class.getDeclaredMethod("privateStaticMethod", int.class);
            method.setAccessible(true);

            result = (int) method.invoke(TargetStaticClass.class, arg);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    /** 可視度が private になっているメソッドのテスト */
    @Test
    void testPrivateStaticMethod() {
        int arg = 0;
        assertEquals(7, testablePrivateStaticMethod(arg));
    }

}