package com.demo.service.Impl;

import com.demo.mapper.DataMapper;
import com.demo.model.Data;
import com.demo.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {
   @Autowired
   private DataMapper dataMapper;

    @Override
    public List<Data> findAll() {
        return dataMapper.findAll();
    }
}
