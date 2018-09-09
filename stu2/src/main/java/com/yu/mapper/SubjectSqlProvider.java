package com.yu.mapper;

import com.yu.entity.Subject;
import com.yu.entity.SubjectExample;
import com.yu.entity.SubjectExample.Criteria;
import com.yu.entity.SubjectExample.Criterion;

import java.util.List;
import java.util.Map;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class SubjectSqlProvider {

    public String countByExample(SubjectExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("subject");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(SubjectExample example) {
        BEGIN();
        DELETE_FROM("subject");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Subject record) {
        BEGIN();
        INSERT_INTO("subject");
        
        if (record.getSubId() != null) {
            VALUES("sub_id", "#{subId,jdbcType=INTEGER}");
        }
        
        if (record.getSubName() != null) {
            VALUES("sub_name", "#{subName,jdbcType=VARCHAR}");
        }
        
        if (record.getDeptNo() != null) {
            VALUES("dept_no", "#{deptNo,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    public String selectByExample(SubjectExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("sub_id");
        } else {
            SELECT("sub_id");
        }
        SELECT("sub_name");
        SELECT("dept_no");
        FROM("subject");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Subject record = (Subject) parameter.get("record");
        SubjectExample example = (SubjectExample) parameter.get("example");
        
        BEGIN();
        UPDATE("subject");
        
        if (record.getSubId() != null) {
            SET("sub_id = #{record.subId,jdbcType=INTEGER}");
        }
        
        if (record.getSubName() != null) {
            SET("sub_name = #{record.subName,jdbcType=VARCHAR}");
        }
        
        if (record.getDeptNo() != null) {
            SET("dept_no = #{record.deptNo,jdbcType=INTEGER}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("subject");
        
        SET("sub_id = #{record.subId,jdbcType=INTEGER}");
        SET("sub_name = #{record.subName,jdbcType=VARCHAR}");
        SET("dept_no = #{record.deptNo,jdbcType=INTEGER}");
        
        SubjectExample example = (SubjectExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Subject record) {
        BEGIN();
        UPDATE("subject");
        
        if (record.getSubName() != null) {
            SET("sub_name = #{subName,jdbcType=VARCHAR}");
        }
        
        if (record.getDeptNo() != null) {
            SET("dept_no = #{deptNo,jdbcType=INTEGER}");
        }
        
        WHERE("sub_id = #{subId,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(SubjectExample example, boolean includeExamplePhrase) {
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