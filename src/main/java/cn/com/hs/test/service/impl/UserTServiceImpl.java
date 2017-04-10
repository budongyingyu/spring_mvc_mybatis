package cn.com.hs.test.service.impl;

import org.springframework.stereotype.Service;

import cn.com.hs.test.base.service.impl.BaseServiceImpl;
import cn.com.hs.test.common.PageData;
import cn.com.hs.test.pojo.UserT;
import cn.com.hs.test.service.IUserTService;
import cn.com.hs.test.util.JSONUtil;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class UserTServiceImpl extends BaseServiceImpl<UserT> implements IUserTService {

	@Override
	public UserT getUserById(int userId) {
		//分页查询
        PageHelper.startPage(1, 15);
        PageInfo<UserT> pageInfo = new PageInfo<UserT>(selectAllList());
		PageData pageData =  new PageData();
		pageData.setPageList(pageInfo.getList());
		pageData.setTotalCount(pageInfo.getTotal());
		pageData.setPageSize(pageInfo.getPageSize());
		pageData.setPageNo(pageInfo.getPageNum());
		pageData.setTotalPage(pageInfo.getPages());
        try {
        	
			System.out.println(JSONUtil.javaBeanToJson(pageData));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return selectByKey(userId);
	}

}
