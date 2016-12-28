package com.butterflymob.mapper;

import com.butterflymob.entity.Shareevent;
import com.butterflymob.entity.ShareeventExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShareeventMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shareEvent
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    long countByExample(ShareeventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shareEvent
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int deleteByExample(ShareeventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shareEvent
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int deleteByPrimaryKey(Integer eventid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shareEvent
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int insert(Shareevent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shareEvent
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int insertSelective(Shareevent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shareEvent
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    List<Shareevent> selectByExample(ShareeventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shareEvent
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    Shareevent selectByPrimaryKey(Integer eventid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shareEvent
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int updateByExampleSelective(@Param("record") Shareevent record, @Param("example") ShareeventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shareEvent
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int updateByExample(@Param("record") Shareevent record, @Param("example") ShareeventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shareEvent
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int updateByPrimaryKeySelective(Shareevent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shareEvent
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int updateByPrimaryKey(Shareevent record);
}