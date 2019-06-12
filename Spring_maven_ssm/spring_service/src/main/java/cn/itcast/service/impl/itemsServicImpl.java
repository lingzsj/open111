package cn.itcast.service.impl;

import cn.itcast.dao.ItemsDao;
import cn.itcast.domain.Items;
import cn.itcast.service.itemsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class itemsServicImpl implements itemsService {

    @Autowired
    private ItemsDao dao;

    public List<Items> findAll() {
        return dao.findAll();
    }

    public Items findById(int id) {
        return dao.findById(id);
    }

    public void saveEnnert(Items items) {
        dao.saveEnnert(items);

    }

    public void update(Items items) {
        dao.update(items);

    }

    public void deleteById(int id) {
        dao.deleteById(id);

    }

    public List<Items> findByName(String name) {
        return dao.findByName(name);
    }
}
