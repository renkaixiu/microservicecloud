package com.microservicecloudapi.api.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Created by dongao on 2018/11/23.
 */
@Data //提供类所有属性的 getting 和 setting 方法
@NoArgsConstructor //提供类的无参构造函数
@Accessors(chain = true)
public class Dept {
    //主键
    private Long deptno;
    //部门名称
    private String 	dname;
    //来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库。
    private String 	db_source;

    public Dept(String dname)
    {
        super();
        this.dname = dname;
    }

}
