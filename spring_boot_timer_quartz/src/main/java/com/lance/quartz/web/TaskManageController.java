package com.lance.quartz.web;

import com.alibaba.fastjson.JSON;
import com.lance.quartz.common.exception.ServiceException;
import com.lance.quartz.common.json.ResultInfo;

import com.lance.quartz.domain.TaskInfo;
import com.lance.quartz.service.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 任务管理
 * @author lance
 */
@RestController()
@RequestMapping("/home")
public class TaskManageController {
	@Autowired
	private TaskServiceImpl taskServiceImpl;

	/**
	 * Index.jsp
	 * 2016年10月8日下午6:39:15
	 */
	@RequestMapping(value={"", "/", "index"})
	public String info(){
		return "index.jsp";
	}
	
	/**
	 * 任务列表
	 * @return
	 * 2016年10月9日上午11:36:03
	 */
	@ResponseBody
	@RequestMapping(value="/list", method= RequestMethod.GET)
	public String list(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<TaskInfo> infos = taskServiceImpl.list();
		map.put("rows", infos);
		map.put("total", infos.size());
		return JSON.toJSONString(map);
	}
	
	/**
	 * 保存定时任务
	 * @param info
	 * 2016年10月9日下午1:36:59
	 */
	@ResponseBody
	@RequestMapping(value="/save", method= RequestMethod.POST, produces = "application/json; charset=UTF-8")
	public String save(@RequestBody TaskInfo info){
		try {
			if(info.getId() == 0) {
				taskServiceImpl.addJob(info);
			}else{
				taskServiceImpl.edit(info);
			}
		} catch (ServiceException e) {
			return ResultInfo.error(-1, e.getMessage());
		}
		return ResultInfo.success();
	}
	
	/**
	 * 删除定时任务
	 * @param jobName
	 * @param jobGroup
	 * 2016年10月9日下午1:52:20
	 */
	@ResponseBody
	@RequestMapping(value="/delete/{jobName}/{jobGroup}", produces = "application/json; charset=UTF-8")
	public String delete(@PathVariable String jobName, @PathVariable String jobGroup){
		try {
			taskServiceImpl.delete(jobName, jobGroup);
		} catch (ServiceException e) {
			return ResultInfo.error(-1, e.getMessage());
		}
		return ResultInfo.success();
	}
	
	/**
	 * 暂停定时任务
	 * @param jobName
	 * @param jobGroup
	 * 2016年10月10日上午9:41:25
	 */
	@ResponseBody
	@RequestMapping(value="/pause/{jobName}/{jobGroup}", produces = "application/json; charset=UTF-8")
	public String pause(@PathVariable String jobName, @PathVariable String jobGroup){
		try {
			taskServiceImpl.pause(jobName, jobGroup);
		} catch (ServiceException e) {
			return ResultInfo.error(-1, e.getMessage());
		}
		return ResultInfo.success();
	}
	
	/**
	 * 重新开始定时任务
	 * @param jobName
	 * @param jobGroup
	 * 2016年10月10日上午9:41:40
	 */
	@ResponseBody
	@RequestMapping(value="/resume/{jobName}/{jobGroup}", produces = "application/json; charset=UTF-8")
	public String resume(@PathVariable String jobName, @PathVariable String jobGroup){
		try {
			taskServiceImpl.resume(jobName, jobGroup);
		} catch (ServiceException e) {
			return ResultInfo.error(-1, e.getMessage());
		}
		return ResultInfo.success();
	}
}
