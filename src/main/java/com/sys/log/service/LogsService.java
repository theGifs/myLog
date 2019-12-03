package com.sys.log.service;

import com.sys.log.domain.SysLogEntity;
import com.sys.log.mapper.SysLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogsService implements ILogsService {

    @Autowired
    SysLogMapper sysLogMapper;


    @Override
    public void save(SysLogEntity sysLogEntity) {
        int insert = sysLogMapper.insert(sysLogEntity);
        System.err.println(insert);
    }

    @Override
    public List<SysLogEntity> showAll() {
        return sysLogMapper.selectAll();
    }
}
