/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_project;

/**
 *
 * @author TUF DASH
 */
import java.time.LocalDate;
public class CompanyFactory {
    public static Company createCompany(String id, String name, String category_list, String market, Double funding_total_usd,
                   String status,String country_code, String states_code, Double funding_rounds, LocalDate founded_at,
                   double SEED, double venture, double equity_crowdfunding, double undisclosed, double convertible_note,
                   double debt_financing, double angel, double grant, double private_equity, double post_ipo_equity,
                   double post_ipo_debt, double secondary_market, double product_crowdfunding, double Round_A,
                   double Round_B, double Round_C, double Round_D, double Round_E, double Round_F, double Round_G,double Round_H,LocalDate closed_at,LocalDate acquired_at){
        switch (status.toLowerCase()) {
            case "operating":
                
                return new operating_company(id, name,category_list,market ,funding_total_usd,country_code,states_code,funding_rounds,founded_at, SEED,  venture,  equity_crowdfunding,  undisclosed, convertible_note,
                    debt_financing,  angel,  grant, private_equity,  post_ipo_equity,
                   post_ipo_debt,  secondary_market,  product_crowdfunding,  Round_A,
                    Round_B, Round_C, Round_D, Round_E,  Round_F, Round_G, Round_H);
            case "closed":
                return new closed_company(id, name, category_list, market, funding_total_usd, country_code, states_code, funding_rounds, founded_at, 
                       SEED, 
                       venture, 
                       equity_crowdfunding, 
                       undisclosed, 
                       convertible_note,debt_financing,angel, grant, private_equity, post_ipo_equity, post_ipo_debt, secondary_market, product_crowdfunding, Round_A, Round_B, Round_C, Round_D,Round_E, Round_F, Round_G, Round_H, closed_at);
            case "acquired":
                return new acquired_company(id, name, category_list, market, funding_total_usd, country_code, states_code, funding_rounds, founded_at,SEED, 
                       venture, 
                       equity_crowdfunding, 
                       undisclosed, 
                       convertible_note,debt_financing,angel, grant, private_equity, post_ipo_equity, post_ipo_debt, secondary_market, product_crowdfunding, Round_A, Round_B, Round_C, Round_D,Round_E, Round_F, Round_G, Round_H, acquired_at);
            default:
                throw new IllegalArgumentException("Unknown status: " + status);
        }
    }
}