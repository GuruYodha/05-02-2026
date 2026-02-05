package Policies;

//As a Java developer for an insurance company that offers multiple types of insurance policies 
//such as Health Insurance, Life Insurance, and Vehicle Insurance.
//Each insurance policy follows different business rules for calculating the annual premium.
//The company wants a flexible and scalable design so that new insurance policy types 
//can be added in the future without modifying existing code.
//To achieve this, you are required to design the system using the Interface concept in Java.
//Business Rules:
//==============
//Health Insurance Policy
//Inputs
//    Policy Holder Name
//    Age (in years)
//    Base Premium Amount
//Premium Calculation Rules
//    If the policy holder’s age is greater than 45 years:
//    Add 20% surcharge to the base premium
//Otherwise:
//    Premium remains the base premium
//=============    
//Life Insurance Policy
//Inputs
//    Policy Holder Name
//    Sum Assured
//    Policy Term (in years)
//Premium Calculation Rules
//    Annual premium is calculated based on:
//    Total coverage amount
//    Duration of the policy
//A fixed rate of 5% is applied on the per-year coverage amount    
//
//==============
//Vehicle Insurance Policy
//Inputs
//    Policy Holder Name
//    Vehicle Type (TwoWheeler or FourWheeler)
//    Vehicle Value
//Premium Calculation Rules
//    TwoWheeler
//    Premium = 2% of vehicle value
//    FourWheeler
//Premium = 4% of vehicle value


public interface Policies {
	
	void calculatePremium(String a,double b,int c);


}
