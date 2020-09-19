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
import com.mycompany.dao.inter.UserSkillDaoInter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class UserSkillDaoImpl extends AbstractDAO implements UserSkillDaoInter{
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
   

    
    
    private UserSkill getUserSkill(ResultSet rs)throws Exception{
  
    int userId =rs.getInt("id");
    int skillId=rs.getInt("skill_id");
    
    String skillName =rs.getString("skill_name");
    int power=rs.getInt("power");
  
    return new UserSkill(null,new User(userId),new Skill(skillId,skillName),power);
}
    
    @Override
    public List<UserSkill> getAllSkillByUserId(int userId) {
        
         List<UserSkill> result=new ArrayList<>();
        try(Connection c =connect()) {
            
  PreparedStatement stmt=c.prepareStatement("SELECT"
             + " u.*, "
          + "us.skill_id, "
          + "s.name as skill_name, "
          + "us.power "
          + " FROM "
          + " user_skill us " 
          +"left join user u  on us.user_id=u.id " 
          +"left join skill s on us.skill_id=s.id " 
          +"where "
          + " us.user_id=?;");
            stmt.setInt(1, userId);
            stmt.execute();
            ResultSet rs= stmt.getResultSet();
            while(rs.next()){
          UserSkill u=getUserSkill(rs);
            result.add(u);
            }
                 
           
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
     }
    
       
    
    
    
    }
    
  
    
   

