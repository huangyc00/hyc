package com.hyc.msg.service.impl;

import com.hyc.msg.dao.MsgDao;
import com.hyc.msg.eitity.Msg;
import com.hyc.msg.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MsgServiceImpl implements MsgService{

    @Autowired
    private MsgDao msgDao ;

    @Override
    public List<Msg> findAll() throws Exception {

        return msgDao.findAll();
    }

    @Override
    public Msg save(Msg msg) throws Exception {
        return msgDao.save(msg);
    }

    @Override
    public void delete(String uuid) throws Exception {
        msgDao.delete(uuid);
    }
}
