package com.yu.mapper;

import com.yu.entity.Subject;
import com.yu.entity.SubjectExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface SubjectMapper {
    @SelectProvider(type=SubjectSqlProvider.class, method="countByExample")
    int countByExample(SubjectExample example);

    @DeleteProvider(type=SubjectSqlProvider.class, method="deleteByExample")
    int deleteByExample(SubjectExample example);

    @Delete({
        "delete from subject",
        "where sub_id = #{subId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer subId);

    @Insert({
        "insert into subject (sub_id, sub_name, ",
        "dept_no)",
        "values (#{subId,jdbcType=INTEGER}, #{subName,jdbcType=VARCHAR}, ",
        "#{deptNo,jdbcType=INTEGER})"
    })
    int insert(Subject record);

    @InsertProvider(type=SubjectSqlProvider.class, method="insertSelective")
    int insertSelective(Subject record);

    @SelectProvider(type=SubjectSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="sub_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="sub_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="dept_no", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<Subject> selectByExample(SubjectExample example);

    @Select({
        "select",
        "sub_id, sub_name, dept_no",
        "from subject",
        "where sub_id = #{subId,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="sub_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="sub_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="dept_no", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    Subject selectByPrimaryKey(Integer subId);

    @UpdateProvider(type=SubjectSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Subject record, @Param("example") SubjectExample example);

    @UpdateProvider(type=SubjectSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Subject record, @Param("example") SubjectExample example);

    @UpdateProvider(type=SubjectSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Subject record);

    @Update({
        "update subject",
        "set sub_name = #{subName,jdbcType=VARCHAR},",
          "dept_no = #{deptNo,jdbcType=INTEGER}",
        "where sub_id = #{subId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Subject record);
}