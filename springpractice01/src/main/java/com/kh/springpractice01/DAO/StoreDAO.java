package com.kh.springpractice01.DAO;

import com.kh.springpractice01.VO.StoreVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StoreDAO {

    @Autowired
    private JdbcTemplate jdbctemplate;

    // 전체 매장 정보 조회
    public List<StoreVO> getStoreList() {
        String sql = "SELECT * FROM STORE_TB";
        return jdbctemplate.query(sql, new BeanPropertyRowMapper<>(StoreVO.class));
    }

    // 특정 매장 정보 조회
    public StoreVO getStoreById(int storeNo) {
        String sql = "SELECT * FROM STORE_TB WHERE store_no = ?";
        return jdbctemplate.queryForObject(sql, new Object[]{storeNo}, new BeanPropertyRowMapper<>(StoreVO.class));
    }

    // 매장 추가
    public void addStore(StoreVO storeVO) {
        String sql = "INSERT INTO STORE_TB (store_no, brand_name, store_name, store_open, store_close, store_addr, store_map, store_phone) " +
                "VALUES (STORE_NO_SEQ.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
        jdbctemplate.update(sql, storeVO.getBrandName(), storeVO.getStoreName(), storeVO.getStoreOpen(),
                storeVO.getStoreClose(), storeVO.getStoreAddr(), storeVO.getStoreMap(), storeVO.getStorePhone());
    }

}
