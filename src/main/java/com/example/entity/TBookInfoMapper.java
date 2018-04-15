package com.example.entity;

import com.example.entity.TBookInfo;
import com.example.entity.TBookInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBookInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_info
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    int countByExample(TBookInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_info
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    int deleteByExample(TBookInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_info
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    int deleteByPrimaryKey(String bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_info
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    int insert(TBookInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_info
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    int insertSelective(TBookInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_info
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    List<TBookInfo> selectByExample(TBookInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_info
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    TBookInfo selectByPrimaryKey(String bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_info
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    int updateByExampleSelective(@Param("record") TBookInfo record, @Param("example") TBookInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_info
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    int updateByExample(@Param("record") TBookInfo record, @Param("example") TBookInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_info
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    int updateByPrimaryKeySelective(TBookInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book_info
     *
     * @mbggenerated Sat Apr 14 22:01:22 JST 2018
     */
    int updateByPrimaryKey(TBookInfo record);
}