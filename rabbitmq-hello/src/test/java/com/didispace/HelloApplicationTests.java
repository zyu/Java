package com.didispace;

import com.didispace.rabbit.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.boot.test.context.SpringBootTest;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HelloApplication.class)
public class HelloApplicationTests {

	@Autowired
	private Sender sender;

	@Test
	public void hello() throws Exception {
		sender.send();
	}

}
