package de.woock.ddd.stattauto.gui.betrieb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.config.EnableAdminServer;

@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
public class DddStattAuto_Admin_Betrieb {

	public static void main(String[] args) {
		SpringApplication.run(DddStattAuto_Admin_Betrieb.class, args);
	}
}
