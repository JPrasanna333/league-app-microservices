package com.leaguegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class LeagueappGatewayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeagueappGatewayApiApplication.class, args);
	}
	
	// this method is to build routes
	// using the RouteLocatorBuilder build the routes

	//	@Bean
//	public RouteLocator customRoutes(RouteLocatorBuilder builder) {
//		return builder.routes().build();
//		
//		return builder.routes()
//			    // create individual routes with path,filters, uri(in proper sequence)
//				// lb is loadbalancer, pass the loadbalanced application name in the uri 
//				 
//				// route for mobile microservice
//				.route("mobileAPI",r->
//				   r.path("/mobile-service/**")
//				    .uri("lb://MOBILE-SERVICE"))
//				   
//				   // route for cart microservice
//				    .route("cartAPI",r->
//				      r.path("/cart-service/**")
//				       .filters(f->f.addRequestHeader("desc", "Items added to cart")
//				    		       .addResponseHeader("result","Showing Cart Details"))
//				       .uri("lb://CART-SERVICE"))
//				    
//				    // route for order microservice
//				    .route("orderAPI",r->
//				    r.path("/order-service/**")
//				    .filters(f->f.addRequestHeader("desc", "Show Order Details")
//				    		     .addRequestHeader("payment", "UPI payment")
//			    		       .addResponseHeader("result","Sending Order Details"))
//				    .uri("lb://ORDER-SERVICE"))
//					.build();	 
//					
//		
//	}

}


