package cn.happy.entity;/**
 * Created by Happy on 2018-05-22.
 */

import cn.happy.util.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 作者：微冷的雨
 *
 * @create 2018-05-22
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class AirModel {
    private Integer id;
    private String district;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @JsonSerialize(using = JsonDateSerializer.class)
    private Date monitorTime;
    private Integer pm10;
    private Integer pm25;
    private String monitoringStation;
    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Date getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    public Integer getPm10() {
        return pm10;
    }

    public void setPm10(Integer pm10) {
        this.pm10 = pm10;
    }

    public Integer getPm25() {
        return pm25;
    }

    public void setPm25(Integer pm25) {
        this.pm25 = pm25;
    }

    public String getMonitoringStation() {
        return monitoringStation;
    }

    public void setMonitoringStation(String monitoringStation) {
        this.monitoringStation = monitoringStation;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
