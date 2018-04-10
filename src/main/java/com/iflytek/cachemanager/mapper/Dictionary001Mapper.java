package com.iflytek.cachemanager.mapper;

import com.iflytek.cachemanager.entity.Dictionary001;
import com.iflytek.cachemanager.entity.Dictionary001Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Dictionary001Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary001
     *
     * @mbg.generated
     */
    long countByExample(Dictionary001Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary001
     *
     * @mbg.generated
     */
    int deleteByExample(Dictionary001Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary001
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary001
     *
     * @mbg.generated
     */
    int insert(Dictionary001 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary001
     *
     * @mbg.generated
     */
    int insertSelective(Dictionary001 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary001
     *
     * @mbg.generated
     */
    List<Dictionary001> selectByExampleWithRowbounds(Dictionary001Example example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary001
     *
     * @mbg.generated
     */
    List<Dictionary001> selectByExample(Dictionary001Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary001
     *
     * @mbg.generated
     */
    Dictionary001 selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary001
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Dictionary001 record, @Param("example") Dictionary001Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary001
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Dictionary001 record, @Param("example") Dictionary001Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary001
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Dictionary001 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary001
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Dictionary001 record);
}