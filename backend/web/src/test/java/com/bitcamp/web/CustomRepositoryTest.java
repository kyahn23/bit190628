package com.bitcamp.web;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.entities.Customer;
import com.bitcamp.web.repositories.CustomerRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * CustomRepositoryTest
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomRepositoryTest {

    @Autowired
    CustomerRepository repo;
    @Autowired 
    CustomerDTO customerDTO;
    @Autowired
    Customer customer;

    @Test
    public void countTest() throws Exception {
        System.out.println("====테스트====");
        Long count = repo.count();
        assertThat(Integer.parseInt(count+""), equalTo(31));
        // assertThat(Integer.parseInt(count + ""), equalTo(31));
    }

   
}