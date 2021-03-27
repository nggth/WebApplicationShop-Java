/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ntn.repository;

import com.ntn.pojo.Category;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface CategoryRepository {
    List<Category> getCategories();
}
