package com.cloud.springcloud.service;

import com.microservicecloudapi.api.entities.Dept;

import java.util.List;

/**
 * Created by dongao on 2018/11/23.
 */
public interface DeptService {
    public boolean add(Dept dept);
    public Dept  get(Long id);
    public List<Dept> list();
}
