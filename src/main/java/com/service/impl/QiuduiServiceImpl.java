package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QiuduiDao;
import com.entity.QiuduiEntity;
import com.service.QiuduiService;
import com.entity.vo.QiuduiVO;
import com.entity.view.QiuduiView;

@Service("qiuduiService")
public class QiuduiServiceImpl extends ServiceImpl<QiuduiDao, QiuduiEntity> implements QiuduiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiuduiEntity> page = this.selectPage(
                new Query<QiuduiEntity>(params).getPage(),
                new EntityWrapper<QiuduiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiuduiEntity> wrapper) {
		  Page<QiuduiView> page =new Query<QiuduiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiuduiVO> selectListVO(Wrapper<QiuduiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiuduiVO selectVO(Wrapper<QiuduiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiuduiView> selectListView(Wrapper<QiuduiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiuduiView selectView(Wrapper<QiuduiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
