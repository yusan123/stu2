package com.yu.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.yu.entity.Student;
import com.yu.entity.StudentExample.Criteria;
import com.yu.entity.StudentExample.Criterion;
import com.yu.entity.StudentExample;
import java.util.List;
import java.util.Map;

public class StudentSqlProvider {

    public String countByExample(StudentExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("student");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(StudentExample example) {
        BEGIN();
        DELETE_FROM("student");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Student record) {
        BEGIN();
        INSERT_INTO("student");
        
        if (record.getStudentId() != null) {
            VALUES("student_id", "#{studentId,jdbcType=INTEGER}");
        }
        
        if (record.getStudentNo() != null) {
            VALUES("student_no", "#{studentNo,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentName() != null) {
            VALUES("student_name", "#{studentName,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentAge() != null) {
            VALUES("student_age", "#{studentAge,jdbcType=INTEGER}");
        }
        
        if (record.getStudentSex() != null) {
            VALUES("student_sex", "#{studentSex,jdbcType=TINYINT}");
        }
        
        if (record.getSubjectNo() != null) {
            VALUES("subject_no", "#{subjectNo,jdbcType=INTEGER}");
        }
        
        if (record.getDeptNo() != null) {
            VALUES("dept_no", "#{deptNo,jdbcType=INTEGER}");
        }
        
        if (record.getStudentStatus() != null) {
            VALUES("student_status", "#{studentStatus,jdbcType=TINYINT}");
        }
        
        return SQL();
    }

    public String selectByExample(StudentExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("student_id");
        } else {
            SELECT("student_id");
        }
        SELECT("student_no");
        SELECT("student_name");
        SELECT("student_age");
        SELECT("student_sex");
        SELECT("subject_no");
        SELECT("dept_no");
        SELECT("student_status");
        FROM("student");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Student record = (Student) parameter.get("record");
        StudentExample example = (StudentExample) parameter.get("example");
        
        BEGIN();
        UPDATE("student");
        
        if (record.getStudentId() != null) {
            SET("student_id = #{record.studentId,jdbcType=INTEGER}");
        }
        
        if (record.getStudentNo() != null) {
            SET("student_no = #{record.studentNo,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentName() != null) {
            SET("student_name = #{record.studentName,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentAge() != null) {
            SET("student_age = #{record.studentAge,jdbcType=INTEGER}");
        }
        
        if (record.getStudentSex() != null) {
            SET("student_sex = #{record.studentSex,jdbcType=TINYINT}");
        }
        
        if (record.getSubjectNo() != null) {
            SET("subject_no = #{record.subjectNo,jdbcType=INTEGER}");
        }
        
        if (record.getDeptNo() != null) {
            SET("dept_no = #{record.deptNo,jdbcType=INTEGER}");
        }
        
        if (record.getStudentStatus() != null) {
            SET("student_status = #{record.studentStatus,jdbcType=TINYINT}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("student");
        
        SET("student_id = #{record.studentId,jdbcType=INTEGER}");
        SET("student_no = #{record.studentNo,jdbcType=VARCHAR}");
        SET("student_name = #{record.studentName,jdbcType=VARCHAR}");
        SET("student_age = #{record.studentAge,jdbcType=INTEGER}");
        SET("student_sex = #{record.studentSex,jdbcType=TINYINT}");
        SET("subject_no = #{record.subjectNo,jdbcType=INTEGER}");
        SET("dept_no = #{record.deptNo,jdbcType=INTEGER}");
        SET("student_status = #{record.studentStatus,jdbcType=TINYINT}");
        
        StudentExample example = (StudentExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Student record) {
        BEGIN();
        UPDATE("student");
        
        if (record.getStudentNo() != null) {
            SET("student_no = #{studentNo,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentName() != null) {
            SET("student_name = #{studentName,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentAge() != null) {
            SET("student_age = #{studentAge,jdbcType=INTEGER}");
        }
        
        if (record.getStudentSex() != null) {
            SET("student_sex = #{studentSex,jdbcType=TINYINT}");
        }
        
        if (record.getSubjectNo() != null) {
            SET("subject_no = #{subjectNo,jdbcType=INTEGER}");
        }
        
        if (record.getDeptNo() != null) {
            SET("dept_no = #{deptNo,jdbcType=INTEGER}");
        }
        
        if (record.getStudentStatus() != null) {
            SET("student_status = #{studentStatus,jdbcType=TINYINT}");
        }
        
        WHERE("student_id = #{studentId,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(StudentExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}