import org.junit.Test;

/**
 * @Author: walton
 * @Description:
 * @Createtime:17:132017/11/21
 */
public class testKeyGenerator {
    @Test
    public void test(){
        Long key = (Long)new DefaultKeyGenerator().generateKey();
        System.out.println(key);
    }
}
