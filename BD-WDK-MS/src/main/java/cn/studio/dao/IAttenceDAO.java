package cn.studio.dao;

import cn.studio.entity.Attence;
import cn.studio.entity.Log;

/**
 * Created by Happy on 2018-04-15.
 */
public interface IAttenceDAO {
    //01.写一个添加考勤信息的方法
    public  int addAttence(Attence attence) throws Exception;
}
