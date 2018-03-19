package com.wode.stock.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * 返回结果
 * 
 * @author wanghongda @date 2018年1月19日
 */
@Getter
@Setter
public class Result {
	private Integer result;
	private Object data;
	private Long timestamp;
	public Result() {
	}
	public Result(Integer result, Object data, Long timestamp) {
		this.result = result;
		this.data = data;
		this.timestamp = timestamp;
	}
}
