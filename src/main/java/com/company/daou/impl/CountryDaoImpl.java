/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.daou.impl;

import com.mycompany.dao.inter.AbstractDAO;
import com.mycompany.dao.inter.CountryDaoInter;
import com.mycompany.entity.Country;
import java.util.List;

/**
 *
 * @author User
 */
public class CountryDaoImpl extends AbstractDAO implements CountryDaoInter{

    @Override
    public List<Country> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
