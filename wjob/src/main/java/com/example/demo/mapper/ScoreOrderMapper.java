package com.example.demo.mapper;

import com.example.demo.entity.ScoreOrder;
import com.example.demo.entity.ScoreOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoreOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_order
     *
     * @mbggenerated
     */
    int countByExample(ScoreOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_order
     *
     * @mbggenerated
     */
    int deleteByExample(ScoreOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_order
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_order
     *
     * @mbggenerated
     */
    int insert(ScoreOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_order
     *
     * @mbggenerated
     */
    int insertSelective(ScoreOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_order
     *
     * @mbggenerated
     */
    List<ScoreOrder> selectByExample(ScoreOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_order
     *
     * @mbggenerated
     */
    ScoreOrder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_order
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ScoreOrder record, @Param("example") ScoreOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_order
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ScoreOrder record, @Param("example") ScoreOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_order
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ScoreOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_order
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ScoreOrder record);
}