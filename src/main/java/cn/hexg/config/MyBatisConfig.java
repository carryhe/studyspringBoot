//package cn.hexg.config;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.tomcat.jdbc.pool.DataSource;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.Resource;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.TransactionManagementConfigurer;
//@Configuration
//@MapperScan("cn.hexg.db.dao")
//public class MyBatisConfig implements TransactionManagementConfigurer {
//    @Autowired
//    private DataSource dataSource;
//    @Bean
//    public SqlSessionFactoryBean init() throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        Resource configLocation = new PathMatchingResourcePatternResolver()
//                .getResource("classpath:mybatis-config.xml"); // 在 resources 下 添加mybatis-config.xml 文件
//        sqlSessionFactoryBean.setConfigLocation(configLocation);
//        Resource[] mapperLocations = new PathMatchingResourcePatternResolver()
//                .getResources("classpath:mappers/*.xml"); // 在 resources 下添加 mapper文件夹
//        sqlSessionFactoryBean.setMapperLocations(mapperLocations);
//        return sqlSessionFactoryBean;
//    }
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//    @Bean
//    @Override
//    public PlatformTransactionManager annotationDrivenTransactionManager() {
//        return new DataSourceTransactionManager(dataSource);
//    }
//}
