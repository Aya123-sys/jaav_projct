/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_project;

/**
 *
 * @author TUF DASH
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
public class File_Reader {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static List<Company> readCompanies(String filePath) {
        List<Company> companies = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String headerLine = br.readLine(); // Skip the header line
            String line;

            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");

                // Remove surrounding quotes if present
                
                
                System.out.println(line);
                
                fields[5]= fields[5]+fields[6]+fields[7];
                System.out.println(fields[5]);
                
                
                for (int i = 0; i < 43; i++) {
                    System.out.println("Field " + i + ": " + fields[i]);
                }
                
                
                String id = fields[2].trim();
                String name = fields[1].trim();
                String category_list = fields[3].trim();
                String market= fields[4].trim();
                Double funding_total_usd= Double.parseDouble(fields[6]);
                String status = fields[8].trim();
                String country_code = fields[9].trim();
                String states_code =fields[10].trim();
                Double funding_rounds= Double.parseDouble(fields[13]);
                LocalDate founded_at = parseDate(fields[14].trim());
                Double SEED= Double.parseDouble(fields[20]);
                Double venture= Double.parseDouble(fields[21]);
                Double equity_crowdfunding= Double.parseDouble(fields[22]);
                Double undisclosed = Double.parseDouble(fields[23]);
                Double convertible_note = Double.parseDouble(fields[24]);
                Double debt_financing = Double.parseDouble(fields[25]);
                Double angel = Double.parseDouble(fields[26]);
                Double grant= Double.parseDouble(fields[27]);
                Double private_equity = Double.parseDouble(fields[28]);
                Double post_ipo_equity = Double.parseDouble(fields[29]);
                Double post_ipo_debt= Double.parseDouble(fields[30]);
                Double secondary_market= Double.parseDouble(fields[31]);
                Double product_crowdfunding= Double.parseDouble(fields[32]);
                Double Round_A= Double.parseDouble(fields[33]);
                Double Round_B= Double.parseDouble(fields[34]);
                Double Round_C= Double.parseDouble(fields[35]);
                Double Round_D= Double.parseDouble(fields[36]);
                Double Round_E= Double.parseDouble(fields[37]);
                Double Round_F= Double.parseDouble(fields[38]);
                Double Round_G= Double.parseDouble(fields[39]);
                Double Round_H= Double.parseDouble(fields[40]);
                LocalDate closed_at = parseDate(fields[41].trim());
                LocalDate acquired_at = parseDate(fields[42].trim());
                System.err.println(acquired_at);
                Company company = CompanyFactory.createCompany(id, name,category_list,market ,funding_total_usd,status,country_code,states_code,funding_rounds,founded_at, SEED,  venture,  equity_crowdfunding,  undisclosed, convertible_note,
                    debt_financing,  angel,  grant, private_equity,  post_ipo_equity,
                    post_ipo_debt,  secondary_market,  product_crowdfunding,  Round_A,
                    Round_B, Round_C, Round_D, Round_E,  Round_F, Round_G, Round_H,closed_at, acquired_at);
                companies.add(company);
            }
        } catch (IOException e) {
            System.err.println("Error reading the CSV file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error processing the CSV file: " + e.getMessage());
        }

        return companies;
    }
    private static LocalDate parseDate(String value) {
    
        if (value.isEmpty()) {
            return null; // Return null for empty dates
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(value.trim(), formatter);
    } 


}