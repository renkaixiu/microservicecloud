package com.cloud.springcloud.service.impl;

import com.cloud.springcloud.dao.DeptDao;
import com.cloud.springcloud.service.DeptService;
import com.microservicecloudapi.api.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dongao on 2018/11/23.
 */
@Service
public class DeptServiceimpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
