package com.ablecisi.controller;

import com.ablecisi.entity.Emp;
import com.ablecisi.service.EmpService;
import com.ablecisi.util.model.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


/**
 * itheima_web_project
 * com.ablecisi.contrller
 *
 * @author Ablecisi
 * @version 1.0
 * 2024/4/28
 * 星期日
 * 下午9:33
 */
@Slf4j
@RequestMapping("/emps")
@RestController
public class EmpController {
    @Autowired
    private EmpService empService;

    /**
     * 查询所有员工
     * @return 员工列表
     */
    @GetMapping("/page")
    public Result page(@RequestParam(defaultValue = "1" )Integer page,
                       @RequestParam(defaultValue = "10")Integer pageSize
                       ){
        log.info("查询员工, 参数: page = {}, pageSize = {}", page, pageSize);
        return Result.success(empService.pageConvient(page, pageSize));
    }


    /**
     * 查询所有员工
     */
    /* @GetMapping("/all")
    public Result all(){
        log.info("查询所有员工");
        return Result.success(empService.all());
    } */


    @DeleteMapping("/{ids}")
    public Result deleteByIds(@PathVariable List<Integer> ids){
        log.info("删除员工, 参数: ids = {}", ids.toArray());
        empService.deleteByIds(ids);
        return Result.success();
    }


    /* @PostMapping()
    public Result insertEmp(@RequestBody Emp emp){
        log.info("添加员工, 参数: emp = {}", emp);
        empService.insertEmp(emp);
        return Result.success();
    } */
    @PostMapping("/insert")
    public Result insertEmpOk(@RequestBody Emp emp){
        log.info("插入员工, 参数: emp = {}", emp);
        empService.insertEmpOk(emp);
        return Result.success();
    }

    /**
     * 查询员工
     * @param id 员工ID
     * @return 员工对象
     */
    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id){
        log.info("查询员工, 参数: id = {}", id);
        return Result.success(empService.selectById(id));
    }

    /**
     * 更新员工
     * @param emp 员工对象
     * @return 更新结果
     */
    @PutMapping("/update")
    public Result updateEmp(@RequestBody Emp emp){
        log.info("更新员工, 参数: emp = {}", emp);
        empService.updateEmp(emp);
        return Result.success();
    }

    @PostMapping("/search")
    public Result search(@RequestBody Emp emp){
        log.info("搜索员工, 参数: emp = {}", emp);
        return Result.success(empService.search(emp));
    }



}
