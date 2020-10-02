package com.Super;


class SuperBaby extends SuperWomen{

    //Constructor
    SuperBaby(){

        super();
    }

    void cry(){
        System.out.println("Baby cry cry");
        super.womenCry();
    }
}


public class SuperWomen {

    //Constructor
        public SuperWomen(){
            System.out.println("Superwomen Constructor!");
        }

        void womenCry(){

            System.out.printf("Super women they dont cry!");
        }
}
