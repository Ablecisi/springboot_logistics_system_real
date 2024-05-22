package com.ablecisi.mapper;

import com.ablecisi.entity.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDate;
import java.util.List;

/**
 * itheima_web_project
 * com.ablecisi.mapper
 *
 * @author Ablecisi
 * @version 1.0
 * 2024/4/28
 * 星期日
 * 下午9:35
 */
@Mapper
public interface EmpMapper {

    /**
     * 查询所有员工(利用pageHelper插件实现分页查询)
     * @return 员工列表
     */
    List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);

    /**
     * 查询所有员工
     * @return 数据总数
     */
    Long count();

    /**
     *  分页查询员工
     * @param page 开始位置
     * @param pageSize 每页大小
     * @return 员工列表
     */
    List<Emp> page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end);

    /**
     * 删除员工
     * @param ids 员工ID
     */
    void deleteByIds(List<Integer> ids);

    /**
     * 添加员工
     * @param emp 员工对象
     */
    void insertEmp(Emp emp);

    /**
     * 根据ID查询员工
     * @param id 员工ID
     * @return 员工对象
     */
    Emp selectById(Integer id);

    /**
     * 更新员工
     * @param emp 员工对象
     */
    void updateEmp(Emp emp);

    /**
     * 登录
     * @param emp 员工对象
     * @return 员工对象
     */
    Emp getByUsernameAndPassword(Emp emp);

    /**
     * 根据部门ID删除员工
     * @param id 部门ID
     */
    void deleteByDeptId(Integer id);

    /**
     * 搜索员工
     * @param emp 员工对象
     * @return 员工对象
     */
    Emp search(Emp emp);
}
