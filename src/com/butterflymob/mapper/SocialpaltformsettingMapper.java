package com.butterflymob.mapper;

import com.butterflymob.entity.Socialpaltformsetting;
import com.butterflymob.entity.SocialpaltformsettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SocialpaltformsettingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table socialPaltformSetting
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    long countByExample(SocialpaltformsettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table socialPaltformSetting
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int deleteByExample(SocialpaltformsettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table socialPaltformSetting
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int deleteByPrimaryKey(String appname);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table socialPaltformSetting
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int insert(Socialpaltformsetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table socialPaltformSetting
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int insertSelective(Socialpaltformsetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table socialPaltformSetting
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    List<Socialpaltformsetting> selectByExample(SocialpaltformsettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table socialPaltformSetting
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    Socialpaltformsetting selectByPrimaryKey(String appname);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table socialPaltformSetting
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int updateByExampleSelective(@Param("record") Socialpaltformsetting record, @Param("example") SocialpaltformsettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table socialPaltformSetting
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int updateByExample(@Param("record") Socialpaltformsetting record, @Param("example") SocialpaltformsettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table socialPaltformSetting
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int updateByPrimaryKeySelective(Socialpaltformsetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table socialPaltformSetting
     *
     * @mbg.generated Wed Dec 28 14:53:42 CST 2016
     */
    int updateByPrimaryKey(Socialpaltformsetting record);
}