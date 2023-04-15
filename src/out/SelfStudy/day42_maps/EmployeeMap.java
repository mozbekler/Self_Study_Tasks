package out.SelfStudy.day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class EmployeeMap {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        Integer maxSalary=0;
        for (Integer eachValue : map.values()) {
            if (eachValue>maxSalary){
                maxSalary=eachValue;
            }
        }

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue().equals(maxSalary)){
                System.out.println("Max Salary:"+ eachEntry);
            }
        }

        Integer minSalary=maxSalary;
        for (Integer eachValue : map.values()) {
            if (eachValue<minSalary){
                minSalary=eachValue;
            }
        }

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue().equals(minSalary)){
                System.out.println("Min Salary:"+ eachEntry);
            }
        }

        //2.2 how many employees has the salary between 120k ~ 150K?
            int count=0;
        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue()>120000 && eachEntry.getValue()<150000){
                System.out.println(eachEntry);
                count++;
            }
        }

        System.out.println("There are "+ count+ " employees with the salaries between 120000 and 150000");

        //2.3 display the names of the employees who are making less than 118k?
        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue() < 118000) {
                System.out.println(eachEntry.getKey());
            }
        }

     map.forEach((k,v)-> System.out.println(k+ " : "+v));

    }
}
/*
2. Given following map that contains employee name and employee salary:
	 Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

    2.1 who has the maximum and minimum salary?

    2.2 how many employees has the salary between 120k ~ 150K?

    2.3 display the names of the employees who are making less than 118k?

    2.4 increase the salary employee by 10K if the current salary of employee is less than 120K
 */