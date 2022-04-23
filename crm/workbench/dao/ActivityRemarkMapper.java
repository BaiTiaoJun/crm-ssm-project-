package com.zhangshun.crm.workbench.dao;

import com.zhangshun.crm.workbench.domain.ActivityRemark;

import java.util.List;
import java.util.Map;

public interface ActivityRemarkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun Apr 17 22:38:45 HKT 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun Apr 17 22:38:45 HKT 2022
     */
    int insert(ActivityRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun Apr 17 22:38:45 HKT 2022
     */
    int insertSelective(ActivityRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun Apr 17 22:38:45 HKT 2022
     */
    ActivityRemark selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun Apr 17 22:38:45 HKT 2022
     */
    int updateByPrimaryKeySelective(ActivityRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun Apr 17 22:38:45 HKT 2022
     */
    int updateByPrimaryKey(ActivityRemark record);

    /**
     * 根据市场活动id查询市场评论表信息
     * @param activityId
     * @return
     */
    List<ActivityRemark> selectActivityRemarkForDetailByActivityId(String activityId);

    /**
     * 添加市场活动备注信息
     * @param activityRemark
     * @return
     */
    int insertActivityRemark(ActivityRemark activityRemark);

    /**
     * 通过id删除市场备注信息
     * @param id
     * @return
     */
    int deleteActivityRemarkById(String id);

    /**
     * 通过id修改市场活动备注信息
     * @param remark
     * @return
     */
    int updateActivityRemark(Map<String, Object> remark);
}