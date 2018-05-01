package cn.studio.service;/**
 * Created by Happy on 2018-04-21.
 */

import cn.studio.entity.Grade;

import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-21
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public interface IGradeService {
    //01.写一个根据用户编号获取该用户绑定所有年级的方法
    public List<Grade> selectGradesByUid(Integer uid) throws Exception;
}
