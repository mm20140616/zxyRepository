####配置流程：
1. 创建maven项目，做好准备工作（创建数据库，建表）
2. 配置pom文件，引入相关jar包
3. 建立项目结构，在java目录下编写代码，在resources目录下编写配置文件
4. 配置jdbc.properties，在其中配置数据库连接信息
5. 配置spring-mybatis.xml配置文件，配置详细信息见该文件，实现spring和mybatis的整合。
6. 配置spring-mvc.xml配置文件。
7. 在web.xml中配置相关信息，主要配置编码过滤器，加载spring-mybatis的配置文件和spring-mvc的配置文件，以及配置spring的监听器(配置加载时启动spring)
8. 配置log4j.properties实现日志的配置。
9. 项目主体配置完成，编写代码时在resources目录下的mappers文件夹编写mybatis的*.xml配置文件即可。
