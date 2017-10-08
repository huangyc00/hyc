package com.hyc.msg.dao;

import com.hyc.msg.eitity.Testa;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestaDaoTest {

    @Autowired
    private TestaDao testaDao ;

    @Test
    public void insert() throws Exception{
        Testa testa = new Testa();
        ArrayList<String> str = new ArrayList<String>();
        str.add("1");
        str.add("2");
        testa.setCode(str);
        Set<String> nicknames = new HashSet<String>();
        nicknames.add("nicknames_1");
        nicknames.add("nicknames_2");
        testa.setNickNames(nicknames);
        testa.setName("testa1");
        System.out.println(testa);
        Testa t1 = testaDao.save(testa);
        System.out.println(t1);
    }
}