package com.dao;

import com.entity.QiuduiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiuduiVO;
import com.entity.view.QiuduiView;


/**
 * 球队
 * 
 * @author 
 * @email 
 * @date 2020-11-13 11:15:11
 */
public interface QiuduiDao extends BaseMapper<QiuduiEntity> {
	
	List<QiuduiVO> selectListVO(@Param("ew") Wrapper<QiuduiEntity> wrapper);
	
	QiuduiVO selectVO(@Param("ew") Wrapper<QiuduiEntity> wrapper);
	
	List<QiuduiView> selectListView(@Param("ew") Wrapper<QiuduiEntity> wrapper);

	List<QiuduiView> selectListView(Pagination page,@Param("ew") Wrapper<QiuduiEntity> wrapper);
	
	QiuduiView selectView(@Param("ew") Wrapper<QiuduiEntity> wrapper);
	
}
