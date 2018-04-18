package cn.studio.service.impl;/**
 * Created by Happy on 2018-04-15.
 */

import cn.studio.dao.ILogDAO;
import cn.studio.entity.Log;
import cn.studio.service.ILogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-15
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Service("logService")
public class LogServiceImpl implements ILogService {
    @Resource(name = "ILogDAO")
    private ILogDAO logDAO;
    public int addLog(Log log) throws Exception {
        return logDAO.addLog(log);
    }

    public ILogDAO getLogDAO() {
        return logDAO;
    }

    public void setLogDAO(ILogDAO logDAO) {
        this.logDAO = logDAO;
    }
}
