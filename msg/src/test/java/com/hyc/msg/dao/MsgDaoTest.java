package com.hyc.msg.dao;

import com.hyc.msg.eitity.Msg;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MsgDaoTest {

    @Autowired
    private MsgDao msgDao ;

   @Test
    public void findAll() throws Exception{
        List<Msg> msgs = msgDao.findAll();
        System.out.println(msgs);
    }
}