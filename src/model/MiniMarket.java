package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import exceptions.*;

public class MiniMarket {

    private ArrayList<Person> peopleInside;
    private int count;

    public MiniMarket() {
        this.peopleInside = new ArrayList<Person>();
        this.count = 0;
    }

    public void addPerson(Person person) {
        peopleInside.add(person);
    }

    public void verifyInput(String id,String number) throws InvalidDayException,YoungerException{
        count++;

        int day =LocalDateTime.now().getDayOfMonth();
        String r;
        if (day%2==1){
            r="PAR";
        }else{
            r="IMPAR";
        }

        //Exepciones-condiciones

        if (id.equals("TI")){
            throw new YoungerException(id);
        }


        
        String digit=number.charAt((number.length())-2)+"";


        int digitNumber=Integer.parseInt(digit);

        String p;
        
        if (digitNumber%2==1){
            p="PAR";
        }else{
            p="IMPAR";
        }


        if (p.equals(r)){
            throw new InvalidDayException(p,r);
        }

            addPerson(new Person(id, number));
    
    }


    public int getCount() {
        return this.count;
    }

    public ArrayList<Person> getPeopleInside() {
        return this.peopleInside;
    }



}
