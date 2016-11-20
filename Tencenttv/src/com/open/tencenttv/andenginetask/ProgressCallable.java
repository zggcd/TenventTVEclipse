/**
 *****************************************************************************************************************************************************************************
 * 
 * @author :fengguangjing
 * @createTime:2016-10-28下午5:27:04
 * @version:4.2.4
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 *****************************************************************************************************************************************************************************
 */
package com.open.tencenttv.andenginetask;

/**
 ***************************************************************************************************************************************************************************** 
 * 被观察者
 * 
 * @author :fengguangjing
 * @createTime:2016-10-28下午5:27:04
 * @version:4.2.4
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 ***************************************************************************************************************************************************************************** 
 */
public interface ProgressCallable<T> {
	/**
	 * 注册观察者对象 请求预加载 同于AsyncTask的doInBackground
	 * 
	 * @param pProgressListener
	 * @return
	 * @throws Exception
	 */
	public T call(final IProgressListener pProgressListener) throws Exception;
}
