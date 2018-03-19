package com.wode.stock.dao.impl;

import com.wode.stock.bean.Holiday;
import com.wode.stock.dao.HolidayDao;
import com.wode.stock.mapper.HolidayMapper;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;

/**
 * 
 * @author wanghongda @date 2018年1月22日
 */
@Repository
public class HolidayDaoImpl extends BaseDaoImpl<Holiday> implements HolidayDao {

    @Resource
    HolidayMapper holidayMapper;


    @Override
    public Mapper<Holiday> getMapper() {
        return holidayMapper;
    }
}
