package test;

import com.hand.pojo.IUserInterface;
import com.hand.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.List;

public class Test {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;
    static{
        try{
            reader = Resources.getResourceAsReader("mybatisConfig.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static SqlSessionFactory getSession(){
        return sqlSessionFactory;
    }
//    public static void main(String[] args){
//        SqlSession session = sqlSessionFactory.openSession();
//        try{
//                //未定义接口的处理方式
////            User user = (User)session.selectOne("UserMapper.selectUserByID",1);
////            System.out.println(user.getUserAddress());
////            System.out.println(user.getUserName());
////        }catch (Exception e){
////            e.printStackTrace();
////        }finally {
////            session.close();
////        }
//        //定义接口的处理方式
//        IUserInterface userInterface = session.getMapper(IUserInterface.class);
//        User user = userInterface.selectUserById(1);
//        System.out.println(user.getUserAge());
        public static void getUserList(String userName){
            //获取session
            SqlSession session = sqlSessionFactory.openSession();
            try{
                IUserInterface userInterface = session.getMapper(IUserInterface.class);
                List<User> users = userInterface.selectUsers(userName);
                for (User user:users){
                    System.out.println(user.getUserName()+":"+user.getUserAddress()+":"
                    +user.getUserAge()+":"+user.getId());
                }
            }catch (Exception r){
                r.printStackTrace();
            }finally {
                session.close();
            }
        }
        public void addUser(){
            User user = new User();
            user.setUserName("zxy");
            user.setUserAge("13");
            user.setUserAddress("baoqing");
            SqlSession session = sqlSessionFactory.openSession();
            try{
                 IUserInterface userInterface = session.getMapper(IUserInterface.class);
                 userInterface.addUser(user);
                 session.commit();
            }catch (Exception e){
                 e.printStackTrace();
            }finally {
                session.close();
            }
        }
        public void updateUser(){
        //修改，要先找到一个User进而做修改
            SqlSession session = sqlSessionFactory.openSession();
            try{
                IUserInterface userInterface = session.getMapper(IUserInterface.class);
                //找到一个需要修改的User
                User user = userInterface.selectUserById(1);
                user.setUserAge("20");
                session.commit();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                session.close();
            }
        }
        public static void main(String[] args){
            Test test = new Test();
            test.deleteUserById(3);
        }
        public void deleteUserById(int id){
            //先查找后删除
            SqlSession session = sqlSessionFactory.openSession();
            try{
                 IUserInterface userInterface = session.getMapper(IUserInterface.class);
                 userInterface.deleteUserById(id);
                 session.commit();
                 System.out.println("删除成功");
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                session.close();
            }
        }
}
