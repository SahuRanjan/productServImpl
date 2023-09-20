package dev.ranjan.productservimpl;

//import dev.ranjan.productservimpl.inheritanceDemo.tableperclass.mentor;
//import dev.ranjan.productservimpl.inheritanceDemo.tableperclass.mentorRepository;
//import dev.ranjan.productservimpl.inheritanceDemo.tableperclass.user;
//import dev.ranjan.productservimpl.inheritanceDemo.tableperclass.userRepository;

import dev.ranjan.productservimpl.inheritanceDemo.joinedTable.mentorRepository;
import dev.ranjan.productservimpl.inheritanceDemo.joinedTable.userRepository;
import dev.ranjan.productservimpl.models.Category;
import dev.ranjan.productservimpl.models.Product;
import dev.ranjan.productservimpl.repository.categoryRepository;
import dev.ranjan.productservimpl.repository.productRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class ProductServImplApplication implements CommandLineRunner {
    private mentorRepository mentorRepository;
    private userRepository userRepository;
    private final dev.ranjan.productservimpl.repository.productRepository productRepository;
    private final dev.ranjan.productservimpl.repository.categoryRepository categoryRepository;

    public ProductServImplApplication(@Qualifier("jt_mr") mentorRepository mentorRepository,
                                      @Qualifier("jt_ur")userRepository userRepository,
                                      productRepository productRepository,
                                      categoryRepository categoryRepository) {
        this.mentorRepository = mentorRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProductServImplApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        mentor mentor = new mentor();
//        mentor.setName("Ranjan");
//        mentor.setEmail("ranjan@scaler.com");
//        mentor.setAvgRating(4.65);
//        mentorRepository.save(mentor);
//
//        user user = new user();
//        user.setName("rash");
//        user.setEmail("rashsahu@gmail.com");
//        userRepository.save(user);
//        List<user> users = userRepository.findAll();
//        for (user user1: users) {
//            System.out.println(user1);
//        }
        Category category = new Category();
        category.setName("Apple Devices");
        Category savedCategory = categoryRepository.save(category);

        Product product = new Product();
        product.setTitle("iPhone 15 Pro");
        product.setDescription("The best iPhone Ever");
        product.setCategory(savedCategory);

        productRepository.save(product);

        Category category1 = categoryRepository.findById(UUID.fromString("767a30b0-484d-4834-8b1c-8c0c47f903de")).get();
        System.out.println("Category name is: " + category1.getName());
        System.out.println("Printing all products in the category");
        Thread.sleep(1000);
    }
}