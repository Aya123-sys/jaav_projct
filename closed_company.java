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
import java.time.temporal.ChronoUnit;
public class closed_company extends Company{
    private LocalDate closed_at;
    private static final String statut = "closed";

    public closed_company(String id, String name, String category_list, String market, Double funding_total_usd,
                           String country_code, String states_code, Double funding_rounds, LocalDate founded_at,
                           double SEED, double venture, double equity_crowdfunding, double undisclosed, double convertible_note,
                           double debt_financing, double angel, double grant, double private_equity, double post_ipo_equity,
                           double post_ipo_debt, double secondary_market, double product_crowdfunding, double Round_A,
                           double Round_B, double Round_C, double Round_D, double Round_E, double Round_F, double Round_G,
                           double Round_H,LocalDate closed_at) {

        // Call the constructor of the superclass (Company)
        super(id, name, category_list, market, funding_total_usd, country_code, states_code, funding_rounds, founded_at,
              SEED, venture, equity_crowdfunding, undisclosed, convertible_note, debt_financing, angel, grant, private_equity,
              post_ipo_equity, post_ipo_debt, secondary_market, product_crowdfunding, Round_A, Round_B, Round_C, Round_D,
              Round_E, Round_F, Round_G, Round_H);
        this.closed_at = closed_at; 
    }

    // Override displayStatus to show status specific to operating companies
    @Override
    public void getStatus() {
        System.out.println("closing Company: " + statut);
        
    }
    @Override
    public  int working_period(){
        return (int) ChronoUnit.YEARS.between(founded_at, closed_at);
        
    }
    
}