package test;

import com.hand.pojo.Article;
import com.hand.pojo.IUserInterface;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Test1 {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;
    static{
        try {
            reader = Resources.getResourceAsReader("mybatisConfig.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSessionFactory getSession(){
            return sqlSessionFactory;
    }
    public void getUserArticles(int userid){
        SqlSession session = sqlSessionFactory.openSession();
        try{
            IUserInterface userInterface = session.getMapper(IUserInterface.class);
            List<Article> list = userInterface.getUserArticles(userid);
            for(Article article:list){
                System.out.println(article.getTitle()+article.getContent()+
                article.getUser().getUserAddress());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] str){
        Test1 test = new Test1();
        test.getUserArticles(1);
    }

}
