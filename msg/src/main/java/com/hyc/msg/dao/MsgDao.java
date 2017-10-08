package com.hyc.msg.dao;

import com.hyc.msg.eitity.Msg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MsgDao extends JpaRepository<Msg,String>{
}
