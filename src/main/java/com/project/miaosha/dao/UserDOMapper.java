package com.project.miaosha.dao;

import com.project.miaosha.dataobject.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDOMapper {
    //根据电话号码取得用户对象
    UserDO selectByTelephone(String telephone);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Thu Jun 30 17:13:45 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Thu Jun 30 17:13:45 CST 2022
     */
    int insert(UserDO row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Thu Jun 30 17:13:45 CST 2022
     */
    int insertSelective(UserDO row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Thu Jun 30 17:13:45 CST 2022
     */
    UserDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Thu Jun 30 17:13:45 CST 2022
     */
    int updateByPrimaryKeySelective(UserDO row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Thu Jun 30 17:13:45 CST 2022
     */
    int updateByPrimaryKey(UserDO row);
}