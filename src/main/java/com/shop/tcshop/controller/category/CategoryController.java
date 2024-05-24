package com.shop.tcshop.controller.category;

import com.shop.tcshop.models.category.Category;
import com.shop.tcshop.models.category.SubCategory;
import com.shop.tcshop.params.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author honggang.liu
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @GetMapping("/categories")
    public Result<List<Category>> getOrderList(@RequestParam(required = false) Integer level) {
        System.out.println("getOrderList");
        List<Category> categoryList = new ArrayList<>();


        Category category = new Category();
        category.setId(1L);
        category.setName("category1");
        category.setPicUrl("abcd");

        List<SubCategory> subCategoryList1=new ArrayList<>();
        SubCategory subCategory1=new SubCategory();
        subCategory1.setIconUrl("");
        subCategory1.setName("subCategory11");
        subCategoryList1.add(subCategory1);

        SubCategory subCategory2=new SubCategory();
        subCategory2.setIconUrl("");
        subCategory2.setName("subCategory2");
        subCategoryList1.add(subCategory2);
        category.setSubCategoryList(subCategoryList1);
        categoryList.add(category);


        Category category2 = new Category();
        category2.setId(2L);
        category.setName("category2");
        category.setPicUrl("abcd2");

        List<SubCategory> subCategoryList2=new ArrayList<>();
        SubCategory subCategory21=new SubCategory();
        subCategory21.setIconUrl("");
        subCategory21.setName("subCategory21");
        subCategoryList2.add(subCategory21);

        SubCategory subCategory22=new SubCategory();
        subCategory22.setIconUrl("");
        subCategory22.setName("subCategory22");
        subCategoryList2.add(subCategory22);
        category2.setSubCategoryList(subCategoryList2);
        categoryList.add(category2);

        return Result.ofSuccess(categoryList);
    }
}
