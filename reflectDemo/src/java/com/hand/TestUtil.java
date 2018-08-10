package com.hand;

import java.lang.reflect.Field;

/**
 * @ProjectName reflectDemo
 * @ClassName TestUtil
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/9 16:14
 * @Version 1.0
 **/

public class TestUtil {

    public static Field getDeclaredField(Object object, String fieldName) {
        Field field = null;
        Class<?> clazz = object.getClass();//获取的是运行之后实际new的实例。
        /*判断运行之后得到的实例是否和编译期获得的类实例相同*/
          while(clazz != Object.class) {
              try{
                  field = clazz.getDeclaredField(fieldName);
                  return field;
              } catch (Exception e) {

              }finally {
                  clazz = clazz.getSuperclass();
              }
          }
          return null;
    }
    public static void setFieldValue(Object object, String fieldName, Object value) {

        /*根据对象和属性名通过取Field对象*/
        Field field = getDeclaredField(object, fieldName) ;

        /*赋权限*/
        field.setAccessible(true) ;

        try {
            /*将object中field所代表的值设置为value*/
            field.set(object, value) ;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static Object getFieldValue(Object object, String fieldName) {

        /*根据对象和属性名通过取Field对象*/
        Field field = getDeclaredField(object, fieldName) ;

        /*赋权限*/
        field.setAccessible(true) ;

        try {
            /*获得属性值*/
            return field.get(object) ;

        } catch(Exception e) {
            e.printStackTrace() ;
        }

        return null;
    }

}
