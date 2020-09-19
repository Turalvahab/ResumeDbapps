/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main;

import com.mycompany.dao.inter.EmploymentHistoryDaoInter;

/**
 *
 * @author User
 */
public class Main {
   
    public static void main(String[] args)throws Exception {
        EmploymentHistoryDaoInter dao=Context.instanceEmploymentHistoryDao();
       
        System.out.println(dao.getAllEmploymentHistoryByUserId(5));
        
        
        
    }
    
}
