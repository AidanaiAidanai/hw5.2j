package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
     int bir = scanner.nextInt();
        int eki = scanner.nextInt();
        while (bir<eki){
            bir++;
            if(bir%2==1){
                System.out.println(bir);

            }
        }

    }
}
