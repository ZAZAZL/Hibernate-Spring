package com.zzl.test;
 
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zzl.dao.CategoryDAO;
import com.zzl.pojo.Category;

 
 
public class TestSpring {
 
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        CategoryDAO dao = (CategoryDAO) context.getBean("dao");
        
        //增加
        //dao.save(c);
        List<Category> cs= dao.find("from Category");
        for(int i=0;i<cs.size();i++)
        {
        	Category a=cs.get(i);
        	System.out.print(a.getId());
        	System.out.print(a.getName());
        }
        //获取
        //Category c2 = dao.get(Category.class, 1)
        /*//修改
        c2.setName("category zzz");
        dao.update(c2);
        
        //删除
        dao.delete(c2);*/
        
        

    }
}