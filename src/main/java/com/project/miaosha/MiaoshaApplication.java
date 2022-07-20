package com.project.miaosha;

import com.project.miaosha.dao.UserDOMapper;
import com.project.miaosha.dataobject.UserDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.project.miaosha"})
@RestController
@MapperScan("com.project.miaosha.dao")//将到dao包下的接口在编译后生成相应的实现类=在dao包下每个接口加上@Mapper
public class MiaoshaApplication {
    @Autowired
    private UserDOMapper userDOMapper;

    @RequestMapping("/")
    public String home(){
        UserDO userDO = userDOMapper.selectByPrimaryKey(1);
        if(userDO == null){
            return "用户对象不存在";
        }else{
            return userDO.getName();
        }
    }
    public static void main(String[] args) {
        SpringApplication.run(MiaoshaApplication.class, args);
    }

}
