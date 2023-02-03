package pro.eng.yui.jUnitSample;

import org.junit.jupiter.api.Test;
import pro.eng.yui.jUnitSample.TargetStaticClass;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OpenStaticTest {

    /** 可視度が public になっているstaticメソッドのテスト */
    @Test
    void testPublicStaticMethod() {
        int arg = 0;
        assertEquals(7_272, TargetStaticClass.publicStaticMethod(arg));
    }

    /** 可視度が protected になっているstaticメソッドのテスト */
    @Test
    void testProtectedStaticMethod() {
        int arg = 0;
        assertEquals(727, TargetStaticClass.protectedStaticMethod(arg));
    }

    /** 可視度が package-private (default) になっているstaticメソッドのテスト */
    @Test
    void testDefaultStaticMethod() {
        int arg = 0;
        assertEquals(72, TargetStaticClass.defaultStaticMethod(arg));
    }
}