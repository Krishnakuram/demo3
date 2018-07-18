package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class MenuService {

    @Autowired
    MenuRepository mr;

    public Menu save(Menu menu){

        return mr.save(menu);
    }
    public List<Menu> listAll(Menu menu){
        List<Menu> list = new ArrayList<>();
        mr.findAll().forEach(new Consumer<Menu>() {
            @Override
            public void accept(Menu menu) {
                list.add(menu);
            }
        });
        return list;
    }

    @Transactional
    public void deleteItemFromMenu(Integer id){

        mr.deleteById(id);
    }


}
