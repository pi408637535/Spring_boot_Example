package com.study.tkmybatis.model;

/**
 * Created by piguanghua on 9/22/17.
 */

import javax.persistence.*;
import java.util.Date;


@Table(name = "cms_activity_history")
public class CmsActivityHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(name = "activity_picture")
    private String activityPicture;

    @Column(name = "activity_end_date")
    private Date activityEndDate;

    @Column(name = "activity_start_date")
    private Date activityStartDate;

    @Column(name = "sys_create_date")
    private Date sysCreateDate;

    @Column(name = "sys_update_date")
    private Date sysUpdateDate;

    @Column(name = "activity_url")
    private String activityUrl;

    private Byte status;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * @return activity_picture
     */
    public String getActivityPicture() {
        return activityPicture;
    }

    /**
     * @param activityPicture
     */
    public void setActivityPicture(String activityPicture) {
        this.activityPicture = activityPicture == null ? null : activityPicture.trim();
    }

    /**
     * @return activity_end_date
     */
    public Date getActivityEndDate() {
        return activityEndDate;
    }

    /**
     * @param activityEndDate
     */
    public void setActivityEndDate(Date activityEndDate) {
        this.activityEndDate = activityEndDate;
    }

    /**
     * @return activity_start_date
     */
    public Date getActivityStartDate() {
        return activityStartDate;
    }

    /**
     * @param activityStartDate
     */
    public void setActivityStartDate(Date activityStartDate) {
        this.activityStartDate = activityStartDate;
    }

    /**
     * @return sys_create_date
     */
    public Date getSysCreateDate() {
        return sysCreateDate;
    }

    /**
     * @param sysCreateDate
     */
    public void setSysCreateDate(Date sysCreateDate) {
        this.sysCreateDate = sysCreateDate;
    }

    /**
     * @return sys_update_date
     */
    public Date getSysUpdateDate() {
        return sysUpdateDate;
    }

    /**
     * @param sysUpdateDate
     */
    public void setSysUpdateDate(Date sysUpdateDate) {
        this.sysUpdateDate = sysUpdateDate;
    }

    /**
     * @return activity_url
     */
    public String getActivityUrl() {
        return activityUrl;
    }

    /**
     * @param activityUrl
     */
    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl == null ? null : activityUrl.trim();
    }

    /**
     * @return status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}