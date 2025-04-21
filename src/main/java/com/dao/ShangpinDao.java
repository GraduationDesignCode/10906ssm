package com.dao;

import com.entity.ShangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinVO;
import com.entity.view.ShangpinView;


/**
 * 商品
 * 
 * @author 
 * @email 
 * @date 2020-11-13 11:15:11
 */
public interface ShangpinDao extends BaseMapper<ShangpinEntity> {
	
	List<ShangpinVO> selectListVO(@Param("ew") Wrapper<ShangpinEntity> wrapper);
	
	ShangpinVO selectVO(@Param("ew") Wrapper<ShangpinEntity> wrapper);
	
	List<ShangpinView> selectListView(@Param("ew") Wrapper<ShangpinEntity> wrapper);

	List<ShangpinView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinEntity> wrapper);
	
	ShangpinView selectView(@Param("ew") Wrapper<ShangpinEntity> wrapper);
	
}
