package edu.infsci2560;

import edu.infsci2560.models.KMCatalogEntry;
import edu.infsci2560.models.DocumentCategory;
//import edu.infsci2560.models.KMCatalogEntry.DocumentCategory;
import edu.infsci2560.models.KMCatalogEntry.Community;
import edu.infsci2560.repositories.KMCatalogEntryRepository;
import edu.infsci2560.repositories.DocumentCategoryRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FullStackWebApplication {

    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);

    public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);
		
		KMCatalogEntryRepository repository = ctx.getBean(KMCatalogEntryRepository.class);
        //repository.save(new KMCatalogEntry(1L, "C# Coding Standards", "John Doe", "UnitA", DocumentCategory.Standard, Community.Developers, "csharpstandard.pdf"));
        //repository.save(new KMCatalogEntry(2L, "Contaminated Sample Procedure", "Jane Smith", "UnitC", DocumentCategory.Procedure, Community.Chemical_Engineers, "contaminated_sample_procedure.pdf"));
        //repository.save(new KMCatalogEntry(3L, "Communications Wiring Diagram for Product X", "Jimmy Jones", "UnitB", DocumentCategory.Design, Community.Electrical_Engineers, "x_comms_wiring_diagram.pdf"));
		DocumentCategory x = new DocumentCategory(1L, "Best Practice");
		DocumentCategory y = new DocumentCategory(2L, "Standard");
		DocumentCategory z = new DocumentCategory(3L, "Requirements");
		repository.save(new KMCatalogEntry(1L, "C# Coding Standards", "John Doe", "UnitA", x.getCategoryName(), Community.Developers, "csharpstandard.pdf"));
        repository.save(new KMCatalogEntry(2L, "Contaminated Sample Procedure", "Jane Smith", "UnitC", y.getCategoryName(), Community.Chemical_Engineers, "contaminated_sample_procedure.pdf"));
        repository.save(new KMCatalogEntry(3L, "Communications Wiring Diagram for Product X", "Jimmy Jones", "UnitB", z.getCategoryName(), Community.Electrical_Engineers, "x_comms_wiring_diagram.pdf"));

		DocumentCategoryRepository dcRepo = ctx.getBean(DocumentCategoryRepository.class);
		//dcRepo.save(new DocumentCategory(1L, "Best Practice"));
		//dcRepo.save(new DocumentCategory(2L, "Standard"));
		//dcRepo.save(new DocumentCategory(3L, "Requirements"));
		dcRepo.save(x);
		dcRepo.save(y);
		dcRepo.save(z);
	}

//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//    }
//    @Bean
//    public CommandLineRunner databaseDemo(CustomerRepository repository) {
//        return (args) -> {
//            // save a couple of customers
//            repository.save(new Customer("Jack", "Bauer"));
//            repository.save(new Customer("Chloe", "O'Brian"));
//           repository.save(new Customer("Kim", "Bauer"));
//            repository.save(new Customer("David", "Palmer"));
//            repository.save(new Customer("Michelle", "Dessler"));
//            repository.save(new Customer("Billy", "Bean"));
//
//            // fetch all customers
//            log.info("[Database Demo] Customers found with findAll():");
//            log.info("[Database Demo] -------------------------------");
//           for (Customer customer : repository.findAll()) {
 //               log.info("[Database Demo] " + customer.toString());
//            }
//            log.info("");
//
//            // fetch an individual customer by ID
//            Customer customer = repository.findOne(1L);
//            log.info("[Database Demo] Customer found with findOne(1L):");
//            log.info("[Database Demo] --------------------------------");
//            log.info("[Database Demo] " + customer.toString());            
//
//            // fetch customers by last name
//            log.info("[Database Demo] Customer found with findByLastName('Bauer'):");
//            log.info("[Database Demo] --------------------------------------------");
//            for (Customer bauer : repository.findByLastName("Bauer")) {
//                log.info("[Database Demo] " + bauer.toString());
//            }            
//        };
//    }
}
