/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main;

import com.company.daou.impl.EmploymentHistoryDaoImpl;
import com.company.daou.impl.UserDaoImpl;
import com.company.daou.impl.UserSkillDaoImpl;
import com.mycompany.dao.inter.EmploymentHistoryDaoInter;
import com.mycompany.dao.inter.UserDaoInter;
import com.mycompany.dao.inter.UserSkillDaoInter;

/**
 *
 * @author User
 */
public class Context {
    public static UserDaoInter instanceUserDao(){
    
    return new UserDaoImpl();
    } 
     public static UserSkillDaoInter instanceUserSkillDao(){
    
    return new UserSkillDaoImpl();
    } 
       public static EmploymentHistoryDaoInter instanceEmploymentHistoryDao(){
    
    return new EmploymentHistoryDaoImpl();
    }
}
