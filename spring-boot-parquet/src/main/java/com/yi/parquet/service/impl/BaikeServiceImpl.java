package com.yi.parquet.service.impl;

import com.yi.parquet.model.Baike;
import com.yi.parquet.model.BaikeExample;
import com.yi.parquet.dao.BaikeMapper;
import com.yi.parquet.service.BaikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 操作数据业务
 * @author YI
 * @date 2018-8-22 17:56:55
 */
@Service
public class BaikeServiceImpl implements BaikeService {
    @Autowired
    BaikeMapper baikeMapper;


    @Override
    public long countByExample(BaikeExample example) {
        return baikeMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BaikeExample example) {
        return baikeMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return baikeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Baike record) {
        return baikeMapper.insert(record);
    }

    @Override
    public int insertSelective(Baike record) {
        return baikeMapper.insertSelective(record);
    }

    @Override
    public List<Baike> selectByExample(BaikeExample example) {
        return baikeMapper.selectByExample(example);
    }

    @Override
    public Baike selectByPrimaryKey(Long id) {
        return baikeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Baike record, BaikeExample example) {
        return baikeMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Baike record, BaikeExample example) {
        return baikeMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Baike record) {
        return baikeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Baike record) {
        return baikeMapper.updateByPrimaryKey(record);
    }
}
