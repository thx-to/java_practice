package com.kh.springpractice01.CONTROLLER;

import com.kh.springpractice01.DAO.StoreDAO;
import com.kh.springpractice01.VO.StoreVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stores")
public class StoreController {

    @Autowired
    private StoreDAO storeDAO;

    // 전체 매장 정보 조회
    @GetMapping
    public List<StoreVO> getStores() {
        return storeDAO.getStoreList();
    }

    // 특정 매장 정보 조회
    @GetMapping("/{storeNo}")
    public StoreVO getStore(@PathVariable int storeNo) {
        return storeDAO.getStoreById(storeNo);
    }

    // 매장 추가
    public ResponseEntity<Void> addStore(@RequestBody StoreVO storeVO) {
        storeDAO.addStore(storeVO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
