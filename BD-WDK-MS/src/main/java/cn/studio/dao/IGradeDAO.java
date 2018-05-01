package cn.studio.dao;

import cn.studio.entity.Attence;
import cn.studio.entity.Grade;

import java.util.List;

/**
 * Created by Happy on 2018-04-15.
 */
public interface IGradeDAO {
    //01.写一个根据用户编号获取该用户绑定所有年级的方法
    public List<Grade> selectGradesByUid(Integer uid) throws Exception;
}
