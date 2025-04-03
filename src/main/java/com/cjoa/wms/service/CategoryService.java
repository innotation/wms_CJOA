package com.cjoa.wms.service;

import com.cjoa.wms.dao.CategoryMapper;
import com.cjoa.wms.dto.CategoryDto;
import org.apache.ibatis.session.SqlSession;

import static com.cjoa.wms.config.MyBatisConfig.getSqlSession;
import static com.cjoa.wms.view.ResultView.FailView;
import static com.cjoa.wms.view.ResultView.SuccessView;

public class CategoryService {
    private CategoryMapper categoryMapper;
    private SqlSession sqlSession;
    public int addCategory(CategoryDto categoryDto) {
        sqlSession = getSqlSession();
        categoryMapper = sqlSession.getMapper(CategoryMapper.class);
        int result = categoryMapper.addCategory(categoryDto);
        if (result > 0) {
            sqlSession.commit();
            SuccessView("addCategory");
        } else{
            sqlSession.rollback();
            FailView("addCategory");
        }
        return result;
    }
}
