package cn.studio.dao;

import cn.studio.entity.Log;

/**
 * Created by Happy on 2018-04-15.
 */
public interface ILogDAO {
    //01.写一个添加日志的方法
    public  int addLog(Log log) throws Exception;
}
