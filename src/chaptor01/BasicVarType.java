package chaptor01;

/**
 * 8种基础数据类型相关问题
 */
public class BasicVarType {

    public static void main(String args[]) {
        BasicVarType basicVarType = new BasicVarType();
        basicVarType.testBasicVarType();
    }

    /**
     * 测试8种基本数据类型
     */
    public void testBasicVarType() {
        System.out.printf("byte类型，范围(%d,%d),字节数(%d),位数(%d)\n", ((byte) -128), (byte) 127, Byte.BYTES, Byte.SIZE);
        System.out.printf("short类型，范围(%d,%d),字节数(%d),位数(%d)\n", ((short) -32768), (short) 32767, Short.BYTES, Short.SIZE);
        System.out.printf("int类型，范围(%d,%d),字节数(%d),位数(%d)\n", Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.BYTES, Integer.SIZE);
        System.out.printf("long类型，范围(%d,%d),字节数(%d),位数(%d)\n", Long.MIN_VALUE, Long.MAX_VALUE, Long.BYTES, Long.SIZE);
        System.out.printf("float类型，范围(%s,%s),字节数(%d),位数(%d)\n", Float.MIN_VALUE, Float.MAX_VALUE, Float.BYTES, Float.SIZE);
        System.out.printf("double类型，范围(%s,%s),字节数(%d),位数(%d)\n", Double.MIN_VALUE, Double.MAX_VALUE, Double.BYTES, Double.SIZE);

        System.out.printf("char类型，范围(%s,%s),字节数(%d),位数(%d)\n", Character.MIN_VALUE, Character.MAX_VALUE, Character.BYTES, Character.SIZE);
        System.out.printf("boolean类型，范围(%s,%s)\n", Boolean.TRUE, Boolean.FALSE);
    }
}
