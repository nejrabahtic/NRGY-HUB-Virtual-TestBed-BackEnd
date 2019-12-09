package com.example.nrgy;

import com.example.nrgy.Collections.UserCollection;
import com.example.nrgy.Controllers.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;

@SpringBootApplication
public class NrgyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NrgyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

	@Bean
	public Jackson2RepositoryPopulatorFactoryBean repositoryPopulatorFactoryBean(UserController userController){
		userController.deleteAllUsers();

		Jackson2RepositoryPopulatorFactoryBean factoryBean = new Jackson2RepositoryPopulatorFactoryBean();
		factoryBean.setResources(new Resource[] { new ClassPathResource("users.json")});
		return factoryBean;
	}

	@Bean
	public Jackson2RepositoryPopulatorFactoryBean repositoryPopulatorFactoryBean(/*NRGYController NRGYController*/){
		//NRGYController.deleteAllNRGYData();

		Jackson2RepositoryPopulatorFactoryBean factoryBean = new Jackson2RepositoryPopulatorFactoryBean();
		factoryBean.setResources(new Resource[] { new ClassPathResource("nrgyData.json")});
		return factoryBean;
	}
}

