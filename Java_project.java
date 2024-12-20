/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_project;

import java.util.List;

/**
 *
 * @author TUF DASH
 */
public class Java_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String filePath = "C:\\Users\\TUF DASH\\Documents\\modified_dataset.csv";
         List<Company> companies = File_Reader.readCompanies(filePath);
        // TODO code application logic here
        for (Company company : companies) {
            company.getStatus();
        }
    }
 }
    

