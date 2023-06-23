/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author yashp
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.println("Available Genres:");
        System.out.println("1. Thriller");
        System.out.println("2. Action");
        System.out.println("3. Story");
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter a number from 1 to 3: ");
        int genreChoice = scanner.nextInt();
        
        String genre;
        
        switch (genreChoice) {
            case 1:
                genre = "Thriller!!!";
                break;
            case 2:
                genre = "Action!!!";
                break;
            case 3:
                genre = "Drame!!!";
                break;
            default:
                genre = "Yash";
                break;

       }   
        
       System.out.println("Name:" + name + "  Favourite genere:"+genre);
    }
}
