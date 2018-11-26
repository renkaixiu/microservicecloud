package com.cloud.springcloud.dao;

import com.microservicecloudapi.api.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by dongao on 2018/11/23.
 */
//整合mybatis
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}