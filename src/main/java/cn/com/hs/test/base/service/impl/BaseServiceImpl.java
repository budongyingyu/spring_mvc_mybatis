package cn.com.hs.test.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.mybatis.mapper.entity.Example;
import cn.com.hs.test.base.service.IBaseService;
import cn.com.hs.test.util.MyMapper;

/**
 * Created by liuzh on 2014/12/11.
 */
@Service
public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    @Autowired
    protected MyMapper<T> mapper;

    @Override
    public T selectByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    public int save(T entity) {
        return mapper.insert(entity);
    }

    public int delete(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }

    public int updateAll(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    public int updateNotNull(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }
    
    public int updateNotNullByPrimaryKey(T entity){
    	return mapper.updateByPrimaryKeySelective(entity);
    }

    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }
    
    public List<T> selectAllList(){
    	return mapper.selectAll();
    }
    
    public int deleteByExample(Example example){
    	return mapper.deleteByExample(example);
    }
    public int saveAllList(List<T> list){
    	return mapper.insertList(list);
    }
}
