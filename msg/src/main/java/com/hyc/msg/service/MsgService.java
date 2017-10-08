package com.hyc.msg.service;

import com.hyc.msg.eitity.Msg;

import java.util.List;

public interface MsgService {

    List<Msg> findAll() throws Exception;

    Msg save(Msg msg) throws Exception;

    void delete(String uuid) throws Exception;
}
