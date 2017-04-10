package cn.com.hs.test.service;

import cn.com.hs.test.base.service.IBaseService;
import cn.com.hs.test.pojo.UserT;

public interface IUserTService extends IBaseService<UserT> {
	public UserT getUserById(int userId);
}
