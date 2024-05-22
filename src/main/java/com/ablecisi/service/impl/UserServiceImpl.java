package com.ablecisi.service.impl;

import com.ablecisi.entity.Emp;
import com.ablecisi.mapper.EmpMapper;
import com.ablecisi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * springboot_logistics_system
 * com.ablecisi.service.impl
 *
 * @author Ablecisi
 * @version 1.0
 * 2024/5/21
 * 星期二
 * 下午6:35
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public Emp login(Emp emp) {
        return empMapper.getByUsernameAndPassword(emp);
    }
}
