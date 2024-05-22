package com.ablecisi.service.impl;

import com.ablecisi.entity.Emp;
import com.ablecisi.entity.PageBean;
import com.ablecisi.mapper.EmpMapper;
import com.ablecisi.service.EmpService;
import com.ablecisi.util.md5.MD5Utils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * itheima_web_project
 * com.ablecisi.service.impl
 *
 * @author Ablecisi
 * @version 1.0
 * 2024/4/28
 * 星期日
 * 下午9:39
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    /**
     * 分页查询员工
     * @param page 页码
     * @param pageSize 每页大小
     * @return 页面对象
     */
    @Override
    public PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end) {
        int start = (page - 1) * pageSize;
        return new PageBean(empMapper.count(),empMapper.page(start, pageSize, name, gender, begin, end)) ;
    }

    /**
     * 分页查询员工(<b>利用pageHelper插件实现分页查询</b>)
     * @param page 页码
     * @param pageSize 每页大小
     * @return 页面对象
     */
    @Override
    public PageBean pageConvient(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end) {
        // 使用PageHelper插件，设置分页
        PageHelper.startPage(page, pageSize);

        // 数据处理
         if (begin == null) {
            begin = LocalDate.now();
        } else if(end == null) {
            end = LocalDate.now();
        }

        // 执行查询
        List<Emp> emps = empMapper.list(name, gender, begin, end);
        Page<Emp> pageInfo = (Page<Emp>) emps;

        // 返回分页数据
        return new PageBean(pageInfo.getTotal(), pageInfo.getResult());
    }

    /**
     * 删除员工
     * @param ids 员工ID
     */
    @Override
    public void deleteByIds(List<Integer> ids) {
        empMapper.deleteByIds(ids);
    }

    /**
     *  添加员工
     * @param emp 员工对象
     */
    @Override
    public void insertEmp(Emp emp) {
        emp.setPassword(MD5Utils.md5(emp.getPassword()));
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.insertEmp(emp);
    }

    /**
     * 更新员工
     * @param id 员工ID
     */
    @Override
    public Emp selectById(Integer id) {
        return empMapper.selectById(id);
    }

    /**
     * 更新员工
     * @param emp 员工对象
     */
    @Override
    public void updateEmp(Emp emp) {
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.updateEmp(emp);
    }

    /**
     * 登录
     * @param emp 员工对象
     */
    @Override
    public Emp login(Emp emp) {
        /* emp.setPassword(MD5Utils.md5(emp.getPassword())); */
        return empMapper.getByUsernameAndPassword(emp);
    }

    @Override
    public Emp search(Emp emp) {
        return empMapper.search(emp);
    }

    @Override
    public void insertEmpOk(Emp emp) {
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.insertEmpOk(emp);
    }
}
