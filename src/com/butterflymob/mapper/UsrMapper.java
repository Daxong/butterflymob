package com.butterflymob.mapper;

import com.butterflymob.entity.Usr;
import com.butterflymob.entity.UsrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    long countByExample(UsrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int deleteByExample(UsrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int deleteByPrimaryKey(Integer usrid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int insert(Usr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int insertSelective(Usr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    List<Usr> selectByExample(UsrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    Usr selectByPrimaryKey(Integer usrid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int updateByExampleSelective(@Param("record") Usr record, @Param("example") UsrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int updateByExample(@Param("record") Usr record, @Param("example") UsrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int updateByPrimaryKeySelective(Usr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int updateByPrimaryKey(Usr record);
}