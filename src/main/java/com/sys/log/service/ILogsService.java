package com.sys.log.service;

import com.sys.log.domain.SysLogEntity;

import java.util.List;

public interface ILogsService {

        void save(SysLogEntity sysLogEntity);


        List<SysLogEntity> showAll();
}
