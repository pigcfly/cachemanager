package com.iflytek.cachemanager.mapper;

import com.iflytek.cachemanager.entity.Dictionary004;
import com.iflytek.cachemanager.entity.Dictionary004Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Dictionary004Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary004
     *
     * @mbg.generated
     */
    long countByExample(Dictionary004Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary004
     *
     * @mbg.generated
     */
    int deleteByExample(Dictionary004Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary004
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary004
     *
     * @mbg.generated
     */
    int insert(Dictionary004 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary004
     *
     * @mbg.generated
     */
    int insertSelective(Dictionary004 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary004
     *
     * @mbg.generated
     */
    List<Dictionary004> selectByExampleWithRowbounds(Dictionary004Example example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary004
     *
     * @mbg.generated
     */
    List<Dictionary004> selectByExample(Dictionary004Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary004
     *
     * @mbg.generated
     */
    Dictionary004 selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary004
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Dictionary004 record, @Param("example") Dictionary004Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary004
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Dictionary004 record, @Param("example") Dictionary004Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary004
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Dictionary004 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary004
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Dictionary004 record);
}