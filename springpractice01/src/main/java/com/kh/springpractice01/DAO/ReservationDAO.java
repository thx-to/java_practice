package com.kh.springpractice01.DAO;

import com.kh.springpractice01.VO.ReservationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReservationDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<ReservationVO> getReservationsByStore(String storeName) {
        String sql = "SELECT * FROM RESERVATION_TB WHERE store_name = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(ReservationVO.class), storeName);
    }

    public int createReservation(ReservationVO reservationVO) {
        String sql = "INSERT INTO RESERVATION_TB (user_id, user_name, store_name, store_phone, r_person_cnt, r_time) " +
                "VALUES (?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, reservationVO.getUserId(), reservationVO.getUserName(),
                reservationVO.getStoreName(), reservationVO.getStorePhone(),
                reservationVO.getRPersonCnt(), reservationVO.getRTime());
    }

    public int deleteReservation(int rNo) {
        String sql = "DELETE FROM RESERVATION_TB WHERE r_no = ?";
        return jdbcTemplate.update(sql, rNo);
    }

}
