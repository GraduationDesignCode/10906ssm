package com.entity.view;

import com.entity.QiuduiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 球队
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-13 11:15:11
 */
@TableName("qiudui")
public class QiuduiView  extends QiuduiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiuduiView(){
	}
 
 	public QiuduiView(QiuduiEntity qiuduiEntity){
 	try {
			BeanUtils.copyProperties(this, qiuduiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
