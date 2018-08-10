package test;

import com.hand.TestUtil;
import com.hand.domain.SubStudent;

import java.lang.reflect.Field;

/**
 * @ProjectName reflectDemo
 * @ClassName TestDemo
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/9 16:27
 * @Version 1.0
 **/
public class TestDemo {

    public static void main(String[] args) {
        Object obj = new SubStudent();
        /*获取属性名称*/
        Field field = TestUtil.getDeclaredField(obj,"age");
        System.out.println(field.getName());
        /*获取属性对应的值*/
        Object object = TestUtil.getFieldValue(obj,"age");
        System.out.println(object);

        TestUtil.setFieldValue(obj,"age",11);
        Object change = TestUtil.getFieldValue(obj,"age");
        System.out.println(change);

    }

}
