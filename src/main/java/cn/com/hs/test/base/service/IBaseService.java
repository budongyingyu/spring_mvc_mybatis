
package cn.com.hs.test.base.service;

import org.springframework.stereotype.Service;

import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 通用接口
 */
@Service
public interface IBaseService<T> {

    T selectByKey(Object key);

    int save(T entity);

    int delete(Object key);

    int updateAll(T entity);

    int updateNotNull(T entity);
    
    int updateNotNullByPrimaryKey(T entity);

    List<T> selectByExample(Object example);
    
    List<T> selectAllList();
    
    int deleteByExample(Example example);
    
    int saveAllList(List<T> list);

}
