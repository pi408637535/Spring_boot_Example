package com.wode.stock.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Holiday {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date holiday;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return holiday
     */
    public Date getHoliday() {
        return holiday;
    }

    /**
     * @param holiday
     */
    public void setHoliday(Date holiday) {
        this.holiday = holiday;
    }
}