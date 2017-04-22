package edu.infsci2560;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/kmcatalogentries").setViewName("kmcatalogentries");
		registry.addViewController("/documentcategories").setViewName("documentcategories");
		registry.addViewController("/products").setViewName("products");
		registry.addViewController("/communities").setViewName("communities");
		registry.addViewController("/departments").setViewName("departments");
		registry.addViewController("/d3tree").setViewName("d3tree");
		registry.addViewController("/searchcatalog").setViewName("searchcatalog");
        registry.addViewController("/login").setViewName("login");
		registry.addViewController("/files").setViewName("files");
    }

}