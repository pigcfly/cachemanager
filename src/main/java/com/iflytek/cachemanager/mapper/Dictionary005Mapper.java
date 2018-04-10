package com.iflytek.cachemanager.mapper;

import com.iflytek.cachemanager.entity.Dictionary005;
import com.iflytek.cachemanager.entity.Dictionary005Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Dictionary005Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary005
     *
     * @mbg.generated
     */
    long countByExample(Dictionary005Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary005
     *
     * @mbg.generated
     */
    int deleteByExample(Dictionary005Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary005
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary005
     *
     * @mbg.generated
     */
    int insert(Dictionary005 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary005
     *
     * @mbg.generated
     */
    int insertSelective(Dictionary005 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary005
     *
     * @mbg.generated
     */
    List<Dictionary005> selectByExampleWithRowbounds(Dictionary005Example example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary005
     *
     * @mbg.generated
     */
    List<Dictionary005> selectByExample(Dictionary005Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary005
     *
     * @mbg.generated
     */
    Dictionary005 selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary005
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Dictionary005 record, @Param("example") Dictionary005Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary005
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Dictionary005 record, @Param("example") Dictionary005Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary005
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Dictionary005 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary005
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Dictionary005 record);
}