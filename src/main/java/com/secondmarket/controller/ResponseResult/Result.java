package com.secondmarket.controller.ResponseResult;
import lombok.Data;

import static com.secondmarket.controller.ResponseResult.Static_CodeMsg.SUCCESS;


/**
 * ajax提交统一返回结果类
 * @author Administrator
 *
 */
@Data
public class Result<T> {
	
	private int code;//错误码
	
	private String msg;//返回的具体信息
	
	private T data;//定义返回的数据
	
	private Result(){}//构造函数私有化,不允许任意创建对象
	
	/**
	 * 定义传codemsg的私有化构造函数，不允许外部创建对象
	 * @param codeMsg
	 */
	private Result(CodeMsg codeMsg){
		if(codeMsg != null){
			this.code = codeMsg.getCode();
			this.msg = codeMsg.getMsg();
		}
	}
	
	/**
	 * 定义传指定数据对象和codemsg的私有化构造函数，不允许任意创建对象
	 * @param data
	 * @param codeMsg
	 * @return
	 */
	private Result(T data,CodeMsg codeMsg){
		if(codeMsg != null){
			this.code = codeMsg.getCode();
			this.msg = codeMsg.getMsg();
		}
		this.data = data;
	} 
	
	/**
	 * 定义统一的成功返回函数
	 * @param data
	 * @return
	 */
	public static <T>Result<T> success(T data){
		return new Result<T>(data,SUCCESS);
	}

	/**
	 * 统一错误返回方法，所有错误都调用此方法
	 * @param codeMsg
	 * @return
	 */
	public static <T>Result<T> error(CodeMsg codeMsg){
		return new Result<T>(codeMsg);
	}

}
