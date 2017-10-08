package com.hyc.msg.controller;

import com.hyc.msg.Response.Response;
import com.hyc.msg.eitity.Msg;
import com.hyc.msg.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/admin/msg")
public class MsgController {

    @Autowired
    private MsgService msgService;

    @RequestMapping(value = "/findAll")
    public Response findAll() throws Exception{
      List<Msg> msgs =  msgService.findAll();
      return Response.ok("msgs",msgs);
    }

    @RequestMapping(value = "/save")
    public Response save( Msg msg) throws Exception{
        Msg saveMsg =  msgService.save(msg);
        return Response.ok("saveMsg",saveMsg);
    }
}
