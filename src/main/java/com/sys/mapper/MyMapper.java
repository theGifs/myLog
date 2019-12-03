package com.sys.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface MyMapper<SysLog> extends Mapper<SysLog> , MySqlMapper<SysLog> {
}
