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



public abstract class Company {
    protected String id;
    protected final String entity_type="comapny";
    protected String name;
    protected String category_list;
    protected String market;
    protected Double funding_total_usd;
    protected String country_code;
    protected String states_code;
    protected Double funding_rounds;
    protected LocalDate founded_at;
    protected double SEED;
    protected double venture;
    protected double equity_crowdfunding;
    protected double undisclosed;
    protected double convertible_note;
    protected double debt_financing ;
    protected double angel ;
    protected double grant ;
    protected double private_equity ;
    protected double post_ipo_equity;
    protected double post_ipo_debt;
    protected double secondary_market;
    protected double product_crowdfunding;
    protected double Round_A;
    protected double Round_B;
    protected double Round_C;
    protected double Round_D;
    protected double Round_E;
    protected double Round_F;
    protected double Round_G;
    protected double Round_H;

    // Constructor
    public Company(String id, String name, String category_list, String market, Double funding_total_usd,
                   String country_code, String states_code, Double funding_rounds, LocalDate founded_at,
                   double SEED, double venture, double equity_crowdfunding, double undisclosed, double convertible_note,
                   double debt_financing, double angel, double grant, double private_equity, double post_ipo_equity,
                   double post_ipo_debt, double secondary_market, double product_crowdfunding, double Round_A,
                   double Round_B, double Round_C, double Round_D, double Round_E, double Round_F, double Round_G,
                   double Round_H) {

        // Initialize fields with the constructor parameters
        this.id = id;
        this.name = name;
        this.category_list = category_list;
        this.market = market;
        this.funding_total_usd = funding_total_usd;
        this.country_code = country_code;
        this.states_code = states_code;
        this.funding_rounds = funding_rounds;
        this.founded_at = founded_at;
        this.SEED = SEED;
        this.venture = venture;
        this.equity_crowdfunding = equity_crowdfunding;
        this.undisclosed = undisclosed;
        this.convertible_note = convertible_note;
        this.debt_financing = debt_financing;
        this.angel = angel;
        this.grant = grant;
        this.private_equity = private_equity;
        this.post_ipo_equity = post_ipo_equity;
        this.post_ipo_debt = post_ipo_debt;
        this.secondary_market = secondary_market;
        this.product_crowdfunding = product_crowdfunding;
        this.Round_A = Round_A;
        this.Round_B = Round_B;
        this.Round_C = Round_C;
        this.Round_D = Round_D;
        this.Round_E = Round_E;
        this.Round_F = Round_F;
        this.Round_G = Round_G;
        this.Round_H = Round_H;
    }

    
    
    // Common Methods
    public abstract void getStatus();
    public abstract int working_period();
}

    

