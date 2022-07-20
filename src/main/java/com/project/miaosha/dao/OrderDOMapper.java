package com.project.miaosha.dao;

import com.project.miaosha.dataobject.OrderDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Jul 08 15:37:28 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Jul 08 15:37:28 CST 2022
     */
    int insert(OrderDO row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Jul 08 15:37:28 CST 2022
     */
    int insertSelective(OrderDO row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Jul 08 15:37:28 CST 2022
     */
    OrderDO selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Jul 08 15:37:28 CST 2022
     */
    int updateByPrimaryKeySelective(OrderDO row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Jul 08 15:37:28 CST 2022
     */
    int updateByPrimaryKey(OrderDO row);
}