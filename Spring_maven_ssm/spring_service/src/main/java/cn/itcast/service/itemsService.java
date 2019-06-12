package cn.itcast.service;



import cn.itcast.domain.Items;

import java.util.List;

public interface itemsService {
    /**
     * 查询全部
     * @return
     */
    public List<Items> findAll();


    /**
     * 根据id单个查询
     * @param id
     * @return
     */
    public Items findById(int id);

    /**
     * 添加的方法
     * @param items
     */

    public void saveEnnert(Items items);

    /**
     * 添加用户
     * @param items
     */
    public void update(Items items);


    /**
     * 根据id来删除用户
     * @param id
     */
    public void deleteById(int id);

    /**
     * 根据姓名来模糊查询
     * @param name
     * @return
     */
    List<Items>findByName(String name);
}
