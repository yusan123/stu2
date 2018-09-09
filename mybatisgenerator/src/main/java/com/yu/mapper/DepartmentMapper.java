package com.yu.mapper;

import com.yu.entity.Department;
import com.yu.entity.DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface DepartmentMapper {
    @SelectProvider(type=DepartmentSqlProvider.class, method="countByExample")
    int countByExample(DepartmentExample example);

    @DeleteProvider(type=DepartmentSqlProvider.class, method="deleteByExample")
    int deleteByExample(DepartmentExample example);

    @Delete({
        "delete from department",
        "where dept_id = #{deptId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer deptId);

    @Insert({
        "insert into department (dept_id, dept_name)",
        "values (#{deptId,jdbcType=INTEGER}, #{deptName,jdbcType=VARCHAR})"
    })
    int insert(Department record);

    @InsertProvider(type=DepartmentSqlProvider.class, method="insertSelective")
    int insertSelective(Department record);

    @SelectProvider(type=DepartmentSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="dept_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="dept_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Department> selectByExample(DepartmentExample example);

    @Select({
        "select",
        "dept_id, dept_name",
        "from department",
        "where dept_id = #{deptId,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="dept_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="dept_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Department selectByPrimaryKey(Integer deptId);

    @UpdateProvider(type=DepartmentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    @UpdateProvider(type=DepartmentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    @UpdateProvider(type=DepartmentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Department record);

    @Update({
        "update department",
        "set dept_name = #{deptName,jdbcType=VARCHAR}",
        "where dept_id = #{deptId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Department record);
}