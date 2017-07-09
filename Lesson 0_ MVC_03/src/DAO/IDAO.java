/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;

/**
 *
 * @author Zhang
 */
public interface IDAO<T> {

    ArrayList<T> getAll();

    ArrayList<T> findByID(int ID);

    ArrayList<T> findByName(String name);

    boolean insert(T t);

    boolean update(T t);

    boolean deleteByID(int ID);

    boolean deleteAll();

}
