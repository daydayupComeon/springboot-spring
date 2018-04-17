package com.song.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static org.junit.Assert.assertEquals;


public class BeanFactoryTest {

    @Test
    public void testSimpleLoad() {

        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
        assertEquals("", bean.getTestStr());
        //System.out.println("testBean" + bean.getTestStr());
    }
}