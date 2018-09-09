package com.yu.mapper;

import com.yu.entity.Student;
import com.yu.entity.StudentExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface StudentMapper {
    @SelectProvider(type=StudentSqlProvider.class, method="countByExample")
    int countByExample(StudentExample example);

    @DeleteProvider(type=StudentSqlProvider.class, method="deleteByExample")
    int deleteByExample(StudentExample example);

    @Delete({
        "delete from student",
        "where student_id = #{studentId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer studentId);

    @Insert({
        "insert into student (student_id, student_no, ",
        "student_name, student_age, ",
        "student_sex, subject_no, ",
        "dept_no, student_status)",
        "values (#{studentId,jdbcType=INTEGER}, #{studentNo,jdbcType=VARCHAR}, ",
        "#{studentName,jdbcType=VARCHAR}, #{studentAge,jdbcType=INTEGER}, ",
        "#{studentSex,jdbcType=TINYINT}, #{subjectNo,jdbcType=INTEGER}, ",
        "#{deptNo,jdbcType=INTEGER}, #{studentStatus,jdbcType=TINYINT})"
    })
    int insert(Student record);

    @InsertProvider(type=StudentSqlProvider.class, method="insertSelective")
    int insertSelective(Student record);

    @SelectProvider(type=StudentSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="student_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="student_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="student_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="student_age", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="student_sex", javaType=Byte.class, jdbcType=JdbcType.TINYINT),
        @Arg(column="subject_no", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="dept_no", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="student_status", javaType=Byte.class, jdbcType=JdbcType.TINYINT)
    })
    List<Student> selectByExample(StudentExample example);

    @Select({
        "select",
        "student_id, student_no, student_name, student_age, student_sex, subject_no, ",
        "dept_no, student_status",
        "from student",
        "where student_id = #{studentId,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="student_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="student_no", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="student_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="student_age", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="student_sex", javaType=Byte.class, jdbcType=JdbcType.TINYINT),
        @Arg(column="subject_no", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="dept_no", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="student_status", javaType=Byte.class, jdbcType=JdbcType.TINYINT)
    })
    Student selectByPrimaryKey(Integer studentId);

    @UpdateProvider(type=StudentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    @UpdateProvider(type=StudentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    @UpdateProvider(type=StudentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Student record);

    @Update({
        "update student",
        "set student_no = #{studentNo,jdbcType=VARCHAR},",
          "student_name = #{studentName,jdbcType=VARCHAR},",
          "student_age = #{studentAge,jdbcType=INTEGER},",
          "student_sex = #{studentSex,jdbcType=TINYINT},",
          "subject_no = #{subjectNo,jdbcType=INTEGER},",
          "dept_no = #{deptNo,jdbcType=INTEGER},",
          "student_status = #{studentStatus,jdbcType=TINYINT}",
        "where student_id = #{studentId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Student record);
}