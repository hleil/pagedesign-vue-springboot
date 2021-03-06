package com.chengxuunion.pagecomponent.service;

import java.util.List;

import com.chengxuunion.common.exception.BaseException;
import com.chengxuunion.vo.PageComponent;

/**
 * 页面组件服务接口
 *
 * @author kutome
 * @date 2018年10月26日
 * @version V1.0
 */
public interface IPageComponentService {
	
	/**
	 * 查询指定页面中的所有组件
	 * 
	 * @param pageId	页面ID
	 * @return
	 * @throws BaseException
	 */
	List<PageComponent> queryPageComponens(String pageId) throws BaseException;
	
	/**
	 * 批量新增页面组件
	 * 
	 * @param pageComponents
	 * @return
	 * @throws BaseException
	 */
	int savePageComponentBatch(List<PageComponent> pageComponents) throws BaseException;

	/**
	 * 删除指定页面的所有组件
	 * 
	 * @param pageId	页面ID
	 * @return
	 * @throws BaseException
	 */
	int deletePageComponents(String pageId) throws BaseException;

}
