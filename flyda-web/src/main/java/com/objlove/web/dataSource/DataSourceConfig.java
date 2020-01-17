package com.objlove.web.dataSource;

import com.alibaba.druid.stat.DruidStatManagerFacade;
import com.objlove.web.FlydaWebApplication;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableTransactionManagement
@MapperScan(basePackageClasses = FlydaWebApplication.class, annotationClass = Mapper.class)
public class DataSourceConfig {

    @GetMapping("/druid/stat")
    public Object druidStat(){
        // DruidStatManagerFacade#getDataSourceStatDataList
        // 该方法可以获取所有数据源的监控数据，
        // 除此之外 DruidStatManagerFacade 还提供了一些其他方法，
        // 你可以按需选择使用。
        return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();
    }

}
