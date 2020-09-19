/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.daou.impl;

import com.mycompany.entity.Country;
import com.mycompany.entity.Skill;
import com.mycompany.entity.User;
import com.mycompany.entity.UserSkill;
import com.mycompany.dao.inter.AbstractDAO;
import com.mycompany.dao.inter.EmploymentHistoryDaoInter;
import com.mycompany.entity.EmploymentHistory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class EmploymentHistoryDaoImpl extends AbstractDAO implements EmploymentHistoryDaoInter{
private User getUser(ResultSet rs) throws Exception{

 int id=rs.getInt("id");
                String name=rs.getString("name");
                String surname=rs.getString("surname");
                String phone=rs.getString("phone");
                String email=rs.getString("email");
                 int nationalityId=rs.getInt("nationality_id");
                  int birthplaceId=rs.getInt("birthplace_id");
                  String nationalityStr=rs.getString("nationality");
                  String birthplaceStr=rs.getString("birthplace");
                  Date birthdate=rs.getDate("birthdate");
                 
                  Country nationality=new Country(nationalityId,null,nationalityStr);
                 Country birthplace=new Country(birthplaceId,birthplaceStr,null);
            return new User(id,name,surname,phone,email,birthdate,nationality,birthplace);

}
   

    
    
    private EmploymentHistory getEmploymentHistory(ResultSet rs)throws Exception{
 String header=rs.getString("header");
 String jobDescription=rs.getString("job_description");
 Date beginDate=rs.getDate("begin_date");
 Date endDate=rs.getDate("end_date");
 int userId=rs.getInt("user_id");
        EmploymentHistory emp=new EmploymentHistory(null,header,beginDate,endDate,jobDescription,new User(userId));
return emp;
    }
    
    @Override
    public List<EmploymentHistory> getAllEmploymentHistoryByUserId(int userId) {
        
         List<EmploymentHistory> result=new ArrayList<>();
        try(Connection c =connect()) {
            
  PreparedStatement stmt=c.prepareStatement("select *from employment_history where user_id=?");
            stmt.setInt(1, userId);
            stmt.execute();
            ResultSet rs= stmt.getResultSet();
            while(rs.next()){
         EmploymentHistory emp=getEmploymentHistory(rs);
            result.add(emp);
            }
                 
           
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
     }
    
       
    
    
    
    }
    
  
    
   

