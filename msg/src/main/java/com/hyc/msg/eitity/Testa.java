package com.hyc.msg.eitity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "testa")
@Data
public class Testa {

    @Id
    @Column(name = "UUID" , nullable = false)
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    private String uuid ;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "NAME" , nullable = false )
    private String name ;

//    @Column(name = "code" , nullable = false,columnDefinition="varchar(255)")
//    @Column(name = "code")
//    @ElementCollection(targetClass = String.class)
//    private ArrayList<String> code ;

    @Column(name = "nicknames")
    @ElementCollection
    private List<String> code  = new ArrayList<String>();


    @Column(name = "nicknames")
    @ElementCollection
    protected Set<String> nickNames = new HashSet();

//    public String getCode() {
//        StringBuffer sb = new StringBuffer();
//        for(int i=0;i<code.size();i++){
//            if(i == code.size()-1){
//                sb.append(code.get(i));
//            }else{
//                sb.append(code.get(i)+",");
//            }
//        }
//        return sb.toString();
//    }

//    public void setCode(String str) {
//        String[] st = str.split(",");
//        ArrayList<String> list = new ArrayList<>();
//        for(String aa : st){
//            list.add(aa);
//        }
//        this.code = list;
//    }


//    public void setCode(ArrayList<String> code) {
//        this.code = code;
//    }

}
