package com.nec.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestClient {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("springconfig.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee emp = (Employee) factory.getBean("emp");
		System.out.println(emp);
		emp.setEmpId(123);
		System.out.println(emp.getEmpId());
	}
}
