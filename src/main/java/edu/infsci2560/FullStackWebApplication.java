package edu.infsci2560;

import edu.infsci2560.models.KMCatalogEntry;
import edu.infsci2560.models.DocumentCategory;
import edu.infsci2560.models.Community;
import edu.infsci2560.models.Product;
import edu.infsci2560.models.Department;
import edu.infsci2560.repositories.KMCatalogEntryRepository;
import edu.infsci2560.repositories.DocumentCategoryRepository;
import edu.infsci2560.repositories.CommunityRepository;
import edu.infsci2560.repositories.ProductRepository;
import edu.infsci2560.repositories.DepartmentRepository;

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
		DocumentCategory x;
		DocumentCategory y;
		DocumentCategory z;
		Community a;
		Community b;
		Community c;
		Product m;
		Product n;
		Product o;
		Department h;
		Department i;
		Department j;

		DocumentCategoryRepository dcRepo = ctx.getBean(DocumentCategoryRepository.class);
		dcRepo.save(x = new DocumentCategory(1L, "Best Practice"));
		dcRepo.save(y = new DocumentCategory(2L, "Standard"));
		dcRepo.save(z = new DocumentCategory(3L, "Requirements"));

		CommunityRepository cmRepo = ctx.getBean(CommunityRepository.class);
		cmRepo.save(a = new Community(1L, "Developers"));
		cmRepo.save(b = new Community(2L, "Mechanical Engineers"));
		cmRepo.save(c = new Community(3L, "Electrical Engineers"));

		ProductRepository pdRepo = ctx.getBean(ProductRepository.class);
		pdRepo.save(m = new Product(1L, "Product A"));
		pdRepo.save(n = new Product(2L, "Product B"));
		pdRepo.save(o = new Product(3L, "Product C"));

		DepartmentRepository dpRepo = ctx.getBean(DepartmentRepository.class);
		dpRepo.save(h = new Department(1L, "Finance"));
		dpRepo.save(i = new Department(2L, "IT"));
		dpRepo.save(j = new Department(3L, "Engineering"));

		KMCatalogEntryRepository kmRepo = ctx.getBean(KMCatalogEntryRepository.class);
		kmRepo.save(new KMCatalogEntry(1L, "C# Coding Standards", "John Doe", "UnitA", x.getCategoryName(), a.getCommunityName(), m.getProductName(), "csharpstandard.pdf"));
        kmRepo.save(new KMCatalogEntry(2L, "Contaminated Sample Procedure", "Jane Smith", "UnitC", y.getCategoryName(), b.getCommunityName(), n.getProductName(), "contaminated_sample_procedure.pdf"));
        kmRepo.save(new KMCatalogEntry(3L, "Communications Wiring Diagram for Product X", "Jimmy Jones", "UnitB", z.getCategoryName(), c.getCommunityName(), o.getProductName(), "x_comms_wiring_diagram.pdf"));
		
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
