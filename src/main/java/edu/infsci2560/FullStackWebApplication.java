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
		DocumentCategory r;
		DocumentCategory s;
		DocumentCategory t;
		Community a;
		Community b;
		Community c;
		Community d;
		Community e;
		Community f;
		Product m;
		Product n;
		Product o;
		Product p;
		Product q;
		Product u;
		Department h;
		Department i;
		Department j;

		DocumentCategoryRepository dcRepo = ctx.getBean(DocumentCategoryRepository.class);
		dcRepo.save(x = new DocumentCategory(1L, "Best Practice"));
		dcRepo.save(y = new DocumentCategory(2L, "Standard"));
		dcRepo.save(z = new DocumentCategory(3L, "Requirements"));
		dcRepo.save(r = new DocumentCategory(4L, "Lessons Learned"));
		dcRepo.save(s = new DocumentCategory(5L, "User Manual"));
		dcRepo.save(t = new DocumentCategory(6L, "Specs"));

		CommunityRepository cmRepo = ctx.getBean(CommunityRepository.class);
		cmRepo.save(a = new Community(1L, "Developers"));
		cmRepo.save(b = new Community(2L, "Mechanical Engineers"));
		cmRepo.save(c = new Community(3L, "Electrical Engineers"));
		cmRepo.save(d = new Community(4L, "IT"));
		cmRepo.save(e = new Community(5L, "Chemical Engineers"));
		cmRepo.save(f = new Community(6L, "Modelers"));

		ProductRepository pdRepo = ctx.getBean(ProductRepository.class);
		pdRepo.save(m = new Product(1L, "Product A"));
		pdRepo.save(n = new Product(2L, "Product B"));
		pdRepo.save(o = new Product(3L, "Product C"));
		pdRepo.save(p = new Product(4L, "Product D"));
		pdRepo.save(q = new Product(5L, "Product E"));
		pdRepo.save(u = new Product(6L, "Product F"));

		DepartmentRepository dpRepo = ctx.getBean(DepartmentRepository.class);
		dpRepo.save(h = new Department(1L, "Simulation"));
		dpRepo.save(i = new Department(2L, "IT & Software Development"));
		dpRepo.save(j = new Department(3L, "Engineering"));

		KMCatalogEntryRepository kmRepo = ctx.getBean(KMCatalogEntryRepository.class);
		kmRepo.save(new KMCatalogEntry(1L, "C# Coding Standards", "John Doe", i.getDepartmentName(), y.getCategoryName(), a.getCommunityName(), m.getProductName(), "csharpstandard.pdf"));
        kmRepo.save(new KMCatalogEntry(2L, "Contaminated Sample Procedure", "Jane Smith", j.getDepartmentName(), y.getCategoryName(), b.getCommunityName(), n.getProductName(), "contaminated_sample_procedure.pdf"));
        kmRepo.save(new KMCatalogEntry(3L, "Communications Wiring Diagram for Product X", "Jimmy Jones",j.getDepartmentName(), z.getCategoryName(), c.getCommunityName(), o.getProductName(), "x_comms_wiring_diagram.pdf"));

		kmRepo.save(new KMCatalogEntry(1L, "HTML Coding Standards", "John Doe", i.getDepartmentName(), y.getCategoryName(), d.getCommunityName(), q.getProductName(), "htmlstandard.pdf"));
        kmRepo.save(new KMCatalogEntry(2L, "Electrial Specs", "Julia Newton", j.getDepartmentName(), t.getCategoryName(), c.getCommunityName(), q.getProductName(), "electricalspecs.pdf"));
        kmRepo.save(new KMCatalogEntry(3L, "Audit Results 2015", "Caitlin Walker", j.getDepartmentName(), r.getCategoryName(), e.getCommunityName(), u.getProductName(), "auditresults2015.pdf"));

		kmRepo.save(new KMCatalogEntry(1L, "Configuring a Build", "Jason Lloyd", i.getDepartmentName(), r.getCategoryName(), a.getCommunityName(), p.getProductName(), "build_config.pdf"));
        kmRepo.save(new KMCatalogEntry(2L, "Document Requirements", "Henry Wagner", j.getDepartmentName(), z.getCategoryName(), b.getCommunityName(), o.getProductName(), "document_req.pdf"));
        kmRepo.save(new KMCatalogEntry(3L, "Noble Gases", "Natalee Harrell", j.getDepartmentName(), y.getCategoryName(), e.getCommunityName(), u.getProductName(), "noblegases.pdf"));

		kmRepo.save(new KMCatalogEntry(1L, "Product C User Manual", "Aiden Key", i.getDepartmentName(), s.getCategoryName(), d.getCommunityName(), u.getProductName(), "prodc_usermanual.pdf"));
        kmRepo.save(new KMCatalogEntry(2L, "Safety Practices", "Peyton Watts", j.getDepartmentName(), x.getCategoryName(), e.getCommunityName(), n.getProductName(), "safety.pdf"));
        kmRepo.save(new KMCatalogEntry(3L, "Strength of Materials", "Troy Glover", j.getDepartmentName(), t.getCategoryName(), b.getCommunityName(), q.getProductName(), "materials.pdf"));

		kmRepo.save(new KMCatalogEntry(1L, "Naming Conventions", "Rex Hardy", i.getDepartmentName(), y.getCategoryName(), a.getCommunityName(), m.getProductName(), "naming.pdf"));
        kmRepo.save(new KMCatalogEntry(2L, "Measuring Forces", "Nyla Potter", j.getDepartmentName(), s.getCategoryName(), b.getCommunityName(), u.getProductName(), "forces.pdf"));
        kmRepo.save(new KMCatalogEntry(3L, "Capacitors", "Levi Caldwell", j.getDepartmentName(), t.getCategoryName(), c.getCommunityName(), o.getProductName(), "capacitors.pdf"));

		kmRepo.save(new KMCatalogEntry(1L, "Firewall Configuration", "Claire Smith", i.getDepartmentName(), s.getCategoryName(), d.getCommunityName(), m.getProductName(), "firewall_config.pdf"));
        kmRepo.save(new KMCatalogEntry(2L, "pH Monitoring", "Jason Lloyd", j.getDepartmentName(), x.getCategoryName(), e.getCommunityName(), n.getProductName(), "contaminated_sample_procedure.pdf"));
        kmRepo.save(new KMCatalogEntry(3L, "Airflow Simulation", "Henry Wagner", h.getDepartmentName(), z.getCategoryName(), f.getCommunityName(), o.getProductName(), "airflow_sim.pdf"));

		kmRepo.save(new KMCatalogEntry(1L, "TFS", "Aiden Key", i.getDepartmentName(), s.getCategoryName(), a.getCommunityName(), p.getProductName(), "tfs_usermanual.pdf"));
        kmRepo.save(new KMCatalogEntry(2L, "Engine Simulation", "Jane Smith", h.getDepartmentName(), y.getCategoryName(), f.getCommunityName(), q.getProductName(), "engine_sim.pdf"));
        kmRepo.save(new KMCatalogEntry(3L, "Resistor Color Codes", "Nyla Potter", j.getDepartmentName(), t.getCategoryName(), c.getCommunityName(), u.getProductName(), "resistor_color_codes.pdf"));
		
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
