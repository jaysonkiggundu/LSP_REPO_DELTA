package org.howard.edu.lsp.assignment2;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ProductETL {
    private static final String INPUT_FILE = "data/products.csv";
    private static final String OUTPUT_FILE = "data/transformed_products.csv";

    public void processProducts() {
        try {
            List<Product> products = extractProducts();
            List<Product> transformedProducts = transformProducts(products);
            loadProducts(transformedProducts);
            System.out.println("ETL process completed successfully!");
        } catch (IOException e) {
            System.err.println("Error processing products: " + e.getMessage());
        }
    }

    private List<Product> extractProducts() throws IOException {
        List<Product> products = new ArrayList<>();
        Path filePath = Paths.get(INPUT_FILE);
        
        if (!Files.exists(filePath)) {
            throw new FileNotFoundException("Input file not found: " + INPUT_FILE);
        }

        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            
            reader.readLine();
            
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {  
                    try {
                        products.add(new Product(
                            Integer.parseInt(parts[0].trim()),
                            parts[1].trim(),
                            Double.parseDouble(parts[2].trim()),
                            parts[3].trim()
                        ));
                    } catch (NumberFormatException e) {
                        System.err.println("Error parsing line: " + line);
                        throw e;
                    }
                }
            }
        }
        return products;
    }

    private List<Product> transformProducts(List<Product> products) {
        for (Product product : products) {
            
            product.setName(product.getName().toUpperCase());
            
            
            if (product.getCategory().equals("Electronics")) {
                if (product.getPrice() > 500) {
                    product.setCategory("Premium Electronics");
                } else {
                    
                    double discountedPrice = Math.round(product.getPrice() * 0.9 * 100.0) / 100.0;
                    product.setPrice(discountedPrice);
                }
            }
        }
        return products;
    }

    private void loadProducts(List<Product> products) throws IOException {
        Path outputPath = Paths.get(OUTPUT_FILE);
        
        try (BufferedWriter writer = Files.newBufferedWriter(outputPath)) {
            
            writer.write("ProductID,Name,Price,Category,PriceRange\n");
            
            
            for (Product product : products) {
                writer.write(String.format("%d,%s,%.2f,%s,%s\n",
                    product.getProductId(),
                    product.getName(),
                    product.getPrice(),
                    product.getCategory(),
                    product.getPriceRange()
                ));
            }
        }
    }

    public static void main(String[] args) {
        ProductETL etl = new ProductETL();
        etl.processProducts();
    }
}