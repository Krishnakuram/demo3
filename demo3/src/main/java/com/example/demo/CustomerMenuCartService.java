package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class CustomerMenuCartService {

    @Autowired
    CustomerOrderCartRepository oc;

    @Transactional
    public CustomerOrder saveOrder(CustomerOrder o){

        return oc.save(o);
    }

    @Transactional
    public void deleteOrder(Integer id){

    oc.deleteById(id);
    }

    public List<CustomerOrder> listAll(CustomerOrder o){

        List<CustomerOrder> list = new ArrayList<>();
         oc.findAll().forEach(new Consumer<CustomerOrder>() {
            @Override
            public void accept(CustomerOrder customerOrder) {
                list.add(customerOrder);
            }
        });
         return list;
    }
}
