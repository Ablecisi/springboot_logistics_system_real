package com.ablecisi.service;

import com.ablecisi.entity.Emp;
import com.ablecisi.entity.PageBean;

import java.time.LocalDate;
import java.util.List;

/**
 * itheima_web_project
 * com.ablecisi.service.impl
 *
 * @author Ablecisi
 * @version 1.0
 * 2024/4/28
 * 星期日
 * 下午9:37
 */
public interface EmpService {
    PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end);

    PageBean pageConvient(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end);

    void deleteByIds(List<Integer> ids);

    void insertEmp(Emp emp);

    Emp selectById(Integer id);

    void updateEmp(Emp emp);

    Emp login(Emp emp);

    Emp search(Emp emp);
}
