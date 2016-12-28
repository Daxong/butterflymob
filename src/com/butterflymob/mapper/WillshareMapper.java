package com.butterflymob.mapper;

import com.butterflymob.entity.Willshare;
import com.butterflymob.entity.WillshareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WillshareMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table willShare
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    long countByExample(WillshareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table willShare
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int deleteByExample(WillshareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table willShare
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int deleteByPrimaryKey(Integer count);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table willShare
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int insert(Willshare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table willShare
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int insertSelective(Willshare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table willShare
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    List<Willshare> selectByExample(WillshareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table willShare
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int updateByExampleSelective(@Param("record") Willshare record, @Param("example") WillshareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table willShare
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int updateByExample(@Param("record") Willshare record, @Param("example") WillshareExample example);
}