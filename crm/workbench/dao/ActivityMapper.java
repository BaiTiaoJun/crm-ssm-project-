package com.zhangshun.crm.workbench.dao;

import com.zhangshun.crm.workbench.domain.Activity;

import java.util.List;
import java.util.Map;

public interface ActivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Mon Apr 04 14:56:47 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Mon Apr 04 14:56:47 CST 2022
     */
    int insert(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Mon Apr 04 14:56:47 CST 2022
     */
    int insertSelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Mon Apr 04 14:56:47 CST 2022
     */
    Activity selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Mon Apr 04 14:56:47 CST 2022
     */
    int updateByPrimaryKeySelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Mon Apr 04 14:56:47 CST 2022
     */
    int updateByPrimaryKey(Activity record);

    /**
     * 添加市场活动信息
     * @return
     */
    int insertActivity(Activity activity);

    /**
     * 根据查询条件和页数返回查询的信息
     * @param map
     * @return
     */
    List<Activity> selectActivityByConditionForPage(Map<String, Object> map);

    /**
     * 根据查询条件返回查询信息的总记录条数
     * @param map
     * @return
     */
    int queryCountOfActivityByCondition(Map<String,  Object> map);

    /**
     * 根据id数组删除市场活动信息
     * @param ids
     * @return
     */
    int deleteActivityByList(String[] ids);

    /**
     * 根据id查询市场活动信息
     * @param id
     */
    Activity selectActivityById(String id);

    /**
     * 更新修改后的市场活动信息
     * @param activity
     * @return
     */
    int updateEditActivity(Activity activity);

    /**
     * 查询所有市场活动信息
     * @return
     */
    List<Activity> selectAllActivities();

    /**
     * 根据市场活动id查看一条或者多条活动信息
     * @param ids
     * @return
     */
    List<Activity> selectActivitiesById(String[] ids);

    /**
     * 批量保存excel表中创建的市场活动
     * @param activityList
     * @return
     */
    int insertActivityByList(List<Activity> activityList);

    /**
     * 根据id查询市场活动明细
     * @param id
     * @return
     */
    Activity selectActivityForDetailById(String id);
}